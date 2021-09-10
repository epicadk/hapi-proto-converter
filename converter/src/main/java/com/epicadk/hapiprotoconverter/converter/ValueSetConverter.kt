package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toProto
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
import com.google.fhir.r4.core.FilterOperatorCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.ValueSet
import com.google.fhir.r4.core.ValueSet.Compose
import com.google.fhir.r4.core.ValueSet.Compose.ConceptSet
import com.google.fhir.r4.core.ValueSet.Compose.ConceptSet.ConceptReference
import com.google.fhir.r4.core.ValueSet.Compose.ConceptSet.Filter
import com.google.fhir.r4.core.ValueSet.Expansion
import com.google.fhir.r4.core.ValueSet.Expansion.Parameter
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.CodeType
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.DecimalType
import org.hl7.fhir.r4.model.Enumerations
import org.hl7.fhir.r4.model.IntegerType
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type
import org.hl7.fhir.r4.model.UriType

public object ValueSetConverter {
  private fun ValueSet.Expansion.Parameter.ValueX.valueSetExpansionParameterValueToHapi(): Type {
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasInteger()) {
      return (this.getInteger()).toHapi()
    }
    if (hasDecimal()) {
      return (this.getDecimal()).toHapi()
    }
    if (hasUri()) {
      return (this.getUri()).toHapi()
    }
    if (hasCode()) {
      return (this.getCode()).toHapi()
    }
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ValueSet.expansion.parameter.value[x]")
  }

  private fun Type.valueSetExpansionParameterValueToProto(): ValueSet.Expansion.Parameter.ValueX {
    val protoValue = ValueSet.Expansion.Parameter.ValueX.newBuilder()
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is IntegerType) {
      protoValue.setInteger(this.toProto())
    }
    if (this is DecimalType) {
      protoValue.setDecimal(this.toProto())
    }
    if (this is UriType) {
      protoValue.setUri(this.toProto())
    }
    if (this is CodeType) {
      protoValue.setCode(this.toProto())
    }
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    return protoValue.build()
  }

  public fun ValueSet.toHapi(): org.hl7.fhir.r4.model.ValueSet {
    val hapiValue = org.hl7.fhir.r4.model.ValueSet()
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
    if (hasImmutable()) {
      hapiValue.setImmutableElement(immutable.toHapi())
    }
    if (hasPurpose()) {
      hapiValue.setPurposeElement(purpose.toHapi())
    }
    if (hasCopyright()) {
      hapiValue.setCopyrightElement(copyright.toHapi())
    }
    if (hasCompose()) {
      hapiValue.setCompose(compose.toHapi())
    }
    if (hasExpansion()) {
      hapiValue.setExpansion(expansion.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ValueSet.toProto(): ValueSet {
    val protoValue = ValueSet.newBuilder()
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
    if (hasStatus()) {
      protoValue.setStatus(ValueSet.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
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
    if (hasImmutable()) {
      protoValue.setImmutable(immutableElement.toProto())
    }
    if (hasPurpose()) {
      protoValue.setPurpose(purposeElement.toProto())
    }
    if (hasCopyright()) {
      protoValue.setCopyright(copyrightElement.toProto())
    }
    if (hasCompose()) {
      protoValue.setCompose(compose.toProto())
    }
    if (hasExpansion()) {
      protoValue.setExpansion(expansion.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ValueSet.ValueSetComposeComponent.toProto(): ValueSet.Compose {
    val protoValue = ValueSet.Compose.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasLockedDate()) {
      protoValue.setLockedDate(lockedDateElement.toProto())
    }
    if (hasInactive()) {
      protoValue.setInactive(inactiveElement.toProto())
    }
    if (hasInclude()) {
      protoValue.addAllInclude(include.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ValueSet.ConceptSetComponent.toProto():
      ValueSet.Compose.ConceptSet {
    val protoValue = ValueSet.Compose.ConceptSet.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSystem()) {
      protoValue.setSystem(systemElement.toProto())
    }
    if (hasVersion()) {
      protoValue.setVersion(versionElement.toProto())
    }
    if (hasConcept()) {
      protoValue.addAllConcept(concept.map { it.toProto() })
    }
    if (hasFilter()) {
      protoValue.addAllFilter(filter.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ValueSet.ConceptReferenceComponent.toProto():
      ValueSet.Compose.ConceptSet.ConceptReference {
    val protoValue = ValueSet.Compose.ConceptSet.ConceptReference.newBuilder()
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
    if (hasDisplay()) {
      protoValue.setDisplay(displayElement.toProto())
    }
    if (hasDesignation()) {
      protoValue.addAllDesignation(designation.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent.toProto():
      ValueSet.Compose.ConceptSet.ConceptReference.Designation {
    val protoValue = ValueSet.Compose.ConceptSet.ConceptReference.Designation.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasUse()) {
      protoValue.setUse(use.toProto())
    }
    if (hasValue()) {
      protoValue.setValue(valueElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ValueSet.ConceptSetFilterComponent.toProto():
      ValueSet.Compose.ConceptSet.Filter {
    val protoValue = ValueSet.Compose.ConceptSet.Filter.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasProperty()) {
      protoValue.setProperty(propertyElement.toProto())
    }
    if (hasOp()) {
      protoValue.setOp(ValueSet.Compose.ConceptSet.Filter.OpCode.newBuilder().setValue(FilterOperatorCode.Value.valueOf(op.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasValue()) {
      protoValue.setValue(valueElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionComponent.toProto():
      ValueSet.Expansion {
    val protoValue = ValueSet.Expansion.newBuilder()
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
    if (hasTimestamp()) {
      protoValue.setTimestamp(timestampElement.toProto())
    }
    if (hasTotal()) {
      protoValue.setTotal(totalElement.toProto())
    }
    if (hasOffset()) {
      protoValue.setOffset(offsetElement.toProto())
    }
    if (hasParameter()) {
      protoValue.addAllParameter(parameter.map { it.toProto() })
    }
    if (hasContains()) {
      protoValue.addAllContains(contains.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionParameterComponent.toProto():
      ValueSet.Expansion.Parameter {
    val protoValue = ValueSet.Expansion.Parameter.newBuilder()
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
    if (hasValue()) {
      protoValue.setValue(value.valueSetExpansionParameterValueToProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionContainsComponent.toProto():
      ValueSet.Expansion.Contains {
    val protoValue = ValueSet.Expansion.Contains.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSystem()) {
      protoValue.setSystem(systemElement.toProto())
    }
    if (hasAbstract()) {
      protoValue.setAbstract(abstractElement.toProto())
    }
    if (hasInactive()) {
      protoValue.setInactive(inactiveElement.toProto())
    }
    if (hasVersion()) {
      protoValue.setVersion(versionElement.toProto())
    }
    if (hasCode()) {
      protoValue.setCode(codeElement.toProto())
    }
    if (hasDisplay()) {
      protoValue.setDisplay(displayElement.toProto())
    }
    return protoValue.build()
  }

  private fun ValueSet.Compose.toHapi(): org.hl7.fhir.r4.model.ValueSet.ValueSetComposeComponent {
    val hapiValue = org.hl7.fhir.r4.model.ValueSet.ValueSetComposeComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasLockedDate()) {
      hapiValue.setLockedDateElement(lockedDate.toHapi())
    }
    if (hasInactive()) {
      hapiValue.setInactiveElement(inactive.toHapi())
    }
    if (includeCount > 0) {
      hapiValue.setInclude(includeList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ValueSet.Compose.ConceptSet.toHapi():
      org.hl7.fhir.r4.model.ValueSet.ConceptSetComponent {
    val hapiValue = org.hl7.fhir.r4.model.ValueSet.ConceptSetComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasSystem()) {
      hapiValue.setSystemElement(system.toHapi())
    }
    if (hasVersion()) {
      hapiValue.setVersionElement(version.toHapi())
    }
    if (conceptCount > 0) {
      hapiValue.setConcept(conceptList.map { it.toHapi() })
    }
    if (filterCount > 0) {
      hapiValue.setFilter(filterList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ValueSet.Compose.ConceptSet.ConceptReference.toHapi():
      org.hl7.fhir.r4.model.ValueSet.ConceptReferenceComponent {
    val hapiValue = org.hl7.fhir.r4.model.ValueSet.ConceptReferenceComponent()
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
    if (hasDisplay()) {
      hapiValue.setDisplayElement(display.toHapi())
    }
    if (designationCount > 0) {
      hapiValue.setDesignation(designationList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ValueSet.Compose.ConceptSet.ConceptReference.Designation.toHapi():
      org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent {
    val hapiValue = org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasUse()) {
      hapiValue.setUse(use.toHapi())
    }
    if (hasValue()) {
      hapiValue.setValueElement(value.toHapi())
    }
    return hapiValue
  }

  private fun ValueSet.Compose.ConceptSet.Filter.toHapi():
      org.hl7.fhir.r4.model.ValueSet.ConceptSetFilterComponent {
    val hapiValue = org.hl7.fhir.r4.model.ValueSet.ConceptSetFilterComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasProperty()) {
      hapiValue.setPropertyElement(property.toHapi())
    }
    if (hasOp()) {
      hapiValue.setOp(org.hl7.fhir.r4.model.ValueSet.FilterOperator.valueOf(op.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasValue()) {
      hapiValue.setValueElement(value.toHapi())
    }
    return hapiValue
  }

  private fun ValueSet.Expansion.toHapi():
      org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionComponent {
    val hapiValue = org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionComponent()
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
    if (hasTimestamp()) {
      hapiValue.setTimestampElement(timestamp.toHapi())
    }
    if (hasTotal()) {
      hapiValue.setTotalElement(total.toHapi())
    }
    if (hasOffset()) {
      hapiValue.setOffsetElement(offset.toHapi())
    }
    if (parameterCount > 0) {
      hapiValue.setParameter(parameterList.map { it.toHapi() })
    }
    if (containsCount > 0) {
      hapiValue.setContains(containsList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ValueSet.Expansion.Parameter.toHapi():
      org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionParameterComponent {
    val hapiValue = org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionParameterComponent()
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
    if (hasValue()) {
      hapiValue.setValue(value.valueSetExpansionParameterValueToHapi())
    }
    return hapiValue
  }

  private fun ValueSet.Expansion.Contains.toHapi():
      org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionContainsComponent {
    val hapiValue = org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionContainsComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasSystem()) {
      hapiValue.setSystemElement(system.toHapi())
    }
    if (hasAbstract()) {
      hapiValue.setAbstractElement(abstract.toHapi())
    }
    if (hasInactive()) {
      hapiValue.setInactiveElement(inactive.toHapi())
    }
    if (hasVersion()) {
      hapiValue.setVersionElement(version.toHapi())
    }
    if (hasCode()) {
      hapiValue.setCodeElement(code.toHapi())
    }
    if (hasDisplay()) {
      hapiValue.setDisplayElement(display.toHapi())
    }
    return hapiValue
  }
}
