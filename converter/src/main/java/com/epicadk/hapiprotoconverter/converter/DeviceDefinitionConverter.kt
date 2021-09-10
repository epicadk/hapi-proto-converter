package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
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
import com.google.fhir.r4.core.DeviceDefinition
import com.google.fhir.r4.core.DeviceDefinition.DeviceName
import com.google.fhir.r4.core.DeviceNameTypeCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object DeviceDefinitionConverter {
  private fun DeviceDefinition.ManufacturerX.deviceDefinitionManufacturerToHapi(): Type {
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for DeviceDefinition.manufacturer[x]")
  }

  private fun Type.deviceDefinitionManufacturerToProto(): DeviceDefinition.ManufacturerX {
    val protoValue = DeviceDefinition.ManufacturerX.newBuilder()
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  public fun DeviceDefinition.toHapi(): org.hl7.fhir.r4.model.DeviceDefinition {
    val hapiValue = org.hl7.fhir.r4.model.DeviceDefinition()
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
    if (udiDeviceIdentifierCount > 0) {
      hapiValue.setUdiDeviceIdentifier(udiDeviceIdentifierList.map { it.toHapi() })
    }
    if (hasManufacturer()) {
      hapiValue.setManufacturer(manufacturer.deviceDefinitionManufacturerToHapi())
    }
    if (deviceNameCount > 0) {
      hapiValue.setDeviceName(deviceNameList.map { it.toHapi() })
    }
    if (hasModelNumber()) {
      hapiValue.setModelNumberElement(modelNumber.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (specializationCount > 0) {
      hapiValue.setSpecialization(specializationList.map { it.toHapi() })
    }
    if (versionCount > 0) {
      hapiValue.setVersion(versionList.map { it.toHapi() })
    }
    if (safetyCount > 0) {
      hapiValue.setSafety(safetyList.map { it.toHapi() })
    }
    if (shelfLifeStorageCount > 0) {
      hapiValue.setShelfLifeStorage(shelfLifeStorageList.map { it.toHapi() })
    }
    if (hasPhysicalCharacteristics()) {
      hapiValue.setPhysicalCharacteristics(physicalCharacteristics.toHapi())
    }
    if (languageCodeCount > 0) {
      hapiValue.setLanguageCode(languageCodeList.map { it.toHapi() })
    }
    if (capabilityCount > 0) {
      hapiValue.setCapability(capabilityList.map { it.toHapi() })
    }
    if (propertyCount > 0) {
      hapiValue.setProperty(propertyList.map { it.toHapi() })
    }
    if (hasOwner()) {
      hapiValue.setOwner(owner.toHapi())
    }
    if (contactCount > 0) {
      hapiValue.setContact(contactList.map { it.toHapi() })
    }
    if (hasUrl()) {
      hapiValue.setUrlElement(url.toHapi())
    }
    if (hasOnlineInformation()) {
      hapiValue.setOnlineInformationElement(onlineInformation.toHapi())
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (hasParentDevice()) {
      hapiValue.setParentDevice(parentDevice.toHapi())
    }
    if (materialCount > 0) {
      hapiValue.setMaterial(materialList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.DeviceDefinition.toProto(): DeviceDefinition {
    val protoValue = DeviceDefinition.newBuilder()
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
    if (hasUdiDeviceIdentifier()) {
      protoValue.addAllUdiDeviceIdentifier(udiDeviceIdentifier.map { it.toProto() })
    }
    if (hasManufacturer()) {
      protoValue.setManufacturer(manufacturer.deviceDefinitionManufacturerToProto())
    }
    if (hasDeviceName()) {
      protoValue.addAllDeviceName(deviceName.map { it.toProto() })
    }
    if (hasModelNumber()) {
      protoValue.setModelNumber(modelNumberElement.toProto())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasSpecialization()) {
      protoValue.addAllSpecialization(specialization.map { it.toProto() })
    }
    if (hasVersion()) {
      protoValue.addAllVersion(version.map { it.toProto() })
    }
    if (hasSafety()) {
      protoValue.addAllSafety(safety.map { it.toProto() })
    }
    if (hasShelfLifeStorage()) {
      protoValue.addAllShelfLifeStorage(shelfLifeStorage.map { it.toProto() })
    }
    if (hasPhysicalCharacteristics()) {
      protoValue.setPhysicalCharacteristics(physicalCharacteristics.toProto())
    }
    if (hasLanguageCode()) {
      protoValue.addAllLanguageCode(languageCode.map { it.toProto() })
    }
    if (hasCapability()) {
      protoValue.addAllCapability(capability.map { it.toProto() })
    }
    if (hasProperty()) {
      protoValue.addAllProperty(property.map { it.toProto() })
    }
    if (hasOwner()) {
      protoValue.setOwner(owner.toProto())
    }
    if (hasContact()) {
      protoValue.addAllContact(contact.map { it.toProto() })
    }
    if (hasUrl()) {
      protoValue.setUrl(urlElement.toProto())
    }
    if (hasOnlineInformation()) {
      protoValue.setOnlineInformation(onlineInformationElement.toProto())
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasQuantity()) {
      protoValue.setQuantity(quantity.toProto())
    }
    if (hasParentDevice()) {
      protoValue.setParentDevice(parentDevice.toProto())
    }
    if (hasMaterial()) {
      protoValue.addAllMaterial(material.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionUdiDeviceIdentifierComponent.toProto():
      DeviceDefinition.UdiDeviceIdentifier {
    val protoValue = DeviceDefinition.UdiDeviceIdentifier.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDeviceIdentifier()) {
      protoValue.setDeviceIdentifier(deviceIdentifierElement.toProto())
    }
    if (hasIssuer()) {
      protoValue.setIssuer(issuerElement.toProto())
    }
    if (hasJurisdiction()) {
      protoValue.setJurisdiction(jurisdictionElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionDeviceNameComponent.toProto():
      DeviceDefinition.DeviceName {
    val protoValue = DeviceDefinition.DeviceName.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasType()) {
      protoValue.setType(DeviceDefinition.DeviceName.TypeCode.newBuilder().setValue(DeviceNameTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionSpecializationComponent.toProto():
      DeviceDefinition.Specialization {
    val protoValue = DeviceDefinition.Specialization.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSystemType()) {
      protoValue.setSystemType(systemTypeElement.toProto())
    }
    if (hasVersion()) {
      protoValue.setVersion(versionElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionCapabilityComponent.toProto():
      DeviceDefinition.Capability {
    val protoValue = DeviceDefinition.Capability.newBuilder()
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
    if (hasDescription()) {
      protoValue.addAllDescription(description.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionPropertyComponent.toProto():
      DeviceDefinition.Property {
    val protoValue = DeviceDefinition.Property.newBuilder()
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
    if (hasValueQuantity()) {
      protoValue.addAllValueQuantity(valueQuantity.map { it.toProto() })
    }
    if (hasValueCode()) {
      protoValue.addAllValueCode(valueCode.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionMaterialComponent.toProto():
      DeviceDefinition.Material {
    val protoValue = DeviceDefinition.Material.newBuilder()
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
    if (hasAlternate()) {
      protoValue.setAlternate(alternateElement.toProto())
    }
    if (hasAllergenicIndicator()) {
      protoValue.setAllergenicIndicator(allergenicIndicatorElement.toProto())
    }
    return protoValue.build()
  }

  private fun DeviceDefinition.UdiDeviceIdentifier.toHapi():
      org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionUdiDeviceIdentifierComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionUdiDeviceIdentifierComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasDeviceIdentifier()) {
      hapiValue.setDeviceIdentifierElement(deviceIdentifier.toHapi())
    }
    if (hasIssuer()) {
      hapiValue.setIssuerElement(issuer.toHapi())
    }
    if (hasJurisdiction()) {
      hapiValue.setJurisdictionElement(jurisdiction.toHapi())
    }
    return hapiValue
  }

  private fun DeviceDefinition.DeviceName.toHapi():
      org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionDeviceNameComponent {
    val hapiValue = org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionDeviceNameComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(org.hl7.fhir.r4.model.DeviceDefinition.DeviceNameType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    return hapiValue
  }

  private fun DeviceDefinition.Specialization.toHapi():
      org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionSpecializationComponent {
    val hapiValue = org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionSpecializationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasSystemType()) {
      hapiValue.setSystemTypeElement(systemType.toHapi())
    }
    if (hasVersion()) {
      hapiValue.setVersionElement(version.toHapi())
    }
    return hapiValue
  }

  private fun DeviceDefinition.Capability.toHapi():
      org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionCapabilityComponent {
    val hapiValue = org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionCapabilityComponent()
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
    if (descriptionCount > 0) {
      hapiValue.setDescription(descriptionList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun DeviceDefinition.Property.toHapi():
      org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionPropertyComponent {
    val hapiValue = org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionPropertyComponent()
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
    if (valueQuantityCount > 0) {
      hapiValue.setValueQuantity(valueQuantityList.map { it.toHapi() })
    }
    if (valueCodeCount > 0) {
      hapiValue.setValueCode(valueCodeList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun DeviceDefinition.Material.toHapi():
      org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionMaterialComponent {
    val hapiValue = org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionMaterialComponent()
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
    if (hasAlternate()) {
      hapiValue.setAlternateElement(alternate.toHapi())
    }
    if (hasAllergenicIndicator()) {
      hapiValue.setAllergenicIndicatorElement(allergenicIndicator.toHapi())
    }
    return hapiValue
  }
}
