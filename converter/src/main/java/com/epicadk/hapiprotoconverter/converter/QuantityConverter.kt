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
import com.google.fhir.r4.core.Quantity
import com.google.fhir.r4.core.QuantityComparatorCode
import com.google.fhir.r4.core.String

public object QuantityConverter {
  public fun Quantity.toHapi(): org.hl7.fhir.r4.model.Quantity {
    val hapiValue = org.hl7.fhir.r4.model.Quantity()
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
      hapiValue.setComparator(org.hl7.fhir.r4.model.Quantity.QuantityComparator.valueOf(comparator.value.name.hapiCodeCheck().replace("_", "")))
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

  public fun org.hl7.fhir.r4.model.Quantity.toProto(): Quantity {
    val protoValue = Quantity.newBuilder()
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
      protoValue.setComparator(Quantity.ComparatorCode.newBuilder().setValue(QuantityComparatorCode.Value.valueOf(comparator.toCode().protoCodeCheck().replace("-",
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
