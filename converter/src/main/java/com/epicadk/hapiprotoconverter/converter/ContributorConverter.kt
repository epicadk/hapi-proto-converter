package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.google.fhir.r4.core.Contributor
import com.google.fhir.r4.core.ContributorTypeCode
import com.google.fhir.r4.core.String

public object ContributorConverter {
  public fun Contributor.toHapi(): org.hl7.fhir.r4.model.Contributor {
    val hapiValue = org.hl7.fhir.r4.model.Contributor()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(org.hl7.fhir.r4.model.Contributor.ContributorType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (contactCount > 0) {
      hapiValue.setContact(contactList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Contributor.toProto(): Contributor {
    val protoValue = Contributor.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.setType(Contributor.TypeCode.newBuilder().setValue(ContributorTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasContact()) {
      protoValue.addAllContact(contact.map { it.toProto() })
    }
    return protoValue.build()
  }
}
