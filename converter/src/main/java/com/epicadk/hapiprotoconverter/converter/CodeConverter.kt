// contains functions that convert between the hapi and proto representations of code
package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.Code
import org.hl7.fhir.r4.model.CodeType

public object CodeConverter {
  /**
   * returns the proto Code equivalent of the hapi CodeType
   */
  public fun CodeType.toProto(): Code {
    val protoValue = Code.newBuilder()
    if (hasValue()) protoValue.setValue(value)
    if (hasExtension()) protoValue.addAllExtension(extension.map { it.toProto() })
    return protoValue.build()
  }

  /**
   * returns the hapi CodeType equivalent of the proto Code
   */
  public fun Code.toHapi(): CodeType {
    val hapiValue = CodeType()
    hapiValue.value = value
    if (extensionCount > 0) hapiValue.setExtension(extensionList.map { it.toHapi() })
    return hapiValue
  }
}
