package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toProto
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
import com.google.fhir.r4.core.CompositionStatusCode
import com.google.fhir.r4.core.DocumentReference
import com.google.fhir.r4.core.DocumentReference.RelatesTo
import com.google.fhir.r4.core.DocumentReferenceStatusCode
import com.google.fhir.r4.core.DocumentRelationshipTypeCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.Enumerations

public object DocumentReferenceConverter {
  public fun DocumentReference.toHapi(): org.hl7.fhir.r4.model.DocumentReference {
    val hapiValue = org.hl7.fhir.r4.model.DocumentReference()
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
    if (hasMasterIdentifier()) {
      hapiValue.setMasterIdentifier(masterIdentifier.toHapi())
    }
    if (identifierCount > 0) {
      hapiValue.setIdentifier(identifierList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(Enumerations.DocumentReferenceStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDocStatus()) {
      hapiValue.setDocStatus(org.hl7.fhir.r4.model.DocumentReference.ReferredDocumentStatus.valueOf(docStatus.value.name.hapiCodeCheck().replace("_", "")))
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
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (authorCount > 0) {
      hapiValue.setAuthor(authorList.map { it.toHapi() })
    }
    if (hasAuthenticator()) {
      hapiValue.setAuthenticator(authenticator.toHapi())
    }
    if (hasCustodian()) {
      hapiValue.setCustodian(custodian.toHapi())
    }
    if (relatesToCount > 0) {
      hapiValue.setRelatesTo(relatesToList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (securityLabelCount > 0) {
      hapiValue.setSecurityLabel(securityLabelList.map { it.toHapi() })
    }
    if (contentCount > 0) {
      hapiValue.setContent(contentList.map { it.toHapi() })
    }
    if (hasContext()) {
      hapiValue.setContext(context.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.DocumentReference.toProto(): DocumentReference {
    val protoValue = DocumentReference.newBuilder()
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
    if (hasMasterIdentifier()) {
      protoValue.setMasterIdentifier(masterIdentifier.toProto())
    }
    if (hasIdentifier()) {
      protoValue.addAllIdentifier(identifier.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(DocumentReference.StatusCode.newBuilder().setValue(DocumentReferenceStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDocStatus()) {
      protoValue.setDocStatus(DocumentReference.DocStatusCode.newBuilder().setValue(CompositionStatusCode.Value.valueOf(docStatus.toCode().protoCodeCheck().replace("-",
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
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasAuthor()) {
      protoValue.addAllAuthor(author.map { it.toProto() })
    }
    if (hasAuthenticator()) {
      protoValue.setAuthenticator(authenticator.toProto())
    }
    if (hasCustodian()) {
      protoValue.setCustodian(custodian.toProto())
    }
    if (hasRelatesTo()) {
      protoValue.addAllRelatesTo(relatesTo.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasSecurityLabel()) {
      protoValue.addAllSecurityLabel(securityLabel.map { it.toProto() })
    }
    if (hasContent()) {
      protoValue.addAllContent(content.map { it.toProto() })
    }
    if (hasContext()) {
      protoValue.setContext(context.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceRelatesToComponent.toProto():
      DocumentReference.RelatesTo {
    val protoValue = DocumentReference.RelatesTo.newBuilder()
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
      protoValue.setCode(DocumentReference.RelatesTo.CodeType.newBuilder().setValue(DocumentRelationshipTypeCode.Value.valueOf(code.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasTarget()) {
      protoValue.setTarget(target.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContentComponent.toProto():
      DocumentReference.Content {
    val protoValue = DocumentReference.Content.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasAttachment()) {
      protoValue.setAttachment(attachment.toProto())
    }
    if (hasFormat()) {
      protoValue.setFormat(format.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent.toProto():
      DocumentReference.Context {
    val protoValue = DocumentReference.Context.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasEncounter()) {
      protoValue.addAllEncounter(encounter.map { it.toProto() })
    }
    if (hasEvent()) {
      protoValue.addAllEvent(event.map { it.toProto() })
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    if (hasFacilityType()) {
      protoValue.setFacilityType(facilityType.toProto())
    }
    if (hasPracticeSetting()) {
      protoValue.setPracticeSetting(practiceSetting.toProto())
    }
    if (hasSourcePatientInfo()) {
      protoValue.setSourcePatientInfo(sourcePatientInfo.toProto())
    }
    if (hasRelated()) {
      protoValue.addAllRelated(related.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun DocumentReference.RelatesTo.toHapi():
      org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceRelatesToComponent {
    val hapiValue = org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceRelatesToComponent()
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
      hapiValue.setCode(org.hl7.fhir.r4.model.DocumentReference.DocumentRelationshipType.valueOf(code.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasTarget()) {
      hapiValue.setTarget(target.toHapi())
    }
    return hapiValue
  }

  private fun DocumentReference.Content.toHapi():
      org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContentComponent {
    val hapiValue = org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContentComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasAttachment()) {
      hapiValue.setAttachment(attachment.toHapi())
    }
    if (hasFormat()) {
      hapiValue.setFormat(format.toHapi())
    }
    return hapiValue
  }

  private fun DocumentReference.Context.toHapi():
      org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent {
    val hapiValue = org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (encounterCount > 0) {
      hapiValue.setEncounter(encounterList.map { it.toHapi() })
    }
    if (eventCount > 0) {
      hapiValue.setEvent(eventList.map { it.toHapi() })
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    if (hasFacilityType()) {
      hapiValue.setFacilityType(facilityType.toHapi())
    }
    if (hasPracticeSetting()) {
      hapiValue.setPracticeSetting(practiceSetting.toHapi())
    }
    if (hasSourcePatientInfo()) {
      hapiValue.setSourcePatientInfo(sourcePatientInfo.toHapi())
    }
    if (relatedCount > 0) {
      hapiValue.setRelated(relatedList.map { it.toHapi() })
    }
    return hapiValue
  }
}
