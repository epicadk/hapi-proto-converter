package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.google.fhir.r4.core.Ratio
import com.google.fhir.r4.core.String

public object RatioConverter {
  public fun Ratio.toHapi(): org.hl7.fhir.r4.model.Ratio {
    val hapiValue = org.hl7.fhir.r4.model.Ratio()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasNumerator()) {
      hapiValue.setNumerator(numerator.toHapi())
    }
    if (hasDenominator()) {
      hapiValue.setDenominator(denominator.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Ratio.toProto(): Ratio {
    val protoValue = Ratio.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasNumerator()) {
      protoValue.setNumerator(numerator.toProto())
    }
    if (hasDenominator()) {
      protoValue.setDenominator(denominator.toProto())
    }
    return protoValue.build()
  }
}
