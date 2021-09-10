package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.google.fhir.r4.core.FHIRAllTypesValueSet
import com.google.fhir.r4.core.OperationParameterUseCode
import com.google.fhir.r4.core.ParameterDefinition
import com.google.fhir.r4.core.String

public object ParameterDefinitionConverter {
  public fun ParameterDefinition.toHapi(): org.hl7.fhir.r4.model.ParameterDefinition {
    val hapiValue = org.hl7.fhir.r4.model.ParameterDefinition()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasUse()) {
      hapiValue.setUse(org.hl7.fhir.r4.model.ParameterDefinition.ParameterUse.valueOf(use.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasMin()) {
      hapiValue.setMinElement(min.toHapi())
    }
    if (hasMax()) {
      hapiValue.setMaxElement(max.toHapi())
    }
    if (hasDocumentation()) {
      hapiValue.setDocumentationElement(documentation.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(type.value.name)
    }
    if (hasProfile()) {
      hapiValue.setProfileElement(profile.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ParameterDefinition.toProto(): ParameterDefinition {
    val protoValue = ParameterDefinition.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasUse()) {
      protoValue.setUse(ParameterDefinition.UseCode.newBuilder().setValue(OperationParameterUseCode.Value.valueOf(use.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasMin()) {
      protoValue.setMin(minElement.toProto())
    }
    if (hasMax()) {
      protoValue.setMax(maxElement.toProto())
    }
    if (hasDocumentation()) {
      protoValue.setDocumentation(documentationElement.toProto())
    }
    if (hasType()) {
      protoValue.setType(ParameterDefinition.TypeCode.newBuilder().setValue(FHIRAllTypesValueSet.Value.valueOf(type)).build())
    }
    if (hasProfile()) {
      protoValue.setProfile(profileElement.toProto())
    }
    return protoValue.build()
  }
}
