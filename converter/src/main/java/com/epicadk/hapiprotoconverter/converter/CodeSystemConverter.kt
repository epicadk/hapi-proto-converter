package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toProto
import com.google.fhir.r4.core.CodeSystem
import com.google.fhir.r4.core.CodeSystem.ConceptDefinition
import com.google.fhir.r4.core.CodeSystem.ConceptDefinition.ConceptProperty
import com.google.fhir.r4.core.CodeSystem.Filter
import com.google.fhir.r4.core.CodeSystem.Property
import com.google.fhir.r4.core.CodeSystemContentModeCode
import com.google.fhir.r4.core.CodeSystemHierarchyMeaningCode
import com.google.fhir.r4.core.FilterOperatorCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.PropertyTypeCode
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.CodeType
import org.hl7.fhir.r4.model.Coding
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.DecimalType
import org.hl7.fhir.r4.model.Enumerations
import org.hl7.fhir.r4.model.IntegerType
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object CodeSystemConverter {
  private
      fun CodeSystem.ConceptDefinition.ConceptProperty.ValueX.codeSystemConceptPropertyValueToHapi():
      Type {
    if (hasCode()) {
      return (this.getCode()).toHapi()
    }
    if (hasCoding()) {
      return (this.getCoding()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    if (hasInteger()) {
      return (this.getInteger()).toHapi()
    }
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasDecimal()) {
      return (this.getDecimal()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for CodeSystem.concept.property.value[x]")
  }

  private fun Type.codeSystemConceptPropertyValueToProto():
      CodeSystem.ConceptDefinition.ConceptProperty.ValueX {
    val protoValue = CodeSystem.ConceptDefinition.ConceptProperty.ValueX.newBuilder()
    if (this is CodeType) {
      protoValue.setCode(this.toProto())
    }
    if (this is Coding) {
      protoValue.setCoding(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is IntegerType) {
      protoValue.setInteger(this.toProto())
    }
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is DecimalType) {
      protoValue.setDecimal(this.toProto())
    }
    return protoValue.build()
  }

  public fun CodeSystem.toHapi(): org.hl7.fhir.r4.model.CodeSystem {
    val hapiValue = org.hl7.fhir.r4.model.CodeSystem()
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
    if (hasPurpose()) {
      hapiValue.setPurposeElement(purpose.toHapi())
    }
    if (hasCopyright()) {
      hapiValue.setCopyrightElement(copyright.toHapi())
    }
    if (hasCaseSensitive()) {
      hapiValue.setCaseSensitiveElement(caseSensitive.toHapi())
    }
    if (hasValueSet()) {
      hapiValue.setValueSetElement(valueSet.toHapi())
    }
    if (hasHierarchyMeaning()) {
      hapiValue.setHierarchyMeaning(org.hl7.fhir.r4.model.CodeSystem.CodeSystemHierarchyMeaning.valueOf(hierarchyMeaning.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCompositional()) {
      hapiValue.setCompositionalElement(compositional.toHapi())
    }
    if (hasVersionNeeded()) {
      hapiValue.setVersionNeededElement(versionNeeded.toHapi())
    }
    if (hasContent()) {
      hapiValue.setContent(org.hl7.fhir.r4.model.CodeSystem.CodeSystemContentMode.valueOf(content.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasSupplements()) {
      hapiValue.setSupplementsElement(supplements.toHapi())
    }
    if (hasCount()) {
      hapiValue.setCountElement(count.toHapi())
    }
    if (filterCount > 0) {
      hapiValue.setFilter(filterList.map { it.toHapi() })
    }
    if (propertyCount > 0) {
      hapiValue.setProperty(propertyList.map { it.toHapi() })
    }
    if (conceptCount > 0) {
      hapiValue.setConcept(conceptList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.CodeSystem.toProto(): CodeSystem {
    val protoValue = CodeSystem.newBuilder()
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
      protoValue.setStatus(CodeSystem.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
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
    if (hasCaseSensitive()) {
      protoValue.setCaseSensitive(caseSensitiveElement.toProto())
    }
    if (hasValueSet()) {
      protoValue.setValueSet(valueSetElement.toProto())
    }
    if (hasHierarchyMeaning()) {
      protoValue.setHierarchyMeaning(CodeSystem.HierarchyMeaningCode.newBuilder().setValue(CodeSystemHierarchyMeaningCode.Value.valueOf(hierarchyMeaning.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCompositional()) {
      protoValue.setCompositional(compositionalElement.toProto())
    }
    if (hasVersionNeeded()) {
      protoValue.setVersionNeeded(versionNeededElement.toProto())
    }
    if (hasContent()) {
      protoValue.setContent(CodeSystem.ContentCode.newBuilder().setValue(CodeSystemContentModeCode.Value.valueOf(content.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasSupplements()) {
      protoValue.setSupplements(supplementsElement.toProto())
    }
    if (hasCount()) {
      protoValue.setCount(countElement.toProto())
    }
    if (hasFilter()) {
      protoValue.addAllFilter(filter.map { it.toProto() })
    }
    if (hasProperty()) {
      protoValue.addAllProperty(property.map { it.toProto() })
    }
    if (hasConcept()) {
      protoValue.addAllConcept(concept.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.CodeSystem.CodeSystemFilterComponent.toProto():
      CodeSystem.Filter {
    val protoValue = CodeSystem.Filter.newBuilder()
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
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasOperator()) {
      protoValue.addAllOperator(operator.map { CodeSystem.Filter.OperatorCode.newBuilder().setValue(FilterOperatorCode.Value.valueOf(it.value.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build() })
    }
    if (hasValue()) {
      protoValue.setValue(valueElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.CodeSystem.PropertyComponent.toProto(): CodeSystem.Property {
    val protoValue = CodeSystem.Property.newBuilder()
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
    if (hasUri()) {
      protoValue.setUri(uriElement.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasType()) {
      protoValue.setType(CodeSystem.Property.TypeCode.newBuilder().setValue(PropertyTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.CodeSystem.ConceptDefinitionComponent.toProto():
      CodeSystem.ConceptDefinition {
    val protoValue = CodeSystem.ConceptDefinition.newBuilder()
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
    if (hasDefinition()) {
      protoValue.setDefinition(definitionElement.toProto())
    }
    if (hasDesignation()) {
      protoValue.addAllDesignation(designation.map { it.toProto() })
    }
    if (hasProperty()) {
      protoValue.addAllProperty(property.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.CodeSystem.ConceptDefinitionDesignationComponent.toProto():
      CodeSystem.ConceptDefinition.Designation {
    val protoValue = CodeSystem.ConceptDefinition.Designation.newBuilder()
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

  private fun org.hl7.fhir.r4.model.CodeSystem.ConceptPropertyComponent.toProto():
      CodeSystem.ConceptDefinition.ConceptProperty {
    val protoValue = CodeSystem.ConceptDefinition.ConceptProperty.newBuilder()
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
    if (hasValue()) {
      protoValue.setValue(value.codeSystemConceptPropertyValueToProto())
    }
    return protoValue.build()
  }

  private fun CodeSystem.Filter.toHapi():
      org.hl7.fhir.r4.model.CodeSystem.CodeSystemFilterComponent {
    val hapiValue = org.hl7.fhir.r4.model.CodeSystem.CodeSystemFilterComponent()
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
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (operatorCount > 0) {
      operatorList.forEach { hapiValue.addOperator(org.hl7.fhir.r4.model.CodeSystem.FilterOperator.valueOf(it.value.name.hapiCodeCheck().replace("_", ""))) }
    }
    if (hasValue()) {
      hapiValue.setValueElement(value.toHapi())
    }
    return hapiValue
  }

  private fun CodeSystem.Property.toHapi(): org.hl7.fhir.r4.model.CodeSystem.PropertyComponent {
    val hapiValue = org.hl7.fhir.r4.model.CodeSystem.PropertyComponent()
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
    if (hasUri()) {
      hapiValue.setUriElement(uri.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(org.hl7.fhir.r4.model.CodeSystem.PropertyType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    return hapiValue
  }

  private fun CodeSystem.ConceptDefinition.toHapi():
      org.hl7.fhir.r4.model.CodeSystem.ConceptDefinitionComponent {
    val hapiValue = org.hl7.fhir.r4.model.CodeSystem.ConceptDefinitionComponent()
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
    if (hasDefinition()) {
      hapiValue.setDefinitionElement(definition.toHapi())
    }
    if (designationCount > 0) {
      hapiValue.setDesignation(designationList.map { it.toHapi() })
    }
    if (propertyCount > 0) {
      hapiValue.setProperty(propertyList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun CodeSystem.ConceptDefinition.Designation.toHapi():
      org.hl7.fhir.r4.model.CodeSystem.ConceptDefinitionDesignationComponent {
    val hapiValue = org.hl7.fhir.r4.model.CodeSystem.ConceptDefinitionDesignationComponent()
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

  private fun CodeSystem.ConceptDefinition.ConceptProperty.toHapi():
      org.hl7.fhir.r4.model.CodeSystem.ConceptPropertyComponent {
    val hapiValue = org.hl7.fhir.r4.model.CodeSystem.ConceptPropertyComponent()
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
    if (hasValue()) {
      hapiValue.setValue(value.codeSystemConceptPropertyValueToHapi())
    }
    return hapiValue
  }
}
