package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SignatureConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SignatureConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Provenance
import com.google.fhir.r4.core.Provenance.Entity
import com.google.fhir.r4.core.ProvenanceEntityRoleCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Type

public object ProvenanceConverter {
  private fun Provenance.OccurredX.provenanceOccurredToHapi(): Type {
    if (hasPeriod()) {
      return (this.getPeriod()).toHapi()
    }
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Provenance.occurred[x]")
  }

  private fun Type.provenanceOccurredToProto(): Provenance.OccurredX {
    val protoValue = Provenance.OccurredX.newBuilder()
    if (this is Period) {
      protoValue.setPeriod(this.toProto())
    }
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    return protoValue.build()
  }

  public fun Provenance.toHapi(): org.hl7.fhir.r4.model.Provenance {
    val hapiValue = org.hl7.fhir.r4.model.Provenance()
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
    if (hasOccurred()) {
      hapiValue.setOccurred(occurred.provenanceOccurredToHapi())
    }
    if (hasRecorded()) {
      hapiValue.setRecordedElement(recorded.toHapi())
    }
    if (policyCount > 0) {
      hapiValue.setPolicy(policyList.map { it.toHapi() })
    }
    if (hasLocation()) {
      hapiValue.setLocation(location.toHapi())
    }
    if (reasonCount > 0) {
      hapiValue.setReason(reasonList.map { it.toHapi() })
    }
    if (hasActivity()) {
      hapiValue.setActivity(activity.toHapi())
    }
    if (agentCount > 0) {
      hapiValue.setAgent(agentList.map { it.toHapi() })
    }
    if (entityCount > 0) {
      hapiValue.setEntity(entityList.map { it.toHapi() })
    }
    if (signatureCount > 0) {
      hapiValue.setSignature(signatureList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Provenance.toProto(): Provenance {
    val protoValue = Provenance.newBuilder()
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
    if (hasOccurred()) {
      protoValue.setOccurred(occurred.provenanceOccurredToProto())
    }
    if (hasRecorded()) {
      protoValue.setRecorded(recordedElement.toProto())
    }
    if (hasPolicy()) {
      protoValue.addAllPolicy(policy.map { it.toProto() })
    }
    if (hasLocation()) {
      protoValue.setLocation(location.toProto())
    }
    if (hasReason()) {
      protoValue.addAllReason(reason.map { it.toProto() })
    }
    if (hasActivity()) {
      protoValue.setActivity(activity.toProto())
    }
    if (hasAgent()) {
      protoValue.addAllAgent(agent.map { it.toProto() })
    }
    if (hasEntity()) {
      protoValue.addAllEntity(entity.map { it.toProto() })
    }
    if (hasSignature()) {
      protoValue.addAllSignature(signature.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Provenance.ProvenanceAgentComponent.toProto():
      Provenance.Agent {
    val protoValue = Provenance.Agent.newBuilder()
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
    if (hasRole()) {
      protoValue.addAllRole(role.map { it.toProto() })
    }
    if (hasWho()) {
      protoValue.setWho(who.toProto())
    }
    if (hasOnBehalfOf()) {
      protoValue.setOnBehalfOf(onBehalfOf.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Provenance.ProvenanceEntityComponent.toProto():
      Provenance.Entity {
    val protoValue = Provenance.Entity.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasRole()) {
      protoValue.setRole(Provenance.Entity.RoleCode.newBuilder().setValue(ProvenanceEntityRoleCode.Value.valueOf(role.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasWhat()) {
      protoValue.setWhat(what.toProto())
    }
    return protoValue.build()
  }

  private fun Provenance.Agent.toHapi(): org.hl7.fhir.r4.model.Provenance.ProvenanceAgentComponent {
    val hapiValue = org.hl7.fhir.r4.model.Provenance.ProvenanceAgentComponent()
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
    if (roleCount > 0) {
      hapiValue.setRole(roleList.map { it.toHapi() })
    }
    if (hasWho()) {
      hapiValue.setWho(who.toHapi())
    }
    if (hasOnBehalfOf()) {
      hapiValue.setOnBehalfOf(onBehalfOf.toHapi())
    }
    return hapiValue
  }

  private fun Provenance.Entity.toHapi():
      org.hl7.fhir.r4.model.Provenance.ProvenanceEntityComponent {
    val hapiValue = org.hl7.fhir.r4.model.Provenance.ProvenanceEntityComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasRole()) {
      hapiValue.setRole(org.hl7.fhir.r4.model.Provenance.ProvenanceEntityRole.valueOf(role.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasWhat()) {
      hapiValue.setWhat(what.toHapi())
    }
    return hapiValue
  }
}
