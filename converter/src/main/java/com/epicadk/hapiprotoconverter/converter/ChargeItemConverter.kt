package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MoneyConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MoneyConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.ChargeItem
import com.google.fhir.r4.core.ChargeItemStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.Timing
import org.hl7.fhir.r4.model.Type

public object ChargeItemConverter {
  private fun ChargeItem.OccurrenceX.chargeItemOccurrenceToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasTiming()) {
      return (this.getTiming()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ChargeItem.occurrence[x]")
  }

  private fun Type.chargeItemOccurrenceToProto(): ChargeItem.OccurrenceX {
    val protoValue = ChargeItem.OccurrenceX.newBuilder()
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

  private fun ChargeItem.ProductX.chargeItemProductToHapi(): Type {
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ChargeItem.product[x]")
  }

  private fun Type.chargeItemProductToProto(): ChargeItem.ProductX {
    val protoValue = ChargeItem.ProductX.newBuilder()
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    return protoValue.build()
  }

  public fun ChargeItem.toHapi(): org.hl7.fhir.r4.model.ChargeItem {
    val hapiValue = org.hl7.fhir.r4.model.ChargeItem()
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
    if (definitionUriCount > 0) {
      hapiValue.setDefinitionUri(definitionUriList.map { it.toHapi() })
    }
    if (definitionCanonicalCount > 0) {
      hapiValue.setDefinitionCanonical(definitionCanonicalList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.ChargeItem.ChargeItemStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (partOfCount > 0) {
      hapiValue.setPartOf(partOfList.map { it.toHapi() })
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasContext()) {
      hapiValue.setContext(context.toHapi())
    }
    if (hasOccurrence()) {
      hapiValue.setOccurrence(occurrence.chargeItemOccurrenceToHapi())
    }
    if (performerCount > 0) {
      hapiValue.setPerformer(performerList.map { it.toHapi() })
    }
    if (hasPerformingOrganization()) {
      hapiValue.setPerformingOrganization(performingOrganization.toHapi())
    }
    if (hasRequestingOrganization()) {
      hapiValue.setRequestingOrganization(requestingOrganization.toHapi())
    }
    if (hasCostCenter()) {
      hapiValue.setCostCenter(costCenter.toHapi())
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (bodysiteCount > 0) {
      hapiValue.setBodysite(bodysiteList.map { it.toHapi() })
    }
    if (hasFactorOverride()) {
      hapiValue.setFactorOverrideElement(factorOverride.toHapi())
    }
    if (hasPriceOverride()) {
      hapiValue.setPriceOverride(priceOverride.toHapi())
    }
    if (hasOverrideReason()) {
      hapiValue.setOverrideReasonElement(overrideReason.toHapi())
    }
    if (hasEnterer()) {
      hapiValue.setEnterer(enterer.toHapi())
    }
    if (hasEnteredDate()) {
      hapiValue.setEnteredDateElement(enteredDate.toHapi())
    }
    if (reasonCount > 0) {
      hapiValue.setReason(reasonList.map { it.toHapi() })
    }
    if (serviceCount > 0) {
      hapiValue.setService(serviceList.map { it.toHapi() })
    }
    if (hasProduct()) {
      hapiValue.setProduct(product.chargeItemProductToHapi())
    }
    if (accountCount > 0) {
      hapiValue.setAccount(accountList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (supportingInformationCount > 0) {
      hapiValue.setSupportingInformation(supportingInformationList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ChargeItem.toProto(): ChargeItem {
    val protoValue = ChargeItem.newBuilder()
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
    if (hasDefinitionUri()) {
      protoValue.addAllDefinitionUri(definitionUri.map { it.toProto() })
    }
    if (hasDefinitionCanonical()) {
      protoValue.addAllDefinitionCanonical(definitionCanonical.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(ChargeItem.StatusCode.newBuilder().setValue(ChargeItemStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPartOf()) {
      protoValue.addAllPartOf(partOf.map { it.toProto() })
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasContext()) {
      protoValue.setContext(context.toProto())
    }
    if (hasOccurrence()) {
      protoValue.setOccurrence(occurrence.chargeItemOccurrenceToProto())
    }
    if (hasPerformer()) {
      protoValue.addAllPerformer(performer.map { it.toProto() })
    }
    if (hasPerformingOrganization()) {
      protoValue.setPerformingOrganization(performingOrganization.toProto())
    }
    if (hasRequestingOrganization()) {
      protoValue.setRequestingOrganization(requestingOrganization.toProto())
    }
    if (hasCostCenter()) {
      protoValue.setCostCenter(costCenter.toProto())
    }
    if (hasQuantity()) {
      protoValue.setQuantity(quantity.toProto())
    }
    if (hasBodysite()) {
      protoValue.addAllBodysite(bodysite.map { it.toProto() })
    }
    if (hasFactorOverride()) {
      protoValue.setFactorOverride(factorOverrideElement.toProto())
    }
    if (hasPriceOverride()) {
      protoValue.setPriceOverride(priceOverride.toProto())
    }
    if (hasOverrideReason()) {
      protoValue.setOverrideReason(overrideReasonElement.toProto())
    }
    if (hasEnterer()) {
      protoValue.setEnterer(enterer.toProto())
    }
    if (hasEnteredDate()) {
      protoValue.setEnteredDate(enteredDateElement.toProto())
    }
    if (hasReason()) {
      protoValue.addAllReason(reason.map { it.toProto() })
    }
    if (hasService()) {
      protoValue.addAllService(service.map { it.toProto() })
    }
    if (hasProduct()) {
      protoValue.setProduct(product.chargeItemProductToProto())
    }
    if (hasAccount()) {
      protoValue.addAllAccount(account.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasSupportingInformation()) {
      protoValue.addAllSupportingInformation(supportingInformation.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ChargeItem.ChargeItemPerformerComponent.toProto():
      ChargeItem.Performer {
    val protoValue = ChargeItem.Performer.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasFunction()) {
      protoValue.setFunction(function.toProto())
    }
    if (hasActor()) {
      protoValue.setActor(actor.toProto())
    }
    return protoValue.build()
  }

  private fun ChargeItem.Performer.toHapi():
      org.hl7.fhir.r4.model.ChargeItem.ChargeItemPerformerComponent {
    val hapiValue = org.hl7.fhir.r4.model.ChargeItem.ChargeItemPerformerComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasFunction()) {
      hapiValue.setFunction(function.toHapi())
    }
    if (hasActor()) {
      hapiValue.setActor(actor.toHapi())
    }
    return hapiValue
  }
}
