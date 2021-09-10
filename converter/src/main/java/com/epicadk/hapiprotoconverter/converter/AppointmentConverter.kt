package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Appointment
import com.google.fhir.r4.core.Appointment.Participant
import com.google.fhir.r4.core.AppointmentStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.ParticipantRequiredCode
import com.google.fhir.r4.core.ParticipationStatusCode
import com.google.fhir.r4.core.String

public object AppointmentConverter {
  public fun Appointment.toHapi(): org.hl7.fhir.r4.model.Appointment {
    val hapiValue = org.hl7.fhir.r4.model.Appointment()
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
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.Appointment.AppointmentStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCancelationReason()) {
      hapiValue.setCancelationReason(cancelationReason.toHapi())
    }
    if (serviceCategoryCount > 0) {
      hapiValue.setServiceCategory(serviceCategoryList.map { it.toHapi() })
    }
    if (serviceTypeCount > 0) {
      hapiValue.setServiceType(serviceTypeList.map { it.toHapi() })
    }
    if (specialtyCount > 0) {
      hapiValue.setSpecialty(specialtyList.map { it.toHapi() })
    }
    if (hasAppointmentType()) {
      hapiValue.setAppointmentType(appointmentType.toHapi())
    }
    if (reasonCodeCount > 0) {
      hapiValue.setReasonCode(reasonCodeList.map { it.toHapi() })
    }
    if (reasonReferenceCount > 0) {
      hapiValue.setReasonReference(reasonReferenceList.map { it.toHapi() })
    }
    if (hasPriority()) {
      hapiValue.setPriorityElement(priority.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (supportingInformationCount > 0) {
      hapiValue.setSupportingInformation(supportingInformationList.map { it.toHapi() })
    }
    if (hasStart()) {
      hapiValue.setStartElement(start.toHapi())
    }
    if (hasEnd()) {
      hapiValue.setEndElement(end.toHapi())
    }
    if (hasMinutesDuration()) {
      hapiValue.setMinutesDurationElement(minutesDuration.toHapi())
    }
    if (slotCount > 0) {
      hapiValue.setSlot(slotList.map { it.toHapi() })
    }
    if (hasCreated()) {
      hapiValue.setCreatedElement(created.toHapi())
    }
    if (hasComment()) {
      hapiValue.setCommentElement(comment.toHapi())
    }
    if (hasPatientInstruction()) {
      hapiValue.setPatientInstructionElement(patientInstruction.toHapi())
    }
    if (basedOnCount > 0) {
      hapiValue.setBasedOn(basedOnList.map { it.toHapi() })
    }
    if (participantCount > 0) {
      hapiValue.setParticipant(participantList.map { it.toHapi() })
    }
    if (requestedPeriodCount > 0) {
      hapiValue.setRequestedPeriod(requestedPeriodList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Appointment.toProto(): Appointment {
    val protoValue = Appointment.newBuilder()
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
    if (hasStatus()) {
      protoValue.setStatus(Appointment.StatusCode.newBuilder().setValue(AppointmentStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCancelationReason()) {
      protoValue.setCancelationReason(cancelationReason.toProto())
    }
    if (hasServiceCategory()) {
      protoValue.addAllServiceCategory(serviceCategory.map { it.toProto() })
    }
    if (hasServiceType()) {
      protoValue.addAllServiceType(serviceType.map { it.toProto() })
    }
    if (hasSpecialty()) {
      protoValue.addAllSpecialty(specialty.map { it.toProto() })
    }
    if (hasAppointmentType()) {
      protoValue.setAppointmentType(appointmentType.toProto())
    }
    if (hasReasonCode()) {
      protoValue.addAllReasonCode(reasonCode.map { it.toProto() })
    }
    if (hasReasonReference()) {
      protoValue.addAllReasonReference(reasonReference.map { it.toProto() })
    }
    if (hasPriority()) {
      protoValue.setPriority(priorityElement.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasSupportingInformation()) {
      protoValue.addAllSupportingInformation(supportingInformation.map { it.toProto() })
    }
    if (hasStart()) {
      protoValue.setStart(startElement.toProto())
    }
    if (hasEnd()) {
      protoValue.setEnd(endElement.toProto())
    }
    if (hasMinutesDuration()) {
      protoValue.setMinutesDuration(minutesDurationElement.toProto())
    }
    if (hasSlot()) {
      protoValue.addAllSlot(slot.map { it.toProto() })
    }
    if (hasCreated()) {
      protoValue.setCreated(createdElement.toProto())
    }
    if (hasComment()) {
      protoValue.setComment(commentElement.toProto())
    }
    if (hasPatientInstruction()) {
      protoValue.setPatientInstruction(patientInstructionElement.toProto())
    }
    if (hasBasedOn()) {
      protoValue.addAllBasedOn(basedOn.map { it.toProto() })
    }
    if (hasParticipant()) {
      protoValue.addAllParticipant(participant.map { it.toProto() })
    }
    if (hasRequestedPeriod()) {
      protoValue.addAllRequestedPeriod(requestedPeriod.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Appointment.AppointmentParticipantComponent.toProto():
      Appointment.Participant {
    val protoValue = Appointment.Participant.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasActor()) {
      protoValue.setActor(actor.toProto())
    }
    if (hasRequired()) {
      protoValue.setRequired(Appointment.Participant.RequiredCode.newBuilder().setValue(ParticipantRequiredCode.Value.valueOf(required.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasStatus()) {
      protoValue.setStatus(Appointment.Participant.StatusCode.newBuilder().setValue(ParticipationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    return protoValue.build()
  }

  private fun Appointment.Participant.toHapi():
      org.hl7.fhir.r4.model.Appointment.AppointmentParticipantComponent {
    val hapiValue = org.hl7.fhir.r4.model.Appointment.AppointmentParticipantComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (typeCount > 0) {
      hapiValue.setType(typeList.map { it.toHapi() })
    }
    if (hasActor()) {
      hapiValue.setActor(actor.toHapi())
    }
    if (hasRequired()) {
      hapiValue.setRequired(org.hl7.fhir.r4.model.Appointment.ParticipantRequired.valueOf(required.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.Appointment.ParticipationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    return hapiValue
  }
}
