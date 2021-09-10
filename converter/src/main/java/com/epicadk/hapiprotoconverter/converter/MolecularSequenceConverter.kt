package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.MolecularSequence
import com.google.fhir.r4.core.MolecularSequence.Quality
import com.google.fhir.r4.core.MolecularSequence.ReferenceSeq
import com.google.fhir.r4.core.MolecularSequence.Repository
import com.google.fhir.r4.core.MolecularSequence.StructureVariant
import com.google.fhir.r4.core.OrientationTypeCode
import com.google.fhir.r4.core.QualityTypeCode
import com.google.fhir.r4.core.RepositoryTypeCode
import com.google.fhir.r4.core.SequenceTypeCode
import com.google.fhir.r4.core.StrandTypeCode
import com.google.fhir.r4.core.String

public object MolecularSequenceConverter {
  public fun MolecularSequence.toHapi(): org.hl7.fhir.r4.model.MolecularSequence {
    val hapiValue = org.hl7.fhir.r4.model.MolecularSequence()
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
    if (hasType()) {
      hapiValue.setType(org.hl7.fhir.r4.model.MolecularSequence.SequenceType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCoordinateSystem()) {
      hapiValue.setCoordinateSystemElement(coordinateSystem.toHapi())
    }
    if (hasPatient()) {
      hapiValue.setPatient(patient.toHapi())
    }
    if (hasSpecimen()) {
      hapiValue.setSpecimen(specimen.toHapi())
    }
    if (hasDevice()) {
      hapiValue.setDevice(device.toHapi())
    }
    if (hasPerformer()) {
      hapiValue.setPerformer(performer.toHapi())
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (hasReferenceSeq()) {
      hapiValue.setReferenceSeq(referenceSeq.toHapi())
    }
    if (variantCount > 0) {
      hapiValue.setVariant(variantList.map { it.toHapi() })
    }
    if (hasObservedSeq()) {
      hapiValue.setObservedSeqElement(observedSeq.toHapi())
    }
    if (qualityCount > 0) {
      hapiValue.setQuality(qualityList.map { it.toHapi() })
    }
    if (hasReadCoverage()) {
      hapiValue.setReadCoverageElement(readCoverage.toHapi())
    }
    if (repositoryCount > 0) {
      hapiValue.setRepository(repositoryList.map { it.toHapi() })
    }
    if (pointerCount > 0) {
      hapiValue.setPointer(pointerList.map { it.toHapi() })
    }
    if (structureVariantCount > 0) {
      hapiValue.setStructureVariant(structureVariantList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MolecularSequence.toProto(): MolecularSequence {
    val protoValue = MolecularSequence.newBuilder()
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
    if (hasType()) {
      protoValue.setType(MolecularSequence.TypeCode.newBuilder().setValue(SequenceTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCoordinateSystem()) {
      protoValue.setCoordinateSystem(coordinateSystemElement.toProto())
    }
    if (hasPatient()) {
      protoValue.setPatient(patient.toProto())
    }
    if (hasSpecimen()) {
      protoValue.setSpecimen(specimen.toProto())
    }
    if (hasDevice()) {
      protoValue.setDevice(device.toProto())
    }
    if (hasPerformer()) {
      protoValue.setPerformer(performer.toProto())
    }
    if (hasQuantity()) {
      protoValue.setQuantity(quantity.toProto())
    }
    if (hasReferenceSeq()) {
      protoValue.setReferenceSeq(referenceSeq.toProto())
    }
    if (hasVariant()) {
      protoValue.addAllVariant(variant.map { it.toProto() })
    }
    if (hasObservedSeq()) {
      protoValue.setObservedSeq(observedSeqElement.toProto())
    }
    if (hasQuality()) {
      protoValue.addAllQuality(quality.map { it.toProto() })
    }
    if (hasReadCoverage()) {
      protoValue.setReadCoverage(readCoverageElement.toProto())
    }
    if (hasRepository()) {
      protoValue.addAllRepository(repository.map { it.toProto() })
    }
    if (hasPointer()) {
      protoValue.addAllPointer(pointer.map { it.toProto() })
    }
    if (hasStructureVariant()) {
      protoValue.addAllStructureVariant(structureVariant.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceReferenceSeqComponent.toProto():
      MolecularSequence.ReferenceSeq {
    val protoValue = MolecularSequence.ReferenceSeq.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasChromosome()) {
      protoValue.setChromosome(chromosome.toProto())
    }
    if (hasGenomeBuild()) {
      protoValue.setGenomeBuild(genomeBuildElement.toProto())
    }
    if (hasOrientation()) {
      protoValue.setOrientation(MolecularSequence.ReferenceSeq.OrientationCode.newBuilder().setValue(OrientationTypeCode.Value.valueOf(orientation.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasReferenceSeqId()) {
      protoValue.setReferenceSeqId(referenceSeqId.toProto())
    }
    if (hasReferenceSeqPointer()) {
      protoValue.setReferenceSeqPointer(referenceSeqPointer.toProto())
    }
    if (hasReferenceSeqString()) {
      protoValue.setReferenceSeqString(referenceSeqStringElement.toProto())
    }
    if (hasStrand()) {
      protoValue.setStrand(MolecularSequence.ReferenceSeq.StrandCode.newBuilder().setValue(StrandTypeCode.Value.valueOf(strand.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasWindowStart()) {
      protoValue.setWindowStart(windowStartElement.toProto())
    }
    if (hasWindowEnd()) {
      protoValue.setWindowEnd(windowEndElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceVariantComponent.toProto():
      MolecularSequence.Variant {
    val protoValue = MolecularSequence.Variant.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasStart()) {
      protoValue.setStart(startElement.toProto())
    }
    if (hasEnd()) {
      protoValue.setEnd(endElement.toProto())
    }
    if (hasObservedAllele()) {
      protoValue.setObservedAllele(observedAlleleElement.toProto())
    }
    if (hasReferenceAllele()) {
      protoValue.setReferenceAllele(referenceAlleleElement.toProto())
    }
    if (hasCigar()) {
      protoValue.setCigar(cigarElement.toProto())
    }
    if (hasVariantPointer()) {
      protoValue.setVariantPointer(variantPointer.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceQualityComponent.toProto():
      MolecularSequence.Quality {
    val protoValue = MolecularSequence.Quality.newBuilder()
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
      protoValue.setType(MolecularSequence.Quality.TypeCode.newBuilder().setValue(QualityTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasStandardSequence()) {
      protoValue.setStandardSequence(standardSequence.toProto())
    }
    if (hasStart()) {
      protoValue.setStart(startElement.toProto())
    }
    if (hasEnd()) {
      protoValue.setEnd(endElement.toProto())
    }
    if (hasScore()) {
      protoValue.setScore(score.toProto())
    }
    if (hasMethod()) {
      protoValue.setMethod(method.toProto())
    }
    if (hasTruthTP()) {
      protoValue.setTruthTp(truthTPElement.toProto())
    }
    if (hasQueryTP()) {
      protoValue.setQueryTp(queryTPElement.toProto())
    }
    if (hasTruthFN()) {
      protoValue.setTruthFn(truthFNElement.toProto())
    }
    if (hasQueryFP()) {
      protoValue.setQueryFp(queryFPElement.toProto())
    }
    if (hasGtFP()) {
      protoValue.setGtFp(gtFPElement.toProto())
    }
    if (hasPrecision()) {
      protoValue.setPrecision(precisionElement.toProto())
    }
    if (hasRecall()) {
      protoValue.setRecall(recallElement.toProto())
    }
    if (hasFScore()) {
      protoValue.setFScore(fScoreElement.toProto())
    }
    if (hasRoc()) {
      protoValue.setRoc(roc.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceQualityRocComponent.toProto():
      MolecularSequence.Quality.Roc {
    val protoValue = MolecularSequence.Quality.Roc.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasScore()) {
      protoValue.addAllScore(score.map { it.toProto() })
    }
    if (hasNumTP()) {
      protoValue.addAllNumTp(numTP.map { it.toProto() })
    }
    if (hasNumFP()) {
      protoValue.addAllNumFp(numFP.map { it.toProto() })
    }
    if (hasNumFN()) {
      protoValue.addAllNumFn(numFN.map { it.toProto() })
    }
    if (hasPrecision()) {
      protoValue.addAllPrecision(precision.map { it.toProto() })
    }
    if (hasSensitivity()) {
      protoValue.addAllSensitivity(sensitivity.map { it.toProto() })
    }
    if (hasFMeasure()) {
      protoValue.addAllFMeasure(fMeasure.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceRepositoryComponent.toProto():
      MolecularSequence.Repository {
    val protoValue = MolecularSequence.Repository.newBuilder()
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
      protoValue.setType(MolecularSequence.Repository.TypeCode.newBuilder().setValue(RepositoryTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasUrl()) {
      protoValue.setUrl(urlElement.toProto())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasDatasetId()) {
      protoValue.setDatasetId(datasetIdElement.toProto())
    }
    if (hasVariantsetId()) {
      protoValue.setVariantsetId(variantsetIdElement.toProto())
    }
    if (hasReadsetId()) {
      protoValue.setReadsetId(readsetIdElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantComponent.toProto():
      MolecularSequence.StructureVariant {
    val protoValue = MolecularSequence.StructureVariant.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasVariantType()) {
      protoValue.setVariantType(variantType.toProto())
    }
    if (hasExact()) {
      protoValue.setExact(exactElement.toProto())
    }
    if (hasLength()) {
      protoValue.setLength(lengthElement.toProto())
    }
    if (hasOuter()) {
      protoValue.setOuter(outer.toProto())
    }
    if (hasInner()) {
      protoValue.setInner(inner.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantOuterComponent.toProto():
      MolecularSequence.StructureVariant.Outer {
    val protoValue = MolecularSequence.StructureVariant.Outer.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasStart()) {
      protoValue.setStart(startElement.toProto())
    }
    if (hasEnd()) {
      protoValue.setEnd(endElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantInnerComponent.toProto():
      MolecularSequence.StructureVariant.Inner {
    val protoValue = MolecularSequence.StructureVariant.Inner.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasStart()) {
      protoValue.setStart(startElement.toProto())
    }
    if (hasEnd()) {
      protoValue.setEnd(endElement.toProto())
    }
    return protoValue.build()
  }

  private fun MolecularSequence.ReferenceSeq.toHapi():
      org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceReferenceSeqComponent {
    val hapiValue = org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceReferenceSeqComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasChromosome()) {
      hapiValue.setChromosome(chromosome.toHapi())
    }
    if (hasGenomeBuild()) {
      hapiValue.setGenomeBuildElement(genomeBuild.toHapi())
    }
    if (hasOrientation()) {
      hapiValue.setOrientation(org.hl7.fhir.r4.model.MolecularSequence.OrientationType.valueOf(orientation.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasReferenceSeqId()) {
      hapiValue.setReferenceSeqId(referenceSeqId.toHapi())
    }
    if (hasReferenceSeqPointer()) {
      hapiValue.setReferenceSeqPointer(referenceSeqPointer.toHapi())
    }
    if (hasReferenceSeqString()) {
      hapiValue.setReferenceSeqStringElement(referenceSeqString.toHapi())
    }
    if (hasStrand()) {
      hapiValue.setStrand(org.hl7.fhir.r4.model.MolecularSequence.StrandType.valueOf(strand.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasWindowStart()) {
      hapiValue.setWindowStartElement(windowStart.toHapi())
    }
    if (hasWindowEnd()) {
      hapiValue.setWindowEndElement(windowEnd.toHapi())
    }
    return hapiValue
  }

  private fun MolecularSequence.Variant.toHapi():
      org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceVariantComponent {
    val hapiValue = org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceVariantComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasStart()) {
      hapiValue.setStartElement(start.toHapi())
    }
    if (hasEnd()) {
      hapiValue.setEndElement(end.toHapi())
    }
    if (hasObservedAllele()) {
      hapiValue.setObservedAlleleElement(observedAllele.toHapi())
    }
    if (hasReferenceAllele()) {
      hapiValue.setReferenceAlleleElement(referenceAllele.toHapi())
    }
    if (hasCigar()) {
      hapiValue.setCigarElement(cigar.toHapi())
    }
    if (hasVariantPointer()) {
      hapiValue.setVariantPointer(variantPointer.toHapi())
    }
    return hapiValue
  }

  private fun MolecularSequence.Quality.toHapi():
      org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceQualityComponent {
    val hapiValue = org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceQualityComponent()
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
      hapiValue.setType(org.hl7.fhir.r4.model.MolecularSequence.QualityType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasStandardSequence()) {
      hapiValue.setStandardSequence(standardSequence.toHapi())
    }
    if (hasStart()) {
      hapiValue.setStartElement(start.toHapi())
    }
    if (hasEnd()) {
      hapiValue.setEndElement(end.toHapi())
    }
    if (hasScore()) {
      hapiValue.setScore(score.toHapi())
    }
    if (hasMethod()) {
      hapiValue.setMethod(method.toHapi())
    }
    if (hasTruthTp()) {
      hapiValue.setTruthTPElement(truthTp.toHapi())
    }
    if (hasQueryTp()) {
      hapiValue.setQueryTPElement(queryTp.toHapi())
    }
    if (hasTruthFn()) {
      hapiValue.setTruthFNElement(truthFn.toHapi())
    }
    if (hasQueryFp()) {
      hapiValue.setQueryFPElement(queryFp.toHapi())
    }
    if (hasGtFp()) {
      hapiValue.setGtFPElement(gtFp.toHapi())
    }
    if (hasPrecision()) {
      hapiValue.setPrecisionElement(precision.toHapi())
    }
    if (hasRecall()) {
      hapiValue.setRecallElement(recall.toHapi())
    }
    if (hasFScore()) {
      hapiValue.setFScoreElement(fScore.toHapi())
    }
    if (hasRoc()) {
      hapiValue.setRoc(roc.toHapi())
    }
    return hapiValue
  }

  private fun MolecularSequence.Quality.Roc.toHapi():
      org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceQualityRocComponent {
    val hapiValue = org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceQualityRocComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (scoreCount > 0) {
      hapiValue.setScore(scoreList.map { it.toHapi() })
    }
    if (numTpCount > 0) {
      hapiValue.setNumTP(numTpList.map { it.toHapi() })
    }
    if (numFpCount > 0) {
      hapiValue.setNumFP(numFpList.map { it.toHapi() })
    }
    if (numFnCount > 0) {
      hapiValue.setNumFN(numFnList.map { it.toHapi() })
    }
    if (precisionCount > 0) {
      hapiValue.setPrecision(precisionList.map { it.toHapi() })
    }
    if (sensitivityCount > 0) {
      hapiValue.setSensitivity(sensitivityList.map { it.toHapi() })
    }
    if (fMeasureCount > 0) {
      hapiValue.setFMeasure(fMeasureList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun MolecularSequence.Repository.toHapi():
      org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceRepositoryComponent {
    val hapiValue = org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceRepositoryComponent()
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
      hapiValue.setType(org.hl7.fhir.r4.model.MolecularSequence.RepositoryType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasUrl()) {
      hapiValue.setUrlElement(url.toHapi())
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasDatasetId()) {
      hapiValue.setDatasetIdElement(datasetId.toHapi())
    }
    if (hasVariantsetId()) {
      hapiValue.setVariantsetIdElement(variantsetId.toHapi())
    }
    if (hasReadsetId()) {
      hapiValue.setReadsetIdElement(readsetId.toHapi())
    }
    return hapiValue
  }

  private fun MolecularSequence.StructureVariant.toHapi():
      org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasVariantType()) {
      hapiValue.setVariantType(variantType.toHapi())
    }
    if (hasExact()) {
      hapiValue.setExactElement(exact.toHapi())
    }
    if (hasLength()) {
      hapiValue.setLengthElement(length.toHapi())
    }
    if (hasOuter()) {
      hapiValue.setOuter(outer.toHapi())
    }
    if (hasInner()) {
      hapiValue.setInner(inner.toHapi())
    }
    return hapiValue
  }

  private fun MolecularSequence.StructureVariant.Outer.toHapi():
      org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantOuterComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantOuterComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasStart()) {
      hapiValue.setStartElement(start.toHapi())
    }
    if (hasEnd()) {
      hapiValue.setEndElement(end.toHapi())
    }
    return hapiValue
  }

  private fun MolecularSequence.StructureVariant.Inner.toHapi():
      org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantInnerComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MolecularSequence.MolecularSequenceStructureVariantInnerComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasStart()) {
      hapiValue.setStartElement(start.toHapi())
    }
    if (hasEnd()) {
      hapiValue.setEndElement(end.toHapi())
    }
    return hapiValue
  }
}
