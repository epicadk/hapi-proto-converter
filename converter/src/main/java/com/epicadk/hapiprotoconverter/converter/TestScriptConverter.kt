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
import com.epicadk.hapiprotoconverter.converter.IdConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toProto
import com.google.fhir.r4.core.AssertionDirectionTypeCode
import com.google.fhir.r4.core.AssertionOperatorTypeCode
import com.google.fhir.r4.core.AssertionResponseTypesCode
import com.google.fhir.r4.core.FHIRDefinedTypeValueSet
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.TestScript
import com.google.fhir.r4.core.TestScript.Metadata
import com.google.fhir.r4.core.TestScript.Setup
import com.google.fhir.r4.core.TestScript.Setup.SetupAction
import com.google.fhir.r4.core.TestScript.Setup.SetupAction.Assert
import com.google.fhir.r4.core.TestScript.Setup.SetupAction.Operation
import com.google.fhir.r4.core.TestScript.Teardown
import com.google.fhir.r4.core.TestScript.Test
import com.google.fhir.r4.core.TestScriptRequestMethodCode
import org.hl7.fhir.r4.model.Enumerations

public object TestScriptConverter {
  public fun TestScript.toHapi(): org.hl7.fhir.r4.model.TestScript {
    val hapiValue = org.hl7.fhir.r4.model.TestScript()
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
    if (hasIdentifier()) {
      hapiValue.setIdentifier(identifier.toHapi())
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
    if (originCount > 0) {
      hapiValue.setOrigin(originList.map { it.toHapi() })
    }
    if (destinationCount > 0) {
      hapiValue.setDestination(destinationList.map { it.toHapi() })
    }
    if (hasMetadata()) {
      hapiValue.setMetadata(metadata.toHapi())
    }
    if (fixtureCount > 0) {
      hapiValue.setFixture(fixtureList.map { it.toHapi() })
    }
    if (profileCount > 0) {
      hapiValue.setProfile(profileList.map { it.toHapi() })
    }
    if (variableCount > 0) {
      hapiValue.setVariable(variableList.map { it.toHapi() })
    }
    if (hasSetup()) {
      hapiValue.setSetup(setup.toHapi())
    }
    if (testCount > 0) {
      hapiValue.setTest(testList.map { it.toHapi() })
    }
    if (hasTeardown()) {
      hapiValue.setTeardown(teardown.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.TestScript.toProto(): TestScript {
    val protoValue = TestScript.newBuilder()
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
      protoValue.setIdentifier(identifier.toProto())
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
      protoValue.setStatus(TestScript.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
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
    if (hasOrigin()) {
      protoValue.addAllOrigin(origin.map { it.toProto() })
    }
    if (hasDestination()) {
      protoValue.addAllDestination(destination.map { it.toProto() })
    }
    if (hasMetadata()) {
      protoValue.setMetadata(metadata.toProto())
    }
    if (hasFixture()) {
      protoValue.addAllFixture(fixture.map { it.toProto() })
    }
    if (hasProfile()) {
      protoValue.addAllProfile(profile.map { it.toProto() })
    }
    if (hasVariable()) {
      protoValue.addAllVariable(variable.map { it.toProto() })
    }
    if (hasSetup()) {
      protoValue.setSetup(setup.toProto())
    }
    if (hasTest()) {
      protoValue.addAllTest(test.map { it.toProto() })
    }
    if (hasTeardown()) {
      protoValue.setTeardown(teardown.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestScript.TestScriptOriginComponent.toProto():
      TestScript.Origin {
    val protoValue = TestScript.Origin.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasIndex()) {
      protoValue.setIndex(indexElement.toProto())
    }
    if (hasProfile()) {
      protoValue.setProfile(profile.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestScript.TestScriptDestinationComponent.toProto():
      TestScript.Destination {
    val protoValue = TestScript.Destination.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasIndex()) {
      protoValue.setIndex(indexElement.toProto())
    }
    if (hasProfile()) {
      protoValue.setProfile(profile.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestScript.TestScriptMetadataComponent.toProto():
      TestScript.Metadata {
    val protoValue = TestScript.Metadata.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasLink()) {
      protoValue.addAllLink(link.map { it.toProto() })
    }
    if (hasCapability()) {
      protoValue.addAllCapability(capability.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestScript.TestScriptMetadataLinkComponent.toProto():
      TestScript.Metadata.Link {
    val protoValue = TestScript.Metadata.Link.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
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
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestScript.TestScriptMetadataCapabilityComponent.toProto():
      TestScript.Metadata.Capability {
    val protoValue = TestScript.Metadata.Capability.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasRequired()) {
      protoValue.setRequired(requiredElement.toProto())
    }
    if (hasValidated()) {
      protoValue.setValidated(validatedElement.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasOrigin()) {
      protoValue.addAllOrigin(origin.map { it.toProto() })
    }
    if (hasDestination()) {
      protoValue.setDestination(destinationElement.toProto())
    }
    if (hasLink()) {
      protoValue.addAllLink(link.map { it.toProto() })
    }
    if (hasCapabilities()) {
      protoValue.setCapabilities(capabilitiesElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestScript.TestScriptFixtureComponent.toProto():
      TestScript.Fixture {
    val protoValue = TestScript.Fixture.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasAutocreate()) {
      protoValue.setAutocreate(autocreateElement.toProto())
    }
    if (hasAutodelete()) {
      protoValue.setAutodelete(autodeleteElement.toProto())
    }
    if (hasResource()) {
      protoValue.setResource(resource.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestScript.TestScriptVariableComponent.toProto():
      TestScript.Variable {
    val protoValue = TestScript.Variable.newBuilder()
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
    if (hasDefaultValue()) {
      protoValue.setDefaultValue(defaultValueElement.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasExpression()) {
      protoValue.setExpression(expressionElement.toProto())
    }
    if (hasHeaderField()) {
      protoValue.setHeaderField(headerFieldElement.toProto())
    }
    if (hasHint()) {
      protoValue.setHint(hintElement.toProto())
    }
    if (hasPath()) {
      protoValue.setPath(pathElement.toProto())
    }
    if (hasSourceId()) {
      protoValue.setSourceId(sourceIdElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestScript.TestScriptSetupComponent.toProto():
      TestScript.Setup {
    val protoValue = TestScript.Setup.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasAction()) {
      protoValue.addAllAction(action.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestScript.SetupActionComponent.toProto():
      TestScript.Setup.SetupAction {
    val protoValue = TestScript.Setup.SetupAction.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasOperation()) {
      protoValue.setOperation(operation.toProto())
    }
    if (hasAssert()) {
      protoValue.setAssertValue(assert.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestScript.SetupActionOperationComponent.toProto():
      TestScript.Setup.SetupAction.Operation {
    val protoValue = TestScript.Setup.SetupAction.Operation.newBuilder()
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
      protoValue.setType(type.toProto())
    }
    if (hasResource()) {
      protoValue.setResource(TestScript.Setup.SetupAction.Operation.ResourceCode.newBuilder().setValue(FHIRDefinedTypeValueSet.Value.valueOf(resource)).build())
    }
    if (hasLabel()) {
      protoValue.setLabel(labelElement.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasAccept()) {
      protoValue.setAccept(TestScript.Setup.SetupAction.Operation.AcceptCode.newBuilder().setValue(accept.protoCodeCheck()).build())
    }
    if (hasContentType()) {
      protoValue.setContentType(TestScript.Setup.SetupAction.Operation.ContentTypeCode.newBuilder().setValue(contentType.protoCodeCheck()).build())
    }
    if (hasDestination()) {
      protoValue.setDestination(destinationElement.toProto())
    }
    if (hasEncodeRequestUrl()) {
      protoValue.setEncodeRequestUrl(encodeRequestUrlElement.toProto())
    }
    if (hasMethod()) {
      protoValue.setMethod(TestScript.Setup.SetupAction.Operation.MethodCode.newBuilder().setValue(TestScriptRequestMethodCode.Value.valueOf(method.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasOrigin()) {
      protoValue.setOrigin(originElement.toProto())
    }
    if (hasParams()) {
      protoValue.setParams(paramsElement.toProto())
    }
    if (hasRequestHeader()) {
      protoValue.addAllRequestHeader(requestHeader.map { it.toProto() })
    }
    if (hasRequestId()) {
      protoValue.setRequestId(requestIdElement.toProto())
    }
    if (hasResponseId()) {
      protoValue.setResponseId(responseIdElement.toProto())
    }
    if (hasSourceId()) {
      protoValue.setSourceId(sourceIdElement.toProto())
    }
    if (hasTargetId()) {
      protoValue.setTargetId(targetIdElement.toProto())
    }
    if (hasUrl()) {
      protoValue.setUrl(urlElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent.toProto():
      TestScript.Setup.SetupAction.Operation.RequestHeader {
    val protoValue = TestScript.Setup.SetupAction.Operation.RequestHeader.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasField()) {
      protoValue.setField(fieldElement.toProto())
    }
    if (hasValue()) {
      protoValue.setValue(valueElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestScript.SetupActionAssertComponent.toProto():
      TestScript.Setup.SetupAction.Assert {
    val protoValue = TestScript.Setup.SetupAction.Assert.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasLabel()) {
      protoValue.setLabel(labelElement.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasDirection()) {
      protoValue.setDirection(TestScript.Setup.SetupAction.Assert.DirectionCode.newBuilder().setValue(AssertionDirectionTypeCode.Value.valueOf(direction.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCompareToSourceId()) {
      protoValue.setCompareToSourceId(compareToSourceIdElement.toProto())
    }
    if (hasCompareToSourceExpression()) {
      protoValue.setCompareToSourceExpression(compareToSourceExpressionElement.toProto())
    }
    if (hasCompareToSourcePath()) {
      protoValue.setCompareToSourcePath(compareToSourcePathElement.toProto())
    }
    if (hasContentType()) {
      protoValue.setContentType(TestScript.Setup.SetupAction.Assert.ContentTypeCode.newBuilder().setValue(contentType.protoCodeCheck()).build())
    }
    if (hasExpression()) {
      protoValue.setExpression(expressionElement.toProto())
    }
    if (hasHeaderField()) {
      protoValue.setHeaderField(headerFieldElement.toProto())
    }
    if (hasMinimumId()) {
      protoValue.setMinimumId(minimumIdElement.toProto())
    }
    if (hasNavigationLinks()) {
      protoValue.setNavigationLinks(navigationLinksElement.toProto())
    }
    if (hasOperator()) {
      protoValue.setOperator(TestScript.Setup.SetupAction.Assert.OperatorCode.newBuilder().setValue(AssertionOperatorTypeCode.Value.valueOf(operator.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPath()) {
      protoValue.setPath(pathElement.toProto())
    }
    if (hasRequestMethod()) {
      protoValue.setRequestMethod(TestScript.Setup.SetupAction.Assert.RequestMethodCode.newBuilder().setValue(TestScriptRequestMethodCode.Value.valueOf(requestMethod.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasRequestURL()) {
      protoValue.setRequestUrl(requestURLElement.toProto())
    }
    if (hasResource()) {
      protoValue.setResource(TestScript.Setup.SetupAction.Assert.ResourceCode.newBuilder().setValue(FHIRDefinedTypeValueSet.Value.valueOf(resource)).build())
    }
    if (hasResponse()) {
      protoValue.setResponse(TestScript.Setup.SetupAction.Assert.ResponseCode.newBuilder().setValue(AssertionResponseTypesCode.Value.valueOf(response.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasResponseCode()) {
      protoValue.setResponseCode(responseCodeElement.toProto())
    }
    if (hasSourceId()) {
      protoValue.setSourceId(sourceIdElement.toProto())
    }
    if (hasValidateProfileId()) {
      protoValue.setValidateProfileId(validateProfileIdElement.toProto())
    }
    if (hasValue()) {
      protoValue.setValue(valueElement.toProto())
    }
    if (hasWarningOnly()) {
      protoValue.setWarningOnly(warningOnlyElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestScript.TestScriptTestComponent.toProto(): TestScript.Test {
    val protoValue = TestScript.Test.newBuilder()
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
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasAction()) {
      protoValue.addAllAction(action.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestScript.TestActionComponent.toProto():
      TestScript.Test.TestAction {
    val protoValue = TestScript.Test.TestAction.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestScript.TestScriptTeardownComponent.toProto():
      TestScript.Teardown {
    val protoValue = TestScript.Teardown.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasAction()) {
      protoValue.addAllAction(action.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestScript.TeardownActionComponent.toProto():
      TestScript.Teardown.TeardownAction {
    val protoValue = TestScript.Teardown.TeardownAction.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun TestScript.Origin.toHapi():
      org.hl7.fhir.r4.model.TestScript.TestScriptOriginComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestScript.TestScriptOriginComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasIndex()) {
      hapiValue.setIndexElement(index.toHapi())
    }
    if (hasProfile()) {
      hapiValue.setProfile(profile.toHapi())
    }
    return hapiValue
  }

  private fun TestScript.Destination.toHapi():
      org.hl7.fhir.r4.model.TestScript.TestScriptDestinationComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestScript.TestScriptDestinationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasIndex()) {
      hapiValue.setIndexElement(index.toHapi())
    }
    if (hasProfile()) {
      hapiValue.setProfile(profile.toHapi())
    }
    return hapiValue
  }

  private fun TestScript.Metadata.toHapi():
      org.hl7.fhir.r4.model.TestScript.TestScriptMetadataComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestScript.TestScriptMetadataComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (linkCount > 0) {
      hapiValue.setLink(linkList.map { it.toHapi() })
    }
    if (capabilityCount > 0) {
      hapiValue.setCapability(capabilityList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun TestScript.Metadata.Link.toHapi():
      org.hl7.fhir.r4.model.TestScript.TestScriptMetadataLinkComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestScript.TestScriptMetadataLinkComponent()
    if (hasId()) {
      hapiValue.id = id.value
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
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    return hapiValue
  }

  private fun TestScript.Metadata.Capability.toHapi():
      org.hl7.fhir.r4.model.TestScript.TestScriptMetadataCapabilityComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestScript.TestScriptMetadataCapabilityComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasRequired()) {
      hapiValue.setRequiredElement(required.toHapi())
    }
    if (hasValidated()) {
      hapiValue.setValidatedElement(validated.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (originCount > 0) {
      hapiValue.setOrigin(originList.map { it.toHapi() })
    }
    if (hasDestination()) {
      hapiValue.setDestinationElement(destination.toHapi())
    }
    if (linkCount > 0) {
      hapiValue.setLink(linkList.map { it.toHapi() })
    }
    if (hasCapabilities()) {
      hapiValue.setCapabilitiesElement(capabilities.toHapi())
    }
    return hapiValue
  }

  private fun TestScript.Fixture.toHapi():
      org.hl7.fhir.r4.model.TestScript.TestScriptFixtureComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestScript.TestScriptFixtureComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasAutocreate()) {
      hapiValue.setAutocreateElement(autocreate.toHapi())
    }
    if (hasAutodelete()) {
      hapiValue.setAutodeleteElement(autodelete.toHapi())
    }
    if (hasResource()) {
      hapiValue.setResource(resource.toHapi())
    }
    return hapiValue
  }

  private fun TestScript.Variable.toHapi():
      org.hl7.fhir.r4.model.TestScript.TestScriptVariableComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestScript.TestScriptVariableComponent()
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
    if (hasDefaultValue()) {
      hapiValue.setDefaultValueElement(defaultValue.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasExpression()) {
      hapiValue.setExpressionElement(expression.toHapi())
    }
    if (hasHeaderField()) {
      hapiValue.setHeaderFieldElement(headerField.toHapi())
    }
    if (hasHint()) {
      hapiValue.setHintElement(hint.toHapi())
    }
    if (hasPath()) {
      hapiValue.setPathElement(path.toHapi())
    }
    if (hasSourceId()) {
      hapiValue.setSourceIdElement(sourceId.toHapi())
    }
    return hapiValue
  }

  private fun TestScript.Setup.toHapi(): org.hl7.fhir.r4.model.TestScript.TestScriptSetupComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestScript.TestScriptSetupComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (actionCount > 0) {
      hapiValue.setAction(actionList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun TestScript.Setup.SetupAction.toHapi():
      org.hl7.fhir.r4.model.TestScript.SetupActionComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestScript.SetupActionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasOperation()) {
      hapiValue.setOperation(operation.toHapi())
    }
    if (hasAssertValue()) {
      hapiValue.setAssert(assertValue.toHapi())
    }
    return hapiValue
  }

  private fun TestScript.Setup.SetupAction.Operation.toHapi():
      org.hl7.fhir.r4.model.TestScript.SetupActionOperationComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestScript.SetupActionOperationComponent()
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
      hapiValue.setType(type.toHapi())
    }
    if (hasResource()) {
      hapiValue.setResource(resource.value.name)
    }
    if (hasLabel()) {
      hapiValue.setLabelElement(label.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasAccept()) {
      hapiValue.setAccept(accept.value.hapiCodeCheck())
    }
    if (hasContentType()) {
      hapiValue.setContentType(contentType.value.hapiCodeCheck())
    }
    if (hasDestination()) {
      hapiValue.setDestinationElement(destination.toHapi())
    }
    if (hasEncodeRequestUrl()) {
      hapiValue.setEncodeRequestUrlElement(encodeRequestUrl.toHapi())
    }
    if (hasMethod()) {
      hapiValue.setMethod(org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCode.valueOf(method.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasOrigin()) {
      hapiValue.setOriginElement(origin.toHapi())
    }
    if (hasParams()) {
      hapiValue.setParamsElement(params.toHapi())
    }
    if (requestHeaderCount > 0) {
      hapiValue.setRequestHeader(requestHeaderList.map { it.toHapi() })
    }
    if (hasRequestId()) {
      hapiValue.setRequestIdElement(requestId.toHapi())
    }
    if (hasResponseId()) {
      hapiValue.setResponseIdElement(responseId.toHapi())
    }
    if (hasSourceId()) {
      hapiValue.setSourceIdElement(sourceId.toHapi())
    }
    if (hasTargetId()) {
      hapiValue.setTargetIdElement(targetId.toHapi())
    }
    if (hasUrl()) {
      hapiValue.setUrlElement(url.toHapi())
    }
    return hapiValue
  }

  private fun TestScript.Setup.SetupAction.Operation.RequestHeader.toHapi():
      org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasField()) {
      hapiValue.setFieldElement(field.toHapi())
    }
    if (hasValue()) {
      hapiValue.setValueElement(value.toHapi())
    }
    return hapiValue
  }

  private fun TestScript.Setup.SetupAction.Assert.toHapi():
      org.hl7.fhir.r4.model.TestScript.SetupActionAssertComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestScript.SetupActionAssertComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasLabel()) {
      hapiValue.setLabelElement(label.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasDirection()) {
      hapiValue.setDirection(org.hl7.fhir.r4.model.TestScript.AssertionDirectionType.valueOf(direction.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCompareToSourceId()) {
      hapiValue.setCompareToSourceIdElement(compareToSourceId.toHapi())
    }
    if (hasCompareToSourceExpression()) {
      hapiValue.setCompareToSourceExpressionElement(compareToSourceExpression.toHapi())
    }
    if (hasCompareToSourcePath()) {
      hapiValue.setCompareToSourcePathElement(compareToSourcePath.toHapi())
    }
    if (hasContentType()) {
      hapiValue.setContentType(contentType.value.hapiCodeCheck())
    }
    if (hasExpression()) {
      hapiValue.setExpressionElement(expression.toHapi())
    }
    if (hasHeaderField()) {
      hapiValue.setHeaderFieldElement(headerField.toHapi())
    }
    if (hasMinimumId()) {
      hapiValue.setMinimumIdElement(minimumId.toHapi())
    }
    if (hasNavigationLinks()) {
      hapiValue.setNavigationLinksElement(navigationLinks.toHapi())
    }
    if (hasOperator()) {
      hapiValue.setOperator(org.hl7.fhir.r4.model.TestScript.AssertionOperatorType.valueOf(operator.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPath()) {
      hapiValue.setPathElement(path.toHapi())
    }
    if (hasRequestMethod()) {
      hapiValue.setRequestMethod(org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCode.valueOf(requestMethod.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasRequestUrl()) {
      hapiValue.setRequestURLElement(requestUrl.toHapi())
    }
    if (hasResource()) {
      hapiValue.setResource(resource.value.name)
    }
    if (hasResponse()) {
      hapiValue.setResponse(org.hl7.fhir.r4.model.TestScript.AssertionResponseTypes.valueOf(response.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasResponseCode()) {
      hapiValue.setResponseCodeElement(responseCode.toHapi())
    }
    if (hasSourceId()) {
      hapiValue.setSourceIdElement(sourceId.toHapi())
    }
    if (hasValidateProfileId()) {
      hapiValue.setValidateProfileIdElement(validateProfileId.toHapi())
    }
    if (hasValue()) {
      hapiValue.setValueElement(value.toHapi())
    }
    if (hasWarningOnly()) {
      hapiValue.setWarningOnlyElement(warningOnly.toHapi())
    }
    return hapiValue
  }

  private fun TestScript.Test.toHapi(): org.hl7.fhir.r4.model.TestScript.TestScriptTestComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestScript.TestScriptTestComponent()
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
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (actionCount > 0) {
      hapiValue.setAction(actionList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun TestScript.Test.TestAction.toHapi():
      org.hl7.fhir.r4.model.TestScript.TestActionComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestScript.TestActionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun TestScript.Teardown.toHapi():
      org.hl7.fhir.r4.model.TestScript.TestScriptTeardownComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestScript.TestScriptTeardownComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (actionCount > 0) {
      hapiValue.setAction(actionList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun TestScript.Teardown.TeardownAction.toHapi():
      org.hl7.fhir.r4.model.TestScript.TeardownActionComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestScript.TeardownActionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    return hapiValue
  }
}
