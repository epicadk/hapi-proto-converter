package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AgeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AgeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.ActionCardinalityBehaviorCode
import com.google.fhir.r4.core.ActionConditionKindCode
import com.google.fhir.r4.core.ActionGroupingBehaviorCode
import com.google.fhir.r4.core.ActionPrecheckBehaviorCode
import com.google.fhir.r4.core.ActionRelationshipTypeCode
import com.google.fhir.r4.core.ActionRequiredBehaviorCode
import com.google.fhir.r4.core.ActionSelectionBehaviorCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.RequestGroup
import com.google.fhir.r4.core.RequestGroup.Action
import com.google.fhir.r4.core.RequestGroup.Action.Condition
import com.google.fhir.r4.core.RequestGroup.Action.RelatedAction
import com.google.fhir.r4.core.RequestIntentCode
import com.google.fhir.r4.core.RequestPriorityCode
import com.google.fhir.r4.core.RequestStatusCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Age
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Duration
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.Timing
import org.hl7.fhir.r4.model.Type

public object RequestGroupConverter {
  private
      fun RequestGroup.Action.RelatedAction.OffsetX.requestGroupActionRelatedActionOffsetToHapi():
      Type {
    if (hasDuration()) {
      return (this.getDuration()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for RequestGroup.action.relatedAction.offset[x]")
  }

  private fun Type.requestGroupActionRelatedActionOffsetToProto():
      RequestGroup.Action.RelatedAction.OffsetX {
    val protoValue = RequestGroup.Action.RelatedAction.OffsetX.newBuilder()
    if (this is Duration) {
      protoValue.setDuration(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    return protoValue.build()
  }

  private fun RequestGroup.Action.TimingX.requestGroupActionTimingToHapi(): Type {
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
    throw IllegalArgumentException("Invalid Type for RequestGroup.action.timing[x]")
  }

  private fun Type.requestGroupActionTimingToProto(): RequestGroup.Action.TimingX {
    val protoValue = RequestGroup.Action.TimingX.newBuilder()
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

  public fun RequestGroup.toHapi(): org.hl7.fhir.r4.model.RequestGroup {
    val hapiValue = org.hl7.fhir.r4.model.RequestGroup()
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
    if (instantiatesCanonicalCount > 0) {
      hapiValue.setInstantiatesCanonical(instantiatesCanonicalList.map { it.toHapi() })
    }
    if (instantiatesUriCount > 0) {
      hapiValue.setInstantiatesUri(instantiatesUriList.map { it.toHapi() })
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.RequestGroup.RequestStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasIntent()) {
      hapiValue.setIntent(org.hl7.fhir.r4.model.RequestGroup.RequestIntent.valueOf(intent.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPriority()) {
      hapiValue.setPriority(org.hl7.fhir.r4.model.RequestGroup.RequestPriority.valueOf(priority.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasAuthoredOn()) {
      hapiValue.setAuthoredOnElement(authoredOn.toHapi())
    }
    if (hasAuthor()) {
      hapiValue.setAuthor(author.toHapi())
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
    if (actionCount > 0) {
      hapiValue.setAction(actionList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.RequestGroup.toProto(): RequestGroup {
    val protoValue = RequestGroup.newBuilder()
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
    if (hasInstantiatesCanonical()) {
      protoValue.addAllInstantiatesCanonical(instantiatesCanonical.map { it.toProto() })
    }
    if (hasInstantiatesUri()) {
      protoValue.addAllInstantiatesUri(instantiatesUri.map { it.toProto() })
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
      protoValue.setStatus(RequestGroup.StatusCode.newBuilder().setValue(RequestStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasIntent()) {
      protoValue.setIntent(RequestGroup.IntentCode.newBuilder().setValue(RequestIntentCode.Value.valueOf(intent.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPriority()) {
      protoValue.setPriority(RequestGroup.PriorityCode.newBuilder().setValue(RequestPriorityCode.Value.valueOf(priority.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasAuthoredOn()) {
      protoValue.setAuthoredOn(authoredOnElement.toProto())
    }
    if (hasAuthor()) {
      protoValue.setAuthor(author.toProto())
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
    if (hasAction()) {
      protoValue.addAllAction(action.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionComponent.toProto():
      RequestGroup.Action {
    val protoValue = RequestGroup.Action.newBuilder()
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
      protoValue.setPriority(RequestGroup.Action.PriorityCode.newBuilder().setValue(RequestPriorityCode.Value.valueOf(priority.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCode()) {
      protoValue.addAllCode(code.map { it.toProto() })
    }
    if (hasDocumentation()) {
      protoValue.addAllDocumentation(documentation.map { it.toProto() })
    }
    if (hasCondition()) {
      protoValue.addAllCondition(condition.map { it.toProto() })
    }
    if (hasRelatedAction()) {
      protoValue.addAllRelatedAction(relatedAction.map { it.toProto() })
    }
    if (hasTiming()) {
      protoValue.setTiming(timing.requestGroupActionTimingToProto())
    }
    if (hasParticipant()) {
      protoValue.addAllParticipant(participant.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasGroupingBehavior()) {
      protoValue.setGroupingBehavior(RequestGroup.Action.GroupingBehaviorCode.newBuilder().setValue(ActionGroupingBehaviorCode.Value.valueOf(groupingBehavior.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasSelectionBehavior()) {
      protoValue.setSelectionBehavior(RequestGroup.Action.SelectionBehaviorCode.newBuilder().setValue(ActionSelectionBehaviorCode.Value.valueOf(selectionBehavior.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasRequiredBehavior()) {
      protoValue.setRequiredBehavior(RequestGroup.Action.RequiredBehaviorCode.newBuilder().setValue(ActionRequiredBehaviorCode.Value.valueOf(requiredBehavior.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPrecheckBehavior()) {
      protoValue.setPrecheckBehavior(RequestGroup.Action.PrecheckBehaviorCode.newBuilder().setValue(ActionPrecheckBehaviorCode.Value.valueOf(precheckBehavior.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCardinalityBehavior()) {
      protoValue.setCardinalityBehavior(RequestGroup.Action.CardinalityBehaviorCode.newBuilder().setValue(ActionCardinalityBehaviorCode.Value.valueOf(cardinalityBehavior.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasResource()) {
      protoValue.setResource(resource.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionConditionComponent.toProto():
      RequestGroup.Action.Condition {
    val protoValue = RequestGroup.Action.Condition.newBuilder()
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
      protoValue.setKind(RequestGroup.Action.Condition.KindCode.newBuilder().setValue(ActionConditionKindCode.Value.valueOf(kind.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasExpression()) {
      protoValue.setExpression(expression.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionRelatedActionComponent.toProto():
      RequestGroup.Action.RelatedAction {
    val protoValue = RequestGroup.Action.RelatedAction.newBuilder()
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
      protoValue.setRelationship(RequestGroup.Action.RelatedAction.RelationshipCode.newBuilder().setValue(ActionRelationshipTypeCode.Value.valueOf(relationship.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasOffset()) {
      protoValue.setOffset(offset.requestGroupActionRelatedActionOffsetToProto())
    }
    return protoValue.build()
  }

  private fun RequestGroup.Action.toHapi():
      org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionComponent {
    val hapiValue = org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionComponent()
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
      hapiValue.setPriority(org.hl7.fhir.r4.model.RequestGroup.RequestPriority.valueOf(priority.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (codeCount > 0) {
      hapiValue.setCode(codeList.map { it.toHapi() })
    }
    if (documentationCount > 0) {
      hapiValue.setDocumentation(documentationList.map { it.toHapi() })
    }
    if (conditionCount > 0) {
      hapiValue.setCondition(conditionList.map { it.toHapi() })
    }
    if (relatedActionCount > 0) {
      hapiValue.setRelatedAction(relatedActionList.map { it.toHapi() })
    }
    if (hasTiming()) {
      hapiValue.setTiming(timing.requestGroupActionTimingToHapi())
    }
    if (participantCount > 0) {
      hapiValue.setParticipant(participantList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasGroupingBehavior()) {
      hapiValue.setGroupingBehavior(org.hl7.fhir.r4.model.RequestGroup.ActionGroupingBehavior.valueOf(groupingBehavior.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasSelectionBehavior()) {
      hapiValue.setSelectionBehavior(org.hl7.fhir.r4.model.RequestGroup.ActionSelectionBehavior.valueOf(selectionBehavior.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasRequiredBehavior()) {
      hapiValue.setRequiredBehavior(org.hl7.fhir.r4.model.RequestGroup.ActionRequiredBehavior.valueOf(requiredBehavior.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPrecheckBehavior()) {
      hapiValue.setPrecheckBehavior(org.hl7.fhir.r4.model.RequestGroup.ActionPrecheckBehavior.valueOf(precheckBehavior.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCardinalityBehavior()) {
      hapiValue.setCardinalityBehavior(org.hl7.fhir.r4.model.RequestGroup.ActionCardinalityBehavior.valueOf(cardinalityBehavior.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasResource()) {
      hapiValue.setResource(resource.toHapi())
    }
    return hapiValue
  }

  private fun RequestGroup.Action.Condition.toHapi():
      org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionConditionComponent {
    val hapiValue = org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionConditionComponent()
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
      hapiValue.setKind(org.hl7.fhir.r4.model.RequestGroup.ActionConditionKind.valueOf(kind.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasExpression()) {
      hapiValue.setExpression(expression.toHapi())
    }
    return hapiValue
  }

  private fun RequestGroup.Action.RelatedAction.toHapi():
      org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionRelatedActionComponent {
    val hapiValue = org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionRelatedActionComponent()
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
      hapiValue.setRelationship(org.hl7.fhir.r4.model.RequestGroup.ActionRelationshipType.valueOf(relationship.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasOffset()) {
      hapiValue.setOffset(offset.requestGroupActionRelatedActionOffsetToHapi())
    }
    return hapiValue
  }
}
