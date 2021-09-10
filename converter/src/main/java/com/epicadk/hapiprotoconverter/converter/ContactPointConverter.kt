package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.google.fhir.r4.core.ContactPoint
import com.google.fhir.r4.core.ContactPointSystemCode
import com.google.fhir.r4.core.ContactPointUseCode
import com.google.fhir.r4.core.String

public object ContactPointConverter {
  public fun ContactPoint.toHapi(): org.hl7.fhir.r4.model.ContactPoint {
    val hapiValue = org.hl7.fhir.r4.model.ContactPoint()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasSystem()) {
      hapiValue.setSystem(org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem.valueOf(system.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasValue()) {
      hapiValue.setValueElement(value.toHapi())
    }
    if (hasUse()) {
      hapiValue.setUse(org.hl7.fhir.r4.model.ContactPoint.ContactPointUse.valueOf(use.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasRank()) {
      hapiValue.setRankElement(rank.toHapi())
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ContactPoint.toProto(): ContactPoint {
    val protoValue = ContactPoint.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasSystem()) {
      protoValue.setSystem(ContactPoint.SystemCode.newBuilder().setValue(ContactPointSystemCode.Value.valueOf(system.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasValue()) {
      protoValue.setValue(valueElement.toProto())
    }
    if (hasUse()) {
      protoValue.setUse(ContactPoint.UseCode.newBuilder().setValue(ContactPointUseCode.Value.valueOf(use.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasRank()) {
      protoValue.setRank(rankElement.toProto())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    return protoValue.build()
  }
}
