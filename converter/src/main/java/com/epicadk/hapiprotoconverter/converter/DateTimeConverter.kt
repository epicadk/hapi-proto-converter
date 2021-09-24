// contains functions that convert between the hapi and proto representations of dateTime
package com.epicadk.hapiprotoconverter.converter

import ca.uhn.fhir.model.api.TemporalPrecisionEnum
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.google.fhir.r4.core.DateTime
import java.time.Instant
import java.util.Date
import java.util.TimeZone
import org.hl7.fhir.r4.model.DateTimeType

public object DateTimeConverter {
  /**
   * returns the proto DateTime equivalent of the hapi DateTimeType
   */
  public fun DateTimeType.toProto(): DateTime {
    val protoValue = DateTime.newBuilder()
    if (hasTime()) protoValue.setTimezone(timeZone.id)
    if (hasValue()) protoValue.setValueUs(value.time)
    protoValue.precision = precision.toProtoPrecision()
    if (hasExtension()) protoValue.addAllExtension(extension.map { it.toProto() })
    return protoValue.build()
  }

  /**
   * returns the hapi DateTimeType equivalent of the proto DateTime
   */
  public fun DateTime.toHapi(): DateTimeType {
    val hapiValue = DateTimeType()
    hapiValue.timeZone = TimeZone.getTimeZone(timezone)
    hapiValue.value = Date.from(Instant.ofEpochMilli(valueUs))
    hapiValue.precision = precision.toHapiPrecision()
    if (extensionCount > 0) hapiValue.setExtension(extensionList.map { it.toHapi() })
    return hapiValue
  }

  /**
   * converts the hapi temporal precision to DateTime.Precision
   */
  private fun TemporalPrecisionEnum.toProtoPrecision(): DateTime.Precision = when (this) {
    TemporalPrecisionEnum.YEAR -> DateTime.Precision.YEAR
    TemporalPrecisionEnum.MONTH -> DateTime.Precision.MONTH
    TemporalPrecisionEnum.DAY -> DateTime.Precision.DAY
    TemporalPrecisionEnum.SECOND -> DateTime.Precision.SECOND
    TemporalPrecisionEnum.MILLI -> DateTime.Precision.MILLISECOND
    else -> DateTime.Precision.PRECISION_UNSPECIFIED
  }

  /**
   * converts the DateTime.Precision to hapi Temporal Precision
   */
  private fun DateTime.Precision.toHapiPrecision(): TemporalPrecisionEnum = when (this) {
    DateTime.Precision.YEAR -> TemporalPrecisionEnum.YEAR
    DateTime.Precision.MONTH -> TemporalPrecisionEnum.MONTH
    DateTime.Precision.DAY -> TemporalPrecisionEnum.DAY
    DateTime.Precision.SECOND -> TemporalPrecisionEnum.SECOND
    DateTime.Precision.MILLISECOND -> TemporalPrecisionEnum.MILLI
    else -> TemporalPrecisionEnum.MILLI
  }
}
