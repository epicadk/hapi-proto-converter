package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.google.fhir.r4.core.SampledData
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.SimpleQuantity

public object SampledDataConverter {
  public fun SampledData.toHapi(): org.hl7.fhir.r4.model.SampledData {
    val hapiValue = org.hl7.fhir.r4.model.SampledData()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasOrigin()) {
      hapiValue.setOrigin(origin.toHapi())
    }
    if (hasPeriod()) {
      hapiValue.setPeriodElement(period.toHapi())
    }
    if (hasFactor()) {
      hapiValue.setFactorElement(factor.toHapi())
    }
    if (hasLowerLimit()) {
      hapiValue.setLowerLimitElement(lowerLimit.toHapi())
    }
    if (hasUpperLimit()) {
      hapiValue.setUpperLimitElement(upperLimit.toHapi())
    }
    if (hasDimensions()) {
      hapiValue.setDimensionsElement(dimensions.toHapi())
    }
    if (hasData()) {
      hapiValue.setDataElement(data.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.SampledData.toProto(): SampledData {
    val protoValue = SampledData.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasOrigin()) {
      protoValue.setOrigin((origin as SimpleQuantity).toProto())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(periodElement.toProto())
    }
    if (hasFactor()) {
      protoValue.setFactor(factorElement.toProto())
    }
    if (hasLowerLimit()) {
      protoValue.setLowerLimit(lowerLimitElement.toProto())
    }
    if (hasUpperLimit()) {
      protoValue.setUpperLimit(upperLimitElement.toProto())
    }
    if (hasDimensions()) {
      protoValue.setDimensions(dimensionsElement.toProto())
    }
    if (hasData()) {
      protoValue.setData(dataElement.toProto())
    }
    return protoValue.build()
  }
}
