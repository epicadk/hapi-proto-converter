package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.RiskEvidenceSynthesis
import com.google.fhir.r4.core.RiskEvidenceSynthesis.Certainty
import com.google.fhir.r4.core.RiskEvidenceSynthesis.RiskEstimate
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.Enumerations

public object RiskEvidenceSynthesisConverter {
  public fun RiskEvidenceSynthesis.toHapi(): org.hl7.fhir.r4.model.RiskEvidenceSynthesis {
    val hapiValue = org.hl7.fhir.r4.model.RiskEvidenceSynthesis()
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
    if (hasSynthesisType()) {
      hapiValue.setSynthesisType(synthesisType.toHapi())
    }
    if (hasStudyType()) {
      hapiValue.setStudyType(studyType.toHapi())
    }
    if (hasPopulation()) {
      hapiValue.setPopulation(population.toHapi())
    }
    if (hasExposure()) {
      hapiValue.setExposure(exposure.toHapi())
    }
    if (hasOutcome()) {
      hapiValue.setOutcome(outcome.toHapi())
    }
    if (hasSampleSize()) {
      hapiValue.setSampleSize(sampleSize.toHapi())
    }
    if (hasRiskEstimate()) {
      hapiValue.setRiskEstimate(riskEstimate.toHapi())
    }
    if (certaintyCount > 0) {
      hapiValue.setCertainty(certaintyList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.RiskEvidenceSynthesis.toProto(): RiskEvidenceSynthesis {
    val protoValue = RiskEvidenceSynthesis.newBuilder()
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
    if (hasStatus()) {
      protoValue.setStatus(RiskEvidenceSynthesis.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
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
    if (hasSynthesisType()) {
      protoValue.setSynthesisType(synthesisType.toProto())
    }
    if (hasStudyType()) {
      protoValue.setStudyType(studyType.toProto())
    }
    if (hasPopulation()) {
      protoValue.setPopulation(population.toProto())
    }
    if (hasExposure()) {
      protoValue.setExposure(exposure.toProto())
    }
    if (hasOutcome()) {
      protoValue.setOutcome(outcome.toProto())
    }
    if (hasSampleSize()) {
      protoValue.setSampleSize(sampleSize.toProto())
    }
    if (hasRiskEstimate()) {
      protoValue.setRiskEstimate(riskEstimate.toProto())
    }
    if (hasCertainty()) {
      protoValue.addAllCertainty(certainty.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisSampleSizeComponent.toProto():
      RiskEvidenceSynthesis.SampleSize {
    val protoValue = RiskEvidenceSynthesis.SampleSize.newBuilder()
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
    if (hasNumberOfStudies()) {
      protoValue.setNumberOfStudies(numberOfStudiesElement.toProto())
    }
    if (hasNumberOfParticipants()) {
      protoValue.setNumberOfParticipants(numberOfParticipantsElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimateComponent.toProto():
      RiskEvidenceSynthesis.RiskEstimate {
    val protoValue = RiskEvidenceSynthesis.RiskEstimate.newBuilder()
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
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasValue()) {
      protoValue.setValue(valueElement.toProto())
    }
    if (hasUnitOfMeasure()) {
      protoValue.setUnitOfMeasure(unitOfMeasure.toProto())
    }
    if (hasDenominatorCount()) {
      protoValue.setDenominatorCount(denominatorCountElement.toProto())
    }
    if (hasNumeratorCount()) {
      protoValue.setNumeratorCount(numeratorCountElement.toProto())
    }
    if (hasPrecisionEstimate()) {
      protoValue.addAllPrecisionEstimate(precisionEstimate.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimatePrecisionEstimateComponent.toProto():
      RiskEvidenceSynthesis.RiskEstimate.PrecisionEstimate {
    val protoValue = RiskEvidenceSynthesis.RiskEstimate.PrecisionEstimate.newBuilder()
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
      protoValue.setType(type.toProto())
    }
    if (hasLevel()) {
      protoValue.setLevel(levelElement.toProto())
    }
    if (hasFrom()) {
      protoValue.setFrom(fromElement.toProto())
    }
    if (hasTo()) {
      protoValue.setTo(toElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisCertaintyComponent.toProto():
      RiskEvidenceSynthesis.Certainty {
    val protoValue = RiskEvidenceSynthesis.Certainty.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasRating()) {
      protoValue.addAllRating(rating.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasCertaintySubcomponent()) {
      protoValue.addAllCertaintySubcomponent(certaintySubcomponent.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisCertaintyCertaintySubcomponentComponent.toProto():
      RiskEvidenceSynthesis.Certainty.CertaintySubcomponent {
    val protoValue = RiskEvidenceSynthesis.Certainty.CertaintySubcomponent.newBuilder()
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
      protoValue.setType(type.toProto())
    }
    if (hasRating()) {
      protoValue.addAllRating(rating.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun RiskEvidenceSynthesis.SampleSize.toHapi():
      org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisSampleSizeComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisSampleSizeComponent()
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
    if (hasNumberOfStudies()) {
      hapiValue.setNumberOfStudiesElement(numberOfStudies.toHapi())
    }
    if (hasNumberOfParticipants()) {
      hapiValue.setNumberOfParticipantsElement(numberOfParticipants.toHapi())
    }
    return hapiValue
  }

  private fun RiskEvidenceSynthesis.RiskEstimate.toHapi():
      org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimateComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimateComponent()
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
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasValue()) {
      hapiValue.setValueElement(value.toHapi())
    }
    if (hasUnitOfMeasure()) {
      hapiValue.setUnitOfMeasure(unitOfMeasure.toHapi())
    }
    if (hasDenominatorCount()) {
      hapiValue.setDenominatorCountElement(denominatorCount.toHapi())
    }
    if (hasNumeratorCount()) {
      hapiValue.setNumeratorCountElement(numeratorCount.toHapi())
    }
    if (precisionEstimateCount > 0) {
      hapiValue.setPrecisionEstimate(precisionEstimateList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun RiskEvidenceSynthesis.RiskEstimate.PrecisionEstimate.toHapi():
      org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimatePrecisionEstimateComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimatePrecisionEstimateComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasLevel()) {
      hapiValue.setLevelElement(level.toHapi())
    }
    if (hasFrom()) {
      hapiValue.setFromElement(from.toHapi())
    }
    if (hasTo()) {
      hapiValue.setToElement(to.toHapi())
    }
    return hapiValue
  }

  private fun RiskEvidenceSynthesis.Certainty.toHapi():
      org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisCertaintyComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisCertaintyComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (ratingCount > 0) {
      hapiValue.setRating(ratingList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (certaintySubcomponentCount > 0) {
      hapiValue.setCertaintySubcomponent(certaintySubcomponentList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun RiskEvidenceSynthesis.Certainty.CertaintySubcomponent.toHapi():
      org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisCertaintyCertaintySubcomponentComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisCertaintyCertaintySubcomponentComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (ratingCount > 0) {
      hapiValue.setRating(ratingList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    return hapiValue
  }
}
