// contains functions that convert between the hapi and proto representations of integer
package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.Integer
import org.hl7.fhir.r4.model.IntegerType

public object IntegerConverter {
  /**
   * returns the proto Integer equivalent of the hapi IntegerType
   */
  public fun IntegerType.toProto(): Integer {
    val protoValue = Integer.newBuilder()
    if (hasValue()) protoValue.setValue(value)
    if (hasExtension()) protoValue.addAllExtension(extension.map { it.toProto() })
    return protoValue.build()
  }

  /**
   * returns the hapi IntegerType equivalent of the proto Integer
   */
  public fun Integer.toHapi(): IntegerType {
    val hapiValue = IntegerType()
    hapiValue.value = value
    if (extensionCount > 0) hapiValue.setExtension(extensionList.map { it.toHapi() })
    return hapiValue
  }
}
