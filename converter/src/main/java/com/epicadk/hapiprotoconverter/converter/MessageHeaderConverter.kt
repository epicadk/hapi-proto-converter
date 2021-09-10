package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UrlConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UrlConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.MessageHeader
import com.google.fhir.r4.core.MessageHeader.Response
import com.google.fhir.r4.core.ResponseTypeCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Coding
import org.hl7.fhir.r4.model.Type
import org.hl7.fhir.r4.model.UriType

public object MessageHeaderConverter {
  private fun MessageHeader.EventX.messageHeaderEventToHapi(): Type {
    if (hasCoding()) {
      return (this.getCoding()).toHapi()
    }
    if (hasUri()) {
      return (this.getUri()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for MessageHeader.event[x]")
  }

  private fun Type.messageHeaderEventToProto(): MessageHeader.EventX {
    val protoValue = MessageHeader.EventX.newBuilder()
    if (this is Coding) {
      protoValue.setCoding(this.toProto())
    }
    if (this is UriType) {
      protoValue.setUri(this.toProto())
    }
    return protoValue.build()
  }

  public fun MessageHeader.toHapi(): org.hl7.fhir.r4.model.MessageHeader {
    val hapiValue = org.hl7.fhir.r4.model.MessageHeader()
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
    if (hasEvent()) {
      hapiValue.setEvent(event.messageHeaderEventToHapi())
    }
    if (destinationCount > 0) {
      hapiValue.setDestination(destinationList.map { it.toHapi() })
    }
    if (hasSender()) {
      hapiValue.setSender(sender.toHapi())
    }
    if (hasEnterer()) {
      hapiValue.setEnterer(enterer.toHapi())
    }
    if (hasAuthor()) {
      hapiValue.setAuthor(author.toHapi())
    }
    if (hasSource()) {
      hapiValue.setSource(source.toHapi())
    }
    if (hasResponsible()) {
      hapiValue.setResponsible(responsible.toHapi())
    }
    if (hasReason()) {
      hapiValue.setReason(reason.toHapi())
    }
    if (hasResponse()) {
      hapiValue.setResponse(response.toHapi())
    }
    if (focusCount > 0) {
      hapiValue.setFocus(focusList.map { it.toHapi() })
    }
    if (hasDefinition()) {
      hapiValue.setDefinitionElement(definition.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MessageHeader.toProto(): MessageHeader {
    val protoValue = MessageHeader.newBuilder()
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
    if (hasEvent()) {
      protoValue.setEvent(event.messageHeaderEventToProto())
    }
    if (hasDestination()) {
      protoValue.addAllDestination(destination.map { it.toProto() })
    }
    if (hasSender()) {
      protoValue.setSender(sender.toProto())
    }
    if (hasEnterer()) {
      protoValue.setEnterer(enterer.toProto())
    }
    if (hasAuthor()) {
      protoValue.setAuthor(author.toProto())
    }
    if (hasSource()) {
      protoValue.setSource(source.toProto())
    }
    if (hasResponsible()) {
      protoValue.setResponsible(responsible.toProto())
    }
    if (hasReason()) {
      protoValue.setReason(reason.toProto())
    }
    if (hasResponse()) {
      protoValue.setResponse(response.toProto())
    }
    if (hasFocus()) {
      protoValue.addAllFocus(focus.map { it.toProto() })
    }
    if (hasDefinition()) {
      protoValue.setDefinition(definitionElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.MessageHeader.MessageDestinationComponent.toProto():
      MessageHeader.MessageDestination {
    val protoValue = MessageHeader.MessageDestination.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasTarget()) {
      protoValue.setTarget(target.toProto())
    }
    if (hasEndpoint()) {
      protoValue.setEndpoint(endpointElement.toProto())
    }
    if (hasReceiver()) {
      protoValue.setReceiver(receiver.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.MessageHeader.MessageSourceComponent.toProto():
      MessageHeader.MessageSource {
    val protoValue = MessageHeader.MessageSource.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasSoftware()) {
      protoValue.setSoftware(softwareElement.toProto())
    }
    if (hasVersion()) {
      protoValue.setVersion(versionElement.toProto())
    }
    if (hasContact()) {
      protoValue.setContact(contact.toProto())
    }
    if (hasEndpoint()) {
      protoValue.setEndpoint(endpointElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.MessageHeader.MessageHeaderResponseComponent.toProto():
      MessageHeader.Response {
    val protoValue = MessageHeader.Response.newBuilder()
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
      protoValue.setIdentifier(identifierElement.toProto())
    }
    if (hasCode()) {
      protoValue.setCode(MessageHeader.Response.CodeType.newBuilder().setValue(ResponseTypeCode.Value.valueOf(code.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDetails()) {
      protoValue.setDetails(details.toProto())
    }
    return protoValue.build()
  }

  private fun MessageHeader.MessageDestination.toHapi():
      org.hl7.fhir.r4.model.MessageHeader.MessageDestinationComponent {
    val hapiValue = org.hl7.fhir.r4.model.MessageHeader.MessageDestinationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasTarget()) {
      hapiValue.setTarget(target.toHapi())
    }
    if (hasEndpoint()) {
      hapiValue.setEndpointElement(endpoint.toHapi())
    }
    if (hasReceiver()) {
      hapiValue.setReceiver(receiver.toHapi())
    }
    return hapiValue
  }

  private fun MessageHeader.MessageSource.toHapi():
      org.hl7.fhir.r4.model.MessageHeader.MessageSourceComponent {
    val hapiValue = org.hl7.fhir.r4.model.MessageHeader.MessageSourceComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasSoftware()) {
      hapiValue.setSoftwareElement(software.toHapi())
    }
    if (hasVersion()) {
      hapiValue.setVersionElement(version.toHapi())
    }
    if (hasContact()) {
      hapiValue.setContact(contact.toHapi())
    }
    if (hasEndpoint()) {
      hapiValue.setEndpointElement(endpoint.toHapi())
    }
    return hapiValue
  }

  private fun MessageHeader.Response.toHapi():
      org.hl7.fhir.r4.model.MessageHeader.MessageHeaderResponseComponent {
    val hapiValue = org.hl7.fhir.r4.model.MessageHeader.MessageHeaderResponseComponent()
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
      hapiValue.setIdentifierElement(identifier.toHapi())
    }
    if (hasCode()) {
      hapiValue.setCode(org.hl7.fhir.r4.model.MessageHeader.ResponseType.valueOf(code.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDetails()) {
      hapiValue.setDetails(details.toHapi())
    }
    return hapiValue
  }
}
