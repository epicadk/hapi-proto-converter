package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.AttachmentConverter.toProto
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodingConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.NarrativeConverter.toProto
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
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.QuestionnaireResponse
import com.google.fhir.r4.core.QuestionnaireResponse.Item
import com.google.fhir.r4.core.QuestionnaireResponse.Item.Answer
import com.google.fhir.r4.core.QuestionnaireResponseStatusCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Attachment
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.Coding
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.DateType
import org.hl7.fhir.r4.model.DecimalType
import org.hl7.fhir.r4.model.IntegerType
import org.hl7.fhir.r4.model.Quantity
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.TimeType
import org.hl7.fhir.r4.model.Type
import org.hl7.fhir.r4.model.UriType

public object QuestionnaireResponseConverter {
  private fun QuestionnaireResponse.Item.Answer.ValueX.questionnaireResponseItemAnswerValueToHapi():
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
    throw IllegalArgumentException("Invalid Type for QuestionnaireResponse.item.answer.value[x]")
  }

  private fun Type.questionnaireResponseItemAnswerValueToProto():
      QuestionnaireResponse.Item.Answer.ValueX {
    val protoValue = QuestionnaireResponse.Item.Answer.ValueX.newBuilder()
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

  public fun QuestionnaireResponse.toHapi(): org.hl7.fhir.r4.model.QuestionnaireResponse {
    val hapiValue = org.hl7.fhir.r4.model.QuestionnaireResponse()
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
    if (hasIdentifier()) {
      hapiValue.setIdentifier(identifier.toHapi())
    }
    if (basedOnCount > 0) {
      hapiValue.setBasedOn(basedOnList.map { it.toHapi() })
    }
    if (partOfCount > 0) {
      hapiValue.setPartOf(partOfList.map { it.toHapi() })
    }
    if (hasQuestionnaire()) {
      hapiValue.setQuestionnaireElement(questionnaire.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasAuthored()) {
      hapiValue.setAuthoredElement(authored.toHapi())
    }
    if (hasAuthor()) {
      hapiValue.setAuthor(author.toHapi())
    }
    if (hasSource()) {
      hapiValue.setSource(source.toHapi())
    }
    if (itemCount > 0) {
      hapiValue.setItem(itemList.map { it.toHapi() })
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.QuestionnaireResponse.toProto(): QuestionnaireResponse {
    val protoValue = QuestionnaireResponse.newBuilder()
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
      protoValue.setIdentifier(identifier.toProto())
    }
    if (hasBasedOn()) {
      protoValue.addAllBasedOn(basedOn.map { it.toProto() })
    }
    if (hasPartOf()) {
      protoValue.addAllPartOf(partOf.map { it.toProto() })
    }
    if (hasQuestionnaire()) {
      protoValue.setQuestionnaire(questionnaireElement.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(QuestionnaireResponse.StatusCode.newBuilder().setValue(QuestionnaireResponseStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasAuthored()) {
      protoValue.setAuthored(authoredElement.toProto())
    }
    if (hasAuthor()) {
      protoValue.setAuthor(author.toProto())
    }
    if (hasSource()) {
      protoValue.setSource(source.toProto())
    }
    if (hasItem()) {
      protoValue.addAllItem(item.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseItemComponent.toProto():
      QuestionnaireResponse.Item {
    val protoValue = QuestionnaireResponse.Item.newBuilder()
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
    if (hasText()) {
      protoValue.setText(textElement.toProto())
    }
    if (hasAnswer()) {
      protoValue.addAllAnswer(answer.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent.toProto():
      QuestionnaireResponse.Item.Answer {
    val protoValue = QuestionnaireResponse.Item.Answer.newBuilder()
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
      protoValue.setValue(value.questionnaireResponseItemAnswerValueToProto())
    }
    return protoValue.build()
  }

  private fun QuestionnaireResponse.Item.toHapi():
      org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseItemComponent {
    val hapiValue = org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseItemComponent()
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
    if (hasText()) {
      hapiValue.setTextElement(text.toHapi())
    }
    if (answerCount > 0) {
      hapiValue.setAnswer(answerList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun QuestionnaireResponse.Item.Answer.toHapi():
      org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent()
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
      hapiValue.setValue(value.questionnaireResponseItemAnswerValueToHapi())
    }
    return hapiValue
  }
}
