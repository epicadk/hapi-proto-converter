package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AddressConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AddressConverter.toProto
import com.epicadk.hapiprotoconverter.converter.AgeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AgeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AnnotationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toProto
import com.epicadk.hapiprotoconverter.converter.Base64BinaryConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.Base64BinaryConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContributorConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContributorConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CountConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CountConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DataRequirementConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DataRequirementConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DistanceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DistanceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DosageConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DosageConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExpressionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExpressionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.HumanNameConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.HumanNameConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MoneyConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MoneyConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.OidConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.OidConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ParameterDefinitionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ParameterDefinitionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RatioConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RelatedArtifactConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RelatedArtifactConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SampledDataConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SampledDataConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SignatureConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SignatureConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TriggerDefinitionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TriggerDefinitionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UrlConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UrlConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UuidConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UuidConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.RequestPriorityCode
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.Task
import com.google.fhir.r4.core.Task.Output
import com.google.fhir.r4.core.Task.Parameter
import com.google.fhir.r4.core.TaskIntentValueSet
import com.google.fhir.r4.core.TaskStatusCode
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Address
import org.hl7.fhir.r4.model.Age
import org.hl7.fhir.r4.model.Annotation
import org.hl7.fhir.r4.model.Attachment
import org.hl7.fhir.r4.model.Base64BinaryType
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.CanonicalType
import org.hl7.fhir.r4.model.CodeType
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.Coding
import org.hl7.fhir.r4.model.ContactDetail
import org.hl7.fhir.r4.model.ContactPoint
import org.hl7.fhir.r4.model.Contributor
import org.hl7.fhir.r4.model.Count
import org.hl7.fhir.r4.model.DataRequirement
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.DateType
import org.hl7.fhir.r4.model.DecimalType
import org.hl7.fhir.r4.model.Distance
import org.hl7.fhir.r4.model.Dosage
import org.hl7.fhir.r4.model.Duration
import org.hl7.fhir.r4.model.Expression
import org.hl7.fhir.r4.model.HumanName
import org.hl7.fhir.r4.model.IdType
import org.hl7.fhir.r4.model.Identifier
import org.hl7.fhir.r4.model.InstantType
import org.hl7.fhir.r4.model.IntegerType
import org.hl7.fhir.r4.model.MarkdownType
import org.hl7.fhir.r4.model.Money
import org.hl7.fhir.r4.model.OidType
import org.hl7.fhir.r4.model.ParameterDefinition
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.PositiveIntType
import org.hl7.fhir.r4.model.Quantity
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.Ratio
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.RelatedArtifact
import org.hl7.fhir.r4.model.SampledData
import org.hl7.fhir.r4.model.Signature
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.TimeType
import org.hl7.fhir.r4.model.Timing
import org.hl7.fhir.r4.model.TriggerDefinition
import org.hl7.fhir.r4.model.Type
import org.hl7.fhir.r4.model.UnsignedIntType
import org.hl7.fhir.r4.model.UriType
import org.hl7.fhir.r4.model.UrlType
import org.hl7.fhir.r4.model.UsageContext
import org.hl7.fhir.r4.model.UuidType

public object TaskConverter {
  private fun Task.Parameter.ValueX.taskInputValueToHapi(): Type {
    if (hasBase64Binary()) {
      return (this.getBase64Binary()).toHapi()
    }
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasCanonical()) {
      return (this.getCanonical()).toHapi()
    }
    if (hasCode()) {
      return (this.getCode()).toHapi()
    }
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasDecimal()) {
      return (this.getDecimal()).toHapi()
    }
    if (hasId()) {
      return (this.getId()).toHapi()
    }
    if (hasInstant()) {
      return (this.getInstant()).toHapi()
    }
    if (hasInteger()) {
      return (this.getInteger()).toHapi()
    }
    if (hasMarkdown()) {
      return (this.getMarkdown()).toHapi()
    }
    if (hasOid()) {
      return (this.getOid()).toHapi()
    }
    if (hasPositiveInt()) {
      return (this.getPositiveInt()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    if (hasTime()) {
      return (this.getTime()).toHapi()
    }
    if (hasUnsignedInt()) {
      return (this.getUnsignedInt()).toHapi()
    }
    if (hasUri()) {
      return (this.getUri()).toHapi()
    }
    if (hasUrl()) {
      return (this.getUrl()).toHapi()
    }
    if (hasUuid()) {
      return (this.getUuid()).toHapi()
    }
    if (hasAddress()) {
      return (this.getAddress()).toHapi()
    }
    if (hasAge()) {
      return (this.getAge()).toHapi()
    }
    if (hasAnnotation()) {
      return (this.getAnnotation()).toHapi()
    }
    if (hasAttachment()) {
      return (this.getAttachment()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasCoding()) {
      return (this.getCoding()).toHapi()
    }
    if (hasContactPoint()) {
      return (this.getContactPoint()).toHapi()
    }
    if (hasCount()) {
      return (this.getCount()).toHapi()
    }
    if (hasDistance()) {
      return (this.getDistance()).toHapi()
    }
    if (hasDuration()) {
      return (this.getDuration()).toHapi()
    }
    if (hasHumanName()) {
      return (this.getHumanName()).toHapi()
    }
    if (hasIdentifier()) {
      return (this.getIdentifier()).toHapi()
    }
    if (hasMoney()) {
      return (this.getMoney()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasRatio()) {
      return (this.getRatio()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    if (hasSampledData()) {
      return (this.getSampledData()).toHapi()
    }
    if (hasSignature()) {
      return (this.getSignature()).toHapi()
    }
    if (hasTiming()) {
      return (this.getTiming()).toHapi()
    }
    if (hasContactDetail()) {
      return (this.getContactDetail()).toHapi()
    }
    if (hasContributor()) {
      return (this.getContributor()).toHapi()
    }
    if (hasDataRequirement()) {
      return (this.getDataRequirement()).toHapi()
    }
    if (hasExpression()) {
      return (this.getExpression()).toHapi()
    }
    if (hasParameterDefinition()) {
      return (this.getParameterDefinition()).toHapi()
    }
    if (hasRelatedArtifact()) {
      return (this.getRelatedArtifact()).toHapi()
    }
    if (hasTriggerDefinition()) {
      return (this.getTriggerDefinition()).toHapi()
    }
    if (hasUsageContext()) {
      return (this.getUsageContext()).toHapi()
    }
    if (hasDosage()) {
      return (this.getDosage()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Task.input.value[x]")
  }

  private fun Type.taskInputValueToProto(): Task.Parameter.ValueX {
    val protoValue = Task.Parameter.ValueX.newBuilder()
    if (this is Base64BinaryType) {
      protoValue.setBase64Binary(this.toProto())
    }
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is CanonicalType) {
      protoValue.setCanonical(this.toProto())
    }
    if (this is CodeType) {
      protoValue.setCode(this.toProto())
    }
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is DecimalType) {
      protoValue.setDecimal(this.toProto())
    }
    if (this is IdType) {
      protoValue.setId(this.toProto())
    }
    if (this is InstantType) {
      protoValue.setInstant(this.toProto())
    }
    if (this is IntegerType) {
      protoValue.setInteger(this.toProto())
    }
    if (this is MarkdownType) {
      protoValue.setMarkdown(this.toProto())
    }
    if (this is OidType) {
      protoValue.setOid(this.toProto())
    }
    if (this is PositiveIntType) {
      protoValue.setPositiveInt(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is TimeType) {
      protoValue.setTime(this.toProto())
    }
    if (this is UnsignedIntType) {
      protoValue.setUnsignedInt(this.toProto())
    }
    if (this is UriType) {
      protoValue.setUri(this.toProto())
    }
    if (this is UrlType) {
      protoValue.setUrl(this.toProto())
    }
    if (this is UuidType) {
      protoValue.setUuid(this.toProto())
    }
    if (this is Address) {
      protoValue.setAddress(this.toProto())
    }
    if (this is Age) {
      protoValue.setAge(this.toProto())
    }
    if (this is Annotation) {
      protoValue.setAnnotation(this.toProto())
    }
    if (this is Attachment) {
      protoValue.setAttachment(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Coding) {
      protoValue.setCoding(this.toProto())
    }
    if (this is ContactPoint) {
      protoValue.setContactPoint(this.toProto())
    }
    if (this is Count) {
      protoValue.setCount(this.toProto())
    }
    if (this is Distance) {
      protoValue.setDistance(this.toProto())
    }
    if (this is Duration) {
      protoValue.setDuration(this.toProto())
    }
    if (this is HumanName) {
      protoValue.setHumanName(this.toProto())
    }
    if (this is Identifier) {
      protoValue.setIdentifier(this.toProto())
    }
    if (this is Money) {
      protoValue.setMoney(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    if (this is Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is Ratio) {
      protoValue.setRatio(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    if (this is SampledData) {
      protoValue.setSampledData(this.toProto())
    }
    if (this is Signature) {
      protoValue.setSignature(this.toProto())
    }
    if (this is Timing) {
      protoValue.setTiming(this.toProto())
    }
    if (this is ContactDetail) {
      protoValue.setContactDetail(this.toProto())
    }
    if (this is Contributor) {
      protoValue.setContributor(this.toProto())
    }
    if (this is DataRequirement) {
      protoValue.setDataRequirement(this.toProto())
    }
    if (this is Expression) {
      protoValue.setExpression(this.toProto())
    }
    if (this is ParameterDefinition) {
      protoValue.setParameterDefinition(this.toProto())
    }
    if (this is RelatedArtifact) {
      protoValue.setRelatedArtifact(this.toProto())
    }
    if (this is TriggerDefinition) {
      protoValue.setTriggerDefinition(this.toProto())
    }
    if (this is UsageContext) {
      protoValue.setUsageContext(this.toProto())
    }
    if (this is Dosage) {
      protoValue.setDosage(this.toProto())
    }
    return protoValue.build()
  }

  private fun Task.Output.ValueX.taskOutputValueToHapi(): Type {
    if (hasBase64Binary()) {
      return (this.getBase64Binary()).toHapi()
    }
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasCanonical()) {
      return (this.getCanonical()).toHapi()
    }
    if (hasCode()) {
      return (this.getCode()).toHapi()
    }
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasDecimal()) {
      return (this.getDecimal()).toHapi()
    }
    if (hasId()) {
      return (this.getId()).toHapi()
    }
    if (hasInstant()) {
      return (this.getInstant()).toHapi()
    }
    if (hasInteger()) {
      return (this.getInteger()).toHapi()
    }
    if (hasMarkdown()) {
      return (this.getMarkdown()).toHapi()
    }
    if (hasOid()) {
      return (this.getOid()).toHapi()
    }
    if (hasPositiveInt()) {
      return (this.getPositiveInt()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    if (hasTime()) {
      return (this.getTime()).toHapi()
    }
    if (hasUnsignedInt()) {
      return (this.getUnsignedInt()).toHapi()
    }
    if (hasUri()) {
      return (this.getUri()).toHapi()
    }
    if (hasUrl()) {
      return (this.getUrl()).toHapi()
    }
    if (hasUuid()) {
      return (this.getUuid()).toHapi()
    }
    if (hasAddress()) {
      return (this.getAddress()).toHapi()
    }
    if (hasAge()) {
      return (this.getAge()).toHapi()
    }
    if (hasAnnotation()) {
      return (this.getAnnotation()).toHapi()
    }
    if (hasAttachment()) {
      return (this.getAttachment()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasCoding()) {
      return (this.getCoding()).toHapi()
    }
    if (hasContactPoint()) {
      return (this.getContactPoint()).toHapi()
    }
    if (hasCount()) {
      return (this.getCount()).toHapi()
    }
    if (hasDistance()) {
      return (this.getDistance()).toHapi()
    }
    if (hasDuration()) {
      return (this.getDuration()).toHapi()
    }
    if (hasHumanName()) {
      return (this.getHumanName()).toHapi()
    }
    if (hasIdentifier()) {
      return (this.getIdentifier()).toHapi()
    }
    if (hasMoney()) {
      return (this.getMoney()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasRatio()) {
      return (this.getRatio()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    if (hasSampledData()) {
      return (this.getSampledData()).toHapi()
    }
    if (hasSignature()) {
      return (this.getSignature()).toHapi()
    }
    if (hasTiming()) {
      return (this.getTiming()).toHapi()
    }
    if (hasContactDetail()) {
      return (this.getContactDetail()).toHapi()
    }
    if (hasContributor()) {
      return (this.getContributor()).toHapi()
    }
    if (hasDataRequirement()) {
      return (this.getDataRequirement()).toHapi()
    }
    if (hasExpression()) {
      return (this.getExpression()).toHapi()
    }
    if (hasParameterDefinition()) {
      return (this.getParameterDefinition()).toHapi()
    }
    if (hasRelatedArtifact()) {
      return (this.getRelatedArtifact()).toHapi()
    }
    if (hasTriggerDefinition()) {
      return (this.getTriggerDefinition()).toHapi()
    }
    if (hasUsageContext()) {
      return (this.getUsageContext()).toHapi()
    }
    if (hasDosage()) {
      return (this.getDosage()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Task.output.value[x]")
  }

  private fun Type.taskOutputValueToProto(): Task.Output.ValueX {
    val protoValue = Task.Output.ValueX.newBuilder()
    if (this is Base64BinaryType) {
      protoValue.setBase64Binary(this.toProto())
    }
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is CanonicalType) {
      protoValue.setCanonical(this.toProto())
    }
    if (this is CodeType) {
      protoValue.setCode(this.toProto())
    }
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is DecimalType) {
      protoValue.setDecimal(this.toProto())
    }
    if (this is IdType) {
      protoValue.setId(this.toProto())
    }
    if (this is InstantType) {
      protoValue.setInstant(this.toProto())
    }
    if (this is IntegerType) {
      protoValue.setInteger(this.toProto())
    }
    if (this is MarkdownType) {
      protoValue.setMarkdown(this.toProto())
    }
    if (this is OidType) {
      protoValue.setOid(this.toProto())
    }
    if (this is PositiveIntType) {
      protoValue.setPositiveInt(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is TimeType) {
      protoValue.setTime(this.toProto())
    }
    if (this is UnsignedIntType) {
      protoValue.setUnsignedInt(this.toProto())
    }
    if (this is UriType) {
      protoValue.setUri(this.toProto())
    }
    if (this is UrlType) {
      protoValue.setUrl(this.toProto())
    }
    if (this is UuidType) {
      protoValue.setUuid(this.toProto())
    }
    if (this is Address) {
      protoValue.setAddress(this.toProto())
    }
    if (this is Age) {
      protoValue.setAge(this.toProto())
    }
    if (this is Annotation) {
      protoValue.setAnnotation(this.toProto())
    }
    if (this is Attachment) {
      protoValue.setAttachment(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Coding) {
      protoValue.setCoding(this.toProto())
    }
    if (this is ContactPoint) {
      protoValue.setContactPoint(this.toProto())
    }
    if (this is Count) {
      protoValue.setCount(this.toProto())
    }
    if (this is Distance) {
      protoValue.setDistance(this.toProto())
    }
    if (this is Duration) {
      protoValue.setDuration(this.toProto())
    }
    if (this is HumanName) {
      protoValue.setHumanName(this.toProto())
    }
    if (this is Identifier) {
      protoValue.setIdentifier(this.toProto())
    }
    if (this is Money) {
      protoValue.setMoney(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    if (this is Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is Ratio) {
      protoValue.setRatio(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    if (this is SampledData) {
      protoValue.setSampledData(this.toProto())
    }
    if (this is Signature) {
      protoValue.setSignature(this.toProto())
    }
    if (this is Timing) {
      protoValue.setTiming(this.toProto())
    }
    if (this is ContactDetail) {
      protoValue.setContactDetail(this.toProto())
    }
    if (this is Contributor) {
      protoValue.setContributor(this.toProto())
    }
    if (this is DataRequirement) {
      protoValue.setDataRequirement(this.toProto())
    }
    if (this is Expression) {
      protoValue.setExpression(this.toProto())
    }
    if (this is ParameterDefinition) {
      protoValue.setParameterDefinition(this.toProto())
    }
    if (this is RelatedArtifact) {
      protoValue.setRelatedArtifact(this.toProto())
    }
    if (this is TriggerDefinition) {
      protoValue.setTriggerDefinition(this.toProto())
    }
    if (this is UsageContext) {
      protoValue.setUsageContext(this.toProto())
    }
    if (this is Dosage) {
      protoValue.setDosage(this.toProto())
    }
    return protoValue.build()
  }

  public fun Task.toHapi(): org.hl7.fhir.r4.model.Task {
    val hapiValue = org.hl7.fhir.r4.model.Task()
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
    if (hasInstantiatesCanonical()) {
      hapiValue.setInstantiatesCanonicalElement(instantiatesCanonical.toHapi())
    }
    if (hasInstantiatesUri()) {
      hapiValue.setInstantiatesUriElement(instantiatesUri.toHapi())
    }
    if (basedOnCount > 0) {
      hapiValue.setBasedOn(basedOnList.map { it.toHapi() })
    }
    if (hasGroupIdentifier()) {
      hapiValue.setGroupIdentifier(groupIdentifier.toHapi())
    }
    if (partOfCount > 0) {
      hapiValue.setPartOf(partOfList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.Task.TaskStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasStatusReason()) {
      hapiValue.setStatusReason(statusReason.toHapi())
    }
    if (hasBusinessStatus()) {
      hapiValue.setBusinessStatus(businessStatus.toHapi())
    }
    if (hasIntent()) {
      hapiValue.setIntent(org.hl7.fhir.r4.model.Task.TaskIntent.valueOf(intent.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPriority()) {
      hapiValue.setPriority(org.hl7.fhir.r4.model.Task.TaskPriority.valueOf(priority.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasFocus()) {
      hapiValue.setFocus(focus.toHapi())
    }
    if (hasForValue()) {
      hapiValue.setFor(forValue.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasExecutionPeriod()) {
      hapiValue.setExecutionPeriod(executionPeriod.toHapi())
    }
    if (hasAuthoredOn()) {
      hapiValue.setAuthoredOnElement(authoredOn.toHapi())
    }
    if (hasLastModified()) {
      hapiValue.setLastModifiedElement(lastModified.toHapi())
    }
    if (hasRequester()) {
      hapiValue.setRequester(requester.toHapi())
    }
    if (performerTypeCount > 0) {
      hapiValue.setPerformerType(performerTypeList.map { it.toHapi() })
    }
    if (hasOwner()) {
      hapiValue.setOwner(owner.toHapi())
    }
    if (hasLocation()) {
      hapiValue.setLocation(location.toHapi())
    }
    if (hasReasonCode()) {
      hapiValue.setReasonCode(reasonCode.toHapi())
    }
    if (hasReasonReference()) {
      hapiValue.setReasonReference(reasonReference.toHapi())
    }
    if (insuranceCount > 0) {
      hapiValue.setInsurance(insuranceList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (relevantHistoryCount > 0) {
      hapiValue.setRelevantHistory(relevantHistoryList.map { it.toHapi() })
    }
    if (hasRestriction()) {
      hapiValue.setRestriction(restriction.toHapi())
    }
    if (inputCount > 0) {
      hapiValue.setInput(inputList.map { it.toHapi() })
    }
    if (outputCount > 0) {
      hapiValue.setOutput(outputList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Task.toProto(): Task {
    val protoValue = Task.newBuilder()
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
    if (hasInstantiatesCanonical()) {
      protoValue.setInstantiatesCanonical(instantiatesCanonicalElement.toProto())
    }
    if (hasInstantiatesUri()) {
      protoValue.setInstantiatesUri(instantiatesUriElement.toProto())
    }
    if (hasBasedOn()) {
      protoValue.addAllBasedOn(basedOn.map { it.toProto() })
    }
    if (hasGroupIdentifier()) {
      protoValue.setGroupIdentifier(groupIdentifier.toProto())
    }
    if (hasPartOf()) {
      protoValue.addAllPartOf(partOf.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(Task.StatusCode.newBuilder().setValue(TaskStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasStatusReason()) {
      protoValue.setStatusReason(statusReason.toProto())
    }
    if (hasBusinessStatus()) {
      protoValue.setBusinessStatus(businessStatus.toProto())
    }
    if (hasIntent()) {
      protoValue.setIntent(Task.IntentCode.newBuilder().setValue(TaskIntentValueSet.Value.valueOf(intent.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPriority()) {
      protoValue.setPriority(Task.PriorityCode.newBuilder().setValue(RequestPriorityCode.Value.valueOf(priority.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasFocus()) {
      protoValue.setFocus(focus.toProto())
    }
    if (hasFor()) {
      protoValue.setForValue(`for`.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasExecutionPeriod()) {
      protoValue.setExecutionPeriod(executionPeriod.toProto())
    }
    if (hasAuthoredOn()) {
      protoValue.setAuthoredOn(authoredOnElement.toProto())
    }
    if (hasLastModified()) {
      protoValue.setLastModified(lastModifiedElement.toProto())
    }
    if (hasRequester()) {
      protoValue.setRequester(requester.toProto())
    }
    if (hasPerformerType()) {
      protoValue.addAllPerformerType(performerType.map { it.toProto() })
    }
    if (hasOwner()) {
      protoValue.setOwner(owner.toProto())
    }
    if (hasLocation()) {
      protoValue.setLocation(location.toProto())
    }
    if (hasReasonCode()) {
      protoValue.setReasonCode(reasonCode.toProto())
    }
    if (hasReasonReference()) {
      protoValue.setReasonReference(reasonReference.toProto())
    }
    if (hasInsurance()) {
      protoValue.addAllInsurance(insurance.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasRelevantHistory()) {
      protoValue.addAllRelevantHistory(relevantHistory.map { it.toProto() })
    }
    if (hasRestriction()) {
      protoValue.setRestriction(restriction.toProto())
    }
    if (hasInput()) {
      protoValue.addAllInput(input.map { it.toProto() })
    }
    if (hasOutput()) {
      protoValue.addAllOutput(output.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Task.TaskRestrictionComponent.toProto(): Task.Restriction {
    val protoValue = Task.Restriction.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasRepetitions()) {
      protoValue.setRepetitions(repetitionsElement.toProto())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    if (hasRecipient()) {
      protoValue.addAllRecipient(recipient.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Task.ParameterComponent.toProto(): Task.Parameter {
    val protoValue = Task.Parameter.newBuilder()
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
    if (hasValue()) {
      protoValue.setValue(value.taskInputValueToProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Task.TaskOutputComponent.toProto(): Task.Output {
    val protoValue = Task.Output.newBuilder()
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
    if (hasValue()) {
      protoValue.setValue(value.taskOutputValueToProto())
    }
    return protoValue.build()
  }

  private fun Task.Restriction.toHapi(): org.hl7.fhir.r4.model.Task.TaskRestrictionComponent {
    val hapiValue = org.hl7.fhir.r4.model.Task.TaskRestrictionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasRepetitions()) {
      hapiValue.setRepetitionsElement(repetitions.toHapi())
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    if (recipientCount > 0) {
      hapiValue.setRecipient(recipientList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun Task.Parameter.toHapi(): org.hl7.fhir.r4.model.Task.ParameterComponent {
    val hapiValue = org.hl7.fhir.r4.model.Task.ParameterComponent()
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
    if (hasValue()) {
      hapiValue.setValue(value.taskInputValueToHapi())
    }
    return hapiValue
  }

  private fun Task.Output.toHapi(): org.hl7.fhir.r4.model.Task.TaskOutputComponent {
    val hapiValue = org.hl7.fhir.r4.model.Task.TaskOutputComponent()
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
    if (hasValue()) {
      hapiValue.setValue(value.taskOutputValueToHapi())
    }
    return hapiValue
  }
}
