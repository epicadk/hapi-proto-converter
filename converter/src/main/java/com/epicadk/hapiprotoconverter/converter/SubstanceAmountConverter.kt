package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.SubstanceAmount
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Quantity
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object SubstanceAmountConverter {
  private fun SubstanceAmount.AmountX.substanceAmountAmountToHapi(): Type {
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for SubstanceAmount.amount[x]")
  }

  private fun Type.substanceAmountAmountToProto(): SubstanceAmount.AmountX {
    val protoValue = SubstanceAmount.AmountX.newBuilder()
    if (this is Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  public fun SubstanceAmount.toHapi(): org.hl7.fhir.r4.model.SubstanceAmount {
    val hapiValue = org.hl7.fhir.r4.model.SubstanceAmount()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.substanceAmountAmountToHapi())
    }
    if (hasAmountType()) {
      hapiValue.setAmountType(amountType.toHapi())
    }
    if (hasAmountText()) {
      hapiValue.setAmountTextElement(amountText.toHapi())
    }
    if (hasReferenceRange()) {
      hapiValue.setReferenceRange(referenceRange.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.SubstanceAmount.toProto(): SubstanceAmount {
    val protoValue = SubstanceAmount.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasAmount()) {
      protoValue.setAmount(amount.substanceAmountAmountToProto())
    }
    if (hasAmountType()) {
      protoValue.setAmountType(amountType.toProto())
    }
    if (hasAmountText()) {
      protoValue.setAmountText(amountTextElement.toProto())
    }
    if (hasReferenceRange()) {
      protoValue.setReferenceRange(referenceRange.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceAmount.SubstanceAmountReferenceRangeComponent.toProto():
      SubstanceAmount.ReferenceRange {
    val protoValue = SubstanceAmount.ReferenceRange.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasLowLimit()) {
      protoValue.setLowLimit(lowLimit.toProto())
    }
    if (hasHighLimit()) {
      protoValue.setHighLimit(highLimit.toProto())
    }
    return protoValue.build()
  }

  private fun SubstanceAmount.ReferenceRange.toHapi():
      org.hl7.fhir.r4.model.SubstanceAmount.SubstanceAmountReferenceRangeComponent {
    val hapiValue = org.hl7.fhir.r4.model.SubstanceAmount.SubstanceAmountReferenceRangeComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasLowLimit()) {
      hapiValue.setLowLimit(lowLimit.toHapi())
    }
    if (hasHighLimit()) {
      hapiValue.setHighLimit(highLimit.toHapi())
    }
    return hapiValue
  }
}
