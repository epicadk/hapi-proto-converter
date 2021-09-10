package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.CatalogEntry
import com.google.fhir.r4.core.CatalogEntry.RelatedEntry
import com.google.fhir.r4.core.CatalogEntryRelationTypeCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.Enumerations

public object CatalogEntryConverter {
  public fun CatalogEntry.toHapi(): org.hl7.fhir.r4.model.CatalogEntry {
    val hapiValue = org.hl7.fhir.r4.model.CatalogEntry()
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
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasOrderable()) {
      hapiValue.setOrderableElement(orderable.toHapi())
    }
    if (hasReferencedItem()) {
      hapiValue.setReferencedItem(referencedItem.toHapi())
    }
    if (additionalIdentifierCount > 0) {
      hapiValue.setAdditionalIdentifier(additionalIdentifierList.map { it.toHapi() })
    }
    if (classificationCount > 0) {
      hapiValue.setClassification(classificationList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(Enumerations.PublicationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasValidityPeriod()) {
      hapiValue.setValidityPeriod(validityPeriod.toHapi())
    }
    if (hasValidTo()) {
      hapiValue.setValidToElement(validTo.toHapi())
    }
    if (hasLastUpdated()) {
      hapiValue.setLastUpdatedElement(lastUpdated.toHapi())
    }
    if (additionalCharacteristicCount > 0) {
      hapiValue.setAdditionalCharacteristic(additionalCharacteristicList.map { it.toHapi() })
    }
    if (additionalClassificationCount > 0) {
      hapiValue.setAdditionalClassification(additionalClassificationList.map { it.toHapi() })
    }
    if (relatedEntryCount > 0) {
      hapiValue.setRelatedEntry(relatedEntryList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.CatalogEntry.toProto(): CatalogEntry {
    val protoValue = CatalogEntry.newBuilder()
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
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasOrderable()) {
      protoValue.setOrderable(orderableElement.toProto())
    }
    if (hasReferencedItem()) {
      protoValue.setReferencedItem(referencedItem.toProto())
    }
    if (hasAdditionalIdentifier()) {
      protoValue.addAllAdditionalIdentifier(additionalIdentifier.map { it.toProto() })
    }
    if (hasClassification()) {
      protoValue.addAllClassification(classification.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(CatalogEntry.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasValidityPeriod()) {
      protoValue.setValidityPeriod(validityPeriod.toProto())
    }
    if (hasValidTo()) {
      protoValue.setValidTo(validToElement.toProto())
    }
    if (hasLastUpdated()) {
      protoValue.setLastUpdated(lastUpdatedElement.toProto())
    }
    if (hasAdditionalCharacteristic()) {
      protoValue.addAllAdditionalCharacteristic(additionalCharacteristic.map { it.toProto() })
    }
    if (hasAdditionalClassification()) {
      protoValue.addAllAdditionalClassification(additionalClassification.map { it.toProto() })
    }
    if (hasRelatedEntry()) {
      protoValue.addAllRelatedEntry(relatedEntry.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelatedEntryComponent.toProto():
      CatalogEntry.RelatedEntry {
    val protoValue = CatalogEntry.RelatedEntry.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasRelationtype()) {
      protoValue.setRelationtype(CatalogEntry.RelatedEntry.RelationtypeCode.newBuilder().setValue(CatalogEntryRelationTypeCode.Value.valueOf(relationtype.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasItem()) {
      protoValue.setItem(item.toProto())
    }
    return protoValue.build()
  }

  private fun CatalogEntry.RelatedEntry.toHapi():
      org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelatedEntryComponent {
    val hapiValue = org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelatedEntryComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasRelationtype()) {
      hapiValue.setRelationtype(org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelationType.valueOf(relationtype.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasItem()) {
      hapiValue.setItem(item.toHapi())
    }
    return hapiValue
  }
}
