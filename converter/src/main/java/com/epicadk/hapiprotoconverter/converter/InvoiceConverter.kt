package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MoneyConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MoneyConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Invoice
import com.google.fhir.r4.core.Invoice.LineItem
import com.google.fhir.r4.core.Invoice.LineItem.PriceComponent
import com.google.fhir.r4.core.InvoicePriceComponentTypeCode
import com.google.fhir.r4.core.InvoiceStatusCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.Type

public object InvoiceConverter {
  private fun Invoice.LineItem.ChargeItemX.invoiceLineItemChargeItemToHapi(): Type {
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Invoice.lineItem.chargeItem[x]")
  }

  private fun Type.invoiceLineItemChargeItemToProto(): Invoice.LineItem.ChargeItemX {
    val protoValue = Invoice.LineItem.ChargeItemX.newBuilder()
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    return protoValue.build()
  }

  public fun Invoice.toHapi(): org.hl7.fhir.r4.model.Invoice {
    val hapiValue = org.hl7.fhir.r4.model.Invoice()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.Invoice.InvoiceStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCancelledReason()) {
      hapiValue.setCancelledReasonElement(cancelledReason.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasRecipient()) {
      hapiValue.setRecipient(recipient.toHapi())
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (participantCount > 0) {
      hapiValue.setParticipant(participantList.map { it.toHapi() })
    }
    if (hasIssuer()) {
      hapiValue.setIssuer(issuer.toHapi())
    }
    if (hasAccount()) {
      hapiValue.setAccount(account.toHapi())
    }
    if (lineItemCount > 0) {
      hapiValue.setLineItem(lineItemList.map { it.toHapi() })
    }
    if (hasTotalNet()) {
      hapiValue.setTotalNet(totalNet.toHapi())
    }
    if (hasTotalGross()) {
      hapiValue.setTotalGross(totalGross.toHapi())
    }
    if (hasPaymentTerms()) {
      hapiValue.setPaymentTermsElement(paymentTerms.toHapi())
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Invoice.toProto(): Invoice {
    val protoValue = Invoice.newBuilder()
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
      protoValue.setStatus(Invoice.StatusCode.newBuilder().setValue(InvoiceStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCancelledReason()) {
      protoValue.setCancelledReason(cancelledReasonElement.toProto())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasRecipient()) {
      protoValue.setRecipient(recipient.toProto())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasParticipant()) {
      protoValue.addAllParticipant(participant.map { it.toProto() })
    }
    if (hasIssuer()) {
      protoValue.setIssuer(issuer.toProto())
    }
    if (hasAccount()) {
      protoValue.setAccount(account.toProto())
    }
    if (hasLineItem()) {
      protoValue.addAllLineItem(lineItem.map { it.toProto() })
    }
    if (hasTotalNet()) {
      protoValue.setTotalNet(totalNet.toProto())
    }
    if (hasTotalGross()) {
      protoValue.setTotalGross(totalGross.toProto())
    }
    if (hasPaymentTerms()) {
      protoValue.setPaymentTerms(paymentTermsElement.toProto())
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Invoice.InvoiceParticipantComponent.toProto():
      Invoice.Participant {
    val protoValue = Invoice.Participant.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasRole()) {
      protoValue.setRole(role.toProto())
    }
    if (hasActor()) {
      protoValue.setActor(actor.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Invoice.InvoiceLineItemComponent.toProto(): Invoice.LineItem {
    val protoValue = Invoice.LineItem.newBuilder()
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
    if (hasChargeItem()) {
      protoValue.setChargeItem(chargeItem.invoiceLineItemChargeItemToProto())
    }
    if (hasPriceComponent()) {
      protoValue.addAllPriceComponent(priceComponent.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Invoice.InvoiceLineItemPriceComponentComponent.toProto():
      Invoice.LineItem.PriceComponent {
    val protoValue = Invoice.LineItem.PriceComponent.newBuilder()
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
      protoValue.setType(Invoice.LineItem.PriceComponent.TypeCode.newBuilder().setValue(InvoicePriceComponentTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasFactor()) {
      protoValue.setFactor(factorElement.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount(amount.toProto())
    }
    return protoValue.build()
  }

  private fun Invoice.Participant.toHapi():
      org.hl7.fhir.r4.model.Invoice.InvoiceParticipantComponent {
    val hapiValue = org.hl7.fhir.r4.model.Invoice.InvoiceParticipantComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasRole()) {
      hapiValue.setRole(role.toHapi())
    }
    if (hasActor()) {
      hapiValue.setActor(actor.toHapi())
    }
    return hapiValue
  }

  private fun Invoice.LineItem.toHapi(): org.hl7.fhir.r4.model.Invoice.InvoiceLineItemComponent {
    val hapiValue = org.hl7.fhir.r4.model.Invoice.InvoiceLineItemComponent()
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
    if (hasChargeItem()) {
      hapiValue.setChargeItem(chargeItem.invoiceLineItemChargeItemToHapi())
    }
    if (priceComponentCount > 0) {
      hapiValue.setPriceComponent(priceComponentList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun Invoice.LineItem.PriceComponent.toHapi():
      org.hl7.fhir.r4.model.Invoice.InvoiceLineItemPriceComponentComponent {
    val hapiValue = org.hl7.fhir.r4.model.Invoice.InvoiceLineItemPriceComponentComponent()
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
      hapiValue.setType(org.hl7.fhir.r4.model.Invoice.InvoicePriceComponentType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasFactor()) {
      hapiValue.setFactorElement(factor.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.toHapi())
    }
    return hapiValue
  }
}
