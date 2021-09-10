package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
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
import com.google.fhir.r4.core.EpisodeOfCare
import com.google.fhir.r4.core.EpisodeOfCare.StatusHistory
import com.google.fhir.r4.core.EpisodeOfCareStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String

public object EpisodeOfCareConverter {
  public fun EpisodeOfCare.toHapi(): org.hl7.fhir.r4.model.EpisodeOfCare {
    val hapiValue = org.hl7.fhir.r4.model.EpisodeOfCare()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (statusHistoryCount > 0) {
      hapiValue.setStatusHistory(statusHistoryList.map { it.toHapi() })
    }
    if (typeCount > 0) {
      hapiValue.setType(typeList.map { it.toHapi() })
    }
    if (diagnosisCount > 0) {
      hapiValue.setDiagnosis(diagnosisList.map { it.toHapi() })
    }
    if (hasPatient()) {
      hapiValue.setPatient(patient.toHapi())
    }
    if (hasManagingOrganization()) {
      hapiValue.setManagingOrganization(managingOrganization.toHapi())
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    if (referralRequestCount > 0) {
      hapiValue.setReferralRequest(referralRequestList.map { it.toHapi() })
    }
    if (hasCareManager()) {
      hapiValue.setCareManager(careManager.toHapi())
    }
    if (teamCount > 0) {
      hapiValue.setTeam(teamList.map { it.toHapi() })
    }
    if (accountCount > 0) {
      hapiValue.setAccount(accountList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.EpisodeOfCare.toProto(): EpisodeOfCare {
    val protoValue = EpisodeOfCare.newBuilder()
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
      protoValue.setStatus(EpisodeOfCare.StatusCode.newBuilder().setValue(EpisodeOfCareStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasStatusHistory()) {
      protoValue.addAllStatusHistory(statusHistory.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasDiagnosis()) {
      protoValue.addAllDiagnosis(diagnosis.map { it.toProto() })
    }
    if (hasPatient()) {
      protoValue.setPatient(patient.toProto())
    }
    if (hasManagingOrganization()) {
      protoValue.setManagingOrganization(managingOrganization.toProto())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    if (hasReferralRequest()) {
      protoValue.addAllReferralRequest(referralRequest.map { it.toProto() })
    }
    if (hasCareManager()) {
      protoValue.setCareManager(careManager.toProto())
    }
    if (hasTeam()) {
      protoValue.addAllTeam(team.map { it.toProto() })
    }
    if (hasAccount()) {
      protoValue.addAllAccount(account.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent.toProto():
      EpisodeOfCare.StatusHistory {
    val protoValue = EpisodeOfCare.StatusHistory.newBuilder()
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
      protoValue.setStatus(EpisodeOfCare.StatusHistory.StatusCode.newBuilder().setValue(EpisodeOfCareStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.EpisodeOfCare.DiagnosisComponent.toProto():
      EpisodeOfCare.Diagnosis {
    val protoValue = EpisodeOfCare.Diagnosis.newBuilder()
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
    if (hasRole()) {
      protoValue.setRole(role.toProto())
    }
    if (hasRank()) {
      protoValue.setRank(rankElement.toProto())
    }
    return protoValue.build()
  }

  private fun EpisodeOfCare.StatusHistory.toHapi():
      org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent {
    val hapiValue = org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    return hapiValue
  }

  private fun EpisodeOfCare.Diagnosis.toHapi():
      org.hl7.fhir.r4.model.EpisodeOfCare.DiagnosisComponent {
    val hapiValue = org.hl7.fhir.r4.model.EpisodeOfCare.DiagnosisComponent()
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
    if (hasRole()) {
      hapiValue.setRole(role.toHapi())
    }
    if (hasRank()) {
      hapiValue.setRankElement(rank.toHapi())
    }
    return hapiValue
  }
}
