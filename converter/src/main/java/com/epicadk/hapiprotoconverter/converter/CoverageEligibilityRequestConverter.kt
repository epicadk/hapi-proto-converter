package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.MoneyConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MoneyConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.CoverageEligibilityRequest
import com.google.fhir.r4.core.CoverageEligibilityRequest.Details
import com.google.fhir.r4.core.CoverageEligibilityRequest.Details.Diagnosis
import com.google.fhir.r4.core.EligibilityRequestPurposeCode
import com.google.fhir.r4.core.FinancialResourceStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.DateType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.Type

public object CoverageEligibilityRequestConverter {
  private fun CoverageEligibilityRequest.ServicedX.coverageEligibilityRequestServicedToHapi():
      Type {
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for CoverageEligibilityRequest.serviced[x]")
  }

  private fun Type.coverageEligibilityRequestServicedToProto():
      CoverageEligibilityRequest.ServicedX {
    val protoValue = CoverageEligibilityRequest.ServicedX.newBuilder()
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun CoverageEligibilityRequest.Details.Diagnosis.DiagnosisX.coverageEligibilityRequestItemDiagnosisDiagnosisToHapi():
      Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for CoverageEligibilityRequest.item.diagnosis.diagnosis[x]")
  }

  private fun Type.coverageEligibilityRequestItemDiagnosisDiagnosisToProto():
      CoverageEligibilityRequest.Details.Diagnosis.DiagnosisX {
    val protoValue = CoverageEligibilityRequest.Details.Diagnosis.DiagnosisX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  public fun CoverageEligibilityRequest.toHapi(): org.hl7.fhir.r4.model.CoverageEligibilityRequest {
    val hapiValue = org.hl7.fhir.r4.model.CoverageEligibilityRequest()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.CoverageEligibilityRequest.EligibilityRequestStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPriority()) {
      hapiValue.setPriority(priority.toHapi())
    }
    if (purposeCount > 0) {
      purposeList.forEach { hapiValue.addPurpose(org.hl7.fhir.r4.model.CoverageEligibilityRequest.EligibilityRequestPurpose.valueOf(it.value.name.hapiCodeCheck().replace("_", ""))) }
    }
    if (hasPatient()) {
      hapiValue.setPatient(patient.toHapi())
    }
    if (hasServiced()) {
      hapiValue.setServiced(serviced.coverageEligibilityRequestServicedToHapi())
    }
    if (hasCreated()) {
      hapiValue.setCreatedElement(created.toHapi())
    }
    if (hasEnterer()) {
      hapiValue.setEnterer(enterer.toHapi())
    }
    if (hasProvider()) {
      hapiValue.setProvider(provider.toHapi())
    }
    if (hasInsurer()) {
      hapiValue.setInsurer(insurer.toHapi())
    }
    if (hasFacility()) {
      hapiValue.setFacility(facility.toHapi())
    }
    if (supportingInfoCount > 0) {
      hapiValue.setSupportingInfo(supportingInfoList.map { it.toHapi() })
    }
    if (insuranceCount > 0) {
      hapiValue.setInsurance(insuranceList.map { it.toHapi() })
    }
    if (itemCount > 0) {
      hapiValue.setItem(itemList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.CoverageEligibilityRequest.toProto():
      CoverageEligibilityRequest {
    val protoValue = CoverageEligibilityRequest.newBuilder()
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
      protoValue.setStatus(CoverageEligibilityRequest.StatusCode.newBuilder().setValue(FinancialResourceStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPriority()) {
      protoValue.setPriority(priority.toProto())
    }
    if (hasPurpose()) {
      protoValue.addAllPurpose(purpose.map { CoverageEligibilityRequest.PurposeCode.newBuilder().setValue(EligibilityRequestPurposeCode.Value.valueOf(it.value.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build() })
    }
    if (hasPatient()) {
      protoValue.setPatient(patient.toProto())
    }
    if (hasServiced()) {
      protoValue.setServiced(serviced.coverageEligibilityRequestServicedToProto())
    }
    if (hasCreated()) {
      protoValue.setCreated(createdElement.toProto())
    }
    if (hasEnterer()) {
      protoValue.setEnterer(enterer.toProto())
    }
    if (hasProvider()) {
      protoValue.setProvider(provider.toProto())
    }
    if (hasInsurer()) {
      protoValue.setInsurer(insurer.toProto())
    }
    if (hasFacility()) {
      protoValue.setFacility(facility.toProto())
    }
    if (hasSupportingInfo()) {
      protoValue.addAllSupportingInfo(supportingInfo.map { it.toProto() })
    }
    if (hasInsurance()) {
      protoValue.addAllInsurance(insurance.map { it.toProto() })
    }
    if (hasItem()) {
      protoValue.addAllItem(item.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.CoverageEligibilityRequest.SupportingInformationComponent.toProto():
      CoverageEligibilityRequest.SupportingInformation {
    val protoValue = CoverageEligibilityRequest.SupportingInformation.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSequence()) {
      protoValue.setSequence(sequenceElement.toProto())
    }
    if (hasInformation()) {
      protoValue.setInformation(information.toProto())
    }
    if (hasAppliesToAll()) {
      protoValue.setAppliesToAll(appliesToAllElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.CoverageEligibilityRequest.InsuranceComponent.toProto():
      CoverageEligibilityRequest.Insurance {
    val protoValue = CoverageEligibilityRequest.Insurance.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasFocal()) {
      protoValue.setFocal(focalElement.toProto())
    }
    if (hasCoverage()) {
      protoValue.setCoverage(coverage.toProto())
    }
    if (hasBusinessArrangement()) {
      protoValue.setBusinessArrangement(businessArrangementElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.CoverageEligibilityRequest.DetailsComponent.toProto():
      CoverageEligibilityRequest.Details {
    val protoValue = CoverageEligibilityRequest.Details.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSupportingInfoSequence()) {
      protoValue.addAllSupportingInfoSequence(supportingInfoSequence.map { it.toProto() })
    }
    if (hasCategory()) {
      protoValue.setCategory(category.toProto())
    }
    if (hasProductOrService()) {
      protoValue.setProductOrService(productOrService.toProto())
    }
    if (hasModifier()) {
      protoValue.addAllModifier(modifier.map { it.toProto() })
    }
    if (hasProvider()) {
      protoValue.setProvider(provider.toProto())
    }
    if (hasQuantity()) {
      protoValue.setQuantity((quantity as SimpleQuantity).toProto())
    }
    if (hasUnitPrice()) {
      protoValue.setUnitPrice(unitPrice.toProto())
    }
    if (hasFacility()) {
      protoValue.setFacility(facility.toProto())
    }
    if (hasDiagnosis()) {
      protoValue.addAllDiagnosis(diagnosis.map { it.toProto() })
    }
    if (hasDetail()) {
      protoValue.addAllDetail(detail.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.CoverageEligibilityRequest.DiagnosisComponent.toProto():
      CoverageEligibilityRequest.Details.Diagnosis {
    val protoValue = CoverageEligibilityRequest.Details.Diagnosis.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDiagnosis()) {
      protoValue.setDiagnosis(diagnosis.coverageEligibilityRequestItemDiagnosisDiagnosisToProto())
    }
    return protoValue.build()
  }

  private fun CoverageEligibilityRequest.SupportingInformation.toHapi():
      org.hl7.fhir.r4.model.CoverageEligibilityRequest.SupportingInformationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.CoverageEligibilityRequest.SupportingInformationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasSequence()) {
      hapiValue.setSequenceElement(sequence.toHapi())
    }
    if (hasInformation()) {
      hapiValue.setInformation(information.toHapi())
    }
    if (hasAppliesToAll()) {
      hapiValue.setAppliesToAllElement(appliesToAll.toHapi())
    }
    return hapiValue
  }

  private fun CoverageEligibilityRequest.Insurance.toHapi():
      org.hl7.fhir.r4.model.CoverageEligibilityRequest.InsuranceComponent {
    val hapiValue = org.hl7.fhir.r4.model.CoverageEligibilityRequest.InsuranceComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasFocal()) {
      hapiValue.setFocalElement(focal.toHapi())
    }
    if (hasCoverage()) {
      hapiValue.setCoverage(coverage.toHapi())
    }
    if (hasBusinessArrangement()) {
      hapiValue.setBusinessArrangementElement(businessArrangement.toHapi())
    }
    return hapiValue
  }

  private fun CoverageEligibilityRequest.Details.toHapi():
      org.hl7.fhir.r4.model.CoverageEligibilityRequest.DetailsComponent {
    val hapiValue = org.hl7.fhir.r4.model.CoverageEligibilityRequest.DetailsComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (supportingInfoSequenceCount > 0) {
      hapiValue.setSupportingInfoSequence(supportingInfoSequenceList.map { it.toHapi() })
    }
    if (hasCategory()) {
      hapiValue.setCategory(category.toHapi())
    }
    if (hasProductOrService()) {
      hapiValue.setProductOrService(productOrService.toHapi())
    }
    if (modifierCount > 0) {
      hapiValue.setModifier(modifierList.map { it.toHapi() })
    }
    if (hasProvider()) {
      hapiValue.setProvider(provider.toHapi())
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (hasUnitPrice()) {
      hapiValue.setUnitPrice(unitPrice.toHapi())
    }
    if (hasFacility()) {
      hapiValue.setFacility(facility.toHapi())
    }
    if (diagnosisCount > 0) {
      hapiValue.setDiagnosis(diagnosisList.map { it.toHapi() })
    }
    if (detailCount > 0) {
      hapiValue.setDetail(detailList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun CoverageEligibilityRequest.Details.Diagnosis.toHapi():
      org.hl7.fhir.r4.model.CoverageEligibilityRequest.DiagnosisComponent {
    val hapiValue = org.hl7.fhir.r4.model.CoverageEligibilityRequest.DiagnosisComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasDiagnosis()) {
      hapiValue.setDiagnosis(diagnosis.coverageEligibilityRequestItemDiagnosisDiagnosisToHapi())
    }
    return hapiValue
  }
}
