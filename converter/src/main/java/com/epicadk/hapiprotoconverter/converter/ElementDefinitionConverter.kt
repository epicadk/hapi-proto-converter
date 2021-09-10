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
import com.epicadk.hapiprotoconverter.converter.MoneyConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MoneyConverter.toProto
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
import com.google.fhir.r4.core.AggregationModeCode
import com.google.fhir.r4.core.BindingStrengthCode
import com.google.fhir.r4.core.ConstraintSeverityCode
import com.google.fhir.r4.core.DiscriminatorTypeCode
import com.google.fhir.r4.core.ElementDefinition
import com.google.fhir.r4.core.ElementDefinition.Constraint
import com.google.fhir.r4.core.ElementDefinition.ElementDefinitionBinding
import com.google.fhir.r4.core.ElementDefinition.Example
import com.google.fhir.r4.core.ElementDefinition.Mapping
import com.google.fhir.r4.core.ElementDefinition.Slicing
import com.google.fhir.r4.core.ElementDefinition.Slicing.Discriminator
import com.google.fhir.r4.core.ElementDefinition.TypeRef
import com.google.fhir.r4.core.PropertyRepresentationCode
import com.google.fhir.r4.core.ReferenceVersionRulesCode
import com.google.fhir.r4.core.SlicingRulesCode
import com.google.fhir.r4.core.String
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
import org.hl7.fhir.r4.model.Enumerations
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

public object ElementDefinitionConverter {
  private fun ElementDefinition.DefaultValueX.elementDefinitionDefaultValueToHapi(): Type {
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
    throw IllegalArgumentException("Invalid Type for ElementDefinition.defaultValue[x]")
  }

  private fun Type.elementDefinitionDefaultValueToProto(): ElementDefinition.DefaultValueX {
    val protoValue = ElementDefinition.DefaultValueX.newBuilder()
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

  private fun ElementDefinition.FixedX.elementDefinitionFixedToHapi(): Type {
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
    throw IllegalArgumentException("Invalid Type for ElementDefinition.fixed[x]")
  }

  private fun Type.elementDefinitionFixedToProto(): ElementDefinition.FixedX {
    val protoValue = ElementDefinition.FixedX.newBuilder()
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

  private fun ElementDefinition.PatternX.elementDefinitionPatternToHapi(): Type {
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
    throw IllegalArgumentException("Invalid Type for ElementDefinition.pattern[x]")
  }

  private fun Type.elementDefinitionPatternToProto(): ElementDefinition.PatternX {
    val protoValue = ElementDefinition.PatternX.newBuilder()
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

  private fun ElementDefinition.Example.ValueX.elementDefinitionExampleValueToHapi(): Type {
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
    throw IllegalArgumentException("Invalid Type for ElementDefinition.example.value[x]")
  }

  private fun Type.elementDefinitionExampleValueToProto(): ElementDefinition.Example.ValueX {
    val protoValue = ElementDefinition.Example.ValueX.newBuilder()
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

  private fun ElementDefinition.MinValueX.elementDefinitionMinValueToHapi(): Type {
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasInstant()) {
      return (this.getInstant()).toHapi()
    }
    if (hasTime()) {
      return (this.getTime()).toHapi()
    }
    if (hasDecimal()) {
      return (this.getDecimal()).toHapi()
    }
    if (hasInteger()) {
      return (this.getInteger()).toHapi()
    }
    if (hasPositiveInt()) {
      return (this.getPositiveInt()).toHapi()
    }
    if (hasUnsignedInt()) {
      return (this.getUnsignedInt()).toHapi()
    }
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ElementDefinition.minValue[x]")
  }

  private fun Type.elementDefinitionMinValueToProto(): ElementDefinition.MinValueX {
    val protoValue = ElementDefinition.MinValueX.newBuilder()
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is InstantType) {
      protoValue.setInstant(this.toProto())
    }
    if (this is TimeType) {
      protoValue.setTime(this.toProto())
    }
    if (this is DecimalType) {
      protoValue.setDecimal(this.toProto())
    }
    if (this is IntegerType) {
      protoValue.setInteger(this.toProto())
    }
    if (this is PositiveIntType) {
      protoValue.setPositiveInt(this.toProto())
    }
    if (this is UnsignedIntType) {
      protoValue.setUnsignedInt(this.toProto())
    }
    if (this is Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    return protoValue.build()
  }

  private fun ElementDefinition.MaxValueX.elementDefinitionMaxValueToHapi(): Type {
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasInstant()) {
      return (this.getInstant()).toHapi()
    }
    if (hasTime()) {
      return (this.getTime()).toHapi()
    }
    if (hasDecimal()) {
      return (this.getDecimal()).toHapi()
    }
    if (hasInteger()) {
      return (this.getInteger()).toHapi()
    }
    if (hasPositiveInt()) {
      return (this.getPositiveInt()).toHapi()
    }
    if (hasUnsignedInt()) {
      return (this.getUnsignedInt()).toHapi()
    }
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ElementDefinition.maxValue[x]")
  }

  private fun Type.elementDefinitionMaxValueToProto(): ElementDefinition.MaxValueX {
    val protoValue = ElementDefinition.MaxValueX.newBuilder()
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is InstantType) {
      protoValue.setInstant(this.toProto())
    }
    if (this is TimeType) {
      protoValue.setTime(this.toProto())
    }
    if (this is DecimalType) {
      protoValue.setDecimal(this.toProto())
    }
    if (this is IntegerType) {
      protoValue.setInteger(this.toProto())
    }
    if (this is PositiveIntType) {
      protoValue.setPositiveInt(this.toProto())
    }
    if (this is UnsignedIntType) {
      protoValue.setUnsignedInt(this.toProto())
    }
    if (this is Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    return protoValue.build()
  }

  public fun ElementDefinition.toHapi(): org.hl7.fhir.r4.model.ElementDefinition {
    val hapiValue = org.hl7.fhir.r4.model.ElementDefinition()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasPath()) {
      hapiValue.setPathElement(path.toHapi())
    }
    if (representationCount > 0) {
      representationList.forEach { hapiValue.addRepresentation(org.hl7.fhir.r4.model.ElementDefinition.PropertyRepresentation.valueOf(it.value.name.hapiCodeCheck().replace("_", ""))) }
    }
    if (hasSliceName()) {
      hapiValue.setSliceNameElement(sliceName.toHapi())
    }
    if (hasSliceIsConstraining()) {
      hapiValue.setSliceIsConstrainingElement(sliceIsConstraining.toHapi())
    }
    if (hasLabel()) {
      hapiValue.setLabelElement(label.toHapi())
    }
    if (codeCount > 0) {
      hapiValue.setCode(codeList.map { it.toHapi() })
    }
    if (hasSlicing()) {
      hapiValue.setSlicing(slicing.toHapi())
    }
    if (hasShort()) {
      hapiValue.setShortElement(short.toHapi())
    }
    if (hasDefinition()) {
      hapiValue.setDefinitionElement(definition.toHapi())
    }
    if (hasComment()) {
      hapiValue.setCommentElement(comment.toHapi())
    }
    if (hasRequirements()) {
      hapiValue.setRequirementsElement(requirements.toHapi())
    }
    if (aliasCount > 0) {
      hapiValue.setAlias(aliasList.map { it.toHapi() })
    }
    if (hasMin()) {
      hapiValue.setMinElement(min.toHapi())
    }
    if (hasMax()) {
      hapiValue.setMaxElement(max.toHapi())
    }
    if (hasBase()) {
      hapiValue.setBase(base.toHapi())
    }
    if (hasContentReference()) {
      hapiValue.setContentReferenceElement(contentReference.toHapi())
    }
    if (typeCount > 0) {
      hapiValue.setType(typeList.map { it.toHapi() })
    }
    if (hasDefaultValue()) {
      hapiValue.setDefaultValue(defaultValue.elementDefinitionDefaultValueToHapi())
    }
    if (hasMeaningWhenMissing()) {
      hapiValue.setMeaningWhenMissingElement(meaningWhenMissing.toHapi())
    }
    if (hasOrderMeaning()) {
      hapiValue.setOrderMeaningElement(orderMeaning.toHapi())
    }
    if (hasFixed()) {
      hapiValue.setFixed(fixed.elementDefinitionFixedToHapi())
    }
    if (hasPattern()) {
      hapiValue.setPattern(pattern.elementDefinitionPatternToHapi())
    }
    if (exampleCount > 0) {
      hapiValue.setExample(exampleList.map { it.toHapi() })
    }
    if (hasMinValue()) {
      hapiValue.setMinValue(minValue.elementDefinitionMinValueToHapi())
    }
    if (hasMaxValue()) {
      hapiValue.setMaxValue(maxValue.elementDefinitionMaxValueToHapi())
    }
    if (hasMaxLength()) {
      hapiValue.setMaxLengthElement(maxLength.toHapi())
    }
    if (conditionCount > 0) {
      hapiValue.setCondition(conditionList.map { it.toHapi() })
    }
    if (constraintCount > 0) {
      hapiValue.setConstraint(constraintList.map { it.toHapi() })
    }
    if (hasMustSupport()) {
      hapiValue.setMustSupportElement(mustSupport.toHapi())
    }
    if (hasIsModifier()) {
      hapiValue.setIsModifierElement(isModifier.toHapi())
    }
    if (hasIsModifierReason()) {
      hapiValue.setIsModifierReasonElement(isModifierReason.toHapi())
    }
    if (hasIsSummary()) {
      hapiValue.setIsSummaryElement(isSummary.toHapi())
    }
    if (hasBinding()) {
      hapiValue.setBinding(binding.toHapi())
    }
    if (mappingCount > 0) {
      hapiValue.setMapping(mappingList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ElementDefinition.toProto(): ElementDefinition {
    val protoValue = ElementDefinition.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasPath()) {
      protoValue.setPath(pathElement.toProto())
    }
    if (hasRepresentation()) {
      protoValue.addAllRepresentation(representation.map { ElementDefinition.RepresentationCode.newBuilder().setValue(PropertyRepresentationCode.Value.valueOf(it.value.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build() })
    }
    if (hasSliceName()) {
      protoValue.setSliceName(sliceNameElement.toProto())
    }
    if (hasSliceIsConstraining()) {
      protoValue.setSliceIsConstraining(sliceIsConstrainingElement.toProto())
    }
    if (hasLabel()) {
      protoValue.setLabel(labelElement.toProto())
    }
    if (hasCode()) {
      protoValue.addAllCode(code.map { it.toProto() })
    }
    if (hasSlicing()) {
      protoValue.setSlicing(slicing.toProto())
    }
    if (hasShort()) {
      protoValue.setShort(shortElement.toProto())
    }
    if (hasDefinition()) {
      protoValue.setDefinition(definitionElement.toProto())
    }
    if (hasComment()) {
      protoValue.setComment(commentElement.toProto())
    }
    if (hasRequirements()) {
      protoValue.setRequirements(requirementsElement.toProto())
    }
    if (hasAlias()) {
      protoValue.addAllAlias(alias.map { it.toProto() })
    }
    if (hasMin()) {
      protoValue.setMin(minElement.toProto())
    }
    if (hasMax()) {
      protoValue.setMax(maxElement.toProto())
    }
    if (hasBase()) {
      protoValue.setBase(base.toProto())
    }
    if (hasContentReference()) {
      protoValue.setContentReference(contentReferenceElement.toProto())
    }
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasDefaultValue()) {
      protoValue.setDefaultValue(defaultValue.elementDefinitionDefaultValueToProto())
    }
    if (hasMeaningWhenMissing()) {
      protoValue.setMeaningWhenMissing(meaningWhenMissingElement.toProto())
    }
    if (hasOrderMeaning()) {
      protoValue.setOrderMeaning(orderMeaningElement.toProto())
    }
    if (hasFixed()) {
      protoValue.setFixed(fixed.elementDefinitionFixedToProto())
    }
    if (hasPattern()) {
      protoValue.setPattern(pattern.elementDefinitionPatternToProto())
    }
    if (hasExample()) {
      protoValue.addAllExample(example.map { it.toProto() })
    }
    if (hasMinValue()) {
      protoValue.setMinValue(minValue.elementDefinitionMinValueToProto())
    }
    if (hasMaxValue()) {
      protoValue.setMaxValue(maxValue.elementDefinitionMaxValueToProto())
    }
    if (hasMaxLength()) {
      protoValue.setMaxLength(maxLengthElement.toProto())
    }
    if (hasCondition()) {
      protoValue.addAllCondition(condition.map { it.toProto() })
    }
    if (hasConstraint()) {
      protoValue.addAllConstraint(constraint.map { it.toProto() })
    }
    if (hasMustSupport()) {
      protoValue.setMustSupport(mustSupportElement.toProto())
    }
    if (hasIsModifier()) {
      protoValue.setIsModifier(isModifierElement.toProto())
    }
    if (hasIsModifierReason()) {
      protoValue.setIsModifierReason(isModifierReasonElement.toProto())
    }
    if (hasIsSummary()) {
      protoValue.setIsSummary(isSummaryElement.toProto())
    }
    if (hasBinding()) {
      protoValue.setBinding(binding.toProto())
    }
    if (hasMapping()) {
      protoValue.addAllMapping(mapping.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingComponent.toProto():
      ElementDefinition.Slicing {
    val protoValue = ElementDefinition.Slicing.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasDiscriminator()) {
      protoValue.addAllDiscriminator(discriminator.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasOrdered()) {
      protoValue.setOrdered(orderedElement.toProto())
    }
    if (hasRules()) {
      protoValue.setRules(ElementDefinition.Slicing.RulesCode.newBuilder().setValue(SlicingRulesCode.Value.valueOf(rules.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingDiscriminatorComponent.toProto():
      ElementDefinition.Slicing.Discriminator {
    val protoValue = ElementDefinition.Slicing.Discriminator.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.setType(ElementDefinition.Slicing.Discriminator.TypeCode.newBuilder().setValue(DiscriminatorTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPath()) {
      protoValue.setPath(pathElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBaseComponent.toProto():
      ElementDefinition.Base {
    val protoValue = ElementDefinition.Base.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasPath()) {
      protoValue.setPath(pathElement.toProto())
    }
    if (hasMin()) {
      protoValue.setMin(minElement.toProto())
    }
    if (hasMax()) {
      protoValue.setMax(maxElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ElementDefinition.TypeRefComponent.toProto():
      ElementDefinition.TypeRef {
    val protoValue = ElementDefinition.TypeRef.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasCode()) {
      protoValue.setCode(codeElement.toProto())
    }
    if (hasProfile()) {
      protoValue.addAllProfile(profile.map { it.toProto() })
    }
    if (hasTargetProfile()) {
      protoValue.addAllTargetProfile(targetProfile.map { it.toProto() })
    }
    if (hasAggregation()) {
      protoValue.addAllAggregation(aggregation.map { ElementDefinition.TypeRef.AggregationCode.newBuilder().setValue(AggregationModeCode.Value.valueOf(it.value.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build() })
    }
    if (hasVersioning()) {
      protoValue.setVersioning(ElementDefinition.TypeRef.VersioningCode.newBuilder().setValue(ReferenceVersionRulesCode.Value.valueOf(versioning.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionExampleComponent.toProto():
      ElementDefinition.Example {
    val protoValue = ElementDefinition.Example.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasLabel()) {
      protoValue.setLabel(labelElement.toProto())
    }
    if (hasValue()) {
      protoValue.setValue(value.elementDefinitionExampleValueToProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionConstraintComponent.toProto():
      ElementDefinition.Constraint {
    val protoValue = ElementDefinition.Constraint.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasKey()) {
      protoValue.setKey(keyElement.toProto())
    }
    if (hasRequirements()) {
      protoValue.setRequirements(requirementsElement.toProto())
    }
    if (hasSeverity()) {
      protoValue.setSeverity(ElementDefinition.Constraint.SeverityCode.newBuilder().setValue(ConstraintSeverityCode.Value.valueOf(severity.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasHuman()) {
      protoValue.setHuman(humanElement.toProto())
    }
    if (hasExpression()) {
      protoValue.setExpression(expressionElement.toProto())
    }
    if (hasXpath()) {
      protoValue.setXpath(xpathElement.toProto())
    }
    if (hasSource()) {
      protoValue.setSource(sourceElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBindingComponent.toProto():
      ElementDefinition.ElementDefinitionBinding {
    val protoValue = ElementDefinition.ElementDefinitionBinding.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasStrength()) {
      protoValue.setStrength(ElementDefinition.ElementDefinitionBinding.StrengthCode.newBuilder().setValue(BindingStrengthCode.Value.valueOf(strength.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasValueSet()) {
      protoValue.setValueSet(valueSetElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionMappingComponent.toProto():
      ElementDefinition.Mapping {
    val protoValue = ElementDefinition.Mapping.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasIdentity()) {
      protoValue.setIdentity(identityElement.toProto())
    }
    if (hasLanguage()) {
      protoValue.setLanguage(ElementDefinition.Mapping.LanguageCode.newBuilder().setValue(language.protoCodeCheck()).build())
    }
    if (hasMap()) {
      protoValue.setMap(mapElement.toProto())
    }
    if (hasComment()) {
      protoValue.setComment(commentElement.toProto())
    }
    return protoValue.build()
  }

  private fun ElementDefinition.Slicing.toHapi():
      org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingComponent {
    val hapiValue = org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (discriminatorCount > 0) {
      hapiValue.setDiscriminator(discriminatorList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasOrdered()) {
      hapiValue.setOrderedElement(ordered.toHapi())
    }
    if (hasRules()) {
      hapiValue.setRules(org.hl7.fhir.r4.model.ElementDefinition.SlicingRules.valueOf(rules.value.name.hapiCodeCheck().replace("_", "")))
    }
    return hapiValue
  }

  private fun ElementDefinition.Slicing.Discriminator.toHapi():
      org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingDiscriminatorComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingDiscriminatorComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(org.hl7.fhir.r4.model.ElementDefinition.DiscriminatorType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPath()) {
      hapiValue.setPathElement(path.toHapi())
    }
    return hapiValue
  }

  private fun ElementDefinition.Base.toHapi():
      org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBaseComponent {
    val hapiValue = org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBaseComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasPath()) {
      hapiValue.setPathElement(path.toHapi())
    }
    if (hasMin()) {
      hapiValue.setMinElement(min.toHapi())
    }
    if (hasMax()) {
      hapiValue.setMaxElement(max.toHapi())
    }
    return hapiValue
  }

  private fun ElementDefinition.TypeRef.toHapi():
      org.hl7.fhir.r4.model.ElementDefinition.TypeRefComponent {
    val hapiValue = org.hl7.fhir.r4.model.ElementDefinition.TypeRefComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasCode()) {
      hapiValue.setCodeElement(code.toHapi())
    }
    if (profileCount > 0) {
      hapiValue.setProfile(profileList.map { it.toHapi() })
    }
    if (targetProfileCount > 0) {
      hapiValue.setTargetProfile(targetProfileList.map { it.toHapi() })
    }
    if (aggregationCount > 0) {
      aggregationList.forEach { hapiValue.addAggregation(org.hl7.fhir.r4.model.ElementDefinition.AggregationMode.valueOf(it.value.name.hapiCodeCheck().replace("_", ""))) }
    }
    if (hasVersioning()) {
      hapiValue.setVersioning(org.hl7.fhir.r4.model.ElementDefinition.ReferenceVersionRules.valueOf(versioning.value.name.hapiCodeCheck().replace("_", "")))
    }
    return hapiValue
  }

  private fun ElementDefinition.Example.toHapi():
      org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionExampleComponent {
    val hapiValue = org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionExampleComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasLabel()) {
      hapiValue.setLabelElement(label.toHapi())
    }
    if (hasValue()) {
      hapiValue.setValue(value.elementDefinitionExampleValueToHapi())
    }
    return hapiValue
  }

  private fun ElementDefinition.Constraint.toHapi():
      org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionConstraintComponent {
    val hapiValue = org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionConstraintComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasKey()) {
      hapiValue.setKeyElement(key.toHapi())
    }
    if (hasRequirements()) {
      hapiValue.setRequirementsElement(requirements.toHapi())
    }
    if (hasSeverity()) {
      hapiValue.setSeverity(org.hl7.fhir.r4.model.ElementDefinition.ConstraintSeverity.valueOf(severity.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasHuman()) {
      hapiValue.setHumanElement(human.toHapi())
    }
    if (hasExpression()) {
      hapiValue.setExpressionElement(expression.toHapi())
    }
    if (hasXpath()) {
      hapiValue.setXpathElement(xpath.toHapi())
    }
    if (hasSource()) {
      hapiValue.setSourceElement(source.toHapi())
    }
    return hapiValue
  }

  private fun ElementDefinition.ElementDefinitionBinding.toHapi():
      org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBindingComponent {
    val hapiValue = org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBindingComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasStrength()) {
      hapiValue.setStrength(Enumerations.BindingStrength.valueOf(strength.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasValueSet()) {
      hapiValue.setValueSetElement(valueSet.toHapi())
    }
    return hapiValue
  }

  private fun ElementDefinition.Mapping.toHapi():
      org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionMappingComponent {
    val hapiValue = org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionMappingComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasIdentity()) {
      hapiValue.setIdentityElement(identity.toHapi())
    }
    if (hasLanguage()) {
      hapiValue.setLanguage(language.value.hapiCodeCheck())
    }
    if (hasMap()) {
      hapiValue.setMapElement(map.toHapi())
    }
    if (hasComment()) {
      hapiValue.setCommentElement(comment.toHapi())
    }
    return hapiValue
  }
}
