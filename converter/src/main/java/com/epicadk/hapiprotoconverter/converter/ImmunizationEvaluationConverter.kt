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
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.ImmunizationEvaluation
import com.google.fhir.r4.core.ImmunizationEvaluationStatusCodesValueSet
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.PositiveIntType
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object ImmunizationEvaluationConverter {
  private fun ImmunizationEvaluation.DoseNumberX.immunizationEvaluationDoseNumberToHapi(): Type {
    if (hasPositiveInt()) {
      return (this.getPositiveInt()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ImmunizationEvaluation.doseNumber[x]")
  }

  private fun Type.immunizationEvaluationDoseNumberToProto(): ImmunizationEvaluation.DoseNumberX {
    val protoValue = ImmunizationEvaluation.DoseNumberX.newBuilder()
    if (this is PositiveIntType) {
      protoValue.setPositiveInt(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  private fun ImmunizationEvaluation.SeriesDosesX.immunizationEvaluationSeriesDosesToHapi(): Type {
    if (hasPositiveInt()) {
      return (this.getPositiveInt()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ImmunizationEvaluation.seriesDoses[x]")
  }

  private fun Type.immunizationEvaluationSeriesDosesToProto(): ImmunizationEvaluation.SeriesDosesX {
    val protoValue = ImmunizationEvaluation.SeriesDosesX.newBuilder()
    if (this is PositiveIntType) {
      protoValue.setPositiveInt(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  public fun ImmunizationEvaluation.toHapi(): org.hl7.fhir.r4.model.ImmunizationEvaluation {
    val hapiValue = org.hl7.fhir.r4.model.ImmunizationEvaluation()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.ImmunizationEvaluation.ImmunizationEvaluationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPatient()) {
      hapiValue.setPatient(patient.toHapi())
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasAuthority()) {
      hapiValue.setAuthority(authority.toHapi())
    }
    if (hasTargetDisease()) {
      hapiValue.setTargetDisease(targetDisease.toHapi())
    }
    if (hasImmunizationEvent()) {
      hapiValue.setImmunizationEvent(immunizationEvent.toHapi())
    }
    if (hasDoseStatus()) {
      hapiValue.setDoseStatus(doseStatus.toHapi())
    }
    if (doseStatusReasonCount > 0) {
      hapiValue.setDoseStatusReason(doseStatusReasonList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasSeries()) {
      hapiValue.setSeriesElement(series.toHapi())
    }
    if (hasDoseNumber()) {
      hapiValue.setDoseNumber(doseNumber.immunizationEvaluationDoseNumberToHapi())
    }
    if (hasSeriesDoses()) {
      hapiValue.setSeriesDoses(seriesDoses.immunizationEvaluationSeriesDosesToHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ImmunizationEvaluation.toProto(): ImmunizationEvaluation {
    val protoValue = ImmunizationEvaluation.newBuilder()
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
      protoValue.setStatus(ImmunizationEvaluation.StatusCode.newBuilder().setValue(ImmunizationEvaluationStatusCodesValueSet.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPatient()) {
      protoValue.setPatient(patient.toProto())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasAuthority()) {
      protoValue.setAuthority(authority.toProto())
    }
    if (hasTargetDisease()) {
      protoValue.setTargetDisease(targetDisease.toProto())
    }
    if (hasImmunizationEvent()) {
      protoValue.setImmunizationEvent(immunizationEvent.toProto())
    }
    if (hasDoseStatus()) {
      protoValue.setDoseStatus(doseStatus.toProto())
    }
    if (hasDoseStatusReason()) {
      protoValue.addAllDoseStatusReason(doseStatusReason.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasSeries()) {
      protoValue.setSeries(seriesElement.toProto())
    }
    if (hasDoseNumber()) {
      protoValue.setDoseNumber(doseNumber.immunizationEvaluationDoseNumberToProto())
    }
    if (hasSeriesDoses()) {
      protoValue.setSeriesDoses(seriesDoses.immunizationEvaluationSeriesDosesToProto())
    }
    return protoValue.build()
  }
}
