package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.Base64BinaryConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.Base64BinaryConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UrlConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UrlConverter.toProto
import com.google.fhir.r4.core.Attachment
import com.google.fhir.r4.core.String

public object AttachmentConverter {
  public fun Attachment.toHapi(): org.hl7.fhir.r4.model.Attachment {
    val hapiValue = org.hl7.fhir.r4.model.Attachment()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasContentType()) {
      hapiValue.setContentType(contentType.value.hapiCodeCheck())
    }
    if (hasData()) {
      hapiValue.setDataElement(data.toHapi())
    }
    if (hasUrl()) {
      hapiValue.setUrlElement(url.toHapi())
    }
    if (hasSize()) {
      hapiValue.setSizeElement(size.toHapi())
    }
    if (hasHash()) {
      hapiValue.setHashElement(hash.toHapi())
    }
    if (hasTitle()) {
      hapiValue.setTitleElement(title.toHapi())
    }
    if (hasCreation()) {
      hapiValue.setCreationElement(creation.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Attachment.toProto(): Attachment {
    val protoValue = Attachment.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasContentType()) {
      protoValue.setContentType(Attachment.ContentTypeCode.newBuilder().setValue(contentType.protoCodeCheck()).build())
    }
    if (hasData()) {
      protoValue.setData(dataElement.toProto())
    }
    if (hasUrl()) {
      protoValue.setUrl(urlElement.toProto())
    }
    if (hasSize()) {
      protoValue.setSize(sizeElement.toProto())
    }
    if (hasHash()) {
      protoValue.setHash(hashElement.toProto())
    }
    if (hasTitle()) {
      protoValue.setTitle(titleElement.toProto())
    }
    if (hasCreation()) {
      protoValue.setCreation(creationElement.toProto())
    }
    return protoValue.build()
  }
}
