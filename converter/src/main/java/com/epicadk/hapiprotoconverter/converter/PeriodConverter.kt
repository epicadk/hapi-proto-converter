package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.Period
import com.google.fhir.r4.core.String

public object PeriodConverter {
  public fun Period.toHapi(): org.hl7.fhir.r4.model.Period {
    val hapiValue = org.hl7.fhir.r4.model.Period()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasStart()) {
      hapiValue.setStartElement(start.toHapi())
    }
    if (hasEnd()) {
      hapiValue.setEndElement(end.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Period.toProto(): Period {
    val protoValue = Period.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasStart()) {
      protoValue.setStart(startElement.toProto())
    }
    if (hasEnd()) {
      protoValue.setEnd(endElement.toProto())
    }
    return protoValue.build()
  }
}
