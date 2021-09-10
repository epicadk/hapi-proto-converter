package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
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
import com.google.fhir.r4.core.MedicinalProductInteraction
import com.google.fhir.r4.core.MedicinalProductInteraction.Interactant
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.Type

public object MedicinalProductInteractionConverter {
  private
      fun MedicinalProductInteraction.Interactant.ItemX.medicinalProductInteractionInteractantItemToHapi():
      Type {
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for MedicinalProductInteraction.interactant.item[x]")
  }

  private fun Type.medicinalProductInteractionInteractantItemToProto():
      MedicinalProductInteraction.Interactant.ItemX {
    val protoValue = MedicinalProductInteraction.Interactant.ItemX.newBuilder()
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    return protoValue.build()
  }

  public fun MedicinalProductInteraction.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductInteraction {
    val hapiValue = org.hl7.fhir.r4.model.MedicinalProductInteraction()
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
    if (subjectCount > 0) {
      hapiValue.setSubject(subjectList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (interactantCount > 0) {
      hapiValue.setInteractant(interactantList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasEffect()) {
      hapiValue.setEffect(effect.toHapi())
    }
    if (hasIncidence()) {
      hapiValue.setIncidence(incidence.toHapi())
    }
    if (hasManagement()) {
      hapiValue.setManagement(management.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MedicinalProductInteraction.toProto():
      MedicinalProductInteraction {
    val protoValue = MedicinalProductInteraction.newBuilder()
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
    if (hasSubject()) {
      protoValue.addAllSubject(subject.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasInteractant()) {
      protoValue.addAllInteractant(interactant.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasEffect()) {
      protoValue.setEffect(effect.toProto())
    }
    if (hasIncidence()) {
      protoValue.setIncidence(incidence.toProto())
    }
    if (hasManagement()) {
      protoValue.setManagement(management.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProductInteraction.MedicinalProductInteractionInteractantComponent.toProto():
      MedicinalProductInteraction.Interactant {
    val protoValue = MedicinalProductInteraction.Interactant.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasItem()) {
      protoValue.setItem(item.medicinalProductInteractionInteractantItemToProto())
    }
    return protoValue.build()
  }

  private fun MedicinalProductInteraction.Interactant.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductInteraction.MedicinalProductInteractionInteractantComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProductInteraction.MedicinalProductInteractionInteractantComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasItem()) {
      hapiValue.setItem(item.medicinalProductInteractionInteractantItemToHapi())
    }
    return hapiValue
  }
}
