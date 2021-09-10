package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AddressConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AddressConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.DaysOfWeekCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Location
import com.google.fhir.r4.core.Location.HoursOfOperation
import com.google.fhir.r4.core.LocationModeCode
import com.google.fhir.r4.core.LocationStatusCode
import com.google.fhir.r4.core.String

public object LocationConverter {
  public fun Location.toHapi(): org.hl7.fhir.r4.model.Location {
    val hapiValue = org.hl7.fhir.r4.model.Location()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.Location.LocationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasOperationalStatus()) {
      hapiValue.setOperationalStatus(operationalStatus.toHapi())
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (aliasCount > 0) {
      hapiValue.setAlias(aliasList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasMode()) {
      hapiValue.setMode(org.hl7.fhir.r4.model.Location.LocationMode.valueOf(mode.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (typeCount > 0) {
      hapiValue.setType(typeList.map { it.toHapi() })
    }
    if (telecomCount > 0) {
      hapiValue.setTelecom(telecomList.map { it.toHapi() })
    }
    if (hasAddress()) {
      hapiValue.setAddress(address.toHapi())
    }
    if (hasPhysicalType()) {
      hapiValue.setPhysicalType(physicalType.toHapi())
    }
    if (hasPosition()) {
      hapiValue.setPosition(position.toHapi())
    }
    if (hasManagingOrganization()) {
      hapiValue.setManagingOrganization(managingOrganization.toHapi())
    }
    if (hasPartOf()) {
      hapiValue.setPartOf(partOf.toHapi())
    }
    if (hoursOfOperationCount > 0) {
      hapiValue.setHoursOfOperation(hoursOfOperationList.map { it.toHapi() })
    }
    if (hasAvailabilityExceptions()) {
      hapiValue.setAvailabilityExceptionsElement(availabilityExceptions.toHapi())
    }
    if (endpointCount > 0) {
      hapiValue.setEndpoint(endpointList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Location.toProto(): Location {
    val protoValue = Location.newBuilder()
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
      protoValue.setStatus(Location.StatusCode.newBuilder().setValue(LocationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasOperationalStatus()) {
      protoValue.setOperationalStatus(operationalStatus.toProto())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasAlias()) {
      protoValue.addAllAlias(alias.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasMode()) {
      protoValue.setMode(Location.ModeCode.newBuilder().setValue(LocationModeCode.Value.valueOf(mode.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasTelecom()) {
      protoValue.addAllTelecom(telecom.map { it.toProto() })
    }
    if (hasAddress()) {
      protoValue.setAddress(address.toProto())
    }
    if (hasPhysicalType()) {
      protoValue.setPhysicalType(physicalType.toProto())
    }
    if (hasPosition()) {
      protoValue.setPosition(position.toProto())
    }
    if (hasManagingOrganization()) {
      protoValue.setManagingOrganization(managingOrganization.toProto())
    }
    if (hasPartOf()) {
      protoValue.setPartOf(partOf.toProto())
    }
    if (hasHoursOfOperation()) {
      protoValue.addAllHoursOfOperation(hoursOfOperation.map { it.toProto() })
    }
    if (hasAvailabilityExceptions()) {
      protoValue.setAvailabilityExceptions(availabilityExceptionsElement.toProto())
    }
    if (hasEndpoint()) {
      protoValue.addAllEndpoint(endpoint.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Location.LocationPositionComponent.toProto():
      Location.Position {
    val protoValue = Location.Position.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasLongitude()) {
      protoValue.setLongitude(longitudeElement.toProto())
    }
    if (hasLatitude()) {
      protoValue.setLatitude(latitudeElement.toProto())
    }
    if (hasAltitude()) {
      protoValue.setAltitude(altitudeElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Location.LocationHoursOfOperationComponent.toProto():
      Location.HoursOfOperation {
    val protoValue = Location.HoursOfOperation.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDaysOfWeek()) {
      protoValue.addAllDaysOfWeek(daysOfWeek.map { Location.HoursOfOperation.DaysOfWeekCode.newBuilder().setValue(DaysOfWeekCode.Value.valueOf(it.value.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build() })
    }
    if (hasAllDay()) {
      protoValue.setAllDay(allDayElement.toProto())
    }
    if (hasOpeningTime()) {
      protoValue.setOpeningTime(openingTimeElement.toProto())
    }
    if (hasClosingTime()) {
      protoValue.setClosingTime(closingTimeElement.toProto())
    }
    return protoValue.build()
  }

  private fun Location.Position.toHapi(): org.hl7.fhir.r4.model.Location.LocationPositionComponent {
    val hapiValue = org.hl7.fhir.r4.model.Location.LocationPositionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasLongitude()) {
      hapiValue.setLongitudeElement(longitude.toHapi())
    }
    if (hasLatitude()) {
      hapiValue.setLatitudeElement(latitude.toHapi())
    }
    if (hasAltitude()) {
      hapiValue.setAltitudeElement(altitude.toHapi())
    }
    return hapiValue
  }

  private fun Location.HoursOfOperation.toHapi():
      org.hl7.fhir.r4.model.Location.LocationHoursOfOperationComponent {
    val hapiValue = org.hl7.fhir.r4.model.Location.LocationHoursOfOperationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (daysOfWeekCount > 0) {
      daysOfWeekList.forEach { hapiValue.addDaysOfWeek(org.hl7.fhir.r4.model.Location.DaysOfWeek.valueOf(it.value.name.hapiCodeCheck().replace("_", ""))) }
    }
    if (hasAllDay()) {
      hapiValue.setAllDayElement(allDay.toHapi())
    }
    if (hasOpeningTime()) {
      hapiValue.setOpeningTimeElement(openingTime.toHapi())
    }
    if (hasClosingTime()) {
      hapiValue.setClosingTimeElement(closingTime.toHapi())
    }
    return hapiValue
  }
}
