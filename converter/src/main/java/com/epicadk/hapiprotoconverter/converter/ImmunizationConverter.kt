package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Immunization
import com.google.fhir.r4.core.Immunization.ProtocolApplied
import com.google.fhir.r4.core.ImmunizationStatusCodesValueSet
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.PositiveIntType
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object ImmunizationConverter {
  private fun Immunization.OccurrenceX.immunizationOccurrenceToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Immunization.occurrence[x]")
  }

  private fun Type.immunizationOccurrenceToProto(): Immunization.OccurrenceX {
    val protoValue = Immunization.OccurrenceX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun Immunization.ProtocolApplied.DoseNumberX.immunizationProtocolAppliedDoseNumberToHapi():
      Type {
    if (hasPositiveInt()) {
      return (this.getPositiveInt()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Immunization.protocolApplied.doseNumber[x]")
  }

  private fun Type.immunizationProtocolAppliedDoseNumberToProto():
      Immunization.ProtocolApplied.DoseNumberX {
    val protoValue = Immunization.ProtocolApplied.DoseNumberX.newBuilder()
    if (this is PositiveIntType) {
      protoValue.setPositiveInt(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun Immunization.ProtocolApplied.SeriesDosesX.immunizationProtocolAppliedSeriesDosesToHapi():
      Type {
    if (hasPositiveInt()) {
      return (this.getPositiveInt()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Immunization.protocolApplied.seriesDoses[x]")
  }

  private fun Type.immunizationProtocolAppliedSeriesDosesToProto():
      Immunization.ProtocolApplied.SeriesDosesX {
    val protoValue = Immunization.ProtocolApplied.SeriesDosesX.newBuilder()
    if (this is PositiveIntType) {
      protoValue.setPositiveInt(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  public fun Immunization.toHapi(): org.hl7.fhir.r4.model.Immunization {
    val hapiValue = org.hl7.fhir.r4.model.Immunization()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.Immunization.ImmunizationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasStatusReason()) {
      hapiValue.setStatusReason(statusReason.toHapi())
    }
    if (hasVaccineCode()) {
      hapiValue.setVaccineCode(vaccineCode.toHapi())
    }
    if (hasPatient()) {
      hapiValue.setPatient(patient.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasOccurrence()) {
      hapiValue.setOccurrence(occurrence.immunizationOccurrenceToHapi())
    }
    if (hasRecorded()) {
      hapiValue.setRecordedElement(recorded.toHapi())
    }
    if (hasPrimarySource()) {
      hapiValue.setPrimarySourceElement(primarySource.toHapi())
    }
    if (hasReportOrigin()) {
      hapiValue.setReportOrigin(reportOrigin.toHapi())
    }
    if (hasLocation()) {
      hapiValue.setLocation(location.toHapi())
    }
    if (hasManufacturer()) {
      hapiValue.setManufacturer(manufacturer.toHapi())
    }
    if (hasLotNumber()) {
      hapiValue.setLotNumberElement(lotNumber.toHapi())
    }
    if (hasExpirationDate()) {
      hapiValue.setExpirationDateElement(expirationDate.toHapi())
    }
    if (hasSite()) {
      hapiValue.setSite(site.toHapi())
    }
    if (hasRoute()) {
      hapiValue.setRoute(route.toHapi())
    }
    if (hasDoseQuantity()) {
      hapiValue.setDoseQuantity(doseQuantity.toHapi())
    }
    if (performerCount > 0) {
      hapiValue.setPerformer(performerList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (reasonCodeCount > 0) {
      hapiValue.setReasonCode(reasonCodeList.map { it.toHapi() })
    }
    if (reasonReferenceCount > 0) {
      hapiValue.setReasonReference(reasonReferenceList.map { it.toHapi() })
    }
    if (hasIsSubpotent()) {
      hapiValue.setIsSubpotentElement(isSubpotent.toHapi())
    }
    if (subpotentReasonCount > 0) {
      hapiValue.setSubpotentReason(subpotentReasonList.map { it.toHapi() })
    }
    if (educationCount > 0) {
      hapiValue.setEducation(educationList.map { it.toHapi() })
    }
    if (programEligibilityCount > 0) {
      hapiValue.setProgramEligibility(programEligibilityList.map { it.toHapi() })
    }
    if (hasFundingSource()) {
      hapiValue.setFundingSource(fundingSource.toHapi())
    }
    if (reactionCount > 0) {
      hapiValue.setReaction(reactionList.map { it.toHapi() })
    }
    if (protocolAppliedCount > 0) {
      hapiValue.setProtocolApplied(protocolAppliedList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Immunization.toProto(): Immunization {
    val protoValue = Immunization.newBuilder()
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
      protoValue.setStatus(Immunization.StatusCode.newBuilder().setValue(ImmunizationStatusCodesValueSet.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasStatusReason()) {
      protoValue.setStatusReason(statusReason.toProto())
    }
    if (hasVaccineCode()) {
      protoValue.setVaccineCode(vaccineCode.toProto())
    }
    if (hasPatient()) {
      protoValue.setPatient(patient.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasOccurrence()) {
      protoValue.setOccurrence(occurrence.immunizationOccurrenceToProto())
    }
    if (hasRecorded()) {
      protoValue.setRecorded(recordedElement.toProto())
    }
    if (hasPrimarySource()) {
      protoValue.setPrimarySource(primarySourceElement.toProto())
    }
    if (hasReportOrigin()) {
      protoValue.setReportOrigin(reportOrigin.toProto())
    }
    if (hasLocation()) {
      protoValue.setLocation(location.toProto())
    }
    if (hasManufacturer()) {
      protoValue.setManufacturer(manufacturer.toProto())
    }
    if (hasLotNumber()) {
      protoValue.setLotNumber(lotNumberElement.toProto())
    }
    if (hasExpirationDate()) {
      protoValue.setExpirationDate(expirationDateElement.toProto())
    }
    if (hasSite()) {
      protoValue.setSite(site.toProto())
    }
    if (hasRoute()) {
      protoValue.setRoute(route.toProto())
    }
    if (hasDoseQuantity()) {
      protoValue.setDoseQuantity((doseQuantity as SimpleQuantity).toProto())
    }
    if (hasPerformer()) {
      protoValue.addAllPerformer(performer.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasReasonCode()) {
      protoValue.addAllReasonCode(reasonCode.map { it.toProto() })
    }
    if (hasReasonReference()) {
      protoValue.addAllReasonReference(reasonReference.map { it.toProto() })
    }
    if (hasIsSubpotent()) {
      protoValue.setIsSubpotent(isSubpotentElement.toProto())
    }
    if (hasSubpotentReason()) {
      protoValue.addAllSubpotentReason(subpotentReason.map { it.toProto() })
    }
    if (hasEducation()) {
      protoValue.addAllEducation(education.map { it.toProto() })
    }
    if (hasProgramEligibility()) {
      protoValue.addAllProgramEligibility(programEligibility.map { it.toProto() })
    }
    if (hasFundingSource()) {
      protoValue.setFundingSource(fundingSource.toProto())
    }
    if (hasReaction()) {
      protoValue.addAllReaction(reaction.map { it.toProto() })
    }
    if (hasProtocolApplied()) {
      protoValue.addAllProtocolApplied(protocolApplied.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Immunization.ImmunizationPerformerComponent.toProto():
      Immunization.Performer {
    val protoValue = Immunization.Performer.newBuilder()
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

  private fun org.hl7.fhir.r4.model.Immunization.ImmunizationEducationComponent.toProto():
      Immunization.Education {
    val protoValue = Immunization.Education.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDocumentType()) {
      protoValue.setDocumentType(documentTypeElement.toProto())
    }
    if (hasReference()) {
      protoValue.setReference(referenceElement.toProto())
    }
    if (hasPublicationDate()) {
      protoValue.setPublicationDate(publicationDateElement.toProto())
    }
    if (hasPresentationDate()) {
      protoValue.setPresentationDate(presentationDateElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Immunization.ImmunizationReactionComponent.toProto():
      Immunization.Reaction {
    val protoValue = Immunization.Reaction.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasDetail()) {
      protoValue.setDetail(detail.toProto())
    }
    if (hasReported()) {
      protoValue.setReported(reportedElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Immunization.ImmunizationProtocolAppliedComponent.toProto():
      Immunization.ProtocolApplied {
    val protoValue = Immunization.ProtocolApplied.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSeries()) {
      protoValue.setSeries(seriesElement.toProto())
    }
    if (hasAuthority()) {
      protoValue.setAuthority(authority.toProto())
    }
    if (hasTargetDisease()) {
      protoValue.addAllTargetDisease(targetDisease.map { it.toProto() })
    }
    if (hasDoseNumber()) {
      protoValue.setDoseNumber(doseNumber.immunizationProtocolAppliedDoseNumberToProto())
    }
    if (hasSeriesDoses()) {
      protoValue.setSeriesDoses(seriesDoses.immunizationProtocolAppliedSeriesDosesToProto())
    }
    return protoValue.build()
  }

  private fun Immunization.Performer.toHapi():
      org.hl7.fhir.r4.model.Immunization.ImmunizationPerformerComponent {
    val hapiValue = org.hl7.fhir.r4.model.Immunization.ImmunizationPerformerComponent()
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

  private fun Immunization.Education.toHapi():
      org.hl7.fhir.r4.model.Immunization.ImmunizationEducationComponent {
    val hapiValue = org.hl7.fhir.r4.model.Immunization.ImmunizationEducationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasDocumentType()) {
      hapiValue.setDocumentTypeElement(documentType.toHapi())
    }
    if (hasReference()) {
      hapiValue.setReferenceElement(reference.toHapi())
    }
    if (hasPublicationDate()) {
      hapiValue.setPublicationDateElement(publicationDate.toHapi())
    }
    if (hasPresentationDate()) {
      hapiValue.setPresentationDateElement(presentationDate.toHapi())
    }
    return hapiValue
  }

  private fun Immunization.Reaction.toHapi():
      org.hl7.fhir.r4.model.Immunization.ImmunizationReactionComponent {
    val hapiValue = org.hl7.fhir.r4.model.Immunization.ImmunizationReactionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasDetail()) {
      hapiValue.setDetail(detail.toHapi())
    }
    if (hasReported()) {
      hapiValue.setReportedElement(reported.toHapi())
    }
    return hapiValue
  }

  private fun Immunization.ProtocolApplied.toHapi():
      org.hl7.fhir.r4.model.Immunization.ImmunizationProtocolAppliedComponent {
    val hapiValue = org.hl7.fhir.r4.model.Immunization.ImmunizationProtocolAppliedComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasSeries()) {
      hapiValue.setSeriesElement(series.toHapi())
    }
    if (hasAuthority()) {
      hapiValue.setAuthority(authority.toHapi())
    }
    if (targetDiseaseCount > 0) {
      hapiValue.setTargetDisease(targetDiseaseList.map { it.toHapi() })
    }
    if (hasDoseNumber()) {
      hapiValue.setDoseNumber(doseNumber.immunizationProtocolAppliedDoseNumberToHapi())
    }
    if (hasSeriesDoses()) {
      hapiValue.setSeriesDoses(seriesDoses.immunizationProtocolAppliedSeriesDosesToHapi())
    }
    return hapiValue
  }
}
