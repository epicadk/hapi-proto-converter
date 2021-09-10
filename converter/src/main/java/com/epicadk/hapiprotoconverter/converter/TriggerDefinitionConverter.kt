package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.DataRequirementConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DataRequirementConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExpressionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExpressionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toProto
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.TriggerDefinition
import com.google.fhir.r4.core.TriggerTypeCode
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.DateType
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.Timing
import org.hl7.fhir.r4.model.Type

public object TriggerDefinitionConverter {
  private fun TriggerDefinition.TimingX.triggerDefinitionTimingToHapi(): Type {
    if (hasTiming()) {
      return (this.getTiming()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for TriggerDefinition.timing[x]")
  }

  private fun Type.triggerDefinitionTimingToProto(): TriggerDefinition.TimingX {
    val protoValue = TriggerDefinition.TimingX.newBuilder()
    if (this is Timing) {
      protoValue.setTiming(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    return protoValue.build()
  }

  public fun TriggerDefinition.toHapi(): org.hl7.fhir.r4.model.TriggerDefinition {
    val hapiValue = org.hl7.fhir.r4.model.TriggerDefinition()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(org.hl7.fhir.r4.model.TriggerDefinition.TriggerType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasTiming()) {
      hapiValue.setTiming(timing.triggerDefinitionTimingToHapi())
    }
    if (dataCount > 0) {
      hapiValue.setData(dataList.map { it.toHapi() })
    }
    if (hasCondition()) {
      hapiValue.setCondition(condition.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.TriggerDefinition.toProto(): TriggerDefinition {
    val protoValue = TriggerDefinition.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.setType(TriggerDefinition.TypeCode.newBuilder().setValue(TriggerTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasTiming()) {
      protoValue.setTiming(timing.triggerDefinitionTimingToProto())
    }
    if (hasData()) {
      protoValue.addAllData(data.map { it.toProto() })
    }
    if (hasCondition()) {
      protoValue.setCondition(condition.toProto())
    }
    return protoValue.build()
  }
}
