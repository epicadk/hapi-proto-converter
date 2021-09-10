package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Specimen
import com.google.fhir.r4.core.Specimen.Collection
import com.google.fhir.r4.core.Specimen.Container
import com.google.fhir.r4.core.Specimen.Processing
import com.google.fhir.r4.core.SpecimenStatusCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Duration
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.Type

public object SpecimenConverter {
  private fun Specimen.Collection.CollectedX.specimenCollectionCollectedToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Specimen.collection.collected[x]")
  }

  private fun Type.specimenCollectionCollectedToProto(): Specimen.Collection.CollectedX {
    val protoValue = Specimen.Collection.CollectedX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  private fun Specimen.Collection.FastingStatusX.specimenCollectionFastingStatusToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasDuration()) {
      return (this.getDuration()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Specimen.collection.fastingStatus[x]")
  }

  private fun Type.specimenCollectionFastingStatusToProto(): Specimen.Collection.FastingStatusX {
    val protoValue = Specimen.Collection.FastingStatusX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Duration) {
      protoValue.setDuration(this.toProto())
    }
    return protoValue.build()
  }

  private fun Specimen.Processing.TimeX.specimenProcessingTimeToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Specimen.processing.time[x]")
  }

  private fun Type.specimenProcessingTimeToProto(): Specimen.Processing.TimeX {
    val protoValue = Specimen.Processing.TimeX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  private fun Specimen.Container.AdditiveX.specimenContainerAdditiveToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Specimen.container.additive[x]")
  }

  private fun Type.specimenContainerAdditiveToProto(): Specimen.Container.AdditiveX {
    val protoValue = Specimen.Container.AdditiveX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  public fun Specimen.toHapi(): org.hl7.fhir.r4.model.Specimen {
    val hapiValue = org.hl7.fhir.r4.model.Specimen()
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
    if (hasAccessionIdentifier()) {
      hapiValue.setAccessionIdentifier(accessionIdentifier.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.Specimen.SpecimenStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasReceivedTime()) {
      hapiValue.setReceivedTimeElement(receivedTime.toHapi())
    }
    if (parentCount > 0) {
      hapiValue.setParent(parentList.map { it.toHapi() })
    }
    if (requestCount > 0) {
      hapiValue.setRequest(requestList.map { it.toHapi() })
    }
    if (hasCollection()) {
      hapiValue.setCollection(collection.toHapi())
    }
    if (processingCount > 0) {
      hapiValue.setProcessing(processingList.map { it.toHapi() })
    }
    if (containerCount > 0) {
      hapiValue.setContainer(containerList.map { it.toHapi() })
    }
    if (conditionCount > 0) {
      hapiValue.setCondition(conditionList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Specimen.toProto(): Specimen {
    val protoValue = Specimen.newBuilder()
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
    if (hasAccessionIdentifier()) {
      protoValue.setAccessionIdentifier(accessionIdentifier.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(Specimen.StatusCode.newBuilder().setValue(SpecimenStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasReceivedTime()) {
      protoValue.setReceivedTime(receivedTimeElement.toProto())
    }
    if (hasParent()) {
      protoValue.addAllParent(parent.map { it.toProto() })
    }
    if (hasRequest()) {
      protoValue.addAllRequest(request.map { it.toProto() })
    }
    if (hasCollection()) {
      protoValue.setCollection(collection.toProto())
    }
    if (hasProcessing()) {
      protoValue.addAllProcessing(processing.map { it.toProto() })
    }
    if (hasContainer()) {
      protoValue.addAllContainer(container.map { it.toProto() })
    }
    if (hasCondition()) {
      protoValue.addAllCondition(condition.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Specimen.SpecimenCollectionComponent.toProto():
      Specimen.Collection {
    val protoValue = Specimen.Collection.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCollector()) {
      protoValue.setCollector(collector.toProto())
    }
    if (hasCollected()) {
      protoValue.setCollected(collected.specimenCollectionCollectedToProto())
    }
    if (hasDuration()) {
      protoValue.setDuration(duration.toProto())
    }
    if (hasQuantity()) {
      protoValue.setQuantity((quantity as SimpleQuantity).toProto())
    }
    if (hasMethod()) {
      protoValue.setMethod(method.toProto())
    }
    if (hasBodySite()) {
      protoValue.setBodySite(bodySite.toProto())
    }
    if (hasFastingStatus()) {
      protoValue.setFastingStatus(fastingStatus.specimenCollectionFastingStatusToProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Specimen.SpecimenProcessingComponent.toProto():
      Specimen.Processing {
    val protoValue = Specimen.Processing.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasProcedure()) {
      protoValue.setProcedure(procedure.toProto())
    }
    if (hasAdditive()) {
      protoValue.addAllAdditive(additive.map { it.toProto() })
    }
    if (hasTime()) {
      protoValue.setTime(time.specimenProcessingTimeToProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Specimen.SpecimenContainerComponent.toProto():
      Specimen.Container {
    val protoValue = Specimen.Container.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
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
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasCapacity()) {
      protoValue.setCapacity((capacity as SimpleQuantity).toProto())
    }
    if (hasSpecimenQuantity()) {
      protoValue.setSpecimenQuantity((specimenQuantity as SimpleQuantity).toProto())
    }
    if (hasAdditive()) {
      protoValue.setAdditive(additive.specimenContainerAdditiveToProto())
    }
    return protoValue.build()
  }

  private fun Specimen.Collection.toHapi():
      org.hl7.fhir.r4.model.Specimen.SpecimenCollectionComponent {
    val hapiValue = org.hl7.fhir.r4.model.Specimen.SpecimenCollectionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCollector()) {
      hapiValue.setCollector(collector.toHapi())
    }
    if (hasCollected()) {
      hapiValue.setCollected(collected.specimenCollectionCollectedToHapi())
    }
    if (hasDuration()) {
      hapiValue.setDuration(duration.toHapi())
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (hasMethod()) {
      hapiValue.setMethod(method.toHapi())
    }
    if (hasBodySite()) {
      hapiValue.setBodySite(bodySite.toHapi())
    }
    if (hasFastingStatus()) {
      hapiValue.setFastingStatus(fastingStatus.specimenCollectionFastingStatusToHapi())
    }
    return hapiValue
  }

  private fun Specimen.Processing.toHapi():
      org.hl7.fhir.r4.model.Specimen.SpecimenProcessingComponent {
    val hapiValue = org.hl7.fhir.r4.model.Specimen.SpecimenProcessingComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasProcedure()) {
      hapiValue.setProcedure(procedure.toHapi())
    }
    if (additiveCount > 0) {
      hapiValue.setAdditive(additiveList.map { it.toHapi() })
    }
    if (hasTime()) {
      hapiValue.setTime(time.specimenProcessingTimeToHapi())
    }
    return hapiValue
  }

  private fun Specimen.Container.toHapi():
      org.hl7.fhir.r4.model.Specimen.SpecimenContainerComponent {
    val hapiValue = org.hl7.fhir.r4.model.Specimen.SpecimenContainerComponent()
    if (hasId()) {
      hapiValue.id = id.value
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
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasCapacity()) {
      hapiValue.setCapacity(capacity.toHapi())
    }
    if (hasSpecimenQuantity()) {
      hapiValue.setSpecimenQuantity(specimenQuantity.toHapi())
    }
    if (hasAdditive()) {
      hapiValue.setAdditive(additive.specimenContainerAdditiveToHapi())
    }
    return hapiValue
  }
}
