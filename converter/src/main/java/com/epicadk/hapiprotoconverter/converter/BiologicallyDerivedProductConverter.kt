package com.epicadk.hapiprotoconverter.converter

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
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.BiologicallyDerivedProduct
import com.google.fhir.r4.core.BiologicallyDerivedProduct.Collection
import com.google.fhir.r4.core.BiologicallyDerivedProduct.Manipulation
import com.google.fhir.r4.core.BiologicallyDerivedProduct.Processing
import com.google.fhir.r4.core.BiologicallyDerivedProduct.Storage
import com.google.fhir.r4.core.BiologicallyDerivedProductCategoryCode
import com.google.fhir.r4.core.BiologicallyDerivedProductStatusCode
import com.google.fhir.r4.core.BiologicallyDerivedProductStorageScaleCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Type

public object BiologicallyDerivedProductConverter {
  private
      fun BiologicallyDerivedProduct.Collection.CollectedX.biologicallyDerivedProductCollectionCollectedToHapi():
      Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for BiologicallyDerivedProduct.collection.collected[x]")
  }

  private fun Type.biologicallyDerivedProductCollectionCollectedToProto():
      BiologicallyDerivedProduct.Collection.CollectedX {
    val protoValue = BiologicallyDerivedProduct.Collection.CollectedX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun BiologicallyDerivedProduct.Processing.TimeX.biologicallyDerivedProductProcessingTimeToHapi():
      Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for BiologicallyDerivedProduct.processing.time[x]")
  }

  private fun Type.biologicallyDerivedProductProcessingTimeToProto():
      BiologicallyDerivedProduct.Processing.TimeX {
    val protoValue = BiologicallyDerivedProduct.Processing.TimeX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun BiologicallyDerivedProduct.Manipulation.TimeX.biologicallyDerivedProductManipulationTimeToHapi():
      Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for BiologicallyDerivedProduct.manipulation.time[x]")
  }

  private fun Type.biologicallyDerivedProductManipulationTimeToProto():
      BiologicallyDerivedProduct.Manipulation.TimeX {
    val protoValue = BiologicallyDerivedProduct.Manipulation.TimeX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  public fun BiologicallyDerivedProduct.toHapi(): org.hl7.fhir.r4.model.BiologicallyDerivedProduct {
    val hapiValue = org.hl7.fhir.r4.model.BiologicallyDerivedProduct()
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
    if (hasProductCategory()) {
      hapiValue.setProductCategory(org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductCategory.valueOf(productCategory.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasProductCode()) {
      hapiValue.setProductCode(productCode.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (requestCount > 0) {
      hapiValue.setRequest(requestList.map { it.toHapi() })
    }
    if (hasQuantity()) {
      hapiValue.setQuantityElement(quantity.toHapi())
    }
    if (parentCount > 0) {
      hapiValue.setParent(parentList.map { it.toHapi() })
    }
    if (hasCollection()) {
      hapiValue.setCollection(collection.toHapi())
    }
    if (processingCount > 0) {
      hapiValue.setProcessing(processingList.map { it.toHapi() })
    }
    if (hasManipulation()) {
      hapiValue.setManipulation(manipulation.toHapi())
    }
    if (storageCount > 0) {
      hapiValue.setStorage(storageList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.BiologicallyDerivedProduct.toProto():
      BiologicallyDerivedProduct {
    val protoValue = BiologicallyDerivedProduct.newBuilder()
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
    if (hasProductCategory()) {
      protoValue.setProductCategory(BiologicallyDerivedProduct.ProductCategoryCode.newBuilder().setValue(BiologicallyDerivedProductCategoryCode.Value.valueOf(productCategory.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasProductCode()) {
      protoValue.setProductCode(productCode.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(BiologicallyDerivedProduct.StatusCode.newBuilder().setValue(BiologicallyDerivedProductStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasRequest()) {
      protoValue.addAllRequest(request.map { it.toProto() })
    }
    if (hasQuantity()) {
      protoValue.setQuantity(quantityElement.toProto())
    }
    if (hasParent()) {
      protoValue.addAllParent(parent.map { it.toProto() })
    }
    if (hasCollection()) {
      protoValue.setCollection(collection.toProto())
    }
    if (hasProcessing()) {
      protoValue.addAllProcessing(processing.map { it.toProto() })
    }
    if (hasManipulation()) {
      protoValue.setManipulation(manipulation.toProto())
    }
    if (hasStorage()) {
      protoValue.addAllStorage(storage.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductCollectionComponent.toProto():
      BiologicallyDerivedProduct.Collection {
    val protoValue = BiologicallyDerivedProduct.Collection.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCollector()) {
      protoValue.setCollector(collector.toProto())
    }
    if (hasSource()) {
      protoValue.setSource(source.toProto())
    }
    if (hasCollected()) {
      protoValue.setCollected(collected.biologicallyDerivedProductCollectionCollectedToProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductProcessingComponent.toProto():
      BiologicallyDerivedProduct.Processing {
    val protoValue = BiologicallyDerivedProduct.Processing.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasProcedure()) {
      protoValue.setProcedure(procedure.toProto())
    }
    if (hasAdditive()) {
      protoValue.setAdditive(additive.toProto())
    }
    if (hasTime()) {
      protoValue.setTime(time.biologicallyDerivedProductProcessingTimeToProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductManipulationComponent.toProto():
      BiologicallyDerivedProduct.Manipulation {
    val protoValue = BiologicallyDerivedProduct.Manipulation.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasTime()) {
      protoValue.setTime(time.biologicallyDerivedProductManipulationTimeToProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStorageComponent.toProto():
      BiologicallyDerivedProduct.Storage {
    val protoValue = BiologicallyDerivedProduct.Storage.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasTemperature()) {
      protoValue.setTemperature(temperatureElement.toProto())
    }
    if (hasScale()) {
      protoValue.setScale(BiologicallyDerivedProduct.Storage.ScaleCode.newBuilder().setValue(BiologicallyDerivedProductStorageScaleCode.Value.valueOf(scale.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDuration()) {
      protoValue.setDuration(duration.toProto())
    }
    return protoValue.build()
  }

  private fun BiologicallyDerivedProduct.Collection.toHapi():
      org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductCollectionComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductCollectionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCollector()) {
      hapiValue.setCollector(collector.toHapi())
    }
    if (hasSource()) {
      hapiValue.setSource(source.toHapi())
    }
    if (hasCollected()) {
      hapiValue.setCollected(collected.biologicallyDerivedProductCollectionCollectedToHapi())
    }
    return hapiValue
  }

  private fun BiologicallyDerivedProduct.Processing.toHapi():
      org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductProcessingComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductProcessingComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasProcedure()) {
      hapiValue.setProcedure(procedure.toHapi())
    }
    if (hasAdditive()) {
      hapiValue.setAdditive(additive.toHapi())
    }
    if (hasTime()) {
      hapiValue.setTime(time.biologicallyDerivedProductProcessingTimeToHapi())
    }
    return hapiValue
  }

  private fun BiologicallyDerivedProduct.Manipulation.toHapi():
      org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductManipulationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductManipulationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasTime()) {
      hapiValue.setTime(time.biologicallyDerivedProductManipulationTimeToHapi())
    }
    return hapiValue
  }

  private fun BiologicallyDerivedProduct.Storage.toHapi():
      org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStorageComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStorageComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasTemperature()) {
      hapiValue.setTemperatureElement(temperature.toHapi())
    }
    if (hasScale()) {
      hapiValue.setScale(org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStorageScale.valueOf(scale.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDuration()) {
      hapiValue.setDuration(duration.toHapi())
    }
    return hapiValue
  }
}
