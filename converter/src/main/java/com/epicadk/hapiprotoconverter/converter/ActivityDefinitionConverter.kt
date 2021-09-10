package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AgeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AgeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DosageConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DosageConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DurationConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExpressionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExpressionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RelatedArtifactConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RelatedArtifactConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SimpleQuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toProto
import com.google.fhir.r4.core.ActionParticipantTypeCode
import com.google.fhir.r4.core.ActivityDefinition
import com.google.fhir.r4.core.ActivityDefinition.Participant
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.RequestIntentCode
import com.google.fhir.r4.core.RequestPriorityCode
import com.google.fhir.r4.core.RequestResourceTypeCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Age
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Duration
import org.hl7.fhir.r4.model.Enumerations
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.Timing
import org.hl7.fhir.r4.model.Type

public object ActivityDefinitionConverter {
    private fun ActivityDefinition.SubjectX.activityDefinitionSubjectToHapi(): Type {
        if (hasCodeableConcept()) {
            return (this.getCodeableConcept()).toHapi()
        }
        if (hasReference()) {
            return (this.getReference()).toHapi()
        }
        throw IllegalArgumentException("Invalid Type for ActivityDefinition.subject[x]")
    }

    private fun Type.activityDefinitionSubjectToProto(): ActivityDefinition.SubjectX {
        val protoValue = ActivityDefinition.SubjectX.newBuilder()
        if (this is CodeableConcept) {
            protoValue.setCodeableConcept(this.toProto())
        }
        if (this is Reference) {
            protoValue.setReference(this.toProto())
        }
        return protoValue.build()
    }

    private fun ActivityDefinition.TimingX.activityDefinitionTimingToHapi(): Type {
        if (hasTiming()) {
            return (this.getTiming()).toHapi()
        }
        if (hasDateTime()) {
            return (this.getDateTime()).toHapi()
        }
        if (hasAge()) {
            return (this.getAge()).toHapi()
        }
        if (hasPeriod()) {
            return (this.getPeriod()).toHapi()
        }
        if (hasRange()) {
            return (this.getRange()).toHapi()
        }
        if (hasDuration()) {
            return (this.getDuration()).toHapi()
        }
        throw IllegalArgumentException("Invalid Type for ActivityDefinition.timing[x]")
    }

    private fun Type.activityDefinitionTimingToProto(): ActivityDefinition.TimingX {
        val protoValue = ActivityDefinition.TimingX.newBuilder()
        if (this is Timing) {
            protoValue.setTiming(this.toProto())
        }
        if (this is DateTimeType) {
            protoValue.setDateTime(this.toProto())
        }
        if (this is Age) {
            protoValue.setAge(this.toProto())
        }
        if (this is Period) {
            protoValue.setPeriod(this.toProto())
        }
        if (this is Range) {
            protoValue.setRange(this.toProto())
        }
        if (this is Duration) {
            protoValue.setDuration(this.toProto())
        }
        return protoValue.build()
    }

    private fun ActivityDefinition.ProductX.activityDefinitionProductToHapi(): Type {
        if (hasReference()) {
            return (this.getReference()).toHapi()
        }
        if (hasCodeableConcept()) {
            return (this.getCodeableConcept()).toHapi()
        }
        throw IllegalArgumentException("Invalid Type for ActivityDefinition.product[x]")
    }

    private fun Type.activityDefinitionProductToProto(): ActivityDefinition.ProductX {
        val protoValue = ActivityDefinition.ProductX.newBuilder()
        if (this is Reference) {
            protoValue.setReference(this.toProto())
        }
        if (this is CodeableConcept) {
            protoValue.setCodeableConcept(this.toProto())
        }
        return protoValue.build()
    }

    public fun ActivityDefinition.toHapi(): org.hl7.fhir.r4.model.ActivityDefinition {
        val hapiValue = org.hl7.fhir.r4.model.ActivityDefinition()
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
        if (hasSubtitle()) {
            hapiValue.setSubtitleElement(subtitle.toHapi())
        }
        if (hasStatus()) {
            hapiValue.setStatus(
                Enumerations.PublicationStatus.valueOf(
                    status.value.name.hapiCodeCheck().replace("_", "")
                )
            )
        }
        if (hasExperimental()) {
            hapiValue.setExperimentalElement(experimental.toHapi())
        }
        if (hasSubject()) {
            hapiValue.setSubject(subject.activityDefinitionSubjectToHapi())
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
        if (hasUsage()) {
            hapiValue.setUsageElement(usage.toHapi())
        }
        if (hasCopyright()) {
            hapiValue.setCopyrightElement(copyright.toHapi())
        }
        if (hasApprovalDate()) {
            hapiValue.setApprovalDateElement(approvalDate.toHapi())
        }
        if (hasLastReviewDate()) {
            hapiValue.setLastReviewDateElement(lastReviewDate.toHapi())
        }
        if (hasEffectivePeriod()) {
            hapiValue.setEffectivePeriod(effectivePeriod.toHapi())
        }
        if (topicCount > 0) {
            hapiValue.setTopic(topicList.map { it.toHapi() })
        }
        if (authorCount > 0) {
            hapiValue.setAuthor(authorList.map { it.toHapi() })
        }
        if (editorCount > 0) {
            hapiValue.setEditor(editorList.map { it.toHapi() })
        }
        if (reviewerCount > 0) {
            hapiValue.setReviewer(reviewerList.map { it.toHapi() })
        }
        if (endorserCount > 0) {
            hapiValue.setEndorser(endorserList.map { it.toHapi() })
        }
        if (relatedArtifactCount > 0) {
            hapiValue.setRelatedArtifact(relatedArtifactList.map { it.toHapi() })
        }
        if (libraryCount > 0) {
            hapiValue.setLibrary(libraryList.map { it.toHapi() })
        }
        if (hasKind()) {
            hapiValue.setKind(
                org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.valueOf(
                    kind.value.name.hapiCodeCheck().replace("_", "")
                )
            )
        }
        if (hasProfile()) {
            hapiValue.setProfileElement(profile.toHapi())
        }
        if (hasCode()) {
            hapiValue.setCode(code.toHapi())
        }
        if (hasIntent()) {
            hapiValue.setIntent(
                org.hl7.fhir.r4.model.ActivityDefinition.RequestIntent.valueOf(
                    intent.value.name.hapiCodeCheck().replace("_", "")
                )
            )
        }
        if (hasPriority()) {
            hapiValue.setPriority(
                org.hl7.fhir.r4.model.ActivityDefinition.RequestPriority.valueOf(
                    priority.value.name.hapiCodeCheck().replace("_", "")
                )
            )
        }
        if (hasDoNotPerform()) {
            hapiValue.setDoNotPerformElement(doNotPerform.toHapi())
        }
        if (hasTiming()) {
            hapiValue.setTiming(timing.activityDefinitionTimingToHapi())
        }
        if (hasLocation()) {
            hapiValue.setLocation(location.toHapi())
        }
        if (participantCount > 0) {
            hapiValue.setParticipant(participantList.map { it.toHapi() })
        }
        if (hasProduct()) {
            hapiValue.setProduct(product.activityDefinitionProductToHapi())
        }
        if (hasQuantity()) {
            hapiValue.setQuantity(quantity.toHapi())
        }
        if (dosageCount > 0) {
            hapiValue.setDosage(dosageList.map { it.toHapi() })
        }
        if (bodySiteCount > 0) {
            hapiValue.setBodySite(bodySiteList.map { it.toHapi() })
        }
        if (specimenRequirementCount > 0) {
            hapiValue.setSpecimenRequirement(specimenRequirementList.map { it.toHapi() })
        }
        if (observationRequirementCount > 0) {
            hapiValue.setObservationRequirement(observationRequirementList.map { it.toHapi() })
        }
        if (observationResultRequirementCount > 0) {
            hapiValue.setObservationResultRequirement(observationResultRequirementList.map { it.toHapi() })
        }
        if (hasTransform()) {
            hapiValue.setTransformElement(transform.toHapi())
        }
        if (dynamicValueCount > 0) {
            hapiValue.setDynamicValue(dynamicValueList.map { it.toHapi() })
        }
        return hapiValue
    }

    public fun org.hl7.fhir.r4.model.ActivityDefinition.toProto(): ActivityDefinition {
        val protoValue = ActivityDefinition.newBuilder()
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
        if (hasSubtitle()) {
            protoValue.setSubtitle(subtitleElement.toProto())
        }
        if (hasStatus()) {
            protoValue.setStatus(
                ActivityDefinition.StatusCode.newBuilder().setValue(
                    PublicationStatusCode.Value.valueOf(
                        status.toCode().protoCodeCheck().replace(
                            "-",
                            "_"
                        ).toUpperCase()
                    )
                ).build()
            )
        }
        if (hasExperimental()) {
            protoValue.setExperimental(experimentalElement.toProto())
        }
        if (hasSubject()) {
            protoValue.setSubject(subject.activityDefinitionSubjectToProto())
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
        if (hasUsage()) {
            protoValue.setUsage(usageElement.toProto())
        }
        if (hasCopyright()) {
            protoValue.setCopyright(copyrightElement.toProto())
        }
        if (hasApprovalDate()) {
            protoValue.setApprovalDate(approvalDateElement.toProto())
        }
        if (hasLastReviewDate()) {
            protoValue.setLastReviewDate(lastReviewDateElement.toProto())
        }
        if (hasEffectivePeriod()) {
            protoValue.setEffectivePeriod(effectivePeriod.toProto())
        }
        if (hasTopic()) {
            protoValue.addAllTopic(topic.map { it.toProto() })
        }
        if (hasAuthor()) {
            protoValue.addAllAuthor(author.map { it.toProto() })
        }
        if (hasEditor()) {
            protoValue.addAllEditor(editor.map { it.toProto() })
        }
        if (hasReviewer()) {
            protoValue.addAllReviewer(reviewer.map { it.toProto() })
        }
        if (hasEndorser()) {
            protoValue.addAllEndorser(endorser.map { it.toProto() })
        }
        if (hasRelatedArtifact()) {
            protoValue.addAllRelatedArtifact(relatedArtifact.map { it.toProto() })
        }
        if (hasLibrary()) {
            protoValue.addAllLibrary(library.map { it.toProto() })
        }
        if (hasKind()) {
            protoValue.setKind(
                ActivityDefinition.KindCode.newBuilder().setValue(
                    RequestResourceTypeCode.Value.valueOf(
                        kind.toCode().protoCodeCheck().replace(
                            "-",
                            "_"
                        ).toUpperCase()
                    )
                ).build()
            )
        }
        if (hasProfile()) {
            protoValue.setProfile(profileElement.toProto())
        }
        if (hasCode()) {
            protoValue.setCode(code.toProto())
        }
        if (hasIntent()) {
            protoValue.setIntent(
                ActivityDefinition.IntentCode.newBuilder().setValue(
                    RequestIntentCode.Value.valueOf(
                        intent.toCode().protoCodeCheck().replace(
                            "-",
                            "_"
                        ).toUpperCase()
                    )
                ).build()
            )
        }
        if (hasPriority()) {
            protoValue.setPriority(
                ActivityDefinition.PriorityCode.newBuilder().setValue(
                    RequestPriorityCode.Value.valueOf(
                        priority.toCode().protoCodeCheck().replace(
                            "-",
                            "_"
                        ).toUpperCase()
                    )
                ).build()
            )
        }
        if (hasDoNotPerform()) {
            protoValue.setDoNotPerform(doNotPerformElement.toProto())
        }
        if (hasTiming()) {
            protoValue.setTiming(timing.activityDefinitionTimingToProto())
        }
        if (hasLocation()) {
            protoValue.setLocation(location.toProto())
        }
        if (hasParticipant()) {
            protoValue.addAllParticipant(participant.map { it.toProto() })
        }
        if (hasProduct()) {
            protoValue.setProduct(product.activityDefinitionProductToProto())
        }
        if (hasQuantity()) {
            protoValue.setQuantity((quantity as SimpleQuantity).toProto())
        }
        if (hasDosage()) {
            protoValue.addAllDosage(dosage.map { it.toProto() })
        }
        if (hasBodySite()) {
            protoValue.addAllBodySite(bodySite.map { it.toProto() })
        }
        if (hasSpecimenRequirement()) {
            protoValue.addAllSpecimenRequirement(specimenRequirement.map { it.toProto() })
        }
        if (hasObservationRequirement()) {
            protoValue.addAllObservationRequirement(observationRequirement.map { it.toProto() })
        }
        if (hasObservationResultRequirement()) {
            protoValue.addAllObservationResultRequirement(observationResultRequirement.map { it.toProto() })
        }
        if (hasTransform()) {
            protoValue.setTransform(transformElement.toProto())
        }
        if (hasDynamicValue()) {
            protoValue.addAllDynamicValue(dynamicValue.map { it.toProto() })
        }
        return protoValue.build()
    }

    private
    fun org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionParticipantComponent.toProto():
            ActivityDefinition.Participant {
        val protoValue = ActivityDefinition.Participant.newBuilder()
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
            protoValue.setType(
                ActivityDefinition.Participant.TypeCode.newBuilder().setValue(
                    ActionParticipantTypeCode.Value.valueOf(
                        type.toCode().protoCodeCheck().replace(
                            "-",
                            "_"
                        ).toUpperCase()
                    )
                ).build()
            )
        }
        if (hasRole()) {
            protoValue.setRole(role.toProto())
        }
        return protoValue.build()
    }

    private
    fun org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent.toProto():
            ActivityDefinition.DynamicValue {
        val protoValue = ActivityDefinition.DynamicValue.newBuilder()
        if (hasId()) {
            protoValue.setId(String.newBuilder().setValue(id))
        }
        if (hasExtension()) {
            protoValue.addAllExtension(extension.map { it.toProto() })
        }
        if (hasModifierExtension()) {
            protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
        }
        if (hasPath()) {
            protoValue.setPath(pathElement.toProto())
        }
        if (hasExpression()) {
            protoValue.setExpression(expression.toProto())
        }
        return protoValue.build()
    }

    private fun ActivityDefinition.Participant.toHapi():
            org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionParticipantComponent {
        val hapiValue =
            org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionParticipantComponent()
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
            hapiValue.setType(
                org.hl7.fhir.r4.model.ActivityDefinition.ActivityParticipantType.valueOf(
                    type.value.name.hapiCodeCheck().replace("_", "")
                )
            )
        }
        if (hasRole()) {
            hapiValue.setRole(role.toHapi())
        }
        return hapiValue
    }

    private fun ActivityDefinition.DynamicValue.toHapi():
            org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent {
        val hapiValue =
            org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent()
        if (hasId()) {
            hapiValue.id = id.value
        }
        if (extensionCount > 0) {
            hapiValue.setExtension(extensionList.map { it.toHapi() })
        }
        if (modifierExtensionCount > 0) {
            hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
        }
        if (hasPath()) {
            hapiValue.setPathElement(path.toHapi())
        }
        if (hasExpression()) {
            hapiValue.setExpression(expression.toHapi())
        }
        return hapiValue
    }
}
