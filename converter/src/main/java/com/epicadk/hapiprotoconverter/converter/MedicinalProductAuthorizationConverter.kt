package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.MedicinalProductAuthorization
import com.google.fhir.r4.core.MedicinalProductAuthorization.Procedure
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Type

public object MedicinalProductAuthorizationConverter {
  private
      fun MedicinalProductAuthorization.Procedure.DateX.medicinalProductAuthorizationProcedureDateToHapi():
      Type {
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for MedicinalProductAuthorization.procedure.date[x]")
  }

  private fun Type.medicinalProductAuthorizationProcedureDateToProto():
      MedicinalProductAuthorization.Procedure.DateX {
    val protoValue = MedicinalProductAuthorization.Procedure.DateX.newBuilder()
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    return protoValue.build()
  }

  public fun MedicinalProductAuthorization.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductAuthorization {
    val hapiValue = org.hl7.fhir.r4.model.MedicinalProductAuthorization()
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
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (countryCount > 0) {
      hapiValue.setCountry(countryList.map { it.toHapi() })
    }
    if (jurisdictionCount > 0) {
      hapiValue.setJurisdiction(jurisdictionList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(status.toHapi())
    }
    if (hasStatusDate()) {
      hapiValue.setStatusDateElement(statusDate.toHapi())
    }
    if (hasRestoreDate()) {
      hapiValue.setRestoreDateElement(restoreDate.toHapi())
    }
    if (hasValidityPeriod()) {
      hapiValue.setValidityPeriod(validityPeriod.toHapi())
    }
    if (hasDataExclusivityPeriod()) {
      hapiValue.setDataExclusivityPeriod(dataExclusivityPeriod.toHapi())
    }
    if (hasDateOfFirstAuthorization()) {
      hapiValue.setDateOfFirstAuthorizationElement(dateOfFirstAuthorization.toHapi())
    }
    if (hasInternationalBirthDate()) {
      hapiValue.setInternationalBirthDateElement(internationalBirthDate.toHapi())
    }
    if (hasLegalBasis()) {
      hapiValue.setLegalBasis(legalBasis.toHapi())
    }
    if (jurisdictionalAuthorizationCount > 0) {
      hapiValue.setJurisdictionalAuthorization(jurisdictionalAuthorizationList.map { it.toHapi() })
    }
    if (hasHolder()) {
      hapiValue.setHolder(holder.toHapi())
    }
    if (hasRegulator()) {
      hapiValue.setRegulator(regulator.toHapi())
    }
    if (hasProcedure()) {
      hapiValue.setProcedure(procedure.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.MedicinalProductAuthorization.toProto():
      MedicinalProductAuthorization {
    val protoValue = MedicinalProductAuthorization.newBuilder()
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
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasCountry()) {
      protoValue.addAllCountry(country.map { it.toProto() })
    }
    if (hasJurisdiction()) {
      protoValue.addAllJurisdiction(jurisdiction.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(status.toProto())
    }
    if (hasStatusDate()) {
      protoValue.setStatusDate(statusDateElement.toProto())
    }
    if (hasRestoreDate()) {
      protoValue.setRestoreDate(restoreDateElement.toProto())
    }
    if (hasValidityPeriod()) {
      protoValue.setValidityPeriod(validityPeriod.toProto())
    }
    if (hasDataExclusivityPeriod()) {
      protoValue.setDataExclusivityPeriod(dataExclusivityPeriod.toProto())
    }
    if (hasDateOfFirstAuthorization()) {
      protoValue.setDateOfFirstAuthorization(dateOfFirstAuthorizationElement.toProto())
    }
    if (hasInternationalBirthDate()) {
      protoValue.setInternationalBirthDate(internationalBirthDateElement.toProto())
    }
    if (hasLegalBasis()) {
      protoValue.setLegalBasis(legalBasis.toProto())
    }
    if (hasJurisdictionalAuthorization()) {
      protoValue.addAllJurisdictionalAuthorization(jurisdictionalAuthorization.map { it.toProto() })
    }
    if (hasHolder()) {
      protoValue.setHolder(holder.toProto())
    }
    if (hasRegulator()) {
      protoValue.setRegulator(regulator.toProto())
    }
    if (hasProcedure()) {
      protoValue.setProcedure(procedure.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProductAuthorization.MedicinalProductAuthorizationJurisdictionalAuthorizationComponent.toProto():
      MedicinalProductAuthorization.JurisdictionalAuthorization {
    val protoValue = MedicinalProductAuthorization.JurisdictionalAuthorization.newBuilder()
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
    if (hasCountry()) {
      protoValue.setCountry(country.toProto())
    }
    if (hasJurisdiction()) {
      protoValue.addAllJurisdiction(jurisdiction.map { it.toProto() })
    }
    if (hasLegalStatusOfSupply()) {
      protoValue.setLegalStatusOfSupply(legalStatusOfSupply.toProto())
    }
    if (hasValidityPeriod()) {
      protoValue.setValidityPeriod(validityPeriod.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.MedicinalProductAuthorization.MedicinalProductAuthorizationProcedureComponent.toProto():
      MedicinalProductAuthorization.Procedure {
    val protoValue = MedicinalProductAuthorization.Procedure.newBuilder()
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
      protoValue.setIdentifier(identifier.toProto())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasDate()) {
      protoValue.setDate(date.medicinalProductAuthorizationProcedureDateToProto())
    }
    return protoValue.build()
  }

  private fun MedicinalProductAuthorization.JurisdictionalAuthorization.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductAuthorization.MedicinalProductAuthorizationJurisdictionalAuthorizationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProductAuthorization.MedicinalProductAuthorizationJurisdictionalAuthorizationComponent()
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
    if (hasCountry()) {
      hapiValue.setCountry(country.toHapi())
    }
    if (jurisdictionCount > 0) {
      hapiValue.setJurisdiction(jurisdictionList.map { it.toHapi() })
    }
    if (hasLegalStatusOfSupply()) {
      hapiValue.setLegalStatusOfSupply(legalStatusOfSupply.toHapi())
    }
    if (hasValidityPeriod()) {
      hapiValue.setValidityPeriod(validityPeriod.toHapi())
    }
    return hapiValue
  }

  private fun MedicinalProductAuthorization.Procedure.toHapi():
      org.hl7.fhir.r4.model.MedicinalProductAuthorization.MedicinalProductAuthorizationProcedureComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.MedicinalProductAuthorization.MedicinalProductAuthorizationProcedureComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasIdentifier()) {
      hapiValue.setIdentifier(identifier.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasDate()) {
      hapiValue.setDate(date.medicinalProductAuthorizationProcedureDateToHapi())
    }
    return hapiValue
  }
}
