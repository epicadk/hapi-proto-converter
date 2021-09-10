package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.TestReport
import com.google.fhir.r4.core.TestReport.Participant
import com.google.fhir.r4.core.TestReport.Setup
import com.google.fhir.r4.core.TestReport.Setup.SetupAction
import com.google.fhir.r4.core.TestReport.Setup.SetupAction.Assert
import com.google.fhir.r4.core.TestReport.Setup.SetupAction.Operation
import com.google.fhir.r4.core.TestReport.Teardown
import com.google.fhir.r4.core.TestReport.Test
import com.google.fhir.r4.core.TestReportActionResultCode
import com.google.fhir.r4.core.TestReportParticipantTypeCode
import com.google.fhir.r4.core.TestReportResultCode
import com.google.fhir.r4.core.TestReportStatusCode

public object TestReportConverter {
  public fun TestReport.toHapi(): org.hl7.fhir.r4.model.TestReport {
    val hapiValue = org.hl7.fhir.r4.model.TestReport()
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
    if (hasIdentifier()) {
      hapiValue.setIdentifier(identifier.toHapi())
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.TestReport.TestReportStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasTestScript()) {
      hapiValue.setTestScript(testScript.toHapi())
    }
    if (hasResult()) {
      hapiValue.setResult(org.hl7.fhir.r4.model.TestReport.TestReportResult.valueOf(result.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasScore()) {
      hapiValue.setScoreElement(score.toHapi())
    }
    if (hasTester()) {
      hapiValue.setTesterElement(tester.toHapi())
    }
    if (hasIssued()) {
      hapiValue.setIssuedElement(issued.toHapi())
    }
    if (participantCount > 0) {
      hapiValue.setParticipant(participantList.map { it.toHapi() })
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

  public fun org.hl7.fhir.r4.model.TestReport.toProto(): TestReport {
    val protoValue = TestReport.newBuilder()
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
    if (hasIdentifier()) {
      protoValue.setIdentifier(identifier.toProto())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(TestReport.StatusCode.newBuilder().setValue(TestReportStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasTestScript()) {
      protoValue.setTestScript(testScript.toProto())
    }
    if (hasResult()) {
      protoValue.setResult(TestReport.ResultCode.newBuilder().setValue(TestReportResultCode.Value.valueOf(result.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasScore()) {
      protoValue.setScore(scoreElement.toProto())
    }
    if (hasTester()) {
      protoValue.setTester(testerElement.toProto())
    }
    if (hasIssued()) {
      protoValue.setIssued(issuedElement.toProto())
    }
    if (hasParticipant()) {
      protoValue.addAllParticipant(participant.map { it.toProto() })
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

  private fun org.hl7.fhir.r4.model.TestReport.TestReportParticipantComponent.toProto():
      TestReport.Participant {
    val protoValue = TestReport.Participant.newBuilder()
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
      protoValue.setType(TestReport.Participant.TypeCode.newBuilder().setValue(TestReportParticipantTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasUri()) {
      protoValue.setUri(uriElement.toProto())
    }
    if (hasDisplay()) {
      protoValue.setDisplay(displayElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestReport.TestReportSetupComponent.toProto():
      TestReport.Setup {
    val protoValue = TestReport.Setup.newBuilder()
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

  private fun org.hl7.fhir.r4.model.TestReport.SetupActionComponent.toProto():
      TestReport.Setup.SetupAction {
    val protoValue = TestReport.Setup.SetupAction.newBuilder()
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

  private fun org.hl7.fhir.r4.model.TestReport.SetupActionOperationComponent.toProto():
      TestReport.Setup.SetupAction.Operation {
    val protoValue = TestReport.Setup.SetupAction.Operation.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasResult()) {
      protoValue.setResult(TestReport.Setup.SetupAction.Operation.ResultCode.newBuilder().setValue(TestReportActionResultCode.Value.valueOf(result.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasMessage()) {
      protoValue.setMessage(messageElement.toProto())
    }
    if (hasDetail()) {
      protoValue.setDetail(detailElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestReport.SetupActionAssertComponent.toProto():
      TestReport.Setup.SetupAction.Assert {
    val protoValue = TestReport.Setup.SetupAction.Assert.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasResult()) {
      protoValue.setResult(TestReport.Setup.SetupAction.Assert.ResultCode.newBuilder().setValue(TestReportActionResultCode.Value.valueOf(result.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasMessage()) {
      protoValue.setMessage(messageElement.toProto())
    }
    if (hasDetail()) {
      protoValue.setDetail(detailElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.TestReport.TestReportTestComponent.toProto(): TestReport.Test {
    val protoValue = TestReport.Test.newBuilder()
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

  private fun org.hl7.fhir.r4.model.TestReport.TestActionComponent.toProto():
      TestReport.Test.TestAction {
    val protoValue = TestReport.Test.TestAction.newBuilder()
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

  private fun org.hl7.fhir.r4.model.TestReport.TestReportTeardownComponent.toProto():
      TestReport.Teardown {
    val protoValue = TestReport.Teardown.newBuilder()
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

  private fun org.hl7.fhir.r4.model.TestReport.TeardownActionComponent.toProto():
      TestReport.Teardown.TeardownAction {
    val protoValue = TestReport.Teardown.TeardownAction.newBuilder()
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

  private fun TestReport.Participant.toHapi():
      org.hl7.fhir.r4.model.TestReport.TestReportParticipantComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestReport.TestReportParticipantComponent()
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
      hapiValue.setType(org.hl7.fhir.r4.model.TestReport.TestReportParticipantType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasUri()) {
      hapiValue.setUriElement(uri.toHapi())
    }
    if (hasDisplay()) {
      hapiValue.setDisplayElement(display.toHapi())
    }
    return hapiValue
  }

  private fun TestReport.Setup.toHapi(): org.hl7.fhir.r4.model.TestReport.TestReportSetupComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestReport.TestReportSetupComponent()
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

  private fun TestReport.Setup.SetupAction.toHapi():
      org.hl7.fhir.r4.model.TestReport.SetupActionComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestReport.SetupActionComponent()
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

  private fun TestReport.Setup.SetupAction.Operation.toHapi():
      org.hl7.fhir.r4.model.TestReport.SetupActionOperationComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestReport.SetupActionOperationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasResult()) {
      hapiValue.setResult(org.hl7.fhir.r4.model.TestReport.TestReportActionResult.valueOf(result.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasMessage()) {
      hapiValue.setMessageElement(message.toHapi())
    }
    if (hasDetail()) {
      hapiValue.setDetailElement(detail.toHapi())
    }
    return hapiValue
  }

  private fun TestReport.Setup.SetupAction.Assert.toHapi():
      org.hl7.fhir.r4.model.TestReport.SetupActionAssertComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestReport.SetupActionAssertComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasResult()) {
      hapiValue.setResult(org.hl7.fhir.r4.model.TestReport.TestReportActionResult.valueOf(result.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasMessage()) {
      hapiValue.setMessageElement(message.toHapi())
    }
    if (hasDetail()) {
      hapiValue.setDetailElement(detail.toHapi())
    }
    return hapiValue
  }

  private fun TestReport.Test.toHapi(): org.hl7.fhir.r4.model.TestReport.TestReportTestComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestReport.TestReportTestComponent()
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

  private fun TestReport.Test.TestAction.toHapi():
      org.hl7.fhir.r4.model.TestReport.TestActionComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestReport.TestActionComponent()
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

  private fun TestReport.Teardown.toHapi():
      org.hl7.fhir.r4.model.TestReport.TestReportTeardownComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestReport.TestReportTeardownComponent()
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

  private fun TestReport.Teardown.TeardownAction.toHapi():
      org.hl7.fhir.r4.model.TestReport.TeardownActionComponent {
    val hapiValue = org.hl7.fhir.r4.model.TestReport.TeardownActionComponent()
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
