// contains functions that convert between the hapi and proto representations of oid
package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.Oid
import org.hl7.fhir.r4.model.OidType

public object OidConverter {
  /**
   * returns the proto Oid equivalent of the hapi OidType
   */
  public fun OidType.toProto(): Oid {
    val protoValue = Oid.newBuilder()
    if (hasValue()) protoValue.setValue(value)
    if (hasExtension()) protoValue.addAllExtension(extension.map { it.toProto() })
    return protoValue.build()
  }

  /**
   * returns the hapi OidType equivalent of the proto Oid
   */
  public fun Oid.toHapi(): OidType {
    val hapiValue = OidType()
    hapiValue.value = value
    if (extensionCount > 0) hapiValue.setExtension(extensionList.map { it.toHapi() })
    return hapiValue
  }
}
