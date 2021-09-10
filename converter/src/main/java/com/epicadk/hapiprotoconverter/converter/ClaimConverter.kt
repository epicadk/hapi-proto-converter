package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AddressConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AddressConverter.toProto
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Claim
import com.google.fhir.r4.core.Claim.Accident
import com.google.fhir.r4.core.Claim.Diagnosis
import com.google.fhir.r4.core.Claim.Item
import com.google.fhir.r4.core.Claim.Item.Detail
import com.google.fhir.r4.core.Claim.Procedure
import com.google.fhir.r4.core.Claim.SupportingInformation
import com.google.fhir.r4.core.FinancialResourceStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.UseCode
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Address
import org.hl7.fhir.r4.model.Attachment
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.DateType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Quantity
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object ClaimConverter {
  private fun Claim.SupportingInformation.TimingX.claimSupportingInfoTimingToHapi(): Type {
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Claim.supportingInfo.timing[x]")
  }

  private fun Type.claimSupportingInfoTimingToProto(): Claim.SupportingInformation.TimingX {
    val protoValue = Claim.SupportingInformation.TimingX.newBuilder()
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  private fun Claim.SupportingInformation.ValueX.claimSupportingInfoValueToHapi(): Type {
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasAttachment()) {
      return (this.getAttachment()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Claim.supportingInfo.value[x]")
  }

  private fun Type.claimSupportingInfoValueToProto(): Claim.SupportingInformation.ValueX {
    val protoValue = Claim.SupportingInformation.ValueX.newBuilder()
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is Attachment) {
      protoValue.setAttachment(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private fun Claim.Diagnosis.DiagnosisX.claimDiagnosisDiagnosisToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Claim.diagnosis.diagnosis[x]")
  }

  private fun Type.claimDiagnosisDiagnosisToProto(): Claim.Diagnosis.DiagnosisX {
    val protoValue = Claim.Diagnosis.DiagnosisX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private fun Claim.Procedure.ProcedureX.claimProcedureProcedureToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Claim.procedure.procedure[x]")
  }

  private fun Type.claimProcedureProcedureToProto(): Claim.Procedure.ProcedureX {
    val protoValue = Claim.Procedure.ProcedureX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private fun Claim.Accident.LocationX.claimAccidentLocationToHapi(): Type {
    if (hasAddress()) {
      return (this.getAddress()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Claim.accident.location[x]")
  }

  private fun Type.claimAccidentLocationToProto(): Claim.Accident.LocationX {
    val protoValue = Claim.Accident.LocationX.newBuilder()
    if (this is Address) {
      protoValue.setAddress(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private fun Claim.Item.ServicedX.claimItemServicedToHapi(): Type {
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Claim.item.serviced[x]")
  }

  private fun Type.claimItemServicedToProto(): Claim.Item.ServicedX {
    val protoValue = Claim.Item.ServicedX.newBuilder()
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  private fun Claim.Item.LocationX.claimItemLocationToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasAddress()) {
      return (this.getAddress()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Claim.item.location[x]")
  }

  private fun Type.claimItemLocationToProto(): Claim.Item.LocationX {
    val protoValue = Claim.Item.LocationX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Address) {
      protoValue.setAddress(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  public fun Claim.toHapi(): org.hl7.fhir.r4.model.Claim {
    val hapiValue = org.hl7.fhir.r4.model.Claim()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.Claim.ClaimStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasSubType()) {
      hapiValue.setSubType(subType.toHapi())
    }
    if (hasUse()) {
      hapiValue.setUse(org.hl7.fhir.r4.model.Claim.Use.valueOf(use.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPatient()) {
      hapiValue.setPatient(patient.toHapi())
    }
    if (hasBillablePeriod()) {
      hapiValue.setBillablePeriod(billablePeriod.toHapi())
    }
    if (hasCreated()) {
      hapiValue.setCreatedElement(created.toHapi())
    }
    if (hasEnterer()) {
      hapiValue.setEnterer(enterer.toHapi())
    }
    if (hasInsurer()) {
      hapiValue.setInsurer(insurer.toHapi())
    }
    if (hasProvider()) {
      hapiValue.setProvider(provider.toHapi())
    }
    if (hasPriority()) {
      hapiValue.setPriority(priority.toHapi())
    }
    if (hasFundsReserve()) {
      hapiValue.setFundsReserve(fundsReserve.toHapi())
    }
    if (relatedCount > 0) {
      hapiValue.setRelated(relatedList.map { it.toHapi() })
    }
    if (hasPrescription()) {
      hapiValue.setPrescription(prescription.toHapi())
    }
    if (hasOriginalPrescription()) {
      hapiValue.setOriginalPrescription(originalPrescription.toHapi())
    }
    if (hasPayee()) {
      hapiValue.setPayee(payee.toHapi())
    }
    if (hasReferral()) {
      hapiValue.setReferral(referral.toHapi())
    }
    if (hasFacility()) {
      hapiValue.setFacility(facility.toHapi())
    }
    if (careTeamCount > 0) {
      hapiValue.setCareTeam(careTeamList.map { it.toHapi() })
    }
    if (supportingInfoCount > 0) {
      hapiValue.setSupportingInfo(supportingInfoList.map { it.toHapi() })
    }
    if (diagnosisCount > 0) {
      hapiValue.setDiagnosis(diagnosisList.map { it.toHapi() })
    }
    if (procedureCount > 0) {
      hapiValue.setProcedure(procedureList.map { it.toHapi() })
    }
    if (insuranceCount > 0) {
      hapiValue.setInsurance(insuranceList.map { it.toHapi() })
    }
    if (hasAccident()) {
      hapiValue.setAccident(accident.toHapi())
    }
    if (itemCount > 0) {
      hapiValue.setItem(itemList.map { it.toHapi() })
    }
    if (hasTotal()) {
      hapiValue.setTotal(total.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Claim.toProto(): Claim {
    val protoValue = Claim.newBuilder()
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
      protoValue.setStatus(Claim.StatusCode.newBuilder().setValue(FinancialResourceStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasSubType()) {
      protoValue.setSubType(subType.toProto())
    }
    if (hasUse()) {
      protoValue.setUse(Claim.UseCode.newBuilder().setValue(UseCode.Value.valueOf(use.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPatient()) {
      protoValue.setPatient(patient.toProto())
    }
    if (hasBillablePeriod()) {
      protoValue.setBillablePeriod(billablePeriod.toProto())
    }
    if (hasCreated()) {
      protoValue.setCreated(createdElement.toProto())
    }
    if (hasEnterer()) {
      protoValue.setEnterer(enterer.toProto())
    }
    if (hasInsurer()) {
      protoValue.setInsurer(insurer.toProto())
    }
    if (hasProvider()) {
      protoValue.setProvider(provider.toProto())
    }
    if (hasPriority()) {
      protoValue.setPriority(priority.toProto())
    }
    if (hasFundsReserve()) {
      protoValue.setFundsReserve(fundsReserve.toProto())
    }
    if (hasRelated()) {
      protoValue.addAllRelated(related.map { it.toProto() })
    }
    if (hasPrescription()) {
      protoValue.setPrescription(prescription.toProto())
    }
    if (hasOriginalPrescription()) {
      protoValue.setOriginalPrescription(originalPrescription.toProto())
    }
    if (hasPayee()) {
      protoValue.setPayee(payee.toProto())
    }
    if (hasReferral()) {
      protoValue.setReferral(referral.toProto())
    }
    if (hasFacility()) {
      protoValue.setFacility(facility.toProto())
    }
    if (hasCareTeam()) {
      protoValue.addAllCareTeam(careTeam.map { it.toProto() })
    }
    if (hasSupportingInfo()) {
      protoValue.addAllSupportingInfo(supportingInfo.map { it.toProto() })
    }
    if (hasDiagnosis()) {
      protoValue.addAllDiagnosis(diagnosis.map { it.toProto() })
    }
    if (hasProcedure()) {
      protoValue.addAllProcedure(procedure.map { it.toProto() })
    }
    if (hasInsurance()) {
      protoValue.addAllInsurance(insurance.map { it.toProto() })
    }
    if (hasAccident()) {
      protoValue.setAccident(accident.toProto())
    }
    if (hasItem()) {
      protoValue.addAllItem(item.map { it.toProto() })
    }
    if (hasTotal()) {
      protoValue.setTotal(total.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Claim.RelatedClaimComponent.toProto(): Claim.RelatedClaim {
    val protoValue = Claim.RelatedClaim.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasRelationship()) {
      protoValue.setRelationship(relationship.toProto())
    }
    if (hasReference()) {
      protoValue.setReference(reference.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Claim.PayeeComponent.toProto(): Claim.Payee {
    val protoValue = Claim.Payee.newBuilder()
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
    if (hasParty()) {
      protoValue.setParty(party.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Claim.CareTeamComponent.toProto(): Claim.CareTeam {
    val protoValue = Claim.CareTeam.newBuilder()
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
    if (hasProvider()) {
      protoValue.setProvider(provider.toProto())
    }
    if (hasResponsible()) {
      protoValue.setResponsible(responsibleElement.toProto())
    }
    if (hasRole()) {
      protoValue.setRole(role.toProto())
    }
    if (hasQualification()) {
      protoValue.setQualification(qualification.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Claim.SupportingInformationComponent.toProto():
      Claim.SupportingInformation {
    val protoValue = Claim.SupportingInformation.newBuilder()
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
    if (hasCategory()) {
      protoValue.setCategory(category.toProto())
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasTiming()) {
      protoValue.setTiming(timing.claimSupportingInfoTimingToProto())
    }
    if (hasValue()) {
      protoValue.setValue(value.claimSupportingInfoValueToProto())
    }
    if (hasReason()) {
      protoValue.setReason(reason.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Claim.DiagnosisComponent.toProto(): Claim.Diagnosis {
    val protoValue = Claim.Diagnosis.newBuilder()
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
    if (hasDiagnosis()) {
      protoValue.setDiagnosis(diagnosis.claimDiagnosisDiagnosisToProto())
    }
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasOnAdmission()) {
      protoValue.setOnAdmission(onAdmission.toProto())
    }
    if (hasPackageCode()) {
      protoValue.setPackageCode(packageCode.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Claim.ProcedureComponent.toProto(): Claim.Procedure {
    val protoValue = Claim.Procedure.newBuilder()
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
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasProcedure()) {
      protoValue.setProcedure(procedure.claimProcedureProcedureToProto())
    }
    if (hasUdi()) {
      protoValue.addAllUdi(udi.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Claim.InsuranceComponent.toProto(): Claim.Insurance {
    val protoValue = Claim.Insurance.newBuilder()
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
    if (hasFocal()) {
      protoValue.setFocal(focalElement.toProto())
    }
    if (hasIdentifier()) {
      protoValue.setIdentifier(identifier.toProto())
    }
    if (hasCoverage()) {
      protoValue.setCoverage(coverage.toProto())
    }
    if (hasBusinessArrangement()) {
      protoValue.setBusinessArrangement(businessArrangementElement.toProto())
    }
    if (hasPreAuthRef()) {
      protoValue.addAllPreAuthRef(preAuthRef.map { it.toProto() })
    }
    if (hasClaimResponse()) {
      protoValue.setClaimResponse(claimResponse.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Claim.AccidentComponent.toProto(): Claim.Accident {
    val protoValue = Claim.Accident.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasLocation()) {
      protoValue.setLocation(location.claimAccidentLocationToProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Claim.ItemComponent.toProto(): Claim.Item {
    val protoValue = Claim.Item.newBuilder()
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
    if (hasCareTeamSequence()) {
      protoValue.addAllCareTeamSequence(careTeamSequence.map { it.toProto() })
    }
    if (hasDiagnosisSequence()) {
      protoValue.addAllDiagnosisSequence(diagnosisSequence.map { it.toProto() })
    }
    if (hasProcedureSequence()) {
      protoValue.addAllProcedureSequence(procedureSequence.map { it.toProto() })
    }
    if (hasInformationSequence()) {
      protoValue.addAllInformationSequence(informationSequence.map { it.toProto() })
    }
    if (hasRevenue()) {
      protoValue.setRevenue(revenue.toProto())
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
    if (hasProgramCode()) {
      protoValue.addAllProgramCode(programCode.map { it.toProto() })
    }
    if (hasServiced()) {
      protoValue.setServiced(serviced.claimItemServicedToProto())
    }
    if (hasLocation()) {
      protoValue.setLocation(location.claimItemLocationToProto())
    }
    if (hasQuantity()) {
      protoValue.setQuantity((quantity as SimpleQuantity).toProto())
    }
    if (hasUnitPrice()) {
      protoValue.setUnitPrice(unitPrice.toProto())
    }
    if (hasFactor()) {
      protoValue.setFactor(factorElement.toProto())
    }
    if (hasNet()) {
      protoValue.setNet(net.toProto())
    }
    if (hasUdi()) {
      protoValue.addAllUdi(udi.map { it.toProto() })
    }
    if (hasBodySite()) {
      protoValue.setBodySite(bodySite.toProto())
    }
    if (hasSubSite()) {
      protoValue.addAllSubSite(subSite.map { it.toProto() })
    }
    if (hasEncounter()) {
      protoValue.addAllEncounter(encounter.map { it.toProto() })
    }
    if (hasDetail()) {
      protoValue.addAllDetail(detail.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Claim.DetailComponent.toProto(): Claim.Item.Detail {
    val protoValue = Claim.Item.Detail.newBuilder()
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
    if (hasRevenue()) {
      protoValue.setRevenue(revenue.toProto())
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
    if (hasProgramCode()) {
      protoValue.addAllProgramCode(programCode.map { it.toProto() })
    }
    if (hasQuantity()) {
      protoValue.setQuantity((quantity as SimpleQuantity).toProto())
    }
    if (hasUnitPrice()) {
      protoValue.setUnitPrice(unitPrice.toProto())
    }
    if (hasFactor()) {
      protoValue.setFactor(factorElement.toProto())
    }
    if (hasNet()) {
      protoValue.setNet(net.toProto())
    }
    if (hasUdi()) {
      protoValue.addAllUdi(udi.map { it.toProto() })
    }
    if (hasSubDetail()) {
      protoValue.addAllSubDetail(subDetail.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Claim.SubDetailComponent.toProto():
      Claim.Item.Detail.SubDetail {
    val protoValue = Claim.Item.Detail.SubDetail.newBuilder()
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
    if (hasRevenue()) {
      protoValue.setRevenue(revenue.toProto())
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
    if (hasProgramCode()) {
      protoValue.addAllProgramCode(programCode.map { it.toProto() })
    }
    if (hasQuantity()) {
      protoValue.setQuantity((quantity as SimpleQuantity).toProto())
    }
    if (hasUnitPrice()) {
      protoValue.setUnitPrice(unitPrice.toProto())
    }
    if (hasFactor()) {
      protoValue.setFactor(factorElement.toProto())
    }
    if (hasNet()) {
      protoValue.setNet(net.toProto())
    }
    if (hasUdi()) {
      protoValue.addAllUdi(udi.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun Claim.RelatedClaim.toHapi(): org.hl7.fhir.r4.model.Claim.RelatedClaimComponent {
    val hapiValue = org.hl7.fhir.r4.model.Claim.RelatedClaimComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasRelationship()) {
      hapiValue.setRelationship(relationship.toHapi())
    }
    if (hasReference()) {
      hapiValue.setReference(reference.toHapi())
    }
    return hapiValue
  }

  private fun Claim.Payee.toHapi(): org.hl7.fhir.r4.model.Claim.PayeeComponent {
    val hapiValue = org.hl7.fhir.r4.model.Claim.PayeeComponent()
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
    if (hasParty()) {
      hapiValue.setParty(party.toHapi())
    }
    return hapiValue
  }

  private fun Claim.CareTeam.toHapi(): org.hl7.fhir.r4.model.Claim.CareTeamComponent {
    val hapiValue = org.hl7.fhir.r4.model.Claim.CareTeamComponent()
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
    if (hasProvider()) {
      hapiValue.setProvider(provider.toHapi())
    }
    if (hasResponsible()) {
      hapiValue.setResponsibleElement(responsible.toHapi())
    }
    if (hasRole()) {
      hapiValue.setRole(role.toHapi())
    }
    if (hasQualification()) {
      hapiValue.setQualification(qualification.toHapi())
    }
    return hapiValue
  }

  private fun Claim.SupportingInformation.toHapi():
      org.hl7.fhir.r4.model.Claim.SupportingInformationComponent {
    val hapiValue = org.hl7.fhir.r4.model.Claim.SupportingInformationComponent()
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
    if (hasCategory()) {
      hapiValue.setCategory(category.toHapi())
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasTiming()) {
      hapiValue.setTiming(timing.claimSupportingInfoTimingToHapi())
    }
    if (hasValue()) {
      hapiValue.setValue(value.claimSupportingInfoValueToHapi())
    }
    if (hasReason()) {
      hapiValue.setReason(reason.toHapi())
    }
    return hapiValue
  }

  private fun Claim.Diagnosis.toHapi(): org.hl7.fhir.r4.model.Claim.DiagnosisComponent {
    val hapiValue = org.hl7.fhir.r4.model.Claim.DiagnosisComponent()
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
    if (hasDiagnosis()) {
      hapiValue.setDiagnosis(diagnosis.claimDiagnosisDiagnosisToHapi())
    }
    if (typeCount > 0) {
      hapiValue.setType(typeList.map { it.toHapi() })
    }
    if (hasOnAdmission()) {
      hapiValue.setOnAdmission(onAdmission.toHapi())
    }
    if (hasPackageCode()) {
      hapiValue.setPackageCode(packageCode.toHapi())
    }
    return hapiValue
  }

  private fun Claim.Procedure.toHapi(): org.hl7.fhir.r4.model.Claim.ProcedureComponent {
    val hapiValue = org.hl7.fhir.r4.model.Claim.ProcedureComponent()
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
    if (typeCount > 0) {
      hapiValue.setType(typeList.map { it.toHapi() })
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasProcedure()) {
      hapiValue.setProcedure(procedure.claimProcedureProcedureToHapi())
    }
    if (udiCount > 0) {
      hapiValue.setUdi(udiList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun Claim.Insurance.toHapi(): org.hl7.fhir.r4.model.Claim.InsuranceComponent {
    val hapiValue = org.hl7.fhir.r4.model.Claim.InsuranceComponent()
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
    if (hasFocal()) {
      hapiValue.setFocalElement(focal.toHapi())
    }
    if (hasIdentifier()) {
      hapiValue.setIdentifier(identifier.toHapi())
    }
    if (hasCoverage()) {
      hapiValue.setCoverage(coverage.toHapi())
    }
    if (hasBusinessArrangement()) {
      hapiValue.setBusinessArrangementElement(businessArrangement.toHapi())
    }
    if (preAuthRefCount > 0) {
      hapiValue.setPreAuthRef(preAuthRefList.map { it.toHapi() })
    }
    if (hasClaimResponse()) {
      hapiValue.setClaimResponse(claimResponse.toHapi())
    }
    return hapiValue
  }

  private fun Claim.Accident.toHapi(): org.hl7.fhir.r4.model.Claim.AccidentComponent {
    val hapiValue = org.hl7.fhir.r4.model.Claim.AccidentComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasLocation()) {
      hapiValue.setLocation(location.claimAccidentLocationToHapi())
    }
    return hapiValue
  }

  private fun Claim.Item.toHapi(): org.hl7.fhir.r4.model.Claim.ItemComponent {
    val hapiValue = org.hl7.fhir.r4.model.Claim.ItemComponent()
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
    if (careTeamSequenceCount > 0) {
      hapiValue.setCareTeamSequence(careTeamSequenceList.map { it.toHapi() })
    }
    if (diagnosisSequenceCount > 0) {
      hapiValue.setDiagnosisSequence(diagnosisSequenceList.map { it.toHapi() })
    }
    if (procedureSequenceCount > 0) {
      hapiValue.setProcedureSequence(procedureSequenceList.map { it.toHapi() })
    }
    if (informationSequenceCount > 0) {
      hapiValue.setInformationSequence(informationSequenceList.map { it.toHapi() })
    }
    if (hasRevenue()) {
      hapiValue.setRevenue(revenue.toHapi())
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
    if (programCodeCount > 0) {
      hapiValue.setProgramCode(programCodeList.map { it.toHapi() })
    }
    if (hasServiced()) {
      hapiValue.setServiced(serviced.claimItemServicedToHapi())
    }
    if (hasLocation()) {
      hapiValue.setLocation(location.claimItemLocationToHapi())
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (hasUnitPrice()) {
      hapiValue.setUnitPrice(unitPrice.toHapi())
    }
    if (hasFactor()) {
      hapiValue.setFactorElement(factor.toHapi())
    }
    if (hasNet()) {
      hapiValue.setNet(net.toHapi())
    }
    if (udiCount > 0) {
      hapiValue.setUdi(udiList.map { it.toHapi() })
    }
    if (hasBodySite()) {
      hapiValue.setBodySite(bodySite.toHapi())
    }
    if (subSiteCount > 0) {
      hapiValue.setSubSite(subSiteList.map { it.toHapi() })
    }
    if (encounterCount > 0) {
      hapiValue.setEncounter(encounterList.map { it.toHapi() })
    }
    if (detailCount > 0) {
      hapiValue.setDetail(detailList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun Claim.Item.Detail.toHapi(): org.hl7.fhir.r4.model.Claim.DetailComponent {
    val hapiValue = org.hl7.fhir.r4.model.Claim.DetailComponent()
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
    if (hasRevenue()) {
      hapiValue.setRevenue(revenue.toHapi())
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
    if (programCodeCount > 0) {
      hapiValue.setProgramCode(programCodeList.map { it.toHapi() })
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (hasUnitPrice()) {
      hapiValue.setUnitPrice(unitPrice.toHapi())
    }
    if (hasFactor()) {
      hapiValue.setFactorElement(factor.toHapi())
    }
    if (hasNet()) {
      hapiValue.setNet(net.toHapi())
    }
    if (udiCount > 0) {
      hapiValue.setUdi(udiList.map { it.toHapi() })
    }
    if (subDetailCount > 0) {
      hapiValue.setSubDetail(subDetailList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun Claim.Item.Detail.SubDetail.toHapi(): org.hl7.fhir.r4.model.Claim.SubDetailComponent {
    val hapiValue = org.hl7.fhir.r4.model.Claim.SubDetailComponent()
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
    if (hasRevenue()) {
      hapiValue.setRevenue(revenue.toHapi())
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
    if (programCodeCount > 0) {
      hapiValue.setProgramCode(programCodeList.map { it.toHapi() })
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (hasUnitPrice()) {
      hapiValue.setUnitPrice(unitPrice.toHapi())
    }
    if (hasFactor()) {
      hapiValue.setFactorElement(factor.toHapi())
    }
    if (hasNet()) {
      hapiValue.setNet(net.toHapi())
    }
    if (udiCount > 0) {
      hapiValue.setUdi(udiList.map { it.toHapi() })
    }
    return hapiValue
  }
}
