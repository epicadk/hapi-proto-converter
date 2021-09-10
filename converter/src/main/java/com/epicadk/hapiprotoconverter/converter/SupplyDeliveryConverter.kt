package com.epicadk.hapiprotoconverter.converter

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
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.SupplyDelivery
import com.google.fhir.r4.core.SupplyDelivery.SuppliedItem
import com.google.fhir.r4.core.SupplyDeliveryStatusCode
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.Timing
import org.hl7.fhir.r4.model.Type

public object SupplyDeliveryConverter {
  private fun SupplyDelivery.SuppliedItem.ItemX.supplyDeliverySuppliedItemItemToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for SupplyDelivery.suppliedItem.item[x]")
  }

  private fun Type.supplyDeliverySuppliedItemItemToProto(): SupplyDelivery.SuppliedItem.ItemX {
    val protoValue = SupplyDelivery.SuppliedItem.ItemX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private fun SupplyDelivery.OccurrenceX.supplyDeliveryOccurrenceToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasTiming()) {
      return (this.getTiming()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for SupplyDelivery.occurrence[x]")
  }

  private fun Type.supplyDeliveryOccurrenceToProto(): SupplyDelivery.OccurrenceX {
    val protoValue = SupplyDelivery.OccurrenceX.newBuilder()
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

  public fun SupplyDelivery.toHapi(): org.hl7.fhir.r4.model.SupplyDelivery {
    val hapiValue = org.hl7.fhir.r4.model.SupplyDelivery()
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
    if (basedOnCount > 0) {
      hapiValue.setBasedOn(basedOnList.map { it.toHapi() })
    }
    if (partOfCount > 0) {
      hapiValue.setPartOf(partOfList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.SupplyDelivery.SupplyDeliveryStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPatient()) {
      hapiValue.setPatient(patient.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasSuppliedItem()) {
      hapiValue.setSuppliedItem(suppliedItem.toHapi())
    }
    if (hasOccurrence()) {
      hapiValue.setOccurrence(occurrence.supplyDeliveryOccurrenceToHapi())
    }
    if (hasSupplier()) {
      hapiValue.setSupplier(supplier.toHapi())
    }
    if (hasDestination()) {
      hapiValue.setDestination(destination.toHapi())
    }
    if (receiverCount > 0) {
      hapiValue.setReceiver(receiverList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.SupplyDelivery.toProto(): SupplyDelivery {
    val protoValue = SupplyDelivery.newBuilder()
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
    if (hasBasedOn()) {
      protoValue.addAllBasedOn(basedOn.map { it.toProto() })
    }
    if (hasPartOf()) {
      protoValue.addAllPartOf(partOf.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(SupplyDelivery.StatusCode.newBuilder().setValue(SupplyDeliveryStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPatient()) {
      protoValue.setPatient(patient.toProto())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasSuppliedItem()) {
      protoValue.setSuppliedItem(suppliedItem.toProto())
    }
    if (hasOccurrence()) {
      protoValue.setOccurrence(occurrence.supplyDeliveryOccurrenceToProto())
    }
    if (hasSupplier()) {
      protoValue.setSupplier(supplier.toProto())
    }
    if (hasDestination()) {
      protoValue.setDestination(destination.toProto())
    }
    if (hasReceiver()) {
      protoValue.addAllReceiver(receiver.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.SupplyDelivery.SupplyDeliverySuppliedItemComponent.toProto():
      SupplyDelivery.SuppliedItem {
    val protoValue = SupplyDelivery.SuppliedItem.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasQuantity()) {
      protoValue.setQuantity((quantity as SimpleQuantity).toProto())
    }
    if (hasItem()) {
      protoValue.setItem(item.supplyDeliverySuppliedItemItemToProto())
    }
    return protoValue.build()
  }

  private fun SupplyDelivery.SuppliedItem.toHapi():
      org.hl7.fhir.r4.model.SupplyDelivery.SupplyDeliverySuppliedItemComponent {
    val hapiValue = org.hl7.fhir.r4.model.SupplyDelivery.SupplyDeliverySuppliedItemComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (hasItem()) {
      hapiValue.setItem(item.supplyDeliverySuppliedItemItemToHapi())
    }
    return hapiValue
  }
}
