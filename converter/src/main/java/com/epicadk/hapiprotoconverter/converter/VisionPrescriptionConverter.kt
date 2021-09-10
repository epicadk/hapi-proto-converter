package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.FinancialResourceStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.VisionBaseCode
import com.google.fhir.r4.core.VisionEyesCode
import com.google.fhir.r4.core.VisionPrescription
import com.google.fhir.r4.core.VisionPrescription.LensSpecification
import com.google.fhir.r4.core.VisionPrescription.LensSpecification.Prism
import org.hl7.fhir.r4.model.SimpleQuantity

public object VisionPrescriptionConverter {
  public fun VisionPrescription.toHapi(): org.hl7.fhir.r4.model.VisionPrescription {
    val hapiValue = org.hl7.fhir.r4.model.VisionPrescription()
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
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.VisionPrescription.VisionStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCreated()) {
      hapiValue.setCreatedElement(created.toHapi())
    }
    if (hasPatient()) {
      hapiValue.setPatient(patient.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasDateWritten()) {
      hapiValue.setDateWrittenElement(dateWritten.toHapi())
    }
    if (hasPrescriber()) {
      hapiValue.setPrescriber(prescriber.toHapi())
    }
    if (lensSpecificationCount > 0) {
      hapiValue.setLensSpecification(lensSpecificationList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.VisionPrescription.toProto(): VisionPrescription {
    val protoValue = VisionPrescription.newBuilder()
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
    if (hasStatus()) {
      protoValue.setStatus(VisionPrescription.StatusCode.newBuilder().setValue(FinancialResourceStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCreated()) {
      protoValue.setCreated(createdElement.toProto())
    }
    if (hasPatient()) {
      protoValue.setPatient(patient.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasDateWritten()) {
      protoValue.setDateWritten(dateWrittenElement.toProto())
    }
    if (hasPrescriber()) {
      protoValue.setPrescriber(prescriber.toProto())
    }
    if (hasLensSpecification()) {
      protoValue.addAllLensSpecification(lensSpecification.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.VisionPrescription.VisionPrescriptionLensSpecificationComponent.toProto():
      VisionPrescription.LensSpecification {
    val protoValue = VisionPrescription.LensSpecification.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasProduct()) {
      protoValue.setProduct(product.toProto())
    }
    if (hasEye()) {
      protoValue.setEye(VisionPrescription.LensSpecification.EyeCode.newBuilder().setValue(VisionEyesCode.Value.valueOf(eye.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasSphere()) {
      protoValue.setSphere(sphereElement.toProto())
    }
    if (hasCylinder()) {
      protoValue.setCylinder(cylinderElement.toProto())
    }
    if (hasAxis()) {
      protoValue.setAxis(axisElement.toProto())
    }
    if (hasPrism()) {
      protoValue.addAllPrism(prism.map { it.toProto() })
    }
    if (hasAdd()) {
      protoValue.setAdd(addElement.toProto())
    }
    if (hasPower()) {
      protoValue.setPower(powerElement.toProto())
    }
    if (hasBackCurve()) {
      protoValue.setBackCurve(backCurveElement.toProto())
    }
    if (hasDiameter()) {
      protoValue.setDiameter(diameterElement.toProto())
    }
    if (hasDuration()) {
      protoValue.setDuration((duration as SimpleQuantity).toProto())
    }
    if (hasColor()) {
      protoValue.setColor(colorElement.toProto())
    }
    if (hasBrand()) {
      protoValue.setBrand(brandElement.toProto())
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.VisionPrescription.PrismComponent.toProto():
      VisionPrescription.LensSpecification.Prism {
    val protoValue = VisionPrescription.LensSpecification.Prism.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasAmount()) {
      protoValue.setAmount(amountElement.toProto())
    }
    if (hasBase()) {
      protoValue.setBase(VisionPrescription.LensSpecification.Prism.BaseCode.newBuilder().setValue(VisionBaseCode.Value.valueOf(base.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    return protoValue.build()
  }

  private fun VisionPrescription.LensSpecification.toHapi():
      org.hl7.fhir.r4.model.VisionPrescription.VisionPrescriptionLensSpecificationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.VisionPrescription.VisionPrescriptionLensSpecificationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasProduct()) {
      hapiValue.setProduct(product.toHapi())
    }
    if (hasEye()) {
      hapiValue.setEye(org.hl7.fhir.r4.model.VisionPrescription.VisionEyes.valueOf(eye.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasSphere()) {
      hapiValue.setSphereElement(sphere.toHapi())
    }
    if (hasCylinder()) {
      hapiValue.setCylinderElement(cylinder.toHapi())
    }
    if (hasAxis()) {
      hapiValue.setAxisElement(axis.toHapi())
    }
    if (prismCount > 0) {
      hapiValue.setPrism(prismList.map { it.toHapi() })
    }
    if (hasAdd()) {
      hapiValue.setAddElement(add.toHapi())
    }
    if (hasPower()) {
      hapiValue.setPowerElement(power.toHapi())
    }
    if (hasBackCurve()) {
      hapiValue.setBackCurveElement(backCurve.toHapi())
    }
    if (hasDiameter()) {
      hapiValue.setDiameterElement(diameter.toHapi())
    }
    if (hasDuration()) {
      hapiValue.setDuration(duration.toHapi())
    }
    if (hasColor()) {
      hapiValue.setColorElement(color.toHapi())
    }
    if (hasBrand()) {
      hapiValue.setBrandElement(brand.toHapi())
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun VisionPrescription.LensSpecification.Prism.toHapi():
      org.hl7.fhir.r4.model.VisionPrescription.PrismComponent {
    val hapiValue = org.hl7.fhir.r4.model.VisionPrescription.PrismComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasAmount()) {
      hapiValue.setAmountElement(amount.toHapi())
    }
    if (hasBase()) {
      hapiValue.setBase(org.hl7.fhir.r4.model.VisionPrescription.VisionBase.valueOf(base.value.name.hapiCodeCheck().replace("_", "")))
    }
    return hapiValue
  }
}
