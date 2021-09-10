package com.epicadk.hapiprotoconverter.converter

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
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.ResearchSubject
import com.google.fhir.r4.core.ResearchSubjectStatusCode

public object ResearchSubjectConverter {
  public fun ResearchSubject.toHapi(): org.hl7.fhir.r4.model.ResearchSubject {
    val hapiValue = org.hl7.fhir.r4.model.ResearchSubject()
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
      hapiValue.setStatus(org.hl7.fhir.r4.model.ResearchSubject.ResearchSubjectStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    if (hasStudy()) {
      hapiValue.setStudy(study.toHapi())
    }
    if (hasIndividual()) {
      hapiValue.setIndividual(individual.toHapi())
    }
    if (hasAssignedArm()) {
      hapiValue.setAssignedArmElement(assignedArm.toHapi())
    }
    if (hasActualArm()) {
      hapiValue.setActualArmElement(actualArm.toHapi())
    }
    if (hasConsent()) {
      hapiValue.setConsent(consent.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ResearchSubject.toProto(): ResearchSubject {
    val protoValue = ResearchSubject.newBuilder()
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
      protoValue.setStatus(ResearchSubject.StatusCode.newBuilder().setValue(ResearchSubjectStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    if (hasStudy()) {
      protoValue.setStudy(study.toProto())
    }
    if (hasIndividual()) {
      protoValue.setIndividual(individual.toProto())
    }
    if (hasAssignedArm()) {
      protoValue.setAssignedArm(assignedArmElement.toProto())
    }
    if (hasActualArm()) {
      protoValue.setActualArm(actualArmElement.toProto())
    }
    if (hasConsent()) {
      protoValue.setConsent(consent.toProto())
    }
    return protoValue.build()
  }
}
