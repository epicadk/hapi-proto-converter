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
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.FinancialResourceStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.PaymentNotice

public object PaymentNoticeConverter {
  public fun PaymentNotice.toHapi(): org.hl7.fhir.r4.model.PaymentNotice {
    val hapiValue = org.hl7.fhir.r4.model.PaymentNotice()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.PaymentNotice.PaymentNoticeStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasRequest()) {
      hapiValue.setRequest(request.toHapi())
    }
    if (hasResponse()) {
      hapiValue.setResponse(response.toHapi())
    }
    if (hasCreated()) {
      hapiValue.setCreatedElement(created.toHapi())
    }
    if (hasProvider()) {
      hapiValue.setProvider(provider.toHapi())
    }
    if (hasPayment()) {
      hapiValue.setPayment(payment.toHapi())
    }
    if (hasPaymentDate()) {
      hapiValue.setPaymentDateElement(paymentDate.toHapi())
    }
    if (hasPayee()) {
      hapiValue.setPayee(payee.toHapi())
    }
    if (hasRecipient()) {
      hapiValue.setRecipient(recipient.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.toHapi())
    }
    if (hasPaymentStatus()) {
      hapiValue.setPaymentStatus(paymentStatus.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.PaymentNotice.toProto(): PaymentNotice {
    val protoValue = PaymentNotice.newBuilder()
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
      protoValue.setStatus(PaymentNotice.StatusCode.newBuilder().setValue(FinancialResourceStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasRequest()) {
      protoValue.setRequest(request.toProto())
    }
    if (hasResponse()) {
      protoValue.setResponse(response.toProto())
    }
    if (hasCreated()) {
      protoValue.setCreated(createdElement.toProto())
    }
    if (hasProvider()) {
      protoValue.setProvider(provider.toProto())
    }
    if (hasPayment()) {
      protoValue.setPayment(payment.toProto())
    }
    if (hasPaymentDate()) {
      protoValue.setPaymentDate(paymentDateElement.toProto())
    }
    if (hasPayee()) {
      protoValue.setPayee(payee.toProto())
    }
    if (hasRecipient()) {
      protoValue.setRecipient(recipient.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount(amount.toProto())
    }
    if (hasPaymentStatus()) {
      protoValue.setPaymentStatus(paymentStatus.toProto())
    }
    return protoValue.build()
  }
}
