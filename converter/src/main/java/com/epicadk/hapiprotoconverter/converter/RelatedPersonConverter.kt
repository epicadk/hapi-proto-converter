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
import com.google.fhir.r4.core.RelatedPerson
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.Enumerations

public object RelatedPersonConverter {
  public fun RelatedPerson.toHapi(): org.hl7.fhir.r4.model.RelatedPerson {
    val hapiValue = org.hl7.fhir.r4.model.RelatedPerson()
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
    if (hasPatient()) {
      hapiValue.setPatient(patient.toHapi())
    }
    if (relationshipCount > 0) {
      hapiValue.setRelationship(relationshipList.map { it.toHapi() })
    }
    if (nameCount > 0) {
      hapiValue.setName(nameList.map { it.toHapi() })
    }
    if (telecomCount > 0) {
      hapiValue.setTelecom(telecomList.map { it.toHapi() })
    }
    if (hasGender()) {
      hapiValue.setGender(Enumerations.AdministrativeGender.valueOf(gender.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasBirthDate()) {
      hapiValue.setBirthDateElement(birthDate.toHapi())
    }
    if (addressCount > 0) {
      hapiValue.setAddress(addressList.map { it.toHapi() })
    }
    if (photoCount > 0) {
      hapiValue.setPhoto(photoList.map { it.toHapi() })
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    if (communicationCount > 0) {
      hapiValue.setCommunication(communicationList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.RelatedPerson.toProto(): RelatedPerson {
    val protoValue = RelatedPerson.newBuilder()
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
    if (hasPatient()) {
      protoValue.setPatient(patient.toProto())
    }
    if (hasRelationship()) {
      protoValue.addAllRelationship(relationship.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.addAllName(name.map { it.toProto() })
    }
    if (hasTelecom()) {
      protoValue.addAllTelecom(telecom.map { it.toProto() })
    }
    if (hasGender()) {
      protoValue.setGender(RelatedPerson.GenderCode.newBuilder().setValue(AdministrativeGenderCode.Value.valueOf(gender.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasBirthDate()) {
      protoValue.setBirthDate(birthDateElement.toProto())
    }
    if (hasAddress()) {
      protoValue.addAllAddress(address.map { it.toProto() })
    }
    if (hasPhoto()) {
      protoValue.addAllPhoto(photo.map { it.toProto() })
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    if (hasCommunication()) {
      protoValue.addAllCommunication(communication.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.RelatedPerson.RelatedPersonCommunicationComponent.toProto():
      RelatedPerson.Communication {
    val protoValue = RelatedPerson.Communication.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasLanguage()) {
      protoValue.setLanguage(language.toProto())
    }
    if (hasPreferred()) {
      protoValue.setPreferred(preferredElement.toProto())
    }
    return protoValue.build()
  }

  private fun RelatedPerson.Communication.toHapi():
      org.hl7.fhir.r4.model.RelatedPerson.RelatedPersonCommunicationComponent {
    val hapiValue = org.hl7.fhir.r4.model.RelatedPerson.RelatedPersonCommunicationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasLanguage()) {
      hapiValue.setLanguage(language.toHapi())
    }
    if (hasPreferred()) {
      hapiValue.setPreferredElement(preferred.toHapi())
    }
    return hapiValue
  }
}
