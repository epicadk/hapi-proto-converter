package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.SubstanceSpecification
import com.google.fhir.r4.core.SubstanceSpecification.Moiety
import com.google.fhir.r4.core.SubstanceSpecification.Name
import com.google.fhir.r4.core.SubstanceSpecification.Property
import com.google.fhir.r4.core.SubstanceSpecification.Relationship
import com.google.fhir.r4.core.SubstanceSpecification.Structure
import com.google.fhir.r4.core.SubstanceSpecification.Structure.Isotope
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.Quantity
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.Ratio
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object SubstanceSpecificationConverter {
  private fun SubstanceSpecification.Moiety.AmountX.substanceSpecificationMoietyAmountToHapi():
      Type {
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for SubstanceSpecification.moiety.amount[x]")
  }

  private fun Type.substanceSpecificationMoietyAmountToProto():
      SubstanceSpecification.Moiety.AmountX {
    val protoValue = SubstanceSpecification.Moiety.AmountX.newBuilder()
    if (this is Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun SubstanceSpecification.Property.DefiningSubstanceX.substanceSpecificationPropertyDefiningSubstanceToHapi():
      Type {
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for SubstanceSpecification.property.definingSubstance[x]")
  }

  private fun Type.substanceSpecificationPropertyDefiningSubstanceToProto():
      SubstanceSpecification.Property.DefiningSubstanceX {
    val protoValue = SubstanceSpecification.Property.DefiningSubstanceX.newBuilder()
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    return protoValue.build()
  }

  private fun SubstanceSpecification.Property.AmountX.substanceSpecificationPropertyAmountToHapi():
      Type {
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for SubstanceSpecification.property.amount[x]")
  }

  private fun Type.substanceSpecificationPropertyAmountToProto():
      SubstanceSpecification.Property.AmountX {
    val protoValue = SubstanceSpecification.Property.AmountX.newBuilder()
    if (this is Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun SubstanceSpecification.Relationship.SubstanceX.substanceSpecificationRelationshipSubstanceToHapi():
      Type {
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for SubstanceSpecification.relationship.substance[x]")
  }

  private fun Type.substanceSpecificationRelationshipSubstanceToProto():
      SubstanceSpecification.Relationship.SubstanceX {
    val protoValue = SubstanceSpecification.Relationship.SubstanceX.newBuilder()
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun SubstanceSpecification.Relationship.AmountX.substanceSpecificationRelationshipAmountToHapi():
      Type {
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasRatio()) {
      return (this.getRatio()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for SubstanceSpecification.relationship.amount[x]")
  }

  private fun Type.substanceSpecificationRelationshipAmountToProto():
      SubstanceSpecification.Relationship.AmountX {
    val protoValue = SubstanceSpecification.Relationship.AmountX.newBuilder()
    if (this is Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is Ratio) {
      protoValue.setRatio(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  public fun SubstanceSpecification.toHapi(): org.hl7.fhir.r4.model.SubstanceSpecification {
    val hapiValue = org.hl7.fhir.r4.model.SubstanceSpecification()
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
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(status.toHapi())
    }
    if (hasDomain()) {
      hapiValue.setDomain(domain.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (sourceCount > 0) {
      hapiValue.setSource(sourceList.map { it.toHapi() })
    }
    if (hasComment()) {
      hapiValue.setCommentElement(comment.toHapi())
    }
    if (moietyCount > 0) {
      hapiValue.setMoiety(moietyList.map { it.toHapi() })
    }
    if (propertyCount > 0) {
      hapiValue.setProperty(propertyList.map { it.toHapi() })
    }
    if (hasReferenceInformation()) {
      hapiValue.setReferenceInformation(referenceInformation.toHapi())
    }
    if (hasStructure()) {
      hapiValue.setStructure(structure.toHapi())
    }
    if (codeCount > 0) {
      hapiValue.setCode(codeList.map { it.toHapi() })
    }
    if (nameCount > 0) {
      hapiValue.setName(nameList.map { it.toHapi() })
    }
    if (relationshipCount > 0) {
      hapiValue.setRelationship(relationshipList.map { it.toHapi() })
    }
    if (hasNucleicAcid()) {
      hapiValue.setNucleicAcid(nucleicAcid.toHapi())
    }
    if (hasPolymer()) {
      hapiValue.setPolymer(polymer.toHapi())
    }
    if (hasProtein()) {
      hapiValue.setProtein(protein.toHapi())
    }
    if (hasSourceMaterial()) {
      hapiValue.setSourceMaterial(sourceMaterial.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.SubstanceSpecification.toProto(): SubstanceSpecification {
    val protoValue = SubstanceSpecification.newBuilder()
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
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(status.toProto())
    }
    if (hasDomain()) {
      protoValue.setDomain(domain.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasSource()) {
      protoValue.addAllSource(source.map { it.toProto() })
    }
    if (hasComment()) {
      protoValue.setComment(commentElement.toProto())
    }
    if (hasMoiety()) {
      protoValue.addAllMoiety(moiety.map { it.toProto() })
    }
    if (hasProperty()) {
      protoValue.addAllProperty(property.map { it.toProto() })
    }
    if (hasReferenceInformation()) {
      protoValue.setReferenceInformation(referenceInformation.toProto())
    }
    if (hasStructure()) {
      protoValue.setStructure(structure.toProto())
    }
    if (hasCode()) {
      protoValue.addAllCode(code.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.addAllName(name.map { it.toProto() })
    }
    if (hasRelationship()) {
      protoValue.addAllRelationship(relationship.map { it.toProto() })
    }
    if (hasNucleicAcid()) {
      protoValue.setNucleicAcid(nucleicAcid.toProto())
    }
    if (hasPolymer()) {
      protoValue.setPolymer(polymer.toProto())
    }
    if (hasProtein()) {
      protoValue.setProtein(protein.toProto())
    }
    if (hasSourceMaterial()) {
      protoValue.setSourceMaterial(sourceMaterial.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationMoietyComponent.toProto():
      SubstanceSpecification.Moiety {
    val protoValue = SubstanceSpecification.Moiety.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasRole()) {
      protoValue.setRole(role.toProto())
    }
    if (hasIdentifier()) {
      protoValue.setIdentifier(identifier.toProto())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasStereochemistry()) {
      protoValue.setStereochemistry(stereochemistry.toProto())
    }
    if (hasOpticalActivity()) {
      protoValue.setOpticalActivity(opticalActivity.toProto())
    }
    if (hasMolecularFormula()) {
      protoValue.setMolecularFormula(molecularFormulaElement.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount(amount.substanceSpecificationMoietyAmountToProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationPropertyComponent.toProto():
      SubstanceSpecification.Property {
    val protoValue = SubstanceSpecification.Property.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCategory()) {
      protoValue.setCategory(category.toProto())
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasParameters()) {
      protoValue.setParameters(parametersElement.toProto())
    }
    if (hasDefiningSubstance()) {
      protoValue.setDefiningSubstance(definingSubstance.substanceSpecificationPropertyDefiningSubstanceToProto())
    }
    if (hasAmount()) {
      protoValue.setAmount(amount.substanceSpecificationPropertyAmountToProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureComponent.toProto():
      SubstanceSpecification.Structure {
    val protoValue = SubstanceSpecification.Structure.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasStereochemistry()) {
      protoValue.setStereochemistry(stereochemistry.toProto())
    }
    if (hasOpticalActivity()) {
      protoValue.setOpticalActivity(opticalActivity.toProto())
    }
    if (hasMolecularFormula()) {
      protoValue.setMolecularFormula(molecularFormulaElement.toProto())
    }
    if (hasMolecularFormulaByMoiety()) {
      protoValue.setMolecularFormulaByMoiety(molecularFormulaByMoietyElement.toProto())
    }
    if (hasIsotope()) {
      protoValue.addAllIsotope(isotope.map { it.toProto() })
    }
    if (hasSource()) {
      protoValue.addAllSource(source.map { it.toProto() })
    }
    if (hasRepresentation()) {
      protoValue.addAllRepresentation(representation.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeComponent.toProto():
      SubstanceSpecification.Structure.Isotope {
    val protoValue = SubstanceSpecification.Structure.Isotope.newBuilder()
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
    if (hasName()) {
      protoValue.setName(name.toProto())
    }
    if (hasSubstitution()) {
      protoValue.setSubstitution(substitution.toProto())
    }
    if (hasHalfLife()) {
      protoValue.setHalfLife(halfLife.toProto())
    }
    if (hasMolecularWeight()) {
      protoValue.setMolecularWeight(molecularWeight.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeMolecularWeightComponent.toProto():
      SubstanceSpecification.Structure.Isotope.MolecularWeight {
    val protoValue = SubstanceSpecification.Structure.Isotope.MolecularWeight.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasMethod()) {
      protoValue.setMethod(method.toProto())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount(amount.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureRepresentationComponent.toProto():
      SubstanceSpecification.Structure.Representation {
    val protoValue = SubstanceSpecification.Structure.Representation.newBuilder()
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
      protoValue.setType(type.toProto())
    }
    if (hasRepresentation()) {
      protoValue.setRepresentation(representationElement.toProto())
    }
    if (hasAttachment()) {
      protoValue.setAttachment(attachment.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationCodeComponent.toProto():
      SubstanceSpecification.CodeType {
    val protoValue = SubstanceSpecification.CodeType.newBuilder()
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
      protoValue.setCode(code.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(status.toProto())
    }
    if (hasStatusDate()) {
      protoValue.setStatusDate(statusDateElement.toProto())
    }
    if (hasComment()) {
      protoValue.setComment(commentElement.toProto())
    }
    if (hasSource()) {
      protoValue.addAllSource(source.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationNameComponent.toProto():
      SubstanceSpecification.Name {
    val protoValue = SubstanceSpecification.Name.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
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
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(status.toProto())
    }
    if (hasPreferred()) {
      protoValue.setPreferred(preferredElement.toProto())
    }
    if (hasLanguage()) {
      protoValue.addAllLanguage(language.map { it.toProto() })
    }
    if (hasDomain()) {
      protoValue.addAllDomain(domain.map { it.toProto() })
    }
    if (hasJurisdiction()) {
      protoValue.addAllJurisdiction(jurisdiction.map { it.toProto() })
    }
    if (hasOfficial()) {
      protoValue.addAllOfficial(official.map { it.toProto() })
    }
    if (hasSource()) {
      protoValue.addAllSource(source.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationNameOfficialComponent.toProto():
      SubstanceSpecification.Name.Official {
    val protoValue = SubstanceSpecification.Name.Official.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasAuthority()) {
      protoValue.setAuthority(authority.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(status.toProto())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationRelationshipComponent.toProto():
      SubstanceSpecification.Relationship {
    val protoValue = SubstanceSpecification.Relationship.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSubstance()) {
      protoValue.setSubstance(substance.substanceSpecificationRelationshipSubstanceToProto())
    }
    if (hasRelationship()) {
      protoValue.setRelationship(relationship.toProto())
    }
    if (hasIsDefining()) {
      protoValue.setIsDefining(isDefiningElement.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount(amount.substanceSpecificationRelationshipAmountToProto())
    }
    if (hasAmountRatioLowLimit()) {
      protoValue.setAmountRatioLowLimit(amountRatioLowLimit.toProto())
    }
    if (hasAmountType()) {
      protoValue.setAmountType(amountType.toProto())
    }
    if (hasSource()) {
      protoValue.addAllSource(source.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun SubstanceSpecification.Moiety.toHapi():
      org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationMoietyComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationMoietyComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasRole()) {
      hapiValue.setRole(role.toHapi())
    }
    if (hasIdentifier()) {
      hapiValue.setIdentifier(identifier.toHapi())
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasStereochemistry()) {
      hapiValue.setStereochemistry(stereochemistry.toHapi())
    }
    if (hasOpticalActivity()) {
      hapiValue.setOpticalActivity(opticalActivity.toHapi())
    }
    if (hasMolecularFormula()) {
      hapiValue.setMolecularFormulaElement(molecularFormula.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.substanceSpecificationMoietyAmountToHapi())
    }
    return hapiValue
  }

  private fun SubstanceSpecification.Property.toHapi():
      org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationPropertyComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationPropertyComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCategory()) {
      hapiValue.setCategory(category.toHapi())
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasParameters()) {
      hapiValue.setParametersElement(parameters.toHapi())
    }
    if (hasDefiningSubstance()) {
      hapiValue.setDefiningSubstance(definingSubstance.substanceSpecificationPropertyDefiningSubstanceToHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.substanceSpecificationPropertyAmountToHapi())
    }
    return hapiValue
  }

  private fun SubstanceSpecification.Structure.toHapi():
      org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasStereochemistry()) {
      hapiValue.setStereochemistry(stereochemistry.toHapi())
    }
    if (hasOpticalActivity()) {
      hapiValue.setOpticalActivity(opticalActivity.toHapi())
    }
    if (hasMolecularFormula()) {
      hapiValue.setMolecularFormulaElement(molecularFormula.toHapi())
    }
    if (hasMolecularFormulaByMoiety()) {
      hapiValue.setMolecularFormulaByMoietyElement(molecularFormulaByMoiety.toHapi())
    }
    if (isotopeCount > 0) {
      hapiValue.setIsotope(isotopeList.map { it.toHapi() })
    }
    if (sourceCount > 0) {
      hapiValue.setSource(sourceList.map { it.toHapi() })
    }
    if (representationCount > 0) {
      hapiValue.setRepresentation(representationList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun SubstanceSpecification.Structure.Isotope.toHapi():
      org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeComponent()
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
    if (hasName()) {
      hapiValue.setName(name.toHapi())
    }
    if (hasSubstitution()) {
      hapiValue.setSubstitution(substitution.toHapi())
    }
    if (hasHalfLife()) {
      hapiValue.setHalfLife(halfLife.toHapi())
    }
    if (hasMolecularWeight()) {
      hapiValue.setMolecularWeight(molecularWeight.toHapi())
    }
    return hapiValue
  }

  private fun SubstanceSpecification.Structure.Isotope.MolecularWeight.toHapi():
      org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeMolecularWeightComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeMolecularWeightComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasMethod()) {
      hapiValue.setMethod(method.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.toHapi())
    }
    return hapiValue
  }

  private fun SubstanceSpecification.Structure.Representation.toHapi():
      org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureRepresentationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureRepresentationComponent()
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
      hapiValue.setType(type.toHapi())
    }
    if (hasRepresentation()) {
      hapiValue.setRepresentationElement(representation.toHapi())
    }
    if (hasAttachment()) {
      hapiValue.setAttachment(attachment.toHapi())
    }
    return hapiValue
  }

  private fun SubstanceSpecification.CodeType.toHapi():
      org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationCodeComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationCodeComponent()
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
      hapiValue.setCode(code.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(status.toHapi())
    }
    if (hasStatusDate()) {
      hapiValue.setStatusDateElement(statusDate.toHapi())
    }
    if (hasComment()) {
      hapiValue.setCommentElement(comment.toHapi())
    }
    if (sourceCount > 0) {
      hapiValue.setSource(sourceList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun SubstanceSpecification.Name.toHapi():
      org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationNameComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationNameComponent()
    if (hasId()) {
      hapiValue.id = id.value
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
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(status.toHapi())
    }
    if (hasPreferred()) {
      hapiValue.setPreferredElement(preferred.toHapi())
    }
    if (languageCount > 0) {
      hapiValue.setLanguage(languageList.map { it.toHapi() })
    }
    if (domainCount > 0) {
      hapiValue.setDomain(domainList.map { it.toHapi() })
    }
    if (jurisdictionCount > 0) {
      hapiValue.setJurisdiction(jurisdictionList.map { it.toHapi() })
    }
    if (officialCount > 0) {
      hapiValue.setOfficial(officialList.map { it.toHapi() })
    }
    if (sourceCount > 0) {
      hapiValue.setSource(sourceList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun SubstanceSpecification.Name.Official.toHapi():
      org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationNameOfficialComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationNameOfficialComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasAuthority()) {
      hapiValue.setAuthority(authority.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(status.toHapi())
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    return hapiValue
  }

  private fun SubstanceSpecification.Relationship.toHapi():
      org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationRelationshipComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationRelationshipComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasSubstance()) {
      hapiValue.setSubstance(substance.substanceSpecificationRelationshipSubstanceToHapi())
    }
    if (hasRelationship()) {
      hapiValue.setRelationship(relationship.toHapi())
    }
    if (hasIsDefining()) {
      hapiValue.setIsDefiningElement(isDefining.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.substanceSpecificationRelationshipAmountToHapi())
    }
    if (hasAmountRatioLowLimit()) {
      hapiValue.setAmountRatioLowLimit(amountRatioLowLimit.toHapi())
    }
    if (hasAmountType()) {
      hapiValue.setAmountType(amountType.toHapi())
    }
    if (sourceCount > 0) {
      hapiValue.setSource(sourceList.map { it.toHapi() })
    }
    return hapiValue
  }
}
