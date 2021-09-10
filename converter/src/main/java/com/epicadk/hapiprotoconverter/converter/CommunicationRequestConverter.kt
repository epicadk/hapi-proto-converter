package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.CommunicationRequest
import com.google.fhir.r4.core.CommunicationRequest.Payload
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.RequestPriorityCode
import com.google.fhir.r4.core.RequestStatusCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Attachment
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object CommunicationRequestConverter {
  private fun CommunicationRequest.Payload.ContentX.communicationRequestPayloadContentToHapi():
      Type {
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    if (hasAttachment()) {
      return (this.getAttachment()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for CommunicationRequest.payload.content[x]")
  }

  private fun Type.communicationRequestPayloadContentToProto():
      CommunicationRequest.Payload.ContentX {
    val protoValue = CommunicationRequest.Payload.ContentX.newBuilder()
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is Attachment) {
      protoValue.setAttachment(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private fun CommunicationRequest.OccurrenceX.communicationRequestOccurrenceToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for CommunicationRequest.occurrence[x]")
  }

  private fun Type.communicationRequestOccurrenceToProto(): CommunicationRequest.OccurrenceX {
    val protoValue = CommunicationRequest.OccurrenceX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  public fun CommunicationRequest.toHapi(): org.hl7.fhir.r4.model.CommunicationRequest {
    val hapiValue = org.hl7.fhir.r4.model.CommunicationRequest()
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
    if (basedOnCount > 0) {
      hapiValue.setBasedOn(basedOnList.map { it.toHapi() })
    }
    if (replacesCount > 0) {
      hapiValue.setReplaces(replacesList.map { it.toHapi() })
    }
    if (hasGroupIdentifier()) {
      hapiValue.setGroupIdentifier(groupIdentifier.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.CommunicationRequest.CommunicationRequestStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasStatusReason()) {
      hapiValue.setStatusReason(statusReason.toHapi())
    }
    if (categoryCount > 0) {
      hapiValue.setCategory(categoryList.map { it.toHapi() })
    }
    if (hasPriority()) {
      hapiValue.setPriority(org.hl7.fhir.r4.model.CommunicationRequest.CommunicationPriority.valueOf(priority.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDoNotPerform()) {
      hapiValue.setDoNotPerformElement(doNotPerform.toHapi())
    }
    if (mediumCount > 0) {
      hapiValue.setMedium(mediumList.map { it.toHapi() })
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (aboutCount > 0) {
      hapiValue.setAbout(aboutList.map { it.toHapi() })
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (payloadCount > 0) {
      hapiValue.setPayload(payloadList.map { it.toHapi() })
    }
    if (hasOccurrence()) {
      hapiValue.setOccurrence(occurrence.communicationRequestOccurrenceToHapi())
    }
    if (hasAuthoredOn()) {
      hapiValue.setAuthoredOnElement(authoredOn.toHapi())
    }
    if (hasRequester()) {
      hapiValue.setRequester(requester.toHapi())
    }
    if (recipientCount > 0) {
      hapiValue.setRecipient(recipientList.map { it.toHapi() })
    }
    if (hasSender()) {
      hapiValue.setSender(sender.toHapi())
    }
    if (reasonCodeCount > 0) {
      hapiValue.setReasonCode(reasonCodeList.map { it.toHapi() })
    }
    if (reasonReferenceCount > 0) {
      hapiValue.setReasonReference(reasonReferenceList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.CommunicationRequest.toProto(): CommunicationRequest {
    val protoValue = CommunicationRequest.newBuilder()
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
    if (hasBasedOn()) {
      protoValue.addAllBasedOn(basedOn.map { it.toProto() })
    }
    if (hasReplaces()) {
      protoValue.addAllReplaces(replaces.map { it.toProto() })
    }
    if (hasGroupIdentifier()) {
      protoValue.setGroupIdentifier(groupIdentifier.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(CommunicationRequest.StatusCode.newBuilder().setValue(RequestStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasStatusReason()) {
      protoValue.setStatusReason(statusReason.toProto())
    }
    if (hasCategory()) {
      protoValue.addAllCategory(category.map { it.toProto() })
    }
    if (hasPriority()) {
      protoValue.setPriority(CommunicationRequest.PriorityCode.newBuilder().setValue(RequestPriorityCode.Value.valueOf(priority.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDoNotPerform()) {
      protoValue.setDoNotPerform(doNotPerformElement.toProto())
    }
    if (hasMedium()) {
      protoValue.addAllMedium(medium.map { it.toProto() })
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasAbout()) {
      protoValue.addAllAbout(about.map { it.toProto() })
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasPayload()) {
      protoValue.addAllPayload(payload.map { it.toProto() })
    }
    if (hasOccurrence()) {
      protoValue.setOccurrence(occurrence.communicationRequestOccurrenceToProto())
    }
    if (hasAuthoredOn()) {
      protoValue.setAuthoredOn(authoredOnElement.toProto())
    }
    if (hasRequester()) {
      protoValue.setRequester(requester.toProto())
    }
    if (hasRecipient()) {
      protoValue.addAllRecipient(recipient.map { it.toProto() })
    }
    if (hasSender()) {
      protoValue.setSender(sender.toProto())
    }
    if (hasReasonCode()) {
      protoValue.addAllReasonCode(reasonCode.map { it.toProto() })
    }
    if (hasReasonReference()) {
      protoValue.addAllReasonReference(reasonReference.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.CommunicationRequest.CommunicationRequestPayloadComponent.toProto():
      CommunicationRequest.Payload {
    val protoValue = CommunicationRequest.Payload.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasContent()) {
      protoValue.setContent(content.communicationRequestPayloadContentToProto())
    }
    return protoValue.build()
  }

  private fun CommunicationRequest.Payload.toHapi():
      org.hl7.fhir.r4.model.CommunicationRequest.CommunicationRequestPayloadComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.CommunicationRequest.CommunicationRequestPayloadComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasContent()) {
      hapiValue.setContent(content.communicationRequestPayloadContentToHapi())
    }
    return hapiValue
  }
}
