// contains functions that convert between the hapi and proto representations of base64Binary
package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.Base64Binary
import com.google.fhir.shaded.protobuf.ByteString
import org.hl7.fhir.r4.model.Base64BinaryType

public object Base64BinaryConverter {
  /**
   * returns the proto Base64Binary equivalent of the hapi Base64BinaryType
   */
  public fun Base64BinaryType.toProto(): Base64Binary {
    val protoValue = Base64Binary.newBuilder()
    if (hasValue()) protoValue.setValue(ByteString.copyFromUtf8(valueAsString))
    if (hasExtension()) protoValue.addAllExtension(extension.map { it.toProto() })
    return protoValue.build()
  }

  /**
   * returns the hapi Base64BinaryType equivalent of the proto Base64Binary
   */
  public fun Base64Binary.toHapi(): Base64BinaryType {
    val hapiValue = Base64BinaryType()
    hapiValue.valueAsString = value.toStringUtf8()
    if (extensionCount > 0) hapiValue.setExtension(extensionList.map { it.toHapi() })
    return hapiValue
  }
}
