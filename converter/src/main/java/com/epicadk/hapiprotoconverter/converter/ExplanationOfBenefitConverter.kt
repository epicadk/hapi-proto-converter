package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AddressConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AddressConverter.toProto
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.ClaimProcessingCode
import com.google.fhir.r4.core.ExplanationOfBenefit
import com.google.fhir.r4.core.ExplanationOfBenefit.Accident
import com.google.fhir.r4.core.ExplanationOfBenefit.AddedItem
import com.google.fhir.r4.core.ExplanationOfBenefit.AddedItem.AddedItemDetail
import com.google.fhir.r4.core.ExplanationOfBenefit.BenefitBalance
import com.google.fhir.r4.core.ExplanationOfBenefit.BenefitBalance.Benefit
import com.google.fhir.r4.core.ExplanationOfBenefit.Diagnosis
import com.google.fhir.r4.core.ExplanationOfBenefit.Item
import com.google.fhir.r4.core.ExplanationOfBenefit.Item.Detail
import com.google.fhir.r4.core.ExplanationOfBenefit.Note
import com.google.fhir.r4.core.ExplanationOfBenefit.Procedure
import com.google.fhir.r4.core.ExplanationOfBenefit.SupportingInformation
import com.google.fhir.r4.core.ExplanationOfBenefitStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.NoteTypeCode
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.UseCode
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Address
import org.hl7.fhir.r4.model.Attachment
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.DateType
import org.hl7.fhir.r4.model.Enumerations
import org.hl7.fhir.r4.model.Money
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Quantity
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type
import org.hl7.fhir.r4.model.UnsignedIntType

public object ExplanationOfBenefitConverter {
  private
      fun ExplanationOfBenefit.SupportingInformation.TimingX.explanationOfBenefitSupportingInfoTimingToHapi():
      Type {
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.supportingInfo.timing[x]")
  }

  private fun Type.explanationOfBenefitSupportingInfoTimingToProto():
      ExplanationOfBenefit.SupportingInformation.TimingX {
    val protoValue = ExplanationOfBenefit.SupportingInformation.TimingX.newBuilder()
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun ExplanationOfBenefit.SupportingInformation.ValueX.explanationOfBenefitSupportingInfoValueToHapi():
      Type {
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
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.supportingInfo.value[x]")
  }

  private fun Type.explanationOfBenefitSupportingInfoValueToProto():
      ExplanationOfBenefit.SupportingInformation.ValueX {
    val protoValue = ExplanationOfBenefit.SupportingInformation.ValueX.newBuilder()
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

  private
      fun ExplanationOfBenefit.Diagnosis.DiagnosisX.explanationOfBenefitDiagnosisDiagnosisToHapi():
      Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.diagnosis.diagnosis[x]")
  }

  private fun Type.explanationOfBenefitDiagnosisDiagnosisToProto():
      ExplanationOfBenefit.Diagnosis.DiagnosisX {
    val protoValue = ExplanationOfBenefit.Diagnosis.DiagnosisX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun ExplanationOfBenefit.Procedure.ProcedureX.explanationOfBenefitProcedureProcedureToHapi():
      Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.procedure.procedure[x]")
  }

  private fun Type.explanationOfBenefitProcedureProcedureToProto():
      ExplanationOfBenefit.Procedure.ProcedureX {
    val protoValue = ExplanationOfBenefit.Procedure.ProcedureX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private fun ExplanationOfBenefit.Accident.LocationX.explanationOfBenefitAccidentLocationToHapi():
      Type {
    if (hasAddress()) {
      return (this.getAddress()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.accident.location[x]")
  }

  private fun Type.explanationOfBenefitAccidentLocationToProto():
      ExplanationOfBenefit.Accident.LocationX {
    val protoValue = ExplanationOfBenefit.Accident.LocationX.newBuilder()
    if (this is Address) {
      protoValue.setAddress(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private fun ExplanationOfBenefit.Item.ServicedX.explanationOfBenefitItemServicedToHapi(): Type {
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.item.serviced[x]")
  }

  private fun Type.explanationOfBenefitItemServicedToProto(): ExplanationOfBenefit.Item.ServicedX {
    val protoValue = ExplanationOfBenefit.Item.ServicedX.newBuilder()
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  private fun ExplanationOfBenefit.Item.LocationX.explanationOfBenefitItemLocationToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasAddress()) {
      return (this.getAddress()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.item.location[x]")
  }

  private fun Type.explanationOfBenefitItemLocationToProto(): ExplanationOfBenefit.Item.LocationX {
    val protoValue = ExplanationOfBenefit.Item.LocationX.newBuilder()
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

  private fun ExplanationOfBenefit.AddedItem.ServicedX.explanationOfBenefitAddItemServicedToHapi():
      Type {
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.addItem.serviced[x]")
  }

  private fun Type.explanationOfBenefitAddItemServicedToProto():
      ExplanationOfBenefit.AddedItem.ServicedX {
    val protoValue = ExplanationOfBenefit.AddedItem.ServicedX.newBuilder()
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  private fun ExplanationOfBenefit.AddedItem.LocationX.explanationOfBenefitAddItemLocationToHapi():
      Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasAddress()) {
      return (this.getAddress()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.addItem.location[x]")
  }

  private fun Type.explanationOfBenefitAddItemLocationToProto():
      ExplanationOfBenefit.AddedItem.LocationX {
    val protoValue = ExplanationOfBenefit.AddedItem.LocationX.newBuilder()
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

  private
      fun ExplanationOfBenefit.BenefitBalance.Benefit.AllowedX.explanationOfBenefitBenefitBalanceFinancialAllowedToHapi():
      Type {
    if (hasUnsignedInt()) {
      return (this.getUnsignedInt()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    if (hasMoney()) {
      return (this.getMoney()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for ExplanationOfBenefit.benefitBalance.financial.allowed[x]")
  }

  private fun Type.explanationOfBenefitBenefitBalanceFinancialAllowedToProto():
      ExplanationOfBenefit.BenefitBalance.Benefit.AllowedX {
    val protoValue = ExplanationOfBenefit.BenefitBalance.Benefit.AllowedX.newBuilder()
    if (this is UnsignedIntType) {
      protoValue.setUnsignedInt(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is Money) {
      protoValue.setMoney(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun ExplanationOfBenefit.BenefitBalance.Benefit.UsedX.explanationOfBenefitBenefitBalanceFinancialUsedToHapi():
      Type {
    if (hasUnsignedInt()) {
      return (this.getUnsignedInt()).toHapi()
    }
    if (hasMoney()) {
      return (this.getMoney()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for ExplanationOfBenefit.benefitBalance.financial.used[x]")
  }

  private fun Type.explanationOfBenefitBenefitBalanceFinancialUsedToProto():
      ExplanationOfBenefit.BenefitBalance.Benefit.UsedX {
    val protoValue = ExplanationOfBenefit.BenefitBalance.Benefit.UsedX.newBuilder()
    if (this is UnsignedIntType) {
      protoValue.setUnsignedInt(this.toProto())
    }
    if (this is Money) {
      protoValue.setMoney(this.toProto())
    }
    return protoValue.build()
  }

  public fun ExplanationOfBenefit.toHapi(): org.hl7.fhir.r4.model.ExplanationOfBenefit {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.ExplanationOfBenefit.ExplanationOfBenefitStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasSubType()) {
      hapiValue.setSubType(subType.toHapi())
    }
    if (hasUse()) {
      hapiValue.setUse(org.hl7.fhir.r4.model.ExplanationOfBenefit.Use.valueOf(use.value.name.hapiCodeCheck().replace("_", "")))
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
    if (hasFundsReserveRequested()) {
      hapiValue.setFundsReserveRequested(fundsReserveRequested.toHapi())
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
    if (hasClaim()) {
      hapiValue.setClaim(claim.toHapi())
    }
    if (hasClaimResponse()) {
      hapiValue.setClaimResponse(claimResponse.toHapi())
    }
    if (hasOutcome()) {
      hapiValue.setOutcome(org.hl7.fhir.r4.model.ExplanationOfBenefit.RemittanceOutcome.valueOf(outcome.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDisposition()) {
      hapiValue.setDispositionElement(disposition.toHapi())
    }
    if (preAuthRefCount > 0) {
      hapiValue.setPreAuthRef(preAuthRefList.map { it.toHapi() })
    }
    if (preAuthRefPeriodCount > 0) {
      hapiValue.setPreAuthRefPeriod(preAuthRefPeriodList.map { it.toHapi() })
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
    if (hasPrecedence()) {
      hapiValue.setPrecedenceElement(precedence.toHapi())
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
    if (addItemCount > 0) {
      hapiValue.setAddItem(addItemList.map { it.toHapi() })
    }
    if (totalCount > 0) {
      hapiValue.setTotal(totalList.map { it.toHapi() })
    }
    if (hasPayment()) {
      hapiValue.setPayment(payment.toHapi())
    }
    if (hasFormCode()) {
      hapiValue.setFormCode(formCode.toHapi())
    }
    if (hasForm()) {
      hapiValue.setForm(form.toHapi())
    }
    if (processNoteCount > 0) {
      hapiValue.setProcessNote(processNoteList.map { it.toHapi() })
    }
    if (hasBenefitPeriod()) {
      hapiValue.setBenefitPeriod(benefitPeriod.toHapi())
    }
    if (benefitBalanceCount > 0) {
      hapiValue.setBenefitBalance(benefitBalanceList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ExplanationOfBenefit.toProto(): ExplanationOfBenefit {
    val protoValue = ExplanationOfBenefit.newBuilder()
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
      protoValue.setStatus(ExplanationOfBenefit.StatusCode.newBuilder().setValue(ExplanationOfBenefitStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasSubType()) {
      protoValue.setSubType(subType.toProto())
    }
    if (hasUse()) {
      protoValue.setUse(ExplanationOfBenefit.UseCode.newBuilder().setValue(UseCode.Value.valueOf(use.toCode().protoCodeCheck().replace("-",
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
    if (hasFundsReserveRequested()) {
      protoValue.setFundsReserveRequested(fundsReserveRequested.toProto())
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
    if (hasClaim()) {
      protoValue.setClaim(claim.toProto())
    }
    if (hasClaimResponse()) {
      protoValue.setClaimResponse(claimResponse.toProto())
    }
    if (hasOutcome()) {
      protoValue.setOutcome(ExplanationOfBenefit.OutcomeCode.newBuilder().setValue(ClaimProcessingCode.Value.valueOf(outcome.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDisposition()) {
      protoValue.setDisposition(dispositionElement.toProto())
    }
    if (hasPreAuthRef()) {
      protoValue.addAllPreAuthRef(preAuthRef.map { it.toProto() })
    }
    if (hasPreAuthRefPeriod()) {
      protoValue.addAllPreAuthRefPeriod(preAuthRefPeriod.map { it.toProto() })
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
    if (hasPrecedence()) {
      protoValue.setPrecedence(precedenceElement.toProto())
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
    if (hasAddItem()) {
      protoValue.addAllAddItem(addItem.map { it.toProto() })
    }
    if (hasTotal()) {
      protoValue.addAllTotal(total.map { it.toProto() })
    }
    if (hasPayment()) {
      protoValue.setPayment(payment.toProto())
    }
    if (hasFormCode()) {
      protoValue.setFormCode(formCode.toProto())
    }
    if (hasForm()) {
      protoValue.setForm(form.toProto())
    }
    if (hasProcessNote()) {
      protoValue.addAllProcessNote(processNote.map { it.toProto() })
    }
    if (hasBenefitPeriod()) {
      protoValue.setBenefitPeriod(benefitPeriod.toProto())
    }
    if (hasBenefitBalance()) {
      protoValue.addAllBenefitBalance(benefitBalance.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.RelatedClaimComponent.toProto():
      ExplanationOfBenefit.RelatedClaim {
    val protoValue = ExplanationOfBenefit.RelatedClaim.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasClaim()) {
      protoValue.setClaim(claim.toProto())
    }
    if (hasRelationship()) {
      protoValue.setRelationship(relationship.toProto())
    }
    if (hasReference()) {
      protoValue.setReference(reference.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.PayeeComponent.toProto():
      ExplanationOfBenefit.Payee {
    val protoValue = ExplanationOfBenefit.Payee.newBuilder()
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

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.CareTeamComponent.toProto():
      ExplanationOfBenefit.CareTeam {
    val protoValue = ExplanationOfBenefit.CareTeam.newBuilder()
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

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.SupportingInformationComponent.toProto():
      ExplanationOfBenefit.SupportingInformation {
    val protoValue = ExplanationOfBenefit.SupportingInformation.newBuilder()
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
      protoValue.setTiming(timing.explanationOfBenefitSupportingInfoTimingToProto())
    }
    if (hasValue()) {
      protoValue.setValue(value.explanationOfBenefitSupportingInfoValueToProto())
    }
    if (hasReason()) {
      protoValue.setReason(reason.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.DiagnosisComponent.toProto():
      ExplanationOfBenefit.Diagnosis {
    val protoValue = ExplanationOfBenefit.Diagnosis.newBuilder()
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
      protoValue.setDiagnosis(diagnosis.explanationOfBenefitDiagnosisDiagnosisToProto())
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

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.ProcedureComponent.toProto():
      ExplanationOfBenefit.Procedure {
    val protoValue = ExplanationOfBenefit.Procedure.newBuilder()
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
      protoValue.setProcedure(procedure.explanationOfBenefitProcedureProcedureToProto())
    }
    if (hasUdi()) {
      protoValue.addAllUdi(udi.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.InsuranceComponent.toProto():
      ExplanationOfBenefit.Insurance {
    val protoValue = ExplanationOfBenefit.Insurance.newBuilder()
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
    if (hasPreAuthRef()) {
      protoValue.addAllPreAuthRef(preAuthRef.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.AccidentComponent.toProto():
      ExplanationOfBenefit.Accident {
    val protoValue = ExplanationOfBenefit.Accident.newBuilder()
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
      protoValue.setLocation(location.explanationOfBenefitAccidentLocationToProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.ItemComponent.toProto():
      ExplanationOfBenefit.Item {
    val protoValue = ExplanationOfBenefit.Item.newBuilder()
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
      protoValue.setServiced(serviced.explanationOfBenefitItemServicedToProto())
    }
    if (hasLocation()) {
      protoValue.setLocation(location.explanationOfBenefitItemLocationToProto())
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
    if (hasNoteNumber()) {
      protoValue.addAllNoteNumber(noteNumber.map { it.toProto() })
    }
    if (hasAdjudication()) {
      protoValue.addAllAdjudication(adjudication.map { it.toProto() })
    }
    if (hasDetail()) {
      protoValue.addAllDetail(detail.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent.toProto():
      ExplanationOfBenefit.Item.Adjudication {
    val protoValue = ExplanationOfBenefit.Item.Adjudication.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCategory()) {
      protoValue.setCategory(category.toProto())
    }
    if (hasReason()) {
      protoValue.setReason(reason.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount(amount.toProto())
    }
    if (hasValue()) {
      protoValue.setValue(valueElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.DetailComponent.toProto():
      ExplanationOfBenefit.Item.Detail {
    val protoValue = ExplanationOfBenefit.Item.Detail.newBuilder()
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
    if (hasNoteNumber()) {
      protoValue.addAllNoteNumber(noteNumber.map { it.toProto() })
    }
    if (hasSubDetail()) {
      protoValue.addAllSubDetail(subDetail.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.SubDetailComponent.toProto():
      ExplanationOfBenefit.Item.Detail.SubDetail {
    val protoValue = ExplanationOfBenefit.Item.Detail.SubDetail.newBuilder()
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
    if (hasNoteNumber()) {
      protoValue.addAllNoteNumber(noteNumber.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemComponent.toProto():
      ExplanationOfBenefit.AddedItem {
    val protoValue = ExplanationOfBenefit.AddedItem.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasItemSequence()) {
      protoValue.addAllItemSequence(itemSequence.map { it.toProto() })
    }
    if (hasDetailSequence()) {
      protoValue.addAllDetailSequence(detailSequence.map { it.toProto() })
    }
    if (hasSubDetailSequence()) {
      protoValue.addAllSubDetailSequence(subDetailSequence.map { it.toProto() })
    }
    if (hasProvider()) {
      protoValue.addAllProvider(provider.map { it.toProto() })
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
      protoValue.setServiced(serviced.explanationOfBenefitAddItemServicedToProto())
    }
    if (hasLocation()) {
      protoValue.setLocation(location.explanationOfBenefitAddItemLocationToProto())
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
    if (hasBodySite()) {
      protoValue.setBodySite(bodySite.toProto())
    }
    if (hasSubSite()) {
      protoValue.addAllSubSite(subSite.map { it.toProto() })
    }
    if (hasNoteNumber()) {
      protoValue.addAllNoteNumber(noteNumber.map { it.toProto() })
    }
    if (hasDetail()) {
      protoValue.addAllDetail(detail.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailComponent.toProto():
      ExplanationOfBenefit.AddedItem.AddedItemDetail {
    val protoValue = ExplanationOfBenefit.AddedItem.AddedItemDetail.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasProductOrService()) {
      protoValue.setProductOrService(productOrService.toProto())
    }
    if (hasModifier()) {
      protoValue.addAllModifier(modifier.map { it.toProto() })
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
    if (hasNoteNumber()) {
      protoValue.addAllNoteNumber(noteNumber.map { it.toProto() })
    }
    if (hasSubDetail()) {
      protoValue.addAllSubDetail(subDetail.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailSubDetailComponent.toProto():
      ExplanationOfBenefit.AddedItem.AddedItemDetail.AddedItemDetailSubDetail {
    val protoValue =
        ExplanationOfBenefit.AddedItem.AddedItemDetail.AddedItemDetailSubDetail.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasProductOrService()) {
      protoValue.setProductOrService(productOrService.toProto())
    }
    if (hasModifier()) {
      protoValue.addAllModifier(modifier.map { it.toProto() })
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
    if (hasNoteNumber()) {
      protoValue.addAllNoteNumber(noteNumber.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.TotalComponent.toProto():
      ExplanationOfBenefit.Total {
    val protoValue = ExplanationOfBenefit.Total.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCategory()) {
      protoValue.setCategory(category.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount(amount.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.PaymentComponent.toProto():
      ExplanationOfBenefit.Payment {
    val protoValue = ExplanationOfBenefit.Payment.newBuilder()
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
    if (hasAdjustment()) {
      protoValue.setAdjustment(adjustment.toProto())
    }
    if (hasAdjustmentReason()) {
      protoValue.setAdjustmentReason(adjustmentReason.toProto())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount(amount.toProto())
    }
    if (hasIdentifier()) {
      protoValue.setIdentifier(identifier.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.NoteComponent.toProto():
      ExplanationOfBenefit.Note {
    val protoValue = ExplanationOfBenefit.Note.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasNumber()) {
      protoValue.setNumber(numberElement.toProto())
    }
    if (hasType()) {
      protoValue.setType(ExplanationOfBenefit.Note.TypeCode.newBuilder().setValue(NoteTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasText()) {
      protoValue.setText(textElement.toProto())
    }
    if (hasLanguage()) {
      protoValue.setLanguage(language.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitBalanceComponent.toProto():
      ExplanationOfBenefit.BenefitBalance {
    val protoValue = ExplanationOfBenefit.BenefitBalance.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCategory()) {
      protoValue.setCategory(category.toProto())
    }
    if (hasExcluded()) {
      protoValue.setExcluded(excludedElement.toProto())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasNetwork()) {
      protoValue.setNetwork(network.toProto())
    }
    if (hasUnit()) {
      protoValue.setUnit(unit.toProto())
    }
    if (hasTerm()) {
      protoValue.setTerm(term.toProto())
    }
    if (hasFinancial()) {
      protoValue.addAllFinancial(financial.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitComponent.toProto():
      ExplanationOfBenefit.BenefitBalance.Benefit {
    val protoValue = ExplanationOfBenefit.BenefitBalance.Benefit.newBuilder()
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
      protoValue.setAllowed(allowed.explanationOfBenefitBenefitBalanceFinancialAllowedToProto())
    }
    if (hasUsed()) {
      protoValue.setUsed(used.explanationOfBenefitBenefitBalanceFinancialUsedToProto())
    }
    return protoValue.build()
  }

  private fun ExplanationOfBenefit.RelatedClaim.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.RelatedClaimComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.RelatedClaimComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasClaim()) {
      hapiValue.setClaim(claim.toHapi())
    }
    if (hasRelationship()) {
      hapiValue.setRelationship(relationship.toHapi())
    }
    if (hasReference()) {
      hapiValue.setReference(reference.toHapi())
    }
    return hapiValue
  }

  private fun ExplanationOfBenefit.Payee.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.PayeeComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.PayeeComponent()
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

  private fun ExplanationOfBenefit.CareTeam.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.CareTeamComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.CareTeamComponent()
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

  private fun ExplanationOfBenefit.SupportingInformation.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.SupportingInformationComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.SupportingInformationComponent()
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
      hapiValue.setTiming(timing.explanationOfBenefitSupportingInfoTimingToHapi())
    }
    if (hasValue()) {
      hapiValue.setValue(value.explanationOfBenefitSupportingInfoValueToHapi())
    }
    if (hasReason()) {
      hapiValue.setReason(reason.toHapi())
    }
    return hapiValue
  }

  private fun ExplanationOfBenefit.Diagnosis.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.DiagnosisComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.DiagnosisComponent()
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
      hapiValue.setDiagnosis(diagnosis.explanationOfBenefitDiagnosisDiagnosisToHapi())
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

  private fun ExplanationOfBenefit.Procedure.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.ProcedureComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.ProcedureComponent()
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
      hapiValue.setProcedure(procedure.explanationOfBenefitProcedureProcedureToHapi())
    }
    if (udiCount > 0) {
      hapiValue.setUdi(udiList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ExplanationOfBenefit.Insurance.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.InsuranceComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.InsuranceComponent()
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
    if (preAuthRefCount > 0) {
      hapiValue.setPreAuthRef(preAuthRefList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ExplanationOfBenefit.Accident.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.AccidentComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.AccidentComponent()
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
      hapiValue.setLocation(location.explanationOfBenefitAccidentLocationToHapi())
    }
    return hapiValue
  }

  private fun ExplanationOfBenefit.Item.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.ItemComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.ItemComponent()
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
      hapiValue.setServiced(serviced.explanationOfBenefitItemServicedToHapi())
    }
    if (hasLocation()) {
      hapiValue.setLocation(location.explanationOfBenefitItemLocationToHapi())
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
    if (noteNumberCount > 0) {
      hapiValue.setNoteNumber(noteNumberList.map { it.toHapi() })
    }
    if (adjudicationCount > 0) {
      hapiValue.setAdjudication(adjudicationList.map { it.toHapi() })
    }
    if (detailCount > 0) {
      hapiValue.setDetail(detailList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ExplanationOfBenefit.Item.Adjudication.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCategory()) {
      hapiValue.setCategory(category.toHapi())
    }
    if (hasReason()) {
      hapiValue.setReason(reason.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.toHapi())
    }
    if (hasValue()) {
      hapiValue.setValueElement(value.toHapi())
    }
    return hapiValue
  }

  private fun ExplanationOfBenefit.Item.Detail.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.DetailComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.DetailComponent()
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
    if (noteNumberCount > 0) {
      hapiValue.setNoteNumber(noteNumberList.map { it.toHapi() })
    }
    if (subDetailCount > 0) {
      hapiValue.setSubDetail(subDetailList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ExplanationOfBenefit.Item.Detail.SubDetail.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.SubDetailComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.SubDetailComponent()
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
    if (noteNumberCount > 0) {
      hapiValue.setNoteNumber(noteNumberList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ExplanationOfBenefit.AddedItem.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (itemSequenceCount > 0) {
      hapiValue.setItemSequence(itemSequenceList.map { it.toHapi() })
    }
    if (detailSequenceCount > 0) {
      hapiValue.setDetailSequence(detailSequenceList.map { it.toHapi() })
    }
    if (subDetailSequenceCount > 0) {
      hapiValue.setSubDetailSequence(subDetailSequenceList.map { it.toHapi() })
    }
    if (providerCount > 0) {
      hapiValue.setProvider(providerList.map { it.toHapi() })
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
      hapiValue.setServiced(serviced.explanationOfBenefitAddItemServicedToHapi())
    }
    if (hasLocation()) {
      hapiValue.setLocation(location.explanationOfBenefitAddItemLocationToHapi())
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
    if (hasBodySite()) {
      hapiValue.setBodySite(bodySite.toHapi())
    }
    if (subSiteCount > 0) {
      hapiValue.setSubSite(subSiteList.map { it.toHapi() })
    }
    if (noteNumberCount > 0) {
      hapiValue.setNoteNumber(noteNumberList.map { it.toHapi() })
    }
    if (detailCount > 0) {
      hapiValue.setDetail(detailList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ExplanationOfBenefit.AddedItem.AddedItemDetail.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasProductOrService()) {
      hapiValue.setProductOrService(productOrService.toHapi())
    }
    if (modifierCount > 0) {
      hapiValue.setModifier(modifierList.map { it.toHapi() })
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
    if (noteNumberCount > 0) {
      hapiValue.setNoteNumber(noteNumberList.map { it.toHapi() })
    }
    if (subDetailCount > 0) {
      hapiValue.setSubDetail(subDetailList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ExplanationOfBenefit.AddedItem.AddedItemDetail.AddedItemDetailSubDetail.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailSubDetailComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailSubDetailComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasProductOrService()) {
      hapiValue.setProductOrService(productOrService.toHapi())
    }
    if (modifierCount > 0) {
      hapiValue.setModifier(modifierList.map { it.toHapi() })
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
    if (noteNumberCount > 0) {
      hapiValue.setNoteNumber(noteNumberList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ExplanationOfBenefit.Total.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.TotalComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.TotalComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCategory()) {
      hapiValue.setCategory(category.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.toHapi())
    }
    return hapiValue
  }

  private fun ExplanationOfBenefit.Payment.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.PaymentComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.PaymentComponent()
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
    if (hasAdjustment()) {
      hapiValue.setAdjustment(adjustment.toHapi())
    }
    if (hasAdjustmentReason()) {
      hapiValue.setAdjustmentReason(adjustmentReason.toHapi())
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.toHapi())
    }
    if (hasIdentifier()) {
      hapiValue.setIdentifier(identifier.toHapi())
    }
    return hapiValue
  }

  private fun ExplanationOfBenefit.Note.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.NoteComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.NoteComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasNumber()) {
      hapiValue.setNumberElement(number.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(Enumerations.NoteType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasText()) {
      hapiValue.setTextElement(text.toHapi())
    }
    if (hasLanguage()) {
      hapiValue.setLanguage(language.toHapi())
    }
    return hapiValue
  }

  private fun ExplanationOfBenefit.BenefitBalance.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitBalanceComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitBalanceComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCategory()) {
      hapiValue.setCategory(category.toHapi())
    }
    if (hasExcluded()) {
      hapiValue.setExcludedElement(excluded.toHapi())
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasNetwork()) {
      hapiValue.setNetwork(network.toHapi())
    }
    if (hasUnit()) {
      hapiValue.setUnit(unit.toHapi())
    }
    if (hasTerm()) {
      hapiValue.setTerm(term.toHapi())
    }
    if (financialCount > 0) {
      hapiValue.setFinancial(financialList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ExplanationOfBenefit.BenefitBalance.Benefit.toHapi():
      org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitComponent()
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
      hapiValue.setAllowed(allowed.explanationOfBenefitBenefitBalanceFinancialAllowedToHapi())
    }
    if (hasUsed()) {
      hapiValue.setUsed(used.explanationOfBenefitBenefitBalanceFinancialUsedToHapi())
    }
    return hapiValue
  }
}
