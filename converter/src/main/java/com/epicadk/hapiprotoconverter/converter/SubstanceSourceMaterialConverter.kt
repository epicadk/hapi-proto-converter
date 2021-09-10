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
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.SubstanceSourceMaterial
import com.google.fhir.r4.core.SubstanceSourceMaterial.Organism

public object SubstanceSourceMaterialConverter {
  public fun SubstanceSourceMaterial.toHapi(): org.hl7.fhir.r4.model.SubstanceSourceMaterial {
    val hapiValue = org.hl7.fhir.r4.model.SubstanceSourceMaterial()
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
    if (hasSourceMaterialClass()) {
      hapiValue.setSourceMaterialClass(sourceMaterialClass.toHapi())
    }
    if (hasSourceMaterialType()) {
      hapiValue.setSourceMaterialType(sourceMaterialType.toHapi())
    }
    if (hasSourceMaterialState()) {
      hapiValue.setSourceMaterialState(sourceMaterialState.toHapi())
    }
    if (hasOrganismId()) {
      hapiValue.setOrganismId(organismId.toHapi())
    }
    if (hasOrganismName()) {
      hapiValue.setOrganismNameElement(organismName.toHapi())
    }
    if (parentSubstanceIdCount > 0) {
      hapiValue.setParentSubstanceId(parentSubstanceIdList.map { it.toHapi() })
    }
    if (parentSubstanceNameCount > 0) {
      hapiValue.setParentSubstanceName(parentSubstanceNameList.map { it.toHapi() })
    }
    if (countryOfOriginCount > 0) {
      hapiValue.setCountryOfOrigin(countryOfOriginList.map { it.toHapi() })
    }
    if (geographicalLocationCount > 0) {
      hapiValue.setGeographicalLocation(geographicalLocationList.map { it.toHapi() })
    }
    if (hasDevelopmentStage()) {
      hapiValue.setDevelopmentStage(developmentStage.toHapi())
    }
    if (fractionDescriptionCount > 0) {
      hapiValue.setFractionDescription(fractionDescriptionList.map { it.toHapi() })
    }
    if (hasOrganism()) {
      hapiValue.setOrganism(organism.toHapi())
    }
    if (partDescriptionCount > 0) {
      hapiValue.setPartDescription(partDescriptionList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.SubstanceSourceMaterial.toProto(): SubstanceSourceMaterial {
    val protoValue = SubstanceSourceMaterial.newBuilder()
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
    if (hasSourceMaterialClass()) {
      protoValue.setSourceMaterialClass(sourceMaterialClass.toProto())
    }
    if (hasSourceMaterialType()) {
      protoValue.setSourceMaterialType(sourceMaterialType.toProto())
    }
    if (hasSourceMaterialState()) {
      protoValue.setSourceMaterialState(sourceMaterialState.toProto())
    }
    if (hasOrganismId()) {
      protoValue.setOrganismId(organismId.toProto())
    }
    if (hasOrganismName()) {
      protoValue.setOrganismName(organismNameElement.toProto())
    }
    if (hasParentSubstanceId()) {
      protoValue.addAllParentSubstanceId(parentSubstanceId.map { it.toProto() })
    }
    if (hasParentSubstanceName()) {
      protoValue.addAllParentSubstanceName(parentSubstanceName.map { it.toProto() })
    }
    if (hasCountryOfOrigin()) {
      protoValue.addAllCountryOfOrigin(countryOfOrigin.map { it.toProto() })
    }
    if (hasGeographicalLocation()) {
      protoValue.addAllGeographicalLocation(geographicalLocation.map { it.toProto() })
    }
    if (hasDevelopmentStage()) {
      protoValue.setDevelopmentStage(developmentStage.toProto())
    }
    if (hasFractionDescription()) {
      protoValue.addAllFractionDescription(fractionDescription.map { it.toProto() })
    }
    if (hasOrganism()) {
      protoValue.setOrganism(organism.toProto())
    }
    if (hasPartDescription()) {
      protoValue.addAllPartDescription(partDescription.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialFractionDescriptionComponent.toProto():
      SubstanceSourceMaterial.FractionDescription {
    val protoValue = SubstanceSourceMaterial.FractionDescription.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasFraction()) {
      protoValue.setFraction(fractionElement.toProto())
    }
    if (hasMaterialType()) {
      protoValue.setMaterialType(materialType.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismComponent.toProto():
      SubstanceSourceMaterial.Organism {
    val protoValue = SubstanceSourceMaterial.Organism.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasFamily()) {
      protoValue.setFamily(family.toProto())
    }
    if (hasGenus()) {
      protoValue.setGenus(genus.toProto())
    }
    if (hasSpecies()) {
      protoValue.setSpecies(species.toProto())
    }
    if (hasIntraspecificType()) {
      protoValue.setIntraspecificType(intraspecificType.toProto())
    }
    if (hasIntraspecificDescription()) {
      protoValue.setIntraspecificDescription(intraspecificDescriptionElement.toProto())
    }
    if (hasAuthor()) {
      protoValue.addAllAuthor(author.map { it.toProto() })
    }
    if (hasHybrid()) {
      protoValue.setHybrid(hybrid.toProto())
    }
    if (hasOrganismGeneral()) {
      protoValue.setOrganismGeneral(organismGeneral.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismAuthorComponent.toProto():
      SubstanceSourceMaterial.Organism.Author {
    val protoValue = SubstanceSourceMaterial.Organism.Author.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasAuthorType()) {
      protoValue.setAuthorType(authorType.toProto())
    }
    if (hasAuthorDescription()) {
      protoValue.setAuthorDescription(authorDescriptionElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismHybridComponent.toProto():
      SubstanceSourceMaterial.Organism.Hybrid {
    val protoValue = SubstanceSourceMaterial.Organism.Hybrid.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasMaternalOrganismId()) {
      protoValue.setMaternalOrganismId(maternalOrganismIdElement.toProto())
    }
    if (hasMaternalOrganismName()) {
      protoValue.setMaternalOrganismName(maternalOrganismNameElement.toProto())
    }
    if (hasPaternalOrganismId()) {
      protoValue.setPaternalOrganismId(paternalOrganismIdElement.toProto())
    }
    if (hasPaternalOrganismName()) {
      protoValue.setPaternalOrganismName(paternalOrganismNameElement.toProto())
    }
    if (hasHybridType()) {
      protoValue.setHybridType(hybridType.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismOrganismGeneralComponent.toProto():
      SubstanceSourceMaterial.Organism.OrganismGeneral {
    val protoValue = SubstanceSourceMaterial.Organism.OrganismGeneral.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasKingdom()) {
      protoValue.setKingdom(kingdom.toProto())
    }
    if (hasPhylum()) {
      protoValue.setPhylum(phylum.toProto())
    }
    if (hasClass_()) {
      protoValue.setClassValue(class_.toProto())
    }
    if (hasOrder()) {
      protoValue.setOrder(order.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialPartDescriptionComponent.toProto():
      SubstanceSourceMaterial.PartDescription {
    val protoValue = SubstanceSourceMaterial.PartDescription.newBuilder()
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
      protoValue.setPart(part.toProto())
    }
    if (hasPartLocation()) {
      protoValue.setPartLocation(partLocation.toProto())
    }
    return protoValue.build()
  }

  private fun SubstanceSourceMaterial.FractionDescription.toHapi():
      org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialFractionDescriptionComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialFractionDescriptionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasFraction()) {
      hapiValue.setFractionElement(fraction.toHapi())
    }
    if (hasMaterialType()) {
      hapiValue.setMaterialType(materialType.toHapi())
    }
    return hapiValue
  }

  private fun SubstanceSourceMaterial.Organism.toHapi():
      org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasFamily()) {
      hapiValue.setFamily(family.toHapi())
    }
    if (hasGenus()) {
      hapiValue.setGenus(genus.toHapi())
    }
    if (hasSpecies()) {
      hapiValue.setSpecies(species.toHapi())
    }
    if (hasIntraspecificType()) {
      hapiValue.setIntraspecificType(intraspecificType.toHapi())
    }
    if (hasIntraspecificDescription()) {
      hapiValue.setIntraspecificDescriptionElement(intraspecificDescription.toHapi())
    }
    if (authorCount > 0) {
      hapiValue.setAuthor(authorList.map { it.toHapi() })
    }
    if (hasHybrid()) {
      hapiValue.setHybrid(hybrid.toHapi())
    }
    if (hasOrganismGeneral()) {
      hapiValue.setOrganismGeneral(organismGeneral.toHapi())
    }
    return hapiValue
  }

  private fun SubstanceSourceMaterial.Organism.Author.toHapi():
      org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismAuthorComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismAuthorComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasAuthorType()) {
      hapiValue.setAuthorType(authorType.toHapi())
    }
    if (hasAuthorDescription()) {
      hapiValue.setAuthorDescriptionElement(authorDescription.toHapi())
    }
    return hapiValue
  }

  private fun SubstanceSourceMaterial.Organism.Hybrid.toHapi():
      org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismHybridComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismHybridComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasMaternalOrganismId()) {
      hapiValue.setMaternalOrganismIdElement(maternalOrganismId.toHapi())
    }
    if (hasMaternalOrganismName()) {
      hapiValue.setMaternalOrganismNameElement(maternalOrganismName.toHapi())
    }
    if (hasPaternalOrganismId()) {
      hapiValue.setPaternalOrganismIdElement(paternalOrganismId.toHapi())
    }
    if (hasPaternalOrganismName()) {
      hapiValue.setPaternalOrganismNameElement(paternalOrganismName.toHapi())
    }
    if (hasHybridType()) {
      hapiValue.setHybridType(hybridType.toHapi())
    }
    return hapiValue
  }

  private fun SubstanceSourceMaterial.Organism.OrganismGeneral.toHapi():
      org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismOrganismGeneralComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialOrganismOrganismGeneralComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasKingdom()) {
      hapiValue.setKingdom(kingdom.toHapi())
    }
    if (hasPhylum()) {
      hapiValue.setPhylum(phylum.toHapi())
    }
    if (hasClassValue()) {
      hapiValue.setClass_(classValue.toHapi())
    }
    if (hasOrder()) {
      hapiValue.setOrder(order.toHapi())
    }
    return hapiValue
  }

  private fun SubstanceSourceMaterial.PartDescription.toHapi():
      org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialPartDescriptionComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceSourceMaterial.SubstanceSourceMaterialPartDescriptionComponent()
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
      hapiValue.setPart(part.toHapi())
    }
    if (hasPartLocation()) {
      hapiValue.setPartLocation(partLocation.toHapi())
    }
    return hapiValue
  }
}
