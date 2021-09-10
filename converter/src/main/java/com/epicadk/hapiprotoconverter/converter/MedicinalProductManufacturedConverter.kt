package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ProdCharacteristicConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ProdCharacteristicConverter.toProto
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.MedicinalProductManufactured

public object MedicinalProductManufacturedConverter {
  public fun MedicinalProductManufactured.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductManufactured {
    val hapiValue = org.hl7.fhir.r4.model.MedicinalProductManufactured()
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
    if (hasManufacturedDoseForm()) {
      hapiValue.setManufacturedDoseForm(manufacturedDoseForm.toHapi())
    }
    if (hasUnitOfPresentation()) {
      hapiValue.setUnitOfPresentation(unitOfPresentation.toHapi())
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (manufacturerCount > 0) {
      hapiValue.setManufacturer(manufacturerList.map { it.toHapi() })
    }
    if (ingredientCount > 0) {
      hapiValue.setIngredient(ingredientList.map { it.toHapi() })
    }
    if (hasPhysicalCharacteristics()) {
      hapiValue.setPhysicalCharacteristics(physicalCharacteristics.toHapi())
    }
    if (otherCharacteristicsCount > 0) {
      hapiValue.setOtherCharacteristics(otherCharacteristicsList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MedicinalProductManufactured.toProto():
      MedicinalProductManufactured {
    val protoValue = MedicinalProductManufactured.newBuilder()
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
    if (hasManufacturedDoseForm()) {
      protoValue.setManufacturedDoseForm(manufacturedDoseForm.toProto())
    }
    if (hasUnitOfPresentation()) {
      protoValue.setUnitOfPresentation(unitOfPresentation.toProto())
    }
    if (hasQuantity()) {
      protoValue.setQuantity(quantity.toProto())
    }
    if (hasManufacturer()) {
      protoValue.addAllManufacturer(manufacturer.map { it.toProto() })
    }
    if (hasIngredient()) {
      protoValue.addAllIngredient(ingredient.map { it.toProto() })
    }
    if (hasPhysicalCharacteristics()) {
      protoValue.setPhysicalCharacteristics(physicalCharacteristics.toProto())
    }
    if (hasOtherCharacteristics()) {
      protoValue.addAllOtherCharacteristics(otherCharacteristics.map { it.toProto() })
    }
    return protoValue.build()
  }
}
