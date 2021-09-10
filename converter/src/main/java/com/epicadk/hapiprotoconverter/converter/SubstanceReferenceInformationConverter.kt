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
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.SubstanceReferenceInformation
import com.google.fhir.r4.core.SubstanceReferenceInformation.Target
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Quantity
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object SubstanceReferenceInformationConverter {
  private
      fun SubstanceReferenceInformation.Target.AmountX.substanceReferenceInformationTargetAmountToHapi():
      Type {
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for SubstanceReferenceInformation.target.amount[x]")
  }

  private fun Type.substanceReferenceInformationTargetAmountToProto():
      SubstanceReferenceInformation.Target.AmountX {
    val protoValue = SubstanceReferenceInformation.Target.AmountX.newBuilder()
    if (this is Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  public fun SubstanceReferenceInformation.toHapi():
      org.hl7.fhir.r4.model.SubstanceReferenceInformation {
    val hapiValue = org.hl7.fhir.r4.model.SubstanceReferenceInformation()
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
    if (hasComment()) {
      hapiValue.setCommentElement(comment.toHapi())
    }
    if (geneCount > 0) {
      hapiValue.setGene(geneList.map { it.toHapi() })
    }
    if (geneElementCount > 0) {
      hapiValue.setGeneElement(geneElementList.map { it.toHapi() })
    }
    if (classificationCount > 0) {
      hapiValue.setClassification(classificationList.map { it.toHapi() })
    }
    if (targetCount > 0) {
      hapiValue.setTarget(targetList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.SubstanceReferenceInformation.toProto():
      SubstanceReferenceInformation {
    val protoValue = SubstanceReferenceInformation.newBuilder()
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
    if (hasComment()) {
      protoValue.setComment(commentElement.toProto())
    }
    if (hasGene()) {
      protoValue.addAllGene(gene.map { it.toProto() })
    }
    if (hasGeneElement()) {
      protoValue.addAllGeneElement(geneElement.map { it.toProto() })
    }
    if (hasClassification()) {
      protoValue.addAllClassification(classification.map { it.toProto() })
    }
    if (hasTarget()) {
      protoValue.addAllTarget(target.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationGeneComponent.toProto():
      SubstanceReferenceInformation.Gene {
    val protoValue = SubstanceReferenceInformation.Gene.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasGeneSequenceOrigin()) {
      protoValue.setGeneSequenceOrigin(geneSequenceOrigin.toProto())
    }
    if (hasGene()) {
      protoValue.setGene(gene.toProto())
    }
    if (hasSource()) {
      protoValue.addAllSource(source.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationGeneElementComponent.toProto():
      SubstanceReferenceInformation.GeneElement {
    val protoValue = SubstanceReferenceInformation.GeneElement.newBuilder()
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
    if (hasElement()) {
      protoValue.setElement(element.toProto())
    }
    if (hasSource()) {
      protoValue.addAllSource(source.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationClassificationComponent.toProto():
      SubstanceReferenceInformation.Classification {
    val protoValue = SubstanceReferenceInformation.Classification.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDomain()) {
      protoValue.setDomain(domain.toProto())
    }
    if (hasClassification()) {
      protoValue.setClassification(classification.toProto())
    }
    if (hasSubtype()) {
      protoValue.addAllSubtype(subtype.map { it.toProto() })
    }
    if (hasSource()) {
      protoValue.addAllSource(source.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationTargetComponent.toProto():
      SubstanceReferenceInformation.Target {
    val protoValue = SubstanceReferenceInformation.Target.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasTarget()) {
      protoValue.setTarget(target.toProto())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasInteraction()) {
      protoValue.setInteraction(interaction.toProto())
    }
    if (hasOrganism()) {
      protoValue.setOrganism(organism.toProto())
    }
    if (hasOrganismType()) {
      protoValue.setOrganismType(organismType.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount(amount.substanceReferenceInformationTargetAmountToProto())
    }
    if (hasAmountType()) {
      protoValue.setAmountType(amountType.toProto())
    }
    if (hasSource()) {
      protoValue.addAllSource(source.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun SubstanceReferenceInformation.Gene.toHapi():
      org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationGeneComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationGeneComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasGeneSequenceOrigin()) {
      hapiValue.setGeneSequenceOrigin(geneSequenceOrigin.toHapi())
    }
    if (hasGene()) {
      hapiValue.setGene(gene.toHapi())
    }
    if (sourceCount > 0) {
      hapiValue.setSource(sourceList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun SubstanceReferenceInformation.GeneElement.toHapi():
      org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationGeneElementComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationGeneElementComponent()
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
    if (hasElement()) {
      hapiValue.setElement(element.toHapi())
    }
    if (sourceCount > 0) {
      hapiValue.setSource(sourceList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun SubstanceReferenceInformation.Classification.toHapi():
      org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationClassificationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationClassificationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasDomain()) {
      hapiValue.setDomain(domain.toHapi())
    }
    if (hasClassification()) {
      hapiValue.setClassification(classification.toHapi())
    }
    if (subtypeCount > 0) {
      hapiValue.setSubtype(subtypeList.map { it.toHapi() })
    }
    if (sourceCount > 0) {
      hapiValue.setSource(sourceList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun SubstanceReferenceInformation.Target.toHapi():
      org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationTargetComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceReferenceInformation.SubstanceReferenceInformationTargetComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasTarget()) {
      hapiValue.setTarget(target.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasInteraction()) {
      hapiValue.setInteraction(interaction.toHapi())
    }
    if (hasOrganism()) {
      hapiValue.setOrganism(organism.toHapi())
    }
    if (hasOrganismType()) {
      hapiValue.setOrganismType(organismType.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.substanceReferenceInformationTargetAmountToHapi())
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
