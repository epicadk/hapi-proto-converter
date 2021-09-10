package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UrlConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UrlConverter.toProto
import com.google.fhir.r4.core.RelatedArtifact
import com.google.fhir.r4.core.RelatedArtifactTypeCode
import com.google.fhir.r4.core.String

public object RelatedArtifactConverter {
  public fun RelatedArtifact.toHapi(): org.hl7.fhir.r4.model.RelatedArtifact {
    val hapiValue = org.hl7.fhir.r4.model.RelatedArtifact()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasLabel()) {
      hapiValue.setLabelElement(label.toHapi())
    }
    if (hasDisplay()) {
      hapiValue.setDisplayElement(display.toHapi())
    }
    if (hasCitation()) {
      hapiValue.setCitationElement(citation.toHapi())
    }
    if (hasUrl()) {
      hapiValue.setUrlElement(url.toHapi())
    }
    if (hasDocument()) {
      hapiValue.setDocument(document.toHapi())
    }
    if (hasResource()) {
      hapiValue.setResourceElement(resource.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.RelatedArtifact.toProto(): RelatedArtifact {
    val protoValue = RelatedArtifact.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.setType(RelatedArtifact.TypeCode.newBuilder().setValue(RelatedArtifactTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasLabel()) {
      protoValue.setLabel(labelElement.toProto())
    }
    if (hasDisplay()) {
      protoValue.setDisplay(displayElement.toProto())
    }
    if (hasCitation()) {
      protoValue.setCitation(citationElement.toProto())
    }
    if (hasUrl()) {
      protoValue.setUrl(urlElement.toProto())
    }
    if (hasDocument()) {
      protoValue.setDocument(document.toProto())
    }
    if (hasResource()) {
      protoValue.setResource(resourceElement.toProto())
    }
    return protoValue.build()
  }
}
