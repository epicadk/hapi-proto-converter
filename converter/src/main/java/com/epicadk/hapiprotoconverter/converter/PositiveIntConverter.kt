// contains functions that convert between the hapi and proto representations of positiveInt
package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.PositiveInt
import org.hl7.fhir.r4.model.PositiveIntType

public object PositiveIntConverter {
  /**
   * returns the proto PositiveInt equivalent of the hapi PositiveIntType
   */
  public fun PositiveIntType.toProto(): PositiveInt {
    val protoValue = PositiveInt.newBuilder()
    if (hasValue()) protoValue.setValue(value)
    if (hasExtension()) protoValue.addAllExtension(extension.map { it.toProto() })
    return protoValue.build()
  }

  /**
   * returns the hapi PositiveIntType equivalent of the proto PositiveInt
   */
  public fun PositiveInt.toHapi(): PositiveIntType {
    val hapiValue = PositiveIntType()
    hapiValue.value = value
    if (extensionCount > 0) hapiValue.setExtension(extensionList.map { it.toHapi() })
    return hapiValue
  }
}
