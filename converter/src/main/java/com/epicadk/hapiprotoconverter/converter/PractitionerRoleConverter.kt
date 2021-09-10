package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.DaysOfWeekCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.PractitionerRole
import com.google.fhir.r4.core.PractitionerRole.AvailableTime
import com.google.fhir.r4.core.String

public object PractitionerRoleConverter {
  public fun PractitionerRole.toHapi(): org.hl7.fhir.r4.model.PractitionerRole {
    val hapiValue = org.hl7.fhir.r4.model.PractitionerRole()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (hasMeta()) {
      hapiValue.setMeta(meta.toHapi())
    }
    if (hasImplicitRules()) {
      hapiValue.setImplicitRulesElement(implicitRules.toHapi())
    }
    if (hasText()) {
      hapiValue.setText(text.toHapi())
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (identifierCount > 0) {
      hapiValue.setIdentifier(identifierList.map { it.toHapi() })
    }
    if (hasActive()) {
      hapiValue.setActiveElement(active.toHapi())
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    if (hasPractitioner()) {
      hapiValue.setPractitioner(practitioner.toHapi())
    }
    if (hasOrganization()) {
      hapiValue.setOrganization(organization.toHapi())
    }
    if (codeCount > 0) {
      hapiValue.setCode(codeList.map { it.toHapi() })
    }
    if (specialtyCount > 0) {
      hapiValue.setSpecialty(specialtyList.map { it.toHapi() })
    }
    if (locationCount > 0) {
      hapiValue.setLocation(locationList.map { it.toHapi() })
    }
    if (healthcareServiceCount > 0) {
      hapiValue.setHealthcareService(healthcareServiceList.map { it.toHapi() })
    }
    if (telecomCount > 0) {
      hapiValue.setTelecom(telecomList.map { it.toHapi() })
    }
    if (availableTimeCount > 0) {
      hapiValue.setAvailableTime(availableTimeList.map { it.toHapi() })
    }
    if (notAvailableCount > 0) {
      hapiValue.setNotAvailable(notAvailableList.map { it.toHapi() })
    }
    if (hasAvailabilityExceptions()) {
      hapiValue.setAvailabilityExceptionsElement(availabilityExceptions.toHapi())
    }
    if (endpointCount > 0) {
      hapiValue.setEndpoint(endpointList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.PractitionerRole.toProto(): PractitionerRole {
    val protoValue = PractitionerRole.newBuilder()
    if (hasId()) {
      protoValue.setId(Id.newBuilder().setValue(id))
    }
    if (hasMeta()) {
      protoValue.setMeta(meta.toProto())
    }
    if (hasImplicitRules()) {
      protoValue.setImplicitRules(implicitRulesElement.toProto())
    }
    if (hasText()) {
      protoValue.setText(text.toProto())
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasIdentifier()) {
      protoValue.addAllIdentifier(identifier.map { it.toProto() })
    }
    if (hasActive()) {
      protoValue.setActive(activeElement.toProto())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    if (hasPractitioner()) {
      protoValue.setPractitioner(practitioner.toProto())
    }
    if (hasOrganization()) {
      protoValue.setOrganization(organization.toProto())
    }
    if (hasCode()) {
      protoValue.addAllCode(code.map { it.toProto() })
    }
    if (hasSpecialty()) {
      protoValue.addAllSpecialty(specialty.map { it.toProto() })
    }
    if (hasLocation()) {
      protoValue.addAllLocation(location.map { it.toProto() })
    }
    if (hasHealthcareService()) {
      protoValue.addAllHealthcareService(healthcareService.map { it.toProto() })
    }
    if (hasTelecom()) {
      protoValue.addAllTelecom(telecom.map { it.toProto() })
    }
    if (hasAvailableTime()) {
      protoValue.addAllAvailableTime(availableTime.map { it.toProto() })
    }
    if (hasNotAvailable()) {
      protoValue.addAllNotAvailable(notAvailable.map { it.toProto() })
    }
    if (hasAvailabilityExceptions()) {
      protoValue.setAvailabilityExceptions(availabilityExceptionsElement.toProto())
    }
    if (hasEndpoint()) {
      protoValue.addAllEndpoint(endpoint.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.PractitionerRole.PractitionerRoleAvailableTimeComponent.toProto():
      PractitionerRole.AvailableTime {
    val protoValue = PractitionerRole.AvailableTime.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDaysOfWeek()) {
      protoValue.addAllDaysOfWeek(daysOfWeek.map { PractitionerRole.AvailableTime.DaysOfWeekCode.newBuilder().setValue(DaysOfWeekCode.Value.valueOf(it.value.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build() })
    }
    if (hasAllDay()) {
      protoValue.setAllDay(allDayElement.toProto())
    }
    if (hasAvailableStartTime()) {
      protoValue.setAvailableStartTime(availableStartTimeElement.toProto())
    }
    if (hasAvailableEndTime()) {
      protoValue.setAvailableEndTime(availableEndTimeElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.PractitionerRole.PractitionerRoleNotAvailableComponent.toProto():
      PractitionerRole.NotAvailable {
    val protoValue = PractitionerRole.NotAvailable.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasDuring()) {
      protoValue.setDuring(during.toProto())
    }
    return protoValue.build()
  }

  private fun PractitionerRole.AvailableTime.toHapi():
      org.hl7.fhir.r4.model.PractitionerRole.PractitionerRoleAvailableTimeComponent {
    val hapiValue = org.hl7.fhir.r4.model.PractitionerRole.PractitionerRoleAvailableTimeComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (daysOfWeekCount > 0) {
      daysOfWeekList.forEach { hapiValue.addDaysOfWeek(org.hl7.fhir.r4.model.PractitionerRole.DaysOfWeek.valueOf(it.value.name.hapiCodeCheck().replace("_", ""))) }
    }
    if (hasAllDay()) {
      hapiValue.setAllDayElement(allDay.toHapi())
    }
    if (hasAvailableStartTime()) {
      hapiValue.setAvailableStartTimeElement(availableStartTime.toHapi())
    }
    if (hasAvailableEndTime()) {
      hapiValue.setAvailableEndTimeElement(availableEndTime.toHapi())
    }
    return hapiValue
  }

  private fun PractitionerRole.NotAvailable.toHapi():
      org.hl7.fhir.r4.model.PractitionerRole.PractitionerRoleNotAvailableComponent {
    val hapiValue = org.hl7.fhir.r4.model.PractitionerRole.PractitionerRoleNotAvailableComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasDuring()) {
      hapiValue.setDuring(during.toHapi())
    }
    return hapiValue
  }
}
