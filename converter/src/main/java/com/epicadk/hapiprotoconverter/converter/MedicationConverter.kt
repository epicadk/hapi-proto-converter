package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Medication
import com.google.fhir.r4.core.Medication.Ingredient
import com.google.fhir.r4.core.MedicationStatusCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.Type

public object MedicationConverter {
  private fun Medication.Ingredient.ItemX.medicationIngredientItemToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Medication.ingredient.item[x]")
  }

  private fun Type.medicationIngredientItemToProto(): Medication.Ingredient.ItemX {
    val protoValue = Medication.Ingredient.ItemX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  public fun Medication.toHapi(): org.hl7.fhir.r4.model.Medication {
    val hapiValue = org.hl7.fhir.r4.model.Medication()
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
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.Medication.MedicationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasManufacturer()) {
      hapiValue.setManufacturer(manufacturer.toHapi())
    }
    if (hasForm()) {
      hapiValue.setForm(form.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.toHapi())
    }
    if (ingredientCount > 0) {
      hapiValue.setIngredient(ingredientList.map { it.toHapi() })
    }
    if (hasBatch()) {
      hapiValue.setBatch(batch.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Medication.toProto(): Medication {
    val protoValue = Medication.newBuilder()
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
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(Medication.StatusCode.newBuilder().setValue(MedicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasManufacturer()) {
      protoValue.setManufacturer(manufacturer.toProto())
    }
    if (hasForm()) {
      protoValue.setForm(form.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount(amount.toProto())
    }
    if (hasIngredient()) {
      protoValue.addAllIngredient(ingredient.map { it.toProto() })
    }
    if (hasBatch()) {
      protoValue.setBatch(batch.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Medication.MedicationIngredientComponent.toProto():
      Medication.Ingredient {
    val protoValue = Medication.Ingredient.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasItem()) {
      protoValue.setItem(item.medicationIngredientItemToProto())
    }
    if (hasIsActive()) {
      protoValue.setIsActive(isActiveElement.toProto())
    }
    if (hasStrength()) {
      protoValue.setStrength(strength.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Medication.MedicationBatchComponent.toProto():
      Medication.Batch {
    val protoValue = Medication.Batch.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasLotNumber()) {
      protoValue.setLotNumber(lotNumberElement.toProto())
    }
    if (hasExpirationDate()) {
      protoValue.setExpirationDate(expirationDateElement.toProto())
    }
    return protoValue.build()
  }

  private fun Medication.Ingredient.toHapi():
      org.hl7.fhir.r4.model.Medication.MedicationIngredientComponent {
    val hapiValue = org.hl7.fhir.r4.model.Medication.MedicationIngredientComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasItem()) {
      hapiValue.setItem(item.medicationIngredientItemToHapi())
    }
    if (hasIsActive()) {
      hapiValue.setIsActiveElement(isActive.toHapi())
    }
    if (hasStrength()) {
      hapiValue.setStrength(strength.toHapi())
    }
    return hapiValue
  }

  private fun Medication.Batch.toHapi(): org.hl7.fhir.r4.model.Medication.MedicationBatchComponent {
    val hapiValue = org.hl7.fhir.r4.model.Medication.MedicationBatchComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasLotNumber()) {
      hapiValue.setLotNumberElement(lotNumber.toHapi())
    }
    if (hasExpirationDate()) {
      hapiValue.setExpirationDateElement(expirationDate.toHapi())
    }
    return hapiValue
  }
}
