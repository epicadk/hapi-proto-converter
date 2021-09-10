package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SubstanceAmountConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SubstanceAmountConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.SubstancePolymer
import com.google.fhir.r4.core.SubstancePolymer.MonomerSet
import com.google.fhir.r4.core.SubstancePolymer.Repeat
import com.google.fhir.r4.core.SubstancePolymer.Repeat.RepeatUnit

public object SubstancePolymerConverter {
  public fun SubstancePolymer.toHapi(): org.hl7.fhir.r4.model.SubstancePolymer {
    val hapiValue = org.hl7.fhir.r4.model.SubstancePolymer()
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
    if (hasClassValue()) {
      hapiValue.setClass_(classValue.toHapi())
    }
    if (hasGeometry()) {
      hapiValue.setGeometry(geometry.toHapi())
    }
    if (copolymerConnectivityCount > 0) {
      hapiValue.setCopolymerConnectivity(copolymerConnectivityList.map { it.toHapi() })
    }
    if (modificationCount > 0) {
      hapiValue.setModification(modificationList.map { it.toHapi() })
    }
    if (monomerSetCount > 0) {
      hapiValue.setMonomerSet(monomerSetList.map { it.toHapi() })
    }
    if (repeatCount > 0) {
      hapiValue.setRepeat(repeatList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.SubstancePolymer.toProto(): SubstancePolymer {
    val protoValue = SubstancePolymer.newBuilder()
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
    if (hasClass_()) {
      protoValue.setClassValue(class_.toProto())
    }
    if (hasGeometry()) {
      protoValue.setGeometry(geometry.toProto())
    }
    if (hasCopolymerConnectivity()) {
      protoValue.addAllCopolymerConnectivity(copolymerConnectivity.map { it.toProto() })
    }
    if (hasModification()) {
      protoValue.addAllModification(modification.map { it.toProto() })
    }
    if (hasMonomerSet()) {
      protoValue.addAllMonomerSet(monomerSet.map { it.toProto() })
    }
    if (hasRepeat()) {
      protoValue.addAllRepeat(repeat.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerMonomerSetComponent.toProto():
      SubstancePolymer.MonomerSet {
    val protoValue = SubstancePolymer.MonomerSet.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasRatioType()) {
      protoValue.setRatioType(ratioType.toProto())
    }
    if (hasStartingMaterial()) {
      protoValue.addAllStartingMaterial(startingMaterial.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerMonomerSetStartingMaterialComponent.toProto():
      SubstancePolymer.MonomerSet.StartingMaterial {
    val protoValue = SubstancePolymer.MonomerSet.StartingMaterial.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasMaterial()) {
      protoValue.setMaterial(material.toProto())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasIsDefining()) {
      protoValue.setIsDefining(isDefiningElement.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount(amount.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatComponent.toProto():
      SubstancePolymer.Repeat {
    val protoValue = SubstancePolymer.Repeat.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasNumberOfUnits()) {
      protoValue.setNumberOfUnits(numberOfUnitsElement.toProto())
    }
    if (hasAverageMolecularFormula()) {
      protoValue.setAverageMolecularFormula(averageMolecularFormulaElement.toProto())
    }
    if (hasRepeatUnitAmountType()) {
      protoValue.setRepeatUnitAmountType(repeatUnitAmountType.toProto())
    }
    if (hasRepeatUnit()) {
      protoValue.addAllRepeatUnit(repeatUnit.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitComponent.toProto():
      SubstancePolymer.Repeat.RepeatUnit {
    val protoValue = SubstancePolymer.Repeat.RepeatUnit.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasOrientationOfPolymerisation()) {
      protoValue.setOrientationOfPolymerisation(orientationOfPolymerisation.toProto())
    }
    if (hasRepeatUnit()) {
      protoValue.setRepeatUnit(repeatUnitElement.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount(amount.toProto())
    }
    if (hasDegreeOfPolymerisation()) {
      protoValue.addAllDegreeOfPolymerisation(degreeOfPolymerisation.map { it.toProto() })
    }
    if (hasStructuralRepresentation()) {
      protoValue.addAllStructuralRepresentation(structuralRepresentation.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationComponent.toProto():
      SubstancePolymer.Repeat.RepeatUnit.DegreeOfPolymerisation {
    val protoValue = SubstancePolymer.Repeat.RepeatUnit.DegreeOfPolymerisation.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDegree()) {
      protoValue.setDegree(degree.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount(amount.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitStructuralRepresentationComponent.toProto():
      SubstancePolymer.Repeat.RepeatUnit.StructuralRepresentation {
    val protoValue = SubstancePolymer.Repeat.RepeatUnit.StructuralRepresentation.newBuilder()
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

  private fun SubstancePolymer.MonomerSet.toHapi():
      org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerMonomerSetComponent {
    val hapiValue = org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerMonomerSetComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasRatioType()) {
      hapiValue.setRatioType(ratioType.toHapi())
    }
    if (startingMaterialCount > 0) {
      hapiValue.setStartingMaterial(startingMaterialList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun SubstancePolymer.MonomerSet.StartingMaterial.toHapi():
      org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerMonomerSetStartingMaterialComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerMonomerSetStartingMaterialComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasMaterial()) {
      hapiValue.setMaterial(material.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasIsDefining()) {
      hapiValue.setIsDefiningElement(isDefining.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.toHapi())
    }
    return hapiValue
  }

  private fun SubstancePolymer.Repeat.toHapi():
      org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatComponent {
    val hapiValue = org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasNumberOfUnits()) {
      hapiValue.setNumberOfUnitsElement(numberOfUnits.toHapi())
    }
    if (hasAverageMolecularFormula()) {
      hapiValue.setAverageMolecularFormulaElement(averageMolecularFormula.toHapi())
    }
    if (hasRepeatUnitAmountType()) {
      hapiValue.setRepeatUnitAmountType(repeatUnitAmountType.toHapi())
    }
    if (repeatUnitCount > 0) {
      hapiValue.setRepeatUnit(repeatUnitList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun SubstancePolymer.Repeat.RepeatUnit.toHapi():
      org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasOrientationOfPolymerisation()) {
      hapiValue.setOrientationOfPolymerisation(orientationOfPolymerisation.toHapi())
    }
    if (hasRepeatUnit()) {
      hapiValue.setRepeatUnitElement(repeatUnit.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.toHapi())
    }
    if (degreeOfPolymerisationCount > 0) {
      hapiValue.setDegreeOfPolymerisation(degreeOfPolymerisationList.map { it.toHapi() })
    }
    if (structuralRepresentationCount > 0) {
      hapiValue.setStructuralRepresentation(structuralRepresentationList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun SubstancePolymer.Repeat.RepeatUnit.DegreeOfPolymerisation.toHapi():
      org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasDegree()) {
      hapiValue.setDegree(degree.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.toHapi())
    }
    return hapiValue
  }

  private fun SubstancePolymer.Repeat.RepeatUnit.StructuralRepresentation.toHapi():
      org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitStructuralRepresentationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstancePolymer.SubstancePolymerRepeatRepeatUnitStructuralRepresentationComponent()
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
}
