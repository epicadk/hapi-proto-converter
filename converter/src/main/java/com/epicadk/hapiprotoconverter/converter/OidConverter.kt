// contains functions that convert between the hapi and proto representations of oid
package com.epicadk.hapiprotoconverter.converter

import com.google.fhir.r4.core.Oid
import org.hl7.fhir.r4.model.OidType

public object OidConverter {
  /**
   * returns the proto Oid equivalent of the hapi OidType
   */
  public fun OidType.toProto(): Oid {
    val protoValue = Oid.newBuilder()
    if (hasValue()) protoValue.setValue(value)
    return protoValue.build()
  }

  /**
   * returns the hapi OidType equivalent of the proto Oid
   */
  public fun Oid.toHapi(): OidType {
    val hapiValue = OidType()
    hapiValue.value = value
    return hapiValue
  }
}
