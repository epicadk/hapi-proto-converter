package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toProto
import com.google.fhir.r4.core.DaysOfWeekCode
import com.google.fhir.r4.core.EventTimingValueSet
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.Timing
import com.google.fhir.r4.core.Timing.Repeat
import com.google.fhir.r4.core.UnitsOfTimeValueSet
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Duration
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.Type

public object TimingConverter {
  private fun Timing.Repeat.BoundsX.timingRepeatBoundsToHapi(): Type {
    if (hasDuration()) {
      return (this.getDuration()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Timing.repeat.bounds[x]")
  }

  private fun Type.timingRepeatBoundsToProto(): Timing.Repeat.BoundsX {
    val protoValue = Timing.Repeat.BoundsX.newBuilder()
    if (this is Duration) {
      protoValue.setDuration(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  public fun Timing.toHapi(): org.hl7.fhir.r4.model.Timing {
    val hapiValue = org.hl7.fhir.r4.model.Timing()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (eventCount > 0) {
      hapiValue.setEvent(eventList.map { it.toHapi() })
    }
    if (hasRepeat()) {
      hapiValue.setRepeat(repeat.toHapi())
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Timing.toProto(): Timing {
    val protoValue = Timing.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasEvent()) {
      protoValue.addAllEvent(event.map { it.toProto() })
    }
    if (hasRepeat()) {
      protoValue.setRepeat(repeat.toProto())
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Timing.TimingRepeatComponent.toProto(): Timing.Repeat {
    val protoValue = Timing.Repeat.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasBounds()) {
      protoValue.setBounds(bounds.timingRepeatBoundsToProto())
    }
    if (hasCount()) {
      protoValue.setCount(countElement.toProto())
    }
    if (hasCountMax()) {
      protoValue.setCountMax(countMaxElement.toProto())
    }
    if (hasDuration()) {
      protoValue.setDuration(durationElement.toProto())
    }
    if (hasDurationMax()) {
      protoValue.setDurationMax(durationMaxElement.toProto())
    }
    if (hasDurationUnit()) {
      protoValue.setDurationUnit(Timing.Repeat.DurationUnitCode.newBuilder().setValue(UnitsOfTimeValueSet.Value.valueOf(durationUnit.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasFrequency()) {
      protoValue.setFrequency(frequencyElement.toProto())
    }
    if (hasFrequencyMax()) {
      protoValue.setFrequencyMax(frequencyMaxElement.toProto())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(periodElement.toProto())
    }
    if (hasPeriodMax()) {
      protoValue.setPeriodMax(periodMaxElement.toProto())
    }
    if (hasPeriodUnit()) {
      protoValue.setPeriodUnit(Timing.Repeat.PeriodUnitCode.newBuilder().setValue(UnitsOfTimeValueSet.Value.valueOf(periodUnit.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDayOfWeek()) {
      protoValue.addAllDayOfWeek(dayOfWeek.map { Timing.Repeat.DayOfWeekCode.newBuilder().setValue(DaysOfWeekCode.Value.valueOf(it.value.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build() })
    }
    if (hasTimeOfDay()) {
      protoValue.addAllTimeOfDay(timeOfDay.map { it.toProto() })
    }
    if (hasWhen()) {
      protoValue.addAllWhen(`when`.map { Timing.Repeat.WhenCode.newBuilder().setValue(EventTimingValueSet.Value.valueOf(it.value.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build() })
    }
    if (hasOffset()) {
      protoValue.setOffset(offsetElement.toProto())
    }
    return protoValue.build()
  }

  private fun Timing.Repeat.toHapi(): org.hl7.fhir.r4.model.Timing.TimingRepeatComponent {
    val hapiValue = org.hl7.fhir.r4.model.Timing.TimingRepeatComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasBounds()) {
      hapiValue.setBounds(bounds.timingRepeatBoundsToHapi())
    }
    if (hasCount()) {
      hapiValue.setCountElement(count.toHapi())
    }
    if (hasCountMax()) {
      hapiValue.setCountMaxElement(countMax.toHapi())
    }
    if (hasDuration()) {
      hapiValue.setDurationElement(duration.toHapi())
    }
    if (hasDurationMax()) {
      hapiValue.setDurationMaxElement(durationMax.toHapi())
    }
    if (hasDurationUnit()) {
      hapiValue.setDurationUnit(org.hl7.fhir.r4.model.Timing.UnitsOfTime.valueOf(durationUnit.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasFrequency()) {
      hapiValue.setFrequencyElement(frequency.toHapi())
    }
    if (hasFrequencyMax()) {
      hapiValue.setFrequencyMaxElement(frequencyMax.toHapi())
    }
    if (hasPeriod()) {
      hapiValue.setPeriodElement(period.toHapi())
    }
    if (hasPeriodMax()) {
      hapiValue.setPeriodMaxElement(periodMax.toHapi())
    }
    if (hasPeriodUnit()) {
      hapiValue.setPeriodUnit(org.hl7.fhir.r4.model.Timing.UnitsOfTime.valueOf(periodUnit.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (dayOfWeekCount > 0) {
      dayOfWeekList.forEach { hapiValue.addDayOfWeek(org.hl7.fhir.r4.model.Timing.DayOfWeek.valueOf(it.value.name.hapiCodeCheck().replace("_", ""))) }
    }
    if (timeOfDayCount > 0) {
      hapiValue.setTimeOfDay(timeOfDayList.map { it.toHapi() })
    }
    if (whenCount > 0) {
      whenList.forEach { hapiValue.addWhen(org.hl7.fhir.r4.model.Timing.EventTiming.valueOf(it.value.name.hapiCodeCheck().replace("_", ""))) }
    }
    if (hasOffset()) {
      hapiValue.setOffsetElement(offset.toHapi())
    }
    return hapiValue
  }
}
