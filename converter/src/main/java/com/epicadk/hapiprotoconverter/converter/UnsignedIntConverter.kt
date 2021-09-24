// contains functions that convert between the hapi and proto representations of unsignedInt
package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.UnsignedInt
import org.hl7.fhir.r4.model.UnsignedIntType

public object UnsignedIntConverter {
  /**
   * returns the proto UnsignedInt equivalent of the hapi UnsignedIntType
   */
  public fun UnsignedIntType.toProto(): UnsignedInt {
    val protoValue = UnsignedInt.newBuilder()
    if (hasValue()) protoValue.setValue(value)
    if (hasExtension()) protoValue.addAllExtension(extension.map { it.toProto() })
    return protoValue.build()
  }

  /**
   * returns the hapi UnsignedIntType equivalent of the proto UnsignedInt
   */
  public fun UnsignedInt.toHapi(): UnsignedIntType {
    val hapiValue = UnsignedIntType()
    hapiValue.value = value
    if (extensionCount > 0) hapiValue.setExtension(extensionList.map { it.toHapi() })
    return hapiValue
  }
}
