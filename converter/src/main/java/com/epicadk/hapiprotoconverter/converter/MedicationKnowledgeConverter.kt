package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.Base64BinaryConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.Base64BinaryConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DosageConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DosageConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MoneyConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MoneyConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.MedicationKnowledge
import com.google.fhir.r4.core.MedicationKnowledge.AdministrationGuidelines
import com.google.fhir.r4.core.MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics
import com.google.fhir.r4.core.MedicationKnowledge.DrugCharacteristic
import com.google.fhir.r4.core.MedicationKnowledge.Ingredient
import com.google.fhir.r4.core.MedicationKnowledge.Regulatory
import com.google.fhir.r4.core.MedicationKnowledgeStatusCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Base64BinaryType
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object MedicationKnowledgeConverter {
  private fun MedicationKnowledge.Ingredient.ItemX.medicationKnowledgeIngredientItemToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for MedicationKnowledge.ingredient.item[x]")
  }

  private fun Type.medicationKnowledgeIngredientItemToProto():
      MedicationKnowledge.Ingredient.ItemX {
    val protoValue = MedicationKnowledge.Ingredient.ItemX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun MedicationKnowledge.AdministrationGuidelines.IndicationX.medicationKnowledgeAdministrationGuidelinesIndicationToHapi():
      Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for MedicationKnowledge.administrationGuidelines.indication[x]")
  }

  private fun Type.medicationKnowledgeAdministrationGuidelinesIndicationToProto():
      MedicationKnowledge.AdministrationGuidelines.IndicationX {
    val protoValue = MedicationKnowledge.AdministrationGuidelines.IndicationX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics.CharacteristicX.medicationKnowledgeAdministrationGuidelinesPatientCharacteristicsCharacteristicToHapi():
      Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for MedicationKnowledge.administrationGuidelines.patientCharacteristics.characteristic[x]")
  }

  private
      fun Type.medicationKnowledgeAdministrationGuidelinesPatientCharacteristicsCharacteristicToProto():
      MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics.CharacteristicX {
    val protoValue =
        MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics.CharacteristicX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is SimpleQuantity) {
      protoValue.setQuantity(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun MedicationKnowledge.DrugCharacteristic.ValueX.medicationKnowledgeDrugCharacteristicValueToHapi():
      Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasBase64Binary()) {
      return (this.getBase64Binary()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for MedicationKnowledge.drugCharacteristic.value[x]")
  }

  private fun Type.medicationKnowledgeDrugCharacteristicValueToProto():
      MedicationKnowledge.DrugCharacteristic.ValueX {
    val protoValue = MedicationKnowledge.DrugCharacteristic.ValueX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is SimpleQuantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is Base64BinaryType) {
      protoValue.setBase64Binary(this.toProto())
    }
    return protoValue.build()
  }

  public fun MedicationKnowledge.toHapi(): org.hl7.fhir.r4.model.MedicationKnowledge {
    val hapiValue = org.hl7.fhir.r4.model.MedicationKnowledge()
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
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasManufacturer()) {
      hapiValue.setManufacturer(manufacturer.toHapi())
    }
    if (hasDoseForm()) {
      hapiValue.setDoseForm(doseForm.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.toHapi())
    }
    if (synonymCount > 0) {
      hapiValue.setSynonym(synonymList.map { it.toHapi() })
    }
    if (relatedMedicationKnowledgeCount > 0) {
      hapiValue.setRelatedMedicationKnowledge(relatedMedicationKnowledgeList.map { it.toHapi() })
    }
    if (associatedMedicationCount > 0) {
      hapiValue.setAssociatedMedication(associatedMedicationList.map { it.toHapi() })
    }
    if (productTypeCount > 0) {
      hapiValue.setProductType(productTypeList.map { it.toHapi() })
    }
    if (monographCount > 0) {
      hapiValue.setMonograph(monographList.map { it.toHapi() })
    }
    if (ingredientCount > 0) {
      hapiValue.setIngredient(ingredientList.map { it.toHapi() })
    }
    if (hasPreparationInstruction()) {
      hapiValue.setPreparationInstructionElement(preparationInstruction.toHapi())
    }
    if (intendedRouteCount > 0) {
      hapiValue.setIntendedRoute(intendedRouteList.map { it.toHapi() })
    }
    if (costCount > 0) {
      hapiValue.setCost(costList.map { it.toHapi() })
    }
    if (monitoringProgramCount > 0) {
      hapiValue.setMonitoringProgram(monitoringProgramList.map { it.toHapi() })
    }
    if (administrationGuidelinesCount > 0) {
      hapiValue.setAdministrationGuidelines(administrationGuidelinesList.map { it.toHapi() })
    }
    if (medicineClassificationCount > 0) {
      hapiValue.setMedicineClassification(medicineClassificationList.map { it.toHapi() })
    }
    if (hasPackaging()) {
      hapiValue.setPackaging(packaging.toHapi())
    }
    if (drugCharacteristicCount > 0) {
      hapiValue.setDrugCharacteristic(drugCharacteristicList.map { it.toHapi() })
    }
    if (contraindicationCount > 0) {
      hapiValue.setContraindication(contraindicationList.map { it.toHapi() })
    }
    if (regulatoryCount > 0) {
      hapiValue.setRegulatory(regulatoryList.map { it.toHapi() })
    }
    if (kineticsCount > 0) {
      hapiValue.setKinetics(kineticsList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MedicationKnowledge.toProto(): MedicationKnowledge {
    val protoValue = MedicationKnowledge.newBuilder()
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
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(MedicationKnowledge.StatusCode.newBuilder().setValue(MedicationKnowledgeStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasManufacturer()) {
      protoValue.setManufacturer(manufacturer.toProto())
    }
    if (hasDoseForm()) {
      protoValue.setDoseForm(doseForm.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount((amount as SimpleQuantity).toProto())
    }
    if (hasSynonym()) {
      protoValue.addAllSynonym(synonym.map { it.toProto() })
    }
    if (hasRelatedMedicationKnowledge()) {
      protoValue.addAllRelatedMedicationKnowledge(relatedMedicationKnowledge.map { it.toProto() })
    }
    if (hasAssociatedMedication()) {
      protoValue.addAllAssociatedMedication(associatedMedication.map { it.toProto() })
    }
    if (hasProductType()) {
      protoValue.addAllProductType(productType.map { it.toProto() })
    }
    if (hasMonograph()) {
      protoValue.addAllMonograph(monograph.map { it.toProto() })
    }
    if (hasIngredient()) {
      protoValue.addAllIngredient(ingredient.map { it.toProto() })
    }
    if (hasPreparationInstruction()) {
      protoValue.setPreparationInstruction(preparationInstructionElement.toProto())
    }
    if (hasIntendedRoute()) {
      protoValue.addAllIntendedRoute(intendedRoute.map { it.toProto() })
    }
    if (hasCost()) {
      protoValue.addAllCost(cost.map { it.toProto() })
    }
    if (hasMonitoringProgram()) {
      protoValue.addAllMonitoringProgram(monitoringProgram.map { it.toProto() })
    }
    if (hasAdministrationGuidelines()) {
      protoValue.addAllAdministrationGuidelines(administrationGuidelines.map { it.toProto() })
    }
    if (hasMedicineClassification()) {
      protoValue.addAllMedicineClassification(medicineClassification.map { it.toProto() })
    }
    if (hasPackaging()) {
      protoValue.setPackaging(packaging.toProto())
    }
    if (hasDrugCharacteristic()) {
      protoValue.addAllDrugCharacteristic(drugCharacteristic.map { it.toProto() })
    }
    if (hasContraindication()) {
      protoValue.addAllContraindication(contraindication.map { it.toProto() })
    }
    if (hasRegulatory()) {
      protoValue.addAllRegulatory(regulatory.map { it.toProto() })
    }
    if (hasKinetics()) {
      protoValue.addAllKinetics(kinetics.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRelatedMedicationKnowledgeComponent.toProto():
      MedicationKnowledge.RelatedMedicationKnowledge {
    val protoValue = MedicationKnowledge.RelatedMedicationKnowledge.newBuilder()
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
      protoValue.setType(type.toProto())
    }
    if (hasReference()) {
      protoValue.addAllReference(reference.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMonographComponent.toProto():
      MedicationKnowledge.Monograph {
    val protoValue = MedicationKnowledge.Monograph.newBuilder()
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
      protoValue.setType(type.toProto())
    }
    if (hasSource()) {
      protoValue.setSource(source.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeIngredientComponent.toProto():
      MedicationKnowledge.Ingredient {
    val protoValue = MedicationKnowledge.Ingredient.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasItem()) {
      protoValue.setItem(item.medicationKnowledgeIngredientItemToProto())
    }
    if (hasIsActive()) {
      protoValue.setIsActive(isActiveElement.toProto())
    }
    if (hasStrength()) {
      protoValue.setStrength(strength.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeCostComponent.toProto():
      MedicationKnowledge.Cost {
    val protoValue = MedicationKnowledge.Cost.newBuilder()
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
      protoValue.setType(type.toProto())
    }
    if (hasSource()) {
      protoValue.setSource(sourceElement.toProto())
    }
    if (hasCost()) {
      protoValue.setCost(cost.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMonitoringProgramComponent.toProto():
      MedicationKnowledge.MonitoringProgram {
    val protoValue = MedicationKnowledge.MonitoringProgram.newBuilder()
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
      protoValue.setType(type.toProto())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesComponent.toProto():
      MedicationKnowledge.AdministrationGuidelines {
    val protoValue = MedicationKnowledge.AdministrationGuidelines.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDosage()) {
      protoValue.addAllDosage(dosage.map { it.toProto() })
    }
    if (hasIndication()) {
      protoValue.setIndication(indication.medicationKnowledgeAdministrationGuidelinesIndicationToProto())
    }
    if (hasPatientCharacteristics()) {
      protoValue.addAllPatientCharacteristics(patientCharacteristics.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesDosageComponent.toProto():
      MedicationKnowledge.AdministrationGuidelines.Dosage {
    val protoValue = MedicationKnowledge.AdministrationGuidelines.Dosage.newBuilder()
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
      protoValue.setType(type.toProto())
    }
    if (hasDosage()) {
      protoValue.addAllDosage(dosage.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsComponent.toProto():
      MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics {
    val protoValue =
        MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCharacteristic()) {
      protoValue.setCharacteristic(characteristic.medicationKnowledgeAdministrationGuidelinesPatientCharacteristicsCharacteristicToProto())
    }
    if (hasValue()) {
      protoValue.addAllValue(value.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMedicineClassificationComponent.toProto():
      MedicationKnowledge.MedicineClassification {
    val protoValue = MedicationKnowledge.MedicineClassification.newBuilder()
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
      protoValue.setType(type.toProto())
    }
    if (hasClassification()) {
      protoValue.addAllClassification(classification.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgePackagingComponent.toProto():
      MedicationKnowledge.Packaging {
    val protoValue = MedicationKnowledge.Packaging.newBuilder()
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
      protoValue.setType(type.toProto())
    }
    if (hasQuantity()) {
      protoValue.setQuantity((quantity as SimpleQuantity).toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeDrugCharacteristicComponent.toProto():
      MedicationKnowledge.DrugCharacteristic {
    val protoValue = MedicationKnowledge.DrugCharacteristic.newBuilder()
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
      protoValue.setType(type.toProto())
    }
    if (hasValue()) {
      protoValue.setValue(value.medicationKnowledgeDrugCharacteristicValueToProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryComponent.toProto():
      MedicationKnowledge.Regulatory {
    val protoValue = MedicationKnowledge.Regulatory.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasRegulatoryAuthority()) {
      protoValue.setRegulatoryAuthority(regulatoryAuthority.toProto())
    }
    if (hasSubstitution()) {
      protoValue.addAllSubstitution(substitution.map { it.toProto() })
    }
    if (hasSchedule()) {
      protoValue.addAllSchedule(schedule.map { it.toProto() })
    }
    if (hasMaxDispense()) {
      protoValue.setMaxDispense(maxDispense.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatorySubstitutionComponent.toProto():
      MedicationKnowledge.Regulatory.Substitution {
    val protoValue = MedicationKnowledge.Regulatory.Substitution.newBuilder()
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
      protoValue.setType(type.toProto())
    }
    if (hasAllowed()) {
      protoValue.setAllowed(allowedElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryScheduleComponent.toProto():
      MedicationKnowledge.Regulatory.Schedule {
    val protoValue = MedicationKnowledge.Regulatory.Schedule.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSchedule()) {
      protoValue.setSchedule(schedule.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryMaxDispenseComponent.toProto():
      MedicationKnowledge.Regulatory.MaxDispense {
    val protoValue = MedicationKnowledge.Regulatory.MaxDispense.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasQuantity()) {
      protoValue.setQuantity((quantity as SimpleQuantity).toProto())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeKineticsComponent.toProto():
      MedicationKnowledge.Kinetics {
    val protoValue = MedicationKnowledge.Kinetics.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasAreaUnderCurve()) {
      protoValue.addAllAreaUnderCurve(areaUnderCurve.map { (it as SimpleQuantity).toProto() })
    }
    if (hasLethalDose50()) {
      protoValue.addAllLethalDose50(lethalDose50.map { (it as SimpleQuantity).toProto() })
    }
    if (hasHalfLifePeriod()) {
      protoValue.setHalfLifePeriod(halfLifePeriod.toProto())
    }
    return protoValue.build()
  }

  private fun MedicationKnowledge.RelatedMedicationKnowledge.toHapi():
      org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRelatedMedicationKnowledgeComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRelatedMedicationKnowledgeComponent()
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
      hapiValue.setType(type.toHapi())
    }
    if (referenceCount > 0) {
      hapiValue.setReference(referenceList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun MedicationKnowledge.Monograph.toHapi():
      org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMonographComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMonographComponent()
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
      hapiValue.setType(type.toHapi())
    }
    if (hasSource()) {
      hapiValue.setSource(source.toHapi())
    }
    return hapiValue
  }

  private fun MedicationKnowledge.Ingredient.toHapi():
      org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeIngredientComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeIngredientComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasItem()) {
      hapiValue.setItem(item.medicationKnowledgeIngredientItemToHapi())
    }
    if (hasIsActive()) {
      hapiValue.setIsActiveElement(isActive.toHapi())
    }
    if (hasStrength()) {
      hapiValue.setStrength(strength.toHapi())
    }
    return hapiValue
  }

  private fun MedicationKnowledge.Cost.toHapi():
      org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeCostComponent {
    val hapiValue = org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeCostComponent()
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
      hapiValue.setType(type.toHapi())
    }
    if (hasSource()) {
      hapiValue.setSourceElement(source.toHapi())
    }
    if (hasCost()) {
      hapiValue.setCost(cost.toHapi())
    }
    return hapiValue
  }

  private fun MedicationKnowledge.MonitoringProgram.toHapi():
      org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMonitoringProgramComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMonitoringProgramComponent()
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
      hapiValue.setType(type.toHapi())
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    return hapiValue
  }

  private fun MedicationKnowledge.AdministrationGuidelines.toHapi():
      org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (dosageCount > 0) {
      hapiValue.setDosage(dosageList.map { it.toHapi() })
    }
    if (hasIndication()) {
      hapiValue.setIndication(indication.medicationKnowledgeAdministrationGuidelinesIndicationToHapi())
    }
    if (patientCharacteristicsCount > 0) {
      hapiValue.setPatientCharacteristics(patientCharacteristicsList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun MedicationKnowledge.AdministrationGuidelines.Dosage.toHapi():
      org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesDosageComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesDosageComponent()
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
      hapiValue.setType(type.toHapi())
    }
    if (dosageCount > 0) {
      hapiValue.setDosage(dosageList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics.toHapi():
      org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCharacteristic()) {
      hapiValue.setCharacteristic(characteristic.medicationKnowledgeAdministrationGuidelinesPatientCharacteristicsCharacteristicToHapi())
    }
    if (valueCount > 0) {
      hapiValue.setValue(valueList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun MedicationKnowledge.MedicineClassification.toHapi():
      org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMedicineClassificationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeMedicineClassificationComponent()
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
      hapiValue.setType(type.toHapi())
    }
    if (classificationCount > 0) {
      hapiValue.setClassification(classificationList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun MedicationKnowledge.Packaging.toHapi():
      org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgePackagingComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgePackagingComponent()
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
      hapiValue.setType(type.toHapi())
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    return hapiValue
  }

  private fun MedicationKnowledge.DrugCharacteristic.toHapi():
      org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeDrugCharacteristicComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeDrugCharacteristicComponent()
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
      hapiValue.setType(type.toHapi())
    }
    if (hasValue()) {
      hapiValue.setValue(value.medicationKnowledgeDrugCharacteristicValueToHapi())
    }
    return hapiValue
  }

  private fun MedicationKnowledge.Regulatory.toHapi():
      org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasRegulatoryAuthority()) {
      hapiValue.setRegulatoryAuthority(regulatoryAuthority.toHapi())
    }
    if (substitutionCount > 0) {
      hapiValue.setSubstitution(substitutionList.map { it.toHapi() })
    }
    if (scheduleCount > 0) {
      hapiValue.setSchedule(scheduleList.map { it.toHapi() })
    }
    if (hasMaxDispense()) {
      hapiValue.setMaxDispense(maxDispense.toHapi())
    }
    return hapiValue
  }

  private fun MedicationKnowledge.Regulatory.Substitution.toHapi():
      org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatorySubstitutionComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatorySubstitutionComponent()
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
      hapiValue.setType(type.toHapi())
    }
    if (hasAllowed()) {
      hapiValue.setAllowedElement(allowed.toHapi())
    }
    return hapiValue
  }

  private fun MedicationKnowledge.Regulatory.Schedule.toHapi():
      org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryScheduleComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryScheduleComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasSchedule()) {
      hapiValue.setSchedule(schedule.toHapi())
    }
    return hapiValue
  }

  private fun MedicationKnowledge.Regulatory.MaxDispense.toHapi():
      org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryMaxDispenseComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeRegulatoryMaxDispenseComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    return hapiValue
  }

  private fun MedicationKnowledge.Kinetics.toHapi():
      org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeKineticsComponent {
    val hapiValue = org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeKineticsComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (areaUnderCurveCount > 0) {
      hapiValue.setAreaUnderCurve(areaUnderCurveList.map { it.toHapi() })
    }
    if (lethalDose50Count > 0) {
      hapiValue.setLethalDose50(lethalDose50List.map { it.toHapi() })
    }
    if (hasHalfLifePeriod()) {
      hapiValue.setHalfLifePeriod(halfLifePeriod.toHapi())
    }
    return hapiValue
  }
}
