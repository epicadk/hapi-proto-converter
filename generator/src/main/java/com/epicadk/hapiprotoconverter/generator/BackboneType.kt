package com.epicadk.hapiprotoconverter.generator

import com.google.fhir.r4.core.ElementDefinition
import com.google.fhir.r4.core.Patient
import com.squareup.kotlinpoet.FunSpec

internal fun handleBackBoneElementTypes(
    element: ElementDefinition,
    hapiBuilder: FunSpec.Builder,
    protoBuilder: FunSpec.Builder,
    backboneElementMap: MutableMap<String, BackBoneElementData>
) {
    val (toProtoBuilder, toHapiBuilder) =
        getHapiProtoConverterFuncPair(
            "",
            element.getBackBoneProtoClass(
                backboneElementMap[element.path.value.substringBeforeLast(".")]
            ),
            element.getBackBoneHapiClass(backboneElementMap[element.path.value.substringBeforeLast(".")])
        )

    if (element.max.value == "1") {
        org.hl7.fhir.r4.model.Patient().photo
        protoBuilder.beginControlFlow("if (has%L())", element.getHapiMethodName())
        protoBuilder.addStatement(
            "protoValue$singleMethodTemplate(${if (element.typeList.first().profileList.isNotEmpty()) "( %L as %T )" else "%L%L"}.toProto())",
            element.getProtoMethodName(),
            element.getHapiFieldName(),
            if (element.typeList.first().profileList.isNotEmpty())
                element.typeList.first().normalizeType()
            else ""
        )
        protoBuilder.endControlFlow()
        hapiBuilder.beginControlFlow("if (has%L())", element.getProtoMethodName())
        hapiBuilder.addStatement(
            "hapiValue$singleMethodTemplate(%L.toHapi())",
            element.getHapiMethodName(),
            element.getProtoFieldName()
        )
        hapiBuilder.endControlFlow()
    } else {
        protoBuilder.beginControlFlow("if (has%L())", element.getHapiMethodName())
        protoBuilder.addStatement(
            "protoValue$multipleMethodTemplate(%L.map{${if (element.typeList.first().profileList.isNotEmpty()) "( it as %T  )" else "it%L"}.toProto()})",
            element.getProtoMethodName(),
            element.getHapiFieldName(),
            if (element.typeList.first().profileList.isNotEmpty())
                element.typeList.first().normalizeType()
            else ""
        )
        protoBuilder.endControlFlow()
        Patient.newBuilder().build().photoCount
        hapiBuilder.beginControlFlow("if (%LCount > 0) ", element.getProtoFieldName())
        hapiBuilder.addStatement(
            "hapiValue$singleMethodTemplate(%L.map{it.toHapi()})",
            element.getHapiMethodName(),
            element.getProtoFieldName(isRepeated = true)
        )
        hapiBuilder.endControlFlow()
    }

    backboneElementMap[element.path.value] =
        BackBoneElementData(
            toProtoBuilder.addStatement(
                "val protoValue = %T.newBuilder()",
                element.getBackBoneProtoClass(
                    backboneElementMap[element.path.value.substringBeforeLast(".")]
                )
            ),
            element
                .getBackBoneProtoClass(backboneElementMap[element.path.value.substringBeforeLast(".")])
                .canonicalName
                .removePrefix("$protoPackage."),
            toHapiBuilder.addStatement(
                "val hapiValue = %T()",
                element.getBackBoneHapiClass(
                    backboneElementMap[element.path.value.substringBeforeLast(".")]
                )
            ),
            element
                .getBackBoneHapiClass(backboneElementMap[element.path.value.substringBeforeLast(".")])
                .canonicalName
                .removePrefix("$hapiPackage.")
        )
}
