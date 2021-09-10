package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.AdministrativeGenderCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.ObservationDataTypeCode
import com.google.fhir.r4.core.ObservationDefinition
import com.google.fhir.r4.core.ObservationDefinition.QualifiedInterval
import com.google.fhir.r4.core.ObservationRangeCategoryCode
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.Enumerations

public object ObservationDefinitionConverter {
  public fun ObservationDefinition.toHapi(): org.hl7.fhir.r4.model.ObservationDefinition {
    val hapiValue = org.hl7.fhir.r4.model.ObservationDefinition()
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
    if (categoryCount > 0) {
      hapiValue.setCategory(categoryList.map { it.toHapi() })
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (identifierCount > 0) {
      hapiValue.setIdentifier(identifierList.map { it.toHapi() })
    }
    if (permittedDataTypeCount > 0) {
      permittedDataTypeList.forEach { hapiValue.addPermittedDataType(org.hl7.fhir.r4.model.ObservationDefinition.ObservationDataType.valueOf(it.value.name.hapiCodeCheck().replace("_", ""))) }
    }
    if (hasMultipleResultsAllowed()) {
      hapiValue.setMultipleResultsAllowedElement(multipleResultsAllowed.toHapi())
    }
    if (hasMethod()) {
      hapiValue.setMethod(method.toHapi())
    }
    if (hasPreferredReportName()) {
      hapiValue.setPreferredReportNameElement(preferredReportName.toHapi())
    }
    if (hasQuantitativeDetails()) {
      hapiValue.setQuantitativeDetails(quantitativeDetails.toHapi())
    }
    if (qualifiedIntervalCount > 0) {
      hapiValue.setQualifiedInterval(qualifiedIntervalList.map { it.toHapi() })
    }
    if (hasValidCodedValueSet()) {
      hapiValue.setValidCodedValueSet(validCodedValueSet.toHapi())
    }
    if (hasNormalCodedValueSet()) {
      hapiValue.setNormalCodedValueSet(normalCodedValueSet.toHapi())
    }
    if (hasAbnormalCodedValueSet()) {
      hapiValue.setAbnormalCodedValueSet(abnormalCodedValueSet.toHapi())
    }
    if (hasCriticalCodedValueSet()) {
      hapiValue.setCriticalCodedValueSet(criticalCodedValueSet.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ObservationDefinition.toProto(): ObservationDefinition {
    val protoValue = ObservationDefinition.newBuilder()
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
    if (hasCategory()) {
      protoValue.addAllCategory(category.map { it.toProto() })
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasIdentifier()) {
      protoValue.addAllIdentifier(identifier.map { it.toProto() })
    }
    if (hasPermittedDataType()) {
      protoValue.addAllPermittedDataType(permittedDataType.map { ObservationDefinition.PermittedDataTypeCode.newBuilder().setValue(ObservationDataTypeCode.Value.valueOf(it.value.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build() })
    }
    if (hasMultipleResultsAllowed()) {
      protoValue.setMultipleResultsAllowed(multipleResultsAllowedElement.toProto())
    }
    if (hasMethod()) {
      protoValue.setMethod(method.toProto())
    }
    if (hasPreferredReportName()) {
      protoValue.setPreferredReportName(preferredReportNameElement.toProto())
    }
    if (hasQuantitativeDetails()) {
      protoValue.setQuantitativeDetails(quantitativeDetails.toProto())
    }
    if (hasQualifiedInterval()) {
      protoValue.addAllQualifiedInterval(qualifiedInterval.map { it.toProto() })
    }
    if (hasValidCodedValueSet()) {
      protoValue.setValidCodedValueSet(validCodedValueSet.toProto())
    }
    if (hasNormalCodedValueSet()) {
      protoValue.setNormalCodedValueSet(normalCodedValueSet.toProto())
    }
    if (hasAbnormalCodedValueSet()) {
      protoValue.setAbnormalCodedValueSet(abnormalCodedValueSet.toProto())
    }
    if (hasCriticalCodedValueSet()) {
      protoValue.setCriticalCodedValueSet(criticalCodedValueSet.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ObservationDefinition.ObservationDefinitionQuantitativeDetailsComponent.toProto():
      ObservationDefinition.QuantitativeDetails {
    val protoValue = ObservationDefinition.QuantitativeDetails.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCustomaryUnit()) {
      protoValue.setCustomaryUnit(customaryUnit.toProto())
    }
    if (hasUnit()) {
      protoValue.setUnit(unit.toProto())
    }
    if (hasConversionFactor()) {
      protoValue.setConversionFactor(conversionFactorElement.toProto())
    }
    if (hasDecimalPrecision()) {
      protoValue.setDecimalPrecision(decimalPrecisionElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ObservationDefinition.ObservationDefinitionQualifiedIntervalComponent.toProto():
      ObservationDefinition.QualifiedInterval {
    val protoValue = ObservationDefinition.QualifiedInterval.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCategory()) {
      protoValue.setCategory(ObservationDefinition.QualifiedInterval.CategoryCode.newBuilder().setValue(ObservationRangeCategoryCode.Value.valueOf(category.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasRange()) {
      protoValue.setRange(range.toProto())
    }
    if (hasContext()) {
      protoValue.setContext(context.toProto())
    }
    if (hasAppliesTo()) {
      protoValue.addAllAppliesTo(appliesTo.map { it.toProto() })
    }
    if (hasGender()) {
      protoValue.setGender(ObservationDefinition.QualifiedInterval.GenderCode.newBuilder().setValue(AdministrativeGenderCode.Value.valueOf(gender.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasAge()) {
      protoValue.setAge(age.toProto())
    }
    if (hasGestationalAge()) {
      protoValue.setGestationalAge(gestationalAge.toProto())
    }
    if (hasCondition()) {
      protoValue.setCondition(conditionElement.toProto())
    }
    return protoValue.build()
  }

  private fun ObservationDefinition.QuantitativeDetails.toHapi():
      org.hl7.fhir.r4.model.ObservationDefinition.ObservationDefinitionQuantitativeDetailsComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.ObservationDefinition.ObservationDefinitionQuantitativeDetailsComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCustomaryUnit()) {
      hapiValue.setCustomaryUnit(customaryUnit.toHapi())
    }
    if (hasUnit()) {
      hapiValue.setUnit(unit.toHapi())
    }
    if (hasConversionFactor()) {
      hapiValue.setConversionFactorElement(conversionFactor.toHapi())
    }
    if (hasDecimalPrecision()) {
      hapiValue.setDecimalPrecisionElement(decimalPrecision.toHapi())
    }
    return hapiValue
  }

  private fun ObservationDefinition.QualifiedInterval.toHapi():
      org.hl7.fhir.r4.model.ObservationDefinition.ObservationDefinitionQualifiedIntervalComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.ObservationDefinition.ObservationDefinitionQualifiedIntervalComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCategory()) {
      hapiValue.setCategory(org.hl7.fhir.r4.model.ObservationDefinition.ObservationRangeCategory.valueOf(category.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasRange()) {
      hapiValue.setRange(range.toHapi())
    }
    if (hasContext()) {
      hapiValue.setContext(context.toHapi())
    }
    if (appliesToCount > 0) {
      hapiValue.setAppliesTo(appliesToList.map { it.toHapi() })
    }
    if (hasGender()) {
      hapiValue.setGender(Enumerations.AdministrativeGender.valueOf(gender.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasAge()) {
      hapiValue.setAge(age.toHapi())
    }
    if (hasGestationalAge()) {
      hapiValue.setGestationalAge(gestationalAge.toHapi())
    }
    if (hasCondition()) {
      hapiValue.setConditionElement(condition.toHapi())
    }
    return hapiValue
  }
}
