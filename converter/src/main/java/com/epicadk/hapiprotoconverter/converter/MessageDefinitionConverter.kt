package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.MessageDefinition
import com.google.fhir.r4.core.MessageDefinition.Focus
import com.google.fhir.r4.core.MessageSignificanceCategoryCode
import com.google.fhir.r4.core.MessageheaderResponseRequestCode
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.ResourceTypeCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Coding
import org.hl7.fhir.r4.model.Enumerations
import org.hl7.fhir.r4.model.Type
import org.hl7.fhir.r4.model.UriType

public object MessageDefinitionConverter {
  private fun MessageDefinition.EventX.messageDefinitionEventToHapi(): Type {
    if (hasCoding()) {
      return (this.getCoding()).toHapi()
    }
    if (hasUri()) {
      return (this.getUri()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for MessageDefinition.event[x]")
  }

  private fun Type.messageDefinitionEventToProto(): MessageDefinition.EventX {
    val protoValue = MessageDefinition.EventX.newBuilder()
    if (this is Coding) {
      protoValue.setCoding(this.toProto())
    }
    if (this is UriType) {
      protoValue.setUri(this.toProto())
    }
    return protoValue.build()
  }

  public fun MessageDefinition.toHapi(): org.hl7.fhir.r4.model.MessageDefinition {
    val hapiValue = org.hl7.fhir.r4.model.MessageDefinition()
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
    if (hasUrl()) {
      hapiValue.setUrlElement(url.toHapi())
    }
    if (identifierCount > 0) {
      hapiValue.setIdentifier(identifierList.map { it.toHapi() })
    }
    if (hasVersion()) {
      hapiValue.setVersionElement(version.toHapi())
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasTitle()) {
      hapiValue.setTitleElement(title.toHapi())
    }
    if (replacesCount > 0) {
      hapiValue.setReplaces(replacesList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(Enumerations.PublicationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasExperimental()) {
      hapiValue.setExperimentalElement(experimental.toHapi())
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasPublisher()) {
      hapiValue.setPublisherElement(publisher.toHapi())
    }
    if (contactCount > 0) {
      hapiValue.setContact(contactList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (useContextCount > 0) {
      hapiValue.setUseContext(useContextList.map { it.toHapi() })
    }
    if (jurisdictionCount > 0) {
      hapiValue.setJurisdiction(jurisdictionList.map { it.toHapi() })
    }
    if (hasPurpose()) {
      hapiValue.setPurposeElement(purpose.toHapi())
    }
    if (hasCopyright()) {
      hapiValue.setCopyrightElement(copyright.toHapi())
    }
    if (hasBase()) {
      hapiValue.setBaseElement(base.toHapi())
    }
    if (parentCount > 0) {
      hapiValue.setParent(parentList.map { it.toHapi() })
    }
    if (hasEvent()) {
      hapiValue.setEvent(event.messageDefinitionEventToHapi())
    }
    if (hasCategory()) {
      hapiValue.setCategory(org.hl7.fhir.r4.model.MessageDefinition.MessageSignificanceCategory.valueOf(category.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (focusCount > 0) {
      hapiValue.setFocus(focusList.map { it.toHapi() })
    }
    if (hasResponseRequired()) {
      hapiValue.setResponseRequired(org.hl7.fhir.r4.model.MessageDefinition.MessageheaderResponseRequest.valueOf(responseRequired.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (allowedResponseCount > 0) {
      hapiValue.setAllowedResponse(allowedResponseList.map { it.toHapi() })
    }
    if (graphCount > 0) {
      hapiValue.setGraph(graphList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MessageDefinition.toProto(): MessageDefinition {
    val protoValue = MessageDefinition.newBuilder()
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
    if (hasUrl()) {
      protoValue.setUrl(urlElement.toProto())
    }
    if (hasIdentifier()) {
      protoValue.addAllIdentifier(identifier.map { it.toProto() })
    }
    if (hasVersion()) {
      protoValue.setVersion(versionElement.toProto())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasTitle()) {
      protoValue.setTitle(titleElement.toProto())
    }
    if (hasReplaces()) {
      protoValue.addAllReplaces(replaces.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(MessageDefinition.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasExperimental()) {
      protoValue.setExperimental(experimentalElement.toProto())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasPublisher()) {
      protoValue.setPublisher(publisherElement.toProto())
    }
    if (hasContact()) {
      protoValue.addAllContact(contact.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasUseContext()) {
      protoValue.addAllUseContext(useContext.map { it.toProto() })
    }
    if (hasJurisdiction()) {
      protoValue.addAllJurisdiction(jurisdiction.map { it.toProto() })
    }
    if (hasPurpose()) {
      protoValue.setPurpose(purposeElement.toProto())
    }
    if (hasCopyright()) {
      protoValue.setCopyright(copyrightElement.toProto())
    }
    if (hasBase()) {
      protoValue.setBase(baseElement.toProto())
    }
    if (hasParent()) {
      protoValue.addAllParent(parent.map { it.toProto() })
    }
    if (hasEvent()) {
      protoValue.setEvent(event.messageDefinitionEventToProto())
    }
    if (hasCategory()) {
      protoValue.setCategory(MessageDefinition.CategoryCode.newBuilder().setValue(MessageSignificanceCategoryCode.Value.valueOf(category.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasFocus()) {
      protoValue.addAllFocus(focus.map { it.toProto() })
    }
    if (hasResponseRequired()) {
      protoValue.setResponseRequired(MessageDefinition.ResponseRequiredCode.newBuilder().setValue(MessageheaderResponseRequestCode.Value.valueOf(responseRequired.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasAllowedResponse()) {
      protoValue.addAllAllowedResponse(allowedResponse.map { it.toProto() })
    }
    if (hasGraph()) {
      protoValue.addAllGraph(graph.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionFocusComponent.toProto():
      MessageDefinition.Focus {
    val protoValue = MessageDefinition.Focus.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCode()) {
      protoValue.setCode(MessageDefinition.Focus.CodeType.newBuilder().setValue(ResourceTypeCode.Value.valueOf(code)).build())
    }
    if (hasProfile()) {
      protoValue.setProfile(profileElement.toProto())
    }
    if (hasMin()) {
      protoValue.setMin(minElement.toProto())
    }
    if (hasMax()) {
      protoValue.setMax(maxElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionAllowedResponseComponent.toProto():
      MessageDefinition.AllowedResponse {
    val protoValue = MessageDefinition.AllowedResponse.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasMessage()) {
      protoValue.setMessage(messageElement.toProto())
    }
    if (hasSituation()) {
      protoValue.setSituation(situationElement.toProto())
    }
    return protoValue.build()
  }

  private fun MessageDefinition.Focus.toHapi():
      org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionFocusComponent {
    val hapiValue = org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionFocusComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCode()) {
      hapiValue.setCode(code.value.name)
    }
    if (hasProfile()) {
      hapiValue.setProfileElement(profile.toHapi())
    }
    if (hasMin()) {
      hapiValue.setMinElement(min.toHapi())
    }
    if (hasMax()) {
      hapiValue.setMaxElement(max.toHapi())
    }
    return hapiValue
  }

  private fun MessageDefinition.AllowedResponse.toHapi():
      org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionAllowedResponseComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionAllowedResponseComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasMessage()) {
      hapiValue.setMessageElement(message.toHapi())
    }
    if (hasSituation()) {
      hapiValue.setSituationElement(situation.toHapi())
    }
    return hapiValue
  }
}
