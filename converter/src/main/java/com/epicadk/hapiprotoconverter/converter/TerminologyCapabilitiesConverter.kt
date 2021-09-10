package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UrlConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UrlConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toProto
import com.google.fhir.r4.core.CapabilityStatementKindCode
import com.google.fhir.r4.core.CodeSearchSupportCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.TerminologyCapabilities
import com.google.fhir.r4.core.TerminologyCapabilities.CodeSystem
import com.google.fhir.r4.core.TerminologyCapabilities.CodeSystem.Version
import com.google.fhir.r4.core.TerminologyCapabilities.Expansion
import org.hl7.fhir.r4.model.Enumerations

public object TerminologyCapabilitiesConverter {
  public fun TerminologyCapabilities.toHapi(): org.hl7.fhir.r4.model.TerminologyCapabilities {
    val hapiValue = org.hl7.fhir.r4.model.TerminologyCapabilities()
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
      hapiValue.setKind(org.hl7.fhir.r4.model.TerminologyCapabilities.CapabilityStatementKind.valueOf(kind.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasSoftware()) {
      hapiValue.setSoftware(software.toHapi())
    }
    if (hasImplementation()) {
      hapiValue.setImplementation(implementation.toHapi())
    }
    if (hasLockedDate()) {
      hapiValue.setLockedDateElement(lockedDate.toHapi())
    }
    if (codeSystemCount > 0) {
      hapiValue.setCodeSystem(codeSystemList.map { it.toHapi() })
    }
    if (hasExpansion()) {
      hapiValue.setExpansion(expansion.toHapi())
    }
    if (hasCodeSearch()) {
      hapiValue.setCodeSearch(org.hl7.fhir.r4.model.TerminologyCapabilities.CodeSearchSupport.valueOf(codeSearch.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasValidateCode()) {
      hapiValue.setValidateCode(validateCode.toHapi())
    }
    if (hasTranslation()) {
      hapiValue.setTranslation(translation.toHapi())
    }
    if (hasClosure()) {
      hapiValue.setClosure(closure.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.TerminologyCapabilities.toProto(): TerminologyCapabilities {
    val protoValue = TerminologyCapabilities.newBuilder()
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
      protoValue.setStatus(TerminologyCapabilities.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
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
      protoValue.setKind(TerminologyCapabilities.KindCode.newBuilder().setValue(CapabilityStatementKindCode.Value.valueOf(kind.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasSoftware()) {
      protoValue.setSoftware(software.toProto())
    }
    if (hasImplementation()) {
      protoValue.setImplementation(implementation.toProto())
    }
    if (hasLockedDate()) {
      protoValue.setLockedDate(lockedDateElement.toProto())
    }
    if (hasCodeSystem()) {
      protoValue.addAllCodeSystem(codeSystem.map { it.toProto() })
    }
    if (hasExpansion()) {
      protoValue.setExpansion(expansion.toProto())
    }
    if (hasCodeSearch()) {
      protoValue.setCodeSearch(TerminologyCapabilities.CodeSearchCode.newBuilder().setValue(CodeSearchSupportCode.Value.valueOf(codeSearch.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasValidateCode()) {
      protoValue.setValidateCode(validateCode.toProto())
    }
    if (hasTranslation()) {
      protoValue.setTranslation(translation.toProto())
    }
    if (hasClosure()) {
      protoValue.setClosure(closure.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesSoftwareComponent.toProto():
      TerminologyCapabilities.Software {
    val protoValue = TerminologyCapabilities.Software.newBuilder()
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
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesImplementationComponent.toProto():
      TerminologyCapabilities.Implementation {
    val protoValue = TerminologyCapabilities.Implementation.newBuilder()
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
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemComponent.toProto():
      TerminologyCapabilities.CodeSystem {
    val protoValue = TerminologyCapabilities.CodeSystem.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasUri()) {
      protoValue.setUri(uriElement.toProto())
    }
    if (hasVersion()) {
      protoValue.addAllVersion(version.map { it.toProto() })
    }
    if (hasSubsumption()) {
      protoValue.setSubsumption(subsumptionElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemVersionComponent.toProto():
      TerminologyCapabilities.CodeSystem.Version {
    val protoValue = TerminologyCapabilities.CodeSystem.Version.newBuilder()
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
      protoValue.setCode(codeElement.toProto())
    }
    if (hasIsDefault()) {
      protoValue.setIsDefault(isDefaultElement.toProto())
    }
    if (hasCompositional()) {
      protoValue.setCompositional(compositionalElement.toProto())
    }
    if (hasLanguage()) {
      protoValue.addAllLanguage(language.map { it.toProto() })
    }
    if (hasFilter()) {
      protoValue.addAllFilter(filter.map { it.toProto() })
    }
    if (hasProperty()) {
      protoValue.addAllProperty(property.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemVersionFilterComponent.toProto():
      TerminologyCapabilities.CodeSystem.Version.Filter {
    val protoValue = TerminologyCapabilities.CodeSystem.Version.Filter.newBuilder()
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
      protoValue.setCode(codeElement.toProto())
    }
    if (hasOp()) {
      protoValue.addAllOp(op.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesExpansionComponent.toProto():
      TerminologyCapabilities.Expansion {
    val protoValue = TerminologyCapabilities.Expansion.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasHierarchical()) {
      protoValue.setHierarchical(hierarchicalElement.toProto())
    }
    if (hasPaging()) {
      protoValue.setPaging(pagingElement.toProto())
    }
    if (hasIncomplete()) {
      protoValue.setIncomplete(incompleteElement.toProto())
    }
    if (hasParameter()) {
      protoValue.addAllParameter(parameter.map { it.toProto() })
    }
    if (hasTextFilter()) {
      protoValue.setTextFilter(textFilterElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesExpansionParameterComponent.toProto():
      TerminologyCapabilities.Expansion.Parameter {
    val protoValue = TerminologyCapabilities.Expansion.Parameter.newBuilder()
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
    if (hasDocumentation()) {
      protoValue.setDocumentation(documentationElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesValidateCodeComponent.toProto():
      TerminologyCapabilities.ValidateCode {
    val protoValue = TerminologyCapabilities.ValidateCode.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasTranslations()) {
      protoValue.setTranslations(translationsElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesTranslationComponent.toProto():
      TerminologyCapabilities.Translation {
    val protoValue = TerminologyCapabilities.Translation.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasNeedsMap()) {
      protoValue.setNeedsMap(needsMapElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesClosureComponent.toProto():
      TerminologyCapabilities.Closure {
    val protoValue = TerminologyCapabilities.Closure.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasTranslation()) {
      protoValue.setTranslation(translationElement.toProto())
    }
    return protoValue.build()
  }

  private fun TerminologyCapabilities.Software.toHapi():
      org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesSoftwareComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesSoftwareComponent()
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
    return hapiValue
  }

  private fun TerminologyCapabilities.Implementation.toHapi():
      org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesImplementationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesImplementationComponent()
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
    return hapiValue
  }

  private fun TerminologyCapabilities.CodeSystem.toHapi():
      org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasUri()) {
      hapiValue.setUriElement(uri.toHapi())
    }
    if (versionCount > 0) {
      hapiValue.setVersion(versionList.map { it.toHapi() })
    }
    if (hasSubsumption()) {
      hapiValue.setSubsumptionElement(subsumption.toHapi())
    }
    return hapiValue
  }

  private fun TerminologyCapabilities.CodeSystem.Version.toHapi():
      org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemVersionComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemVersionComponent()
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
      hapiValue.setCodeElement(code.toHapi())
    }
    if (hasIsDefault()) {
      hapiValue.setIsDefaultElement(isDefault.toHapi())
    }
    if (hasCompositional()) {
      hapiValue.setCompositionalElement(compositional.toHapi())
    }
    if (languageCount > 0) {
      hapiValue.setLanguage(languageList.map { it.toHapi() })
    }
    if (filterCount > 0) {
      hapiValue.setFilter(filterList.map { it.toHapi() })
    }
    if (propertyCount > 0) {
      hapiValue.setProperty(propertyList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun TerminologyCapabilities.CodeSystem.Version.Filter.toHapi():
      org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemVersionFilterComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemVersionFilterComponent()
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
      hapiValue.setCodeElement(code.toHapi())
    }
    if (opCount > 0) {
      hapiValue.setOp(opList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun TerminologyCapabilities.Expansion.toHapi():
      org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesExpansionComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesExpansionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasHierarchical()) {
      hapiValue.setHierarchicalElement(hierarchical.toHapi())
    }
    if (hasPaging()) {
      hapiValue.setPagingElement(paging.toHapi())
    }
    if (hasIncomplete()) {
      hapiValue.setIncompleteElement(incomplete.toHapi())
    }
    if (parameterCount > 0) {
      hapiValue.setParameter(parameterList.map { it.toHapi() })
    }
    if (hasTextFilter()) {
      hapiValue.setTextFilterElement(textFilter.toHapi())
    }
    return hapiValue
  }

  private fun TerminologyCapabilities.Expansion.Parameter.toHapi():
      org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesExpansionParameterComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesExpansionParameterComponent()
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
    if (hasDocumentation()) {
      hapiValue.setDocumentationElement(documentation.toHapi())
    }
    return hapiValue
  }

  private fun TerminologyCapabilities.ValidateCode.toHapi():
      org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesValidateCodeComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesValidateCodeComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasTranslations()) {
      hapiValue.setTranslationsElement(translations.toHapi())
    }
    return hapiValue
  }

  private fun TerminologyCapabilities.Translation.toHapi():
      org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesTranslationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesTranslationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasNeedsMap()) {
      hapiValue.setNeedsMapElement(needsMap.toHapi())
    }
    return hapiValue
  }

  private fun TerminologyCapabilities.Closure.toHapi():
      org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesClosureComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesClosureComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasTranslation()) {
      hapiValue.setTranslationElement(translation.toHapi())
    }
    return hapiValue
  }
}
