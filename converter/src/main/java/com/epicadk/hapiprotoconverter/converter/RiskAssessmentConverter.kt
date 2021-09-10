package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toProto
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
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.ObservationStatusCode
import com.google.fhir.r4.core.RiskAssessment
import com.google.fhir.r4.core.RiskAssessment.Prediction
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.DecimalType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.Type

public object RiskAssessmentConverter {
  private fun RiskAssessment.OccurrenceX.riskAssessmentOccurrenceToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for RiskAssessment.occurrence[x]")
  }

  private fun Type.riskAssessmentOccurrenceToProto(): RiskAssessment.OccurrenceX {
    val protoValue = RiskAssessment.OccurrenceX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  private fun RiskAssessment.Prediction.ProbabilityX.riskAssessmentPredictionProbabilityToHapi():
      Type {
    if (hasDecimal()) {
      return (this.getDecimal()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for RiskAssessment.prediction.probability[x]")
  }

  private fun Type.riskAssessmentPredictionProbabilityToProto():
      RiskAssessment.Prediction.ProbabilityX {
    val protoValue = RiskAssessment.Prediction.ProbabilityX.newBuilder()
    if (this is DecimalType) {
      protoValue.setDecimal(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    return protoValue.build()
  }

  private fun RiskAssessment.Prediction.WhenX.riskAssessmentPredictionWhenToHapi(): Type {
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for RiskAssessment.prediction.when[x]")
  }

  private fun Type.riskAssessmentPredictionWhenToProto(): RiskAssessment.Prediction.WhenX {
    val protoValue = RiskAssessment.Prediction.WhenX.newBuilder()
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    return protoValue.build()
  }

  public fun RiskAssessment.toHapi(): org.hl7.fhir.r4.model.RiskAssessment {
    val hapiValue = org.hl7.fhir.r4.model.RiskAssessment()
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
    if (hasBasedOn()) {
      hapiValue.setBasedOn(basedOn.toHapi())
    }
    if (hasParent()) {
      hapiValue.setParent(parent.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasMethod()) {
      hapiValue.setMethod(method.toHapi())
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
    if (hasOccurrence()) {
      hapiValue.setOccurrence(occurrence.riskAssessmentOccurrenceToHapi())
    }
    if (hasCondition()) {
      hapiValue.setCondition(condition.toHapi())
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
    if (basisCount > 0) {
      hapiValue.setBasis(basisList.map { it.toHapi() })
    }
    if (predictionCount > 0) {
      hapiValue.setPrediction(predictionList.map { it.toHapi() })
    }
    if (hasMitigation()) {
      hapiValue.setMitigationElement(mitigation.toHapi())
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.RiskAssessment.toProto(): RiskAssessment {
    val protoValue = RiskAssessment.newBuilder()
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
      protoValue.setBasedOn(basedOn.toProto())
    }
    if (hasParent()) {
      protoValue.setParent(parent.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(RiskAssessment.StatusCode.newBuilder().setValue(ObservationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasMethod()) {
      protoValue.setMethod(method.toProto())
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
    if (hasOccurrence()) {
      protoValue.setOccurrence(occurrence.riskAssessmentOccurrenceToProto())
    }
    if (hasCondition()) {
      protoValue.setCondition(condition.toProto())
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
    if (hasBasis()) {
      protoValue.addAllBasis(basis.map { it.toProto() })
    }
    if (hasPrediction()) {
      protoValue.addAllPrediction(prediction.map { it.toProto() })
    }
    if (hasMitigation()) {
      protoValue.setMitigation(mitigationElement.toProto())
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentPredictionComponent.toProto():
      RiskAssessment.Prediction {
    val protoValue = RiskAssessment.Prediction.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasOutcome()) {
      protoValue.setOutcome(outcome.toProto())
    }
    if (hasProbability()) {
      protoValue.setProbability(probability.riskAssessmentPredictionProbabilityToProto())
    }
    if (hasQualitativeRisk()) {
      protoValue.setQualitativeRisk(qualitativeRisk.toProto())
    }
    if (hasRelativeRisk()) {
      protoValue.setRelativeRisk(relativeRiskElement.toProto())
    }
    if (hasWhen()) {
      protoValue.setWhen(`when`.riskAssessmentPredictionWhenToProto())
    }
    if (hasRationale()) {
      protoValue.setRationale(rationaleElement.toProto())
    }
    return protoValue.build()
  }

  private fun RiskAssessment.Prediction.toHapi():
      org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentPredictionComponent {
    val hapiValue = org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentPredictionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasOutcome()) {
      hapiValue.setOutcome(outcome.toHapi())
    }
    if (hasProbability()) {
      hapiValue.setProbability(probability.riskAssessmentPredictionProbabilityToHapi())
    }
    if (hasQualitativeRisk()) {
      hapiValue.setQualitativeRisk(qualitativeRisk.toHapi())
    }
    if (hasRelativeRisk()) {
      hapiValue.setRelativeRiskElement(relativeRisk.toHapi())
    }
    if (hasWhen()) {
      hapiValue.setWhen(`when`.riskAssessmentPredictionWhenToHapi())
    }
    if (hasRationale()) {
      hapiValue.setRationaleElement(rationale.toHapi())
    }
    return hapiValue
  }
}
