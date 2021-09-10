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
import com.google.fhir.r4.core.ImmunizationRecommendation
import com.google.fhir.r4.core.ImmunizationRecommendation.Recommendation
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.PositiveIntType
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object ImmunizationRecommendationConverter {
  private
      fun ImmunizationRecommendation.Recommendation.DoseNumberX.immunizationRecommendationRecommendationDoseNumberToHapi():
      Type {
    if (hasPositiveInt()) {
      return (this.getPositiveInt()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for ImmunizationRecommendation.recommendation.doseNumber[x]")
  }

  private fun Type.immunizationRecommendationRecommendationDoseNumberToProto():
      ImmunizationRecommendation.Recommendation.DoseNumberX {
    val protoValue = ImmunizationRecommendation.Recommendation.DoseNumberX.newBuilder()
    if (this is PositiveIntType) {
      protoValue.setPositiveInt(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun ImmunizationRecommendation.Recommendation.SeriesDosesX.immunizationRecommendationRecommendationSeriesDosesToHapi():
      Type {
    if (hasPositiveInt()) {
      return (this.getPositiveInt()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for ImmunizationRecommendation.recommendation.seriesDoses[x]")
  }

  private fun Type.immunizationRecommendationRecommendationSeriesDosesToProto():
      ImmunizationRecommendation.Recommendation.SeriesDosesX {
    val protoValue = ImmunizationRecommendation.Recommendation.SeriesDosesX.newBuilder()
    if (this is PositiveIntType) {
      protoValue.setPositiveInt(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  public fun ImmunizationRecommendation.toHapi(): org.hl7.fhir.r4.model.ImmunizationRecommendation {
    val hapiValue = org.hl7.fhir.r4.model.ImmunizationRecommendation()
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
    if (hasPatient()) {
      hapiValue.setPatient(patient.toHapi())
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasAuthority()) {
      hapiValue.setAuthority(authority.toHapi())
    }
    if (recommendationCount > 0) {
      hapiValue.setRecommendation(recommendationList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ImmunizationRecommendation.toProto():
      ImmunizationRecommendation {
    val protoValue = ImmunizationRecommendation.newBuilder()
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
    if (hasPatient()) {
      protoValue.setPatient(patient.toProto())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasAuthority()) {
      protoValue.setAuthority(authority.toProto())
    }
    if (hasRecommendation()) {
      protoValue.addAllRecommendation(recommendation.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent.toProto():
      ImmunizationRecommendation.Recommendation {
    val protoValue = ImmunizationRecommendation.Recommendation.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasVaccineCode()) {
      protoValue.addAllVaccineCode(vaccineCode.map { it.toProto() })
    }
    if (hasTargetDisease()) {
      protoValue.setTargetDisease(targetDisease.toProto())
    }
    if (hasContraindicatedVaccineCode()) {
      protoValue.addAllContraindicatedVaccineCode(contraindicatedVaccineCode.map { it.toProto() })
    }
    if (hasForecastStatus()) {
      protoValue.setForecastStatus(forecastStatus.toProto())
    }
    if (hasForecastReason()) {
      protoValue.addAllForecastReason(forecastReason.map { it.toProto() })
    }
    if (hasDateCriterion()) {
      protoValue.addAllDateCriterion(dateCriterion.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasSeries()) {
      protoValue.setSeries(seriesElement.toProto())
    }
    if (hasDoseNumber()) {
      protoValue.setDoseNumber(doseNumber.immunizationRecommendationRecommendationDoseNumberToProto())
    }
    if (hasSeriesDoses()) {
      protoValue.setSeriesDoses(seriesDoses.immunizationRecommendationRecommendationSeriesDosesToProto())
    }
    if (hasSupportingImmunization()) {
      protoValue.addAllSupportingImmunization(supportingImmunization.map { it.toProto() })
    }
    if (hasSupportingPatientInformation()) {
      protoValue.addAllSupportingPatientInformation(supportingPatientInformation.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationDateCriterionComponent.toProto():
      ImmunizationRecommendation.Recommendation.DateCriterion {
    val protoValue = ImmunizationRecommendation.Recommendation.DateCriterion.newBuilder()
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
    if (hasValue()) {
      protoValue.setValue(valueElement.toProto())
    }
    return protoValue.build()
  }

  private fun ImmunizationRecommendation.Recommendation.toHapi():
      org.hl7.fhir.r4.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (vaccineCodeCount > 0) {
      hapiValue.setVaccineCode(vaccineCodeList.map { it.toHapi() })
    }
    if (hasTargetDisease()) {
      hapiValue.setTargetDisease(targetDisease.toHapi())
    }
    if (contraindicatedVaccineCodeCount > 0) {
      hapiValue.setContraindicatedVaccineCode(contraindicatedVaccineCodeList.map { it.toHapi() })
    }
    if (hasForecastStatus()) {
      hapiValue.setForecastStatus(forecastStatus.toHapi())
    }
    if (forecastReasonCount > 0) {
      hapiValue.setForecastReason(forecastReasonList.map { it.toHapi() })
    }
    if (dateCriterionCount > 0) {
      hapiValue.setDateCriterion(dateCriterionList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasSeries()) {
      hapiValue.setSeriesElement(series.toHapi())
    }
    if (hasDoseNumber()) {
      hapiValue.setDoseNumber(doseNumber.immunizationRecommendationRecommendationDoseNumberToHapi())
    }
    if (hasSeriesDoses()) {
      hapiValue.setSeriesDoses(seriesDoses.immunizationRecommendationRecommendationSeriesDosesToHapi())
    }
    if (supportingImmunizationCount > 0) {
      hapiValue.setSupportingImmunization(supportingImmunizationList.map { it.toHapi() })
    }
    if (supportingPatientInformationCount > 0) {
      hapiValue.setSupportingPatientInformation(supportingPatientInformationList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ImmunizationRecommendation.Recommendation.DateCriterion.toHapi():
      org.hl7.fhir.r4.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationDateCriterionComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.ImmunizationRecommendation.ImmunizationRecommendationRecommendationDateCriterionComponent()
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
    if (hasValue()) {
      hapiValue.setValueElement(value.toHapi())
    }
    return hapiValue
  }
}
