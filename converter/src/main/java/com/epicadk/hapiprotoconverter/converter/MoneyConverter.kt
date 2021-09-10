package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.Money
import com.google.fhir.r4.core.String

public object MoneyConverter {
  public fun Money.toHapi(): org.hl7.fhir.r4.model.Money {
    val hapiValue = org.hl7.fhir.r4.model.Money()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasValue()) {
      hapiValue.setValueElement(value.toHapi())
    }
    if (hasCurrency()) {
      hapiValue.setCurrency(currency.value.hapiCodeCheck())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Money.toProto(): Money {
    val protoValue = Money.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasValue()) {
      protoValue.setValue(valueElement.toProto())
    }
    if (hasCurrency()) {
      protoValue.setCurrency(Money.CurrencyCode.newBuilder().setValue(currency.protoCodeCheck()).build())
    }
    return protoValue.build()
  }
}
