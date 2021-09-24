// contains functions that convert between the hapi and proto representations of boolean
package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.Boolean
import org.hl7.fhir.r4.model.BooleanType

public object BooleanConverter {
  /**
   * returns the proto Boolean equivalent of the hapi BooleanType
   */
  public fun BooleanType.toProto(): Boolean {
    val protoValue = Boolean.newBuilder()
    if (hasValue()) protoValue.setValue(value)
    if (hasExtension()) protoValue.addAllExtension(extension.map { it.toProto() })
    return protoValue.build()
  }

  /**
   * returns the hapi BooleanType equivalent of the proto Boolean
   */
  public fun Boolean.toHapi(): BooleanType {
    val hapiValue = BooleanType()
    hapiValue.value = value
    if (extensionCount > 0) hapiValue.setExtension(extensionList.map { it.toHapi() })
    return hapiValue
  }
}
