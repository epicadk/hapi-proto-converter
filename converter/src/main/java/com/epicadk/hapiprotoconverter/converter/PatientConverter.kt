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
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.HumanNameConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.HumanNameConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toProto
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
import com.google.fhir.r4.core.LinkTypeCode
import com.google.fhir.r4.core.Patient
import com.google.fhir.r4.core.Patient.Contact
import com.google.fhir.r4.core.Patient.Link
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Enumerations
import org.hl7.fhir.r4.model.IntegerType
import org.hl7.fhir.r4.model.Type

public object PatientConverter {
  private fun Patient.DeceasedX.patientDeceasedToHapi(): Type {
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Patient.deceased[x]")
  }

  private fun Type.patientDeceasedToProto(): Patient.DeceasedX {
    val protoValue = Patient.DeceasedX.newBuilder()
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    return protoValue.build()
  }

  private fun Patient.MultipleBirthX.patientMultipleBirthToHapi(): Type {
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasInteger()) {
      return (this.getInteger()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Patient.multipleBirth[x]")
  }

  private fun Type.patientMultipleBirthToProto(): Patient.MultipleBirthX {
    val protoValue = Patient.MultipleBirthX.newBuilder()
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is IntegerType) {
      protoValue.setInteger(this.toProto())
    }
    return protoValue.build()
  }

  public fun Patient.toHapi(): org.hl7.fhir.r4.model.Patient {
    val hapiValue = org.hl7.fhir.r4.model.Patient()
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
    if (hasGender()) {
      hapiValue.setGender(Enumerations.AdministrativeGender.valueOf(gender.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasBirthDate()) {
      hapiValue.setBirthDateElement(birthDate.toHapi())
    }
    if (hasDeceased()) {
      hapiValue.setDeceased(deceased.patientDeceasedToHapi())
    }
    if (addressCount > 0) {
      hapiValue.setAddress(addressList.map { it.toHapi() })
    }
    if (hasMaritalStatus()) {
      hapiValue.setMaritalStatus(maritalStatus.toHapi())
    }
    if (hasMultipleBirth()) {
      hapiValue.setMultipleBirth(multipleBirth.patientMultipleBirthToHapi())
    }
    if (photoCount > 0) {
      hapiValue.setPhoto(photoList.map { it.toHapi() })
    }
    if (contactCount > 0) {
      hapiValue.setContact(contactList.map { it.toHapi() })
    }
    if (communicationCount > 0) {
      hapiValue.setCommunication(communicationList.map { it.toHapi() })
    }
    if (generalPractitionerCount > 0) {
      hapiValue.setGeneralPractitioner(generalPractitionerList.map { it.toHapi() })
    }
    if (hasManagingOrganization()) {
      hapiValue.setManagingOrganization(managingOrganization.toHapi())
    }
    if (linkCount > 0) {
      hapiValue.setLink(linkList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Patient.toProto(): Patient {
    val protoValue = Patient.newBuilder()
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
    if (hasGender()) {
      protoValue.setGender(Patient.GenderCode.newBuilder().setValue(AdministrativeGenderCode.Value.valueOf(gender.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasBirthDate()) {
      protoValue.setBirthDate(birthDateElement.toProto())
    }
    if (hasDeceased()) {
      protoValue.setDeceased(deceased.patientDeceasedToProto())
    }
    if (hasAddress()) {
      protoValue.addAllAddress(address.map { it.toProto() })
    }
    if (hasMaritalStatus()) {
      protoValue.setMaritalStatus(maritalStatus.toProto())
    }
    if (hasMultipleBirth()) {
      protoValue.setMultipleBirth(multipleBirth.patientMultipleBirthToProto())
    }
    if (hasPhoto()) {
      protoValue.addAllPhoto(photo.map { it.toProto() })
    }
    if (hasContact()) {
      protoValue.addAllContact(contact.map { it.toProto() })
    }
    if (hasCommunication()) {
      protoValue.addAllCommunication(communication.map { it.toProto() })
    }
    if (hasGeneralPractitioner()) {
      protoValue.addAllGeneralPractitioner(generalPractitioner.map { it.toProto() })
    }
    if (hasManagingOrganization()) {
      protoValue.setManagingOrganization(managingOrganization.toProto())
    }
    if (hasLink()) {
      protoValue.addAllLink(link.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Patient.ContactComponent.toProto(): Patient.Contact {
    val protoValue = Patient.Contact.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasRelationship()) {
      protoValue.addAllRelationship(relationship.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.setName(name.toProto())
    }
    if (hasTelecom()) {
      protoValue.addAllTelecom(telecom.map { it.toProto() })
    }
    if (hasAddress()) {
      protoValue.setAddress(address.toProto())
    }
    if (hasGender()) {
      protoValue.setGender(Patient.Contact.GenderCode.newBuilder().setValue(AdministrativeGenderCode.Value.valueOf(gender.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasOrganization()) {
      protoValue.setOrganization(organization.toProto())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent.toProto():
      Patient.Communication {
    val protoValue = Patient.Communication.newBuilder()
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

  private fun org.hl7.fhir.r4.model.Patient.PatientLinkComponent.toProto(): Patient.Link {
    val protoValue = Patient.Link.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasOther()) {
      protoValue.setOther(other.toProto())
    }
    if (hasType()) {
      protoValue.setType(Patient.Link.TypeCode.newBuilder().setValue(LinkTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    return protoValue.build()
  }

  private fun Patient.Contact.toHapi(): org.hl7.fhir.r4.model.Patient.ContactComponent {
    val hapiValue = org.hl7.fhir.r4.model.Patient.ContactComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (relationshipCount > 0) {
      hapiValue.setRelationship(relationshipList.map { it.toHapi() })
    }
    if (hasName()) {
      hapiValue.setName(name.toHapi())
    }
    if (telecomCount > 0) {
      hapiValue.setTelecom(telecomList.map { it.toHapi() })
    }
    if (hasAddress()) {
      hapiValue.setAddress(address.toHapi())
    }
    if (hasGender()) {
      hapiValue.setGender(Enumerations.AdministrativeGender.valueOf(gender.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasOrganization()) {
      hapiValue.setOrganization(organization.toHapi())
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    return hapiValue
  }

  private fun Patient.Communication.toHapi():
      org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent {
    val hapiValue = org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent()
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

  private fun Patient.Link.toHapi(): org.hl7.fhir.r4.model.Patient.PatientLinkComponent {
    val hapiValue = org.hl7.fhir.r4.model.Patient.PatientLinkComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasOther()) {
      hapiValue.setOther(other.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(org.hl7.fhir.r4.model.Patient.LinkType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    return hapiValue
  }
}
