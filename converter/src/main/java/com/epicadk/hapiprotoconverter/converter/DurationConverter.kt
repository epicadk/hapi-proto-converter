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
import com.google.fhir.r4.core.Duration
import com.google.fhir.r4.core.QuantityComparatorCode
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.Quantity

public object DurationConverter {
  public fun Duration.toHapi(): org.hl7.fhir.r4.model.Duration {
    val hapiValue = org.hl7.fhir.r4.model.Duration()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasValue()) {
      hapiValue.setValueElement(value.toHapi())
    }
    if (hasComparator()) {
      hapiValue.setComparator(Quantity.QuantityComparator.valueOf(comparator.value.name.hapiCodeCheck().replace("_", "")))
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

  public fun org.hl7.fhir.r4.model.Duration.toProto(): Duration {
    val protoValue = Duration.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasValue()) {
      protoValue.setValue(valueElement.toProto())
    }
    if (hasComparator()) {
      protoValue.setComparator(Duration.ComparatorCode.newBuilder().setValue(QuantityComparatorCode.Value.valueOf(comparator.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
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
