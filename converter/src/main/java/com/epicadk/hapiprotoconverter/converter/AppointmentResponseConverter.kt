package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.AppointmentResponse
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.ParticipationStatusCode

public object AppointmentResponseConverter {
  public fun AppointmentResponse.toHapi(): org.hl7.fhir.r4.model.AppointmentResponse {
    val hapiValue = org.hl7.fhir.r4.model.AppointmentResponse()
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
    if (hasAppointment()) {
      hapiValue.setAppointment(appointment.toHapi())
    }
    if (hasStart()) {
      hapiValue.setStartElement(start.toHapi())
    }
    if (hasEnd()) {
      hapiValue.setEndElement(end.toHapi())
    }
    if (participantTypeCount > 0) {
      hapiValue.setParticipantType(participantTypeList.map { it.toHapi() })
    }
    if (hasActor()) {
      hapiValue.setActor(actor.toHapi())
    }
    if (hasParticipantStatus()) {
      hapiValue.setParticipantStatus(org.hl7.fhir.r4.model.AppointmentResponse.ParticipantStatus.valueOf(participantStatus.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasComment()) {
      hapiValue.setCommentElement(comment.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.AppointmentResponse.toProto(): AppointmentResponse {
    val protoValue = AppointmentResponse.newBuilder()
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
    if (hasAppointment()) {
      protoValue.setAppointment(appointment.toProto())
    }
    if (hasStart()) {
      protoValue.setStart(startElement.toProto())
    }
    if (hasEnd()) {
      protoValue.setEnd(endElement.toProto())
    }
    if (hasParticipantType()) {
      protoValue.addAllParticipantType(participantType.map { it.toProto() })
    }
    if (hasActor()) {
      protoValue.setActor(actor.toProto())
    }
    if (hasParticipantStatus()) {
      protoValue.setParticipantStatus(AppointmentResponse.ParticipantStatusCode.newBuilder().setValue(ParticipationStatusCode.Value.valueOf(participantStatus.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasComment()) {
      protoValue.setComment(commentElement.toProto())
    }
    return protoValue.build()
  }
}
