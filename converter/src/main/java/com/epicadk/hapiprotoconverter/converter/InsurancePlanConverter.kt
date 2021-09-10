package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AddressConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AddressConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactPointConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.HumanNameConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.HumanNameConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MoneyConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MoneyConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.InsurancePlan
import com.google.fhir.r4.core.InsurancePlan.Coverage
import com.google.fhir.r4.core.InsurancePlan.Coverage.CoverageBenefit
import com.google.fhir.r4.core.InsurancePlan.Plan
import com.google.fhir.r4.core.InsurancePlan.Plan.SpecificCost
import com.google.fhir.r4.core.InsurancePlan.Plan.SpecificCost.PlanBenefit
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.Enumerations

public object InsurancePlanConverter {
  public fun InsurancePlan.toHapi(): org.hl7.fhir.r4.model.InsurancePlan {
    val hapiValue = org.hl7.fhir.r4.model.InsurancePlan()
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
      hapiValue.setStatus(Enumerations.PublicationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (typeCount > 0) {
      hapiValue.setType(typeList.map { it.toHapi() })
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (aliasCount > 0) {
      hapiValue.setAlias(aliasList.map { it.toHapi() })
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    if (hasOwnedBy()) {
      hapiValue.setOwnedBy(ownedBy.toHapi())
    }
    if (hasAdministeredBy()) {
      hapiValue.setAdministeredBy(administeredBy.toHapi())
    }
    if (coverageAreaCount > 0) {
      hapiValue.setCoverageArea(coverageAreaList.map { it.toHapi() })
    }
    if (contactCount > 0) {
      hapiValue.setContact(contactList.map { it.toHapi() })
    }
    if (endpointCount > 0) {
      hapiValue.setEndpoint(endpointList.map { it.toHapi() })
    }
    if (networkCount > 0) {
      hapiValue.setNetwork(networkList.map { it.toHapi() })
    }
    if (coverageCount > 0) {
      hapiValue.setCoverage(coverageList.map { it.toHapi() })
    }
    if (planCount > 0) {
      hapiValue.setPlan(planList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.InsurancePlan.toProto(): InsurancePlan {
    val protoValue = InsurancePlan.newBuilder()
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
      protoValue.setStatus(InsurancePlan.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasAlias()) {
      protoValue.addAllAlias(alias.map { it.toProto() })
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    if (hasOwnedBy()) {
      protoValue.setOwnedBy(ownedBy.toProto())
    }
    if (hasAdministeredBy()) {
      protoValue.setAdministeredBy(administeredBy.toProto())
    }
    if (hasCoverageArea()) {
      protoValue.addAllCoverageArea(coverageArea.map { it.toProto() })
    }
    if (hasContact()) {
      protoValue.addAllContact(contact.map { it.toProto() })
    }
    if (hasEndpoint()) {
      protoValue.addAllEndpoint(endpoint.map { it.toProto() })
    }
    if (hasNetwork()) {
      protoValue.addAllNetwork(network.map { it.toProto() })
    }
    if (hasCoverage()) {
      protoValue.addAllCoverage(coverage.map { it.toProto() })
    }
    if (hasPlan()) {
      protoValue.addAllPlan(plan.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanContactComponent.toProto():
      InsurancePlan.Contact {
    val protoValue = InsurancePlan.Contact.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasPurpose()) {
      protoValue.setPurpose(purpose.toProto())
    }
    if (hasName()) {
      protoValue.setName(name.toProto())
    }
    if (hasTelecom()) {
      protoValue.addAllTelecom(telecom.map { it.toProto() })
    }
    if (hasAddress()) {
      protoValue.setAddress(address.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanCoverageComponent.toProto():
      InsurancePlan.Coverage {
    val protoValue = InsurancePlan.Coverage.newBuilder()
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
    if (hasNetwork()) {
      protoValue.addAllNetwork(network.map { it.toProto() })
    }
    if (hasBenefit()) {
      protoValue.addAllBenefit(benefit.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.InsurancePlan.CoverageBenefitComponent.toProto():
      InsurancePlan.Coverage.CoverageBenefit {
    val protoValue = InsurancePlan.Coverage.CoverageBenefit.newBuilder()
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
    if (hasRequirement()) {
      protoValue.setRequirement(requirementElement.toProto())
    }
    if (hasLimit()) {
      protoValue.addAllLimit(limit.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.InsurancePlan.CoverageBenefitLimitComponent.toProto():
      InsurancePlan.Coverage.CoverageBenefit.Limit {
    val protoValue = InsurancePlan.Coverage.CoverageBenefit.Limit.newBuilder()
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
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanComponent.toProto():
      InsurancePlan.Plan {
    val protoValue = InsurancePlan.Plan.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
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
      protoValue.setType(type.toProto())
    }
    if (hasCoverageArea()) {
      protoValue.addAllCoverageArea(coverageArea.map { it.toProto() })
    }
    if (hasNetwork()) {
      protoValue.addAllNetwork(network.map { it.toProto() })
    }
    if (hasGeneralCost()) {
      protoValue.addAllGeneralCost(generalCost.map { it.toProto() })
    }
    if (hasSpecificCost()) {
      protoValue.addAllSpecificCost(specificCost.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanGeneralCostComponent.toProto():
      InsurancePlan.Plan.GeneralCost {
    val protoValue = InsurancePlan.Plan.GeneralCost.newBuilder()
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
    if (hasGroupSize()) {
      protoValue.setGroupSize(groupSizeElement.toProto())
    }
    if (hasCost()) {
      protoValue.setCost(cost.toProto())
    }
    if (hasComment()) {
      protoValue.setComment(commentElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanSpecificCostComponent.toProto():
      InsurancePlan.Plan.SpecificCost {
    val protoValue = InsurancePlan.Plan.SpecificCost.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCategory()) {
      protoValue.setCategory(category.toProto())
    }
    if (hasBenefit()) {
      protoValue.addAllBenefit(benefit.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.InsurancePlan.PlanBenefitComponent.toProto():
      InsurancePlan.Plan.SpecificCost.PlanBenefit {
    val protoValue = InsurancePlan.Plan.SpecificCost.PlanBenefit.newBuilder()
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
    if (hasCost()) {
      protoValue.addAllCost(cost.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.InsurancePlan.PlanBenefitCostComponent.toProto():
      InsurancePlan.Plan.SpecificCost.PlanBenefit.Cost {
    val protoValue = InsurancePlan.Plan.SpecificCost.PlanBenefit.Cost.newBuilder()
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
    if (hasApplicability()) {
      protoValue.setApplicability(applicability.toProto())
    }
    if (hasQualifiers()) {
      protoValue.addAllQualifiers(qualifiers.map { it.toProto() })
    }
    if (hasValue()) {
      protoValue.setValue(value.toProto())
    }
    return protoValue.build()
  }

  private fun InsurancePlan.Contact.toHapi():
      org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanContactComponent {
    val hapiValue = org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanContactComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasPurpose()) {
      hapiValue.setPurpose(purpose.toHapi())
    }
    if (hasName()) {
      hapiValue.setName(name.toHapi())
    }
    if (telecomCount > 0) {
      hapiValue.setTelecom(telecomList.map { it.toHapi() })
    }
    if (hasAddress()) {
      hapiValue.setAddress(address.toHapi())
    }
    return hapiValue
  }

  private fun InsurancePlan.Coverage.toHapi():
      org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanCoverageComponent {
    val hapiValue = org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanCoverageComponent()
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
    if (networkCount > 0) {
      hapiValue.setNetwork(networkList.map { it.toHapi() })
    }
    if (benefitCount > 0) {
      hapiValue.setBenefit(benefitList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun InsurancePlan.Coverage.CoverageBenefit.toHapi():
      org.hl7.fhir.r4.model.InsurancePlan.CoverageBenefitComponent {
    val hapiValue = org.hl7.fhir.r4.model.InsurancePlan.CoverageBenefitComponent()
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
    if (hasRequirement()) {
      hapiValue.setRequirementElement(requirement.toHapi())
    }
    if (limitCount > 0) {
      hapiValue.setLimit(limitList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun InsurancePlan.Coverage.CoverageBenefit.Limit.toHapi():
      org.hl7.fhir.r4.model.InsurancePlan.CoverageBenefitLimitComponent {
    val hapiValue = org.hl7.fhir.r4.model.InsurancePlan.CoverageBenefitLimitComponent()
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
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    return hapiValue
  }

  private fun InsurancePlan.Plan.toHapi():
      org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanComponent {
    val hapiValue = org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanComponent()
    if (hasId()) {
      hapiValue.id = id.value
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
      hapiValue.setType(type.toHapi())
    }
    if (coverageAreaCount > 0) {
      hapiValue.setCoverageArea(coverageAreaList.map { it.toHapi() })
    }
    if (networkCount > 0) {
      hapiValue.setNetwork(networkList.map { it.toHapi() })
    }
    if (generalCostCount > 0) {
      hapiValue.setGeneralCost(generalCostList.map { it.toHapi() })
    }
    if (specificCostCount > 0) {
      hapiValue.setSpecificCost(specificCostList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun InsurancePlan.Plan.GeneralCost.toHapi():
      org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanGeneralCostComponent {
    val hapiValue = org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanGeneralCostComponent()
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
    if (hasGroupSize()) {
      hapiValue.setGroupSizeElement(groupSize.toHapi())
    }
    if (hasCost()) {
      hapiValue.setCost(cost.toHapi())
    }
    if (hasComment()) {
      hapiValue.setCommentElement(comment.toHapi())
    }
    return hapiValue
  }

  private fun InsurancePlan.Plan.SpecificCost.toHapi():
      org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanSpecificCostComponent {
    val hapiValue = org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanSpecificCostComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCategory()) {
      hapiValue.setCategory(category.toHapi())
    }
    if (benefitCount > 0) {
      hapiValue.setBenefit(benefitList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun InsurancePlan.Plan.SpecificCost.PlanBenefit.toHapi():
      org.hl7.fhir.r4.model.InsurancePlan.PlanBenefitComponent {
    val hapiValue = org.hl7.fhir.r4.model.InsurancePlan.PlanBenefitComponent()
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
    if (costCount > 0) {
      hapiValue.setCost(costList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun InsurancePlan.Plan.SpecificCost.PlanBenefit.Cost.toHapi():
      org.hl7.fhir.r4.model.InsurancePlan.PlanBenefitCostComponent {
    val hapiValue = org.hl7.fhir.r4.model.InsurancePlan.PlanBenefitCostComponent()
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
    if (hasApplicability()) {
      hapiValue.setApplicability(applicability.toHapi())
    }
    if (qualifiersCount > 0) {
      hapiValue.setQualifiers(qualifiersList.map { it.toHapi() })
    }
    if (hasValue()) {
      hapiValue.setValue(value.toHapi())
    }
    return hapiValue
  }
}
