// contains functions that convert between the hapi and proto representations of url
package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.Url
import org.hl7.fhir.r4.model.UrlType

public object UrlConverter {
  /**
   * returns the proto Url equivalent of the hapi UrlType
   */
  public fun UrlType.toProto(): Url {
    val protoValue = Url.newBuilder()
    if (hasValue()) protoValue.setValue(value)
    if (hasExtension()) protoValue.addAllExtension(extension.map { it.toProto() })
    return protoValue.build()
  }

  /**
   * returns the hapi UrlType equivalent of the proto Url
   */
  public fun Url.toHapi(): UrlType {
    val hapiValue = UrlType()
    hapiValue.value = value
    if (extensionCount > 0) hapiValue.setExtension(extensionList.map { it.toHapi() })
    return hapiValue
  }
}
