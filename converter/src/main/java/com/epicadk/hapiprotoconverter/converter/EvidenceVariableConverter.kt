package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DataRequirementConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DataRequirementConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExpressionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExpressionConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.RelatedArtifactConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RelatedArtifactConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TriggerDefinitionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TriggerDefinitionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toProto
import com.google.fhir.r4.core.EvidenceVariable
import com.google.fhir.r4.core.EvidenceVariable.Characteristic
import com.google.fhir.r4.core.EvidenceVariableTypeCode
import com.google.fhir.r4.core.GroupMeasureCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CanonicalType
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.DataRequirement
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Duration
import org.hl7.fhir.r4.model.Enumerations
import org.hl7.fhir.r4.model.Expression
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.Timing
import org.hl7.fhir.r4.model.TriggerDefinition
import org.hl7.fhir.r4.model.Type

public object EvidenceVariableConverter {
  private
      fun EvidenceVariable.Characteristic.DefinitionX.evidenceVariableCharacteristicDefinitionToHapi():
      Type {
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    if (hasCanonical()) {
      return (this.getCanonical()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasExpression()) {
      return (this.getExpression()).toHapi()
    }
    if (hasDataRequirement()) {
      return (this.getDataRequirement()).toHapi()
    }
    if (hasTriggerDefinition()) {
      return (this.getTriggerDefinition()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for EvidenceVariable.characteristic.definition[x]")
  }

  private fun Type.evidenceVariableCharacteristicDefinitionToProto():
      EvidenceVariable.Characteristic.DefinitionX {
    val protoValue = EvidenceVariable.Characteristic.DefinitionX.newBuilder()
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    if (this is CanonicalType) {
      protoValue.setCanonical(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Expression) {
      protoValue.setExpression(this.toProto())
    }
    if (this is DataRequirement) {
      protoValue.setDataRequirement(this.toProto())
    }
    if (this is TriggerDefinition) {
      protoValue.setTriggerDefinition(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun EvidenceVariable.Characteristic.ParticipantEffectiveX.evidenceVariableCharacteristicParticipantEffectiveToHapi():
      Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasDuration()) {
      return (this.getDuration()).toHapi()
    }
    if (hasTiming()) {
      return (this.getTiming()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for EvidenceVariable.characteristic.participantEffective[x]")
  }

  private fun Type.evidenceVariableCharacteristicParticipantEffectiveToProto():
      EvidenceVariable.Characteristic.ParticipantEffectiveX {
    val protoValue = EvidenceVariable.Characteristic.ParticipantEffectiveX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    if (this is Duration) {
      protoValue.setDuration(this.toProto())
    }
    if (this is Timing) {
      protoValue.setTiming(this.toProto())
    }
    return protoValue.build()
  }

  public fun EvidenceVariable.toHapi(): org.hl7.fhir.r4.model.EvidenceVariable {
    val hapiValue = org.hl7.fhir.r4.model.EvidenceVariable()
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
    if (hasUrl()) {
      hapiValue.setUrlElement(url.toHapi())
    }
    if (identifierCount > 0) {
      hapiValue.setIdentifier(identifierList.map { it.toHapi() })
    }
    if (hasVersion()) {
      hapiValue.setVersionElement(version.toHapi())
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasTitle()) {
      hapiValue.setTitleElement(title.toHapi())
    }
    if (hasShortTitle()) {
      hapiValue.setShortTitleElement(shortTitle.toHapi())
    }
    if (hasSubtitle()) {
      hapiValue.setSubtitleElement(subtitle.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(Enumerations.PublicationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasPublisher()) {
      hapiValue.setPublisherElement(publisher.toHapi())
    }
    if (contactCount > 0) {
      hapiValue.setContact(contactList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (useContextCount > 0) {
      hapiValue.setUseContext(useContextList.map { it.toHapi() })
    }
    if (jurisdictionCount > 0) {
      hapiValue.setJurisdiction(jurisdictionList.map { it.toHapi() })
    }
    if (hasCopyright()) {
      hapiValue.setCopyrightElement(copyright.toHapi())
    }
    if (hasApprovalDate()) {
      hapiValue.setApprovalDateElement(approvalDate.toHapi())
    }
    if (hasLastReviewDate()) {
      hapiValue.setLastReviewDateElement(lastReviewDate.toHapi())
    }
    if (hasEffectivePeriod()) {
      hapiValue.setEffectivePeriod(effectivePeriod.toHapi())
    }
    if (topicCount > 0) {
      hapiValue.setTopic(topicList.map { it.toHapi() })
    }
    if (authorCount > 0) {
      hapiValue.setAuthor(authorList.map { it.toHapi() })
    }
    if (editorCount > 0) {
      hapiValue.setEditor(editorList.map { it.toHapi() })
    }
    if (reviewerCount > 0) {
      hapiValue.setReviewer(reviewerList.map { it.toHapi() })
    }
    if (endorserCount > 0) {
      hapiValue.setEndorser(endorserList.map { it.toHapi() })
    }
    if (relatedArtifactCount > 0) {
      hapiValue.setRelatedArtifact(relatedArtifactList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(org.hl7.fhir.r4.model.EvidenceVariable.EvidenceVariableType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (characteristicCount > 0) {
      hapiValue.setCharacteristic(characteristicList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.EvidenceVariable.toProto(): EvidenceVariable {
    val protoValue = EvidenceVariable.newBuilder()
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
    if (hasUrl()) {
      protoValue.setUrl(urlElement.toProto())
    }
    if (hasIdentifier()) {
      protoValue.addAllIdentifier(identifier.map { it.toProto() })
    }
    if (hasVersion()) {
      protoValue.setVersion(versionElement.toProto())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasTitle()) {
      protoValue.setTitle(titleElement.toProto())
    }
    if (hasShortTitle()) {
      protoValue.setShortTitle(shortTitleElement.toProto())
    }
    if (hasSubtitle()) {
      protoValue.setSubtitle(subtitleElement.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(EvidenceVariable.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasPublisher()) {
      protoValue.setPublisher(publisherElement.toProto())
    }
    if (hasContact()) {
      protoValue.addAllContact(contact.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasUseContext()) {
      protoValue.addAllUseContext(useContext.map { it.toProto() })
    }
    if (hasJurisdiction()) {
      protoValue.addAllJurisdiction(jurisdiction.map { it.toProto() })
    }
    if (hasCopyright()) {
      protoValue.setCopyright(copyrightElement.toProto())
    }
    if (hasApprovalDate()) {
      protoValue.setApprovalDate(approvalDateElement.toProto())
    }
    if (hasLastReviewDate()) {
      protoValue.setLastReviewDate(lastReviewDateElement.toProto())
    }
    if (hasEffectivePeriod()) {
      protoValue.setEffectivePeriod(effectivePeriod.toProto())
    }
    if (hasTopic()) {
      protoValue.addAllTopic(topic.map { it.toProto() })
    }
    if (hasAuthor()) {
      protoValue.addAllAuthor(author.map { it.toProto() })
    }
    if (hasEditor()) {
      protoValue.addAllEditor(editor.map { it.toProto() })
    }
    if (hasReviewer()) {
      protoValue.addAllReviewer(reviewer.map { it.toProto() })
    }
    if (hasEndorser()) {
      protoValue.addAllEndorser(endorser.map { it.toProto() })
    }
    if (hasRelatedArtifact()) {
      protoValue.addAllRelatedArtifact(relatedArtifact.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.setType(EvidenceVariable.TypeCode.newBuilder().setValue(EvidenceVariableTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCharacteristic()) {
      protoValue.addAllCharacteristic(characteristic.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.EvidenceVariable.EvidenceVariableCharacteristicComponent.toProto():
      EvidenceVariable.Characteristic {
    val protoValue = EvidenceVariable.Characteristic.newBuilder()
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
    if (hasDefinition()) {
      protoValue.setDefinition(definition.evidenceVariableCharacteristicDefinitionToProto())
    }
    if (hasUsageContext()) {
      protoValue.addAllUsageContext(usageContext.map { it.toProto() })
    }
    if (hasExclude()) {
      protoValue.setExclude(excludeElement.toProto())
    }
    if (hasParticipantEffective()) {
      protoValue.setParticipantEffective(participantEffective.evidenceVariableCharacteristicParticipantEffectiveToProto())
    }
    if (hasTimeFromStart()) {
      protoValue.setTimeFromStart(timeFromStart.toProto())
    }
    if (hasGroupMeasure()) {
      protoValue.setGroupMeasure(EvidenceVariable.Characteristic.GroupMeasureCode.newBuilder().setValue(GroupMeasureCode.Value.valueOf(groupMeasure.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    return protoValue.build()
  }

  private fun EvidenceVariable.Characteristic.toHapi():
      org.hl7.fhir.r4.model.EvidenceVariable.EvidenceVariableCharacteristicComponent {
    val hapiValue = org.hl7.fhir.r4.model.EvidenceVariable.EvidenceVariableCharacteristicComponent()
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
    if (hasDefinition()) {
      hapiValue.setDefinition(definition.evidenceVariableCharacteristicDefinitionToHapi())
    }
    if (usageContextCount > 0) {
      hapiValue.setUsageContext(usageContextList.map { it.toHapi() })
    }
    if (hasExclude()) {
      hapiValue.setExcludeElement(exclude.toHapi())
    }
    if (hasParticipantEffective()) {
      hapiValue.setParticipantEffective(participantEffective.evidenceVariableCharacteristicParticipantEffectiveToHapi())
    }
    if (hasTimeFromStart()) {
      hapiValue.setTimeFromStart(timeFromStart.toHapi())
    }
    if (hasGroupMeasure()) {
      hapiValue.setGroupMeasure(org.hl7.fhir.r4.model.EvidenceVariable.GroupMeasure.valueOf(groupMeasure.value.name.hapiCodeCheck().replace("_", "")))
    }
    return hapiValue
  }
}
