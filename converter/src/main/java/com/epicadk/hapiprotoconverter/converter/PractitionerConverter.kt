package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AddressConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AddressConverter.toProto
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.HumanNameConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.HumanNameConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.AdministrativeGenderCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Practitioner
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.Enumerations

public object PractitionerConverter {
  public fun Practitioner.toHapi(): org.hl7.fhir.r4.model.Practitioner {
    val hapiValue = org.hl7.fhir.r4.model.Practitioner()
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
    if (hasActive()) {
      hapiValue.setActiveElement(active.toHapi())
    }
    if (nameCount > 0) {
      hapiValue.setName(nameList.map { it.toHapi() })
    }
    if (telecomCount > 0) {
      hapiValue.setTelecom(telecomList.map { it.toHapi() })
    }
    if (addressCount > 0) {
      hapiValue.setAddress(addressList.map { it.toHapi() })
    }
    if (hasGender()) {
      hapiValue.setGender(Enumerations.AdministrativeGender.valueOf(gender.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasBirthDate()) {
      hapiValue.setBirthDateElement(birthDate.toHapi())
    }
    if (photoCount > 0) {
      hapiValue.setPhoto(photoList.map { it.toHapi() })
    }
    if (qualificationCount > 0) {
      hapiValue.setQualification(qualificationList.map { it.toHapi() })
    }
    if (communicationCount > 0) {
      hapiValue.setCommunication(communicationList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Practitioner.toProto(): Practitioner {
    val protoValue = Practitioner.newBuilder()
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
    if (hasActive()) {
      protoValue.setActive(activeElement.toProto())
    }
    if (hasName()) {
      protoValue.addAllName(name.map { it.toProto() })
    }
    if (hasTelecom()) {
      protoValue.addAllTelecom(telecom.map { it.toProto() })
    }
    if (hasAddress()) {
      protoValue.addAllAddress(address.map { it.toProto() })
    }
    if (hasGender()) {
      protoValue.setGender(Practitioner.GenderCode.newBuilder().setValue(AdministrativeGenderCode.Value.valueOf(gender.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasBirthDate()) {
      protoValue.setBirthDate(birthDateElement.toProto())
    }
    if (hasPhoto()) {
      protoValue.addAllPhoto(photo.map { it.toProto() })
    }
    if (hasQualification()) {
      protoValue.addAllQualification(qualification.map { it.toProto() })
    }
    if (hasCommunication()) {
      protoValue.addAllCommunication(communication.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Practitioner.PractitionerQualificationComponent.toProto():
      Practitioner.Qualification {
    val protoValue = Practitioner.Qualification.newBuilder()
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
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    if (hasIssuer()) {
      protoValue.setIssuer(issuer.toProto())
    }
    return protoValue.build()
  }

  private fun Practitioner.Qualification.toHapi():
      org.hl7.fhir.r4.model.Practitioner.PractitionerQualificationComponent {
    val hapiValue = org.hl7.fhir.r4.model.Practitioner.PractitionerQualificationComponent()
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
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    if (hasIssuer()) {
      hapiValue.setIssuer(issuer.toHapi())
    }
    return hapiValue
  }
}
