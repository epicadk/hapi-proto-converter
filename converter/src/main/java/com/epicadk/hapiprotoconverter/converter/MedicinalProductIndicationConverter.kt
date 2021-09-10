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
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.MedicinalProductIndication
import com.google.fhir.r4.core.MedicinalProductIndication.OtherTherapy
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.Type

public object MedicinalProductIndicationConverter {
  private
      fun MedicinalProductIndication.OtherTherapy.MedicationX.medicinalProductIndicationOtherTherapyMedicationToHapi():
      Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for MedicinalProductIndication.otherTherapy.medication[x]")
  }

  private fun Type.medicinalProductIndicationOtherTherapyMedicationToProto():
      MedicinalProductIndication.OtherTherapy.MedicationX {
    val protoValue = MedicinalProductIndication.OtherTherapy.MedicationX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  public fun MedicinalProductIndication.toHapi(): org.hl7.fhir.r4.model.MedicinalProductIndication {
    val hapiValue = org.hl7.fhir.r4.model.MedicinalProductIndication()
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
    if (hasDiseaseSymptomProcedure()) {
      hapiValue.setDiseaseSymptomProcedure(diseaseSymptomProcedure.toHapi())
    }
    if (hasDiseaseStatus()) {
      hapiValue.setDiseaseStatus(diseaseStatus.toHapi())
    }
    if (comorbidityCount > 0) {
      hapiValue.setComorbidity(comorbidityList.map { it.toHapi() })
    }
    if (hasIntendedEffect()) {
      hapiValue.setIntendedEffect(intendedEffect.toHapi())
    }
    if (hasDuration()) {
      hapiValue.setDuration(duration.toHapi())
    }
    if (otherTherapyCount > 0) {
      hapiValue.setOtherTherapy(otherTherapyList.map { it.toHapi() })
    }
    if (undesirableEffectCount > 0) {
      hapiValue.setUndesirableEffect(undesirableEffectList.map { it.toHapi() })
    }
    if (populationCount > 0) {
      hapiValue.setPopulation(populationList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MedicinalProductIndication.toProto():
      MedicinalProductIndication {
    val protoValue = MedicinalProductIndication.newBuilder()
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
    if (hasDiseaseSymptomProcedure()) {
      protoValue.setDiseaseSymptomProcedure(diseaseSymptomProcedure.toProto())
    }
    if (hasDiseaseStatus()) {
      protoValue.setDiseaseStatus(diseaseStatus.toProto())
    }
    if (hasComorbidity()) {
      protoValue.addAllComorbidity(comorbidity.map { it.toProto() })
    }
    if (hasIntendedEffect()) {
      protoValue.setIntendedEffect(intendedEffect.toProto())
    }
    if (hasDuration()) {
      protoValue.setDuration(duration.toProto())
    }
    if (hasOtherTherapy()) {
      protoValue.addAllOtherTherapy(otherTherapy.map { it.toProto() })
    }
    if (hasUndesirableEffect()) {
      protoValue.addAllUndesirableEffect(undesirableEffect.map { it.toProto() })
    }
    if (hasPopulation()) {
      protoValue.addAllPopulation(population.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProductIndication.MedicinalProductIndicationOtherTherapyComponent.toProto():
      MedicinalProductIndication.OtherTherapy {
    val protoValue = MedicinalProductIndication.OtherTherapy.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasTherapyRelationshipType()) {
      protoValue.setTherapyRelationshipType(therapyRelationshipType.toProto())
    }
    if (hasMedication()) {
      protoValue.setMedication(medication.medicinalProductIndicationOtherTherapyMedicationToProto())
    }
    return protoValue.build()
  }

  private fun MedicinalProductIndication.OtherTherapy.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductIndication.MedicinalProductIndicationOtherTherapyComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProductIndication.MedicinalProductIndicationOtherTherapyComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasTherapyRelationshipType()) {
      hapiValue.setTherapyRelationshipType(therapyRelationshipType.toHapi())
    }
    if (hasMedication()) {
      hapiValue.setMedication(medication.medicinalProductIndicationOtherTherapyMedicationToHapi())
    }
    return hapiValue
  }
}
