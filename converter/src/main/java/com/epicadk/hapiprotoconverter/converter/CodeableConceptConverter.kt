package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.google.fhir.r4.core.CodeableConcept
import com.google.fhir.r4.core.String

public object CodeableConceptConverter {
  public fun CodeableConcept.toHapi(): org.hl7.fhir.r4.model.CodeableConcept {
    val hapiValue = org.hl7.fhir.r4.model.CodeableConcept()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (codingCount > 0) {
      hapiValue.setCoding(codingList.map { it.toHapi() })
    }
    if (hasText()) {
      hapiValue.setTextElement(text.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.CodeableConcept.toProto(): CodeableConcept {
    val protoValue = CodeableConcept.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasCoding()) {
      protoValue.addAllCoding(coding.map { it.toProto() })
    }
    if (hasText()) {
      protoValue.setText(textElement.toProto())
    }
    return protoValue.build()
  }
}
