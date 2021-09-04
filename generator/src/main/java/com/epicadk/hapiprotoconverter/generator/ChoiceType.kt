package com.epicadk.hapiprotoconverter.generator

import com.google.fhir.r4.core.ElementDefinition
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName

/**
 * @param element element definition of a choice type
 * @param hapiBuilder hapi FunctionBuilder of type that contains the choice type
 * @param protoBuilder proto FunctionBuilder of type that contains the choice type
 * @param fileBuilder FileBuilder for the file that will contain [hapiBuilder] & [protoBuilder]
 *
 * @returns a list of FunctionBuilders that convert [element] from hapi to proto and vice versa
 */
internal fun handleChoiceType(
    element: ElementDefinition,
    hapiBuilder: FunSpec.Builder,
    protoBuilder: FunSpec.Builder,
    fileBuilder: FileSpec.Builder,
    backboneElementMap: MutableMap<String, BackBoneElementData>
): List<FunSpec> {
    val (elementToProtoBuilder, elementToHapiBuilder) =
        getHapiProtoConverterFuncPair(
            element
                .path
                .value
                .split(".")
                .joinToString("") { it.capitalizeFirst() }
                .removeSuffix(choiceTypeSuffixStructureDefinition),
            element.getChoiceTypeProtoClass(
                backboneElementMap[element.path.value.substringBeforeLast(".")]
            ),
            element.getChoiceTypeHapiClass()
        )
    elementToProtoBuilder.addStatement(
        "val protoValue = %T.newBuilder()",
        element.getChoiceTypeProtoClass(backboneElementMap[element.path.value.substringBeforeLast(".")])
    )

    for (type in element.typeList) {
        // TODO handle this
        if (type.normalizeType().lowerCaseFirst() == "meta") {
            continue
        }
        elementToProtoBuilder.beginControlFlow(
            "if (this is %T)",
            ClassName(
                hapiPackage,
                type.normalizeType() +
                        if (type.normalizeType().lowerCaseFirst() in primitiveTypeList) "Type" else ""
            )
        )
        val toProto =
            MemberName(
                ClassName(converterPackage, "${type.normalizeType().capitalizeFirst()}Converter"),
                "toProto"
            )
        val toHapi =
            MemberName(
                ClassName(converterPackage, "${type.normalizeType().capitalizeFirst()}Converter"),
                "toHapi"
            )

        fileBuilder.addImport(toProto.enclosingClassName!!, toProto.simpleName)
        fileBuilder.addImport(toHapi.enclosingClassName!!, toHapi.simpleName)

        elementToProtoBuilder.addStatement(
            "protoValue$singleMethodTemplate(this.toProto())",
            if (type.normalizeType() == "String") "StringValue" else type.code.value.capitalizeFirst()
        )
        elementToProtoBuilder.endControlFlow()

        elementToHapiBuilder.beginControlFlow(
            "if (has%L())",
            if (type.normalizeType() == "String") "StringValue" else type.code.value.capitalizeFirst()
        )
        elementToHapiBuilder.addStatement(
            "return (this.get%L()).toHapi()",
            if (type.normalizeType() == "String") "StringValue" else type.code.value.capitalizeFirst()
        )
        elementToHapiBuilder.endControlFlow()
    }
    elementToProtoBuilder.addStatement("return protoValue.build()")

    elementToHapiBuilder.addStatement(
        "throw %T(%S)",
        IllegalArgumentException::class,
        "Invalid Type for ${element.path.value}"
    )

    protoBuilder.beginControlFlow("if (has%L())", element.getHapiMethodName())
    protoBuilder.addStatement(
        "protoValue$singleMethodTemplate(%L.%N())",
        element.getProtoMethodName(),
        element.getHapiFieldName(),
        elementToProtoBuilder.build()
    )
    protoBuilder.endControlFlow()

    hapiBuilder.beginControlFlow("if (has%L())", element.getProtoMethodName())
    hapiBuilder.addStatement(
        "hapiValue$singleMethodTemplate(%L.%N())",
        element.getHapiMethodName(),
        element.getProtoFieldName(),
        elementToHapiBuilder.build()
    )
    hapiBuilder.endControlFlow()
    return listOf(elementToHapiBuilder.build(), elementToProtoBuilder.build())
}
