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
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toProto
import com.google.fhir.r4.core.BindingStrengthCode
import com.google.fhir.r4.core.FHIRAllTypesValueSet
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.OperationDefinition
import com.google.fhir.r4.core.OperationDefinition.Parameter
import com.google.fhir.r4.core.OperationDefinition.Parameter.Binding
import com.google.fhir.r4.core.OperationKindCode
import com.google.fhir.r4.core.OperationParameterUseCode
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.ResourceTypeCode
import com.google.fhir.r4.core.SearchParamTypeCode
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.Enumerations

public object OperationDefinitionConverter {
  public fun OperationDefinition.toHapi(): org.hl7.fhir.r4.model.OperationDefinition {
    val hapiValue = org.hl7.fhir.r4.model.OperationDefinition()
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
    if (hasKind()) {
      hapiValue.setKind(org.hl7.fhir.r4.model.OperationDefinition.OperationKind.valueOf(kind.value.name.hapiCodeCheck().replace("_", "")))
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
    if (hasAffectsState()) {
      hapiValue.setAffectsStateElement(affectsState.toHapi())
    }
    if (hasCode()) {
      hapiValue.setCodeElement(code.toHapi())
    }
    if (hasComment()) {
      hapiValue.setCommentElement(comment.toHapi())
    }
    if (hasBase()) {
      hapiValue.setBaseElement(base.toHapi())
    }
    if (resourceCount > 0) {
      resourceList.forEach { hapiValue.addResource(it.value.name.hapiCodeCheck()) }
    }
    if (hasSystem()) {
      hapiValue.setSystemElement(system.toHapi())
    }
    if (hasType()) {
      hapiValue.setTypeElement(type.toHapi())
    }
    if (hasInstance()) {
      hapiValue.setInstanceElement(instance.toHapi())
    }
    if (hasInputProfile()) {
      hapiValue.setInputProfileElement(inputProfile.toHapi())
    }
    if (hasOutputProfile()) {
      hapiValue.setOutputProfileElement(outputProfile.toHapi())
    }
    if (parameterCount > 0) {
      hapiValue.setParameter(parameterList.map { it.toHapi() })
    }
    if (overloadCount > 0) {
      hapiValue.setOverload(overloadList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.OperationDefinition.toProto(): OperationDefinition {
    val protoValue = OperationDefinition.newBuilder()
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
      protoValue.setStatus(OperationDefinition.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasKind()) {
      protoValue.setKind(OperationDefinition.KindCode.newBuilder().setValue(OperationKindCode.Value.valueOf(kind.toCode().protoCodeCheck().replace("-",
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
    if (hasAffectsState()) {
      protoValue.setAffectsState(affectsStateElement.toProto())
    }
    if (hasCode()) {
      protoValue.setCode(codeElement.toProto())
    }
    if (hasComment()) {
      protoValue.setComment(commentElement.toProto())
    }
    if (hasBase()) {
      protoValue.setBase(baseElement.toProto())
    }
    if (hasResource()) {
      protoValue.addAllResource(resource.map { OperationDefinition.ResourceCode.newBuilder().setValue(ResourceTypeCode.Value.valueOf(it.valueAsString.protoCodeCheck())).build() })
    }
    if (hasSystem()) {
      protoValue.setSystem(systemElement.toProto())
    }
    if (hasType()) {
      protoValue.setType(typeElement.toProto())
    }
    if (hasInstance()) {
      protoValue.setInstance(instanceElement.toProto())
    }
    if (hasInputProfile()) {
      protoValue.setInputProfile(inputProfileElement.toProto())
    }
    if (hasOutputProfile()) {
      protoValue.setOutputProfile(outputProfileElement.toProto())
    }
    if (hasParameter()) {
      protoValue.addAllParameter(parameter.map { it.toProto() })
    }
    if (hasOverload()) {
      protoValue.addAllOverload(overload.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterComponent.toProto():
      OperationDefinition.Parameter {
    val protoValue = OperationDefinition.Parameter.newBuilder()
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
    if (hasUse()) {
      protoValue.setUse(OperationDefinition.Parameter.UseCode.newBuilder().setValue(OperationParameterUseCode.Value.valueOf(use.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasMin()) {
      protoValue.setMin(minElement.toProto())
    }
    if (hasMax()) {
      protoValue.setMax(maxElement.toProto())
    }
    if (hasDocumentation()) {
      protoValue.setDocumentation(documentationElement.toProto())
    }
    if (hasType()) {
      protoValue.setType(OperationDefinition.Parameter.TypeCode.newBuilder().setValue(FHIRAllTypesValueSet.Value.valueOf(type)).build())
    }
    if (hasTargetProfile()) {
      protoValue.addAllTargetProfile(targetProfile.map { it.toProto() })
    }
    if (hasSearchType()) {
      protoValue.setSearchType(OperationDefinition.Parameter.SearchTypeCode.newBuilder().setValue(SearchParamTypeCode.Value.valueOf(searchType.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasBinding()) {
      protoValue.setBinding(binding.toProto())
    }
    if (hasReferencedFrom()) {
      protoValue.addAllReferencedFrom(referencedFrom.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterBindingComponent.toProto():
      OperationDefinition.Parameter.Binding {
    val protoValue = OperationDefinition.Parameter.Binding.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasStrength()) {
      protoValue.setStrength(OperationDefinition.Parameter.Binding.StrengthCode.newBuilder().setValue(BindingStrengthCode.Value.valueOf(strength.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasValueSet()) {
      protoValue.setValueSet(valueSetElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterReferencedFromComponent.toProto():
      OperationDefinition.Parameter.ReferencedFrom {
    val protoValue = OperationDefinition.Parameter.ReferencedFrom.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSource()) {
      protoValue.setSource(sourceElement.toProto())
    }
    if (hasSourceId()) {
      protoValue.setSourceId(sourceIdElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionOverloadComponent.toProto():
      OperationDefinition.Overload {
    val protoValue = OperationDefinition.Overload.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasParameterName()) {
      protoValue.addAllParameterName(parameterName.map { it.toProto() })
    }
    if (hasComment()) {
      protoValue.setComment(commentElement.toProto())
    }
    return protoValue.build()
  }

  private fun OperationDefinition.Parameter.toHapi():
      org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterComponent()
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
    if (hasUse()) {
      hapiValue.setUse(org.hl7.fhir.r4.model.OperationDefinition.OperationParameterUse.valueOf(use.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasMin()) {
      hapiValue.setMinElement(min.toHapi())
    }
    if (hasMax()) {
      hapiValue.setMaxElement(max.toHapi())
    }
    if (hasDocumentation()) {
      hapiValue.setDocumentationElement(documentation.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(type.value.name)
    }
    if (targetProfileCount > 0) {
      hapiValue.setTargetProfile(targetProfileList.map { it.toHapi() })
    }
    if (hasSearchType()) {
      hapiValue.setSearchType(Enumerations.SearchParamType.valueOf(searchType.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasBinding()) {
      hapiValue.setBinding(binding.toHapi())
    }
    if (referencedFromCount > 0) {
      hapiValue.setReferencedFrom(referencedFromList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun OperationDefinition.Parameter.Binding.toHapi():
      org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterBindingComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterBindingComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasStrength()) {
      hapiValue.setStrength(Enumerations.BindingStrength.valueOf(strength.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasValueSet()) {
      hapiValue.setValueSetElement(valueSet.toHapi())
    }
    return hapiValue
  }

  private fun OperationDefinition.Parameter.ReferencedFrom.toHapi():
      org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterReferencedFromComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterReferencedFromComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasSource()) {
      hapiValue.setSourceElement(source.toHapi())
    }
    if (hasSourceId()) {
      hapiValue.setSourceIdElement(sourceId.toHapi())
    }
    return hapiValue
  }

  private fun OperationDefinition.Overload.toHapi():
      org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionOverloadComponent {
    val hapiValue = org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionOverloadComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (parameterNameCount > 0) {
      hapiValue.setParameterName(parameterNameList.map { it.toHapi() })
    }
    if (hasComment()) {
      hapiValue.setCommentElement(comment.toHapi())
    }
    return hapiValue
  }
}
