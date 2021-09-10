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
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.AdverseEvent
import com.google.fhir.r4.core.AdverseEvent.SuspectEntity
import com.google.fhir.r4.core.AdverseEventActualityCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String

public object AdverseEventConverter {
  public fun AdverseEvent.toHapi(): org.hl7.fhir.r4.model.AdverseEvent {
    val hapiValue = org.hl7.fhir.r4.model.AdverseEvent()
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
    if (hasActuality()) {
      hapiValue.setActuality(org.hl7.fhir.r4.model.AdverseEvent.AdverseEventActuality.valueOf(actuality.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (categoryCount > 0) {
      hapiValue.setCategory(categoryList.map { it.toHapi() })
    }
    if (hasEvent()) {
      hapiValue.setEvent(event.toHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasDetected()) {
      hapiValue.setDetectedElement(detected.toHapi())
    }
    if (hasRecordedDate()) {
      hapiValue.setRecordedDateElement(recordedDate.toHapi())
    }
    if (resultingConditionCount > 0) {
      hapiValue.setResultingCondition(resultingConditionList.map { it.toHapi() })
    }
    if (hasLocation()) {
      hapiValue.setLocation(location.toHapi())
    }
    if (hasSeriousness()) {
      hapiValue.setSeriousness(seriousness.toHapi())
    }
    if (hasSeverity()) {
      hapiValue.setSeverity(severity.toHapi())
    }
    if (hasOutcome()) {
      hapiValue.setOutcome(outcome.toHapi())
    }
    if (hasRecorder()) {
      hapiValue.setRecorder(recorder.toHapi())
    }
    if (contributorCount > 0) {
      hapiValue.setContributor(contributorList.map { it.toHapi() })
    }
    if (suspectEntityCount > 0) {
      hapiValue.setSuspectEntity(suspectEntityList.map { it.toHapi() })
    }
    if (subjectMedicalHistoryCount > 0) {
      hapiValue.setSubjectMedicalHistory(subjectMedicalHistoryList.map { it.toHapi() })
    }
    if (referenceDocumentCount > 0) {
      hapiValue.setReferenceDocument(referenceDocumentList.map { it.toHapi() })
    }
    if (studyCount > 0) {
      hapiValue.setStudy(studyList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.AdverseEvent.toProto(): AdverseEvent {
    val protoValue = AdverseEvent.newBuilder()
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
    if (hasActuality()) {
      protoValue.setActuality(AdverseEvent.ActualityCode.newBuilder().setValue(AdverseEventActualityCode.Value.valueOf(actuality.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCategory()) {
      protoValue.addAllCategory(category.map { it.toProto() })
    }
    if (hasEvent()) {
      protoValue.setEvent(event.toProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasDetected()) {
      protoValue.setDetected(detectedElement.toProto())
    }
    if (hasRecordedDate()) {
      protoValue.setRecordedDate(recordedDateElement.toProto())
    }
    if (hasResultingCondition()) {
      protoValue.addAllResultingCondition(resultingCondition.map { it.toProto() })
    }
    if (hasLocation()) {
      protoValue.setLocation(location.toProto())
    }
    if (hasSeriousness()) {
      protoValue.setSeriousness(seriousness.toProto())
    }
    if (hasSeverity()) {
      protoValue.setSeverity(severity.toProto())
    }
    if (hasOutcome()) {
      protoValue.setOutcome(outcome.toProto())
    }
    if (hasRecorder()) {
      protoValue.setRecorder(recorder.toProto())
    }
    if (hasContributor()) {
      protoValue.addAllContributor(contributor.map { it.toProto() })
    }
    if (hasSuspectEntity()) {
      protoValue.addAllSuspectEntity(suspectEntity.map { it.toProto() })
    }
    if (hasSubjectMedicalHistory()) {
      protoValue.addAllSubjectMedicalHistory(subjectMedicalHistory.map { it.toProto() })
    }
    if (hasReferenceDocument()) {
      protoValue.addAllReferenceDocument(referenceDocument.map { it.toProto() })
    }
    if (hasStudy()) {
      protoValue.addAllStudy(study.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.AdverseEvent.AdverseEventSuspectEntityComponent.toProto():
      AdverseEvent.SuspectEntity {
    val protoValue = AdverseEvent.SuspectEntity.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasInstance()) {
      protoValue.setInstance(instance.toProto())
    }
    if (hasCausality()) {
      protoValue.addAllCausality(causality.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.AdverseEvent.AdverseEventSuspectEntityCausalityComponent.toProto():
      AdverseEvent.SuspectEntity.Causality {
    val protoValue = AdverseEvent.SuspectEntity.Causality.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasAssessment()) {
      protoValue.setAssessment(assessment.toProto())
    }
    if (hasProductRelatedness()) {
      protoValue.setProductRelatedness(productRelatednessElement.toProto())
    }
    if (hasAuthor()) {
      protoValue.setAuthor(author.toProto())
    }
    if (hasMethod()) {
      protoValue.setMethod(method.toProto())
    }
    return protoValue.build()
  }

  private fun AdverseEvent.SuspectEntity.toHapi():
      org.hl7.fhir.r4.model.AdverseEvent.AdverseEventSuspectEntityComponent {
    val hapiValue = org.hl7.fhir.r4.model.AdverseEvent.AdverseEventSuspectEntityComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasInstance()) {
      hapiValue.setInstance(instance.toHapi())
    }
    if (causalityCount > 0) {
      hapiValue.setCausality(causalityList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun AdverseEvent.SuspectEntity.Causality.toHapi():
      org.hl7.fhir.r4.model.AdverseEvent.AdverseEventSuspectEntityCausalityComponent {
    val hapiValue = org.hl7.fhir.r4.model.AdverseEvent.AdverseEventSuspectEntityCausalityComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasAssessment()) {
      hapiValue.setAssessment(assessment.toHapi())
    }
    if (hasProductRelatedness()) {
      hapiValue.setProductRelatednessElement(productRelatedness.toHapi())
    }
    if (hasAuthor()) {
      hapiValue.setAuthor(author.toHapi())
    }
    if (hasMethod()) {
      hapiValue.setMethod(method.toHapi())
    }
    return hapiValue
  }
}
