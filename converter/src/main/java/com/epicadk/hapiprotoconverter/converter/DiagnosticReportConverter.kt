package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toProto
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
import com.google.fhir.r4.core.DiagnosticReport
import com.google.fhir.r4.core.DiagnosticReportStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Type

public object DiagnosticReportConverter {
  private fun DiagnosticReport.EffectiveX.diagnosticReportEffectiveToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for DiagnosticReport.effective[x]")
  }

  private fun Type.diagnosticReportEffectiveToProto(): DiagnosticReport.EffectiveX {
    val protoValue = DiagnosticReport.EffectiveX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  public fun DiagnosticReport.toHapi(): org.hl7.fhir.r4.model.DiagnosticReport {
    val hapiValue = org.hl7.fhir.r4.model.DiagnosticReport()
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
    if (basedOnCount > 0) {
      hapiValue.setBasedOn(basedOnList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.DiagnosticReport.DiagnosticReportStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (categoryCount > 0) {
      hapiValue.setCategory(categoryList.map { it.toHapi() })
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasEffective()) {
      hapiValue.setEffective(effective.diagnosticReportEffectiveToHapi())
    }
    if (hasIssued()) {
      hapiValue.setIssuedElement(issued.toHapi())
    }
    if (performerCount > 0) {
      hapiValue.setPerformer(performerList.map { it.toHapi() })
    }
    if (resultsInterpreterCount > 0) {
      hapiValue.setResultsInterpreter(resultsInterpreterList.map { it.toHapi() })
    }
    if (specimenCount > 0) {
      hapiValue.setSpecimen(specimenList.map { it.toHapi() })
    }
    if (resultCount > 0) {
      hapiValue.setResult(resultList.map { it.toHapi() })
    }
    if (imagingStudyCount > 0) {
      hapiValue.setImagingStudy(imagingStudyList.map { it.toHapi() })
    }
    if (mediaCount > 0) {
      hapiValue.setMedia(mediaList.map { it.toHapi() })
    }
    if (hasConclusion()) {
      hapiValue.setConclusionElement(conclusion.toHapi())
    }
    if (conclusionCodeCount > 0) {
      hapiValue.setConclusionCode(conclusionCodeList.map { it.toHapi() })
    }
    if (presentedFormCount > 0) {
      hapiValue.setPresentedForm(presentedFormList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.DiagnosticReport.toProto(): DiagnosticReport {
    val protoValue = DiagnosticReport.newBuilder()
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
    if (hasBasedOn()) {
      protoValue.addAllBasedOn(basedOn.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(DiagnosticReport.StatusCode.newBuilder().setValue(DiagnosticReportStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCategory()) {
      protoValue.addAllCategory(category.map { it.toProto() })
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasEffective()) {
      protoValue.setEffective(effective.diagnosticReportEffectiveToProto())
    }
    if (hasIssued()) {
      protoValue.setIssued(issuedElement.toProto())
    }
    if (hasPerformer()) {
      protoValue.addAllPerformer(performer.map { it.toProto() })
    }
    if (hasResultsInterpreter()) {
      protoValue.addAllResultsInterpreter(resultsInterpreter.map { it.toProto() })
    }
    if (hasSpecimen()) {
      protoValue.addAllSpecimen(specimen.map { it.toProto() })
    }
    if (hasResult()) {
      protoValue.addAllResult(result.map { it.toProto() })
    }
    if (hasImagingStudy()) {
      protoValue.addAllImagingStudy(imagingStudy.map { it.toProto() })
    }
    if (hasMedia()) {
      protoValue.addAllMedia(media.map { it.toProto() })
    }
    if (hasConclusion()) {
      protoValue.setConclusion(conclusionElement.toProto())
    }
    if (hasConclusionCode()) {
      protoValue.addAllConclusionCode(conclusionCode.map { it.toProto() })
    }
    if (hasPresentedForm()) {
      protoValue.addAllPresentedForm(presentedForm.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.DiagnosticReport.DiagnosticReportMediaComponent.toProto():
      DiagnosticReport.Media {
    val protoValue = DiagnosticReport.Media.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasComment()) {
      protoValue.setComment(commentElement.toProto())
    }
    if (hasLink()) {
      protoValue.setLink(link.toProto())
    }
    return protoValue.build()
  }

  private fun DiagnosticReport.Media.toHapi():
      org.hl7.fhir.r4.model.DiagnosticReport.DiagnosticReportMediaComponent {
    val hapiValue = org.hl7.fhir.r4.model.DiagnosticReport.DiagnosticReportMediaComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasComment()) {
      hapiValue.setCommentElement(comment.toHapi())
    }
    if (hasLink()) {
      hapiValue.setLink(link.toHapi())
    }
    return hapiValue
  }
}
