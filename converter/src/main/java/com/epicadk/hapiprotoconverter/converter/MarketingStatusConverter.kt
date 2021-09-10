package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.google.fhir.r4.core.MarketingStatus
import com.google.fhir.r4.core.String

public object MarketingStatusConverter {
  public fun MarketingStatus.toHapi(): org.hl7.fhir.r4.model.MarketingStatus {
    val hapiValue = org.hl7.fhir.r4.model.MarketingStatus()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCountry()) {
      hapiValue.setCountry(country.toHapi())
    }
    if (hasJurisdiction()) {
      hapiValue.setJurisdiction(jurisdiction.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(status.toHapi())
    }
    if (hasDateRange()) {
      hapiValue.setDateRange(dateRange.toHapi())
    }
    if (hasRestoreDate()) {
      hapiValue.setRestoreDateElement(restoreDate.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MarketingStatus.toProto(): MarketingStatus {
    val protoValue = MarketingStatus.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCountry()) {
      protoValue.setCountry(country.toProto())
    }
    if (hasJurisdiction()) {
      protoValue.setJurisdiction(jurisdiction.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(status.toProto())
    }
    if (hasDateRange()) {
      protoValue.setDateRange(dateRange.toProto())
    }
    if (hasRestoreDate()) {
      protoValue.setRestoreDate(restoreDateElement.toProto())
    }
    return protoValue.build()
  }
}
