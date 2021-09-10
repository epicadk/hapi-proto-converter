package com.epicadk.hapiprotoconverter.converter

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
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.NutritionOrder
import com.google.fhir.r4.core.NutritionOrder.EnteralFormula
import com.google.fhir.r4.core.NutritionOrder.EnteralFormula.Administration
import com.google.fhir.r4.core.NutritionOrder.OralDiet
import com.google.fhir.r4.core.RequestIntentCode
import com.google.fhir.r4.core.RequestStatusCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Ratio
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.Type

public object NutritionOrderConverter {
  private
      fun NutritionOrder.EnteralFormula.Administration.RateX.nutritionOrderEnteralFormulaAdministrationRateToHapi():
      Type {
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasRatio()) {
      return (this.getRatio()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for NutritionOrder.enteralFormula.administration.rate[x]")
  }

  private fun Type.nutritionOrderEnteralFormulaAdministrationRateToProto():
      NutritionOrder.EnteralFormula.Administration.RateX {
    val protoValue = NutritionOrder.EnteralFormula.Administration.RateX.newBuilder()
    if (this is SimpleQuantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is Ratio) {
      protoValue.setRatio(this.toProto())
    }
    return protoValue.build()
  }

  public fun NutritionOrder.toHapi(): org.hl7.fhir.r4.model.NutritionOrder {
    val hapiValue = org.hl7.fhir.r4.model.NutritionOrder()
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
    if (instantiatesCount > 0) {
      hapiValue.setInstantiates(instantiatesList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasIntent()) {
      hapiValue.setIntent(org.hl7.fhir.r4.model.NutritionOrder.NutritiionOrderIntent.valueOf(intent.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPatient()) {
      hapiValue.setPatient(patient.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasDateTime()) {
      hapiValue.setDateTimeElement(dateTime.toHapi())
    }
    if (hasOrderer()) {
      hapiValue.setOrderer(orderer.toHapi())
    }
    if (allergyIntoleranceCount > 0) {
      hapiValue.setAllergyIntolerance(allergyIntoleranceList.map { it.toHapi() })
    }
    if (foodPreferenceModifierCount > 0) {
      hapiValue.setFoodPreferenceModifier(foodPreferenceModifierList.map { it.toHapi() })
    }
    if (excludeFoodModifierCount > 0) {
      hapiValue.setExcludeFoodModifier(excludeFoodModifierList.map { it.toHapi() })
    }
    if (hasOralDiet()) {
      hapiValue.setOralDiet(oralDiet.toHapi())
    }
    if (supplementCount > 0) {
      hapiValue.setSupplement(supplementList.map { it.toHapi() })
    }
    if (hasEnteralFormula()) {
      hapiValue.setEnteralFormula(enteralFormula.toHapi())
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.NutritionOrder.toProto(): NutritionOrder {
    val protoValue = NutritionOrder.newBuilder()
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
    if (hasInstantiates()) {
      protoValue.addAllInstantiates(instantiates.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(NutritionOrder.StatusCode.newBuilder().setValue(RequestStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasIntent()) {
      protoValue.setIntent(NutritionOrder.IntentCode.newBuilder().setValue(RequestIntentCode.Value.valueOf(intent.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPatient()) {
      protoValue.setPatient(patient.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasDateTime()) {
      protoValue.setDateTime(dateTimeElement.toProto())
    }
    if (hasOrderer()) {
      protoValue.setOrderer(orderer.toProto())
    }
    if (hasAllergyIntolerance()) {
      protoValue.addAllAllergyIntolerance(allergyIntolerance.map { it.toProto() })
    }
    if (hasFoodPreferenceModifier()) {
      protoValue.addAllFoodPreferenceModifier(foodPreferenceModifier.map { it.toProto() })
    }
    if (hasExcludeFoodModifier()) {
      protoValue.addAllExcludeFoodModifier(excludeFoodModifier.map { it.toProto() })
    }
    if (hasOralDiet()) {
      protoValue.setOralDiet(oralDiet.toProto())
    }
    if (hasSupplement()) {
      protoValue.addAllSupplement(supplement.map { it.toProto() })
    }
    if (hasEnteralFormula()) {
      protoValue.setEnteralFormula(enteralFormula.toProto())
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietComponent.toProto():
      NutritionOrder.OralDiet {
    val protoValue = NutritionOrder.OralDiet.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasSchedule()) {
      protoValue.addAllSchedule(schedule.map { it.toProto() })
    }
    if (hasNutrient()) {
      protoValue.addAllNutrient(nutrient.map { it.toProto() })
    }
    if (hasTexture()) {
      protoValue.addAllTexture(texture.map { it.toProto() })
    }
    if (hasFluidConsistencyType()) {
      protoValue.addAllFluidConsistencyType(fluidConsistencyType.map { it.toProto() })
    }
    if (hasInstruction()) {
      protoValue.setInstruction(instructionElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietNutrientComponent.toProto():
      NutritionOrder.OralDiet.Nutrient {
    val protoValue = NutritionOrder.OralDiet.Nutrient.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasModifier()) {
      protoValue.setModifier(modifier.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount((amount as SimpleQuantity).toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietTextureComponent.toProto():
      NutritionOrder.OralDiet.Texture {
    val protoValue = NutritionOrder.OralDiet.Texture.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasModifier()) {
      protoValue.setModifier(modifier.toProto())
    }
    if (hasFoodType()) {
      protoValue.setFoodType(foodType.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderSupplementComponent.toProto():
      NutritionOrder.Supplement {
    val protoValue = NutritionOrder.Supplement.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasProductName()) {
      protoValue.setProductName(productNameElement.toProto())
    }
    if (hasSchedule()) {
      protoValue.addAllSchedule(schedule.map { it.toProto() })
    }
    if (hasQuantity()) {
      protoValue.setQuantity((quantity as SimpleQuantity).toProto())
    }
    if (hasInstruction()) {
      protoValue.setInstruction(instructionElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaComponent.toProto():
      NutritionOrder.EnteralFormula {
    val protoValue = NutritionOrder.EnteralFormula.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasBaseFormulaType()) {
      protoValue.setBaseFormulaType(baseFormulaType.toProto())
    }
    if (hasBaseFormulaProductName()) {
      protoValue.setBaseFormulaProductName(baseFormulaProductNameElement.toProto())
    }
    if (hasAdditiveType()) {
      protoValue.setAdditiveType(additiveType.toProto())
    }
    if (hasAdditiveProductName()) {
      protoValue.setAdditiveProductName(additiveProductNameElement.toProto())
    }
    if (hasCaloricDensity()) {
      protoValue.setCaloricDensity((caloricDensity as SimpleQuantity).toProto())
    }
    if (hasRouteofAdministration()) {
      protoValue.setRouteofAdministration(routeofAdministration.toProto())
    }
    if (hasAdministration()) {
      protoValue.addAllAdministration(administration.map { it.toProto() })
    }
    if (hasMaxVolumeToDeliver()) {
      protoValue.setMaxVolumeToDeliver((maxVolumeToDeliver as SimpleQuantity).toProto())
    }
    if (hasAdministrationInstruction()) {
      protoValue.setAdministrationInstruction(administrationInstructionElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent.toProto():
      NutritionOrder.EnteralFormula.Administration {
    val protoValue = NutritionOrder.EnteralFormula.Administration.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSchedule()) {
      protoValue.setSchedule(schedule.toProto())
    }
    if (hasQuantity()) {
      protoValue.setQuantity((quantity as SimpleQuantity).toProto())
    }
    if (hasRate()) {
      protoValue.setRate(rate.nutritionOrderEnteralFormulaAdministrationRateToProto())
    }
    return protoValue.build()
  }

  private fun NutritionOrder.OralDiet.toHapi():
      org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietComponent {
    val hapiValue = org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (typeCount > 0) {
      hapiValue.setType(typeList.map { it.toHapi() })
    }
    if (scheduleCount > 0) {
      hapiValue.setSchedule(scheduleList.map { it.toHapi() })
    }
    if (nutrientCount > 0) {
      hapiValue.setNutrient(nutrientList.map { it.toHapi() })
    }
    if (textureCount > 0) {
      hapiValue.setTexture(textureList.map { it.toHapi() })
    }
    if (fluidConsistencyTypeCount > 0) {
      hapiValue.setFluidConsistencyType(fluidConsistencyTypeList.map { it.toHapi() })
    }
    if (hasInstruction()) {
      hapiValue.setInstructionElement(instruction.toHapi())
    }
    return hapiValue
  }

  private fun NutritionOrder.OralDiet.Nutrient.toHapi():
      org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietNutrientComponent {
    val hapiValue = org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietNutrientComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasModifier()) {
      hapiValue.setModifier(modifier.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.toHapi())
    }
    return hapiValue
  }

  private fun NutritionOrder.OralDiet.Texture.toHapi():
      org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietTextureComponent {
    val hapiValue = org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietTextureComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasModifier()) {
      hapiValue.setModifier(modifier.toHapi())
    }
    if (hasFoodType()) {
      hapiValue.setFoodType(foodType.toHapi())
    }
    return hapiValue
  }

  private fun NutritionOrder.Supplement.toHapi():
      org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderSupplementComponent {
    val hapiValue = org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderSupplementComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasProductName()) {
      hapiValue.setProductNameElement(productName.toHapi())
    }
    if (scheduleCount > 0) {
      hapiValue.setSchedule(scheduleList.map { it.toHapi() })
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (hasInstruction()) {
      hapiValue.setInstructionElement(instruction.toHapi())
    }
    return hapiValue
  }

  private fun NutritionOrder.EnteralFormula.toHapi():
      org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaComponent {
    val hapiValue = org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasBaseFormulaType()) {
      hapiValue.setBaseFormulaType(baseFormulaType.toHapi())
    }
    if (hasBaseFormulaProductName()) {
      hapiValue.setBaseFormulaProductNameElement(baseFormulaProductName.toHapi())
    }
    if (hasAdditiveType()) {
      hapiValue.setAdditiveType(additiveType.toHapi())
    }
    if (hasAdditiveProductName()) {
      hapiValue.setAdditiveProductNameElement(additiveProductName.toHapi())
    }
    if (hasCaloricDensity()) {
      hapiValue.setCaloricDensity(caloricDensity.toHapi())
    }
    if (hasRouteofAdministration()) {
      hapiValue.setRouteofAdministration(routeofAdministration.toHapi())
    }
    if (administrationCount > 0) {
      hapiValue.setAdministration(administrationList.map { it.toHapi() })
    }
    if (hasMaxVolumeToDeliver()) {
      hapiValue.setMaxVolumeToDeliver(maxVolumeToDeliver.toHapi())
    }
    if (hasAdministrationInstruction()) {
      hapiValue.setAdministrationInstructionElement(administrationInstruction.toHapi())
    }
    return hapiValue
  }

  private fun NutritionOrder.EnteralFormula.Administration.toHapi():
      org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasSchedule()) {
      hapiValue.setSchedule(schedule.toHapi())
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (hasRate()) {
      hapiValue.setRate(rate.nutritionOrderEnteralFormulaAdministrationRateToHapi())
    }
    return hapiValue
  }
}
