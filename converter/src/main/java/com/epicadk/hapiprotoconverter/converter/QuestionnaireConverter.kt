package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IntegerConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.QuantityConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ReferenceConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.TimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.TimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toProto
import com.google.fhir.r4.core.EnableWhenBehaviorCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.Questionnaire
import com.google.fhir.r4.core.Questionnaire.Item
import com.google.fhir.r4.core.Questionnaire.Item.AnswerOption
import com.google.fhir.r4.core.Questionnaire.Item.EnableWhen
import com.google.fhir.r4.core.Questionnaire.Item.Initial
import com.google.fhir.r4.core.QuestionnaireItemOperatorCode
import com.google.fhir.r4.core.QuestionnaireItemTypeCode
import com.google.fhir.r4.core.ResourceTypeCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Attachment
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.Coding
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.DateType
import org.hl7.fhir.r4.model.DecimalType
import org.hl7.fhir.r4.model.Enumerations
import org.hl7.fhir.r4.model.IntegerType
import org.hl7.fhir.r4.model.Quantity
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.TimeType
import org.hl7.fhir.r4.model.Type
import org.hl7.fhir.r4.model.UriType

public object QuestionnaireConverter {
  private fun Questionnaire.Item.EnableWhen.AnswerX.questionnaireItemEnableWhenAnswerToHapi():
      Type {
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasDecimal()) {
      return (this.getDecimal()).toHapi()
    }
    if (hasInteger()) {
      return (this.getInteger()).toHapi()
    }
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasTime()) {
      return (this.getTime()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    if (hasCoding()) {
      return (this.getCoding()).toHapi()
    }
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Questionnaire.item.enableWhen.answer[x]")
  }

  private fun Type.questionnaireItemEnableWhenAnswerToProto():
      Questionnaire.Item.EnableWhen.AnswerX {
    val protoValue = Questionnaire.Item.EnableWhen.AnswerX.newBuilder()
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is DecimalType) {
      protoValue.setDecimal(this.toProto())
    }
    if (this is IntegerType) {
      protoValue.setInteger(this.toProto())
    }
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is TimeType) {
      protoValue.setTime(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is Coding) {
      protoValue.setCoding(this.toProto())
    }
    if (this is Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private fun Questionnaire.Item.AnswerOption.ValueX.questionnaireItemAnswerOptionValueToHapi():
      Type {
    if (hasInteger()) {
      return (this.getInteger()).toHapi()
    }
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasTime()) {
      return (this.getTime()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    if (hasCoding()) {
      return (this.getCoding()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Questionnaire.item.answerOption.value[x]")
  }

  private fun Type.questionnaireItemAnswerOptionValueToProto():
      Questionnaire.Item.AnswerOption.ValueX {
    val protoValue = Questionnaire.Item.AnswerOption.ValueX.newBuilder()
    if (this is IntegerType) {
      protoValue.setInteger(this.toProto())
    }
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is TimeType) {
      protoValue.setTime(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is Coding) {
      protoValue.setCoding(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private fun Questionnaire.Item.Initial.ValueX.questionnaireItemInitialValueToHapi(): Type {
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasDecimal()) {
      return (this.getDecimal()).toHapi()
    }
    if (hasInteger()) {
      return (this.getInteger()).toHapi()
    }
    if (hasDate()) {
      return (this.getDate()).toHapi()
    }
    if (hasDateTime()) {
      return (this.getDateTime()).toHapi()
    }
    if (hasTime()) {
      return (this.getTime()).toHapi()
    }
    if (hasStringValue()) {
      return (this.getStringValue()).toHapi()
    }
    if (hasUri()) {
      return (this.getUri()).toHapi()
    }
    if (hasAttachment()) {
      return (this.getAttachment()).toHapi()
    }
    if (hasCoding()) {
      return (this.getCoding()).toHapi()
    }
    if (hasQuantity()) {
      return (this.getQuantity()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Questionnaire.item.initial.value[x]")
  }

  private fun Type.questionnaireItemInitialValueToProto(): Questionnaire.Item.Initial.ValueX {
    val protoValue = Questionnaire.Item.Initial.ValueX.newBuilder()
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is DecimalType) {
      protoValue.setDecimal(this.toProto())
    }
    if (this is IntegerType) {
      protoValue.setInteger(this.toProto())
    }
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is TimeType) {
      protoValue.setTime(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is UriType) {
      protoValue.setUri(this.toProto())
    }
    if (this is Attachment) {
      protoValue.setAttachment(this.toProto())
    }
    if (this is Coding) {
      protoValue.setCoding(this.toProto())
    }
    if (this is Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  public fun Questionnaire.toHapi(): org.hl7.fhir.r4.model.Questionnaire {
    val hapiValue = org.hl7.fhir.r4.model.Questionnaire()
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
    if (derivedFromCount > 0) {
      hapiValue.setDerivedFrom(derivedFromList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatus(Enumerations.PublicationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasExperimental()) {
      hapiValue.setExperimentalElement(experimental.toHapi())
    }
    if (subjectTypeCount > 0) {
      subjectTypeList.forEach { hapiValue.addSubjectType(it.value.name.hapiCodeCheck()) }
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
    if (codeCount > 0) {
      hapiValue.setCode(codeList.map { it.toHapi() })
    }
    if (itemCount > 0) {
      hapiValue.setItem(itemList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Questionnaire.toProto(): Questionnaire {
    val protoValue = Questionnaire.newBuilder()
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
    if (hasDerivedFrom()) {
      protoValue.addAllDerivedFrom(derivedFrom.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(Questionnaire.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasExperimental()) {
      protoValue.setExperimental(experimentalElement.toProto())
    }
    if (hasSubjectType()) {
      protoValue.addAllSubjectType(subjectType.map { Questionnaire.SubjectTypeCode.newBuilder().setValue(ResourceTypeCode.Value.valueOf(it.valueAsString.protoCodeCheck())).build() })
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
    if (hasCode()) {
      protoValue.addAllCode(code.map { it.toProto() })
    }
    if (hasItem()) {
      protoValue.addAllItem(item.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemComponent.toProto():
      Questionnaire.Item {
    val protoValue = Questionnaire.Item.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasLinkId()) {
      protoValue.setLinkId(linkIdElement.toProto())
    }
    if (hasDefinition()) {
      protoValue.setDefinition(definitionElement.toProto())
    }
    if (hasCode()) {
      protoValue.addAllCode(code.map { it.toProto() })
    }
    if (hasPrefix()) {
      protoValue.setPrefix(prefixElement.toProto())
    }
    if (hasText()) {
      protoValue.setText(textElement.toProto())
    }
    if (hasType()) {
      protoValue.setType(Questionnaire.Item.TypeCode.newBuilder().setValue(QuestionnaireItemTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasEnableWhen()) {
      protoValue.addAllEnableWhen(enableWhen.map { it.toProto() })
    }
    if (hasEnableBehavior()) {
      protoValue.setEnableBehavior(Questionnaire.Item.EnableBehaviorCode.newBuilder().setValue(EnableWhenBehaviorCode.Value.valueOf(enableBehavior.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasRequired()) {
      protoValue.setRequired(requiredElement.toProto())
    }
    if (hasRepeats()) {
      protoValue.setRepeats(repeatsElement.toProto())
    }
    if (hasReadOnly()) {
      protoValue.setReadOnly(readOnlyElement.toProto())
    }
    if (hasMaxLength()) {
      protoValue.setMaxLength(maxLengthElement.toProto())
    }
    if (hasAnswerValueSet()) {
      protoValue.setAnswerValueSet(answerValueSetElement.toProto())
    }
    if (hasAnswerOption()) {
      protoValue.addAllAnswerOption(answerOption.map { it.toProto() })
    }
    if (hasInitial()) {
      protoValue.addAllInitial(initial.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemEnableWhenComponent.toProto():
      Questionnaire.Item.EnableWhen {
    val protoValue = Questionnaire.Item.EnableWhen.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasQuestion()) {
      protoValue.setQuestion(questionElement.toProto())
    }
    if (hasOperator()) {
      protoValue.setOperator(Questionnaire.Item.EnableWhen.OperatorCode.newBuilder().setValue(QuestionnaireItemOperatorCode.Value.valueOf(operator.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasAnswer()) {
      protoValue.setAnswer(answer.questionnaireItemEnableWhenAnswerToProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemAnswerOptionComponent.toProto():
      Questionnaire.Item.AnswerOption {
    val protoValue = Questionnaire.Item.AnswerOption.newBuilder()
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
      protoValue.setValue(value.questionnaireItemAnswerOptionValueToProto())
    }
    if (hasInitialSelected()) {
      protoValue.setInitialSelected(initialSelectedElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemInitialComponent.toProto():
      Questionnaire.Item.Initial {
    val protoValue = Questionnaire.Item.Initial.newBuilder()
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
      protoValue.setValue(value.questionnaireItemInitialValueToProto())
    }
    return protoValue.build()
  }

  private fun Questionnaire.Item.toHapi():
      org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemComponent {
    val hapiValue = org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasLinkId()) {
      hapiValue.setLinkIdElement(linkId.toHapi())
    }
    if (hasDefinition()) {
      hapiValue.setDefinitionElement(definition.toHapi())
    }
    if (codeCount > 0) {
      hapiValue.setCode(codeList.map { it.toHapi() })
    }
    if (hasPrefix()) {
      hapiValue.setPrefixElement(prefix.toHapi())
    }
    if (hasText()) {
      hapiValue.setTextElement(text.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (enableWhenCount > 0) {
      hapiValue.setEnableWhen(enableWhenList.map { it.toHapi() })
    }
    if (hasEnableBehavior()) {
      hapiValue.setEnableBehavior(org.hl7.fhir.r4.model.Questionnaire.EnableWhenBehavior.valueOf(enableBehavior.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasRequired()) {
      hapiValue.setRequiredElement(required.toHapi())
    }
    if (hasRepeats()) {
      hapiValue.setRepeatsElement(repeats.toHapi())
    }
    if (hasReadOnly()) {
      hapiValue.setReadOnlyElement(readOnly.toHapi())
    }
    if (hasMaxLength()) {
      hapiValue.setMaxLengthElement(maxLength.toHapi())
    }
    if (hasAnswerValueSet()) {
      hapiValue.setAnswerValueSetElement(answerValueSet.toHapi())
    }
    if (answerOptionCount > 0) {
      hapiValue.setAnswerOption(answerOptionList.map { it.toHapi() })
    }
    if (initialCount > 0) {
      hapiValue.setInitial(initialList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun Questionnaire.Item.EnableWhen.toHapi():
      org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemEnableWhenComponent {
    val hapiValue = org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemEnableWhenComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasQuestion()) {
      hapiValue.setQuestionElement(question.toHapi())
    }
    if (hasOperator()) {
      hapiValue.setOperator(org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemOperator.valueOf(operator.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasAnswer()) {
      hapiValue.setAnswer(answer.questionnaireItemEnableWhenAnswerToHapi())
    }
    return hapiValue
  }

  private fun Questionnaire.Item.AnswerOption.toHapi():
      org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemAnswerOptionComponent {
    val hapiValue = org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemAnswerOptionComponent()
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
      hapiValue.setValue(value.questionnaireItemAnswerOptionValueToHapi())
    }
    if (hasInitialSelected()) {
      hapiValue.setInitialSelectedElement(initialSelected.toHapi())
    }
    return hapiValue
  }

  private fun Questionnaire.Item.Initial.toHapi():
      org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemInitialComponent {
    val hapiValue = org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemInitialComponent()
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
      hapiValue.setValue(value.questionnaireItemInitialValueToHapi())
    }
    return hapiValue
  }
}
