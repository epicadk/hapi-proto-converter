package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Coding
import com.google.fhir.r4.core.String

public object CodingConverter {
  public fun Coding.toHapi(): org.hl7.fhir.r4.model.Coding {
    val hapiValue = org.hl7.fhir.r4.model.Coding()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasSystem()) {
      hapiValue.setSystemElement(system.toHapi())
    }
    if (hasVersion()) {
      hapiValue.setVersionElement(version.toHapi())
    }
    if (hasCode()) {
      hapiValue.setCodeElement(code.toHapi())
    }
    if (hasDisplay()) {
      hapiValue.setDisplayElement(display.toHapi())
    }
    if (hasUserSelected()) {
      hapiValue.setUserSelectedElement(userSelected.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Coding.toProto(): Coding {
    val protoValue = Coding.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasSystem()) {
      protoValue.setSystem(systemElement.toProto())
    }
    if (hasVersion()) {
      protoValue.setVersion(versionElement.toProto())
    }
    if (hasCode()) {
      protoValue.setCode(codeElement.toProto())
    }
    if (hasDisplay()) {
      protoValue.setDisplay(displayElement.toProto())
    }
    if (hasUserSelected()) {
      protoValue.setUserSelected(userSelectedElement.toProto())
    }
    return protoValue.build()
  }
}
