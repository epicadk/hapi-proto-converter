package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AddressConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AddressConverter.toProto
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.AdministrativeGenderCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.IdentityAssuranceLevelCode
import com.google.fhir.r4.core.Person
import com.google.fhir.r4.core.Person.Link
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.Enumerations

public object PersonConverter {
  public fun Person.toHapi(): org.hl7.fhir.r4.model.Person {
    val hapiValue = org.hl7.fhir.r4.model.Person()
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
    if (hasPhoto()) {
      hapiValue.setPhoto(photo.toHapi())
    }
    if (hasManagingOrganization()) {
      hapiValue.setManagingOrganization(managingOrganization.toHapi())
    }
    if (hasActive()) {
      hapiValue.setActiveElement(active.toHapi())
    }
    if (linkCount > 0) {
      hapiValue.setLink(linkList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Person.toProto(): Person {
    val protoValue = Person.newBuilder()
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
    if (hasName()) {
      protoValue.addAllName(name.map { it.toProto() })
    }
    if (hasTelecom()) {
      protoValue.addAllTelecom(telecom.map { it.toProto() })
    }
    if (hasGender()) {
      protoValue.setGender(Person.GenderCode.newBuilder().setValue(AdministrativeGenderCode.Value.valueOf(gender.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasBirthDate()) {
      protoValue.setBirthDate(birthDateElement.toProto())
    }
    if (hasAddress()) {
      protoValue.addAllAddress(address.map { it.toProto() })
    }
    if (hasPhoto()) {
      protoValue.setPhoto(photo.toProto())
    }
    if (hasManagingOrganization()) {
      protoValue.setManagingOrganization(managingOrganization.toProto())
    }
    if (hasActive()) {
      protoValue.setActive(activeElement.toProto())
    }
    if (hasLink()) {
      protoValue.addAllLink(link.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Person.PersonLinkComponent.toProto(): Person.Link {
    val protoValue = Person.Link.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasTarget()) {
      protoValue.setTarget(target.toProto())
    }
    if (hasAssurance()) {
      protoValue.setAssurance(Person.Link.AssuranceCode.newBuilder().setValue(IdentityAssuranceLevelCode.Value.valueOf(assurance.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    return protoValue.build()
  }

  private fun Person.Link.toHapi(): org.hl7.fhir.r4.model.Person.PersonLinkComponent {
    val hapiValue = org.hl7.fhir.r4.model.Person.PersonLinkComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasTarget()) {
      hapiValue.setTarget(target.toHapi())
    }
    if (hasAssurance()) {
      hapiValue.setAssurance(org.hl7.fhir.r4.model.Person.IdentityAssuranceLevel.valueOf(assurance.value.name.hapiCodeCheck().replace("_", "")))
    }
    return hapiValue
  }
}
