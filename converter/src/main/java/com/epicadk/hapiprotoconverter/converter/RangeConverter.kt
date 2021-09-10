package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toProto
import com.google.fhir.r4.core.Range
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.SimpleQuantity

public object RangeConverter {
  public fun Range.toHapi(): org.hl7.fhir.r4.model.Range {
    val hapiValue = org.hl7.fhir.r4.model.Range()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasLow()) {
      hapiValue.setLow(low.toHapi())
    }
    if (hasHigh()) {
      hapiValue.setHigh(high.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Range.toProto(): Range {
    val protoValue = Range.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasLow()) {
      protoValue.setLow((low as SimpleQuantity).toProto())
    }
    if (hasHigh()) {
      protoValue.setHigh((high as SimpleQuantity).toProto())
    }
    return protoValue.build()
  }
}
