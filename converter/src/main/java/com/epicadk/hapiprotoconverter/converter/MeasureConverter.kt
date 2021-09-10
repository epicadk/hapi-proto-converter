package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Measure
import com.google.fhir.r4.core.Measure.Group
import com.google.fhir.r4.core.Measure.Group.Stratifier
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.Enumerations
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.Type

public object MeasureConverter {
  private fun Measure.SubjectX.measureSubjectToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Measure.subject[x]")
  }

  private fun Type.measureSubjectToProto(): Measure.SubjectX {
    val protoValue = Measure.SubjectX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  public fun Measure.toHapi(): org.hl7.fhir.r4.model.Measure {
    val hapiValue = org.hl7.fhir.r4.model.Measure()
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
    if (hasSubtitle()) {
      hapiValue.setSubtitleElement(subtitle.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(Enumerations.PublicationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasExperimental()) {
      hapiValue.setExperimentalElement(experimental.toHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.measureSubjectToHapi())
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
    if (useContextCount > 0) {
      hapiValue.setUseContext(useContextList.map { it.toHapi() })
    }
    if (jurisdictionCount > 0) {
      hapiValue.setJurisdiction(jurisdictionList.map { it.toHapi() })
    }
    if (hasPurpose()) {
      hapiValue.setPurposeElement(purpose.toHapi())
    }
    if (hasUsage()) {
      hapiValue.setUsageElement(usage.toHapi())
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
    if (libraryCount > 0) {
      hapiValue.setLibrary(libraryList.map { it.toHapi() })
    }
    if (hasDisclaimer()) {
      hapiValue.setDisclaimerElement(disclaimer.toHapi())
    }
    if (hasScoring()) {
      hapiValue.setScoring(scoring.toHapi())
    }
    if (hasCompositeScoring()) {
      hapiValue.setCompositeScoring(compositeScoring.toHapi())
    }
    if (typeCount > 0) {
      hapiValue.setType(typeList.map { it.toHapi() })
    }
    if (hasRiskAdjustment()) {
      hapiValue.setRiskAdjustmentElement(riskAdjustment.toHapi())
    }
    if (hasRateAggregation()) {
      hapiValue.setRateAggregationElement(rateAggregation.toHapi())
    }
    if (hasRationale()) {
      hapiValue.setRationaleElement(rationale.toHapi())
    }
    if (hasClinicalRecommendationStatement()) {
      hapiValue.setClinicalRecommendationStatementElement(clinicalRecommendationStatement.toHapi())
    }
    if (hasImprovementNotation()) {
      hapiValue.setImprovementNotation(improvementNotation.toHapi())
    }
    if (definitionCount > 0) {
      hapiValue.setDefinition(definitionList.map { it.toHapi() })
    }
    if (hasGuidance()) {
      hapiValue.setGuidanceElement(guidance.toHapi())
    }
    if (groupCount > 0) {
      hapiValue.setGroup(groupList.map { it.toHapi() })
    }
    if (supplementalDataCount > 0) {
      hapiValue.setSupplementalData(supplementalDataList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Measure.toProto(): Measure {
    val protoValue = Measure.newBuilder()
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
    if (hasSubtitle()) {
      protoValue.setSubtitle(subtitleElement.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(Measure.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasExperimental()) {
      protoValue.setExperimental(experimentalElement.toProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.measureSubjectToProto())
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
    if (hasUseContext()) {
      protoValue.addAllUseContext(useContext.map { it.toProto() })
    }
    if (hasJurisdiction()) {
      protoValue.addAllJurisdiction(jurisdiction.map { it.toProto() })
    }
    if (hasPurpose()) {
      protoValue.setPurpose(purposeElement.toProto())
    }
    if (hasUsage()) {
      protoValue.setUsage(usageElement.toProto())
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
    if (hasLibrary()) {
      protoValue.addAllLibrary(library.map { it.toProto() })
    }
    if (hasDisclaimer()) {
      protoValue.setDisclaimer(disclaimerElement.toProto())
    }
    if (hasScoring()) {
      protoValue.setScoring(scoring.toProto())
    }
    if (hasCompositeScoring()) {
      protoValue.setCompositeScoring(compositeScoring.toProto())
    }
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasRiskAdjustment()) {
      protoValue.setRiskAdjustment(riskAdjustmentElement.toProto())
    }
    if (hasRateAggregation()) {
      protoValue.setRateAggregation(rateAggregationElement.toProto())
    }
    if (hasRationale()) {
      protoValue.setRationale(rationaleElement.toProto())
    }
    if (hasClinicalRecommendationStatement()) {
      protoValue.setClinicalRecommendationStatement(clinicalRecommendationStatementElement.toProto())
    }
    if (hasImprovementNotation()) {
      protoValue.setImprovementNotation(improvementNotation.toProto())
    }
    if (hasDefinition()) {
      protoValue.addAllDefinition(definition.map { it.toProto() })
    }
    if (hasGuidance()) {
      protoValue.setGuidance(guidanceElement.toProto())
    }
    if (hasGroup()) {
      protoValue.addAllGroup(group.map { it.toProto() })
    }
    if (hasSupplementalData()) {
      protoValue.addAllSupplementalData(supplementalData.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Measure.MeasureGroupComponent.toProto(): Measure.Group {
    val protoValue = Measure.Group.newBuilder()
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
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasPopulation()) {
      protoValue.addAllPopulation(population.map { it.toProto() })
    }
    if (hasStratifier()) {
      protoValue.addAllStratifier(stratifier.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Measure.MeasureGroupPopulationComponent.toProto():
      Measure.Group.Population {
    val protoValue = Measure.Group.Population.newBuilder()
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
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasCriteria()) {
      protoValue.setCriteria(criteria.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Measure.MeasureGroupStratifierComponent.toProto():
      Measure.Group.Stratifier {
    val protoValue = Measure.Group.Stratifier.newBuilder()
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
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasCriteria()) {
      protoValue.setCriteria(criteria.toProto())
    }
    if (hasComponent()) {
      protoValue.addAllComponent(component.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Measure.MeasureGroupStratifierComponentComponent.toProto():
      Measure.Group.Stratifier.Component {
    val protoValue = Measure.Group.Stratifier.Component.newBuilder()
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
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasCriteria()) {
      protoValue.setCriteria(criteria.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Measure.MeasureSupplementalDataComponent.toProto():
      Measure.SupplementalData {
    val protoValue = Measure.SupplementalData.newBuilder()
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
    if (hasUsage()) {
      protoValue.addAllUsage(usage.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasCriteria()) {
      protoValue.setCriteria(criteria.toProto())
    }
    return protoValue.build()
  }

  private fun Measure.Group.toHapi(): org.hl7.fhir.r4.model.Measure.MeasureGroupComponent {
    val hapiValue = org.hl7.fhir.r4.model.Measure.MeasureGroupComponent()
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
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (populationCount > 0) {
      hapiValue.setPopulation(populationList.map { it.toHapi() })
    }
    if (stratifierCount > 0) {
      hapiValue.setStratifier(stratifierList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun Measure.Group.Population.toHapi():
      org.hl7.fhir.r4.model.Measure.MeasureGroupPopulationComponent {
    val hapiValue = org.hl7.fhir.r4.model.Measure.MeasureGroupPopulationComponent()
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
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasCriteria()) {
      hapiValue.setCriteria(criteria.toHapi())
    }
    return hapiValue
  }

  private fun Measure.Group.Stratifier.toHapi():
      org.hl7.fhir.r4.model.Measure.MeasureGroupStratifierComponent {
    val hapiValue = org.hl7.fhir.r4.model.Measure.MeasureGroupStratifierComponent()
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
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasCriteria()) {
      hapiValue.setCriteria(criteria.toHapi())
    }
    if (componentCount > 0) {
      hapiValue.setComponent(componentList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun Measure.Group.Stratifier.Component.toHapi():
      org.hl7.fhir.r4.model.Measure.MeasureGroupStratifierComponentComponent {
    val hapiValue = org.hl7.fhir.r4.model.Measure.MeasureGroupStratifierComponentComponent()
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
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasCriteria()) {
      hapiValue.setCriteria(criteria.toHapi())
    }
    return hapiValue
  }

  private fun Measure.SupplementalData.toHapi():
      org.hl7.fhir.r4.model.Measure.MeasureSupplementalDataComponent {
    val hapiValue = org.hl7.fhir.r4.model.Measure.MeasureSupplementalDataComponent()
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
    if (usageCount > 0) {
      hapiValue.setUsage(usageList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasCriteria()) {
      hapiValue.setCriteria(criteria.toHapi())
    }
    return hapiValue
  }
}
