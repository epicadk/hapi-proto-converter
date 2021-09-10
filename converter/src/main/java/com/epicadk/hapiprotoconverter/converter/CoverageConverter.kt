package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Coverage
import com.google.fhir.r4.core.Coverage.CostToBeneficiary
import com.google.fhir.r4.core.FinancialResourceStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Money
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.Type

public object CoverageConverter {
  private fun Coverage.CostToBeneficiary.ValueX.coverageCostToBeneficiaryValueToHapi(): Type {
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasMoney()) {
      return (this.getMoney()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Coverage.costToBeneficiary.value[x]")
  }

  private fun Type.coverageCostToBeneficiaryValueToProto(): Coverage.CostToBeneficiary.ValueX {
    val protoValue = Coverage.CostToBeneficiary.ValueX.newBuilder()
    if (this is SimpleQuantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is Money) {
      protoValue.setMoney(this.toProto())
    }
    return protoValue.build()
  }

  public fun Coverage.toHapi(): org.hl7.fhir.r4.model.Coverage {
    val hapiValue = org.hl7.fhir.r4.model.Coverage()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.Coverage.CoverageStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasPolicyHolder()) {
      hapiValue.setPolicyHolder(policyHolder.toHapi())
    }
    if (hasSubscriber()) {
      hapiValue.setSubscriber(subscriber.toHapi())
    }
    if (hasSubscriberId()) {
      hapiValue.setSubscriberIdElement(subscriberId.toHapi())
    }
    if (hasBeneficiary()) {
      hapiValue.setBeneficiary(beneficiary.toHapi())
    }
    if (hasDependent()) {
      hapiValue.setDependentElement(dependent.toHapi())
    }
    if (hasRelationship()) {
      hapiValue.setRelationship(relationship.toHapi())
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    if (payorCount > 0) {
      hapiValue.setPayor(payorList.map { it.toHapi() })
    }
    if (classValueCount > 0) {
      hapiValue.setClass_(classValueList.map { it.toHapi() })
    }
    if (hasOrder()) {
      hapiValue.setOrderElement(order.toHapi())
    }
    if (hasNetwork()) {
      hapiValue.setNetworkElement(network.toHapi())
    }
    if (costToBeneficiaryCount > 0) {
      hapiValue.setCostToBeneficiary(costToBeneficiaryList.map { it.toHapi() })
    }
    if (hasSubrogation()) {
      hapiValue.setSubrogationElement(subrogation.toHapi())
    }
    if (contractCount > 0) {
      hapiValue.setContract(contractList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Coverage.toProto(): Coverage {
    val protoValue = Coverage.newBuilder()
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
      protoValue.setStatus(Coverage.StatusCode.newBuilder().setValue(FinancialResourceStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasPolicyHolder()) {
      protoValue.setPolicyHolder(policyHolder.toProto())
    }
    if (hasSubscriber()) {
      protoValue.setSubscriber(subscriber.toProto())
    }
    if (hasSubscriberId()) {
      protoValue.setSubscriberId(subscriberIdElement.toProto())
    }
    if (hasBeneficiary()) {
      protoValue.setBeneficiary(beneficiary.toProto())
    }
    if (hasDependent()) {
      protoValue.setDependent(dependentElement.toProto())
    }
    if (hasRelationship()) {
      protoValue.setRelationship(relationship.toProto())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    if (hasPayor()) {
      protoValue.addAllPayor(payor.map { it.toProto() })
    }
    if (hasClass_()) {
      protoValue.addAllClassValue(class_.map { it.toProto() })
    }
    if (hasOrder()) {
      protoValue.setOrder(orderElement.toProto())
    }
    if (hasNetwork()) {
      protoValue.setNetwork(networkElement.toProto())
    }
    if (hasCostToBeneficiary()) {
      protoValue.addAllCostToBeneficiary(costToBeneficiary.map { it.toProto() })
    }
    if (hasSubrogation()) {
      protoValue.setSubrogation(subrogationElement.toProto())
    }
    if (hasContract()) {
      protoValue.addAllContract(contract.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Coverage.ClassComponent.toProto(): Coverage.Class {
    val protoValue = Coverage.Class.newBuilder()
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
      protoValue.setValue(valueElement.toProto())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Coverage.CostToBeneficiaryComponent.toProto():
      Coverage.CostToBeneficiary {
    val protoValue = Coverage.CostToBeneficiary.newBuilder()
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
      protoValue.setValue(value.coverageCostToBeneficiaryValueToProto())
    }
    if (hasException()) {
      protoValue.addAllException(exception.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Coverage.ExemptionComponent.toProto():
      Coverage.CostToBeneficiary.Exemption {
    val protoValue = Coverage.CostToBeneficiary.Exemption.newBuilder()
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
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    return protoValue.build()
  }

  private fun Coverage.Class.toHapi(): org.hl7.fhir.r4.model.Coverage.ClassComponent {
    val hapiValue = org.hl7.fhir.r4.model.Coverage.ClassComponent()
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
      hapiValue.setValueElement(value.toHapi())
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    return hapiValue
  }

  private fun Coverage.CostToBeneficiary.toHapi():
      org.hl7.fhir.r4.model.Coverage.CostToBeneficiaryComponent {
    val hapiValue = org.hl7.fhir.r4.model.Coverage.CostToBeneficiaryComponent()
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
      hapiValue.setValue(value.coverageCostToBeneficiaryValueToHapi())
    }
    if (exceptionCount > 0) {
      hapiValue.setException(exceptionList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun Coverage.CostToBeneficiary.Exemption.toHapi():
      org.hl7.fhir.r4.model.Coverage.ExemptionComponent {
    val hapiValue = org.hl7.fhir.r4.model.Coverage.ExemptionComponent()
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
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    return hapiValue
  }
}
