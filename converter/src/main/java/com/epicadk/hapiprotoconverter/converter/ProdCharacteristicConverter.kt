package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.google.fhir.r4.core.ProdCharacteristic
import com.google.fhir.r4.core.String

public object ProdCharacteristicConverter {
  public fun ProdCharacteristic.toHapi(): org.hl7.fhir.r4.model.ProdCharacteristic {
    val hapiValue = org.hl7.fhir.r4.model.ProdCharacteristic()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasHeight()) {
      hapiValue.setHeight(height.toHapi())
    }
    if (hasWidth()) {
      hapiValue.setWidth(width.toHapi())
    }
    if (hasDepth()) {
      hapiValue.setDepth(depth.toHapi())
    }
    if (hasWeight()) {
      hapiValue.setWeight(weight.toHapi())
    }
    if (hasNominalVolume()) {
      hapiValue.setNominalVolume(nominalVolume.toHapi())
    }
    if (hasExternalDiameter()) {
      hapiValue.setExternalDiameter(externalDiameter.toHapi())
    }
    if (hasShape()) {
      hapiValue.setShapeElement(shape.toHapi())
    }
    if (colorCount > 0) {
      hapiValue.setColor(colorList.map { it.toHapi() })
    }
    if (imprintCount > 0) {
      hapiValue.setImprint(imprintList.map { it.toHapi() })
    }
    if (imageCount > 0) {
      hapiValue.setImage(imageList.map { it.toHapi() })
    }
    if (hasScoring()) {
      hapiValue.setScoring(scoring.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ProdCharacteristic.toProto(): ProdCharacteristic {
    val protoValue = ProdCharacteristic.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasHeight()) {
      protoValue.setHeight(height.toProto())
    }
    if (hasWidth()) {
      protoValue.setWidth(width.toProto())
    }
    if (hasDepth()) {
      protoValue.setDepth(depth.toProto())
    }
    if (hasWeight()) {
      protoValue.setWeight(weight.toProto())
    }
    if (hasNominalVolume()) {
      protoValue.setNominalVolume(nominalVolume.toProto())
    }
    if (hasExternalDiameter()) {
      protoValue.setExternalDiameter(externalDiameter.toProto())
    }
    if (hasShape()) {
      protoValue.setShape(shapeElement.toProto())
    }
    if (hasColor()) {
      protoValue.addAllColor(color.map { it.toProto() })
    }
    if (hasImprint()) {
      protoValue.addAllImprint(imprint.map { it.toProto() })
    }
    if (hasImage()) {
      protoValue.addAllImage(image.map { it.toProto() })
    }
    if (hasScoring()) {
      protoValue.setScoring(scoring.toProto())
    }
    return protoValue.build()
  }
}
