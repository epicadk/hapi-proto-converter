package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.MedicinalProductIngredient
import com.google.fhir.r4.core.MedicinalProductIngredient.SpecifiedSubstance
import com.google.fhir.r4.core.MedicinalProductIngredient.SpecifiedSubstance.Strength
import com.google.fhir.r4.core.String

public object MedicinalProductIngredientConverter {
  public fun MedicinalProductIngredient.toHapi(): org.hl7.fhir.r4.model.MedicinalProductIngredient {
    val hapiValue = org.hl7.fhir.r4.model.MedicinalProductIngredient()
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
    if (hasRole()) {
      hapiValue.setRole(role.toHapi())
    }
    if (hasAllergenicIndicator()) {
      hapiValue.setAllergenicIndicatorElement(allergenicIndicator.toHapi())
    }
    if (manufacturerCount > 0) {
      hapiValue.setManufacturer(manufacturerList.map { it.toHapi() })
    }
    if (specifiedSubstanceCount > 0) {
      hapiValue.setSpecifiedSubstance(specifiedSubstanceList.map { it.toHapi() })
    }
    if (hasSubstance()) {
      hapiValue.setSubstance(substance.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MedicinalProductIngredient.toProto():
      MedicinalProductIngredient {
    val protoValue = MedicinalProductIngredient.newBuilder()
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
    if (hasRole()) {
      protoValue.setRole(role.toProto())
    }
    if (hasAllergenicIndicator()) {
      protoValue.setAllergenicIndicator(allergenicIndicatorElement.toProto())
    }
    if (hasManufacturer()) {
      protoValue.addAllManufacturer(manufacturer.map { it.toProto() })
    }
    if (hasSpecifiedSubstance()) {
      protoValue.addAllSpecifiedSubstance(specifiedSubstance.map { it.toProto() })
    }
    if (hasSubstance()) {
      protoValue.setSubstance(substance.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceComponent.toProto():
      MedicinalProductIngredient.SpecifiedSubstance {
    val protoValue = MedicinalProductIngredient.SpecifiedSubstance.newBuilder()
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
    if (hasGroup()) {
      protoValue.setGroup(group.toProto())
    }
    if (hasConfidentiality()) {
      protoValue.setConfidentiality(confidentiality.toProto())
    }
    if (hasStrength()) {
      protoValue.addAllStrength(strength.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthComponent.toProto():
      MedicinalProductIngredient.SpecifiedSubstance.Strength {
    val protoValue = MedicinalProductIngredient.SpecifiedSubstance.Strength.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasPresentation()) {
      protoValue.setPresentation(presentation.toProto())
    }
    if (hasPresentationLowLimit()) {
      protoValue.setPresentationLowLimit(presentationLowLimit.toProto())
    }
    if (hasConcentration()) {
      protoValue.setConcentration(concentration.toProto())
    }
    if (hasConcentrationLowLimit()) {
      protoValue.setConcentrationLowLimit(concentrationLowLimit.toProto())
    }
    if (hasMeasurementPoint()) {
      protoValue.setMeasurementPoint(measurementPointElement.toProto())
    }
    if (hasCountry()) {
      protoValue.addAllCountry(country.map { it.toProto() })
    }
    if (hasReferenceStrength()) {
      protoValue.addAllReferenceStrength(referenceStrength.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthComponent.toProto():
      MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength {
    val protoValue =
        MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSubstance()) {
      protoValue.setSubstance(substance.toProto())
    }
    if (hasStrength()) {
      protoValue.setStrength(strength.toProto())
    }
    if (hasStrengthLowLimit()) {
      protoValue.setStrengthLowLimit(strengthLowLimit.toProto())
    }
    if (hasMeasurementPoint()) {
      protoValue.setMeasurementPoint(measurementPointElement.toProto())
    }
    if (hasCountry()) {
      protoValue.addAllCountry(country.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSubstanceComponent.toProto():
      MedicinalProductIngredient.Substance {
    val protoValue = MedicinalProductIngredient.Substance.newBuilder()
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
    return protoValue.build()
  }

  private fun MedicinalProductIngredient.SpecifiedSubstance.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceComponent()
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
    if (hasGroup()) {
      hapiValue.setGroup(group.toHapi())
    }
    if (hasConfidentiality()) {
      hapiValue.setConfidentiality(confidentiality.toHapi())
    }
    if (strengthCount > 0) {
      hapiValue.setStrength(strengthList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun MedicinalProductIngredient.SpecifiedSubstance.Strength.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasPresentation()) {
      hapiValue.setPresentation(presentation.toHapi())
    }
    if (hasPresentationLowLimit()) {
      hapiValue.setPresentationLowLimit(presentationLowLimit.toHapi())
    }
    if (hasConcentration()) {
      hapiValue.setConcentration(concentration.toHapi())
    }
    if (hasConcentrationLowLimit()) {
      hapiValue.setConcentrationLowLimit(concentrationLowLimit.toHapi())
    }
    if (hasMeasurementPoint()) {
      hapiValue.setMeasurementPointElement(measurementPoint.toHapi())
    }
    if (countryCount > 0) {
      hapiValue.setCountry(countryList.map { it.toHapi() })
    }
    if (referenceStrengthCount > 0) {
      hapiValue.setReferenceStrength(referenceStrengthList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasSubstance()) {
      hapiValue.setSubstance(substance.toHapi())
    }
    if (hasStrength()) {
      hapiValue.setStrength(strength.toHapi())
    }
    if (hasStrengthLowLimit()) {
      hapiValue.setStrengthLowLimit(strengthLowLimit.toHapi())
    }
    if (hasMeasurementPoint()) {
      hapiValue.setMeasurementPointElement(measurementPoint.toHapi())
    }
    if (countryCount > 0) {
      hapiValue.setCountry(countryList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun MedicinalProductIngredient.Substance.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSubstanceComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSubstanceComponent()
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
    return hapiValue
  }
}
