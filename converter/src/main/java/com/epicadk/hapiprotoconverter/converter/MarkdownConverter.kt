// contains functions that convert between the hapi and proto representations of markdown
package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.Markdown
import org.hl7.fhir.r4.model.MarkdownType

public object MarkdownConverter {
  /**
   * returns the proto Markdown equivalent of the hapi MarkdownType
   */
  public fun MarkdownType.toProto(): Markdown {
    val protoValue = Markdown.newBuilder()
    if (hasValue()) protoValue.setValue(value)
    if (hasExtension()) protoValue.addAllExtension(extension.map { it.toProto() })
    return protoValue.build()
  }

  /**
   * returns the hapi MarkdownType equivalent of the proto Markdown
   */
  public fun Markdown.toHapi(): MarkdownType {
    val hapiValue = MarkdownType()
    hapiValue.value = value
    if (extensionCount > 0) hapiValue.setExtension(extensionList.map { it.toHapi() })
    return hapiValue
  }
}
