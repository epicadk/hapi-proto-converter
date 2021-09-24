// contains functions that convert between the hapi and proto representations of uri
package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.Uri
import org.hl7.fhir.r4.model.UriType

public object UriConverter {
  /**
   * returns the proto Uri equivalent of the hapi UriType
   */
  public fun UriType.toProto(): Uri {
    val protoValue = Uri.newBuilder()
    if (hasValue()) protoValue.setValue(value)
    if (hasExtension()) protoValue.addAllExtension(extension.map { it.toProto() })
    return protoValue.build()
  }

  /**
   * returns the hapi UriType equivalent of the proto Uri
   */
  public fun Uri.toHapi(): UriType {
    val hapiValue = UriType()
    hapiValue.value = value
    if (extensionCount > 0) hapiValue.setExtension(extensionList.map { it.toHapi() })
    return hapiValue
  }
}
