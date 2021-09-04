package com.epicadk.hapiprotoconverter.generator

import com.google.fhir.r4.core.ElementDefinition
import com.google.fhir.r4.core.Extension
import com.squareup.kotlinpoet.ClassName

// will be used in backbone elements
private const val explicitTypeName =
    "http://hl7.org/fhir/StructureDefinition/structuredefinition-explicit-type-name"

/** @returns the name of the element */
internal fun ElementDefinition.getElementName(): String {
    return if (hasExtension(explicitTypeName)) {
        getExtension(explicitTypeName).value.stringValue.value
    } else {
        id.value.split(".").last().capitalizeFirst()
    }
}

/** @returns the ClassName for choiceType hapi */
internal fun ElementDefinition.getChoiceTypeHapiClass(): ClassName {
    return ClassName(hapiPackage, "Type")
}

/** check if element has extension [uri] */
internal fun ElementDefinition.hasExtension(uri: String): Boolean {
    return extensionList.any { it.url.value == uri }
}

/** get extension of element of [uri] */
internal fun ElementDefinition.getExtension(uri: String): Extension {
    return extensionList.single { it.url.value == uri }
}

/** get hapi method name for getter/setter */
internal fun ElementDefinition.getHapiMethodName(isPrimitive: Boolean = false): String {
    return (if (getElementMethodName().lowerCaseFirst() in listOf("class"))
        "${getElementMethodName()}_"
    else getElementMethodName())
        .capitalizeFirst() + if (isPrimitive) "Element" else ""
}

/** get hapi field name */
internal fun ElementDefinition.getHapiFieldName(isPrimitive: Boolean = false): String {
    return ((if (getElementMethodName().lowerCaseFirst() in listOf("class"))
        "${getElementMethodName()}_"
    else getElementMethodName().capitalizeFirst())
        .lowerCaseFirst() + if (isPrimitive) "Element" else "")
        .checkForKotlinKeyWord()
}

/** get ClassName for BackBone protoClass */
internal fun ElementDefinition.getBackBoneProtoClass(data: BackBoneElementData?): ClassName {
    return ClassName(
        protoPackage,
        data?.protoName
            ?: path.value.substringBeforeLast(".").split(".").joinToString(".") { it.capitalizeFirst() }
    )
        .nestedClass(
            if (getElementName().equals("code", ignoreCase = true)) "CodeType"
            else getElementName().capitalizeFirst()
        )
}

/** get ClassName for BackBone hapiClass */
internal fun ElementDefinition.getBackBoneHapiClass(data: BackBoneElementData?): ClassName {
    return ClassName(hapiPackage, base.path.value.split(".").first().capitalizeFirst())
        .nestedClass(
            if (hasExtension(explicitTypeName)) {
                "${getElementName()}Component"
            } else {
                "${
                    data?.hapiName?.removeSuffix("Component")
                        ?.removePrefix(base.path.value.split(".").first().capitalizeFirst())
                        ?: base.path.value.split(".").dropLast(1)
                            .joinToString("") { it.capitalizeFirst() }
                }${getElementName()}Component"
            }
        )
}

/** get ClassName for Code protoClass */
internal fun ElementDefinition.getProtoCodeClass(
    outerDataTypeName: String,
    data: BackBoneElementData?
): ClassName {
    return ClassName(
        protoPackage,
        data?.protoName
            ?: (listOf(outerDataTypeName) + path.value.split(".").drop(1).dropLast(1)).joinToString(
                "."
            ) { it.capitalizeFirst() }
    )
        .nestedClass(
            when {
                getElementName().lowerCaseFirst() == "code" -> "CodeType"
                else ->
                    getElementName().capitalizeFirst() +
                            if (getElementName().capitalizeFirst().endsWith("Code", ignoreCase = true)) ""
                            else "Code"
            }.replace("[^A-Za-z0-9]".toRegex(), "")
        )
}

// class where all common enums are in Hapi
private val commonEnumClass = ClassName(hapiPackage, "Enumerations")

/** get ClassName for Code hapiClass */
internal fun ElementDefinition.getHapiCodeClass(isCommon: Boolean): ClassName {
    return (if (isCommon) commonEnumClass
    else ClassName(hapiPackage, base.path.value.split(".").first().capitalizeFirst()))
        .nestedClass(
            binding.extensionList[0].value.stringValue.value.capitalizeFirst().split("-").joinToString(
                ""
            ) { it.capitalizeFirst() }
        )
}

/** @returns the ClassName for choiceProto hapi */
internal fun ElementDefinition.getChoiceTypeProtoClass(data: BackBoneElementData?): ClassName {
    return ClassName(
        protoPackage,
        if (data != null)
            listOf(
                data.protoName,
                path
                    .value
                    .substringAfterLast(".")
                    .replace(choiceTypeSuffixStructureDefinition, choiceTypeSuffixProto)
                    .capitalizeFirst()
            )
        else
            path
                .value
                .replace(choiceTypeSuffixStructureDefinition, choiceTypeSuffixProto)
                .split(".")
                .map { it.capitalizeFirst() }
    )
}

private fun ElementDefinition.getElementMethodName(): String {
    return path.value.substringAfterLast(".").removeSuffix(choiceTypeSuffixStructureDefinition)
}

/** get proto method name for getter/setter */
internal fun ElementDefinition.getProtoMethodName(): String {
    return (if (getElementMethodName().lowerCaseFirst() in listOf("class", "assert", "for"))
        "${getElementMethodName()}Value"
    else getElementMethodName())
        .resolveAcronyms()
        .capitalizeFirst()
}

/** get proto field name */
internal fun ElementDefinition.getProtoFieldName(isRepeated: Boolean = false): String {
    return ((if (getElementMethodName().lowerCaseFirst() in listOf("class", "assert", "for"))
        "${getElementMethodName()}Value"
    else getElementMethodName())
        .resolveAcronyms()
        .lowerCaseFirst() + if (isRepeated) "List" else "")
        .checkForKotlinKeyWord()
}

internal fun ElementDefinition.TypeRef.normalizeType(): String {

    val code = code.value

    if (code.startsWith(FHIRPATH_TYPE_PREFIX)) {
        for (extension in extensionList) {
            if (extension.url.value.equals(FHIR_TYPE_EXTENSION_URL)) {
                return extension.value.url.value.capitalizeFirst()
            }
        }
    }
    if (profileCount == 0 || getProfile(0).value.isEmpty()) {
        return code.capitalizeFirst()
    }
    val profileUrl = getProfile(0).value

    if (CompositeCodegen.profileUrlMap[profileUrl] != null) {
        return CompositeCodegen.profileUrlMap[profileUrl]!!.name.value
    }
    throw java.lang.IllegalArgumentException("Unable to deduce typename for profile: $profileUrl")
}

private const val choiceTypeSuffixProto = "X"

internal const val choiceTypeSuffixStructureDefinition = "[x]"
