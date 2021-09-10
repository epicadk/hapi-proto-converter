// contains functions that convert between the hapi and proto representations of string
package com.epicadk.hapiprotoconverter.converter

import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.StringType

public object StringConverter {
  /**
   * returns the proto String equivalent of the hapi StringType
   */
  public fun StringType.toProto(): String {
    val protoValue = String.newBuilder()
    if (hasValue()) protoValue.setValue(value)
    return protoValue.build()
  }

  /**
   * returns the hapi StringType equivalent of the proto String
   */
  public fun String.toHapi(): StringType {
    val hapiValue = StringType()
    hapiValue.value = value
    return hapiValue
  }
}
