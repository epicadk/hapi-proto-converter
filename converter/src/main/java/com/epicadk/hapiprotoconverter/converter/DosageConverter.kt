package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toProto
import com.google.fhir.r4.core.Dosage
import com.google.fhir.r4.core.Dosage.DoseAndRate
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.Ratio
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.Type

public object DosageConverter {
  private fun Dosage.AsNeededX.dosageAsNeededToHapi(): Type {
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Dosage.asNeeded[x]")
  }

  private fun Type.dosageAsNeededToProto(): Dosage.AsNeededX {
    val protoValue = Dosage.AsNeededX.newBuilder()
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    return protoValue.build()
  }

  private fun Dosage.DoseAndRate.DoseX.dosageDoseAndRateDoseToHapi(): Type {
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Dosage.doseAndRate.dose[x]")
  }

  private fun Type.dosageDoseAndRateDoseToProto(): Dosage.DoseAndRate.DoseX {
    val protoValue = Dosage.DoseAndRate.DoseX.newBuilder()
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is SimpleQuantity) {
      protoValue.setQuantity(this.toProto())
    }
    return protoValue.build()
  }

  private fun Dosage.DoseAndRate.RateX.dosageDoseAndRateRateToHapi(): Type {
    if (hasRatio()) {
      return (this.getRatio()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Dosage.doseAndRate.rate[x]")
  }

  private fun Type.dosageDoseAndRateRateToProto(): Dosage.DoseAndRate.RateX {
    val protoValue = Dosage.DoseAndRate.RateX.newBuilder()
    if (this is Ratio) {
      protoValue.setRatio(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is SimpleQuantity) {
      protoValue.setQuantity(this.toProto())
    }
    return protoValue.build()
  }

  public fun Dosage.toHapi(): org.hl7.fhir.r4.model.Dosage {
    val hapiValue = org.hl7.fhir.r4.model.Dosage()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasSequence()) {
      hapiValue.setSequenceElement(sequence.toHapi())
    }
    if (hasText()) {
      hapiValue.setTextElement(text.toHapi())
    }
    if (additionalInstructionCount > 0) {
      hapiValue.setAdditionalInstruction(additionalInstructionList.map { it.toHapi() })
    }
    if (hasPatientInstruction()) {
      hapiValue.setPatientInstructionElement(patientInstruction.toHapi())
    }
    if (hasTiming()) {
      hapiValue.setTiming(timing.toHapi())
    }
    if (hasAsNeeded()) {
      hapiValue.setAsNeeded(asNeeded.dosageAsNeededToHapi())
    }
    if (hasSite()) {
      hapiValue.setSite(site.toHapi())
    }
    if (hasRoute()) {
      hapiValue.setRoute(route.toHapi())
    }
    if (hasMethod()) {
      hapiValue.setMethod(method.toHapi())
    }
    if (doseAndRateCount > 0) {
      hapiValue.setDoseAndRate(doseAndRateList.map { it.toHapi() })
    }
    if (hasMaxDosePerPeriod()) {
      hapiValue.setMaxDosePerPeriod(maxDosePerPeriod.toHapi())
    }
    if (hasMaxDosePerAdministration()) {
      hapiValue.setMaxDosePerAdministration(maxDosePerAdministration.toHapi())
    }
    if (hasMaxDosePerLifetime()) {
      hapiValue.setMaxDosePerLifetime(maxDosePerLifetime.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Dosage.toProto(): Dosage {
    val protoValue = Dosage.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSequence()) {
      protoValue.setSequence(sequenceElement.toProto())
    }
    if (hasText()) {
      protoValue.setText(textElement.toProto())
    }
    if (hasAdditionalInstruction()) {
      protoValue.addAllAdditionalInstruction(additionalInstruction.map { it.toProto() })
    }
    if (hasPatientInstruction()) {
      protoValue.setPatientInstruction(patientInstructionElement.toProto())
    }
    if (hasTiming()) {
      protoValue.setTiming(timing.toProto())
    }
    if (hasAsNeeded()) {
      protoValue.setAsNeeded(asNeeded.dosageAsNeededToProto())
    }
    if (hasSite()) {
      protoValue.setSite(site.toProto())
    }
    if (hasRoute()) {
      protoValue.setRoute(route.toProto())
    }
    if (hasMethod()) {
      protoValue.setMethod(method.toProto())
    }
    if (hasDoseAndRate()) {
      protoValue.addAllDoseAndRate(doseAndRate.map { it.toProto() })
    }
    if (hasMaxDosePerPeriod()) {
      protoValue.setMaxDosePerPeriod(maxDosePerPeriod.toProto())
    }
    if (hasMaxDosePerAdministration()) {
      protoValue.setMaxDosePerAdministration((maxDosePerAdministration as SimpleQuantity
          ).toProto())
    }
    if (hasMaxDosePerLifetime()) {
      protoValue.setMaxDosePerLifetime((maxDosePerLifetime as SimpleQuantity).toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent.toProto():
      Dosage.DoseAndRate {
    val protoValue = Dosage.DoseAndRate.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasDose()) {
      protoValue.setDose(dose.dosageDoseAndRateDoseToProto())
    }
    if (hasRate()) {
      protoValue.setRate(rate.dosageDoseAndRateRateToProto())
    }
    return protoValue.build()
  }

  private fun Dosage.DoseAndRate.toHapi(): org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent {
    val hapiValue = org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasDose()) {
      hapiValue.setDose(dose.dosageDoseAndRateDoseToHapi())
    }
    if (hasRate()) {
      hapiValue.setRate(rate.dosageDoseAndRateRateToHapi())
    }
    return hapiValue
  }
}
