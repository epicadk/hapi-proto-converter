package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PopulationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PopulationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.MedicinalProductUndesirableEffect

public object MedicinalProductUndesirableEffectConverter {
  public fun MedicinalProductUndesirableEffect.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductUndesirableEffect {
    val hapiValue = org.hl7.fhir.r4.model.MedicinalProductUndesirableEffect()
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
    if (subjectCount > 0) {
      hapiValue.setSubject(subjectList.map { it.toHapi() })
    }
    if (hasSymptomConditionEffect()) {
      hapiValue.setSymptomConditionEffect(symptomConditionEffect.toHapi())
    }
    if (hasClassification()) {
      hapiValue.setClassification(classification.toHapi())
    }
    if (hasFrequencyOfOccurrence()) {
      hapiValue.setFrequencyOfOccurrence(frequencyOfOccurrence.toHapi())
    }
    if (populationCount > 0) {
      hapiValue.setPopulation(populationList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MedicinalProductUndesirableEffect.toProto():
      MedicinalProductUndesirableEffect {
    val protoValue = MedicinalProductUndesirableEffect.newBuilder()
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
    if (hasSubject()) {
      protoValue.addAllSubject(subject.map { it.toProto() })
    }
    if (hasSymptomConditionEffect()) {
      protoValue.setSymptomConditionEffect(symptomConditionEffect.toProto())
    }
    if (hasClassification()) {
      protoValue.setClassification(classification.toProto())
    }
    if (hasFrequencyOfOccurrence()) {
      protoValue.setFrequencyOfOccurrence(frequencyOfOccurrence.toProto())
    }
    if (hasPopulation()) {
      protoValue.addAllPopulation(population.map { it.toProto() })
    }
    return protoValue.build()
  }
}
