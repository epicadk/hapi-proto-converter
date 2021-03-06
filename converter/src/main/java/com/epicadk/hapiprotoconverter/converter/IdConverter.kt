// contains functions that convert between the hapi and proto representations of id
package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.Id
import org.hl7.fhir.r4.model.IdType

public object IdConverter {
  /**
   * returns the proto Id equivalent of the hapi IdType
   */
  public fun IdType.toProto(): Id {
    val protoValue = Id.newBuilder()
    if (hasValue()) protoValue.setValue(value)
    if (hasExtension()) protoValue.addAllExtension(extension.map { it.toProto() })
    return protoValue.build()
  }

  /**
   * returns the hapi IdType equivalent of the proto Id
   */
  public fun Id.toHapi(): IdType {
    val hapiValue = IdType()
    hapiValue.value = value
    if (extensionCount > 0) hapiValue.setExtension(extensionList.map { it.toHapi() })
    return hapiValue
  }
}
