package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AgeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AgeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.AllergyIntolerance
import com.google.fhir.r4.core.AllergyIntolerance.Reaction
import com.google.fhir.r4.core.AllergyIntoleranceCategoryCode
import com.google.fhir.r4.core.AllergyIntoleranceCriticalityCode
import com.google.fhir.r4.core.AllergyIntoleranceSeverityCode
import com.google.fhir.r4.core.AllergyIntoleranceTypeCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Age
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object AllergyIntoleranceConverter {
  private fun AllergyIntolerance.OnsetX.allergyIntoleranceOnsetToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasAge()) {
      return (this.getAge()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for AllergyIntolerance.onset[x]")
  }

  private fun Type.allergyIntoleranceOnsetToProto(): AllergyIntolerance.OnsetX {
    val protoValue = AllergyIntolerance.OnsetX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Age) {
      protoValue.setAge(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  public fun AllergyIntolerance.toHapi(): org.hl7.fhir.r4.model.AllergyIntolerance {
    val hapiValue = org.hl7.fhir.r4.model.AllergyIntolerance()
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
    if (hasClinicalStatus()) {
      hapiValue.setClinicalStatus(clinicalStatus.toHapi())
    }
    if (hasVerificationStatus()) {
      hapiValue.setVerificationStatus(verificationStatus.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (categoryCount > 0) {
      categoryList.forEach { hapiValue.addCategory(org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceCategory.valueOf(it.value.name.hapiCodeCheck().replace("_", ""))) }
    }
    if (hasCriticality()) {
      hapiValue.setCriticality(org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceCriticality.valueOf(criticality.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasPatient()) {
      hapiValue.setPatient(patient.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasOnset()) {
      hapiValue.setOnset(onset.allergyIntoleranceOnsetToHapi())
    }
    if (hasRecordedDate()) {
      hapiValue.setRecordedDateElement(recordedDate.toHapi())
    }
    if (hasRecorder()) {
      hapiValue.setRecorder(recorder.toHapi())
    }
    if (hasAsserter()) {
      hapiValue.setAsserter(asserter.toHapi())
    }
    if (hasLastOccurrence()) {
      hapiValue.setLastOccurrenceElement(lastOccurrence.toHapi())
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (reactionCount > 0) {
      hapiValue.setReaction(reactionList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.AllergyIntolerance.toProto(): AllergyIntolerance {
    val protoValue = AllergyIntolerance.newBuilder()
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
    if (hasClinicalStatus()) {
      protoValue.setClinicalStatus(clinicalStatus.toProto())
    }
    if (hasVerificationStatus()) {
      protoValue.setVerificationStatus(verificationStatus.toProto())
    }
    if (hasType()) {
      protoValue.setType(AllergyIntolerance.TypeCode.newBuilder().setValue(AllergyIntoleranceTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCategory()) {
      protoValue.addAllCategory(category.map { AllergyIntolerance.CategoryCode.newBuilder().setValue(AllergyIntoleranceCategoryCode.Value.valueOf(it.value.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build() })
    }
    if (hasCriticality()) {
      protoValue.setCriticality(AllergyIntolerance.CriticalityCode.newBuilder().setValue(AllergyIntoleranceCriticalityCode.Value.valueOf(criticality.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasPatient()) {
      protoValue.setPatient(patient.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasOnset()) {
      protoValue.setOnset(onset.allergyIntoleranceOnsetToProto())
    }
    if (hasRecordedDate()) {
      protoValue.setRecordedDate(recordedDateElement.toProto())
    }
    if (hasRecorder()) {
      protoValue.setRecorder(recorder.toProto())
    }
    if (hasAsserter()) {
      protoValue.setAsserter(asserter.toProto())
    }
    if (hasLastOccurrence()) {
      protoValue.setLastOccurrence(lastOccurrenceElement.toProto())
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasReaction()) {
      protoValue.addAllReaction(reaction.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceReactionComponent.toProto():
      AllergyIntolerance.Reaction {
    val protoValue = AllergyIntolerance.Reaction.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSubstance()) {
      protoValue.setSubstance(substance.toProto())
    }
    if (hasManifestation()) {
      protoValue.addAllManifestation(manifestation.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasOnset()) {
      protoValue.setOnset(onsetElement.toProto())
    }
    if (hasSeverity()) {
      protoValue.setSeverity(AllergyIntolerance.Reaction.SeverityCode.newBuilder().setValue(AllergyIntoleranceSeverityCode.Value.valueOf(severity.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasExposureRoute()) {
      protoValue.setExposureRoute(exposureRoute.toProto())
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun AllergyIntolerance.Reaction.toHapi():
      org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceReactionComponent {
    val hapiValue = org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceReactionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasSubstance()) {
      hapiValue.setSubstance(substance.toHapi())
    }
    if (manifestationCount > 0) {
      hapiValue.setManifestation(manifestationList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasOnset()) {
      hapiValue.setOnsetElement(onset.toHapi())
    }
    if (hasSeverity()) {
      hapiValue.setSeverity(org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceSeverity.valueOf(severity.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasExposureRoute()) {
      hapiValue.setExposureRoute(exposureRoute.toHapi())
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    return hapiValue
  }
}
