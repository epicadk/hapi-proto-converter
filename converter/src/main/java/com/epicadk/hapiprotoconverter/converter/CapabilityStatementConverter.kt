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
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UrlConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UrlConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toProto
import com.google.fhir.r4.core.CapabilityStatement
import com.google.fhir.r4.core.CapabilityStatement.Document
import com.google.fhir.r4.core.CapabilityStatement.Messaging
import com.google.fhir.r4.core.CapabilityStatement.Messaging.SupportedMessage
import com.google.fhir.r4.core.CapabilityStatement.Rest
import com.google.fhir.r4.core.CapabilityStatement.Rest.Resource
import com.google.fhir.r4.core.CapabilityStatement.Rest.Resource.ResourceInteraction
import com.google.fhir.r4.core.CapabilityStatement.Rest.Resource.SearchParam
import com.google.fhir.r4.core.CapabilityStatement.Rest.SystemInteraction
import com.google.fhir.r4.core.CapabilityStatementKindCode
import com.google.fhir.r4.core.ConditionalDeleteStatusCode
import com.google.fhir.r4.core.ConditionalReadStatusCode
import com.google.fhir.r4.core.DocumentModeCode
import com.google.fhir.r4.core.EventCapabilityModeCode
import com.google.fhir.r4.core.FHIRVersionCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.ReferenceHandlingPolicyCode
import com.google.fhir.r4.core.ResourceTypeCode
import com.google.fhir.r4.core.ResourceVersionPolicyCode
import com.google.fhir.r4.core.RestfulCapabilityModeCode
import com.google.fhir.r4.core.SearchParamTypeCode
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.SystemRestfulInteractionValueSet
import com.google.fhir.r4.core.TypeRestfulInteractionValueSet
import org.hl7.fhir.r4.model.Enumerations

public object CapabilityStatementConverter {
  public fun CapabilityStatement.toHapi(): org.hl7.fhir.r4.model.CapabilityStatement {
    val hapiValue = org.hl7.fhir.r4.model.CapabilityStatement()
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
    if (hasVersion()) {
      hapiValue.setVersionElement(version.toHapi())
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasTitle()) {
      hapiValue.setTitleElement(title.toHapi())
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
    if (hasKind()) {
      hapiValue.setKind(org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementKind.valueOf(kind.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (instantiatesCount > 0) {
      hapiValue.setInstantiates(instantiatesList.map { it.toHapi() })
    }
    if (importsCount > 0) {
      hapiValue.setImports(importsList.map { it.toHapi() })
    }
    if (hasSoftware()) {
      hapiValue.setSoftware(software.toHapi())
    }
    if (hasImplementation()) {
      hapiValue.setImplementation(implementation.toHapi())
    }
    if (hasFhirVersion()) {
      hapiValue.setFhirVersion(Enumerations.FHIRVersion.valueOf(fhirVersion.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (formatCount > 0) {
      formatList.map { hapiValue.addFormat(it.value.hapiCodeCheck()) }
    }
    if (patchFormatCount > 0) {
      patchFormatList.map { hapiValue.addPatchFormat(it.value.hapiCodeCheck()) }
    }
    if (implementationGuideCount > 0) {
      hapiValue.setImplementationGuide(implementationGuideList.map { it.toHapi() })
    }
    if (restCount > 0) {
      hapiValue.setRest(restList.map { it.toHapi() })
    }
    if (messagingCount > 0) {
      hapiValue.setMessaging(messagingList.map { it.toHapi() })
    }
    if (documentCount > 0) {
      hapiValue.setDocument(documentList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.CapabilityStatement.toProto(): CapabilityStatement {
    val protoValue = CapabilityStatement.newBuilder()
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
    if (hasVersion()) {
      protoValue.setVersion(versionElement.toProto())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasTitle()) {
      protoValue.setTitle(titleElement.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(CapabilityStatement.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
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
    if (hasKind()) {
      protoValue.setKind(CapabilityStatement.KindCode.newBuilder().setValue(CapabilityStatementKindCode.Value.valueOf(kind.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasInstantiates()) {
      protoValue.addAllInstantiates(instantiates.map { it.toProto() })
    }
    if (hasImports()) {
      protoValue.addAllImports(imports.map { it.toProto() })
    }
    if (hasSoftware()) {
      protoValue.setSoftware(software.toProto())
    }
    if (hasImplementation()) {
      protoValue.setImplementation(implementation.toProto())
    }
    if (hasFhirVersion()) {
      protoValue.setFhirVersion(CapabilityStatement.FhirVersionCode.newBuilder().setValue(FHIRVersionCode.Value.valueOf(fhirVersion.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasFormat()) {
      protoValue.addAllFormat(format.map { CapabilityStatement.FormatCode.newBuilder().setValue(it.value.protoCodeCheck()).build() })
    }
    if (hasPatchFormat()) {
      protoValue.addAllPatchFormat(patchFormat.map { CapabilityStatement.PatchFormatCode.newBuilder().setValue(it.value.protoCodeCheck()).build() })
    }
    if (hasImplementationGuide()) {
      protoValue.addAllImplementationGuide(implementationGuide.map { it.toProto() })
    }
    if (hasRest()) {
      protoValue.addAllRest(rest.map { it.toProto() })
    }
    if (hasMessaging()) {
      protoValue.addAllMessaging(messaging.map { it.toProto() })
    }
    if (hasDocument()) {
      protoValue.addAllDocument(document.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementSoftwareComponent.toProto():
      CapabilityStatement.Software {
    val protoValue = CapabilityStatement.Software.newBuilder()
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
    if (hasVersion()) {
      protoValue.setVersion(versionElement.toProto())
    }
    if (hasReleaseDate()) {
      protoValue.setReleaseDate(releaseDateElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementImplementationComponent.toProto():
      CapabilityStatement.Implementation {
    val protoValue = CapabilityStatement.Implementation.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasUrl()) {
      protoValue.setUrl(urlElement.toProto())
    }
    if (hasCustodian()) {
      protoValue.setCustodian(custodian.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestComponent.toProto():
      CapabilityStatement.Rest {
    val protoValue = CapabilityStatement.Rest.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasMode()) {
      protoValue.setMode(CapabilityStatement.Rest.ModeCode.newBuilder().setValue(RestfulCapabilityModeCode.Value.valueOf(mode.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDocumentation()) {
      protoValue.setDocumentation(documentationElement.toProto())
    }
    if (hasSecurity()) {
      protoValue.setSecurity(security.toProto())
    }
    if (hasResource()) {
      protoValue.addAllResource(resource.map { it.toProto() })
    }
    if (hasInteraction()) {
      protoValue.addAllInteraction(interaction.map { it.toProto() })
    }
    if (hasCompartment()) {
      protoValue.addAllCompartment(compartment.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestSecurityComponent.toProto():
      CapabilityStatement.Rest.Security {
    val protoValue = CapabilityStatement.Rest.Security.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCors()) {
      protoValue.setCors(corsElement.toProto())
    }
    if (hasService()) {
      protoValue.addAllService(service.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceComponent.toProto():
      CapabilityStatement.Rest.Resource {
    val protoValue = CapabilityStatement.Rest.Resource.newBuilder()
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
      protoValue.setType(CapabilityStatement.Rest.Resource.TypeCode.newBuilder().setValue(ResourceTypeCode.Value.valueOf(type)).build())
    }
    if (hasProfile()) {
      protoValue.setProfile(profileElement.toProto())
    }
    if (hasSupportedProfile()) {
      protoValue.addAllSupportedProfile(supportedProfile.map { it.toProto() })
    }
    if (hasDocumentation()) {
      protoValue.setDocumentation(documentationElement.toProto())
    }
    if (hasInteraction()) {
      protoValue.addAllInteraction(interaction.map { it.toProto() })
    }
    if (hasVersioning()) {
      protoValue.setVersioning(CapabilityStatement.Rest.Resource.VersioningCode.newBuilder().setValue(ResourceVersionPolicyCode.Value.valueOf(versioning.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasReadHistory()) {
      protoValue.setReadHistory(readHistoryElement.toProto())
    }
    if (hasUpdateCreate()) {
      protoValue.setUpdateCreate(updateCreateElement.toProto())
    }
    if (hasConditionalCreate()) {
      protoValue.setConditionalCreate(conditionalCreateElement.toProto())
    }
    if (hasConditionalRead()) {
      protoValue.setConditionalRead(CapabilityStatement.Rest.Resource.ConditionalReadCode.newBuilder().setValue(ConditionalReadStatusCode.Value.valueOf(conditionalRead.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasConditionalUpdate()) {
      protoValue.setConditionalUpdate(conditionalUpdateElement.toProto())
    }
    if (hasConditionalDelete()) {
      protoValue.setConditionalDelete(CapabilityStatement.Rest.Resource.ConditionalDeleteCode.newBuilder().setValue(ConditionalDeleteStatusCode.Value.valueOf(conditionalDelete.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasReferencePolicy()) {
      protoValue.addAllReferencePolicy(referencePolicy.map { CapabilityStatement.Rest.Resource.ReferencePolicyCode.newBuilder().setValue(ReferenceHandlingPolicyCode.Value.valueOf(it.value.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build() })
    }
    if (hasSearchInclude()) {
      protoValue.addAllSearchInclude(searchInclude.map { it.toProto() })
    }
    if (hasSearchRevInclude()) {
      protoValue.addAllSearchRevInclude(searchRevInclude.map { it.toProto() })
    }
    if (hasSearchParam()) {
      protoValue.addAllSearchParam(searchParam.map { it.toProto() })
    }
    if (hasOperation()) {
      protoValue.addAllOperation(operation.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.CapabilityStatement.ResourceInteractionComponent.toProto():
      CapabilityStatement.Rest.Resource.ResourceInteraction {
    val protoValue = CapabilityStatement.Rest.Resource.ResourceInteraction.newBuilder()
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
      protoValue.setCode(CapabilityStatement.Rest.Resource.ResourceInteraction.CodeType.newBuilder().setValue(TypeRestfulInteractionValueSet.Value.valueOf(code.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDocumentation()) {
      protoValue.setDocumentation(documentationElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent.toProto():
      CapabilityStatement.Rest.Resource.SearchParam {
    val protoValue = CapabilityStatement.Rest.Resource.SearchParam.newBuilder()
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
    if (hasDefinition()) {
      protoValue.setDefinition(definitionElement.toProto())
    }
    if (hasType()) {
      protoValue.setType(CapabilityStatement.Rest.Resource.SearchParam.TypeCode.newBuilder().setValue(SearchParamTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDocumentation()) {
      protoValue.setDocumentation(documentationElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent.toProto():
      CapabilityStatement.Rest.Resource.Operation {
    val protoValue = CapabilityStatement.Rest.Resource.Operation.newBuilder()
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
    if (hasDefinition()) {
      protoValue.setDefinition(definitionElement.toProto())
    }
    if (hasDocumentation()) {
      protoValue.setDocumentation(documentationElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.CapabilityStatement.SystemInteractionComponent.toProto():
      CapabilityStatement.Rest.SystemInteraction {
    val protoValue = CapabilityStatement.Rest.SystemInteraction.newBuilder()
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
      protoValue.setCode(CapabilityStatement.Rest.SystemInteraction.CodeType.newBuilder().setValue(SystemRestfulInteractionValueSet.Value.valueOf(code.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDocumentation()) {
      protoValue.setDocumentation(documentationElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingComponent.toProto():
      CapabilityStatement.Messaging {
    val protoValue = CapabilityStatement.Messaging.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasEndpoint()) {
      protoValue.addAllEndpoint(endpoint.map { it.toProto() })
    }
    if (hasReliableCache()) {
      protoValue.setReliableCache(reliableCacheElement.toProto())
    }
    if (hasDocumentation()) {
      protoValue.setDocumentation(documentationElement.toProto())
    }
    if (hasSupportedMessage()) {
      protoValue.addAllSupportedMessage(supportedMessage.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent.toProto():
      CapabilityStatement.Messaging.Endpoint {
    val protoValue = CapabilityStatement.Messaging.Endpoint.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasProtocol()) {
      protoValue.setProtocol(protocol.toProto())
    }
    if (hasAddress()) {
      protoValue.setAddress(addressElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent.toProto():
      CapabilityStatement.Messaging.SupportedMessage {
    val protoValue = CapabilityStatement.Messaging.SupportedMessage.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasMode()) {
      protoValue.setMode(CapabilityStatement.Messaging.SupportedMessage.ModeCode.newBuilder().setValue(EventCapabilityModeCode.Value.valueOf(mode.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDefinition()) {
      protoValue.setDefinition(definitionElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementDocumentComponent.toProto():
      CapabilityStatement.Document {
    val protoValue = CapabilityStatement.Document.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasMode()) {
      protoValue.setMode(CapabilityStatement.Document.ModeCode.newBuilder().setValue(DocumentModeCode.Value.valueOf(mode.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDocumentation()) {
      protoValue.setDocumentation(documentationElement.toProto())
    }
    if (hasProfile()) {
      protoValue.setProfile(profileElement.toProto())
    }
    return protoValue.build()
  }

  private fun CapabilityStatement.Software.toHapi():
      org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementSoftwareComponent {
    val hapiValue = org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementSoftwareComponent()
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
    if (hasVersion()) {
      hapiValue.setVersionElement(version.toHapi())
    }
    if (hasReleaseDate()) {
      hapiValue.setReleaseDateElement(releaseDate.toHapi())
    }
    return hapiValue
  }

  private fun CapabilityStatement.Implementation.toHapi():
      org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementImplementationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementImplementationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasUrl()) {
      hapiValue.setUrlElement(url.toHapi())
    }
    if (hasCustodian()) {
      hapiValue.setCustodian(custodian.toHapi())
    }
    return hapiValue
  }

  private fun CapabilityStatement.Rest.toHapi():
      org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestComponent {
    val hapiValue = org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasMode()) {
      hapiValue.setMode(org.hl7.fhir.r4.model.CapabilityStatement.RestfulCapabilityMode.valueOf(mode.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDocumentation()) {
      hapiValue.setDocumentationElement(documentation.toHapi())
    }
    if (hasSecurity()) {
      hapiValue.setSecurity(security.toHapi())
    }
    if (resourceCount > 0) {
      hapiValue.setResource(resourceList.map { it.toHapi() })
    }
    if (interactionCount > 0) {
      hapiValue.setInteraction(interactionList.map { it.toHapi() })
    }
    if (compartmentCount > 0) {
      hapiValue.setCompartment(compartmentList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun CapabilityStatement.Rest.Security.toHapi():
      org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestSecurityComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestSecurityComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCors()) {
      hapiValue.setCorsElement(cors.toHapi())
    }
    if (serviceCount > 0) {
      hapiValue.setService(serviceList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    return hapiValue
  }

  private fun CapabilityStatement.Rest.Resource.toHapi():
      org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceComponent()
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
      hapiValue.setType(type.value.name)
    }
    if (hasProfile()) {
      hapiValue.setProfileElement(profile.toHapi())
    }
    if (supportedProfileCount > 0) {
      hapiValue.setSupportedProfile(supportedProfileList.map { it.toHapi() })
    }
    if (hasDocumentation()) {
      hapiValue.setDocumentationElement(documentation.toHapi())
    }
    if (interactionCount > 0) {
      hapiValue.setInteraction(interactionList.map { it.toHapi() })
    }
    if (hasVersioning()) {
      hapiValue.setVersioning(org.hl7.fhir.r4.model.CapabilityStatement.ResourceVersionPolicy.valueOf(versioning.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasReadHistory()) {
      hapiValue.setReadHistoryElement(readHistory.toHapi())
    }
    if (hasUpdateCreate()) {
      hapiValue.setUpdateCreateElement(updateCreate.toHapi())
    }
    if (hasConditionalCreate()) {
      hapiValue.setConditionalCreateElement(conditionalCreate.toHapi())
    }
    if (hasConditionalRead()) {
      hapiValue.setConditionalRead(org.hl7.fhir.r4.model.CapabilityStatement.ConditionalReadStatus.valueOf(conditionalRead.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasConditionalUpdate()) {
      hapiValue.setConditionalUpdateElement(conditionalUpdate.toHapi())
    }
    if (hasConditionalDelete()) {
      hapiValue.setConditionalDelete(org.hl7.fhir.r4.model.CapabilityStatement.ConditionalDeleteStatus.valueOf(conditionalDelete.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (referencePolicyCount > 0) {
      referencePolicyList.forEach { hapiValue.addReferencePolicy(org.hl7.fhir.r4.model.CapabilityStatement.ReferenceHandlingPolicy.valueOf(it.value.name.hapiCodeCheck().replace("_", ""))) }
    }
    if (searchIncludeCount > 0) {
      hapiValue.setSearchInclude(searchIncludeList.map { it.toHapi() })
    }
    if (searchRevIncludeCount > 0) {
      hapiValue.setSearchRevInclude(searchRevIncludeList.map { it.toHapi() })
    }
    if (searchParamCount > 0) {
      hapiValue.setSearchParam(searchParamList.map { it.toHapi() })
    }
    if (operationCount > 0) {
      hapiValue.setOperation(operationList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun CapabilityStatement.Rest.Resource.ResourceInteraction.toHapi():
      org.hl7.fhir.r4.model.CapabilityStatement.ResourceInteractionComponent {
    val hapiValue = org.hl7.fhir.r4.model.CapabilityStatement.ResourceInteractionComponent()
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
      hapiValue.setCode(org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteraction.valueOf(code.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDocumentation()) {
      hapiValue.setDocumentationElement(documentation.toHapi())
    }
    return hapiValue
  }

  private fun CapabilityStatement.Rest.Resource.SearchParam.toHapi():
      org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent()
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
    if (hasDefinition()) {
      hapiValue.setDefinitionElement(definition.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(Enumerations.SearchParamType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDocumentation()) {
      hapiValue.setDocumentationElement(documentation.toHapi())
    }
    return hapiValue
  }

  private fun CapabilityStatement.Rest.Resource.Operation.toHapi():
      org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent()
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
    if (hasDefinition()) {
      hapiValue.setDefinitionElement(definition.toHapi())
    }
    if (hasDocumentation()) {
      hapiValue.setDocumentationElement(documentation.toHapi())
    }
    return hapiValue
  }

  private fun CapabilityStatement.Rest.SystemInteraction.toHapi():
      org.hl7.fhir.r4.model.CapabilityStatement.SystemInteractionComponent {
    val hapiValue = org.hl7.fhir.r4.model.CapabilityStatement.SystemInteractionComponent()
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
      hapiValue.setCode(org.hl7.fhir.r4.model.CapabilityStatement.SystemRestfulInteraction.valueOf(code.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDocumentation()) {
      hapiValue.setDocumentationElement(documentation.toHapi())
    }
    return hapiValue
  }

  private fun CapabilityStatement.Messaging.toHapi():
      org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (endpointCount > 0) {
      hapiValue.setEndpoint(endpointList.map { it.toHapi() })
    }
    if (hasReliableCache()) {
      hapiValue.setReliableCacheElement(reliableCache.toHapi())
    }
    if (hasDocumentation()) {
      hapiValue.setDocumentationElement(documentation.toHapi())
    }
    if (supportedMessageCount > 0) {
      hapiValue.setSupportedMessage(supportedMessageList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun CapabilityStatement.Messaging.Endpoint.toHapi():
      org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasProtocol()) {
      hapiValue.setProtocol(protocol.toHapi())
    }
    if (hasAddress()) {
      hapiValue.setAddressElement(address.toHapi())
    }
    return hapiValue
  }

  private fun CapabilityStatement.Messaging.SupportedMessage.toHapi():
      org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasMode()) {
      hapiValue.setMode(org.hl7.fhir.r4.model.CapabilityStatement.EventCapabilityMode.valueOf(mode.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDefinition()) {
      hapiValue.setDefinitionElement(definition.toHapi())
    }
    return hapiValue
  }

  private fun CapabilityStatement.Document.toHapi():
      org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementDocumentComponent {
    val hapiValue = org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementDocumentComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasMode()) {
      hapiValue.setMode(org.hl7.fhir.r4.model.CapabilityStatement.DocumentMode.valueOf(mode.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDocumentation()) {
      hapiValue.setDocumentationElement(documentation.toHapi())
    }
    if (hasProfile()) {
      hapiValue.setProfileElement(profile.toHapi())
    }
    return hapiValue
  }
}
