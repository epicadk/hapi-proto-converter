package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AgeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AgeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.EventStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Procedure
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Age
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object ProcedureConverter {
  private fun Procedure.PerformedX.procedurePerformedToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    if (hasAge()) {
      return (this.getAge()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Procedure.performed[x]")
  }

  private fun Type.procedurePerformedToProto(): Procedure.PerformedX {
    val protoValue = Procedure.PerformedX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is Age) {
      protoValue.setAge(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    return protoValue.build()
  }

  public fun Procedure.toHapi(): org.hl7.fhir.r4.model.Procedure {
    val hapiValue = org.hl7.fhir.r4.model.Procedure()
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
    if (instantiatesCanonicalCount > 0) {
      hapiValue.setInstantiatesCanonical(instantiatesCanonicalList.map { it.toHapi() })
    }
    if (instantiatesUriCount > 0) {
      hapiValue.setInstantiatesUri(instantiatesUriList.map { it.toHapi() })
    }
    if (basedOnCount > 0) {
      hapiValue.setBasedOn(basedOnList.map { it.toHapi() })
    }
    if (partOfCount > 0) {
      hapiValue.setPartOf(partOfList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.Procedure.ProcedureStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasStatusReason()) {
      hapiValue.setStatusReason(statusReason.toHapi())
    }
    if (hasCategory()) {
      hapiValue.setCategory(category.toHapi())
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
    if (hasPerformed()) {
      hapiValue.setPerformed(performed.procedurePerformedToHapi())
    }
    if (hasRecorder()) {
      hapiValue.setRecorder(recorder.toHapi())
    }
    if (hasAsserter()) {
      hapiValue.setAsserter(asserter.toHapi())
    }
    if (performerCount > 0) {
      hapiValue.setPerformer(performerList.map { it.toHapi() })
    }
    if (hasLocation()) {
      hapiValue.setLocation(location.toHapi())
    }
    if (reasonCodeCount > 0) {
      hapiValue.setReasonCode(reasonCodeList.map { it.toHapi() })
    }
    if (reasonReferenceCount > 0) {
      hapiValue.setReasonReference(reasonReferenceList.map { it.toHapi() })
    }
    if (bodySiteCount > 0) {
      hapiValue.setBodySite(bodySiteList.map { it.toHapi() })
    }
    if (hasOutcome()) {
      hapiValue.setOutcome(outcome.toHapi())
    }
    if (reportCount > 0) {
      hapiValue.setReport(reportList.map { it.toHapi() })
    }
    if (complicationCount > 0) {
      hapiValue.setComplication(complicationList.map { it.toHapi() })
    }
    if (complicationDetailCount > 0) {
      hapiValue.setComplicationDetail(complicationDetailList.map { it.toHapi() })
    }
    if (followUpCount > 0) {
      hapiValue.setFollowUp(followUpList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (focalDeviceCount > 0) {
      hapiValue.setFocalDevice(focalDeviceList.map { it.toHapi() })
    }
    if (usedReferenceCount > 0) {
      hapiValue.setUsedReference(usedReferenceList.map { it.toHapi() })
    }
    if (usedCodeCount > 0) {
      hapiValue.setUsedCode(usedCodeList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Procedure.toProto(): Procedure {
    val protoValue = Procedure.newBuilder()
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
    if (hasInstantiatesCanonical()) {
      protoValue.addAllInstantiatesCanonical(instantiatesCanonical.map { it.toProto() })
    }
    if (hasInstantiatesUri()) {
      protoValue.addAllInstantiatesUri(instantiatesUri.map { it.toProto() })
    }
    if (hasBasedOn()) {
      protoValue.addAllBasedOn(basedOn.map { it.toProto() })
    }
    if (hasPartOf()) {
      protoValue.addAllPartOf(partOf.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(Procedure.StatusCode.newBuilder().setValue(EventStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasStatusReason()) {
      protoValue.setStatusReason(statusReason.toProto())
    }
    if (hasCategory()) {
      protoValue.setCategory(category.toProto())
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
    if (hasPerformed()) {
      protoValue.setPerformed(performed.procedurePerformedToProto())
    }
    if (hasRecorder()) {
      protoValue.setRecorder(recorder.toProto())
    }
    if (hasAsserter()) {
      protoValue.setAsserter(asserter.toProto())
    }
    if (hasPerformer()) {
      protoValue.addAllPerformer(performer.map { it.toProto() })
    }
    if (hasLocation()) {
      protoValue.setLocation(location.toProto())
    }
    if (hasReasonCode()) {
      protoValue.addAllReasonCode(reasonCode.map { it.toProto() })
    }
    if (hasReasonReference()) {
      protoValue.addAllReasonReference(reasonReference.map { it.toProto() })
    }
    if (hasBodySite()) {
      protoValue.addAllBodySite(bodySite.map { it.toProto() })
    }
    if (hasOutcome()) {
      protoValue.setOutcome(outcome.toProto())
    }
    if (hasReport()) {
      protoValue.addAllReport(report.map { it.toProto() })
    }
    if (hasComplication()) {
      protoValue.addAllComplication(complication.map { it.toProto() })
    }
    if (hasComplicationDetail()) {
      protoValue.addAllComplicationDetail(complicationDetail.map { it.toProto() })
    }
    if (hasFollowUp()) {
      protoValue.addAllFollowUp(followUp.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasFocalDevice()) {
      protoValue.addAllFocalDevice(focalDevice.map { it.toProto() })
    }
    if (hasUsedReference()) {
      protoValue.addAllUsedReference(usedReference.map { it.toProto() })
    }
    if (hasUsedCode()) {
      protoValue.addAllUsedCode(usedCode.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Procedure.ProcedurePerformerComponent.toProto():
      Procedure.Performer {
    val protoValue = Procedure.Performer.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasFunction()) {
      protoValue.setFunction(function.toProto())
    }
    if (hasActor()) {
      protoValue.setActor(actor.toProto())
    }
    if (hasOnBehalfOf()) {
      protoValue.setOnBehalfOf(onBehalfOf.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Procedure.ProcedureFocalDeviceComponent.toProto():
      Procedure.FocalDevice {
    val protoValue = Procedure.FocalDevice.newBuilder()
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
    if (hasManipulated()) {
      protoValue.setManipulated(manipulated.toProto())
    }
    return protoValue.build()
  }

  private fun Procedure.Performer.toHapi():
      org.hl7.fhir.r4.model.Procedure.ProcedurePerformerComponent {
    val hapiValue = org.hl7.fhir.r4.model.Procedure.ProcedurePerformerComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasFunction()) {
      hapiValue.setFunction(function.toHapi())
    }
    if (hasActor()) {
      hapiValue.setActor(actor.toHapi())
    }
    if (hasOnBehalfOf()) {
      hapiValue.setOnBehalfOf(onBehalfOf.toHapi())
    }
    return hapiValue
  }

  private fun Procedure.FocalDevice.toHapi():
      org.hl7.fhir.r4.model.Procedure.ProcedureFocalDeviceComponent {
    val hapiValue = org.hl7.fhir.r4.model.Procedure.ProcedureFocalDeviceComponent()
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
    if (hasManipulated()) {
      hapiValue.setManipulated(manipulated.toHapi())
    }
    return hapiValue
  }
}
