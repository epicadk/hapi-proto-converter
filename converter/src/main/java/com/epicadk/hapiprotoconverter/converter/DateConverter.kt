// contains functions that convert between the hapi and proto representations of date
package com.epicadk.hapiprotoconverter.converter

import ca.uhn.fhir.model.api.TemporalPrecisionEnum
import com.google.fhir.r4.core.Date
import java.time.Instant
import java.util.TimeZone
import org.hl7.fhir.r4.model.DateType

public object DateConverter {
  /**
   * returns the proto Date equivalent of the hapi DateType
   */
  public fun DateType.toProto(): Date {
    val protoValue = Date.newBuilder()
    if (hasTime()) protoValue.setTimezone(timeZone.id)
    if (hasValue()) protoValue.setValueUs(value.time)
    protoValue.precision = precision.toProtoPrecision()
    return protoValue.build()
  }

  /**
   * returns the hapi DateType equivalent of the proto Date
   */
  public fun Date.toHapi(): DateType {
    val hapiValue = DateType()
    hapiValue.timeZone = TimeZone.getTimeZone(timezone)
    hapiValue.value = java.util.Date.from(Instant.ofEpochMilli(valueUs))
    hapiValue.precision = precision.toHapiPrecision()
    return hapiValue
  }

  /**
   * converts the hapi temporal precision to Date.Precision
   */
  private fun TemporalPrecisionEnum.toProtoPrecision(): Date.Precision = when (this) {
    TemporalPrecisionEnum.YEAR -> Date.Precision.YEAR
    TemporalPrecisionEnum.MONTH -> Date.Precision.MONTH
    TemporalPrecisionEnum.DAY -> Date.Precision.DAY
    else -> Date.Precision.PRECISION_UNSPECIFIED
  }

  /**
   * converts the Date.Precision to hapi Temporal Precision
   */
  private fun Date.Precision.toHapiPrecision(): TemporalPrecisionEnum = when (this) {
    Date.Precision.YEAR -> TemporalPrecisionEnum.YEAR
    Date.Precision.MONTH -> TemporalPrecisionEnum.MONTH
    Date.Precision.DAY -> TemporalPrecisionEnum.DAY
    else -> TemporalPrecisionEnum.MILLI
  }
}
