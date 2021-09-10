package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UrlConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UrlConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.Subscription
import com.google.fhir.r4.core.Subscription.Channel
import com.google.fhir.r4.core.SubscriptionChannelTypeCode
import com.google.fhir.r4.core.SubscriptionStatusCode

public object SubscriptionConverter {
  public fun Subscription.toHapi(): org.hl7.fhir.r4.model.Subscription {
    val hapiValue = org.hl7.fhir.r4.model.Subscription()
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
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.Subscription.SubscriptionStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (contactCount > 0) {
      hapiValue.setContact(contactList.map { it.toHapi() })
    }
    if (hasEnd()) {
      hapiValue.setEndElement(end.toHapi())
    }
    if (hasReason()) {
      hapiValue.setReasonElement(reason.toHapi())
    }
    if (hasCriteria()) {
      hapiValue.setCriteriaElement(criteria.toHapi())
    }
    if (hasError()) {
      hapiValue.setErrorElement(error.toHapi())
    }
    if (hasChannel()) {
      hapiValue.setChannel(channel.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Subscription.toProto(): Subscription {
    val protoValue = Subscription.newBuilder()
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
    if (hasStatus()) {
      protoValue.setStatus(Subscription.StatusCode.newBuilder().setValue(SubscriptionStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasContact()) {
      protoValue.addAllContact(contact.map { it.toProto() })
    }
    if (hasEnd()) {
      protoValue.setEnd(endElement.toProto())
    }
    if (hasReason()) {
      protoValue.setReason(reasonElement.toProto())
    }
    if (hasCriteria()) {
      protoValue.setCriteria(criteriaElement.toProto())
    }
    if (hasError()) {
      protoValue.setError(errorElement.toProto())
    }
    if (hasChannel()) {
      protoValue.setChannel(channel.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Subscription.SubscriptionChannelComponent.toProto():
      Subscription.Channel {
    val protoValue = Subscription.Channel.newBuilder()
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
      protoValue.setType(Subscription.Channel.TypeCode.newBuilder().setValue(SubscriptionChannelTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasEndpoint()) {
      protoValue.setEndpoint(endpointElement.toProto())
    }
    if (hasPayload()) {
      protoValue.setPayload(Subscription.Channel.PayloadCode.newBuilder().setValue(payload.protoCodeCheck()).build())
    }
    if (hasHeader()) {
      protoValue.addAllHeader(header.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun Subscription.Channel.toHapi():
      org.hl7.fhir.r4.model.Subscription.SubscriptionChannelComponent {
    val hapiValue = org.hl7.fhir.r4.model.Subscription.SubscriptionChannelComponent()
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
      hapiValue.setType(org.hl7.fhir.r4.model.Subscription.SubscriptionChannelType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasEndpoint()) {
      hapiValue.setEndpointElement(endpoint.toHapi())
    }
    if (hasPayload()) {
      hapiValue.setPayload(payload.value.hapiCodeCheck())
    }
    if (headerCount > 0) {
      hapiValue.setHeader(headerList.map { it.toHapi() })
    }
    return hapiValue
  }
}
