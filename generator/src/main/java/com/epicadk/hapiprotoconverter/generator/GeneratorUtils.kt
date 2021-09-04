package com.epicadk.hapiprotoconverter.generator

internal val primitiveTypeList =
    setOf(
        "base64Binary",
        "boolean",
        "canonical",
        "code",
        "date",
        "dateTime",
        "decimal",
        "id",
        "instant",
        "integer",
        "markdown",
        "oid",
        "positiveInt",
        "string",
        "time",
        "unsignedInt",
        "uri",
        "url",
        "uuid"
        //      "xhtml"
    )

// package that contains all converters
internal const val converterPackage = "com.epicadk.hapiprotoconverter.converter"

// template for when the max value of an element is 1 ( in protos )
internal const val singleMethodTemplate = ".set%L"

// template for when the max value of an element is > 1 ( in protos )
internal const val multipleMethodTemplate = ".addAll%L"

// TODO handle these
internal val ignoreValueSet =
    setOf(
        "http://hl7.org/fhir/ValueSet/languages",
        "http://hl7.org/fhir/ValueSet/expression-language"
    )

// proto package that contains the structures
internal const val protoPackage = "com.google.fhir.r4.core"

// hapi package that contains the structures
internal const val hapiPackage = "org.hl7.fhir.r4.model"

// uri that specifies if a valueset is in the the common Enumerations Class
internal const val uriBindingName =
    "http://hl7.org/fhir/StructureDefinition/elementdefinition-bindingName"
internal const val FHIRPATH_TYPE_PREFIX = "http://hl7.org/fhirpath/"
internal const val FHIR_TYPE_EXTENSION_URL =
    "http://hl7.org/fhir/StructureDefinition/structuredefinition-fhir-type"
