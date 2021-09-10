package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.MeasureReport
import com.google.fhir.r4.core.MeasureReport.Group
import com.google.fhir.r4.core.MeasureReport.Group.Stratifier
import com.google.fhir.r4.core.MeasureReport.Group.Stratifier.StratifierGroup
import com.google.fhir.r4.core.MeasureReportStatusCode
import com.google.fhir.r4.core.MeasureReportTypeCode
import com.google.fhir.r4.core.String

public object MeasureReportConverter {
  public fun MeasureReport.toHapi(): org.hl7.fhir.r4.model.MeasureReport {
    val hapiValue = org.hl7.fhir.r4.model.MeasureReport()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.MeasureReport.MeasureReportStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasType()) {
      hapiValue.setType(org.hl7.fhir.r4.model.MeasureReport.MeasureReportType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasMeasure()) {
      hapiValue.setMeasureElement(measure.toHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasReporter()) {
      hapiValue.setReporter(reporter.toHapi())
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    if (hasImprovementNotation()) {
      hapiValue.setImprovementNotation(improvementNotation.toHapi())
    }
    if (groupCount > 0) {
      hapiValue.setGroup(groupList.map { it.toHapi() })
    }
    if (evaluatedResourceCount > 0) {
      hapiValue.setEvaluatedResource(evaluatedResourceList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MeasureReport.toProto(): MeasureReport {
    val protoValue = MeasureReport.newBuilder()
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
      protoValue.setStatus(MeasureReport.StatusCode.newBuilder().setValue(MeasureReportStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasType()) {
      protoValue.setType(MeasureReport.TypeCode.newBuilder().setValue(MeasureReportTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasMeasure()) {
      protoValue.setMeasure(measureElement.toProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasReporter()) {
      protoValue.setReporter(reporter.toProto())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    if (hasImprovementNotation()) {
      protoValue.setImprovementNotation(improvementNotation.toProto())
    }
    if (hasGroup()) {
      protoValue.addAllGroup(group.map { it.toProto() })
    }
    if (hasEvaluatedResource()) {
      protoValue.addAllEvaluatedResource(evaluatedResource.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupComponent.toProto():
      MeasureReport.Group {
    val protoValue = MeasureReport.Group.newBuilder()
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
    if (hasPopulation()) {
      protoValue.addAllPopulation(population.map { it.toProto() })
    }
    if (hasMeasureScore()) {
      protoValue.setMeasureScore(measureScore.toProto())
    }
    if (hasStratifier()) {
      protoValue.addAllStratifier(stratifier.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupPopulationComponent.toProto():
      MeasureReport.Group.Population {
    val protoValue = MeasureReport.Group.Population.newBuilder()
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
    if (hasCount()) {
      protoValue.setCount(countElement.toProto())
    }
    if (hasSubjectResults()) {
      protoValue.setSubjectResults(subjectResults.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupStratifierComponent.toProto():
      MeasureReport.Group.Stratifier {
    val protoValue = MeasureReport.Group.Stratifier.newBuilder()
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
      protoValue.addAllCode(code.map { it.toProto() })
    }
    if (hasStratum()) {
      protoValue.addAllStratum(stratum.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.MeasureReport.StratifierGroupComponent.toProto():
      MeasureReport.Group.Stratifier.StratifierGroup {
    val protoValue = MeasureReport.Group.Stratifier.StratifierGroup.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasValue()) {
      protoValue.setValue(value.toProto())
    }
    if (hasComponent()) {
      protoValue.addAllComponent(component.map { it.toProto() })
    }
    if (hasPopulation()) {
      protoValue.addAllPopulation(population.map { it.toProto() })
    }
    if (hasMeasureScore()) {
      protoValue.setMeasureScore(measureScore.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.MeasureReport.StratifierGroupComponentComponent.toProto():
      MeasureReport.Group.Stratifier.StratifierGroup.Component {
    val protoValue = MeasureReport.Group.Stratifier.StratifierGroup.Component.newBuilder()
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
    if (hasValue()) {
      protoValue.setValue(value.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.MeasureReport.StratifierGroupPopulationComponent.toProto():
      MeasureReport.Group.Stratifier.StratifierGroup.StratifierGroupPopulation {
    val protoValue =
        MeasureReport.Group.Stratifier.StratifierGroup.StratifierGroupPopulation.newBuilder()
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
    if (hasCount()) {
      protoValue.setCount(countElement.toProto())
    }
    if (hasSubjectResults()) {
      protoValue.setSubjectResults(subjectResults.toProto())
    }
    return protoValue.build()
  }

  private fun MeasureReport.Group.toHapi():
      org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupComponent {
    val hapiValue = org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupComponent()
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
    if (populationCount > 0) {
      hapiValue.setPopulation(populationList.map { it.toHapi() })
    }
    if (hasMeasureScore()) {
      hapiValue.setMeasureScore(measureScore.toHapi())
    }
    if (stratifierCount > 0) {
      hapiValue.setStratifier(stratifierList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun MeasureReport.Group.Population.toHapi():
      org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupPopulationComponent {
    val hapiValue = org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupPopulationComponent()
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
    if (hasCount()) {
      hapiValue.setCountElement(count.toHapi())
    }
    if (hasSubjectResults()) {
      hapiValue.setSubjectResults(subjectResults.toHapi())
    }
    return hapiValue
  }

  private fun MeasureReport.Group.Stratifier.toHapi():
      org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupStratifierComponent {
    val hapiValue = org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupStratifierComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (codeCount > 0) {
      hapiValue.setCode(codeList.map { it.toHapi() })
    }
    if (stratumCount > 0) {
      hapiValue.setStratum(stratumList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun MeasureReport.Group.Stratifier.StratifierGroup.toHapi():
      org.hl7.fhir.r4.model.MeasureReport.StratifierGroupComponent {
    val hapiValue = org.hl7.fhir.r4.model.MeasureReport.StratifierGroupComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasValue()) {
      hapiValue.setValue(value.toHapi())
    }
    if (componentCount > 0) {
      hapiValue.setComponent(componentList.map { it.toHapi() })
    }
    if (populationCount > 0) {
      hapiValue.setPopulation(populationList.map { it.toHapi() })
    }
    if (hasMeasureScore()) {
      hapiValue.setMeasureScore(measureScore.toHapi())
    }
    return hapiValue
  }

  private fun MeasureReport.Group.Stratifier.StratifierGroup.Component.toHapi():
      org.hl7.fhir.r4.model.MeasureReport.StratifierGroupComponentComponent {
    val hapiValue = org.hl7.fhir.r4.model.MeasureReport.StratifierGroupComponentComponent()
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
    if (hasValue()) {
      hapiValue.setValue(value.toHapi())
    }
    return hapiValue
  }

  private fun MeasureReport.Group.Stratifier.StratifierGroup.StratifierGroupPopulation.toHapi():
      org.hl7.fhir.r4.model.MeasureReport.StratifierGroupPopulationComponent {
    val hapiValue = org.hl7.fhir.r4.model.MeasureReport.StratifierGroupPopulationComponent()
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
    if (hasCount()) {
      hapiValue.setCountElement(count.toHapi())
    }
    if (hasSubjectResults()) {
      hapiValue.setSubjectResults(subjectResults.toHapi())
    }
    return hapiValue
  }
}
