// contains functions that convert between the hapi and proto representations of decimal
package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.Decimal
import org.hl7.fhir.r4.model.DecimalType

public object DecimalConverter {
  /**
   * returns the proto Decimal equivalent of the hapi DecimalType
   */
  public fun DecimalType.toProto(): Decimal {
    val protoValue = Decimal.newBuilder()
    if (hasValue()) protoValue.setValue(valueAsString)
    if (hasExtension()) protoValue.addAllExtension(extension.map { it.toProto() })
    return protoValue.build()
  }

  /**
   * returns the hapi DecimalType equivalent of the proto Decimal
   */
  public fun Decimal.toHapi(): DecimalType {
    val hapiValue = DecimalType()
    hapiValue.valueAsString = value
    if (extensionCount > 0) hapiValue.setExtension(extensionList.map { it.toHapi() })
    return hapiValue
  }
}
