package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.DetectedIssue
import com.google.fhir.r4.core.DetectedIssueSeverityCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.ObservationStatusCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Type

public object DetectedIssueConverter {
  private fun DetectedIssue.IdentifiedX.detectedIssueIdentifiedToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for DetectedIssue.identified[x]")
  }

  private fun Type.detectedIssueIdentifiedToProto(): DetectedIssue.IdentifiedX {
    val protoValue = DetectedIssue.IdentifiedX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  public fun DetectedIssue.toHapi(): org.hl7.fhir.r4.model.DetectedIssue {
    val hapiValue = org.hl7.fhir.r4.model.DetectedIssue()
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
    if (identifierCount > 0) {
      hapiValue.setIdentifier(identifierList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasSeverity()) {
      hapiValue.setSeverity(org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueSeverity.valueOf(severity.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPatient()) {
      hapiValue.setPatient(patient.toHapi())
    }
    if (hasIdentified()) {
      hapiValue.setIdentified(identified.detectedIssueIdentifiedToHapi())
    }
    if (hasAuthor()) {
      hapiValue.setAuthor(author.toHapi())
    }
    if (implicatedCount > 0) {
      hapiValue.setImplicated(implicatedList.map { it.toHapi() })
    }
    if (evidenceCount > 0) {
      hapiValue.setEvidence(evidenceList.map { it.toHapi() })
    }
    if (hasDetail()) {
      hapiValue.setDetailElement(detail.toHapi())
    }
    if (hasReference()) {
      hapiValue.setReferenceElement(reference.toHapi())
    }
    if (mitigationCount > 0) {
      hapiValue.setMitigation(mitigationList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.DetectedIssue.toProto(): DetectedIssue {
    val protoValue = DetectedIssue.newBuilder()
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
      protoValue.addAllIdentifier(identifier.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(DetectedIssue.StatusCode.newBuilder().setValue(ObservationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasSeverity()) {
      protoValue.setSeverity(DetectedIssue.SeverityCode.newBuilder().setValue(DetectedIssueSeverityCode.Value.valueOf(severity.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPatient()) {
      protoValue.setPatient(patient.toProto())
    }
    if (hasIdentified()) {
      protoValue.setIdentified(identified.detectedIssueIdentifiedToProto())
    }
    if (hasAuthor()) {
      protoValue.setAuthor(author.toProto())
    }
    if (hasImplicated()) {
      protoValue.addAllImplicated(implicated.map { it.toProto() })
    }
    if (hasEvidence()) {
      protoValue.addAllEvidence(evidence.map { it.toProto() })
    }
    if (hasDetail()) {
      protoValue.setDetail(detailElement.toProto())
    }
    if (hasReference()) {
      protoValue.setReference(referenceElement.toProto())
    }
    if (hasMitigation()) {
      protoValue.addAllMitigation(mitigation.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueEvidenceComponent.toProto():
      DetectedIssue.Evidence {
    val protoValue = DetectedIssue.Evidence.newBuilder()
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
      protoValue.addAllCode(code.map { it.toProto() })
    }
    if (hasDetail()) {
      protoValue.addAllDetail(detail.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueMitigationComponent.toProto():
      DetectedIssue.Mitigation {
    val protoValue = DetectedIssue.Mitigation.newBuilder()
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
      protoValue.setAction(action.toProto())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasAuthor()) {
      protoValue.setAuthor(author.toProto())
    }
    return protoValue.build()
  }

  private fun DetectedIssue.Evidence.toHapi():
      org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueEvidenceComponent {
    val hapiValue = org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueEvidenceComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (codeCount > 0) {
      hapiValue.setCode(codeList.map { it.toHapi() })
    }
    if (detailCount > 0) {
      hapiValue.setDetail(detailList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun DetectedIssue.Mitigation.toHapi():
      org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueMitigationComponent {
    val hapiValue = org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueMitigationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasAction()) {
      hapiValue.setAction(action.toHapi())
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasAuthor()) {
      hapiValue.setAuthor(author.toHapi())
    }
    return hapiValue
  }
}
