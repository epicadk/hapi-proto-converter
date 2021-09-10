package com.epicadk.hapiprotoconverter.converter

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
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.ClaimProcessingCode
import com.google.fhir.r4.core.FinancialResourceStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.NoteTypeCode
import com.google.fhir.r4.core.PaymentReconciliation
import com.google.fhir.r4.core.PaymentReconciliation.Notes
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.Enumerations

public object PaymentReconciliationConverter {
  public fun PaymentReconciliation.toHapi(): org.hl7.fhir.r4.model.PaymentReconciliation {
    val hapiValue = org.hl7.fhir.r4.model.PaymentReconciliation()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.PaymentReconciliation.PaymentReconciliationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    if (hasCreated()) {
      hapiValue.setCreatedElement(created.toHapi())
    }
    if (hasPaymentIssuer()) {
      hapiValue.setPaymentIssuer(paymentIssuer.toHapi())
    }
    if (hasRequest()) {
      hapiValue.setRequest(request.toHapi())
    }
    if (hasRequestor()) {
      hapiValue.setRequestor(requestor.toHapi())
    }
    if (hasOutcome()) {
      hapiValue.setOutcome(Enumerations.RemittanceOutcome.valueOf(outcome.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDisposition()) {
      hapiValue.setDispositionElement(disposition.toHapi())
    }
    if (hasPaymentDate()) {
      hapiValue.setPaymentDateElement(paymentDate.toHapi())
    }
    if (hasPaymentAmount()) {
      hapiValue.setPaymentAmount(paymentAmount.toHapi())
    }
    if (hasPaymentIdentifier()) {
      hapiValue.setPaymentIdentifier(paymentIdentifier.toHapi())
    }
    if (detailCount > 0) {
      hapiValue.setDetail(detailList.map { it.toHapi() })
    }
    if (hasFormCode()) {
      hapiValue.setFormCode(formCode.toHapi())
    }
    if (processNoteCount > 0) {
      hapiValue.setProcessNote(processNoteList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.PaymentReconciliation.toProto(): PaymentReconciliation {
    val protoValue = PaymentReconciliation.newBuilder()
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
      protoValue.setStatus(PaymentReconciliation.StatusCode.newBuilder().setValue(FinancialResourceStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    if (hasCreated()) {
      protoValue.setCreated(createdElement.toProto())
    }
    if (hasPaymentIssuer()) {
      protoValue.setPaymentIssuer(paymentIssuer.toProto())
    }
    if (hasRequest()) {
      protoValue.setRequest(request.toProto())
    }
    if (hasRequestor()) {
      protoValue.setRequestor(requestor.toProto())
    }
    if (hasOutcome()) {
      protoValue.setOutcome(PaymentReconciliation.OutcomeCode.newBuilder().setValue(ClaimProcessingCode.Value.valueOf(outcome.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDisposition()) {
      protoValue.setDisposition(dispositionElement.toProto())
    }
    if (hasPaymentDate()) {
      protoValue.setPaymentDate(paymentDateElement.toProto())
    }
    if (hasPaymentAmount()) {
      protoValue.setPaymentAmount(paymentAmount.toProto())
    }
    if (hasPaymentIdentifier()) {
      protoValue.setPaymentIdentifier(paymentIdentifier.toProto())
    }
    if (hasDetail()) {
      protoValue.addAllDetail(detail.map { it.toProto() })
    }
    if (hasFormCode()) {
      protoValue.setFormCode(formCode.toProto())
    }
    if (hasProcessNote()) {
      protoValue.addAllProcessNote(processNote.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.PaymentReconciliation.DetailsComponent.toProto():
      PaymentReconciliation.Details {
    val protoValue = PaymentReconciliation.Details.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasIdentifier()) {
      protoValue.setIdentifier(identifier.toProto())
    }
    if (hasPredecessor()) {
      protoValue.setPredecessor(predecessor.toProto())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasRequest()) {
      protoValue.setRequest(request.toProto())
    }
    if (hasSubmitter()) {
      protoValue.setSubmitter(submitter.toProto())
    }
    if (hasResponse()) {
      protoValue.setResponse(response.toProto())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasResponsible()) {
      protoValue.setResponsible(responsible.toProto())
    }
    if (hasPayee()) {
      protoValue.setPayee(payee.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount(amount.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.PaymentReconciliation.NotesComponent.toProto():
      PaymentReconciliation.Notes {
    val protoValue = PaymentReconciliation.Notes.newBuilder()
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
      protoValue.setType(PaymentReconciliation.Notes.TypeCode.newBuilder().setValue(NoteTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasText()) {
      protoValue.setText(textElement.toProto())
    }
    return protoValue.build()
  }

  private fun PaymentReconciliation.Details.toHapi():
      org.hl7.fhir.r4.model.PaymentReconciliation.DetailsComponent {
    val hapiValue = org.hl7.fhir.r4.model.PaymentReconciliation.DetailsComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasIdentifier()) {
      hapiValue.setIdentifier(identifier.toHapi())
    }
    if (hasPredecessor()) {
      hapiValue.setPredecessor(predecessor.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasRequest()) {
      hapiValue.setRequest(request.toHapi())
    }
    if (hasSubmitter()) {
      hapiValue.setSubmitter(submitter.toHapi())
    }
    if (hasResponse()) {
      hapiValue.setResponse(response.toHapi())
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasResponsible()) {
      hapiValue.setResponsible(responsible.toHapi())
    }
    if (hasPayee()) {
      hapiValue.setPayee(payee.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.toHapi())
    }
    return hapiValue
  }

  private fun PaymentReconciliation.Notes.toHapi():
      org.hl7.fhir.r4.model.PaymentReconciliation.NotesComponent {
    val hapiValue = org.hl7.fhir.r4.model.PaymentReconciliation.NotesComponent()
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
      hapiValue.setType(Enumerations.NoteType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasText()) {
      hapiValue.setTextElement(text.toHapi())
    }
    return hapiValue
  }
}
