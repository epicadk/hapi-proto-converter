package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AgeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AgeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.FamilyHistoryStatusCode
import com.google.fhir.r4.core.FamilyMemberHistory
import com.google.fhir.r4.core.FamilyMemberHistory.Condition
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Age
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.DateType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object FamilyMemberHistoryConverter {
  private fun FamilyMemberHistory.BornX.familyMemberHistoryBornToHapi(): Type {
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for FamilyMemberHistory.born[x]")
  }

  private fun Type.familyMemberHistoryBornToProto(): FamilyMemberHistory.BornX {
    val protoValue = FamilyMemberHistory.BornX.newBuilder()
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  private fun FamilyMemberHistory.AgeX.familyMemberHistoryAgeToHapi(): Type {
    if (hasAge()) {
      return (this.getAge()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for FamilyMemberHistory.age[x]")
  }

  private fun Type.familyMemberHistoryAgeToProto(): FamilyMemberHistory.AgeX {
    val protoValue = FamilyMemberHistory.AgeX.newBuilder()
    if (this is Age) {
      protoValue.setAge(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  private fun FamilyMemberHistory.DeceasedX.familyMemberHistoryDeceasedToHapi(): Type {
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasAge()) {
      return (this.getAge()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for FamilyMemberHistory.deceased[x]")
  }

  private fun Type.familyMemberHistoryDeceasedToProto(): FamilyMemberHistory.DeceasedX {
    val protoValue = FamilyMemberHistory.DeceasedX.newBuilder()
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is Age) {
      protoValue.setAge(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  private fun FamilyMemberHistory.Condition.OnsetX.familyMemberHistoryConditionOnsetToHapi(): Type {
    if (hasAge()) {
      return (this.getAge()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for FamilyMemberHistory.condition.onset[x]")
  }

  private fun Type.familyMemberHistoryConditionOnsetToProto():
      FamilyMemberHistory.Condition.OnsetX {
    val protoValue = FamilyMemberHistory.Condition.OnsetX.newBuilder()
    if (this is Age) {
      protoValue.setAge(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  public fun FamilyMemberHistory.toHapi(): org.hl7.fhir.r4.model.FamilyMemberHistory {
    val hapiValue = org.hl7.fhir.r4.model.FamilyMemberHistory()
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
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.FamilyMemberHistory.FamilyHistoryStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDataAbsentReason()) {
      hapiValue.setDataAbsentReason(dataAbsentReason.toHapi())
    }
    if (hasPatient()) {
      hapiValue.setPatient(patient.toHapi())
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasRelationship()) {
      hapiValue.setRelationship(relationship.toHapi())
    }
    if (hasSex()) {
      hapiValue.setSex(sex.toHapi())
    }
    if (hasBorn()) {
      hapiValue.setBorn(born.familyMemberHistoryBornToHapi())
    }
    if (hasAge()) {
      hapiValue.setAge(age.familyMemberHistoryAgeToHapi())
    }
    if (hasEstimatedAge()) {
      hapiValue.setEstimatedAgeElement(estimatedAge.toHapi())
    }
    if (hasDeceased()) {
      hapiValue.setDeceased(deceased.familyMemberHistoryDeceasedToHapi())
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
    if (conditionCount > 0) {
      hapiValue.setCondition(conditionList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.FamilyMemberHistory.toProto(): FamilyMemberHistory {
    val protoValue = FamilyMemberHistory.newBuilder()
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
    if (hasStatus()) {
      protoValue.setStatus(FamilyMemberHistory.StatusCode.newBuilder().setValue(FamilyHistoryStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDataAbsentReason()) {
      protoValue.setDataAbsentReason(dataAbsentReason.toProto())
    }
    if (hasPatient()) {
      protoValue.setPatient(patient.toProto())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasRelationship()) {
      protoValue.setRelationship(relationship.toProto())
    }
    if (hasSex()) {
      protoValue.setSex(sex.toProto())
    }
    if (hasBorn()) {
      protoValue.setBorn(born.familyMemberHistoryBornToProto())
    }
    if (hasAge()) {
      protoValue.setAge(age.familyMemberHistoryAgeToProto())
    }
    if (hasEstimatedAge()) {
      protoValue.setEstimatedAge(estimatedAgeElement.toProto())
    }
    if (hasDeceased()) {
      protoValue.setDeceased(deceased.familyMemberHistoryDeceasedToProto())
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
    if (hasCondition()) {
      protoValue.addAllCondition(condition.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent.toProto():
      FamilyMemberHistory.Condition {
    val protoValue = FamilyMemberHistory.Condition.newBuilder()
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
    if (hasOutcome()) {
      protoValue.setOutcome(outcome.toProto())
    }
    if (hasContributedToDeath()) {
      protoValue.setContributedToDeath(contributedToDeathElement.toProto())
    }
    if (hasOnset()) {
      protoValue.setOnset(onset.familyMemberHistoryConditionOnsetToProto())
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun FamilyMemberHistory.Condition.toHapi():
      org.hl7.fhir.r4.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent()
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
    if (hasOutcome()) {
      hapiValue.setOutcome(outcome.toHapi())
    }
    if (hasContributedToDeath()) {
      hapiValue.setContributedToDeathElement(contributedToDeath.toHapi())
    }
    if (hasOnset()) {
      hapiValue.setOnset(onset.familyMemberHistoryConditionOnsetToHapi())
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    return hapiValue
  }
}
