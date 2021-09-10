package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.Base64BinaryConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.Base64BinaryConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Device
import com.google.fhir.r4.core.Device.DeviceName
import com.google.fhir.r4.core.Device.UdiCarrier
import com.google.fhir.r4.core.DeviceNameTypeCode
import com.google.fhir.r4.core.FHIRDeviceStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.UDIEntryTypeCode

public object DeviceConverter {
  public fun Device.toHapi(): org.hl7.fhir.r4.model.Device {
    val hapiValue = org.hl7.fhir.r4.model.Device()
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
    if (hasDefinition()) {
      hapiValue.setDefinition(definition.toHapi())
    }
    if (udiCarrierCount > 0) {
      hapiValue.setUdiCarrier(udiCarrierList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.Device.FHIRDeviceStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (statusReasonCount > 0) {
      hapiValue.setStatusReason(statusReasonList.map { it.toHapi() })
    }
    if (hasDistinctIdentifier()) {
      hapiValue.setDistinctIdentifierElement(distinctIdentifier.toHapi())
    }
    if (hasManufacturer()) {
      hapiValue.setManufacturerElement(manufacturer.toHapi())
    }
    if (hasManufactureDate()) {
      hapiValue.setManufactureDateElement(manufactureDate.toHapi())
    }
    if (hasExpirationDate()) {
      hapiValue.setExpirationDateElement(expirationDate.toHapi())
    }
    if (hasLotNumber()) {
      hapiValue.setLotNumberElement(lotNumber.toHapi())
    }
    if (hasSerialNumber()) {
      hapiValue.setSerialNumberElement(serialNumber.toHapi())
    }
    if (deviceNameCount > 0) {
      hapiValue.setDeviceName(deviceNameList.map { it.toHapi() })
    }
    if (hasModelNumber()) {
      hapiValue.setModelNumberElement(modelNumber.toHapi())
    }
    if (hasPartNumber()) {
      hapiValue.setPartNumberElement(partNumber.toHapi())
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
    if (propertyCount > 0) {
      hapiValue.setProperty(propertyList.map { it.toHapi() })
    }
    if (hasPatient()) {
      hapiValue.setPatient(patient.toHapi())
    }
    if (hasOwner()) {
      hapiValue.setOwner(owner.toHapi())
    }
    if (contactCount > 0) {
      hapiValue.setContact(contactList.map { it.toHapi() })
    }
    if (hasLocation()) {
      hapiValue.setLocation(location.toHapi())
    }
    if (hasUrl()) {
      hapiValue.setUrlElement(url.toHapi())
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (safetyCount > 0) {
      hapiValue.setSafety(safetyList.map { it.toHapi() })
    }
    if (hasParent()) {
      hapiValue.setParent(parent.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Device.toProto(): Device {
    val protoValue = Device.newBuilder()
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
    if (hasDefinition()) {
      protoValue.setDefinition(definition.toProto())
    }
    if (hasUdiCarrier()) {
      protoValue.addAllUdiCarrier(udiCarrier.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(Device.StatusCode.newBuilder().setValue(FHIRDeviceStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasStatusReason()) {
      protoValue.addAllStatusReason(statusReason.map { it.toProto() })
    }
    if (hasDistinctIdentifier()) {
      protoValue.setDistinctIdentifier(distinctIdentifierElement.toProto())
    }
    if (hasManufacturer()) {
      protoValue.setManufacturer(manufacturerElement.toProto())
    }
    if (hasManufactureDate()) {
      protoValue.setManufactureDate(manufactureDateElement.toProto())
    }
    if (hasExpirationDate()) {
      protoValue.setExpirationDate(expirationDateElement.toProto())
    }
    if (hasLotNumber()) {
      protoValue.setLotNumber(lotNumberElement.toProto())
    }
    if (hasSerialNumber()) {
      protoValue.setSerialNumber(serialNumberElement.toProto())
    }
    if (hasDeviceName()) {
      protoValue.addAllDeviceName(deviceName.map { it.toProto() })
    }
    if (hasModelNumber()) {
      protoValue.setModelNumber(modelNumberElement.toProto())
    }
    if (hasPartNumber()) {
      protoValue.setPartNumber(partNumberElement.toProto())
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
    if (hasProperty()) {
      protoValue.addAllProperty(property.map { it.toProto() })
    }
    if (hasPatient()) {
      protoValue.setPatient(patient.toProto())
    }
    if (hasOwner()) {
      protoValue.setOwner(owner.toProto())
    }
    if (hasContact()) {
      protoValue.addAllContact(contact.map { it.toProto() })
    }
    if (hasLocation()) {
      protoValue.setLocation(location.toProto())
    }
    if (hasUrl()) {
      protoValue.setUrl(urlElement.toProto())
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasSafety()) {
      protoValue.addAllSafety(safety.map { it.toProto() })
    }
    if (hasParent()) {
      protoValue.setParent(parent.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Device.DeviceUdiCarrierComponent.toProto(): Device.UdiCarrier {
    val protoValue = Device.UdiCarrier.newBuilder()
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
    if (hasCarrierAIDC()) {
      protoValue.setCarrierAidc(carrierAIDCElement.toProto())
    }
    if (hasCarrierHRF()) {
      protoValue.setCarrierHrf(carrierHRFElement.toProto())
    }
    if (hasEntryType()) {
      protoValue.setEntryType(Device.UdiCarrier.EntryTypeCode.newBuilder().setValue(UDIEntryTypeCode.Value.valueOf(entryType.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Device.DeviceDeviceNameComponent.toProto(): Device.DeviceName {
    val protoValue = Device.DeviceName.newBuilder()
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
      protoValue.setType(Device.DeviceName.TypeCode.newBuilder().setValue(DeviceNameTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Device.DeviceSpecializationComponent.toProto():
      Device.Specialization {
    val protoValue = Device.Specialization.newBuilder()
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
      protoValue.setSystemType(systemType.toProto())
    }
    if (hasVersion()) {
      protoValue.setVersion(versionElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Device.DeviceVersionComponent.toProto(): Device.Version {
    val protoValue = Device.Version.newBuilder()
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
    if (hasComponent()) {
      protoValue.setComponent(component.toProto())
    }
    if (hasValue()) {
      protoValue.setValue(valueElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Device.DevicePropertyComponent.toProto(): Device.Property {
    val protoValue = Device.Property.newBuilder()
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

  private fun Device.UdiCarrier.toHapi(): org.hl7.fhir.r4.model.Device.DeviceUdiCarrierComponent {
    val hapiValue = org.hl7.fhir.r4.model.Device.DeviceUdiCarrierComponent()
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
    if (hasCarrierAidc()) {
      hapiValue.setCarrierAIDCElement(carrierAidc.toHapi())
    }
    if (hasCarrierHrf()) {
      hapiValue.setCarrierHRFElement(carrierHrf.toHapi())
    }
    if (hasEntryType()) {
      hapiValue.setEntryType(org.hl7.fhir.r4.model.Device.UDIEntryType.valueOf(entryType.value.name.hapiCodeCheck().replace("_", "")))
    }
    return hapiValue
  }

  private fun Device.DeviceName.toHapi(): org.hl7.fhir.r4.model.Device.DeviceDeviceNameComponent {
    val hapiValue = org.hl7.fhir.r4.model.Device.DeviceDeviceNameComponent()
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
      hapiValue.setType(org.hl7.fhir.r4.model.Device.DeviceNameType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    return hapiValue
  }

  private fun Device.Specialization.toHapi():
      org.hl7.fhir.r4.model.Device.DeviceSpecializationComponent {
    val hapiValue = org.hl7.fhir.r4.model.Device.DeviceSpecializationComponent()
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
      hapiValue.setSystemType(systemType.toHapi())
    }
    if (hasVersion()) {
      hapiValue.setVersionElement(version.toHapi())
    }
    return hapiValue
  }

  private fun Device.Version.toHapi(): org.hl7.fhir.r4.model.Device.DeviceVersionComponent {
    val hapiValue = org.hl7.fhir.r4.model.Device.DeviceVersionComponent()
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
    if (hasComponent()) {
      hapiValue.setComponent(component.toHapi())
    }
    if (hasValue()) {
      hapiValue.setValueElement(value.toHapi())
    }
    return hapiValue
  }

  private fun Device.Property.toHapi(): org.hl7.fhir.r4.model.Device.DevicePropertyComponent {
    val hapiValue = org.hl7.fhir.r4.model.Device.DevicePropertyComponent()
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
}
