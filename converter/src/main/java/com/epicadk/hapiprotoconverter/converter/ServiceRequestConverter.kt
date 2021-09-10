package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.RequestIntentCode
import com.google.fhir.r4.core.RequestPriorityCode
import com.google.fhir.r4.core.RequestStatusCode
import com.google.fhir.r4.core.ServiceRequest
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Quantity
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.Ratio
import org.hl7.fhir.r4.model.Timing
import org.hl7.fhir.r4.model.Type

public object ServiceRequestConverter {
  private fun ServiceRequest.QuantityX.serviceRequestQuantityToHapi(): Type {
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasRatio()) {
      return (this.getRatio()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ServiceRequest.quantity[x]")
  }

  private fun Type.serviceRequestQuantityToProto(): ServiceRequest.QuantityX {
    val protoValue = ServiceRequest.QuantityX.newBuilder()
    if (this is Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is Ratio) {
      protoValue.setRatio(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    return protoValue.build()
  }

  private fun ServiceRequest.OccurrenceX.serviceRequestOccurrenceToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasTiming()) {
      return (this.getTiming()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ServiceRequest.occurrence[x]")
  }

  private fun Type.serviceRequestOccurrenceToProto(): ServiceRequest.OccurrenceX {
    val protoValue = ServiceRequest.OccurrenceX.newBuilder()
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

  private fun ServiceRequest.AsNeededX.serviceRequestAsNeededToHapi(): Type {
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ServiceRequest.asNeeded[x]")
  }

  private fun Type.serviceRequestAsNeededToProto(): ServiceRequest.AsNeededX {
    val protoValue = ServiceRequest.AsNeededX.newBuilder()
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    return protoValue.build()
  }

  public fun ServiceRequest.toHapi(): org.hl7.fhir.r4.model.ServiceRequest {
    val hapiValue = org.hl7.fhir.r4.model.ServiceRequest()
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
    if (instantiatesCanonicalCount > 0) {
      hapiValue.setInstantiatesCanonical(instantiatesCanonicalList.map { it.toHapi() })
    }
    if (instantiatesUriCount > 0) {
      hapiValue.setInstantiatesUri(instantiatesUriList.map { it.toHapi() })
    }
    if (basedOnCount > 0) {
      hapiValue.setBasedOn(basedOnList.map { it.toHapi() })
    }
    if (replacesCount > 0) {
      hapiValue.setReplaces(replacesList.map { it.toHapi() })
    }
    if (hasRequisition()) {
      hapiValue.setRequisition(requisition.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasIntent()) {
      hapiValue.setIntent(org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestIntent.valueOf(intent.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (categoryCount > 0) {
      hapiValue.setCategory(categoryList.map { it.toHapi() })
    }
    if (hasPriority()) {
      hapiValue.setPriority(org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestPriority.valueOf(priority.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDoNotPerform()) {
      hapiValue.setDoNotPerformElement(doNotPerform.toHapi())
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (orderDetailCount > 0) {
      hapiValue.setOrderDetail(orderDetailList.map { it.toHapi() })
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.serviceRequestQuantityToHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasOccurrence()) {
      hapiValue.setOccurrence(occurrence.serviceRequestOccurrenceToHapi())
    }
    if (hasAsNeeded()) {
      hapiValue.setAsNeeded(asNeeded.serviceRequestAsNeededToHapi())
    }
    if (hasAuthoredOn()) {
      hapiValue.setAuthoredOnElement(authoredOn.toHapi())
    }
    if (hasRequester()) {
      hapiValue.setRequester(requester.toHapi())
    }
    if (hasPerformerType()) {
      hapiValue.setPerformerType(performerType.toHapi())
    }
    if (performerCount > 0) {
      hapiValue.setPerformer(performerList.map { it.toHapi() })
    }
    if (locationCodeCount > 0) {
      hapiValue.setLocationCode(locationCodeList.map { it.toHapi() })
    }
    if (locationReferenceCount > 0) {
      hapiValue.setLocationReference(locationReferenceList.map { it.toHapi() })
    }
    if (reasonCodeCount > 0) {
      hapiValue.setReasonCode(reasonCodeList.map { it.toHapi() })
    }
    if (reasonReferenceCount > 0) {
      hapiValue.setReasonReference(reasonReferenceList.map { it.toHapi() })
    }
    if (insuranceCount > 0) {
      hapiValue.setInsurance(insuranceList.map { it.toHapi() })
    }
    if (supportingInfoCount > 0) {
      hapiValue.setSupportingInfo(supportingInfoList.map { it.toHapi() })
    }
    if (specimenCount > 0) {
      hapiValue.setSpecimen(specimenList.map { it.toHapi() })
    }
    if (bodySiteCount > 0) {
      hapiValue.setBodySite(bodySiteList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (hasPatientInstruction()) {
      hapiValue.setPatientInstructionElement(patientInstruction.toHapi())
    }
    if (relevantHistoryCount > 0) {
      hapiValue.setRelevantHistory(relevantHistoryList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ServiceRequest.toProto(): ServiceRequest {
    val protoValue = ServiceRequest.newBuilder()
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
    if (hasInstantiatesCanonical()) {
      protoValue.addAllInstantiatesCanonical(instantiatesCanonical.map { it.toProto() })
    }
    if (hasInstantiatesUri()) {
      protoValue.addAllInstantiatesUri(instantiatesUri.map { it.toProto() })
    }
    if (hasBasedOn()) {
      protoValue.addAllBasedOn(basedOn.map { it.toProto() })
    }
    if (hasReplaces()) {
      protoValue.addAllReplaces(replaces.map { it.toProto() })
    }
    if (hasRequisition()) {
      protoValue.setRequisition(requisition.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(ServiceRequest.StatusCode.newBuilder().setValue(RequestStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasIntent()) {
      protoValue.setIntent(ServiceRequest.IntentCode.newBuilder().setValue(RequestIntentCode.Value.valueOf(intent.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCategory()) {
      protoValue.addAllCategory(category.map { it.toProto() })
    }
    if (hasPriority()) {
      protoValue.setPriority(ServiceRequest.PriorityCode.newBuilder().setValue(RequestPriorityCode.Value.valueOf(priority.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDoNotPerform()) {
      protoValue.setDoNotPerform(doNotPerformElement.toProto())
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasOrderDetail()) {
      protoValue.addAllOrderDetail(orderDetail.map { it.toProto() })
    }
    if (hasQuantity()) {
      protoValue.setQuantity(quantity.serviceRequestQuantityToProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasOccurrence()) {
      protoValue.setOccurrence(occurrence.serviceRequestOccurrenceToProto())
    }
    if (hasAsNeeded()) {
      protoValue.setAsNeeded(asNeeded.serviceRequestAsNeededToProto())
    }
    if (hasAuthoredOn()) {
      protoValue.setAuthoredOn(authoredOnElement.toProto())
    }
    if (hasRequester()) {
      protoValue.setRequester(requester.toProto())
    }
    if (hasPerformerType()) {
      protoValue.setPerformerType(performerType.toProto())
    }
    if (hasPerformer()) {
      protoValue.addAllPerformer(performer.map { it.toProto() })
    }
    if (hasLocationCode()) {
      protoValue.addAllLocationCode(locationCode.map { it.toProto() })
    }
    if (hasLocationReference()) {
      protoValue.addAllLocationReference(locationReference.map { it.toProto() })
    }
    if (hasReasonCode()) {
      protoValue.addAllReasonCode(reasonCode.map { it.toProto() })
    }
    if (hasReasonReference()) {
      protoValue.addAllReasonReference(reasonReference.map { it.toProto() })
    }
    if (hasInsurance()) {
      protoValue.addAllInsurance(insurance.map { it.toProto() })
    }
    if (hasSupportingInfo()) {
      protoValue.addAllSupportingInfo(supportingInfo.map { it.toProto() })
    }
    if (hasSpecimen()) {
      protoValue.addAllSpecimen(specimen.map { it.toProto() })
    }
    if (hasBodySite()) {
      protoValue.addAllBodySite(bodySite.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasPatientInstruction()) {
      protoValue.setPatientInstruction(patientInstructionElement.toProto())
    }
    if (hasRelevantHistory()) {
      protoValue.addAllRelevantHistory(relevantHistory.map { it.toProto() })
    }
    return protoValue.build()
  }
}
