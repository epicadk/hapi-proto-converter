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
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.DocumentManifest
import com.google.fhir.r4.core.DocumentReferenceStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.Enumerations

public object DocumentManifestConverter {
  public fun DocumentManifest.toHapi(): org.hl7.fhir.r4.model.DocumentManifest {
    val hapiValue = org.hl7.fhir.r4.model.DocumentManifest()
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
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasCreated()) {
      hapiValue.setCreatedElement(created.toHapi())
    }
    if (authorCount > 0) {
      hapiValue.setAuthor(authorList.map { it.toHapi() })
    }
    if (recipientCount > 0) {
      hapiValue.setRecipient(recipientList.map { it.toHapi() })
    }
    if (hasSource()) {
      hapiValue.setSourceElement(source.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (contentCount > 0) {
      hapiValue.setContent(contentList.map { it.toHapi() })
    }
    if (relatedCount > 0) {
      hapiValue.setRelated(relatedList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.DocumentManifest.toProto(): DocumentManifest {
    val protoValue = DocumentManifest.newBuilder()
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
      protoValue.setStatus(DocumentManifest.StatusCode.newBuilder().setValue(DocumentReferenceStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasCreated()) {
      protoValue.setCreated(createdElement.toProto())
    }
    if (hasAuthor()) {
      protoValue.addAllAuthor(author.map { it.toProto() })
    }
    if (hasRecipient()) {
      protoValue.addAllRecipient(recipient.map { it.toProto() })
    }
    if (hasSource()) {
      protoValue.setSource(sourceElement.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasContent()) {
      protoValue.addAllContent(content.map { it.toProto() })
    }
    if (hasRelated()) {
      protoValue.addAllRelated(related.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.DocumentManifest.DocumentManifestRelatedComponent.toProto():
      DocumentManifest.Related {
    val protoValue = DocumentManifest.Related.newBuilder()
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
      protoValue.setIdentifier(identifier.toProto())
    }
    if (hasRef()) {
      protoValue.setRef(ref.toProto())
    }
    return protoValue.build()
  }

  private fun DocumentManifest.Related.toHapi():
      org.hl7.fhir.r4.model.DocumentManifest.DocumentManifestRelatedComponent {
    val hapiValue = org.hl7.fhir.r4.model.DocumentManifest.DocumentManifestRelatedComponent()
    if (hasId()) {
      hapiValue.id = id.value
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
    if (hasRef()) {
      hapiValue.setRef(ref.toHapi())
    }
    return hapiValue
  }
}
