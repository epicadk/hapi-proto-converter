// contains functions that convert between the hapi and proto representations of unsignedInt
package com.epicadk.hapiprotoconverter.converter

import com.google.fhir.r4.core.UnsignedInt
import org.hl7.fhir.r4.model.UnsignedIntType

public object UnsignedIntConverter {
  /**
   * returns the proto UnsignedInt equivalent of the hapi UnsignedIntType
   */
  public fun UnsignedIntType.toProto(): UnsignedInt {
    val protoValue = UnsignedInt.newBuilder()
    if (hasValue()) protoValue.setValue(value)
    return protoValue.build()
  }

  /**
   * returns the hapi UnsignedIntType equivalent of the proto UnsignedInt
   */
  public fun UnsignedInt.toHapi(): UnsignedIntType {
    val hapiValue = UnsignedIntType()
    hapiValue.value = value
    return hapiValue
  }
}
