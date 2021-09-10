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
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PositiveIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Account
import com.google.fhir.r4.core.AccountStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String

public object AccountConverter {
    public fun Account.toHapi(): org.hl7.fhir.r4.model.Account {
        val hapiValue = org.hl7.fhir.r4.model.Account()
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
            hapiValue.setStatus(
                org.hl7.fhir.r4.model.Account.AccountStatus.valueOf(
                    status.value.name.hapiCodeCheck().replace("_", "")
                )
            )
        }
        if (hasType()) {
            hapiValue.setType(type.toHapi())
        }
        if (hasName()) {
            hapiValue.setNameElement(name.toHapi())
        }
        if (subjectCount > 0) {
            hapiValue.setSubject(subjectList.map { it.toHapi() })
        }
        if (hasServicePeriod()) {
            hapiValue.setServicePeriod(servicePeriod.toHapi())
        }
        if (coverageCount > 0) {
            hapiValue.setCoverage(coverageList.map { it.toHapi() })
        }
        if (hasOwner()) {
            hapiValue.setOwner(owner.toHapi())
        }
        if (hasDescription()) {
            hapiValue.setDescriptionElement(description.toHapi())
        }
        if (guarantorCount > 0) {
            hapiValue.setGuarantor(guarantorList.map { it.toHapi() })
        }
        if (hasPartOf()) {
            hapiValue.setPartOf(partOf.toHapi())
        }
        return hapiValue
    }

    public fun org.hl7.fhir.r4.model.Account.toProto(): Account {
        val protoValue = Account.newBuilder()
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
            protoValue.setStatus(
                Account.StatusCode.newBuilder().setValue(
                    AccountStatusCode.Value.valueOf(
                        status.toCode().protoCodeCheck().replace(
                            "-",
                            "_"
                        ).toUpperCase()
                    )
                ).build()
            )
        }
        if (hasType()) {
            protoValue.setType(type.toProto())
        }
        if (hasName()) {
            protoValue.setName(nameElement.toProto())
        }
        if (hasSubject()) {
            protoValue.addAllSubject(subject.map { it.toProto() })
        }
        if (hasServicePeriod()) {
            protoValue.setServicePeriod(servicePeriod.toProto())
        }
        if (hasCoverage()) {
            protoValue.addAllCoverage(coverage.map { it.toProto() })
        }
        if (hasOwner()) {
            protoValue.setOwner(owner.toProto())
        }
        if (hasDescription()) {
            protoValue.setDescription(descriptionElement.toProto())
        }
        if (hasGuarantor()) {
            protoValue.addAllGuarantor(guarantor.map { it.toProto() })
        }
        if (hasPartOf()) {
            protoValue.setPartOf(partOf.toProto())
        }
        return protoValue.build()
    }

    private fun org.hl7.fhir.r4.model.Account.CoverageComponent.toProto(): Account.Coverage {
        val protoValue = Account.Coverage.newBuilder()
        if (hasId()) {
            protoValue.setId(String.newBuilder().setValue(id))
        }
        if (hasExtension()) {
            protoValue.addAllExtension(extension.map { it.toProto() })
        }
        if (hasModifierExtension()) {
            protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
        }
        if (hasCoverage()) {
            protoValue.setCoverage(coverage.toProto())
        }
        if (hasPriority()) {
            protoValue.setPriority(priorityElement.toProto())
        }
        return protoValue.build()
    }

    private fun org.hl7.fhir.r4.model.Account.GuarantorComponent.toProto(): Account.Guarantor {
        val protoValue = Account.Guarantor.newBuilder()
        if (hasId()) {
            protoValue.setId(String.newBuilder().setValue(id))
        }
        if (hasExtension()) {
            protoValue.addAllExtension(extension.map { it.toProto() })
        }
        if (hasModifierExtension()) {
            protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
        }
        if (hasParty()) {
            protoValue.setParty(party.toProto())
        }
        if (hasOnHold()) {
            protoValue.setOnHold(onHoldElement.toProto())
        }
        if (hasPeriod()) {
            protoValue.setPeriod(period.toProto())
        }
        return protoValue.build()
    }

    private fun Account.Coverage.toHapi(): org.hl7.fhir.r4.model.Account.CoverageComponent {
        val hapiValue = org.hl7.fhir.r4.model.Account.CoverageComponent()
        if (hasId()) {
            hapiValue.id = id.value
        }
        if (extensionCount > 0) {
            hapiValue.setExtension(extensionList.map { it.toHapi() })
        }
        if (modifierExtensionCount > 0) {
            hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
        }
        if (hasCoverage()) {
            hapiValue.setCoverage(coverage.toHapi())
        }
        if (hasPriority()) {
            hapiValue.setPriorityElement(priority.toHapi())
        }
        return hapiValue
    }

    private fun Account.Guarantor.toHapi(): org.hl7.fhir.r4.model.Account.GuarantorComponent {
        val hapiValue = org.hl7.fhir.r4.model.Account.GuarantorComponent()
        if (hasId()) {
            hapiValue.id = id.value
        }
        if (extensionCount > 0) {
            hapiValue.setExtension(extensionList.map { it.toHapi() })
        }
        if (modifierExtensionCount > 0) {
            hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
        }
        if (hasParty()) {
            hapiValue.setParty(party.toHapi())
        }
        if (hasOnHold()) {
            hapiValue.setOnHoldElement(onHold.toHapi())
        }
        if (hasPeriod()) {
            hapiValue.setPeriod(period.toHapi())
        }
        return hapiValue
    }
}
