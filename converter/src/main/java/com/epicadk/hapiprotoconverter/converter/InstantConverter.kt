// contains functions that convert between the hapi and proto representations of instant
package com.epicadk.hapiprotoconverter.converter

import ca.uhn.fhir.model.api.TemporalPrecisionEnum
import com.google.fhir.r4.core.Instant
import java.time.Instant as InstantUtil
import java.util.Date
import java.util.TimeZone
import org.hl7.fhir.r4.model.InstantType

public object InstantConverter {
  /**
   * returns the proto Instant equivalent of the hapi InstantType
   */
  public fun InstantType.toProto(): Instant {
    val protoValue = Instant.newBuilder()
    if (hasTime()) protoValue.setTimezone(timeZone.id)
    if (hasValue()) protoValue.setValueUs(value.time)
    protoValue.precision = precision.toProtoPrecision()
    return protoValue.build()
  }

  /**
   * returns the hapi InstantType equivalent of the proto Instant
   */
  public fun Instant.toHapi(): InstantType {
    val hapiValue = InstantType()
    hapiValue.timeZone = TimeZone.getTimeZone(timezone)
    hapiValue.value = Date.from(InstantUtil.ofEpochMilli(valueUs))
    hapiValue.precision = precision.toHapiPrecision()
    return hapiValue
  }

  /**
   * converts the hapi temporal precision to Instant.Precision
   */
  private fun TemporalPrecisionEnum.toProtoPrecision(): Instant.Precision = when (this) {
    TemporalPrecisionEnum.SECOND -> Instant.Precision.SECOND
    TemporalPrecisionEnum.MILLI -> Instant.Precision.MILLISECOND
    else -> Instant.Precision.PRECISION_UNSPECIFIED
  }

  /**
   * converts the Instant.Precision to hapi Temporal Precision
   */
  private fun Instant.Precision.toHapiPrecision(): TemporalPrecisionEnum = when (this) {
    Instant.Precision.SECOND -> TemporalPrecisionEnum.SECOND
    Instant.Precision.MILLISECOND -> TemporalPrecisionEnum.MILLI
    else -> TemporalPrecisionEnum.MILLI
  }
}
