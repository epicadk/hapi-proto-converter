package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.google.fhir.r4.core.HumanName
import com.google.fhir.r4.core.NameUseCode
import com.google.fhir.r4.core.String

public object HumanNameConverter {
  public fun HumanName.toHapi(): org.hl7.fhir.r4.model.HumanName {
    val hapiValue = org.hl7.fhir.r4.model.HumanName()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasUse()) {
      hapiValue.setUse(org.hl7.fhir.r4.model.HumanName.NameUse.valueOf(use.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasText()) {
      hapiValue.setTextElement(text.toHapi())
    }
    if (hasFamily()) {
      hapiValue.setFamilyElement(family.toHapi())
    }
    if (givenCount > 0) {
      hapiValue.setGiven(givenList.map { it.toHapi() })
    }
    if (prefixCount > 0) {
      hapiValue.setPrefix(prefixList.map { it.toHapi() })
    }
    if (suffixCount > 0) {
      hapiValue.setSuffix(suffixList.map { it.toHapi() })
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.HumanName.toProto(): HumanName {
    val protoValue = HumanName.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasUse()) {
      protoValue.setUse(HumanName.UseCode.newBuilder().setValue(NameUseCode.Value.valueOf(use.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasText()) {
      protoValue.setText(textElement.toProto())
    }
    if (hasFamily()) {
      protoValue.setFamily(familyElement.toProto())
    }
    if (hasGiven()) {
      protoValue.addAllGiven(given.map { it.toProto() })
    }
    if (hasPrefix()) {
      protoValue.addAllPrefix(prefix.map { it.toProto() })
    }
    if (hasSuffix()) {
      protoValue.addAllSuffix(suffix.map { it.toProto() })
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    return protoValue.build()
  }
}
