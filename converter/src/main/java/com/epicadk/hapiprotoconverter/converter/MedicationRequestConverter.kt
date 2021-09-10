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
import com.epicadk.hapiprotoconverter.converter.DosageConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DosageConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.MedicationRequest
import com.google.fhir.r4.core.MedicationRequest.DispenseRequest
import com.google.fhir.r4.core.MedicationRequest.Substitution
import com.google.fhir.r4.core.MedicationRequestIntentCode
import com.google.fhir.r4.core.MedicationrequestStatusCode
import com.google.fhir.r4.core.RequestPriorityCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.Type

public object MedicationRequestConverter {
  private fun MedicationRequest.ReportedX.medicationRequestReportedToHapi(): Type {
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for MedicationRequest.reported[x]")
  }

  private fun Type.medicationRequestReportedToProto(): MedicationRequest.ReportedX {
    val protoValue = MedicationRequest.ReportedX.newBuilder()
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private fun MedicationRequest.MedicationX.medicationRequestMedicationToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for MedicationRequest.medication[x]")
  }

  private fun Type.medicationRequestMedicationToProto(): MedicationRequest.MedicationX {
    val protoValue = MedicationRequest.MedicationX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private fun MedicationRequest.Substitution.AllowedX.medicationRequestSubstitutionAllowedToHapi():
      Type {
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for MedicationRequest.substitution.allowed[x]")
  }

  private fun Type.medicationRequestSubstitutionAllowedToProto():
      MedicationRequest.Substitution.AllowedX {
    val protoValue = MedicationRequest.Substitution.AllowedX.newBuilder()
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    return protoValue.build()
  }

  public fun MedicationRequest.toHapi(): org.hl7.fhir.r4.model.MedicationRequest {
    val hapiValue = org.hl7.fhir.r4.model.MedicationRequest()
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
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasStatusReason()) {
      hapiValue.setStatusReason(statusReason.toHapi())
    }
    if (hasIntent()) {
      hapiValue.setIntent(org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestIntent.valueOf(intent.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (categoryCount > 0) {
      hapiValue.setCategory(categoryList.map { it.toHapi() })
    }
    if (hasPriority()) {
      hapiValue.setPriority(org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestPriority.valueOf(priority.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDoNotPerform()) {
      hapiValue.setDoNotPerformElement(doNotPerform.toHapi())
    }
    if (hasReported()) {
      hapiValue.setReported(reported.medicationRequestReportedToHapi())
    }
    if (hasMedication()) {
      hapiValue.setMedication(medication.medicationRequestMedicationToHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (supportingInformationCount > 0) {
      hapiValue.setSupportingInformation(supportingInformationList.map { it.toHapi() })
    }
    if (hasAuthoredOn()) {
      hapiValue.setAuthoredOnElement(authoredOn.toHapi())
    }
    if (hasRequester()) {
      hapiValue.setRequester(requester.toHapi())
    }
    if (hasPerformer()) {
      hapiValue.setPerformer(performer.toHapi())
    }
    if (hasPerformerType()) {
      hapiValue.setPerformerType(performerType.toHapi())
    }
    if (hasRecorder()) {
      hapiValue.setRecorder(recorder.toHapi())
    }
    if (reasonCodeCount > 0) {
      hapiValue.setReasonCode(reasonCodeList.map { it.toHapi() })
    }
    if (reasonReferenceCount > 0) {
      hapiValue.setReasonReference(reasonReferenceList.map { it.toHapi() })
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
    if (hasGroupIdentifier()) {
      hapiValue.setGroupIdentifier(groupIdentifier.toHapi())
    }
    if (hasCourseOfTherapyType()) {
      hapiValue.setCourseOfTherapyType(courseOfTherapyType.toHapi())
    }
    if (insuranceCount > 0) {
      hapiValue.setInsurance(insuranceList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (dosageInstructionCount > 0) {
      hapiValue.setDosageInstruction(dosageInstructionList.map { it.toHapi() })
    }
    if (hasDispenseRequest()) {
      hapiValue.setDispenseRequest(dispenseRequest.toHapi())
    }
    if (hasSubstitution()) {
      hapiValue.setSubstitution(substitution.toHapi())
    }
    if (hasPriorPrescription()) {
      hapiValue.setPriorPrescription(priorPrescription.toHapi())
    }
    if (detectedIssueCount > 0) {
      hapiValue.setDetectedIssue(detectedIssueList.map { it.toHapi() })
    }
    if (eventHistoryCount > 0) {
      hapiValue.setEventHistory(eventHistoryList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MedicationRequest.toProto(): MedicationRequest {
    val protoValue = MedicationRequest.newBuilder()
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
    if (hasStatus()) {
      protoValue.setStatus(MedicationRequest.StatusCode.newBuilder().setValue(MedicationrequestStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasStatusReason()) {
      protoValue.setStatusReason(statusReason.toProto())
    }
    if (hasIntent()) {
      protoValue.setIntent(MedicationRequest.IntentCode.newBuilder().setValue(MedicationRequestIntentCode.Value.valueOf(intent.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCategory()) {
      protoValue.addAllCategory(category.map { it.toProto() })
    }
    if (hasPriority()) {
      protoValue.setPriority(MedicationRequest.PriorityCode.newBuilder().setValue(RequestPriorityCode.Value.valueOf(priority.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDoNotPerform()) {
      protoValue.setDoNotPerform(doNotPerformElement.toProto())
    }
    if (hasReported()) {
      protoValue.setReported(reported.medicationRequestReportedToProto())
    }
    if (hasMedication()) {
      protoValue.setMedication(medication.medicationRequestMedicationToProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasSupportingInformation()) {
      protoValue.addAllSupportingInformation(supportingInformation.map { it.toProto() })
    }
    if (hasAuthoredOn()) {
      protoValue.setAuthoredOn(authoredOnElement.toProto())
    }
    if (hasRequester()) {
      protoValue.setRequester(requester.toProto())
    }
    if (hasPerformer()) {
      protoValue.setPerformer(performer.toProto())
    }
    if (hasPerformerType()) {
      protoValue.setPerformerType(performerType.toProto())
    }
    if (hasRecorder()) {
      protoValue.setRecorder(recorder.toProto())
    }
    if (hasReasonCode()) {
      protoValue.addAllReasonCode(reasonCode.map { it.toProto() })
    }
    if (hasReasonReference()) {
      protoValue.addAllReasonReference(reasonReference.map { it.toProto() })
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
    if (hasGroupIdentifier()) {
      protoValue.setGroupIdentifier(groupIdentifier.toProto())
    }
    if (hasCourseOfTherapyType()) {
      protoValue.setCourseOfTherapyType(courseOfTherapyType.toProto())
    }
    if (hasInsurance()) {
      protoValue.addAllInsurance(insurance.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasDosageInstruction()) {
      protoValue.addAllDosageInstruction(dosageInstruction.map { it.toProto() })
    }
    if (hasDispenseRequest()) {
      protoValue.setDispenseRequest(dispenseRequest.toProto())
    }
    if (hasSubstitution()) {
      protoValue.setSubstitution(substitution.toProto())
    }
    if (hasPriorPrescription()) {
      protoValue.setPriorPrescription(priorPrescription.toProto())
    }
    if (hasDetectedIssue()) {
      protoValue.addAllDetectedIssue(detectedIssue.map { it.toProto() })
    }
    if (hasEventHistory()) {
      protoValue.addAllEventHistory(eventHistory.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestComponent.toProto():
      MedicationRequest.DispenseRequest {
    val protoValue = MedicationRequest.DispenseRequest.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasInitialFill()) {
      protoValue.setInitialFill(initialFill.toProto())
    }
    if (hasDispenseInterval()) {
      protoValue.setDispenseInterval(dispenseInterval.toProto())
    }
    if (hasValidityPeriod()) {
      protoValue.setValidityPeriod(validityPeriod.toProto())
    }
    if (hasNumberOfRepeatsAllowed()) {
      protoValue.setNumberOfRepeatsAllowed(numberOfRepeatsAllowedElement.toProto())
    }
    if (hasQuantity()) {
      protoValue.setQuantity((quantity as SimpleQuantity).toProto())
    }
    if (hasExpectedSupplyDuration()) {
      protoValue.setExpectedSupplyDuration(expectedSupplyDuration.toProto())
    }
    if (hasPerformer()) {
      protoValue.setPerformer(performer.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestInitialFillComponent.toProto():
      MedicationRequest.DispenseRequest.InitialFill {
    val protoValue = MedicationRequest.DispenseRequest.InitialFill.newBuilder()
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
    if (hasDuration()) {
      protoValue.setDuration(duration.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestSubstitutionComponent.toProto():
      MedicationRequest.Substitution {
    val protoValue = MedicationRequest.Substitution.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasAllowed()) {
      protoValue.setAllowed(allowed.medicationRequestSubstitutionAllowedToProto())
    }
    if (hasReason()) {
      protoValue.setReason(reason.toProto())
    }
    return protoValue.build()
  }

  private fun MedicationRequest.DispenseRequest.toHapi():
      org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasInitialFill()) {
      hapiValue.setInitialFill(initialFill.toHapi())
    }
    if (hasDispenseInterval()) {
      hapiValue.setDispenseInterval(dispenseInterval.toHapi())
    }
    if (hasValidityPeriod()) {
      hapiValue.setValidityPeriod(validityPeriod.toHapi())
    }
    if (hasNumberOfRepeatsAllowed()) {
      hapiValue.setNumberOfRepeatsAllowedElement(numberOfRepeatsAllowed.toHapi())
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (hasExpectedSupplyDuration()) {
      hapiValue.setExpectedSupplyDuration(expectedSupplyDuration.toHapi())
    }
    if (hasPerformer()) {
      hapiValue.setPerformer(performer.toHapi())
    }
    return hapiValue
  }

  private fun MedicationRequest.DispenseRequest.InitialFill.toHapi():
      org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestInitialFillComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestInitialFillComponent()
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
    if (hasDuration()) {
      hapiValue.setDuration(duration.toHapi())
    }
    return hapiValue
  }

  private fun MedicationRequest.Substitution.toHapi():
      org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestSubstitutionComponent {
    val hapiValue = org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestSubstitutionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasAllowed()) {
      hapiValue.setAllowed(allowed.medicationRequestSubstitutionAllowedToHapi())
    }
    if (hasReason()) {
      hapiValue.setReason(reason.toHapi())
    }
    return hapiValue
  }
}
