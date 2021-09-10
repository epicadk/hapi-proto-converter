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
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Composition
import com.google.fhir.r4.core.Composition.Attester
import com.google.fhir.r4.core.Composition.RelatesTo
import com.google.fhir.r4.core.Composition.Section
import com.google.fhir.r4.core.CompositionAttestationModeCode
import com.google.fhir.r4.core.CompositionStatusCode
import com.google.fhir.r4.core.DocumentRelationshipTypeCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.ListModeCode
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.V3ConfidentialityClassificationValueSet
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Identifier
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.Type

public object CompositionConverter {
  private fun Composition.RelatesTo.TargetX.compositionRelatesToTargetToHapi(): Type {
    if (hasIdentifier()) {
      return (this.getIdentifier()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Composition.relatesTo.target[x]")
  }

  private fun Type.compositionRelatesToTargetToProto(): Composition.RelatesTo.TargetX {
    val protoValue = Composition.RelatesTo.TargetX.newBuilder()
    if (this is Identifier) {
      protoValue.setIdentifier(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  public fun Composition.toHapi(): org.hl7.fhir.r4.model.Composition {
    val hapiValue = org.hl7.fhir.r4.model.Composition()
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
    if (hasIdentifier()) {
      hapiValue.setIdentifier(identifier.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.Composition.CompositionStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (categoryCount > 0) {
      hapiValue.setCategory(categoryList.map { it.toHapi() })
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (authorCount > 0) {
      hapiValue.setAuthor(authorList.map { it.toHapi() })
    }
    if (hasTitle()) {
      hapiValue.setTitleElement(title.toHapi())
    }
    if (hasConfidentiality()) {
      hapiValue.setConfidentiality(org.hl7.fhir.r4.model.Composition.DocumentConfidentiality.valueOf(confidentiality.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (attesterCount > 0) {
      hapiValue.setAttester(attesterList.map { it.toHapi() })
    }
    if (hasCustodian()) {
      hapiValue.setCustodian(custodian.toHapi())
    }
    if (relatesToCount > 0) {
      hapiValue.setRelatesTo(relatesToList.map { it.toHapi() })
    }
    if (eventCount > 0) {
      hapiValue.setEvent(eventList.map { it.toHapi() })
    }
    if (sectionCount > 0) {
      hapiValue.setSection(sectionList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Composition.toProto(): Composition {
    val protoValue = Composition.newBuilder()
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
      protoValue.setIdentifier(identifier.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(Composition.StatusCode.newBuilder().setValue(CompositionStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasCategory()) {
      protoValue.addAllCategory(category.map { it.toProto() })
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasAuthor()) {
      protoValue.addAllAuthor(author.map { it.toProto() })
    }
    if (hasTitle()) {
      protoValue.setTitle(titleElement.toProto())
    }
    if (hasConfidentiality()) {
      protoValue.setConfidentiality(Composition.ConfidentialityCode.newBuilder().setValue(V3ConfidentialityClassificationValueSet.Value.valueOf(confidentiality.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasAttester()) {
      protoValue.addAllAttester(attester.map { it.toProto() })
    }
    if (hasCustodian()) {
      protoValue.setCustodian(custodian.toProto())
    }
    if (hasRelatesTo()) {
      protoValue.addAllRelatesTo(relatesTo.map { it.toProto() })
    }
    if (hasEvent()) {
      protoValue.addAllEvent(event.map { it.toProto() })
    }
    if (hasSection()) {
      protoValue.addAllSection(section.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Composition.CompositionAttesterComponent.toProto():
      Composition.Attester {
    val protoValue = Composition.Attester.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasMode()) {
      protoValue.setMode(Composition.Attester.ModeCode.newBuilder().setValue(CompositionAttestationModeCode.Value.valueOf(mode.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasTime()) {
      protoValue.setTime(timeElement.toProto())
    }
    if (hasParty()) {
      protoValue.setParty(party.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Composition.CompositionRelatesToComponent.toProto():
      Composition.RelatesTo {
    val protoValue = Composition.RelatesTo.newBuilder()
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
      protoValue.setCode(Composition.RelatesTo.CodeType.newBuilder().setValue(DocumentRelationshipTypeCode.Value.valueOf(code.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasTarget()) {
      protoValue.setTarget(target.compositionRelatesToTargetToProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Composition.CompositionEventComponent.toProto():
      Composition.Event {
    val protoValue = Composition.Event.newBuilder()
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
      protoValue.addAllCode(code.map { it.toProto() })
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    if (hasDetail()) {
      protoValue.addAllDetail(detail.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Composition.SectionComponent.toProto(): Composition.Section {
    val protoValue = Composition.Section.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasTitle()) {
      protoValue.setTitle(titleElement.toProto())
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasAuthor()) {
      protoValue.addAllAuthor(author.map { it.toProto() })
    }
    if (hasFocus()) {
      protoValue.setFocus(focus.toProto())
    }
    if (hasText()) {
      protoValue.setText(text.toProto())
    }
    if (hasMode()) {
      protoValue.setMode(Composition.Section.ModeCode.newBuilder().setValue(ListModeCode.Value.valueOf(mode.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasOrderedBy()) {
      protoValue.setOrderedBy(orderedBy.toProto())
    }
    if (hasEntry()) {
      protoValue.addAllEntry(entry.map { it.toProto() })
    }
    if (hasEmptyReason()) {
      protoValue.setEmptyReason(emptyReason.toProto())
    }
    return protoValue.build()
  }

  private fun Composition.Attester.toHapi():
      org.hl7.fhir.r4.model.Composition.CompositionAttesterComponent {
    val hapiValue = org.hl7.fhir.r4.model.Composition.CompositionAttesterComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasMode()) {
      hapiValue.setMode(org.hl7.fhir.r4.model.Composition.CompositionAttestationMode.valueOf(mode.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasTime()) {
      hapiValue.setTimeElement(time.toHapi())
    }
    if (hasParty()) {
      hapiValue.setParty(party.toHapi())
    }
    return hapiValue
  }

  private fun Composition.RelatesTo.toHapi():
      org.hl7.fhir.r4.model.Composition.CompositionRelatesToComponent {
    val hapiValue = org.hl7.fhir.r4.model.Composition.CompositionRelatesToComponent()
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
      hapiValue.setCode(org.hl7.fhir.r4.model.Composition.DocumentRelationshipType.valueOf(code.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasTarget()) {
      hapiValue.setTarget(target.compositionRelatesToTargetToHapi())
    }
    return hapiValue
  }

  private fun Composition.Event.toHapi():
      org.hl7.fhir.r4.model.Composition.CompositionEventComponent {
    val hapiValue = org.hl7.fhir.r4.model.Composition.CompositionEventComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (codeCount > 0) {
      hapiValue.setCode(codeList.map { it.toHapi() })
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    if (detailCount > 0) {
      hapiValue.setDetail(detailList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun Composition.Section.toHapi(): org.hl7.fhir.r4.model.Composition.SectionComponent {
    val hapiValue = org.hl7.fhir.r4.model.Composition.SectionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasTitle()) {
      hapiValue.setTitleElement(title.toHapi())
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (authorCount > 0) {
      hapiValue.setAuthor(authorList.map { it.toHapi() })
    }
    if (hasFocus()) {
      hapiValue.setFocus(focus.toHapi())
    }
    if (hasText()) {
      hapiValue.setText(text.toHapi())
    }
    if (hasMode()) {
      hapiValue.setMode(org.hl7.fhir.r4.model.Composition.SectionMode.valueOf(mode.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasOrderedBy()) {
      hapiValue.setOrderedBy(orderedBy.toHapi())
    }
    if (entryCount > 0) {
      hapiValue.setEntry(entryList.map { it.toHapi() })
    }
    if (hasEmptyReason()) {
      hapiValue.setEmptyReason(emptyReason.toHapi())
    }
    return hapiValue
  }
}
