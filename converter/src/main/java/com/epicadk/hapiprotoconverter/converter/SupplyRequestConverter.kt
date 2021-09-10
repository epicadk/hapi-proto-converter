package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.RequestPriorityCode
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.SupplyRequest
import com.google.fhir.r4.core.SupplyRequest.Parameter
import com.google.fhir.r4.core.SupplyRequestStatusCode
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Quantity
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.Timing
import org.hl7.fhir.r4.model.Type

public object SupplyRequestConverter {
  private fun SupplyRequest.ItemX.supplyRequestItemToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for SupplyRequest.item[x]")
  }

  private fun Type.supplyRequestItemToProto(): SupplyRequest.ItemX {
    val protoValue = SupplyRequest.ItemX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private fun SupplyRequest.Parameter.ValueX.supplyRequestParameterValueToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for SupplyRequest.parameter.value[x]")
  }

  private fun Type.supplyRequestParameterValueToProto(): SupplyRequest.Parameter.ValueX {
    val protoValue = SupplyRequest.Parameter.ValueX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    return protoValue.build()
  }

  private fun SupplyRequest.OccurrenceX.supplyRequestOccurrenceToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasTiming()) {
      return (this.getTiming()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for SupplyRequest.occurrence[x]")
  }

  private fun Type.supplyRequestOccurrenceToProto(): SupplyRequest.OccurrenceX {
    val protoValue = SupplyRequest.OccurrenceX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    if (this is Timing) {
      protoValue.setTiming(this.toProto())
    }
    return protoValue.build()
  }

  public fun SupplyRequest.toHapi(): org.hl7.fhir.r4.model.SupplyRequest {
    val hapiValue = org.hl7.fhir.r4.model.SupplyRequest()
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
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.SupplyRequest.SupplyRequestStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCategory()) {
      hapiValue.setCategory(category.toHapi())
    }
    if (hasPriority()) {
      hapiValue.setPriority(org.hl7.fhir.r4.model.SupplyRequest.RequestPriority.valueOf(priority.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasItem()) {
      hapiValue.setItem(item.supplyRequestItemToHapi())
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (parameterCount > 0) {
      hapiValue.setParameter(parameterList.map { it.toHapi() })
    }
    if (hasOccurrence()) {
      hapiValue.setOccurrence(occurrence.supplyRequestOccurrenceToHapi())
    }
    if (hasAuthoredOn()) {
      hapiValue.setAuthoredOnElement(authoredOn.toHapi())
    }
    if (hasRequester()) {
      hapiValue.setRequester(requester.toHapi())
    }
    if (supplierCount > 0) {
      hapiValue.setSupplier(supplierList.map { it.toHapi() })
    }
    if (reasonCodeCount > 0) {
      hapiValue.setReasonCode(reasonCodeList.map { it.toHapi() })
    }
    if (reasonReferenceCount > 0) {
      hapiValue.setReasonReference(reasonReferenceList.map { it.toHapi() })
    }
    if (hasDeliverFrom()) {
      hapiValue.setDeliverFrom(deliverFrom.toHapi())
    }
    if (hasDeliverTo()) {
      hapiValue.setDeliverTo(deliverTo.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.SupplyRequest.toProto(): SupplyRequest {
    val protoValue = SupplyRequest.newBuilder()
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
    if (hasStatus()) {
      protoValue.setStatus(SupplyRequest.StatusCode.newBuilder().setValue(SupplyRequestStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCategory()) {
      protoValue.setCategory(category.toProto())
    }
    if (hasPriority()) {
      protoValue.setPriority(SupplyRequest.PriorityCode.newBuilder().setValue(RequestPriorityCode.Value.valueOf(priority.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasItem()) {
      protoValue.setItem(item.supplyRequestItemToProto())
    }
    if (hasQuantity()) {
      protoValue.setQuantity(quantity.toProto())
    }
    if (hasParameter()) {
      protoValue.addAllParameter(parameter.map { it.toProto() })
    }
    if (hasOccurrence()) {
      protoValue.setOccurrence(occurrence.supplyRequestOccurrenceToProto())
    }
    if (hasAuthoredOn()) {
      protoValue.setAuthoredOn(authoredOnElement.toProto())
    }
    if (hasRequester()) {
      protoValue.setRequester(requester.toProto())
    }
    if (hasSupplier()) {
      protoValue.addAllSupplier(supplier.map { it.toProto() })
    }
    if (hasReasonCode()) {
      protoValue.addAllReasonCode(reasonCode.map { it.toProto() })
    }
    if (hasReasonReference()) {
      protoValue.addAllReasonReference(reasonReference.map { it.toProto() })
    }
    if (hasDeliverFrom()) {
      protoValue.setDeliverFrom(deliverFrom.toProto())
    }
    if (hasDeliverTo()) {
      protoValue.setDeliverTo(deliverTo.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.SupplyRequest.SupplyRequestParameterComponent.toProto():
      SupplyRequest.Parameter {
    val protoValue = SupplyRequest.Parameter.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasValue()) {
      protoValue.setValue(value.supplyRequestParameterValueToProto())
    }
    return protoValue.build()
  }

  private fun SupplyRequest.Parameter.toHapi():
      org.hl7.fhir.r4.model.SupplyRequest.SupplyRequestParameterComponent {
    val hapiValue = org.hl7.fhir.r4.model.SupplyRequest.SupplyRequestParameterComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasValue()) {
      hapiValue.setValue(value.supplyRequestParameterValueToHapi())
    }
    return hapiValue
  }
}
