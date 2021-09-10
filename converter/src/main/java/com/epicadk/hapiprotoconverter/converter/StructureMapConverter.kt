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
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.StructureMap
import com.google.fhir.r4.core.StructureMap.Group
import com.google.fhir.r4.core.StructureMap.Group.Input
import com.google.fhir.r4.core.StructureMap.Group.Rule
import com.google.fhir.r4.core.StructureMap.Group.Rule.Source
import com.google.fhir.r4.core.StructureMap.Group.Rule.Target
import com.google.fhir.r4.core.StructureMap.Group.Rule.Target.Parameter
import com.google.fhir.r4.core.StructureMap.Structure
import com.google.fhir.r4.core.StructureMapContextTypeCode
import com.google.fhir.r4.core.StructureMapGroupTypeModeCode
import com.google.fhir.r4.core.StructureMapInputModeCode
import com.google.fhir.r4.core.StructureMapModelModeCode
import com.google.fhir.r4.core.StructureMapSourceListModeCode
import com.google.fhir.r4.core.StructureMapTargetListModeCode
import com.google.fhir.r4.core.StructureMapTransformCode
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

public object StructureMapConverter {
  private
      fun StructureMap.Group.Rule.Source.DefaultValueX.structureMapGroupRuleSourceDefaultValueToHapi():
      Type {
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
    throw
        IllegalArgumentException("Invalid Type for StructureMap.group.rule.source.defaultValue[x]")
  }

  private fun Type.structureMapGroupRuleSourceDefaultValueToProto():
      StructureMap.Group.Rule.Source.DefaultValueX {
    val protoValue = StructureMap.Group.Rule.Source.DefaultValueX.newBuilder()
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

  private
      fun StructureMap.Group.Rule.Target.Parameter.ValueX.structureMapGroupRuleTargetParameterValueToHapi():
      Type {
    if (hasId()) {
      return (this.getId()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasInteger()) {
      return (this.getInteger()).toHapi()
    }
    if (hasDecimal()) {
      return (this.getDecimal()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for StructureMap.group.rule.target.parameter.value[x]")
  }

  private fun Type.structureMapGroupRuleTargetParameterValueToProto():
      StructureMap.Group.Rule.Target.Parameter.ValueX {
    val protoValue = StructureMap.Group.Rule.Target.Parameter.ValueX.newBuilder()
    if (this is IdType) {
      protoValue.setId(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is IntegerType) {
      protoValue.setInteger(this.toProto())
    }
    if (this is DecimalType) {
      protoValue.setDecimal(this.toProto())
    }
    return protoValue.build()
  }

  public fun StructureMap.toHapi(): org.hl7.fhir.r4.model.StructureMap {
    val hapiValue = org.hl7.fhir.r4.model.StructureMap()
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
    if (hasUrl()) {
      hapiValue.setUrlElement(url.toHapi())
    }
    if (identifierCount > 0) {
      hapiValue.setIdentifier(identifierList.map { it.toHapi() })
    }
    if (hasVersion()) {
      hapiValue.setVersionElement(version.toHapi())
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasTitle()) {
      hapiValue.setTitleElement(title.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(Enumerations.PublicationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasExperimental()) {
      hapiValue.setExperimentalElement(experimental.toHapi())
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasPublisher()) {
      hapiValue.setPublisherElement(publisher.toHapi())
    }
    if (contactCount > 0) {
      hapiValue.setContact(contactList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (useContextCount > 0) {
      hapiValue.setUseContext(useContextList.map { it.toHapi() })
    }
    if (jurisdictionCount > 0) {
      hapiValue.setJurisdiction(jurisdictionList.map { it.toHapi() })
    }
    if (hasPurpose()) {
      hapiValue.setPurposeElement(purpose.toHapi())
    }
    if (hasCopyright()) {
      hapiValue.setCopyrightElement(copyright.toHapi())
    }
    if (structureCount > 0) {
      hapiValue.setStructure(structureList.map { it.toHapi() })
    }
    if (importCount > 0) {
      hapiValue.setImport(importList.map { it.toHapi() })
    }
    if (groupCount > 0) {
      hapiValue.setGroup(groupList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.StructureMap.toProto(): StructureMap {
    val protoValue = StructureMap.newBuilder()
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
    if (hasUrl()) {
      protoValue.setUrl(urlElement.toProto())
    }
    if (hasIdentifier()) {
      protoValue.addAllIdentifier(identifier.map { it.toProto() })
    }
    if (hasVersion()) {
      protoValue.setVersion(versionElement.toProto())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasTitle()) {
      protoValue.setTitle(titleElement.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(StructureMap.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasExperimental()) {
      protoValue.setExperimental(experimentalElement.toProto())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasPublisher()) {
      protoValue.setPublisher(publisherElement.toProto())
    }
    if (hasContact()) {
      protoValue.addAllContact(contact.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasUseContext()) {
      protoValue.addAllUseContext(useContext.map { it.toProto() })
    }
    if (hasJurisdiction()) {
      protoValue.addAllJurisdiction(jurisdiction.map { it.toProto() })
    }
    if (hasPurpose()) {
      protoValue.setPurpose(purposeElement.toProto())
    }
    if (hasCopyright()) {
      protoValue.setCopyright(copyrightElement.toProto())
    }
    if (hasStructure()) {
      protoValue.addAllStructure(structure.map { it.toProto() })
    }
    if (hasImport()) {
      protoValue.addAllImport(import.map { it.toProto() })
    }
    if (hasGroup()) {
      protoValue.addAllGroup(group.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.StructureMap.StructureMapStructureComponent.toProto():
      StructureMap.Structure {
    val protoValue = StructureMap.Structure.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasUrl()) {
      protoValue.setUrl(urlElement.toProto())
    }
    if (hasMode()) {
      protoValue.setMode(StructureMap.Structure.ModeCode.newBuilder().setValue(StructureMapModelModeCode.Value.valueOf(mode.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasAlias()) {
      protoValue.setAlias(aliasElement.toProto())
    }
    if (hasDocumentation()) {
      protoValue.setDocumentation(documentationElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.StructureMap.StructureMapGroupComponent.toProto():
      StructureMap.Group {
    val protoValue = StructureMap.Group.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasExtends()) {
      protoValue.setExtends(extendsElement.toProto())
    }
    if (hasTypeMode()) {
      protoValue.setTypeMode(StructureMap.Group.TypeModeCode.newBuilder().setValue(StructureMapGroupTypeModeCode.Value.valueOf(typeMode.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDocumentation()) {
      protoValue.setDocumentation(documentationElement.toProto())
    }
    if (hasInput()) {
      protoValue.addAllInput(input.map { it.toProto() })
    }
    if (hasRule()) {
      protoValue.addAllRule(rule.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.StructureMap.StructureMapGroupInputComponent.toProto():
      StructureMap.Group.Input {
    val protoValue = StructureMap.Group.Input.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasType()) {
      protoValue.setType(typeElement.toProto())
    }
    if (hasMode()) {
      protoValue.setMode(StructureMap.Group.Input.ModeCode.newBuilder().setValue(StructureMapInputModeCode.Value.valueOf(mode.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDocumentation()) {
      protoValue.setDocumentation(documentationElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.StructureMap.StructureMapGroupRuleComponent.toProto():
      StructureMap.Group.Rule {
    val protoValue = StructureMap.Group.Rule.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasSource()) {
      protoValue.addAllSource(source.map { it.toProto() })
    }
    if (hasTarget()) {
      protoValue.addAllTarget(target.map { it.toProto() })
    }
    if (hasDependent()) {
      protoValue.addAllDependent(dependent.map { it.toProto() })
    }
    if (hasDocumentation()) {
      protoValue.setDocumentation(documentationElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.StructureMap.StructureMapGroupRuleSourceComponent.toProto():
      StructureMap.Group.Rule.Source {
    val protoValue = StructureMap.Group.Rule.Source.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasContext()) {
      protoValue.setContext(contextElement.toProto())
    }
    if (hasMin()) {
      protoValue.setMin(minElement.toProto())
    }
    if (hasMax()) {
      protoValue.setMax(maxElement.toProto())
    }
    if (hasType()) {
      protoValue.setType(typeElement.toProto())
    }
    if (hasDefaultValue()) {
      protoValue.setDefaultValue(defaultValue.structureMapGroupRuleSourceDefaultValueToProto())
    }
    if (hasElement()) {
      protoValue.setElement(elementElement.toProto())
    }
    if (hasListMode()) {
      protoValue.setListMode(StructureMap.Group.Rule.Source.ListModeCode.newBuilder().setValue(StructureMapSourceListModeCode.Value.valueOf(listMode.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasVariable()) {
      protoValue.setVariable(variableElement.toProto())
    }
    if (hasCondition()) {
      protoValue.setCondition(conditionElement.toProto())
    }
    if (hasCheck()) {
      protoValue.setCheck(checkElement.toProto())
    }
    if (hasLogMessage()) {
      protoValue.setLogMessage(logMessageElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.StructureMap.StructureMapGroupRuleTargetComponent.toProto():
      StructureMap.Group.Rule.Target {
    val protoValue = StructureMap.Group.Rule.Target.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasContext()) {
      protoValue.setContext(contextElement.toProto())
    }
    if (hasContextType()) {
      protoValue.setContextType(StructureMap.Group.Rule.Target.ContextTypeCode.newBuilder().setValue(StructureMapContextTypeCode.Value.valueOf(contextType.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasElement()) {
      protoValue.setElement(elementElement.toProto())
    }
    if (hasVariable()) {
      protoValue.setVariable(variableElement.toProto())
    }
    if (hasListMode()) {
      protoValue.addAllListMode(listMode.map { StructureMap.Group.Rule.Target.ListModeCode.newBuilder().setValue(StructureMapTargetListModeCode.Value.valueOf(it.value.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build() })
    }
    if (hasListRuleId()) {
      protoValue.setListRuleId(listRuleIdElement.toProto())
    }
    if (hasTransform()) {
      protoValue.setTransform(StructureMap.Group.Rule.Target.TransformCode.newBuilder().setValue(StructureMapTransformCode.Value.valueOf(transform.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasParameter()) {
      protoValue.addAllParameter(parameter.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.StructureMap.StructureMapGroupRuleTargetParameterComponent.toProto():
      StructureMap.Group.Rule.Target.Parameter {
    val protoValue = StructureMap.Group.Rule.Target.Parameter.newBuilder()
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
      protoValue.setValue(value.structureMapGroupRuleTargetParameterValueToProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.StructureMap.StructureMapGroupRuleDependentComponent.toProto():
      StructureMap.Group.Rule.Dependent {
    val protoValue = StructureMap.Group.Rule.Dependent.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasVariable()) {
      protoValue.addAllVariable(variable.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun StructureMap.Structure.toHapi():
      org.hl7.fhir.r4.model.StructureMap.StructureMapStructureComponent {
    val hapiValue = org.hl7.fhir.r4.model.StructureMap.StructureMapStructureComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasUrl()) {
      hapiValue.setUrlElement(url.toHapi())
    }
    if (hasMode()) {
      hapiValue.setMode(org.hl7.fhir.r4.model.StructureMap.StructureMapModelMode.valueOf(mode.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasAlias()) {
      hapiValue.setAliasElement(alias.toHapi())
    }
    if (hasDocumentation()) {
      hapiValue.setDocumentationElement(documentation.toHapi())
    }
    return hapiValue
  }

  private fun StructureMap.Group.toHapi():
      org.hl7.fhir.r4.model.StructureMap.StructureMapGroupComponent {
    val hapiValue = org.hl7.fhir.r4.model.StructureMap.StructureMapGroupComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasExtends()) {
      hapiValue.setExtendsElement(extends.toHapi())
    }
    if (hasTypeMode()) {
      hapiValue.setTypeMode(org.hl7.fhir.r4.model.StructureMap.StructureMapGroupTypeMode.valueOf(typeMode.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDocumentation()) {
      hapiValue.setDocumentationElement(documentation.toHapi())
    }
    if (inputCount > 0) {
      hapiValue.setInput(inputList.map { it.toHapi() })
    }
    if (ruleCount > 0) {
      hapiValue.setRule(ruleList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun StructureMap.Group.Input.toHapi():
      org.hl7.fhir.r4.model.StructureMap.StructureMapGroupInputComponent {
    val hapiValue = org.hl7.fhir.r4.model.StructureMap.StructureMapGroupInputComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasType()) {
      hapiValue.setTypeElement(type.toHapi())
    }
    if (hasMode()) {
      hapiValue.setMode(org.hl7.fhir.r4.model.StructureMap.StructureMapInputMode.valueOf(mode.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDocumentation()) {
      hapiValue.setDocumentationElement(documentation.toHapi())
    }
    return hapiValue
  }

  private fun StructureMap.Group.Rule.toHapi():
      org.hl7.fhir.r4.model.StructureMap.StructureMapGroupRuleComponent {
    val hapiValue = org.hl7.fhir.r4.model.StructureMap.StructureMapGroupRuleComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (sourceCount > 0) {
      hapiValue.setSource(sourceList.map { it.toHapi() })
    }
    if (targetCount > 0) {
      hapiValue.setTarget(targetList.map { it.toHapi() })
    }
    if (dependentCount > 0) {
      hapiValue.setDependent(dependentList.map { it.toHapi() })
    }
    if (hasDocumentation()) {
      hapiValue.setDocumentationElement(documentation.toHapi())
    }
    return hapiValue
  }

  private fun StructureMap.Group.Rule.Source.toHapi():
      org.hl7.fhir.r4.model.StructureMap.StructureMapGroupRuleSourceComponent {
    val hapiValue = org.hl7.fhir.r4.model.StructureMap.StructureMapGroupRuleSourceComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasContext()) {
      hapiValue.setContextElement(context.toHapi())
    }
    if (hasMin()) {
      hapiValue.setMinElement(min.toHapi())
    }
    if (hasMax()) {
      hapiValue.setMaxElement(max.toHapi())
    }
    if (hasType()) {
      hapiValue.setTypeElement(type.toHapi())
    }
    if (hasDefaultValue()) {
      hapiValue.setDefaultValue(defaultValue.structureMapGroupRuleSourceDefaultValueToHapi())
    }
    if (hasElement()) {
      hapiValue.setElementElement(element.toHapi())
    }
    if (hasListMode()) {
      hapiValue.setListMode(org.hl7.fhir.r4.model.StructureMap.StructureMapSourceListMode.valueOf(listMode.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasVariable()) {
      hapiValue.setVariableElement(variable.toHapi())
    }
    if (hasCondition()) {
      hapiValue.setConditionElement(condition.toHapi())
    }
    if (hasCheck()) {
      hapiValue.setCheckElement(check.toHapi())
    }
    if (hasLogMessage()) {
      hapiValue.setLogMessageElement(logMessage.toHapi())
    }
    return hapiValue
  }

  private fun StructureMap.Group.Rule.Target.toHapi():
      org.hl7.fhir.r4.model.StructureMap.StructureMapGroupRuleTargetComponent {
    val hapiValue = org.hl7.fhir.r4.model.StructureMap.StructureMapGroupRuleTargetComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasContext()) {
      hapiValue.setContextElement(context.toHapi())
    }
    if (hasContextType()) {
      hapiValue.setContextType(org.hl7.fhir.r4.model.StructureMap.StructureMapContextType.valueOf(contextType.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasElement()) {
      hapiValue.setElementElement(element.toHapi())
    }
    if (hasVariable()) {
      hapiValue.setVariableElement(variable.toHapi())
    }
    if (listModeCount > 0) {
      listModeList.forEach { hapiValue.addListMode(org.hl7.fhir.r4.model.StructureMap.StructureMapTargetListMode.valueOf(it.value.name.hapiCodeCheck().replace("_", ""))) }
    }
    if (hasListRuleId()) {
      hapiValue.setListRuleIdElement(listRuleId.toHapi())
    }
    if (hasTransform()) {
      hapiValue.setTransform(org.hl7.fhir.r4.model.StructureMap.StructureMapTransform.valueOf(transform.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (parameterCount > 0) {
      hapiValue.setParameter(parameterList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun StructureMap.Group.Rule.Target.Parameter.toHapi():
      org.hl7.fhir.r4.model.StructureMap.StructureMapGroupRuleTargetParameterComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.StructureMap.StructureMapGroupRuleTargetParameterComponent()
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
      hapiValue.setValue(value.structureMapGroupRuleTargetParameterValueToHapi())
    }
    return hapiValue
  }

  private fun StructureMap.Group.Rule.Dependent.toHapi():
      org.hl7.fhir.r4.model.StructureMap.StructureMapGroupRuleDependentComponent {
    val hapiValue = org.hl7.fhir.r4.model.StructureMap.StructureMapGroupRuleDependentComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (variableCount > 0) {
      hapiValue.setVariable(variableList.map { it.toHapi() })
    }
    return hapiValue
  }
}
