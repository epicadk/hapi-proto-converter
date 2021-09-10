package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.DeviceMetric
import com.google.fhir.r4.core.DeviceMetric.Calibration
import com.google.fhir.r4.core.DeviceMetricCalibrationStateCode
import com.google.fhir.r4.core.DeviceMetricCalibrationTypeCode
import com.google.fhir.r4.core.DeviceMetricCategoryCode
import com.google.fhir.r4.core.DeviceMetricColorCode
import com.google.fhir.r4.core.DeviceMetricOperationalStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String

public object DeviceMetricConverter {
  public fun DeviceMetric.toHapi(): org.hl7.fhir.r4.model.DeviceMetric {
    val hapiValue = org.hl7.fhir.r4.model.DeviceMetric()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (hasMeta()) {
      hapiValue.setMeta(meta.toHapi())
    }
    if (hasImplicitRules()) {
      hapiValue.setImplicitRulesElement(implicitRules.toHapi())
    }
    if (hasText()) {
      hapiValue.setText(text.toHapi())
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (identifierCount > 0) {
      hapiValue.setIdentifier(identifierList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasUnit()) {
      hapiValue.setUnit(unit.toHapi())
    }
    if (hasSource()) {
      hapiValue.setSource(source.toHapi())
    }
    if (hasParent()) {
      hapiValue.setParent(parent.toHapi())
    }
    if (hasOperationalStatus()) {
      hapiValue.setOperationalStatus(org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricOperationalStatus.valueOf(operationalStatus.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasColor()) {
      hapiValue.setColor(org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricColor.valueOf(color.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCategory()) {
      hapiValue.setCategory(org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCategory.valueOf(category.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasMeasurementPeriod()) {
      hapiValue.setMeasurementPeriod(measurementPeriod.toHapi())
    }
    if (calibrationCount > 0) {
      hapiValue.setCalibration(calibrationList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.DeviceMetric.toProto(): DeviceMetric {
    val protoValue = DeviceMetric.newBuilder()
    if (hasId()) {
      protoValue.setId(Id.newBuilder().setValue(id))
    }
    if (hasMeta()) {
      protoValue.setMeta(meta.toProto())
    }
    if (hasImplicitRules()) {
      protoValue.setImplicitRules(implicitRulesElement.toProto())
    }
    if (hasText()) {
      protoValue.setText(text.toProto())
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasIdentifier()) {
      protoValue.addAllIdentifier(identifier.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasUnit()) {
      protoValue.setUnit(unit.toProto())
    }
    if (hasSource()) {
      protoValue.setSource(source.toProto())
    }
    if (hasParent()) {
      protoValue.setParent(parent.toProto())
    }
    if (hasOperationalStatus()) {
      protoValue.setOperationalStatus(DeviceMetric.OperationalStatusCode.newBuilder().setValue(DeviceMetricOperationalStatusCode.Value.valueOf(operationalStatus.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasColor()) {
      protoValue.setColor(DeviceMetric.ColorCode.newBuilder().setValue(DeviceMetricColorCode.Value.valueOf(color.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCategory()) {
      protoValue.setCategory(DeviceMetric.CategoryCode.newBuilder().setValue(DeviceMetricCategoryCode.Value.valueOf(category.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasMeasurementPeriod()) {
      protoValue.setMeasurementPeriod(measurementPeriod.toProto())
    }
    if (hasCalibration()) {
      protoValue.addAllCalibration(calibration.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationComponent.toProto():
      DeviceMetric.Calibration {
    val protoValue = DeviceMetric.Calibration.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.setType(DeviceMetric.Calibration.TypeCode.newBuilder().setValue(DeviceMetricCalibrationTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasState()) {
      protoValue.setState(DeviceMetric.Calibration.StateCode.newBuilder().setValue(DeviceMetricCalibrationStateCode.Value.valueOf(state.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasTime()) {
      protoValue.setTime(timeElement.toProto())
    }
    return protoValue.build()
  }

  private fun DeviceMetric.Calibration.toHapi():
      org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationComponent {
    val hapiValue = org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasState()) {
      hapiValue.setState(org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationState.valueOf(state.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasTime()) {
      hapiValue.setTimeElement(time.toHapi())
    }
    return hapiValue
  }
}
