package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toProto
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
import com.google.fhir.r4.core.HealthcareService
import com.google.fhir.r4.core.HealthcareService.AvailableTime
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String

public object HealthcareServiceConverter {
  public fun HealthcareService.toHapi(): org.hl7.fhir.r4.model.HealthcareService {
    val hapiValue = org.hl7.fhir.r4.model.HealthcareService()
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
    if (hasProvidedBy()) {
      hapiValue.setProvidedBy(providedBy.toHapi())
    }
    if (categoryCount > 0) {
      hapiValue.setCategory(categoryList.map { it.toHapi() })
    }
    if (typeCount > 0) {
      hapiValue.setType(typeList.map { it.toHapi() })
    }
    if (specialtyCount > 0) {
      hapiValue.setSpecialty(specialtyList.map { it.toHapi() })
    }
    if (locationCount > 0) {
      hapiValue.setLocation(locationList.map { it.toHapi() })
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasComment()) {
      hapiValue.setCommentElement(comment.toHapi())
    }
    if (hasExtraDetails()) {
      hapiValue.setExtraDetailsElement(extraDetails.toHapi())
    }
    if (hasPhoto()) {
      hapiValue.setPhoto(photo.toHapi())
    }
    if (telecomCount > 0) {
      hapiValue.setTelecom(telecomList.map { it.toHapi() })
    }
    if (coverageAreaCount > 0) {
      hapiValue.setCoverageArea(coverageAreaList.map { it.toHapi() })
    }
    if (serviceProvisionCodeCount > 0) {
      hapiValue.setServiceProvisionCode(serviceProvisionCodeList.map { it.toHapi() })
    }
    if (eligibilityCount > 0) {
      hapiValue.setEligibility(eligibilityList.map { it.toHapi() })
    }
    if (programCount > 0) {
      hapiValue.setProgram(programList.map { it.toHapi() })
    }
    if (characteristicCount > 0) {
      hapiValue.setCharacteristic(characteristicList.map { it.toHapi() })
    }
    if (communicationCount > 0) {
      hapiValue.setCommunication(communicationList.map { it.toHapi() })
    }
    if (referralMethodCount > 0) {
      hapiValue.setReferralMethod(referralMethodList.map { it.toHapi() })
    }
    if (hasAppointmentRequired()) {
      hapiValue.setAppointmentRequiredElement(appointmentRequired.toHapi())
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

  public fun org.hl7.fhir.r4.model.HealthcareService.toProto(): HealthcareService {
    val protoValue = HealthcareService.newBuilder()
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
    if (hasProvidedBy()) {
      protoValue.setProvidedBy(providedBy.toProto())
    }
    if (hasCategory()) {
      protoValue.addAllCategory(category.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasSpecialty()) {
      protoValue.addAllSpecialty(specialty.map { it.toProto() })
    }
    if (hasLocation()) {
      protoValue.addAllLocation(location.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasComment()) {
      protoValue.setComment(commentElement.toProto())
    }
    if (hasExtraDetails()) {
      protoValue.setExtraDetails(extraDetailsElement.toProto())
    }
    if (hasPhoto()) {
      protoValue.setPhoto(photo.toProto())
    }
    if (hasTelecom()) {
      protoValue.addAllTelecom(telecom.map { it.toProto() })
    }
    if (hasCoverageArea()) {
      protoValue.addAllCoverageArea(coverageArea.map { it.toProto() })
    }
    if (hasServiceProvisionCode()) {
      protoValue.addAllServiceProvisionCode(serviceProvisionCode.map { it.toProto() })
    }
    if (hasEligibility()) {
      protoValue.addAllEligibility(eligibility.map { it.toProto() })
    }
    if (hasProgram()) {
      protoValue.addAllProgram(program.map { it.toProto() })
    }
    if (hasCharacteristic()) {
      protoValue.addAllCharacteristic(characteristic.map { it.toProto() })
    }
    if (hasCommunication()) {
      protoValue.addAllCommunication(communication.map { it.toProto() })
    }
    if (hasReferralMethod()) {
      protoValue.addAllReferralMethod(referralMethod.map { it.toProto() })
    }
    if (hasAppointmentRequired()) {
      protoValue.setAppointmentRequired(appointmentRequiredElement.toProto())
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
      fun org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceEligibilityComponent.toProto():
      HealthcareService.Eligibility {
    val protoValue = HealthcareService.Eligibility.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasComment()) {
      protoValue.setComment(commentElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceAvailableTimeComponent.toProto():
      HealthcareService.AvailableTime {
    val protoValue = HealthcareService.AvailableTime.newBuilder()
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
      protoValue.addAllDaysOfWeek(daysOfWeek.map { HealthcareService.AvailableTime.DaysOfWeekCode.newBuilder().setValue(DaysOfWeekCode.Value.valueOf(it.value.toCode().protoCodeCheck().replace("-",
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
      fun org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceNotAvailableComponent.toProto():
      HealthcareService.NotAvailable {
    val protoValue = HealthcareService.NotAvailable.newBuilder()
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

  private fun HealthcareService.Eligibility.toHapi():
      org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceEligibilityComponent {
    val hapiValue = org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceEligibilityComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasComment()) {
      hapiValue.setCommentElement(comment.toHapi())
    }
    return hapiValue
  }

  private fun HealthcareService.AvailableTime.toHapi():
      org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceAvailableTimeComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceAvailableTimeComponent()
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
      daysOfWeekList.forEach { hapiValue.addDaysOfWeek(org.hl7.fhir.r4.model.HealthcareService.DaysOfWeek.valueOf(it.value.name.hapiCodeCheck().replace("_", ""))) }
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

  private fun HealthcareService.NotAvailable.toHapi():
      org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceNotAvailableComponent {
    val hapiValue = org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceNotAvailableComponent()
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
