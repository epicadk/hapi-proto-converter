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
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.DeviceRequest
import com.google.fhir.r4.core.DeviceRequest.Parameter
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.RequestIntentCode
import com.google.fhir.r4.core.RequestPriorityCode
import com.google.fhir.r4.core.RequestStatusCode
import com.google.fhir.r4.core.String
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

public object DeviceRequestConverter {
  private fun DeviceRequest.CodeX.deviceRequestCodeToHapi(): Type {
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for DeviceRequest.code[x]")
  }

  private fun Type.deviceRequestCodeToProto(): DeviceRequest.CodeX {
    val protoValue = DeviceRequest.CodeX.newBuilder()
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    return protoValue.build()
  }

  private fun DeviceRequest.Parameter.ValueX.deviceRequestParameterValueToHapi(): Type {
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
    throw IllegalArgumentException("Invalid Type for DeviceRequest.parameter.value[x]")
  }

  private fun Type.deviceRequestParameterValueToProto(): DeviceRequest.Parameter.ValueX {
    val protoValue = DeviceRequest.Parameter.ValueX.newBuilder()
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

  private fun DeviceRequest.OccurrenceX.deviceRequestOccurrenceToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasTiming()) {
      return (this.getTiming()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for DeviceRequest.occurrence[x]")
  }

  private fun Type.deviceRequestOccurrenceToProto(): DeviceRequest.OccurrenceX {
    val protoValue = DeviceRequest.OccurrenceX.newBuilder()
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

  public fun DeviceRequest.toHapi(): org.hl7.fhir.r4.model.DeviceRequest {
    val hapiValue = org.hl7.fhir.r4.model.DeviceRequest()
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
    if (priorRequestCount > 0) {
      hapiValue.setPriorRequest(priorRequestList.map { it.toHapi() })
    }
    if (hasGroupIdentifier()) {
      hapiValue.setGroupIdentifier(groupIdentifier.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.DeviceRequest.DeviceRequestStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasIntent()) {
      hapiValue.setIntent(org.hl7.fhir.r4.model.DeviceRequest.RequestIntent.valueOf(intent.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPriority()) {
      hapiValue.setPriority(org.hl7.fhir.r4.model.DeviceRequest.RequestPriority.valueOf(priority.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCode()) {
      hapiValue.setCode(code.deviceRequestCodeToHapi())
    }
    if (parameterCount > 0) {
      hapiValue.setParameter(parameterList.map { it.toHapi() })
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasOccurrence()) {
      hapiValue.setOccurrence(occurrence.deviceRequestOccurrenceToHapi())
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
    if (hasPerformer()) {
      hapiValue.setPerformer(performer.toHapi())
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
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (relevantHistoryCount > 0) {
      hapiValue.setRelevantHistory(relevantHistoryList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.DeviceRequest.toProto(): DeviceRequest {
    val protoValue = DeviceRequest.newBuilder()
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
    if (hasPriorRequest()) {
      protoValue.addAllPriorRequest(priorRequest.map { it.toProto() })
    }
    if (hasGroupIdentifier()) {
      protoValue.setGroupIdentifier(groupIdentifier.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(DeviceRequest.StatusCode.newBuilder().setValue(RequestStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasIntent()) {
      protoValue.setIntent(DeviceRequest.IntentCode.newBuilder().setValue(RequestIntentCode.Value.valueOf(intent.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPriority()) {
      protoValue.setPriority(DeviceRequest.PriorityCode.newBuilder().setValue(RequestPriorityCode.Value.valueOf(priority.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCode()) {
      protoValue.setCode(code.deviceRequestCodeToProto())
    }
    if (hasParameter()) {
      protoValue.addAllParameter(parameter.map { it.toProto() })
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasOccurrence()) {
      protoValue.setOccurrence(occurrence.deviceRequestOccurrenceToProto())
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
      protoValue.setPerformer(performer.toProto())
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
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasRelevantHistory()) {
      protoValue.addAllRelevantHistory(relevantHistory.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.DeviceRequest.DeviceRequestParameterComponent.toProto():
      DeviceRequest.Parameter {
    val protoValue = DeviceRequest.Parameter.newBuilder()
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
      protoValue.setValue(value.deviceRequestParameterValueToProto())
    }
    return protoValue.build()
  }

  private fun DeviceRequest.Parameter.toHapi():
      org.hl7.fhir.r4.model.DeviceRequest.DeviceRequestParameterComponent {
    val hapiValue = org.hl7.fhir.r4.model.DeviceRequest.DeviceRequestParameterComponent()
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
      hapiValue.setValue(value.deviceRequestParameterValueToHapi())
    }
    return hapiValue
  }
}
