package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.SimpleQuantity
import com.google.fhir.r4.core.String

public object SimpleQuantityConverter {
  public fun SimpleQuantity.toHapi(): org.hl7.fhir.r4.model.SimpleQuantity {
    val hapiValue = org.hl7.fhir.r4.model.SimpleQuantity()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasValue()) {
      hapiValue.setValueElement(value.toHapi())
    }
    if (hasUnit()) {
      hapiValue.setUnitElement(unit.toHapi())
    }
    if (hasSystem()) {
      hapiValue.setSystemElement(system.toHapi())
    }
    if (hasCode()) {
      hapiValue.setCodeElement(code.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.SimpleQuantity.toProto(): SimpleQuantity {
    val protoValue = SimpleQuantity.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasValue()) {
      protoValue.setValue(valueElement.toProto())
    }
    if (hasUnit()) {
      protoValue.setUnit(unitElement.toProto())
    }
    if (hasSystem()) {
      protoValue.setSystem(systemElement.toProto())
    }
    if (hasCode()) {
      protoValue.setCode(codeElement.toProto())
    }
    return protoValue.build()
  }
}
