package com.epicadk.hapiprotoconverter.converter

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
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.ClaimProcessingCode
import com.google.fhir.r4.core.EnrollmentResponse
import com.google.fhir.r4.core.FinancialResourceStatusCode
import com.google.fhir.r4.core.Id
import org.hl7.fhir.r4.model.Enumerations

public object EnrollmentResponseConverter {
  public fun EnrollmentResponse.toHapi(): org.hl7.fhir.r4.model.EnrollmentResponse {
    val hapiValue = org.hl7.fhir.r4.model.EnrollmentResponse()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.EnrollmentResponse.EnrollmentResponseStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasRequest()) {
      hapiValue.setRequest(request.toHapi())
    }
    if (hasOutcome()) {
      hapiValue.setOutcome(Enumerations.RemittanceOutcome.valueOf(outcome.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasDisposition()) {
      hapiValue.setDispositionElement(disposition.toHapi())
    }
    if (hasCreated()) {
      hapiValue.setCreatedElement(created.toHapi())
    }
    if (hasOrganization()) {
      hapiValue.setOrganization(organization.toHapi())
    }
    if (hasRequestProvider()) {
      hapiValue.setRequestProvider(requestProvider.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.EnrollmentResponse.toProto(): EnrollmentResponse {
    val protoValue = EnrollmentResponse.newBuilder()
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
      protoValue.setStatus(EnrollmentResponse.StatusCode.newBuilder().setValue(FinancialResourceStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasRequest()) {
      protoValue.setRequest(request.toProto())
    }
    if (hasOutcome()) {
      protoValue.setOutcome(EnrollmentResponse.OutcomeCode.newBuilder().setValue(ClaimProcessingCode.Value.valueOf(outcome.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasDisposition()) {
      protoValue.setDisposition(dispositionElement.toProto())
    }
    if (hasCreated()) {
      protoValue.setCreated(createdElement.toProto())
    }
    if (hasOrganization()) {
      protoValue.setOrganization(organization.toProto())
    }
    if (hasRequestProvider()) {
      protoValue.setRequestProvider(requestProvider.toProto())
    }
    return protoValue.build()
  }
}
