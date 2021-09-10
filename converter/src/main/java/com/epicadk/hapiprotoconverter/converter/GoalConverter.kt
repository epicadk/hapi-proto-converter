package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Goal
import com.google.fhir.r4.core.Goal.Target
import com.google.fhir.r4.core.GoalLifecycleStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.DateType
import org.hl7.fhir.r4.model.Duration
import org.hl7.fhir.r4.model.IntegerType
import org.hl7.fhir.r4.model.Quantity
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.Ratio
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object GoalConverter {
  private fun Goal.StartX.goalStartToHapi(): Type {
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Goal.start[x]")
  }

  private fun Type.goalStartToProto(): Goal.StartX {
    val protoValue = Goal.StartX.newBuilder()
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    return protoValue.build()
  }

  private fun Goal.Target.DetailX.goalTargetDetailToHapi(): Type {
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasInteger()) {
      return (this.getInteger()).toHapi()
    }
    if (hasRatio()) {
      return (this.getRatio()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Goal.target.detail[x]")
  }

  private fun Type.goalTargetDetailToProto(): Goal.Target.DetailX {
    val protoValue = Goal.Target.DetailX.newBuilder()
    if (this is Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is IntegerType) {
      protoValue.setInteger(this.toProto())
    }
    if (this is Ratio) {
      protoValue.setRatio(this.toProto())
    }
    return protoValue.build()
  }

  private fun Goal.Target.DueX.goalTargetDueToHapi(): Type {
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasDuration()) {
      return (this.getDuration()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Goal.target.due[x]")
  }

  private fun Type.goalTargetDueToProto(): Goal.Target.DueX {
    val protoValue = Goal.Target.DueX.newBuilder()
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is Duration) {
      protoValue.setDuration(this.toProto())
    }
    return protoValue.build()
  }

  public fun Goal.toHapi(): org.hl7.fhir.r4.model.Goal {
    val hapiValue = org.hl7.fhir.r4.model.Goal()
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
    if (hasLifecycleStatus()) {
      hapiValue.setLifecycleStatus(org.hl7.fhir.r4.model.Goal.GoalLifecycleStatus.valueOf(lifecycleStatus.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasAchievementStatus()) {
      hapiValue.setAchievementStatus(achievementStatus.toHapi())
    }
    if (categoryCount > 0) {
      hapiValue.setCategory(categoryList.map { it.toHapi() })
    }
    if (hasPriority()) {
      hapiValue.setPriority(priority.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescription(description.toHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasStart()) {
      hapiValue.setStart(start.goalStartToHapi())
    }
    if (targetCount > 0) {
      hapiValue.setTarget(targetList.map { it.toHapi() })
    }
    if (hasStatusDate()) {
      hapiValue.setStatusDateElement(statusDate.toHapi())
    }
    if (hasStatusReason()) {
      hapiValue.setStatusReasonElement(statusReason.toHapi())
    }
    if (hasExpressedBy()) {
      hapiValue.setExpressedBy(expressedBy.toHapi())
    }
    if (addressesCount > 0) {
      hapiValue.setAddresses(addressesList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (outcomeCodeCount > 0) {
      hapiValue.setOutcomeCode(outcomeCodeList.map { it.toHapi() })
    }
    if (outcomeReferenceCount > 0) {
      hapiValue.setOutcomeReference(outcomeReferenceList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Goal.toProto(): Goal {
    val protoValue = Goal.newBuilder()
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
    if (hasLifecycleStatus()) {
      protoValue.setLifecycleStatus(Goal.LifecycleStatusCode.newBuilder().setValue(GoalLifecycleStatusCode.Value.valueOf(lifecycleStatus.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasAchievementStatus()) {
      protoValue.setAchievementStatus(achievementStatus.toProto())
    }
    if (hasCategory()) {
      protoValue.addAllCategory(category.map { it.toProto() })
    }
    if (hasPriority()) {
      protoValue.setPriority(priority.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(description.toProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasStart()) {
      protoValue.setStart(start.goalStartToProto())
    }
    if (hasTarget()) {
      protoValue.addAllTarget(target.map { it.toProto() })
    }
    if (hasStatusDate()) {
      protoValue.setStatusDate(statusDateElement.toProto())
    }
    if (hasStatusReason()) {
      protoValue.setStatusReason(statusReasonElement.toProto())
    }
    if (hasExpressedBy()) {
      protoValue.setExpressedBy(expressedBy.toProto())
    }
    if (hasAddresses()) {
      protoValue.addAllAddresses(addresses.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasOutcomeCode()) {
      protoValue.addAllOutcomeCode(outcomeCode.map { it.toProto() })
    }
    if (hasOutcomeReference()) {
      protoValue.addAllOutcomeReference(outcomeReference.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Goal.GoalTargetComponent.toProto(): Goal.Target {
    val protoValue = Goal.Target.newBuilder()
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
      protoValue.setDetail(detail.goalTargetDetailToProto())
    }
    if (hasDue()) {
      protoValue.setDue(due.goalTargetDueToProto())
    }
    return protoValue.build()
  }

  private fun Goal.Target.toHapi(): org.hl7.fhir.r4.model.Goal.GoalTargetComponent {
    val hapiValue = org.hl7.fhir.r4.model.Goal.GoalTargetComponent()
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
      hapiValue.setDetail(detail.goalTargetDetailToHapi())
    }
    if (hasDue()) {
      hapiValue.setDue(due.goalTargetDueToHapi())
    }
    return hapiValue
  }
}
