package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DataRequirementConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DataRequirementConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.GuidanceResponse
import com.google.fhir.r4.core.GuidanceResponseStatusCode
import com.google.fhir.r4.core.Id
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CanonicalType
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.Type
import org.hl7.fhir.r4.model.UriType

public object GuidanceResponseConverter {
  private fun GuidanceResponse.ModuleX.guidanceResponseModuleToHapi(): Type {
    if (hasUri()) {
      return (this.getUri()).toHapi()
    }
    if (hasCanonical()) {
      return (this.getCanonical()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for GuidanceResponse.module[x]")
  }

  private fun Type.guidanceResponseModuleToProto(): GuidanceResponse.ModuleX {
    val protoValue = GuidanceResponse.ModuleX.newBuilder()
    if (this is UriType) {
      protoValue.setUri(this.toProto())
    }
    if (this is CanonicalType) {
      protoValue.setCanonical(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    return protoValue.build()
  }

  public fun GuidanceResponse.toHapi(): org.hl7.fhir.r4.model.GuidanceResponse {
    val hapiValue = org.hl7.fhir.r4.model.GuidanceResponse()
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
    if (hasRequestIdentifier()) {
      hapiValue.setRequestIdentifier(requestIdentifier.toHapi())
    }
    if (identifierCount > 0) {
      hapiValue.setIdentifier(identifierList.map { it.toHapi() })
    }
    if (hasModule()) {
      hapiValue.setModule(module.guidanceResponseModuleToHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.GuidanceResponse.GuidanceResponseStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasOccurrenceDateTime()) {
      hapiValue.setOccurrenceDateTimeElement(occurrenceDateTime.toHapi())
    }
    if (hasPerformer()) {
      hapiValue.setPerformer(performer.toHapi())
    }
    if (reasonCodeCount > 0) {
      hapiValue.setReasonCode(reasonCodeList.map { it.toHapi() })
    }
    if (reasonReferenceCount > 0) {
      hapiValue.setReasonReference(reasonReferenceList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (evaluationMessageCount > 0) {
      hapiValue.setEvaluationMessage(evaluationMessageList.map { it.toHapi() })
    }
    if (hasOutputParameters()) {
      hapiValue.setOutputParameters(outputParameters.toHapi())
    }
    if (hasResult()) {
      hapiValue.setResult(result.toHapi())
    }
    if (dataRequirementCount > 0) {
      hapiValue.setDataRequirement(dataRequirementList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.GuidanceResponse.toProto(): GuidanceResponse {
    val protoValue = GuidanceResponse.newBuilder()
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
    if (hasRequestIdentifier()) {
      protoValue.setRequestIdentifier(requestIdentifier.toProto())
    }
    if (hasIdentifier()) {
      protoValue.addAllIdentifier(identifier.map { it.toProto() })
    }
    if (hasModule()) {
      protoValue.setModule(module.guidanceResponseModuleToProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(GuidanceResponse.StatusCode.newBuilder().setValue(GuidanceResponseStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasOccurrenceDateTime()) {
      protoValue.setOccurrenceDateTime(occurrenceDateTimeElement.toProto())
    }
    if (hasPerformer()) {
      protoValue.setPerformer(performer.toProto())
    }
    if (hasReasonCode()) {
      protoValue.addAllReasonCode(reasonCode.map { it.toProto() })
    }
    if (hasReasonReference()) {
      protoValue.addAllReasonReference(reasonReference.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasEvaluationMessage()) {
      protoValue.addAllEvaluationMessage(evaluationMessage.map { it.toProto() })
    }
    if (hasOutputParameters()) {
      protoValue.setOutputParameters(outputParameters.toProto())
    }
    if (hasResult()) {
      protoValue.setResult(result.toProto())
    }
    if (hasDataRequirement()) {
      protoValue.addAllDataRequirement(dataRequirement.map { it.toProto() })
    }
    return protoValue.build()
  }
}
