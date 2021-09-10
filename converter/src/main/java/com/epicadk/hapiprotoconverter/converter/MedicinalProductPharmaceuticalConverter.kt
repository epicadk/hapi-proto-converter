package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.MedicinalProductPharmaceutical
import com.google.fhir.r4.core.MedicinalProductPharmaceutical.RouteOfAdministration
import com.google.fhir.r4.core.MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies
import com.google.fhir.r4.core.String

public object MedicinalProductPharmaceuticalConverter {
  public fun MedicinalProductPharmaceutical.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductPharmaceutical {
    val hapiValue = org.hl7.fhir.r4.model.MedicinalProductPharmaceutical()
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
    if (hasAdministrableDoseForm()) {
      hapiValue.setAdministrableDoseForm(administrableDoseForm.toHapi())
    }
    if (hasUnitOfPresentation()) {
      hapiValue.setUnitOfPresentation(unitOfPresentation.toHapi())
    }
    if (ingredientCount > 0) {
      hapiValue.setIngredient(ingredientList.map { it.toHapi() })
    }
    if (deviceCount > 0) {
      hapiValue.setDevice(deviceList.map { it.toHapi() })
    }
    if (characteristicsCount > 0) {
      hapiValue.setCharacteristics(characteristicsList.map { it.toHapi() })
    }
    if (routeOfAdministrationCount > 0) {
      hapiValue.setRouteOfAdministration(routeOfAdministrationList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.toProto():
      MedicinalProductPharmaceutical {
    val protoValue = MedicinalProductPharmaceutical.newBuilder()
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
    if (hasAdministrableDoseForm()) {
      protoValue.setAdministrableDoseForm(administrableDoseForm.toProto())
    }
    if (hasUnitOfPresentation()) {
      protoValue.setUnitOfPresentation(unitOfPresentation.toProto())
    }
    if (hasIngredient()) {
      protoValue.addAllIngredient(ingredient.map { it.toProto() })
    }
    if (hasDevice()) {
      protoValue.addAllDevice(device.map { it.toProto() })
    }
    if (hasCharacteristics()) {
      protoValue.addAllCharacteristics(characteristics.map { it.toProto() })
    }
    if (hasRouteOfAdministration()) {
      protoValue.addAllRouteOfAdministration(routeOfAdministration.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalCharacteristicsComponent.toProto():
      MedicinalProductPharmaceutical.Characteristics {
    val protoValue = MedicinalProductPharmaceutical.Characteristics.newBuilder()
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
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationComponent.toProto():
      MedicinalProductPharmaceutical.RouteOfAdministration {
    val protoValue = MedicinalProductPharmaceutical.RouteOfAdministration.newBuilder()
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
    if (hasFirstDose()) {
      protoValue.setFirstDose(firstDose.toProto())
    }
    if (hasMaxSingleDose()) {
      protoValue.setMaxSingleDose(maxSingleDose.toProto())
    }
    if (hasMaxDosePerDay()) {
      protoValue.setMaxDosePerDay(maxDosePerDay.toProto())
    }
    if (hasMaxDosePerTreatmentPeriod()) {
      protoValue.setMaxDosePerTreatmentPeriod(maxDosePerTreatmentPeriod.toProto())
    }
    if (hasMaxTreatmentPeriod()) {
      protoValue.setMaxTreatmentPeriod(maxTreatmentPeriod.toProto())
    }
    if (hasTargetSpecies()) {
      protoValue.addAllTargetSpecies(targetSpecies.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesComponent.toProto():
      MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies {
    val protoValue = MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.newBuilder()
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
    if (hasWithdrawalPeriod()) {
      protoValue.addAllWithdrawalPeriod(withdrawalPeriod.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodComponent.toProto():
      MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.WithdrawalPeriod {
    val protoValue =
        MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.WithdrawalPeriod.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasTissue()) {
      protoValue.setTissue(tissue.toProto())
    }
    if (hasValue()) {
      protoValue.setValue(value.toProto())
    }
    if (hasSupportingInformation()) {
      protoValue.setSupportingInformation(supportingInformationElement.toProto())
    }
    return protoValue.build()
  }

  private fun MedicinalProductPharmaceutical.Characteristics.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalCharacteristicsComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalCharacteristicsComponent()
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
    return hapiValue
  }

  private fun MedicinalProductPharmaceutical.RouteOfAdministration.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationComponent()
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
    if (hasFirstDose()) {
      hapiValue.setFirstDose(firstDose.toHapi())
    }
    if (hasMaxSingleDose()) {
      hapiValue.setMaxSingleDose(maxSingleDose.toHapi())
    }
    if (hasMaxDosePerDay()) {
      hapiValue.setMaxDosePerDay(maxDosePerDay.toHapi())
    }
    if (hasMaxDosePerTreatmentPeriod()) {
      hapiValue.setMaxDosePerTreatmentPeriod(maxDosePerTreatmentPeriod.toHapi())
    }
    if (hasMaxTreatmentPeriod()) {
      hapiValue.setMaxTreatmentPeriod(maxTreatmentPeriod.toHapi())
    }
    if (targetSpeciesCount > 0) {
      hapiValue.setTargetSpecies(targetSpeciesList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesComponent()
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
    if (withdrawalPeriodCount > 0) {
      hapiValue.setWithdrawalPeriod(withdrawalPeriodList.map { it.toHapi() })
    }
    return hapiValue
  }

  private
      fun MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.WithdrawalPeriod.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasTissue()) {
      hapiValue.setTissue(tissue.toHapi())
    }
    if (hasValue()) {
      hapiValue.setValue(value.toHapi())
    }
    if (hasSupportingInformation()) {
      hapiValue.setSupportingInformationElement(supportingInformation.toHapi())
    }
    return hapiValue
  }
}
