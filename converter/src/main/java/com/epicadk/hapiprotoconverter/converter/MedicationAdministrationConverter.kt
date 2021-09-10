package com.epicadk.hapiprotoconverter.converter

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
import com.google.fhir.r4.core.MedicationAdministration
import com.google.fhir.r4.core.MedicationAdministration.Dosage
import com.google.fhir.r4.core.MedicationAdministrationStatusCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Ratio
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.Type

public object MedicationAdministrationConverter {
  private fun MedicationAdministration.MedicationX.medicationAdministrationMedicationToHapi():
      Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for MedicationAdministration.medication[x]")
  }

  private fun Type.medicationAdministrationMedicationToProto():
      MedicationAdministration.MedicationX {
    val protoValue = MedicationAdministration.MedicationX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private fun MedicationAdministration.EffectiveX.medicationAdministrationEffectiveToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for MedicationAdministration.effective[x]")
  }

  private fun Type.medicationAdministrationEffectiveToProto(): MedicationAdministration.EffectiveX {
    val protoValue = MedicationAdministration.EffectiveX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  private fun MedicationAdministration.Dosage.RateX.medicationAdministrationDosageRateToHapi():
      Type {
    if (hasRatio()) {
      return (this.getRatio()).toHapi()
    }
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for MedicationAdministration.dosage.rate[x]")
  }

  private fun Type.medicationAdministrationDosageRateToProto():
      MedicationAdministration.Dosage.RateX {
    val protoValue = MedicationAdministration.Dosage.RateX.newBuilder()
    if (this is Ratio) {
      protoValue.setRatio(this.toProto())
    }
    if (this is SimpleQuantity) {
      protoValue.setQuantity(this.toProto())
    }
    return protoValue.build()
  }

  public fun MedicationAdministration.toHapi(): org.hl7.fhir.r4.model.MedicationAdministration {
    val hapiValue = org.hl7.fhir.r4.model.MedicationAdministration()
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
    if (instantiatesCount > 0) {
      hapiValue.setInstantiates(instantiatesList.map { it.toHapi() })
    }
    if (partOfCount > 0) {
      hapiValue.setPartOf(partOfList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (statusReasonCount > 0) {
      hapiValue.setStatusReason(statusReasonList.map { it.toHapi() })
    }
    if (hasCategory()) {
      hapiValue.setCategory(category.toHapi())
    }
    if (hasMedication()) {
      hapiValue.setMedication(medication.medicationAdministrationMedicationToHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasContext()) {
      hapiValue.setContext(context.toHapi())
    }
    if (supportingInformationCount > 0) {
      hapiValue.setSupportingInformation(supportingInformationList.map { it.toHapi() })
    }
    if (hasEffective()) {
      hapiValue.setEffective(effective.medicationAdministrationEffectiveToHapi())
    }
    if (performerCount > 0) {
      hapiValue.setPerformer(performerList.map { it.toHapi() })
    }
    if (reasonCodeCount > 0) {
      hapiValue.setReasonCode(reasonCodeList.map { it.toHapi() })
    }
    if (reasonReferenceCount > 0) {
      hapiValue.setReasonReference(reasonReferenceList.map { it.toHapi() })
    }
    if (hasRequest()) {
      hapiValue.setRequest(request.toHapi())
    }
    if (deviceCount > 0) {
      hapiValue.setDevice(deviceList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (hasDosage()) {
      hapiValue.setDosage(dosage.toHapi())
    }
    if (eventHistoryCount > 0) {
      hapiValue.setEventHistory(eventHistoryList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MedicationAdministration.toProto(): MedicationAdministration {
    val protoValue = MedicationAdministration.newBuilder()
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
    if (hasInstantiates()) {
      protoValue.addAllInstantiates(instantiates.map { it.toProto() })
    }
    if (hasPartOf()) {
      protoValue.addAllPartOf(partOf.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(MedicationAdministration.StatusCode.newBuilder().setValue(MedicationAdministrationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasStatusReason()) {
      protoValue.addAllStatusReason(statusReason.map { it.toProto() })
    }
    if (hasCategory()) {
      protoValue.setCategory(category.toProto())
    }
    if (hasMedication()) {
      protoValue.setMedication(medication.medicationAdministrationMedicationToProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasContext()) {
      protoValue.setContext(context.toProto())
    }
    if (hasSupportingInformation()) {
      protoValue.addAllSupportingInformation(supportingInformation.map { it.toProto() })
    }
    if (hasEffective()) {
      protoValue.setEffective(effective.medicationAdministrationEffectiveToProto())
    }
    if (hasPerformer()) {
      protoValue.addAllPerformer(performer.map { it.toProto() })
    }
    if (hasReasonCode()) {
      protoValue.addAllReasonCode(reasonCode.map { it.toProto() })
    }
    if (hasReasonReference()) {
      protoValue.addAllReasonReference(reasonReference.map { it.toProto() })
    }
    if (hasRequest()) {
      protoValue.setRequest(request.toProto())
    }
    if (hasDevice()) {
      protoValue.addAllDevice(device.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasDosage()) {
      protoValue.setDosage(dosage.toProto())
    }
    if (hasEventHistory()) {
      protoValue.addAllEventHistory(eventHistory.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationPerformerComponent.toProto():
      MedicationAdministration.Performer {
    val protoValue = MedicationAdministration.Performer.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasFunction()) {
      protoValue.setFunction(function.toProto())
    }
    if (hasActor()) {
      protoValue.setActor(actor.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationDosageComponent.toProto():
      MedicationAdministration.Dosage {
    val protoValue = MedicationAdministration.Dosage.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasText()) {
      protoValue.setText(textElement.toProto())
    }
    if (hasSite()) {
      protoValue.setSite(site.toProto())
    }
    if (hasRoute()) {
      protoValue.setRoute(route.toProto())
    }
    if (hasMethod()) {
      protoValue.setMethod(method.toProto())
    }
    if (hasDose()) {
      protoValue.setDose((dose as SimpleQuantity).toProto())
    }
    if (hasRate()) {
      protoValue.setRate(rate.medicationAdministrationDosageRateToProto())
    }
    return protoValue.build()
  }

  private fun MedicationAdministration.Performer.toHapi():
      org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationPerformerComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationPerformerComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasFunction()) {
      hapiValue.setFunction(function.toHapi())
    }
    if (hasActor()) {
      hapiValue.setActor(actor.toHapi())
    }
    return hapiValue
  }

  private fun MedicationAdministration.Dosage.toHapi():
      org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationDosageComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationDosageComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasText()) {
      hapiValue.setTextElement(text.toHapi())
    }
    if (hasSite()) {
      hapiValue.setSite(site.toHapi())
    }
    if (hasRoute()) {
      hapiValue.setRoute(route.toHapi())
    }
    if (hasMethod()) {
      hapiValue.setMethod(method.toHapi())
    }
    if (hasDose()) {
      hapiValue.setDose(dose.toHapi())
    }
    if (hasRate()) {
      hapiValue.setRate(rate.medicationAdministrationDosageRateToHapi())
    }
    return hapiValue
  }
}
