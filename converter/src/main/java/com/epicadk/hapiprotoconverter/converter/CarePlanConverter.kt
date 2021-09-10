package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.CarePlan
import com.google.fhir.r4.core.CarePlan.Activity
import com.google.fhir.r4.core.CarePlan.Activity.Detail
import com.google.fhir.r4.core.CarePlanActivityKindValueSet
import com.google.fhir.r4.core.CarePlanActivityStatusCode
import com.google.fhir.r4.core.CarePlanIntentValueSet
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.RequestStatusCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Timing
import org.hl7.fhir.r4.model.Type

public object CarePlanConverter {
  private fun CarePlan.Activity.Detail.ScheduledX.carePlanActivityDetailScheduledToHapi(): Type {
    if (hasTiming()) {
      return (this.getTiming()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for CarePlan.activity.detail.scheduled[x]")
  }

  private fun Type.carePlanActivityDetailScheduledToProto(): CarePlan.Activity.Detail.ScheduledX {
    val protoValue = CarePlan.Activity.Detail.ScheduledX.newBuilder()
    if (this is Timing) {
      protoValue.setTiming(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  private fun CarePlan.Activity.Detail.ProductX.carePlanActivityDetailProductToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for CarePlan.activity.detail.product[x]")
  }

  private fun Type.carePlanActivityDetailProductToProto(): CarePlan.Activity.Detail.ProductX {
    val protoValue = CarePlan.Activity.Detail.ProductX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  public fun CarePlan.toHapi(): org.hl7.fhir.r4.model.CarePlan {
    val hapiValue = org.hl7.fhir.r4.model.CarePlan()
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
    if (partOfCount > 0) {
      hapiValue.setPartOf(partOfList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.CarePlan.CarePlanStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasIntent()) {
      hapiValue.setIntent(org.hl7.fhir.r4.model.CarePlan.CarePlanIntent.valueOf(intent.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (categoryCount > 0) {
      hapiValue.setCategory(categoryList.map { it.toHapi() })
    }
    if (hasTitle()) {
      hapiValue.setTitleElement(title.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    if (hasCreated()) {
      hapiValue.setCreatedElement(created.toHapi())
    }
    if (hasAuthor()) {
      hapiValue.setAuthor(author.toHapi())
    }
    if (contributorCount > 0) {
      hapiValue.setContributor(contributorList.map { it.toHapi() })
    }
    if (careTeamCount > 0) {
      hapiValue.setCareTeam(careTeamList.map { it.toHapi() })
    }
    if (addressesCount > 0) {
      hapiValue.setAddresses(addressesList.map { it.toHapi() })
    }
    if (supportingInfoCount > 0) {
      hapiValue.setSupportingInfo(supportingInfoList.map { it.toHapi() })
    }
    if (goalCount > 0) {
      hapiValue.setGoal(goalList.map { it.toHapi() })
    }
    if (activityCount > 0) {
      hapiValue.setActivity(activityList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.CarePlan.toProto(): CarePlan {
    val protoValue = CarePlan.newBuilder()
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
    if (hasPartOf()) {
      protoValue.addAllPartOf(partOf.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(CarePlan.StatusCode.newBuilder().setValue(RequestStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasIntent()) {
      protoValue.setIntent(CarePlan.IntentCode.newBuilder().setValue(CarePlanIntentValueSet.Value.valueOf(intent.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCategory()) {
      protoValue.addAllCategory(category.map { it.toProto() })
    }
    if (hasTitle()) {
      protoValue.setTitle(titleElement.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    if (hasCreated()) {
      protoValue.setCreated(createdElement.toProto())
    }
    if (hasAuthor()) {
      protoValue.setAuthor(author.toProto())
    }
    if (hasContributor()) {
      protoValue.addAllContributor(contributor.map { it.toProto() })
    }
    if (hasCareTeam()) {
      protoValue.addAllCareTeam(careTeam.map { it.toProto() })
    }
    if (hasAddresses()) {
      protoValue.addAllAddresses(addresses.map { it.toProto() })
    }
    if (hasSupportingInfo()) {
      protoValue.addAllSupportingInfo(supportingInfo.map { it.toProto() })
    }
    if (hasGoal()) {
      protoValue.addAllGoal(goal.map { it.toProto() })
    }
    if (hasActivity()) {
      protoValue.addAllActivity(activity.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.CarePlan.CarePlanActivityComponent.toProto():
      CarePlan.Activity {
    val protoValue = CarePlan.Activity.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasOutcomeCodeableConcept()) {
      protoValue.addAllOutcomeCodeableConcept(outcomeCodeableConcept.map { it.toProto() })
    }
    if (hasOutcomeReference()) {
      protoValue.addAllOutcomeReference(outcomeReference.map { it.toProto() })
    }
    if (hasProgress()) {
      protoValue.addAllProgress(progress.map { it.toProto() })
    }
    if (hasReference()) {
      protoValue.setReference(reference.toProto())
    }
    if (hasDetail()) {
      protoValue.setDetail(detail.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.CarePlan.CarePlanActivityDetailComponent.toProto():
      CarePlan.Activity.Detail {
    val protoValue = CarePlan.Activity.Detail.newBuilder()
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
      protoValue.setKind(CarePlan.Activity.Detail.KindCode.newBuilder().setValue(CarePlanActivityKindValueSet.Value.valueOf(kind.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasInstantiatesCanonical()) {
      protoValue.addAllInstantiatesCanonical(instantiatesCanonical.map { it.toProto() })
    }
    if (hasInstantiatesUri()) {
      protoValue.addAllInstantiatesUri(instantiatesUri.map { it.toProto() })
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasReasonCode()) {
      protoValue.addAllReasonCode(reasonCode.map { it.toProto() })
    }
    if (hasReasonReference()) {
      protoValue.addAllReasonReference(reasonReference.map { it.toProto() })
    }
    if (hasGoal()) {
      protoValue.addAllGoal(goal.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(CarePlan.Activity.Detail.StatusCode.newBuilder().setValue(CarePlanActivityStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasStatusReason()) {
      protoValue.setStatusReason(statusReason.toProto())
    }
    if (hasDoNotPerform()) {
      protoValue.setDoNotPerform(doNotPerformElement.toProto())
    }
    if (hasScheduled()) {
      protoValue.setScheduled(scheduled.carePlanActivityDetailScheduledToProto())
    }
    if (hasLocation()) {
      protoValue.setLocation(location.toProto())
    }
    if (hasPerformer()) {
      protoValue.addAllPerformer(performer.map { it.toProto() })
    }
    if (hasProduct()) {
      protoValue.setProduct(product.carePlanActivityDetailProductToProto())
    }
    if (hasDailyAmount()) {
      protoValue.setDailyAmount((dailyAmount as SimpleQuantity).toProto())
    }
    if (hasQuantity()) {
      protoValue.setQuantity((quantity as SimpleQuantity).toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    return protoValue.build()
  }

  private fun CarePlan.Activity.toHapi(): org.hl7.fhir.r4.model.CarePlan.CarePlanActivityComponent {
    val hapiValue = org.hl7.fhir.r4.model.CarePlan.CarePlanActivityComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (outcomeCodeableConceptCount > 0) {
      hapiValue.setOutcomeCodeableConcept(outcomeCodeableConceptList.map { it.toHapi() })
    }
    if (outcomeReferenceCount > 0) {
      hapiValue.setOutcomeReference(outcomeReferenceList.map { it.toHapi() })
    }
    if (progressCount > 0) {
      hapiValue.setProgress(progressList.map { it.toHapi() })
    }
    if (hasReference()) {
      hapiValue.setReference(reference.toHapi())
    }
    if (hasDetail()) {
      hapiValue.setDetail(detail.toHapi())
    }
    return hapiValue
  }

  private fun CarePlan.Activity.Detail.toHapi():
      org.hl7.fhir.r4.model.CarePlan.CarePlanActivityDetailComponent {
    val hapiValue = org.hl7.fhir.r4.model.CarePlan.CarePlanActivityDetailComponent()
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
      hapiValue.setKind(org.hl7.fhir.r4.model.CarePlan.CarePlanActivityKind.valueOf(kind.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (instantiatesCanonicalCount > 0) {
      hapiValue.setInstantiatesCanonical(instantiatesCanonicalList.map { it.toHapi() })
    }
    if (instantiatesUriCount > 0) {
      hapiValue.setInstantiatesUri(instantiatesUriList.map { it.toHapi() })
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (reasonCodeCount > 0) {
      hapiValue.setReasonCode(reasonCodeList.map { it.toHapi() })
    }
    if (reasonReferenceCount > 0) {
      hapiValue.setReasonReference(reasonReferenceList.map { it.toHapi() })
    }
    if (goalCount > 0) {
      hapiValue.setGoal(goalList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.CarePlan.CarePlanActivityStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasStatusReason()) {
      hapiValue.setStatusReason(statusReason.toHapi())
    }
    if (hasDoNotPerform()) {
      hapiValue.setDoNotPerformElement(doNotPerform.toHapi())
    }
    if (hasScheduled()) {
      hapiValue.setScheduled(scheduled.carePlanActivityDetailScheduledToHapi())
    }
    if (hasLocation()) {
      hapiValue.setLocation(location.toHapi())
    }
    if (performerCount > 0) {
      hapiValue.setPerformer(performerList.map { it.toHapi() })
    }
    if (hasProduct()) {
      hapiValue.setProduct(product.carePlanActivityDetailProductToHapi())
    }
    if (hasDailyAmount()) {
      hapiValue.setDailyAmount(dailyAmount.toHapi())
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    return hapiValue
  }
}
