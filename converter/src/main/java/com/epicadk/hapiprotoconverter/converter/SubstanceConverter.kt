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
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.FHIRSubstanceStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.Substance
import com.google.fhir.r4.core.Substance.Ingredient
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.Type

public object SubstanceConverter {
  private fun Substance.Ingredient.SubstanceX.substanceIngredientSubstanceToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Substance.ingredient.substance[x]")
  }

  private fun Type.substanceIngredientSubstanceToProto(): Substance.Ingredient.SubstanceX {
    val protoValue = Substance.Ingredient.SubstanceX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  public fun Substance.toHapi(): org.hl7.fhir.r4.model.Substance {
    val hapiValue = org.hl7.fhir.r4.model.Substance()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.Substance.FHIRSubstanceStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (categoryCount > 0) {
      hapiValue.setCategory(categoryList.map { it.toHapi() })
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (instanceCount > 0) {
      hapiValue.setInstance(instanceList.map { it.toHapi() })
    }
    if (ingredientCount > 0) {
      hapiValue.setIngredient(ingredientList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Substance.toProto(): Substance {
    val protoValue = Substance.newBuilder()
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
      protoValue.setStatus(Substance.StatusCode.newBuilder().setValue(FHIRSubstanceStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCategory()) {
      protoValue.addAllCategory(category.map { it.toProto() })
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasInstance()) {
      protoValue.addAllInstance(instance.map { it.toProto() })
    }
    if (hasIngredient()) {
      protoValue.addAllIngredient(ingredient.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Substance.SubstanceInstanceComponent.toProto():
      Substance.Instance {
    val protoValue = Substance.Instance.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
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
    if (hasExpiry()) {
      protoValue.setExpiry(expiryElement.toProto())
    }
    if (hasQuantity()) {
      protoValue.setQuantity((quantity as SimpleQuantity).toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Substance.SubstanceIngredientComponent.toProto():
      Substance.Ingredient {
    val protoValue = Substance.Ingredient.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasQuantity()) {
      protoValue.setQuantity(quantity.toProto())
    }
    if (hasSubstance()) {
      protoValue.setSubstance(substance.substanceIngredientSubstanceToProto())
    }
    return protoValue.build()
  }

  private fun Substance.Instance.toHapi():
      org.hl7.fhir.r4.model.Substance.SubstanceInstanceComponent {
    val hapiValue = org.hl7.fhir.r4.model.Substance.SubstanceInstanceComponent()
    if (hasId()) {
      hapiValue.id = id.value
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
    if (hasExpiry()) {
      hapiValue.setExpiryElement(expiry.toHapi())
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    return hapiValue
  }

  private fun Substance.Ingredient.toHapi():
      org.hl7.fhir.r4.model.Substance.SubstanceIngredientComponent {
    val hapiValue = org.hl7.fhir.r4.model.Substance.SubstanceIngredientComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (hasSubstance()) {
      hapiValue.setSubstance(substance.substanceIngredientSubstanceToHapi())
    }
    return hapiValue
  }
}
