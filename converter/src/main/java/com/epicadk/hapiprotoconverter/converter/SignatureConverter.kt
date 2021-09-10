package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.Base64BinaryConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.Base64BinaryConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.google.fhir.r4.core.Signature
import com.google.fhir.r4.core.String

public object SignatureConverter {
  public fun Signature.toHapi(): org.hl7.fhir.r4.model.Signature {
    val hapiValue = org.hl7.fhir.r4.model.Signature()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (typeCount > 0) {
      hapiValue.setType(typeList.map { it.toHapi() })
    }
    if (hasWhen()) {
      hapiValue.setWhenElement(`when`.toHapi())
    }
    if (hasWho()) {
      hapiValue.setWho(who.toHapi())
    }
    if (hasOnBehalfOf()) {
      hapiValue.setOnBehalfOf(onBehalfOf.toHapi())
    }
    if (hasTargetFormat()) {
      hapiValue.setTargetFormat(targetFormat.value.hapiCodeCheck())
    }
    if (hasSigFormat()) {
      hapiValue.setSigFormat(sigFormat.value.hapiCodeCheck())
    }
    if (hasData()) {
      hapiValue.setDataElement(data.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Signature.toProto(): Signature {
    val protoValue = Signature.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasWhen()) {
      protoValue.setWhen(whenElement.toProto())
    }
    if (hasWho()) {
      protoValue.setWho(who.toProto())
    }
    if (hasOnBehalfOf()) {
      protoValue.setOnBehalfOf(onBehalfOf.toProto())
    }
    if (hasTargetFormat()) {
      protoValue.setTargetFormat(Signature.TargetFormatCode.newBuilder().setValue(targetFormat.protoCodeCheck()).build())
    }
    if (hasSigFormat()) {
      protoValue.setSigFormat(Signature.SigFormatCode.newBuilder().setValue(sigFormat.protoCodeCheck()).build())
    }
    if (hasData()) {
      protoValue.setData(dataElement.toProto())
    }
    return protoValue.build()
  }
}
