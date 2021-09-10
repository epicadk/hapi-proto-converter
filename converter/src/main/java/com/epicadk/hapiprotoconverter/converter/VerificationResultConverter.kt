package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SignatureConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SignatureConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.StatusCode
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.VerificationResult

public object VerificationResultConverter {
  public fun VerificationResult.toHapi(): org.hl7.fhir.r4.model.VerificationResult {
    val hapiValue = org.hl7.fhir.r4.model.VerificationResult()
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
    if (targetCount > 0) {
      hapiValue.setTarget(targetList.map { it.toHapi() })
    }
    if (targetLocationCount > 0) {
      hapiValue.setTargetLocation(targetLocationList.map { it.toHapi() })
    }
    if (hasNeed()) {
      hapiValue.setNeed(need.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.VerificationResult.Status.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasStatusDate()) {
      hapiValue.setStatusDateElement(statusDate.toHapi())
    }
    if (hasValidationType()) {
      hapiValue.setValidationType(validationType.toHapi())
    }
    if (validationProcessCount > 0) {
      hapiValue.setValidationProcess(validationProcessList.map { it.toHapi() })
    }
    if (hasFrequency()) {
      hapiValue.setFrequency(frequency.toHapi())
    }
    if (hasLastPerformed()) {
      hapiValue.setLastPerformedElement(lastPerformed.toHapi())
    }
    if (hasNextScheduled()) {
      hapiValue.setNextScheduledElement(nextScheduled.toHapi())
    }
    if (hasFailureAction()) {
      hapiValue.setFailureAction(failureAction.toHapi())
    }
    if (primarySourceCount > 0) {
      hapiValue.setPrimarySource(primarySourceList.map { it.toHapi() })
    }
    if (hasAttestation()) {
      hapiValue.setAttestation(attestation.toHapi())
    }
    if (validatorCount > 0) {
      hapiValue.setValidator(validatorList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.VerificationResult.toProto(): VerificationResult {
    val protoValue = VerificationResult.newBuilder()
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
    if (hasTarget()) {
      protoValue.addAllTarget(target.map { it.toProto() })
    }
    if (hasTargetLocation()) {
      protoValue.addAllTargetLocation(targetLocation.map { it.toProto() })
    }
    if (hasNeed()) {
      protoValue.setNeed(need.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(VerificationResult.StatusCode.newBuilder().setValue(StatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasStatusDate()) {
      protoValue.setStatusDate(statusDateElement.toProto())
    }
    if (hasValidationType()) {
      protoValue.setValidationType(validationType.toProto())
    }
    if (hasValidationProcess()) {
      protoValue.addAllValidationProcess(validationProcess.map { it.toProto() })
    }
    if (hasFrequency()) {
      protoValue.setFrequency(frequency.toProto())
    }
    if (hasLastPerformed()) {
      protoValue.setLastPerformed(lastPerformedElement.toProto())
    }
    if (hasNextScheduled()) {
      protoValue.setNextScheduled(nextScheduledElement.toProto())
    }
    if (hasFailureAction()) {
      protoValue.setFailureAction(failureAction.toProto())
    }
    if (hasPrimarySource()) {
      protoValue.addAllPrimarySource(primarySource.map { it.toProto() })
    }
    if (hasAttestation()) {
      protoValue.setAttestation(attestation.toProto())
    }
    if (hasValidator()) {
      protoValue.addAllValidator(validator.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.VerificationResult.VerificationResultPrimarySourceComponent.toProto():
      VerificationResult.PrimarySource {
    val protoValue = VerificationResult.PrimarySource.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasWho()) {
      protoValue.setWho(who.toProto())
    }
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasCommunicationMethod()) {
      protoValue.addAllCommunicationMethod(communicationMethod.map { it.toProto() })
    }
    if (hasValidationStatus()) {
      protoValue.setValidationStatus(validationStatus.toProto())
    }
    if (hasValidationDate()) {
      protoValue.setValidationDate(validationDateElement.toProto())
    }
    if (hasCanPushUpdates()) {
      protoValue.setCanPushUpdates(canPushUpdates.toProto())
    }
    if (hasPushTypeAvailable()) {
      protoValue.addAllPushTypeAvailable(pushTypeAvailable.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.VerificationResult.VerificationResultAttestationComponent.toProto():
      VerificationResult.Attestation {
    val protoValue = VerificationResult.Attestation.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasWho()) {
      protoValue.setWho(who.toProto())
    }
    if (hasOnBehalfOf()) {
      protoValue.setOnBehalfOf(onBehalfOf.toProto())
    }
    if (hasCommunicationMethod()) {
      protoValue.setCommunicationMethod(communicationMethod.toProto())
    }
    if (hasDate()) {
      protoValue.setDate(dateElement.toProto())
    }
    if (hasSourceIdentityCertificate()) {
      protoValue.setSourceIdentityCertificate(sourceIdentityCertificateElement.toProto())
    }
    if (hasProxyIdentityCertificate()) {
      protoValue.setProxyIdentityCertificate(proxyIdentityCertificateElement.toProto())
    }
    if (hasProxySignature()) {
      protoValue.setProxySignature(proxySignature.toProto())
    }
    if (hasSourceSignature()) {
      protoValue.setSourceSignature(sourceSignature.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.VerificationResult.VerificationResultValidatorComponent.toProto():
      VerificationResult.Validator {
    val protoValue = VerificationResult.Validator.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasOrganization()) {
      protoValue.setOrganization(organization.toProto())
    }
    if (hasIdentityCertificate()) {
      protoValue.setIdentityCertificate(identityCertificateElement.toProto())
    }
    if (hasAttestationSignature()) {
      protoValue.setAttestationSignature(attestationSignature.toProto())
    }
    return protoValue.build()
  }

  private fun VerificationResult.PrimarySource.toHapi():
      org.hl7.fhir.r4.model.VerificationResult.VerificationResultPrimarySourceComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.VerificationResult.VerificationResultPrimarySourceComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasWho()) {
      hapiValue.setWho(who.toHapi())
    }
    if (typeCount > 0) {
      hapiValue.setType(typeList.map { it.toHapi() })
    }
    if (communicationMethodCount > 0) {
      hapiValue.setCommunicationMethod(communicationMethodList.map { it.toHapi() })
    }
    if (hasValidationStatus()) {
      hapiValue.setValidationStatus(validationStatus.toHapi())
    }
    if (hasValidationDate()) {
      hapiValue.setValidationDateElement(validationDate.toHapi())
    }
    if (hasCanPushUpdates()) {
      hapiValue.setCanPushUpdates(canPushUpdates.toHapi())
    }
    if (pushTypeAvailableCount > 0) {
      hapiValue.setPushTypeAvailable(pushTypeAvailableList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun VerificationResult.Attestation.toHapi():
      org.hl7.fhir.r4.model.VerificationResult.VerificationResultAttestationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.VerificationResult.VerificationResultAttestationComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasWho()) {
      hapiValue.setWho(who.toHapi())
    }
    if (hasOnBehalfOf()) {
      hapiValue.setOnBehalfOf(onBehalfOf.toHapi())
    }
    if (hasCommunicationMethod()) {
      hapiValue.setCommunicationMethod(communicationMethod.toHapi())
    }
    if (hasDate()) {
      hapiValue.setDateElement(date.toHapi())
    }
    if (hasSourceIdentityCertificate()) {
      hapiValue.setSourceIdentityCertificateElement(sourceIdentityCertificate.toHapi())
    }
    if (hasProxyIdentityCertificate()) {
      hapiValue.setProxyIdentityCertificateElement(proxyIdentityCertificate.toHapi())
    }
    if (hasProxySignature()) {
      hapiValue.setProxySignature(proxySignature.toHapi())
    }
    if (hasSourceSignature()) {
      hapiValue.setSourceSignature(sourceSignature.toHapi())
    }
    return hapiValue
  }

  private fun VerificationResult.Validator.toHapi():
      org.hl7.fhir.r4.model.VerificationResult.VerificationResultValidatorComponent {
    val hapiValue = org.hl7.fhir.r4.model.VerificationResult.VerificationResultValidatorComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasOrganization()) {
      hapiValue.setOrganization(organization.toHapi())
    }
    if (hasIdentityCertificate()) {
      hapiValue.setIdentityCertificateElement(identityCertificate.toHapi())
    }
    if (hasAttestationSignature()) {
      hapiValue.setAttestationSignature(attestationSignature.toHapi())
    }
    return hapiValue
  }
}
