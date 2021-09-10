package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
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
import com.google.fhir.r4.core.CompartmentTypeCode
import com.google.fhir.r4.core.GraphCompartmentRuleCode
import com.google.fhir.r4.core.GraphCompartmentUseCode
import com.google.fhir.r4.core.GraphDefinition
import com.google.fhir.r4.core.GraphDefinition.Link
import com.google.fhir.r4.core.GraphDefinition.Link.Target
import com.google.fhir.r4.core.GraphDefinition.Link.Target.Compartment
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.ResourceTypeCode
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.Enumerations

public object GraphDefinitionConverter {
  public fun GraphDefinition.toHapi(): org.hl7.fhir.r4.model.GraphDefinition {
    val hapiValue = org.hl7.fhir.r4.model.GraphDefinition()
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
    if (hasStart()) {
      hapiValue.setStart(start.value.name)
    }
    if (hasProfile()) {
      hapiValue.setProfileElement(profile.toHapi())
    }
    if (linkCount > 0) {
      hapiValue.setLink(linkList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.GraphDefinition.toProto(): GraphDefinition {
    val protoValue = GraphDefinition.newBuilder()
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
    if (hasStatus()) {
      protoValue.setStatus(GraphDefinition.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
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
    if (hasStart()) {
      protoValue.setStart(GraphDefinition.StartCode.newBuilder().setValue(ResourceTypeCode.Value.valueOf(start)).build())
    }
    if (hasProfile()) {
      protoValue.setProfile(profileElement.toProto())
    }
    if (hasLink()) {
      protoValue.addAllLink(link.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.GraphDefinition.GraphDefinitionLinkComponent.toProto():
      GraphDefinition.Link {
    val protoValue = GraphDefinition.Link.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasPath()) {
      protoValue.setPath(pathElement.toProto())
    }
    if (hasSliceName()) {
      protoValue.setSliceName(sliceNameElement.toProto())
    }
    if (hasMin()) {
      protoValue.setMin(minElement.toProto())
    }
    if (hasMax()) {
      protoValue.setMax(maxElement.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasTarget()) {
      protoValue.addAllTarget(target.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.GraphDefinition.GraphDefinitionLinkTargetComponent.toProto():
      GraphDefinition.Link.Target {
    val protoValue = GraphDefinition.Link.Target.newBuilder()
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
      protoValue.setType(GraphDefinition.Link.Target.TypeCode.newBuilder().setValue(ResourceTypeCode.Value.valueOf(type)).build())
    }
    if (hasParams()) {
      protoValue.setParams(paramsElement.toProto())
    }
    if (hasProfile()) {
      protoValue.setProfile(profileElement.toProto())
    }
    if (hasCompartment()) {
      protoValue.addAllCompartment(compartment.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.GraphDefinition.GraphDefinitionLinkTargetCompartmentComponent.toProto():
      GraphDefinition.Link.Target.Compartment {
    val protoValue = GraphDefinition.Link.Target.Compartment.newBuilder()
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
      protoValue.setUse(GraphDefinition.Link.Target.Compartment.UseCode.newBuilder().setValue(GraphCompartmentUseCode.Value.valueOf(use.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCode()) {
      protoValue.setCode(GraphDefinition.Link.Target.Compartment.CodeType.newBuilder().setValue(CompartmentTypeCode.Value.valueOf(code.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasRule()) {
      protoValue.setRule(GraphDefinition.Link.Target.Compartment.RuleCode.newBuilder().setValue(GraphCompartmentRuleCode.Value.valueOf(rule.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasExpression()) {
      protoValue.setExpression(expressionElement.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    return protoValue.build()
  }

  private fun GraphDefinition.Link.toHapi():
      org.hl7.fhir.r4.model.GraphDefinition.GraphDefinitionLinkComponent {
    val hapiValue = org.hl7.fhir.r4.model.GraphDefinition.GraphDefinitionLinkComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasPath()) {
      hapiValue.setPathElement(path.toHapi())
    }
    if (hasSliceName()) {
      hapiValue.setSliceNameElement(sliceName.toHapi())
    }
    if (hasMin()) {
      hapiValue.setMinElement(min.toHapi())
    }
    if (hasMax()) {
      hapiValue.setMaxElement(max.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (targetCount > 0) {
      hapiValue.setTarget(targetList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun GraphDefinition.Link.Target.toHapi():
      org.hl7.fhir.r4.model.GraphDefinition.GraphDefinitionLinkTargetComponent {
    val hapiValue = org.hl7.fhir.r4.model.GraphDefinition.GraphDefinitionLinkTargetComponent()
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
    if (hasParams()) {
      hapiValue.setParamsElement(params.toHapi())
    }
    if (hasProfile()) {
      hapiValue.setProfileElement(profile.toHapi())
    }
    if (compartmentCount > 0) {
      hapiValue.setCompartment(compartmentList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun GraphDefinition.Link.Target.Compartment.toHapi():
      org.hl7.fhir.r4.model.GraphDefinition.GraphDefinitionLinkTargetCompartmentComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.GraphDefinition.GraphDefinitionLinkTargetCompartmentComponent()
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
      hapiValue.setUse(org.hl7.fhir.r4.model.GraphDefinition.GraphCompartmentUse.valueOf(use.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCode()) {
      hapiValue.setCode(org.hl7.fhir.r4.model.GraphDefinition.CompartmentCode.valueOf(code.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasRule()) {
      hapiValue.setRule(org.hl7.fhir.r4.model.GraphDefinition.GraphCompartmentRule.valueOf(rule.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasExpression()) {
      hapiValue.setExpressionElement(expression.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    return hapiValue
  }
}
