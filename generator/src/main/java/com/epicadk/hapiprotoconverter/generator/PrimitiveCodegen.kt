package com.epicadk.hapiprotoconverter.generator

import ca.uhn.fhir.model.api.TemporalPrecisionEnum
import com.google.fhir.r4.core.StructureDefinition
import com.google.fhir.r4.core.StructureDefinitionKindCode
import com.google.fhir.shaded.common.collect.ImmutableList
import com.google.fhir.shaded.common.collect.ImmutableMap
import com.google.fhir.shaded.protobuf.ByteString
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.TypeSpec
import java.io.File
import java.time.Instant
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.TimeZone

object PrimitiveCodegen {

    private const val protoPackage = "com.google.fhir.r4.core"
    private const val hapiPackage = "org.hl7.fhir.r4.model"

    private val TIME_LIKE_PRECISION_MAP: ImmutableMap<String, List<String>> =
        ImmutableMap.of(
            "date",
            ImmutableList.of("YEAR", "MONTH", "DAY"),
            "dateTime",
            ImmutableList.of("YEAR", "MONTH", "DAY", "SECOND", "MILLISECOND"),
            "instant",
            ImmutableList.of("SECOND", "MILLISECOND")
        )

    @Suppress("DefaultLocale")
    fun generate(def: StructureDefinition, outLocation: File) {
        // ensure that the definition is of PRIMITIVE_TYPE
        require(def.kind.value == StructureDefinitionKindCode.Value.PRIMITIVE_TYPE) {
            "structure definition needs to be of type primitive"
        }
        // Name of the hapi Primitive
        val hapiName = "${def.id.value.capitalizeFirst()}Type"
        // Name of the proto Primitive
        val protoName = def.id.value.capitalizeFirst()

        val hapiClass = ClassName(hapiPackage, hapiName)

        val protoClass = ClassName(protoPackage, protoName)
        // builder for the file that will contain the converter object
        val fileBuilder =
            FileSpec.builder(
                "com.google.android.fhir.hapiprotoconverter.generated",
                "${protoName}Converter"
            )
        val converterSpecBuilder = TypeSpec.objectBuilder("${protoName}Converter")
        // List of functions to be added to the file
        val functionsList = mutableListOf<FunSpec>()

        // Function that will convert Hapi to proto
        val toProtoBuilder =
            FunSpec.builder("toProto")
                //        .addAnnotation(JvmStatic::class)
                .receiver(hapiClass)
                .returns(protoClass)
                .addStatement("val protoValue = %T.newBuilder()", protoClass)
                .addKdoc("returns the proto $protoName equivalent of the hapi $hapiName")

        // Function that will convert proto to hapi
        val toHapiBuilder =
            FunSpec.builder("toHapi")
                //        .addAnnotation(JvmStatic::class)
                .receiver(protoClass)
                .returns(hapiClass)
                .addStatement("val hapiValue = %T()", hapiClass)
                .addKdoc("returns the hapi $hapiName equivalent of the proto $protoName")

        when (def.id.value) {
            in TIME_LIKE_PRECISION_MAP.keys -> {
                // to set timezone
                toProtoBuilder.addProtoStatement("timeZone.id", "setTimezone(%L)", "Time")
                toHapiBuilder.addStatement("hapiValue.timeZone = %T.getTimeZone(timezone)", TimeZone::class)

                // to set value
                toProtoBuilder.addProtoStatement("value.time", "setValueUs(%L)", "Value")
                toHapiBuilder.addStatement(
                    "hapiValue.value = %T.from(%T.ofEpochMilli(valueUs))",
                    Date::class,
                    Instant::class
                )
                // use import alias
                if (def.id.value == "instant") {
                    fileBuilder.addAliasedImport(Instant::class, "InstantUtil")
                }

                // To set Precision
                toProtoBuilder.addStatement("protoValue.precision = precision.toProtoPrecision()")
                toHapiBuilder.addStatement("hapiValue.precision = precision.toHapiPrecision()")

                // private func to convert hapi precision to proto precision
                val precisionToProtoFunc =
                    FunSpec.builder("toProtoPrecision")
                        //            .addAnnotation(JvmStatic::class)
                        .addModifiers(KModifier.PRIVATE)
                        .receiver(TemporalPrecisionEnum::class)
                        .returns(ClassName(protoPackage, protoName, "Precision"))
                        .beginControlFlow("return when(this)")
                        .addKdoc("converts the hapi temporal precision to $protoName.Precision")

                // private func to convert proto precision to hapi precision
                val precisionToHapiFunc =
                    FunSpec.builder("toHapiPrecision")
                        //            .addAnnotation(JvmStatic::class)
                        .addModifiers(KModifier.PRIVATE)
                        .receiver(ClassName(protoPackage, protoName, "Precision"))
                        .returns(TemporalPrecisionEnum::class)
                        .beginControlFlow("return when(this)")
                        .addKdoc("converts the $protoName.Precision to hapi Temporal Precision")

                // populating the functions
                for (value in TIME_LIKE_PRECISION_MAP[def.id.value]!!) {
                    if (value == "MILLISECOND") {
                        precisionToProtoFunc.addStatement(
                            "TemporalPrecisionEnum.${value.removeSuffix("SECOND")} -> $protoName.Precision.$value"
                        )
                        precisionToHapiFunc.addStatement(
                            "$protoName.Precision.$value-> TemporalPrecisionEnum.${value.removeSuffix("SECOND")}"
                        )
                    } else {
                        precisionToProtoFunc.addStatement(
                            "TemporalPrecisionEnum.$value -> $protoName.Precision.$value"
                        )
                        precisionToHapiFunc.addStatement(
                            "$protoName.Precision.$value -> TemporalPrecisionEnum.$value"
                        )
                    }
                }

                precisionToProtoFunc.addStatement("else ->$protoName.Precision.PRECISION_UNSPECIFIED")
                precisionToHapiFunc.addStatement("else ->TemporalPrecisionEnum.MILLI")
                precisionToProtoFunc.endControlFlow()
                precisionToHapiFunc.endControlFlow()
                functionsList.add(precisionToProtoFunc.build())
                functionsList.add(precisionToHapiFunc.build())
            }
            "time" -> {
                // setValue
                toProtoBuilder.addProtoStatement(
                    "value",
                    "setValueUs(%T.parse(%L).toNanoOfDay()/1000)",
                    "Value",
                    LocalTime::class
                )
                toHapiBuilder.addStatement(
                    "hapiValue.value = %T.ofNanoOfDay(valueUs*1000).format(%T.ISO_LOCAL_TIME)",
                    LocalTime::class,
                    DateTimeFormatter::class
                )
                // setPrecision
                toProtoBuilder.addProtoStatement(
                    "value",
                    "setPrecisionValue(getTimePrecision(%L))",
                    "Value"
                )
                // private func to get precision
                val precisionToProtoFunc =
                    FunSpec.builder("getTimePrecision")
                        //            .addAnnotation(JvmStatic::class)
                        .addModifiers(KModifier.PRIVATE)
                        .addParameter("timeString", String::class)
                        .returns(Integer.TYPE)
                        .beginControlFlow("return when(timeString.length)")
                        .addStatement("8 -> Time.Precision.SECOND_VALUE")
                        .addStatement("12 -> Time.Precision.MILLISECOND_VALUE")
                        .addStatement("else -> -1")
                        .endControlFlow()
                        .addKdoc("generates $protoName.Precision for the hapi $hapiName")
                functionsList.add(precisionToProtoFunc.build())
            }
            "base64Binary" -> {
                // set value needs to be handled differently
                toProtoBuilder.addProtoStatement(
                    " valueAsString",
                    "setValue(%T.copyFromUtf8(%L))",
                    "Value",
                    ByteString::class
                )
                toHapiBuilder.addStatement("hapiValue.valueAsString = value.toStringUtf8()")
            }
            "decimal" -> {
                // set value needs to be handled differently
                toProtoBuilder.addProtoStatement("valueAsString", "setValue(%L)", "Value")
                toHapiBuilder.addStatement("hapiValue.valueAsString = value")
            }
            else -> {
                // set value
                toProtoBuilder.addProtoStatement("value", "setValue(%L)", "Value")
                toHapiBuilder.addStatement("hapiValue.value = value")
            }
        }
        toProtoBuilder.addStatement("return protoValue.build()")
        toHapiBuilder.addStatement("return hapiValue")
        functionsList.add(0, toProtoBuilder.build())
        functionsList.add(1, toHapiBuilder.build())

        functionsList.forEach { converterSpecBuilder.addFunction(it) }
        fileBuilder
            .addType(converterSpecBuilder.build())
            .addComment(
                "contains functions that convert between the hapi and proto representations of ${def.id.value}"
            )
            .build()
            .writeTo(outLocation)
    }

    private fun FunSpec.Builder.addProtoStatement(
        param: String,
        method: String,
        check: String,
        vararg args: Any
    ) {
        this.addStatement("if (has$check()) protoValue.$method", *args, param)
    }
}
