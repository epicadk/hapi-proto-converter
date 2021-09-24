// contains functions that convert between the hapi and proto representations of canonical
package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.Canonical
import org.hl7.fhir.r4.model.CanonicalType

public object CanonicalConverter {
  /**
   * returns the proto Canonical equivalent of the hapi CanonicalType
   */
  public fun CanonicalType.toProto(): Canonical {
    val protoValue = Canonical.newBuilder()
    if (hasValue()) protoValue.setValue(value)
    if (hasExtension()) protoValue.addAllExtension(extension.map { it.toProto() })
    return protoValue.build()
  }

  /**
   * returns the hapi CanonicalType equivalent of the proto Canonical
   */
  public fun Canonical.toHapi(): CanonicalType {
    val hapiValue = CanonicalType()
    hapiValue.value = value
    if (extensionCount > 0) hapiValue.setExtension(extensionList.map { it.toHapi() })
    return hapiValue
  }
}
