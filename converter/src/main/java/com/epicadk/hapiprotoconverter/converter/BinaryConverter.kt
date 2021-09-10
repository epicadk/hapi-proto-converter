package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.Base64BinaryConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.Base64BinaryConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Binary
import com.google.fhir.r4.core.Id

public object BinaryConverter {
  public fun Binary.toHapi(): org.hl7.fhir.r4.model.Binary {
    val hapiValue = org.hl7.fhir.r4.model.Binary()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (hasMeta()) {
      hapiValue.setMeta(meta.toHapi())
    }
    if (hasImplicitRules()) {
      hapiValue.setImplicitRulesElement(implicitRules.toHapi())
    }
    if (hasContentType()) {
      hapiValue.setContentType(contentType.value.hapiCodeCheck())
    }
    if (hasSecurityContext()) {
      hapiValue.setSecurityContext(securityContext.toHapi())
    }
    if (hasData()) {
      hapiValue.setDataElement(data.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Binary.toProto(): Binary {
    val protoValue = Binary.newBuilder()
    if (hasId()) {
      protoValue.setId(Id.newBuilder().setValue(id))
    }
    if (hasMeta()) {
      protoValue.setMeta(meta.toProto())
    }
    if (hasImplicitRules()) {
      protoValue.setImplicitRules(implicitRulesElement.toProto())
    }
    if (hasContentType()) {
      protoValue.setContentType(Binary.ContentTypeCode.newBuilder().setValue(contentType.protoCodeCheck()).build())
    }
    if (hasSecurityContext()) {
      protoValue.setSecurityContext(securityContext.toProto())
    }
    if (hasData()) {
      protoValue.setData(dataElement.toProto())
    }
    return protoValue.build()
  }
}
