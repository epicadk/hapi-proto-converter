package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.google.fhir.r4.core.Annotation
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object AnnotationConverter {
  private fun Annotation.AuthorX.annotationAuthorToHapi(): Type {
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Annotation.author[x]")
  }

  private fun Type.annotationAuthorToProto(): Annotation.AuthorX {
    val protoValue = Annotation.AuthorX.newBuilder()
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  public fun Annotation.toHapi(): org.hl7.fhir.r4.model.Annotation {
    val hapiValue = org.hl7.fhir.r4.model.Annotation()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasAuthor()) {
      hapiValue.setAuthor(author.annotationAuthorToHapi())
    }
    if (hasTime()) {
      hapiValue.setTimeElement(time.toHapi())
    }
    if (hasText()) {
      hapiValue.setTextElement(text.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Annotation.toProto(): Annotation {
    val protoValue = Annotation.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasAuthor()) {
      protoValue.setAuthor(author.annotationAuthorToProto())
    }
    if (hasTime()) {
      protoValue.setTime(timeElement.toProto())
    }
    if (hasText()) {
      protoValue.setText(textElement.toProto())
    }
    return protoValue.build()
  }
}
