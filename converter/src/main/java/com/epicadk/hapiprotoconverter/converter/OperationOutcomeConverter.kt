package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.IssueSeverityCode
import com.google.fhir.r4.core.IssueTypeCode
import com.google.fhir.r4.core.OperationOutcome
import com.google.fhir.r4.core.OperationOutcome.Issue
import com.google.fhir.r4.core.String

public object OperationOutcomeConverter {
  public fun OperationOutcome.toHapi(): org.hl7.fhir.r4.model.OperationOutcome {
    val hapiValue = org.hl7.fhir.r4.model.OperationOutcome()
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
    if (issueCount > 0) {
      hapiValue.setIssue(issueList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.OperationOutcome.toProto(): OperationOutcome {
    val protoValue = OperationOutcome.newBuilder()
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
    if (hasIssue()) {
      protoValue.addAllIssue(issue.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent.toProto():
      OperationOutcome.Issue {
    val protoValue = OperationOutcome.Issue.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSeverity()) {
      protoValue.setSeverity(OperationOutcome.Issue.SeverityCode.newBuilder().setValue(IssueSeverityCode.Value.valueOf(severity.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCode()) {
      protoValue.setCode(OperationOutcome.Issue.CodeType.newBuilder().setValue(IssueTypeCode.Value.valueOf(code.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDetails()) {
      protoValue.setDetails(details.toProto())
    }
    if (hasDiagnostics()) {
      protoValue.setDiagnostics(diagnosticsElement.toProto())
    }
    if (hasLocation()) {
      protoValue.addAllLocation(location.map { it.toProto() })
    }
    if (hasExpression()) {
      protoValue.addAllExpression(expression.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun OperationOutcome.Issue.toHapi():
      org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent {
    val hapiValue = org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasSeverity()) {
      hapiValue.setSeverity(org.hl7.fhir.r4.model.OperationOutcome.IssueSeverity.valueOf(severity.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCode()) {
      hapiValue.setCode(org.hl7.fhir.r4.model.OperationOutcome.IssueType.valueOf(code.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDetails()) {
      hapiValue.setDetails(details.toHapi())
    }
    if (hasDiagnostics()) {
      hapiValue.setDiagnosticsElement(diagnostics.toHapi())
    }
    if (locationCount > 0) {
      hapiValue.setLocation(locationList.map { it.toHapi() })
    }
    if (expressionCount > 0) {
      hapiValue.setExpression(expressionList.map { it.toHapi() })
    }
    return hapiValue
  }
}
