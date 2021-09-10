package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdConverter.toProto
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Meta
import com.google.fhir.r4.core.String

public object MetaConverter {
  public fun Meta.toHapi(): org.hl7.fhir.r4.model.Meta {
    val hapiValue = org.hl7.fhir.r4.model.Meta()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasVersionId()) {
      hapiValue.setVersionIdElement(versionId.toHapi())
    }
    if (hasLastUpdated()) {
      hapiValue.setLastUpdatedElement(lastUpdated.toHapi())
    }
    if (hasSource()) {
      hapiValue.setSourceElement(source.toHapi())
    }
    if (profileCount > 0) {
      hapiValue.setProfile(profileList.map { it.toHapi() })
    }
    if (securityCount > 0) {
      hapiValue.setSecurity(securityList.map { it.toHapi() })
    }
    if (tagCount > 0) {
      hapiValue.setTag(tagList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Meta.toProto(): Meta {
    val protoValue = Meta.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasVersionId()) {
      protoValue.setVersionId(versionIdElement.toProto())
    }
    if (hasLastUpdated()) {
      protoValue.setLastUpdated(lastUpdatedElement.toProto())
    }
    if (hasSource()) {
      protoValue.setSource(sourceElement.toProto())
    }
    if (hasProfile()) {
      protoValue.addAllProfile(profile.map { it.toProto() })
    }
    if (hasSecurity()) {
      protoValue.addAllSecurity(security.map { it.toProto() })
    }
    if (hasTag()) {
      protoValue.addAllTag(tag.map { it.toProto() })
    }
    return protoValue.build()
  }
}
