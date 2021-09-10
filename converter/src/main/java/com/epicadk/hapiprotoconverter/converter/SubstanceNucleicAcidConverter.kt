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
import com.google.fhir.r4.core.SubstanceNucleicAcid
import com.google.fhir.r4.core.SubstanceNucleicAcid.Subunit

public object SubstanceNucleicAcidConverter {
  public fun SubstanceNucleicAcid.toHapi(): org.hl7.fhir.r4.model.SubstanceNucleicAcid {
    val hapiValue = org.hl7.fhir.r4.model.SubstanceNucleicAcid()
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
    if (hasAreaOfHybridisation()) {
      hapiValue.setAreaOfHybridisationElement(areaOfHybridisation.toHapi())
    }
    if (hasOligoNucleotideType()) {
      hapiValue.setOligoNucleotideType(oligoNucleotideType.toHapi())
    }
    if (subunitCount > 0) {
      hapiValue.setSubunit(subunitList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.SubstanceNucleicAcid.toProto(): SubstanceNucleicAcid {
    val protoValue = SubstanceNucleicAcid.newBuilder()
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
    if (hasAreaOfHybridisation()) {
      protoValue.setAreaOfHybridisation(areaOfHybridisationElement.toProto())
    }
    if (hasOligoNucleotideType()) {
      protoValue.setOligoNucleotideType(oligoNucleotideType.toProto())
    }
    if (hasSubunit()) {
      protoValue.addAllSubunit(subunit.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitComponent.toProto():
      SubstanceNucleicAcid.Subunit {
    val protoValue = SubstanceNucleicAcid.Subunit.newBuilder()
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
    if (hasFivePrime()) {
      protoValue.setFivePrime(fivePrime.toProto())
    }
    if (hasThreePrime()) {
      protoValue.setThreePrime(threePrime.toProto())
    }
    if (hasLinkage()) {
      protoValue.addAllLinkage(linkage.map { it.toProto() })
    }
    if (hasSugar()) {
      protoValue.addAllSugar(sugar.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitLinkageComponent.toProto():
      SubstanceNucleicAcid.Subunit.Linkage {
    val protoValue = SubstanceNucleicAcid.Subunit.Linkage.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasConnectivity()) {
      protoValue.setConnectivity(connectivityElement.toProto())
    }
    if (hasIdentifier()) {
      protoValue.setIdentifier(identifier.toProto())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasResidueSite()) {
      protoValue.setResidueSite(residueSiteElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitSugarComponent.toProto():
      SubstanceNucleicAcid.Subunit.Sugar {
    val protoValue = SubstanceNucleicAcid.Subunit.Sugar.newBuilder()
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
      protoValue.setName(nameElement.toProto())
    }
    if (hasResidueSite()) {
      protoValue.setResidueSite(residueSiteElement.toProto())
    }
    return protoValue.build()
  }

  private fun SubstanceNucleicAcid.Subunit.toHapi():
      org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitComponent()
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
    if (hasFivePrime()) {
      hapiValue.setFivePrime(fivePrime.toHapi())
    }
    if (hasThreePrime()) {
      hapiValue.setThreePrime(threePrime.toHapi())
    }
    if (linkageCount > 0) {
      hapiValue.setLinkage(linkageList.map { it.toHapi() })
    }
    if (sugarCount > 0) {
      hapiValue.setSugar(sugarList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun SubstanceNucleicAcid.Subunit.Linkage.toHapi():
      org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitLinkageComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitLinkageComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasConnectivity()) {
      hapiValue.setConnectivityElement(connectivity.toHapi())
    }
    if (hasIdentifier()) {
      hapiValue.setIdentifier(identifier.toHapi())
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasResidueSite()) {
      hapiValue.setResidueSiteElement(residueSite.toHapi())
    }
    return hapiValue
  }

  private fun SubstanceNucleicAcid.Subunit.Sugar.toHapi():
      org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitSugarComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.SubstanceNucleicAcid.SubstanceNucleicAcidSubunitSugarComponent()
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
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasResidueSite()) {
      hapiValue.setResidueSiteElement(residueSite.toHapi())
    }
    return hapiValue
  }
}
