package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Encounter
import com.google.fhir.r4.core.Encounter.Location
import com.google.fhir.r4.core.Encounter.StatusHistory
import com.google.fhir.r4.core.EncounterLocationStatusCode
import com.google.fhir.r4.core.EncounterStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String

public object EncounterConverter {
  public fun Encounter.toHapi(): org.hl7.fhir.r4.model.Encounter {
    val hapiValue = org.hl7.fhir.r4.model.Encounter()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.Encounter.EncounterStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (statusHistoryCount > 0) {
      hapiValue.setStatusHistory(statusHistoryList.map { it.toHapi() })
    }
    if (hasClassValue()) {
      hapiValue.setClass_(classValue.toHapi())
    }
    if (classHistoryCount > 0) {
      hapiValue.setClassHistory(classHistoryList.map { it.toHapi() })
    }
    if (typeCount > 0) {
      hapiValue.setType(typeList.map { it.toHapi() })
    }
    if (hasServiceType()) {
      hapiValue.setServiceType(serviceType.toHapi())
    }
    if (hasPriority()) {
      hapiValue.setPriority(priority.toHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (episodeOfCareCount > 0) {
      hapiValue.setEpisodeOfCare(episodeOfCareList.map { it.toHapi() })
    }
    if (basedOnCount > 0) {
      hapiValue.setBasedOn(basedOnList.map { it.toHapi() })
    }
    if (participantCount > 0) {
      hapiValue.setParticipant(participantList.map { it.toHapi() })
    }
    if (appointmentCount > 0) {
      hapiValue.setAppointment(appointmentList.map { it.toHapi() })
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    if (hasLength()) {
      hapiValue.setLength(length.toHapi())
    }
    if (reasonCodeCount > 0) {
      hapiValue.setReasonCode(reasonCodeList.map { it.toHapi() })
    }
    if (reasonReferenceCount > 0) {
      hapiValue.setReasonReference(reasonReferenceList.map { it.toHapi() })
    }
    if (diagnosisCount > 0) {
      hapiValue.setDiagnosis(diagnosisList.map { it.toHapi() })
    }
    if (accountCount > 0) {
      hapiValue.setAccount(accountList.map { it.toHapi() })
    }
    if (hasHospitalization()) {
      hapiValue.setHospitalization(hospitalization.toHapi())
    }
    if (locationCount > 0) {
      hapiValue.setLocation(locationList.map { it.toHapi() })
    }
    if (hasServiceProvider()) {
      hapiValue.setServiceProvider(serviceProvider.toHapi())
    }
    if (hasPartOf()) {
      hapiValue.setPartOf(partOf.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Encounter.toProto(): Encounter {
    val protoValue = Encounter.newBuilder()
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
      protoValue.setStatus(Encounter.StatusCode.newBuilder().setValue(EncounterStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasStatusHistory()) {
      protoValue.addAllStatusHistory(statusHistory.map { it.toProto() })
    }
    if (hasClass_()) {
      protoValue.setClassValue(class_.toProto())
    }
    if (hasClassHistory()) {
      protoValue.addAllClassHistory(classHistory.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasServiceType()) {
      protoValue.setServiceType(serviceType.toProto())
    }
    if (hasPriority()) {
      protoValue.setPriority(priority.toProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasEpisodeOfCare()) {
      protoValue.addAllEpisodeOfCare(episodeOfCare.map { it.toProto() })
    }
    if (hasBasedOn()) {
      protoValue.addAllBasedOn(basedOn.map { it.toProto() })
    }
    if (hasParticipant()) {
      protoValue.addAllParticipant(participant.map { it.toProto() })
    }
    if (hasAppointment()) {
      protoValue.addAllAppointment(appointment.map { it.toProto() })
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    if (hasLength()) {
      protoValue.setLength(length.toProto())
    }
    if (hasReasonCode()) {
      protoValue.addAllReasonCode(reasonCode.map { it.toProto() })
    }
    if (hasReasonReference()) {
      protoValue.addAllReasonReference(reasonReference.map { it.toProto() })
    }
    if (hasDiagnosis()) {
      protoValue.addAllDiagnosis(diagnosis.map { it.toProto() })
    }
    if (hasAccount()) {
      protoValue.addAllAccount(account.map { it.toProto() })
    }
    if (hasHospitalization()) {
      protoValue.setHospitalization(hospitalization.toProto())
    }
    if (hasLocation()) {
      protoValue.addAllLocation(location.map { it.toProto() })
    }
    if (hasServiceProvider()) {
      protoValue.setServiceProvider(serviceProvider.toProto())
    }
    if (hasPartOf()) {
      protoValue.setPartOf(partOf.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Encounter.StatusHistoryComponent.toProto():
      Encounter.StatusHistory {
    val protoValue = Encounter.StatusHistory.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(Encounter.StatusHistory.StatusCode.newBuilder().setValue(EncounterStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Encounter.ClassHistoryComponent.toProto():
      Encounter.ClassHistory {
    val protoValue = Encounter.ClassHistory.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasClass_()) {
      protoValue.setClassValue(class_.toProto())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Encounter.EncounterParticipantComponent.toProto():
      Encounter.Participant {
    val protoValue = Encounter.Participant.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    if (hasIndividual()) {
      protoValue.setIndividual(individual.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Encounter.DiagnosisComponent.toProto(): Encounter.Diagnosis {
    val protoValue = Encounter.Diagnosis.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCondition()) {
      protoValue.setCondition(condition.toProto())
    }
    if (hasUse()) {
      protoValue.setUse(use.toProto())
    }
    if (hasRank()) {
      protoValue.setRank(rankElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Encounter.EncounterHospitalizationComponent.toProto():
      Encounter.Hospitalization {
    val protoValue = Encounter.Hospitalization.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasPreAdmissionIdentifier()) {
      protoValue.setPreAdmissionIdentifier(preAdmissionIdentifier.toProto())
    }
    if (hasOrigin()) {
      protoValue.setOrigin(origin.toProto())
    }
    if (hasAdmitSource()) {
      protoValue.setAdmitSource(admitSource.toProto())
    }
    if (hasReAdmission()) {
      protoValue.setReAdmission(reAdmission.toProto())
    }
    if (hasDietPreference()) {
      protoValue.addAllDietPreference(dietPreference.map { it.toProto() })
    }
    if (hasSpecialCourtesy()) {
      protoValue.addAllSpecialCourtesy(specialCourtesy.map { it.toProto() })
    }
    if (hasSpecialArrangement()) {
      protoValue.addAllSpecialArrangement(specialArrangement.map { it.toProto() })
    }
    if (hasDestination()) {
      protoValue.setDestination(destination.toProto())
    }
    if (hasDischargeDisposition()) {
      protoValue.setDischargeDisposition(dischargeDisposition.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Encounter.EncounterLocationComponent.toProto():
      Encounter.Location {
    val protoValue = Encounter.Location.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasLocation()) {
      protoValue.setLocation(location.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(Encounter.Location.StatusCode.newBuilder().setValue(EncounterLocationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPhysicalType()) {
      protoValue.setPhysicalType(physicalType.toProto())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    return protoValue.build()
  }

  private fun Encounter.StatusHistory.toHapi():
      org.hl7.fhir.r4.model.Encounter.StatusHistoryComponent {
    val hapiValue = org.hl7.fhir.r4.model.Encounter.StatusHistoryComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.Encounter.EncounterStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    return hapiValue
  }

  private fun Encounter.ClassHistory.toHapi():
      org.hl7.fhir.r4.model.Encounter.ClassHistoryComponent {
    val hapiValue = org.hl7.fhir.r4.model.Encounter.ClassHistoryComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasClassValue()) {
      hapiValue.setClass_(classValue.toHapi())
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    return hapiValue
  }

  private fun Encounter.Participant.toHapi():
      org.hl7.fhir.r4.model.Encounter.EncounterParticipantComponent {
    val hapiValue = org.hl7.fhir.r4.model.Encounter.EncounterParticipantComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (typeCount > 0) {
      hapiValue.setType(typeList.map { it.toHapi() })
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    if (hasIndividual()) {
      hapiValue.setIndividual(individual.toHapi())
    }
    return hapiValue
  }

  private fun Encounter.Diagnosis.toHapi(): org.hl7.fhir.r4.model.Encounter.DiagnosisComponent {
    val hapiValue = org.hl7.fhir.r4.model.Encounter.DiagnosisComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCondition()) {
      hapiValue.setCondition(condition.toHapi())
    }
    if (hasUse()) {
      hapiValue.setUse(use.toHapi())
    }
    if (hasRank()) {
      hapiValue.setRankElement(rank.toHapi())
    }
    return hapiValue
  }

  private fun Encounter.Hospitalization.toHapi():
      org.hl7.fhir.r4.model.Encounter.EncounterHospitalizationComponent {
    val hapiValue = org.hl7.fhir.r4.model.Encounter.EncounterHospitalizationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasPreAdmissionIdentifier()) {
      hapiValue.setPreAdmissionIdentifier(preAdmissionIdentifier.toHapi())
    }
    if (hasOrigin()) {
      hapiValue.setOrigin(origin.toHapi())
    }
    if (hasAdmitSource()) {
      hapiValue.setAdmitSource(admitSource.toHapi())
    }
    if (hasReAdmission()) {
      hapiValue.setReAdmission(reAdmission.toHapi())
    }
    if (dietPreferenceCount > 0) {
      hapiValue.setDietPreference(dietPreferenceList.map { it.toHapi() })
    }
    if (specialCourtesyCount > 0) {
      hapiValue.setSpecialCourtesy(specialCourtesyList.map { it.toHapi() })
    }
    if (specialArrangementCount > 0) {
      hapiValue.setSpecialArrangement(specialArrangementList.map { it.toHapi() })
    }
    if (hasDestination()) {
      hapiValue.setDestination(destination.toHapi())
    }
    if (hasDischargeDisposition()) {
      hapiValue.setDischargeDisposition(dischargeDisposition.toHapi())
    }
    return hapiValue
  }

  private fun Encounter.Location.toHapi():
      org.hl7.fhir.r4.model.Encounter.EncounterLocationComponent {
    val hapiValue = org.hl7.fhir.r4.model.Encounter.EncounterLocationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasLocation()) {
      hapiValue.setLocation(location.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.Encounter.EncounterLocationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPhysicalType()) {
      hapiValue.setPhysicalType(physicalType.toHapi())
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    return hapiValue
  }
}
