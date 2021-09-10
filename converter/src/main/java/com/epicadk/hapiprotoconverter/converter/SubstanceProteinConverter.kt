package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toProto
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
import com.google.fhir.r4.core.SubstanceProtein

public object SubstanceProteinConverter {
  public fun SubstanceProtein.toHapi(): org.hl7.fhir.r4.model.SubstanceProtein {
    val hapiValue = org.hl7.fhir.r4.model.SubstanceProtein()
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
    if (hasSequenceType()) {
      hapiValue.setSequenceType(sequenceType.toHapi())
    }
    if (hasNumberOfSubunits()) {
      hapiValue.setNumberOfSubunitsElement(numberOfSubunits.toHapi())
    }
    if (disulfideLinkageCount > 0) {
      hapiValue.setDisulfideLinkage(disulfideLinkageList.map { it.toHapi() })
    }
    if (subunitCount > 0) {
      hapiValue.setSubunit(subunitList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.SubstanceProtein.toProto(): SubstanceProtein {
    val protoValue = SubstanceProtein.newBuilder()
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
    if (hasSequenceType()) {
      protoValue.setSequenceType(sequenceType.toProto())
    }
    if (hasNumberOfSubunits()) {
      protoValue.setNumberOfSubunits(numberOfSubunitsElement.toProto())
    }
    if (hasDisulfideLinkage()) {
      protoValue.addAllDisulfideLinkage(disulfideLinkage.map { it.toProto() })
    }
    if (hasSubunit()) {
      protoValue.addAllSubunit(subunit.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.SubstanceProtein.SubstanceProteinSubunitComponent.toProto():
      SubstanceProtein.Subunit {
    val protoValue = SubstanceProtein.Subunit.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSubunit()) {
      protoValue.setSubunit(subunitElement.toProto())
    }
    if (hasSequence()) {
      protoValue.setSequence(sequenceElement.toProto())
    }
    if (hasLength()) {
      protoValue.setLength(lengthElement.toProto())
    }
    if (hasSequenceAttachment()) {
      protoValue.setSequenceAttachment(sequenceAttachment.toProto())
    }
    if (hasNTerminalModificationId()) {
      protoValue.setNTerminalModificationId(nTerminalModificationId.toProto())
    }
    if (hasNTerminalModification()) {
      protoValue.setNTerminalModification(nTerminalModificationElement.toProto())
    }
    if (hasCTerminalModificationId()) {
      protoValue.setCTerminalModificationId(cTerminalModificationId.toProto())
    }
    if (hasCTerminalModification()) {
      protoValue.setCTerminalModification(cTerminalModificationElement.toProto())
    }
    return protoValue.build()
  }

  private fun SubstanceProtein.Subunit.toHapi():
      org.hl7.fhir.r4.model.SubstanceProtein.SubstanceProteinSubunitComponent {
    val hapiValue = org.hl7.fhir.r4.model.SubstanceProtein.SubstanceProteinSubunitComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasSubunit()) {
      hapiValue.setSubunitElement(subunit.toHapi())
    }
    if (hasSequence()) {
      hapiValue.setSequenceElement(sequence.toHapi())
    }
    if (hasLength()) {
      hapiValue.setLengthElement(length.toHapi())
    }
    if (hasSequenceAttachment()) {
      hapiValue.setSequenceAttachment(sequenceAttachment.toHapi())
    }
    if (hasNTerminalModificationId()) {
      hapiValue.setNTerminalModificationId(nTerminalModificationId.toHapi())
    }
    if (hasNTerminalModification()) {
      hapiValue.setNTerminalModificationElement(nTerminalModification.toHapi())
    }
    if (hasCTerminalModificationId()) {
      hapiValue.setCTerminalModificationId(cTerminalModificationId.toHapi())
    }
    if (hasCTerminalModification()) {
      hapiValue.setCTerminalModificationElement(cTerminalModification.toHapi())
    }
    return hapiValue
  }
}
