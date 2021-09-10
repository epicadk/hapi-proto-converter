package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.Narrative
import com.google.fhir.r4.core.NarrativeStatusCode
import com.google.fhir.r4.core.String

public object NarrativeConverter {
  public fun Narrative.toHapi(): org.hl7.fhir.r4.model.Narrative {
    val hapiValue = org.hl7.fhir.r4.model.Narrative()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.Narrative.NarrativeStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Narrative.toProto(): Narrative {
    val protoValue = Narrative.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(Narrative.StatusCode.newBuilder().setValue(NarrativeStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    return protoValue.build()
  }
}
