package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.NamingSystem
import com.google.fhir.r4.core.NamingSystem.UniqueId
import com.google.fhir.r4.core.NamingSystemIdentifierTypeCode
import com.google.fhir.r4.core.NamingSystemTypeCode
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.Enumerations

public object NamingSystemConverter {
  public fun NamingSystem.toHapi(): org.hl7.fhir.r4.model.NamingSystem {
    val hapiValue = org.hl7.fhir.r4.model.NamingSystem()
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
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(Enumerations.PublicationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasKind()) {
      hapiValue.setKind(org.hl7.fhir.r4.model.NamingSystem.NamingSystemType.valueOf(kind.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasPublisher()) {
      hapiValue.setPublisherElement(publisher.toHapi())
    }
    if (contactCount > 0) {
      hapiValue.setContact(contactList.map { it.toHapi() })
    }
    if (hasResponsible()) {
      hapiValue.setResponsibleElement(responsible.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (useContextCount > 0) {
      hapiValue.setUseContext(useContextList.map { it.toHapi() })
    }
    if (jurisdictionCount > 0) {
      hapiValue.setJurisdiction(jurisdictionList.map { it.toHapi() })
    }
    if (hasUsage()) {
      hapiValue.setUsageElement(usage.toHapi())
    }
    if (uniqueIdCount > 0) {
      hapiValue.setUniqueId(uniqueIdList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.NamingSystem.toProto(): NamingSystem {
    val protoValue = NamingSystem.newBuilder()
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
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(NamingSystem.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasKind()) {
      protoValue.setKind(NamingSystem.KindCode.newBuilder().setValue(NamingSystemTypeCode.Value.valueOf(kind.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasPublisher()) {
      protoValue.setPublisher(publisherElement.toProto())
    }
    if (hasContact()) {
      protoValue.addAllContact(contact.map { it.toProto() })
    }
    if (hasResponsible()) {
      protoValue.setResponsible(responsibleElement.toProto())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasUseContext()) {
      protoValue.addAllUseContext(useContext.map { it.toProto() })
    }
    if (hasJurisdiction()) {
      protoValue.addAllJurisdiction(jurisdiction.map { it.toProto() })
    }
    if (hasUsage()) {
      protoValue.setUsage(usageElement.toProto())
    }
    if (hasUniqueId()) {
      protoValue.addAllUniqueId(uniqueId.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.NamingSystem.NamingSystemUniqueIdComponent.toProto():
      NamingSystem.UniqueId {
    val protoValue = NamingSystem.UniqueId.newBuilder()
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
      protoValue.setType(NamingSystem.UniqueId.TypeCode.newBuilder().setValue(NamingSystemIdentifierTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasValue()) {
      protoValue.setValue(valueElement.toProto())
    }
    if (hasPreferred()) {
      protoValue.setPreferred(preferredElement.toProto())
    }
    if (hasComment()) {
      protoValue.setComment(commentElement.toProto())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    return protoValue.build()
  }

  private fun NamingSystem.UniqueId.toHapi():
      org.hl7.fhir.r4.model.NamingSystem.NamingSystemUniqueIdComponent {
    val hapiValue = org.hl7.fhir.r4.model.NamingSystem.NamingSystemUniqueIdComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(org.hl7.fhir.r4.model.NamingSystem.NamingSystemIdentifierType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasValue()) {
      hapiValue.setValueElement(value.toHapi())
    }
    if (hasPreferred()) {
      hapiValue.setPreferredElement(preferred.toHapi())
    }
    if (hasComment()) {
      hapiValue.setCommentElement(comment.toHapi())
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    return hapiValue
  }
}
