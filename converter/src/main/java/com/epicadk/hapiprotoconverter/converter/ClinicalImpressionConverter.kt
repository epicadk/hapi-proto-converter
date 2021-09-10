package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
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
import com.google.fhir.r4.core.ClinicalImpression
import com.google.fhir.r4.core.ClinicalImpressionStatusValueSet
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Type

public object ClinicalImpressionConverter {
  private fun ClinicalImpression.EffectiveX.clinicalImpressionEffectiveToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ClinicalImpression.effective[x]")
  }

  private fun Type.clinicalImpressionEffectiveToProto(): ClinicalImpression.EffectiveX {
    val protoValue = ClinicalImpression.EffectiveX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  public fun ClinicalImpression.toHapi(): org.hl7.fhir.r4.model.ClinicalImpression {
    val hapiValue = org.hl7.fhir.r4.model.ClinicalImpression()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasStatusReason()) {
      hapiValue.setStatusReason(statusReason.toHapi())
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasEffective()) {
      hapiValue.setEffective(effective.clinicalImpressionEffectiveToHapi())
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasAssessor()) {
      hapiValue.setAssessor(assessor.toHapi())
    }
    if (hasPrevious()) {
      hapiValue.setPrevious(previous.toHapi())
    }
    if (problemCount > 0) {
      hapiValue.setProblem(problemList.map { it.toHapi() })
    }
    if (investigationCount > 0) {
      hapiValue.setInvestigation(investigationList.map { it.toHapi() })
    }
    if (protocolCount > 0) {
      hapiValue.setProtocol(protocolList.map { it.toHapi() })
    }
    if (hasSummary()) {
      hapiValue.setSummaryElement(summary.toHapi())
    }
    if (findingCount > 0) {
      hapiValue.setFinding(findingList.map { it.toHapi() })
    }
    if (prognosisCodeableConceptCount > 0) {
      hapiValue.setPrognosisCodeableConcept(prognosisCodeableConceptList.map { it.toHapi() })
    }
    if (prognosisReferenceCount > 0) {
      hapiValue.setPrognosisReference(prognosisReferenceList.map { it.toHapi() })
    }
    if (supportingInfoCount > 0) {
      hapiValue.setSupportingInfo(supportingInfoList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ClinicalImpression.toProto(): ClinicalImpression {
    val protoValue = ClinicalImpression.newBuilder()
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
      protoValue.setStatus(ClinicalImpression.StatusCode.newBuilder().setValue(ClinicalImpressionStatusValueSet.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasStatusReason()) {
      protoValue.setStatusReason(statusReason.toProto())
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasEffective()) {
      protoValue.setEffective(effective.clinicalImpressionEffectiveToProto())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasAssessor()) {
      protoValue.setAssessor(assessor.toProto())
    }
    if (hasPrevious()) {
      protoValue.setPrevious(previous.toProto())
    }
    if (hasProblem()) {
      protoValue.addAllProblem(problem.map { it.toProto() })
    }
    if (hasInvestigation()) {
      protoValue.addAllInvestigation(investigation.map { it.toProto() })
    }
    if (hasProtocol()) {
      protoValue.addAllProtocol(protocol.map { it.toProto() })
    }
    if (hasSummary()) {
      protoValue.setSummary(summaryElement.toProto())
    }
    if (hasFinding()) {
      protoValue.addAllFinding(finding.map { it.toProto() })
    }
    if (hasPrognosisCodeableConcept()) {
      protoValue.addAllPrognosisCodeableConcept(prognosisCodeableConcept.map { it.toProto() })
    }
    if (hasPrognosisReference()) {
      protoValue.addAllPrognosisReference(prognosisReference.map { it.toProto() })
    }
    if (hasSupportingInfo()) {
      protoValue.addAllSupportingInfo(supportingInfo.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionInvestigationComponent.toProto():
      ClinicalImpression.Investigation {
    val protoValue = ClinicalImpression.Investigation.newBuilder()
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
      protoValue.setCode(code.toProto())
    }
    if (hasItem()) {
      protoValue.addAllItem(item.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionFindingComponent.toProto():
      ClinicalImpression.Finding {
    val protoValue = ClinicalImpression.Finding.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasItemCodeableConcept()) {
      protoValue.setItemCodeableConcept(itemCodeableConcept.toProto())
    }
    if (hasItemReference()) {
      protoValue.setItemReference(itemReference.toProto())
    }
    if (hasBasis()) {
      protoValue.setBasis(basisElement.toProto())
    }
    return protoValue.build()
  }

  private fun ClinicalImpression.Investigation.toHapi():
      org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionInvestigationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionInvestigationComponent()
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
      hapiValue.setCode(code.toHapi())
    }
    if (itemCount > 0) {
      hapiValue.setItem(itemList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ClinicalImpression.Finding.toHapi():
      org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionFindingComponent {
    val hapiValue = org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionFindingComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasItemCodeableConcept()) {
      hapiValue.setItemCodeableConcept(itemCodeableConcept.toHapi())
    }
    if (hasItemReference()) {
      hapiValue.setItemReference(itemReference.toHapi())
    }
    if (hasBasis()) {
      hapiValue.setBasisElement(basis.toHapi())
    }
    return hapiValue
  }
}
