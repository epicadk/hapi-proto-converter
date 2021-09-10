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
import com.google.fhir.r4.core.MedicinalProductContraindication
import com.google.fhir.r4.core.MedicinalProductContraindication.OtherTherapy
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.Type

public object MedicinalProductContraindicationConverter {
  private
      fun MedicinalProductContraindication.OtherTherapy.MedicationX.medicinalProductContraindicationOtherTherapyMedicationToHapi():
      Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for MedicinalProductContraindication.otherTherapy.medication[x]")
  }

  private fun Type.medicinalProductContraindicationOtherTherapyMedicationToProto():
      MedicinalProductContraindication.OtherTherapy.MedicationX {
    val protoValue = MedicinalProductContraindication.OtherTherapy.MedicationX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  public fun MedicinalProductContraindication.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductContraindication {
    val hapiValue = org.hl7.fhir.r4.model.MedicinalProductContraindication()
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
    if (hasDisease()) {
      hapiValue.setDisease(disease.toHapi())
    }
    if (hasDiseaseStatus()) {
      hapiValue.setDiseaseStatus(diseaseStatus.toHapi())
    }
    if (comorbidityCount > 0) {
      hapiValue.setComorbidity(comorbidityList.map { it.toHapi() })
    }
    if (therapeuticIndicationCount > 0) {
      hapiValue.setTherapeuticIndication(therapeuticIndicationList.map { it.toHapi() })
    }
    if (otherTherapyCount > 0) {
      hapiValue.setOtherTherapy(otherTherapyList.map { it.toHapi() })
    }
    if (populationCount > 0) {
      hapiValue.setPopulation(populationList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MedicinalProductContraindication.toProto():
      MedicinalProductContraindication {
    val protoValue = MedicinalProductContraindication.newBuilder()
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
    if (hasDisease()) {
      protoValue.setDisease(disease.toProto())
    }
    if (hasDiseaseStatus()) {
      protoValue.setDiseaseStatus(diseaseStatus.toProto())
    }
    if (hasComorbidity()) {
      protoValue.addAllComorbidity(comorbidity.map { it.toProto() })
    }
    if (hasTherapeuticIndication()) {
      protoValue.addAllTherapeuticIndication(therapeuticIndication.map { it.toProto() })
    }
    if (hasOtherTherapy()) {
      protoValue.addAllOtherTherapy(otherTherapy.map { it.toProto() })
    }
    if (hasPopulation()) {
      protoValue.addAllPopulation(population.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProductContraindication.MedicinalProductContraindicationOtherTherapyComponent.toProto():
      MedicinalProductContraindication.OtherTherapy {
    val protoValue = MedicinalProductContraindication.OtherTherapy.newBuilder()
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
      protoValue.setMedication(medication.medicinalProductContraindicationOtherTherapyMedicationToProto())
    }
    return protoValue.build()
  }

  private fun MedicinalProductContraindication.OtherTherapy.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductContraindication.MedicinalProductContraindicationOtherTherapyComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProductContraindication.MedicinalProductContraindicationOtherTherapyComponent()
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
      hapiValue.setMedication(medication.medicinalProductContraindicationOtherTherapyMedicationToHapi())
    }
    return hapiValue
  }
}
