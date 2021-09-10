package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MarketingStatusConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MarketingStatusConverter.toProto
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
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.MedicinalProduct
import com.google.fhir.r4.core.MedicinalProduct.Name
import com.google.fhir.r4.core.MedicinalProduct.SpecialDesignation
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.Type

public object MedicinalProductConverter {
  private
      fun MedicinalProduct.SpecialDesignation.IndicationX.medicinalProductSpecialDesignationIndicationToHapi():
      Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for MedicinalProduct.specialDesignation.indication[x]")
  }

  private fun Type.medicinalProductSpecialDesignationIndicationToProto():
      MedicinalProduct.SpecialDesignation.IndicationX {
    val protoValue = MedicinalProduct.SpecialDesignation.IndicationX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  public fun MedicinalProduct.toHapi(): org.hl7.fhir.r4.model.MedicinalProduct {
    val hapiValue = org.hl7.fhir.r4.model.MedicinalProduct()
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
    if (hasDomain()) {
      hapiValue.setDomain(domain.toHapi())
    }
    if (hasCombinedPharmaceuticalDoseForm()) {
      hapiValue.setCombinedPharmaceuticalDoseForm(combinedPharmaceuticalDoseForm.toHapi())
    }
    if (hasLegalStatusOfSupply()) {
      hapiValue.setLegalStatusOfSupply(legalStatusOfSupply.toHapi())
    }
    if (hasAdditionalMonitoringIndicator()) {
      hapiValue.setAdditionalMonitoringIndicator(additionalMonitoringIndicator.toHapi())
    }
    if (specialMeasuresCount > 0) {
      hapiValue.setSpecialMeasures(specialMeasuresList.map { it.toHapi() })
    }
    if (hasPaediatricUseIndicator()) {
      hapiValue.setPaediatricUseIndicator(paediatricUseIndicator.toHapi())
    }
    if (productClassificationCount > 0) {
      hapiValue.setProductClassification(productClassificationList.map { it.toHapi() })
    }
    if (marketingStatusCount > 0) {
      hapiValue.setMarketingStatus(marketingStatusList.map { it.toHapi() })
    }
    if (pharmaceuticalProductCount > 0) {
      hapiValue.setPharmaceuticalProduct(pharmaceuticalProductList.map { it.toHapi() })
    }
    if (packagedMedicinalProductCount > 0) {
      hapiValue.setPackagedMedicinalProduct(packagedMedicinalProductList.map { it.toHapi() })
    }
    if (attachedDocumentCount > 0) {
      hapiValue.setAttachedDocument(attachedDocumentList.map { it.toHapi() })
    }
    if (masterFileCount > 0) {
      hapiValue.setMasterFile(masterFileList.map { it.toHapi() })
    }
    if (contactCount > 0) {
      hapiValue.setContact(contactList.map { it.toHapi() })
    }
    if (clinicalTrialCount > 0) {
      hapiValue.setClinicalTrial(clinicalTrialList.map { it.toHapi() })
    }
    if (nameCount > 0) {
      hapiValue.setName(nameList.map { it.toHapi() })
    }
    if (crossReferenceCount > 0) {
      hapiValue.setCrossReference(crossReferenceList.map { it.toHapi() })
    }
    if (manufacturingBusinessOperationCount > 0) {
      hapiValue.setManufacturingBusinessOperation(manufacturingBusinessOperationList.map { it.toHapi() })
    }
    if (specialDesignationCount > 0) {
      hapiValue.setSpecialDesignation(specialDesignationList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MedicinalProduct.toProto(): MedicinalProduct {
    val protoValue = MedicinalProduct.newBuilder()
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
    if (hasDomain()) {
      protoValue.setDomain(domain.toProto())
    }
    if (hasCombinedPharmaceuticalDoseForm()) {
      protoValue.setCombinedPharmaceuticalDoseForm(combinedPharmaceuticalDoseForm.toProto())
    }
    if (hasLegalStatusOfSupply()) {
      protoValue.setLegalStatusOfSupply(legalStatusOfSupply.toProto())
    }
    if (hasAdditionalMonitoringIndicator()) {
      protoValue.setAdditionalMonitoringIndicator(additionalMonitoringIndicator.toProto())
    }
    if (hasSpecialMeasures()) {
      protoValue.addAllSpecialMeasures(specialMeasures.map { it.toProto() })
    }
    if (hasPaediatricUseIndicator()) {
      protoValue.setPaediatricUseIndicator(paediatricUseIndicator.toProto())
    }
    if (hasProductClassification()) {
      protoValue.addAllProductClassification(productClassification.map { it.toProto() })
    }
    if (hasMarketingStatus()) {
      protoValue.addAllMarketingStatus(marketingStatus.map { it.toProto() })
    }
    if (hasPharmaceuticalProduct()) {
      protoValue.addAllPharmaceuticalProduct(pharmaceuticalProduct.map { it.toProto() })
    }
    if (hasPackagedMedicinalProduct()) {
      protoValue.addAllPackagedMedicinalProduct(packagedMedicinalProduct.map { it.toProto() })
    }
    if (hasAttachedDocument()) {
      protoValue.addAllAttachedDocument(attachedDocument.map { it.toProto() })
    }
    if (hasMasterFile()) {
      protoValue.addAllMasterFile(masterFile.map { it.toProto() })
    }
    if (hasContact()) {
      protoValue.addAllContact(contact.map { it.toProto() })
    }
    if (hasClinicalTrial()) {
      protoValue.addAllClinicalTrial(clinicalTrial.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.addAllName(name.map { it.toProto() })
    }
    if (hasCrossReference()) {
      protoValue.addAllCrossReference(crossReference.map { it.toProto() })
    }
    if (hasManufacturingBusinessOperation()) {
      protoValue.addAllManufacturingBusinessOperation(manufacturingBusinessOperation.map { it.toProto() })
    }
    if (hasSpecialDesignation()) {
      protoValue.addAllSpecialDesignation(specialDesignation.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameComponent.toProto():
      MedicinalProduct.Name {
    val protoValue = MedicinalProduct.Name.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasProductName()) {
      protoValue.setProductName(productNameElement.toProto())
    }
    if (hasNamePart()) {
      protoValue.addAllNamePart(namePart.map { it.toProto() })
    }
    if (hasCountryLanguage()) {
      protoValue.addAllCountryLanguage(countryLanguage.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameNamePartComponent.toProto():
      MedicinalProduct.Name.NamePart {
    val protoValue = MedicinalProduct.Name.NamePart.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasPart()) {
      protoValue.setPart(partElement.toProto())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameCountryLanguageComponent.toProto():
      MedicinalProduct.Name.CountryLanguage {
    val protoValue = MedicinalProduct.Name.CountryLanguage.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCountry()) {
      protoValue.setCountry(country.toProto())
    }
    if (hasJurisdiction()) {
      protoValue.setJurisdiction(jurisdiction.toProto())
    }
    if (hasLanguage()) {
      protoValue.setLanguage(language.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductManufacturingBusinessOperationComponent.toProto():
      MedicinalProduct.ManufacturingBusinessOperation {
    val protoValue = MedicinalProduct.ManufacturingBusinessOperation.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasOperationType()) {
      protoValue.setOperationType(operationType.toProto())
    }
    if (hasAuthorisationReferenceNumber()) {
      protoValue.setAuthorisationReferenceNumber(authorisationReferenceNumber.toProto())
    }
    if (hasEffectiveDate()) {
      protoValue.setEffectiveDate(effectiveDateElement.toProto())
    }
    if (hasConfidentialityIndicator()) {
      protoValue.setConfidentialityIndicator(confidentialityIndicator.toProto())
    }
    if (hasManufacturer()) {
      protoValue.addAllManufacturer(manufacturer.map { it.toProto() })
    }
    if (hasRegulator()) {
      protoValue.setRegulator(regulator.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductSpecialDesignationComponent.toProto():
      MedicinalProduct.SpecialDesignation {
    val protoValue = MedicinalProduct.SpecialDesignation.newBuilder()
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
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasIntendedUse()) {
      protoValue.setIntendedUse(intendedUse.toProto())
    }
    if (hasIndication()) {
      protoValue.setIndication(indication.medicinalProductSpecialDesignationIndicationToProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(status.toProto())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasSpecies()) {
      protoValue.setSpecies(species.toProto())
    }
    return protoValue.build()
  }

  private fun MedicinalProduct.Name.toHapi():
      org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameComponent {
    val hapiValue = org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasProductName()) {
      hapiValue.setProductNameElement(productName.toHapi())
    }
    if (namePartCount > 0) {
      hapiValue.setNamePart(namePartList.map { it.toHapi() })
    }
    if (countryLanguageCount > 0) {
      hapiValue.setCountryLanguage(countryLanguageList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun MedicinalProduct.Name.NamePart.toHapi():
      org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameNamePartComponent {
    val hapiValue = org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameNamePartComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasPart()) {
      hapiValue.setPartElement(part.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    return hapiValue
  }

  private fun MedicinalProduct.Name.CountryLanguage.toHapi():
      org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameCountryLanguageComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameCountryLanguageComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCountry()) {
      hapiValue.setCountry(country.toHapi())
    }
    if (hasJurisdiction()) {
      hapiValue.setJurisdiction(jurisdiction.toHapi())
    }
    if (hasLanguage()) {
      hapiValue.setLanguage(language.toHapi())
    }
    return hapiValue
  }

  private fun MedicinalProduct.ManufacturingBusinessOperation.toHapi():
      org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductManufacturingBusinessOperationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductManufacturingBusinessOperationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasOperationType()) {
      hapiValue.setOperationType(operationType.toHapi())
    }
    if (hasAuthorisationReferenceNumber()) {
      hapiValue.setAuthorisationReferenceNumber(authorisationReferenceNumber.toHapi())
    }
    if (hasEffectiveDate()) {
      hapiValue.setEffectiveDateElement(effectiveDate.toHapi())
    }
    if (hasConfidentialityIndicator()) {
      hapiValue.setConfidentialityIndicator(confidentialityIndicator.toHapi())
    }
    if (manufacturerCount > 0) {
      hapiValue.setManufacturer(manufacturerList.map { it.toHapi() })
    }
    if (hasRegulator()) {
      hapiValue.setRegulator(regulator.toHapi())
    }
    return hapiValue
  }

  private fun MedicinalProduct.SpecialDesignation.toHapi():
      org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductSpecialDesignationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductSpecialDesignationComponent()
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
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasIntendedUse()) {
      hapiValue.setIntendedUse(intendedUse.toHapi())
    }
    if (hasIndication()) {
      hapiValue.setIndication(indication.medicinalProductSpecialDesignationIndicationToHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(status.toHapi())
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasSpecies()) {
      hapiValue.setSpecies(species.toHapi())
    }
    return hapiValue
  }
}
