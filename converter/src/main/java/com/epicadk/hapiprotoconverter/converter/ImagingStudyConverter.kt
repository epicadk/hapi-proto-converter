package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.ImagingStudy
import com.google.fhir.r4.core.ImagingStudy.Series
import com.google.fhir.r4.core.ImagingStudyStatusCode
import com.google.fhir.r4.core.String

public object ImagingStudyConverter {
  public fun ImagingStudy.toHapi(): org.hl7.fhir.r4.model.ImagingStudy {
    val hapiValue = org.hl7.fhir.r4.model.ImagingStudy()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.ImagingStudy.ImagingStudyStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (modalityCount > 0) {
      hapiValue.setModality(modalityList.map { it.toHapi() })
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasStarted()) {
      hapiValue.setStartedElement(started.toHapi())
    }
    if (basedOnCount > 0) {
      hapiValue.setBasedOn(basedOnList.map { it.toHapi() })
    }
    if (hasReferrer()) {
      hapiValue.setReferrer(referrer.toHapi())
    }
    if (interpreterCount > 0) {
      hapiValue.setInterpreter(interpreterList.map { it.toHapi() })
    }
    if (endpointCount > 0) {
      hapiValue.setEndpoint(endpointList.map { it.toHapi() })
    }
    if (hasNumberOfSeries()) {
      hapiValue.setNumberOfSeriesElement(numberOfSeries.toHapi())
    }
    if (hasNumberOfInstances()) {
      hapiValue.setNumberOfInstancesElement(numberOfInstances.toHapi())
    }
    if (hasProcedureReference()) {
      hapiValue.setProcedureReference(procedureReference.toHapi())
    }
    if (procedureCodeCount > 0) {
      hapiValue.setProcedureCode(procedureCodeList.map { it.toHapi() })
    }
    if (hasLocation()) {
      hapiValue.setLocation(location.toHapi())
    }
    if (reasonCodeCount > 0) {
      hapiValue.setReasonCode(reasonCodeList.map { it.toHapi() })
    }
    if (reasonReferenceCount > 0) {
      hapiValue.setReasonReference(reasonReferenceList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (seriesCount > 0) {
      hapiValue.setSeries(seriesList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ImagingStudy.toProto(): ImagingStudy {
    val protoValue = ImagingStudy.newBuilder()
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
      protoValue.setStatus(ImagingStudy.StatusCode.newBuilder().setValue(ImagingStudyStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasModality()) {
      protoValue.addAllModality(modality.map { it.toProto() })
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasStarted()) {
      protoValue.setStarted(startedElement.toProto())
    }
    if (hasBasedOn()) {
      protoValue.addAllBasedOn(basedOn.map { it.toProto() })
    }
    if (hasReferrer()) {
      protoValue.setReferrer(referrer.toProto())
    }
    if (hasInterpreter()) {
      protoValue.addAllInterpreter(interpreter.map { it.toProto() })
    }
    if (hasEndpoint()) {
      protoValue.addAllEndpoint(endpoint.map { it.toProto() })
    }
    if (hasNumberOfSeries()) {
      protoValue.setNumberOfSeries(numberOfSeriesElement.toProto())
    }
    if (hasNumberOfInstances()) {
      protoValue.setNumberOfInstances(numberOfInstancesElement.toProto())
    }
    if (hasProcedureReference()) {
      protoValue.setProcedureReference(procedureReference.toProto())
    }
    if (hasProcedureCode()) {
      protoValue.addAllProcedureCode(procedureCode.map { it.toProto() })
    }
    if (hasLocation()) {
      protoValue.setLocation(location.toProto())
    }
    if (hasReasonCode()) {
      protoValue.addAllReasonCode(reasonCode.map { it.toProto() })
    }
    if (hasReasonReference()) {
      protoValue.addAllReasonReference(reasonReference.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasSeries()) {
      protoValue.addAllSeries(series.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesComponent.toProto():
      ImagingStudy.Series {
    val protoValue = ImagingStudy.Series.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasUid()) {
      protoValue.setUid(uidElement.toProto())
    }
    if (hasNumber()) {
      protoValue.setNumber(numberElement.toProto())
    }
    if (hasModality()) {
      protoValue.setModality(modality.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasNumberOfInstances()) {
      protoValue.setNumberOfInstances(numberOfInstancesElement.toProto())
    }
    if (hasEndpoint()) {
      protoValue.addAllEndpoint(endpoint.map { it.toProto() })
    }
    if (hasBodySite()) {
      protoValue.setBodySite(bodySite.toProto())
    }
    if (hasLaterality()) {
      protoValue.setLaterality(laterality.toProto())
    }
    if (hasSpecimen()) {
      protoValue.addAllSpecimen(specimen.map { it.toProto() })
    }
    if (hasStarted()) {
      protoValue.setStarted(startedElement.toProto())
    }
    if (hasPerformer()) {
      protoValue.addAllPerformer(performer.map { it.toProto() })
    }
    if (hasInstance()) {
      protoValue.addAllInstance(instance.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesPerformerComponent.toProto():
      ImagingStudy.Series.Performer {
    val protoValue = ImagingStudy.Series.Performer.newBuilder()
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

  private fun org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesInstanceComponent.toProto():
      ImagingStudy.Series.Instance {
    val protoValue = ImagingStudy.Series.Instance.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasUid()) {
      protoValue.setUid(uidElement.toProto())
    }
    if (hasSopClass()) {
      protoValue.setSopClass(sopClass.toProto())
    }
    if (hasNumber()) {
      protoValue.setNumber(numberElement.toProto())
    }
    if (hasTitle()) {
      protoValue.setTitle(titleElement.toProto())
    }
    return protoValue.build()
  }

  private fun ImagingStudy.Series.toHapi():
      org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesComponent {
    val hapiValue = org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasUid()) {
      hapiValue.setUidElement(uid.toHapi())
    }
    if (hasNumber()) {
      hapiValue.setNumberElement(number.toHapi())
    }
    if (hasModality()) {
      hapiValue.setModality(modality.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasNumberOfInstances()) {
      hapiValue.setNumberOfInstancesElement(numberOfInstances.toHapi())
    }
    if (endpointCount > 0) {
      hapiValue.setEndpoint(endpointList.map { it.toHapi() })
    }
    if (hasBodySite()) {
      hapiValue.setBodySite(bodySite.toHapi())
    }
    if (hasLaterality()) {
      hapiValue.setLaterality(laterality.toHapi())
    }
    if (specimenCount > 0) {
      hapiValue.setSpecimen(specimenList.map { it.toHapi() })
    }
    if (hasStarted()) {
      hapiValue.setStartedElement(started.toHapi())
    }
    if (performerCount > 0) {
      hapiValue.setPerformer(performerList.map { it.toHapi() })
    }
    if (instanceCount > 0) {
      hapiValue.setInstance(instanceList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ImagingStudy.Series.Performer.toHapi():
      org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesPerformerComponent {
    val hapiValue = org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesPerformerComponent()
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

  private fun ImagingStudy.Series.Instance.toHapi():
      org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesInstanceComponent {
    val hapiValue = org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesInstanceComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasUid()) {
      hapiValue.setUidElement(uid.toHapi())
    }
    if (hasSopClass()) {
      hapiValue.setSopClass(sopClass.toHapi())
    }
    if (hasNumber()) {
      hapiValue.setNumberElement(number.toHapi())
    }
    if (hasTitle()) {
      hapiValue.setTitleElement(title.toHapi())
    }
    return hapiValue
  }
}
