package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.google.fhir.r4.core.DataRequirement
import com.google.fhir.r4.core.DataRequirement.DateFilter
import com.google.fhir.r4.core.DataRequirement.Sort
import com.google.fhir.r4.core.FHIRAllTypesValueSet
import com.google.fhir.r4.core.SortDirectionCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Duration
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.Type

public object DataRequirementConverter {
  private fun DataRequirement.SubjectX.dataRequirementSubjectToHapi(): Type {
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for DataRequirement.subject[x]")
  }

  private fun Type.dataRequirementSubjectToProto(): DataRequirement.SubjectX {
    val protoValue = DataRequirement.SubjectX.newBuilder()
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private fun DataRequirement.DateFilter.ValueX.dataRequirementDateFilterValueToHapi(): Type {
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasDuration()) {
      return (this.getDuration()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for DataRequirement.dateFilter.value[x]")
  }

  private fun Type.dataRequirementDateFilterValueToProto(): DataRequirement.DateFilter.ValueX {
    val protoValue = DataRequirement.DateFilter.ValueX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    if (this is Duration) {
      protoValue.setDuration(this.toProto())
    }
    return protoValue.build()
  }

  public fun DataRequirement.toHapi(): org.hl7.fhir.r4.model.DataRequirement {
    val hapiValue = org.hl7.fhir.r4.model.DataRequirement()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(type.value.name)
    }
    if (profileCount > 0) {
      hapiValue.setProfile(profileList.map { it.toHapi() })
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.dataRequirementSubjectToHapi())
    }
    if (mustSupportCount > 0) {
      hapiValue.setMustSupport(mustSupportList.map { it.toHapi() })
    }
    if (codeFilterCount > 0) {
      hapiValue.setCodeFilter(codeFilterList.map { it.toHapi() })
    }
    if (dateFilterCount > 0) {
      hapiValue.setDateFilter(dateFilterList.map { it.toHapi() })
    }
    if (hasLimit()) {
      hapiValue.setLimitElement(limit.toHapi())
    }
    if (sortCount > 0) {
      hapiValue.setSort(sortList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.DataRequirement.toProto(): DataRequirement {
    val protoValue = DataRequirement.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.setType(DataRequirement.TypeCode.newBuilder().setValue(FHIRAllTypesValueSet.Value.valueOf(type)).build())
    }
    if (hasProfile()) {
      protoValue.addAllProfile(profile.map { it.toProto() })
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.dataRequirementSubjectToProto())
    }
    if (hasMustSupport()) {
      protoValue.addAllMustSupport(mustSupport.map { it.toProto() })
    }
    if (hasCodeFilter()) {
      protoValue.addAllCodeFilter(codeFilter.map { it.toProto() })
    }
    if (hasDateFilter()) {
      protoValue.addAllDateFilter(dateFilter.map { it.toProto() })
    }
    if (hasLimit()) {
      protoValue.setLimit(limitElement.toProto())
    }
    if (hasSort()) {
      protoValue.addAllSort(sort.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent.toProto():
      DataRequirement.CodeFilter {
    val protoValue = DataRequirement.CodeFilter.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasPath()) {
      protoValue.setPath(pathElement.toProto())
    }
    if (hasSearchParam()) {
      protoValue.setSearchParam(searchParamElement.toProto())
    }
    if (hasValueSet()) {
      protoValue.setValueSet(valueSetElement.toProto())
    }
    if (hasCode()) {
      protoValue.addAllCode(code.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent.toProto():
      DataRequirement.DateFilter {
    val protoValue = DataRequirement.DateFilter.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasPath()) {
      protoValue.setPath(pathElement.toProto())
    }
    if (hasSearchParam()) {
      protoValue.setSearchParam(searchParamElement.toProto())
    }
    if (hasValue()) {
      protoValue.setValue(value.dataRequirementDateFilterValueToProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent.toProto():
      DataRequirement.Sort {
    val protoValue = DataRequirement.Sort.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasPath()) {
      protoValue.setPath(pathElement.toProto())
    }
    if (hasDirection()) {
      protoValue.setDirection(DataRequirement.Sort.DirectionCode.newBuilder().setValue(SortDirectionCode.Value.valueOf(direction.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    return protoValue.build()
  }

  private fun DataRequirement.CodeFilter.toHapi():
      org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent {
    val hapiValue = org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasPath()) {
      hapiValue.setPathElement(path.toHapi())
    }
    if (hasSearchParam()) {
      hapiValue.setSearchParamElement(searchParam.toHapi())
    }
    if (hasValueSet()) {
      hapiValue.setValueSetElement(valueSet.toHapi())
    }
    if (codeCount > 0) {
      hapiValue.setCode(codeList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun DataRequirement.DateFilter.toHapi():
      org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent {
    val hapiValue = org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasPath()) {
      hapiValue.setPathElement(path.toHapi())
    }
    if (hasSearchParam()) {
      hapiValue.setSearchParamElement(searchParam.toHapi())
    }
    if (hasValue()) {
      hapiValue.setValue(value.dataRequirementDateFilterValueToHapi())
    }
    return hapiValue
  }

  private fun DataRequirement.Sort.toHapi():
      org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent {
    val hapiValue = org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasPath()) {
      hapiValue.setPathElement(path.toHapi())
    }
    if (hasDirection()) {
      hapiValue.setDirection(org.hl7.fhir.r4.model.DataRequirement.SortDirection.valueOf(direction.value.name.hapiCodeCheck().replace("_", "")))
    }
    return hapiValue
  }
}
