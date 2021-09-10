package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MarketingStatusConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MarketingStatusConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ProdCharacteristicConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ProdCharacteristicConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ProductShelfLifeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ProductShelfLifeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.MedicinalProductPackaged
import com.google.fhir.r4.core.String

public object MedicinalProductPackagedConverter {
  public fun MedicinalProductPackaged.toHapi(): org.hl7.fhir.r4.model.MedicinalProductPackaged {
    val hapiValue = org.hl7.fhir.r4.model.MedicinalProductPackaged()
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
    if (subjectCount > 0) {
      hapiValue.setSubject(subjectList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasLegalStatusOfSupply()) {
      hapiValue.setLegalStatusOfSupply(legalStatusOfSupply.toHapi())
    }
    if (marketingStatusCount > 0) {
      hapiValue.setMarketingStatus(marketingStatusList.map { it.toHapi() })
    }
    if (hasMarketingAuthorization()) {
      hapiValue.setMarketingAuthorization(marketingAuthorization.toHapi())
    }
    if (manufacturerCount > 0) {
      hapiValue.setManufacturer(manufacturerList.map { it.toHapi() })
    }
    if (batchIdentifierCount > 0) {
      hapiValue.setBatchIdentifier(batchIdentifierList.map { it.toHapi() })
    }
    if (packageItemCount > 0) {
      hapiValue.setPackageItem(packageItemList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MedicinalProductPackaged.toProto(): MedicinalProductPackaged {
    val protoValue = MedicinalProductPackaged.newBuilder()
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
    if (hasSubject()) {
      protoValue.addAllSubject(subject.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasLegalStatusOfSupply()) {
      protoValue.setLegalStatusOfSupply(legalStatusOfSupply.toProto())
    }
    if (hasMarketingStatus()) {
      protoValue.addAllMarketingStatus(marketingStatus.map { it.toProto() })
    }
    if (hasMarketingAuthorization()) {
      protoValue.setMarketingAuthorization(marketingAuthorization.toProto())
    }
    if (hasManufacturer()) {
      protoValue.addAllManufacturer(manufacturer.map { it.toProto() })
    }
    if (hasBatchIdentifier()) {
      protoValue.addAllBatchIdentifier(batchIdentifier.map { it.toProto() })
    }
    if (hasPackageItem()) {
      protoValue.addAllPackageItem(packageItem.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProductPackaged.MedicinalProductPackagedBatchIdentifierComponent.toProto():
      MedicinalProductPackaged.BatchIdentifier {
    val protoValue = MedicinalProductPackaged.BatchIdentifier.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasOuterPackaging()) {
      protoValue.setOuterPackaging(outerPackaging.toProto())
    }
    if (hasImmediatePackaging()) {
      protoValue.setImmediatePackaging(immediatePackaging.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProductPackaged.MedicinalProductPackagedPackageItemComponent.toProto():
      MedicinalProductPackaged.PackageItem {
    val protoValue = MedicinalProductPackaged.PackageItem.newBuilder()
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
      protoValue.addAllIdentifier(identifier.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasQuantity()) {
      protoValue.setQuantity(quantity.toProto())
    }
    if (hasMaterial()) {
      protoValue.addAllMaterial(material.map { it.toProto() })
    }
    if (hasAlternateMaterial()) {
      protoValue.addAllAlternateMaterial(alternateMaterial.map { it.toProto() })
    }
    if (hasDevice()) {
      protoValue.addAllDevice(device.map { it.toProto() })
    }
    if (hasManufacturedItem()) {
      protoValue.addAllManufacturedItem(manufacturedItem.map { it.toProto() })
    }
    if (hasPhysicalCharacteristics()) {
      protoValue.setPhysicalCharacteristics(physicalCharacteristics.toProto())
    }
    if (hasOtherCharacteristics()) {
      protoValue.addAllOtherCharacteristics(otherCharacteristics.map { it.toProto() })
    }
    if (hasShelfLifeStorage()) {
      protoValue.addAllShelfLifeStorage(shelfLifeStorage.map { it.toProto() })
    }
    if (hasManufacturer()) {
      protoValue.addAllManufacturer(manufacturer.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun MedicinalProductPackaged.BatchIdentifier.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductPackaged.MedicinalProductPackagedBatchIdentifierComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProductPackaged.MedicinalProductPackagedBatchIdentifierComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasOuterPackaging()) {
      hapiValue.setOuterPackaging(outerPackaging.toHapi())
    }
    if (hasImmediatePackaging()) {
      hapiValue.setImmediatePackaging(immediatePackaging.toHapi())
    }
    return hapiValue
  }

  private fun MedicinalProductPackaged.PackageItem.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductPackaged.MedicinalProductPackagedPackageItemComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProductPackaged.MedicinalProductPackagedPackageItemComponent()
    if (hasId()) {
      hapiValue.id = id.value
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
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (materialCount > 0) {
      hapiValue.setMaterial(materialList.map { it.toHapi() })
    }
    if (alternateMaterialCount > 0) {
      hapiValue.setAlternateMaterial(alternateMaterialList.map { it.toHapi() })
    }
    if (deviceCount > 0) {
      hapiValue.setDevice(deviceList.map { it.toHapi() })
    }
    if (manufacturedItemCount > 0) {
      hapiValue.setManufacturedItem(manufacturedItemList.map { it.toHapi() })
    }
    if (hasPhysicalCharacteristics()) {
      hapiValue.setPhysicalCharacteristics(physicalCharacteristics.toHapi())
    }
    if (otherCharacteristicsCount > 0) {
      hapiValue.setOtherCharacteristics(otherCharacteristicsList.map { it.toHapi() })
    }
    if (shelfLifeStorageCount > 0) {
      hapiValue.setShelfLifeStorage(shelfLifeStorageList.map { it.toHapi() })
    }
    if (manufacturerCount > 0) {
      hapiValue.setManufacturer(manufacturerList.map { it.toHapi() })
    }
    return hapiValue
  }
}
