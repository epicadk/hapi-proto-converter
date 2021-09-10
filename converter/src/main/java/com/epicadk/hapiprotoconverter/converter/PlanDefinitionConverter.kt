package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AgeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AgeConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.IdConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toProto
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
import com.google.fhir.r4.core.ActionCardinalityBehaviorCode
import com.google.fhir.r4.core.ActionConditionKindCode
import com.google.fhir.r4.core.ActionGroupingBehaviorCode
import com.google.fhir.r4.core.ActionParticipantTypeCode
import com.google.fhir.r4.core.ActionPrecheckBehaviorCode
import com.google.fhir.r4.core.ActionRelationshipTypeCode
import com.google.fhir.r4.core.ActionRequiredBehaviorCode
import com.google.fhir.r4.core.ActionSelectionBehaviorCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.PlanDefinition
import com.google.fhir.r4.core.PlanDefinition.Action
import com.google.fhir.r4.core.PlanDefinition.Action.Condition
import com.google.fhir.r4.core.PlanDefinition.Action.Participant
import com.google.fhir.r4.core.PlanDefinition.Action.RelatedAction
import com.google.fhir.r4.core.PlanDefinition.Goal
import com.google.fhir.r4.core.PlanDefinition.Goal.Target
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.RequestPriorityCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Age
import org.hl7.fhir.r4.model.CanonicalType
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Duration
import org.hl7.fhir.r4.model.Enumerations
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Quantity
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.Timing
import org.hl7.fhir.r4.model.Type
import org.hl7.fhir.r4.model.UriType

public object PlanDefinitionConverter {
  private fun PlanDefinition.SubjectX.planDefinitionSubjectToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for PlanDefinition.subject[x]")
  }

  private fun Type.planDefinitionSubjectToProto(): PlanDefinition.SubjectX {
    val protoValue = PlanDefinition.SubjectX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private fun PlanDefinition.Goal.Target.DetailX.planDefinitionGoalTargetDetailToHapi(): Type {
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for PlanDefinition.goal.target.detail[x]")
  }

  private fun Type.planDefinitionGoalTargetDetailToProto(): PlanDefinition.Goal.Target.DetailX {
    val protoValue = PlanDefinition.Goal.Target.DetailX.newBuilder()
    if (this is Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    return protoValue.build()
  }

  private fun PlanDefinition.Action.SubjectX.planDefinitionActionSubjectToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for PlanDefinition.action.subject[x]")
  }

  private fun Type.planDefinitionActionSubjectToProto(): PlanDefinition.Action.SubjectX {
    val protoValue = PlanDefinition.Action.SubjectX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun PlanDefinition.Action.RelatedAction.OffsetX.planDefinitionActionRelatedActionOffsetToHapi():
      Type {
    if (hasDuration()) {
      return (this.getDuration()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for PlanDefinition.action.relatedAction.offset[x]")
  }

  private fun Type.planDefinitionActionRelatedActionOffsetToProto():
      PlanDefinition.Action.RelatedAction.OffsetX {
    val protoValue = PlanDefinition.Action.RelatedAction.OffsetX.newBuilder()
    if (this is Duration) {
      protoValue.setDuration(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    return protoValue.build()
  }

  private fun PlanDefinition.Action.TimingX.planDefinitionActionTimingToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasAge()) {
      return (this.getAge()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasDuration()) {
      return (this.getDuration()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasTiming()) {
      return (this.getTiming()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for PlanDefinition.action.timing[x]")
  }

  private fun Type.planDefinitionActionTimingToProto(): PlanDefinition.Action.TimingX {
    val protoValue = PlanDefinition.Action.TimingX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Age) {
      protoValue.setAge(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    if (this is Duration) {
      protoValue.setDuration(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is Timing) {
      protoValue.setTiming(this.toProto())
    }
    return protoValue.build()
  }

  private fun PlanDefinition.Action.DefinitionX.planDefinitionActionDefinitionToHapi(): Type {
    if (hasCanonical()) {
      return (this.getCanonical()).toHapi()
    }
    if (hasUri()) {
      return (this.getUri()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for PlanDefinition.action.definition[x]")
  }

  private fun Type.planDefinitionActionDefinitionToProto(): PlanDefinition.Action.DefinitionX {
    val protoValue = PlanDefinition.Action.DefinitionX.newBuilder()
    if (this is CanonicalType) {
      protoValue.setCanonical(this.toProto())
    }
    if (this is UriType) {
      protoValue.setUri(this.toProto())
    }
    return protoValue.build()
  }

  public fun PlanDefinition.toHapi(): org.hl7.fhir.r4.model.PlanDefinition {
    val hapiValue = org.hl7.fhir.r4.model.PlanDefinition()
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
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(Enumerations.PublicationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasExperimental()) {
      hapiValue.setExperimentalElement(experimental.toHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.planDefinitionSubjectToHapi())
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
    if (goalCount > 0) {
      hapiValue.setGoal(goalList.map { it.toHapi() })
    }
    if (actionCount > 0) {
      hapiValue.setAction(actionList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.PlanDefinition.toProto(): PlanDefinition {
    val protoValue = PlanDefinition.newBuilder()
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
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(PlanDefinition.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasExperimental()) {
      protoValue.setExperimental(experimentalElement.toProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.planDefinitionSubjectToProto())
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
    if (hasGoal()) {
      protoValue.addAllGoal(goal.map { it.toProto() })
    }
    if (hasAction()) {
      protoValue.addAllAction(action.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionGoalComponent.toProto():
      PlanDefinition.Goal {
    val protoValue = PlanDefinition.Goal.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCategory()) {
      protoValue.setCategory(category.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(description.toProto())
    }
    if (hasPriority()) {
      protoValue.setPriority(priority.toProto())
    }
    if (hasStart()) {
      protoValue.setStart(start.toProto())
    }
    if (hasAddresses()) {
      protoValue.addAllAddresses(addresses.map { it.toProto() })
    }
    if (hasDocumentation()) {
      protoValue.addAllDocumentation(documentation.map { it.toProto() })
    }
    if (hasTarget()) {
      protoValue.addAllTarget(target.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionGoalTargetComponent.toProto():
      PlanDefinition.Goal.Target {
    val protoValue = PlanDefinition.Goal.Target.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasMeasure()) {
      protoValue.setMeasure(measure.toProto())
    }
    if (hasDetail()) {
      protoValue.setDetail(detail.planDefinitionGoalTargetDetailToProto())
    }
    if (hasDue()) {
      protoValue.setDue(due.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionComponent.toProto():
      PlanDefinition.Action {
    val protoValue = PlanDefinition.Action.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasPrefix()) {
      protoValue.setPrefix(prefixElement.toProto())
    }
    if (hasTitle()) {
      protoValue.setTitle(titleElement.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasTextEquivalent()) {
      protoValue.setTextEquivalent(textEquivalentElement.toProto())
    }
    if (hasPriority()) {
      protoValue.setPriority(PlanDefinition.Action.PriorityCode.newBuilder().setValue(RequestPriorityCode.Value.valueOf(priority.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCode()) {
      protoValue.addAllCode(code.map { it.toProto() })
    }
    if (hasReason()) {
      protoValue.addAllReason(reason.map { it.toProto() })
    }
    if (hasDocumentation()) {
      protoValue.addAllDocumentation(documentation.map { it.toProto() })
    }
    if (hasGoalId()) {
      protoValue.addAllGoalId(goalId.map { it.toProto() })
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.planDefinitionActionSubjectToProto())
    }
    if (hasTrigger()) {
      protoValue.addAllTrigger(trigger.map { it.toProto() })
    }
    if (hasCondition()) {
      protoValue.addAllCondition(condition.map { it.toProto() })
    }
    if (hasInput()) {
      protoValue.addAllInput(input.map { it.toProto() })
    }
    if (hasOutput()) {
      protoValue.addAllOutput(output.map { it.toProto() })
    }
    if (hasRelatedAction()) {
      protoValue.addAllRelatedAction(relatedAction.map { it.toProto() })
    }
    if (hasTiming()) {
      protoValue.setTiming(timing.planDefinitionActionTimingToProto())
    }
    if (hasParticipant()) {
      protoValue.addAllParticipant(participant.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasGroupingBehavior()) {
      protoValue.setGroupingBehavior(PlanDefinition.Action.GroupingBehaviorCode.newBuilder().setValue(ActionGroupingBehaviorCode.Value.valueOf(groupingBehavior.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasSelectionBehavior()) {
      protoValue.setSelectionBehavior(PlanDefinition.Action.SelectionBehaviorCode.newBuilder().setValue(ActionSelectionBehaviorCode.Value.valueOf(selectionBehavior.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasRequiredBehavior()) {
      protoValue.setRequiredBehavior(PlanDefinition.Action.RequiredBehaviorCode.newBuilder().setValue(ActionRequiredBehaviorCode.Value.valueOf(requiredBehavior.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPrecheckBehavior()) {
      protoValue.setPrecheckBehavior(PlanDefinition.Action.PrecheckBehaviorCode.newBuilder().setValue(ActionPrecheckBehaviorCode.Value.valueOf(precheckBehavior.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCardinalityBehavior()) {
      protoValue.setCardinalityBehavior(PlanDefinition.Action.CardinalityBehaviorCode.newBuilder().setValue(ActionCardinalityBehaviorCode.Value.valueOf(cardinalityBehavior.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDefinition()) {
      protoValue.setDefinition(definition.planDefinitionActionDefinitionToProto())
    }
    if (hasTransform()) {
      protoValue.setTransform(transformElement.toProto())
    }
    if (hasDynamicValue()) {
      protoValue.addAllDynamicValue(dynamicValue.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionConditionComponent.toProto():
      PlanDefinition.Action.Condition {
    val protoValue = PlanDefinition.Action.Condition.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasKind()) {
      protoValue.setKind(PlanDefinition.Action.Condition.KindCode.newBuilder().setValue(ActionConditionKindCode.Value.valueOf(kind.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasExpression()) {
      protoValue.setExpression(expression.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionRelatedActionComponent.toProto():
      PlanDefinition.Action.RelatedAction {
    val protoValue = PlanDefinition.Action.RelatedAction.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasActionId()) {
      protoValue.setActionId(actionIdElement.toProto())
    }
    if (hasRelationship()) {
      protoValue.setRelationship(PlanDefinition.Action.RelatedAction.RelationshipCode.newBuilder().setValue(ActionRelationshipTypeCode.Value.valueOf(relationship.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasOffset()) {
      protoValue.setOffset(offset.planDefinitionActionRelatedActionOffsetToProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionParticipantComponent.toProto():
      PlanDefinition.Action.Participant {
    val protoValue = PlanDefinition.Action.Participant.newBuilder()
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
      protoValue.setType(PlanDefinition.Action.Participant.TypeCode.newBuilder().setValue(ActionParticipantTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasRole()) {
      protoValue.setRole(role.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionDynamicValueComponent.toProto():
      PlanDefinition.Action.DynamicValue {
    val protoValue = PlanDefinition.Action.DynamicValue.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasPath()) {
      protoValue.setPath(pathElement.toProto())
    }
    if (hasExpression()) {
      protoValue.setExpression(expression.toProto())
    }
    return protoValue.build()
  }

  private fun PlanDefinition.Goal.toHapi():
      org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionGoalComponent {
    val hapiValue = org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionGoalComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCategory()) {
      hapiValue.setCategory(category.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescription(description.toHapi())
    }
    if (hasPriority()) {
      hapiValue.setPriority(priority.toHapi())
    }
    if (hasStart()) {
      hapiValue.setStart(start.toHapi())
    }
    if (addressesCount > 0) {
      hapiValue.setAddresses(addressesList.map { it.toHapi() })
    }
    if (documentationCount > 0) {
      hapiValue.setDocumentation(documentationList.map { it.toHapi() })
    }
    if (targetCount > 0) {
      hapiValue.setTarget(targetList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun PlanDefinition.Goal.Target.toHapi():
      org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionGoalTargetComponent {
    val hapiValue = org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionGoalTargetComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasMeasure()) {
      hapiValue.setMeasure(measure.toHapi())
    }
    if (hasDetail()) {
      hapiValue.setDetail(detail.planDefinitionGoalTargetDetailToHapi())
    }
    if (hasDue()) {
      hapiValue.setDue(due.toHapi())
    }
    return hapiValue
  }

  private fun PlanDefinition.Action.toHapi():
      org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionComponent {
    val hapiValue = org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasPrefix()) {
      hapiValue.setPrefixElement(prefix.toHapi())
    }
    if (hasTitle()) {
      hapiValue.setTitleElement(title.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasTextEquivalent()) {
      hapiValue.setTextEquivalentElement(textEquivalent.toHapi())
    }
    if (hasPriority()) {
      hapiValue.setPriority(org.hl7.fhir.r4.model.PlanDefinition.RequestPriority.valueOf(priority.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (codeCount > 0) {
      hapiValue.setCode(codeList.map { it.toHapi() })
    }
    if (reasonCount > 0) {
      hapiValue.setReason(reasonList.map { it.toHapi() })
    }
    if (documentationCount > 0) {
      hapiValue.setDocumentation(documentationList.map { it.toHapi() })
    }
    if (goalIdCount > 0) {
      hapiValue.setGoalId(goalIdList.map { it.toHapi() })
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.planDefinitionActionSubjectToHapi())
    }
    if (triggerCount > 0) {
      hapiValue.setTrigger(triggerList.map { it.toHapi() })
    }
    if (conditionCount > 0) {
      hapiValue.setCondition(conditionList.map { it.toHapi() })
    }
    if (inputCount > 0) {
      hapiValue.setInput(inputList.map { it.toHapi() })
    }
    if (outputCount > 0) {
      hapiValue.setOutput(outputList.map { it.toHapi() })
    }
    if (relatedActionCount > 0) {
      hapiValue.setRelatedAction(relatedActionList.map { it.toHapi() })
    }
    if (hasTiming()) {
      hapiValue.setTiming(timing.planDefinitionActionTimingToHapi())
    }
    if (participantCount > 0) {
      hapiValue.setParticipant(participantList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasGroupingBehavior()) {
      hapiValue.setGroupingBehavior(org.hl7.fhir.r4.model.PlanDefinition.ActionGroupingBehavior.valueOf(groupingBehavior.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasSelectionBehavior()) {
      hapiValue.setSelectionBehavior(org.hl7.fhir.r4.model.PlanDefinition.ActionSelectionBehavior.valueOf(selectionBehavior.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasRequiredBehavior()) {
      hapiValue.setRequiredBehavior(org.hl7.fhir.r4.model.PlanDefinition.ActionRequiredBehavior.valueOf(requiredBehavior.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPrecheckBehavior()) {
      hapiValue.setPrecheckBehavior(org.hl7.fhir.r4.model.PlanDefinition.ActionPrecheckBehavior.valueOf(precheckBehavior.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCardinalityBehavior()) {
      hapiValue.setCardinalityBehavior(org.hl7.fhir.r4.model.PlanDefinition.ActionCardinalityBehavior.valueOf(cardinalityBehavior.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDefinition()) {
      hapiValue.setDefinition(definition.planDefinitionActionDefinitionToHapi())
    }
    if (hasTransform()) {
      hapiValue.setTransformElement(transform.toHapi())
    }
    if (dynamicValueCount > 0) {
      hapiValue.setDynamicValue(dynamicValueList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun PlanDefinition.Action.Condition.toHapi():
      org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionConditionComponent {
    val hapiValue = org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionConditionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasKind()) {
      hapiValue.setKind(org.hl7.fhir.r4.model.PlanDefinition.ActionConditionKind.valueOf(kind.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasExpression()) {
      hapiValue.setExpression(expression.toHapi())
    }
    return hapiValue
  }

  private fun PlanDefinition.Action.RelatedAction.toHapi():
      org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionRelatedActionComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionRelatedActionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasActionId()) {
      hapiValue.setActionIdElement(actionId.toHapi())
    }
    if (hasRelationship()) {
      hapiValue.setRelationship(org.hl7.fhir.r4.model.PlanDefinition.ActionRelationshipType.valueOf(relationship.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasOffset()) {
      hapiValue.setOffset(offset.planDefinitionActionRelatedActionOffsetToHapi())
    }
    return hapiValue
  }

  private fun PlanDefinition.Action.Participant.toHapi():
      org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionParticipantComponent {
    val hapiValue = org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionParticipantComponent()
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
      hapiValue.setType(org.hl7.fhir.r4.model.PlanDefinition.ActionParticipantType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasRole()) {
      hapiValue.setRole(role.toHapi())
    }
    return hapiValue
  }

  private fun PlanDefinition.Action.DynamicValue.toHapi():
      org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionDynamicValueComponent {
    val hapiValue = org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionDynamicValueComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasPath()) {
      hapiValue.setPathElement(path.toHapi())
    }
    if (hasExpression()) {
      hapiValue.setExpression(expression.toHapi())
    }
    return hapiValue
  }
}
