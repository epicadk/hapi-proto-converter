// contains functions that convert between the hapi and proto representations of uuid
package com.epicadk.hapiprotoconverter.converter

import com.google.fhir.r4.core.Uuid
import org.hl7.fhir.r4.model.UuidType

public object UuidConverter {
  /**
   * returns the proto Uuid equivalent of the hapi UuidType
   */
  public fun UuidType.toProto(): Uuid {
    val protoValue = Uuid.newBuilder()
    if (hasValue()) protoValue.setValue(value)
    return protoValue.build()
  }

  /**
   * returns the hapi UuidType equivalent of the proto Uuid
   */
  public fun Uuid.toHapi(): UuidType {
    val hapiValue = UuidType()
    hapiValue.value = value
    return hapiValue
  }
}
