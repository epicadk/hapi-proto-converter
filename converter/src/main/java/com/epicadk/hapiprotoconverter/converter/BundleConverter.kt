package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DecimalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdentifierConverter.toProto
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.InstantConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MetaConverter.toProto
import com.epicadk.hapiprotoconverter.converter.SignatureConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.SignatureConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UnsignedIntConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UriConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UriConverter.toProto
import com.google.fhir.r4.core.Bundle
import com.google.fhir.r4.core.Bundle.Entry
import com.google.fhir.r4.core.Bundle.Entry.Request
import com.google.fhir.r4.core.Bundle.Entry.Search
import com.google.fhir.r4.core.BundleTypeCode
import com.google.fhir.r4.core.HTTPVerbCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.SearchEntryModeCode
import com.google.fhir.r4.core.String

public object BundleConverter {
  public fun Bundle.toHapi(): org.hl7.fhir.r4.model.Bundle {
    val hapiValue = org.hl7.fhir.r4.model.Bundle()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (hasMeta()) {
      hapiValue.setMeta(meta.toHapi())
    }
    if (hasImplicitRules()) {
      hapiValue.setImplicitRulesElement(implicitRules.toHapi())
    }
    if (hasIdentifier()) {
      hapiValue.setIdentifier(identifier.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(org.hl7.fhir.r4.model.Bundle.BundleType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasTimestamp()) {
      hapiValue.setTimestampElement(timestamp.toHapi())
    }
    if (hasTotal()) {
      hapiValue.setTotalElement(total.toHapi())
    }
    if (linkCount > 0) {
      hapiValue.setLink(linkList.map { it.toHapi() })
    }
    if (entryCount > 0) {
      hapiValue.setEntry(entryList.map { it.toHapi() })
    }
    if (hasSignature()) {
      hapiValue.setSignature(signature.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Bundle.toProto(): Bundle {
    val protoValue = Bundle.newBuilder()
    if (hasId()) {
      protoValue.setId(Id.newBuilder().setValue(id))
    }
    if (hasMeta()) {
      protoValue.setMeta(meta.toProto())
    }
    if (hasImplicitRules()) {
      protoValue.setImplicitRules(implicitRulesElement.toProto())
    }
    if (hasIdentifier()) {
      protoValue.setIdentifier(identifier.toProto())
    }
    if (hasType()) {
      protoValue.setType(Bundle.TypeCode.newBuilder().setValue(BundleTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasTimestamp()) {
      protoValue.setTimestamp(timestampElement.toProto())
    }
    if (hasTotal()) {
      protoValue.setTotal(totalElement.toProto())
    }
    if (hasLink()) {
      protoValue.addAllLink(link.map { it.toProto() })
    }
    if (hasEntry()) {
      protoValue.addAllEntry(entry.map { it.toProto() })
    }
    if (hasSignature()) {
      protoValue.setSignature(signature.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Bundle.BundleLinkComponent.toProto(): Bundle.Link {
    val protoValue = Bundle.Link.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasRelation()) {
      protoValue.setRelation(relationElement.toProto())
    }
    if (hasUrl()) {
      protoValue.setUrl(urlElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Bundle.BundleEntryComponent.toProto(): Bundle.Entry {
    val protoValue = Bundle.Entry.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasFullUrl()) {
      protoValue.setFullUrl(fullUrlElement.toProto())
    }
    if (hasSearch()) {
      protoValue.setSearch(search.toProto())
    }
    if (hasRequest()) {
      protoValue.setRequest(request.toProto())
    }
    if (hasResponse()) {
      protoValue.setResponse(response.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Bundle.BundleEntrySearchComponent.toProto():
      Bundle.Entry.Search {
    val protoValue = Bundle.Entry.Search.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasMode()) {
      protoValue.setMode(Bundle.Entry.Search.ModeCode.newBuilder().setValue(SearchEntryModeCode.Value.valueOf(mode.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasScore()) {
      protoValue.setScore(scoreElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Bundle.BundleEntryRequestComponent.toProto():
      Bundle.Entry.Request {
    val protoValue = Bundle.Entry.Request.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasMethod()) {
      protoValue.setMethod(Bundle.Entry.Request.MethodCode.newBuilder().setValue(HTTPVerbCode.Value.valueOf(method.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasUrl()) {
      protoValue.setUrl(urlElement.toProto())
    }
    if (hasIfNoneMatch()) {
      protoValue.setIfNoneMatch(ifNoneMatchElement.toProto())
    }
    if (hasIfModifiedSince()) {
      protoValue.setIfModifiedSince(ifModifiedSinceElement.toProto())
    }
    if (hasIfMatch()) {
      protoValue.setIfMatch(ifMatchElement.toProto())
    }
    if (hasIfNoneExist()) {
      protoValue.setIfNoneExist(ifNoneExistElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Bundle.BundleEntryResponseComponent.toProto():
      Bundle.Entry.Response {
    val protoValue = Bundle.Entry.Response.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.setStatus(statusElement.toProto())
    }
    if (hasLocation()) {
      protoValue.setLocation(locationElement.toProto())
    }
    if (hasEtag()) {
      protoValue.setEtag(etagElement.toProto())
    }
    if (hasLastModified()) {
      protoValue.setLastModified(lastModifiedElement.toProto())
    }
    return protoValue.build()
  }

  private fun Bundle.Link.toHapi(): org.hl7.fhir.r4.model.Bundle.BundleLinkComponent {
    val hapiValue = org.hl7.fhir.r4.model.Bundle.BundleLinkComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasRelation()) {
      hapiValue.setRelationElement(relation.toHapi())
    }
    if (hasUrl()) {
      hapiValue.setUrlElement(url.toHapi())
    }
    return hapiValue
  }

  private fun Bundle.Entry.toHapi(): org.hl7.fhir.r4.model.Bundle.BundleEntryComponent {
    val hapiValue = org.hl7.fhir.r4.model.Bundle.BundleEntryComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasFullUrl()) {
      hapiValue.setFullUrlElement(fullUrl.toHapi())
    }
    if (hasSearch()) {
      hapiValue.setSearch(search.toHapi())
    }
    if (hasRequest()) {
      hapiValue.setRequest(request.toHapi())
    }
    if (hasResponse()) {
      hapiValue.setResponse(response.toHapi())
    }
    return hapiValue
  }

  private fun Bundle.Entry.Search.toHapi():
      org.hl7.fhir.r4.model.Bundle.BundleEntrySearchComponent {
    val hapiValue = org.hl7.fhir.r4.model.Bundle.BundleEntrySearchComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasMode()) {
      hapiValue.setMode(org.hl7.fhir.r4.model.Bundle.SearchEntryMode.valueOf(mode.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasScore()) {
      hapiValue.setScoreElement(score.toHapi())
    }
    return hapiValue
  }

  private fun Bundle.Entry.Request.toHapi():
      org.hl7.fhir.r4.model.Bundle.BundleEntryRequestComponent {
    val hapiValue = org.hl7.fhir.r4.model.Bundle.BundleEntryRequestComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasMethod()) {
      hapiValue.setMethod(org.hl7.fhir.r4.model.Bundle.HTTPVerb.valueOf(method.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasUrl()) {
      hapiValue.setUrlElement(url.toHapi())
    }
    if (hasIfNoneMatch()) {
      hapiValue.setIfNoneMatchElement(ifNoneMatch.toHapi())
    }
    if (hasIfModifiedSince()) {
      hapiValue.setIfModifiedSinceElement(ifModifiedSince.toHapi())
    }
    if (hasIfMatch()) {
      hapiValue.setIfMatchElement(ifMatch.toHapi())
    }
    if (hasIfNoneExist()) {
      hapiValue.setIfNoneExistElement(ifNoneExist.toHapi())
    }
    return hapiValue
  }

  private fun Bundle.Entry.Response.toHapi():
      org.hl7.fhir.r4.model.Bundle.BundleEntryResponseComponent {
    val hapiValue = org.hl7.fhir.r4.model.Bundle.BundleEntryResponseComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasStatus()) {
      hapiValue.setStatusElement(status.toHapi())
    }
    if (hasLocation()) {
      hapiValue.setLocationElement(location.toHapi())
    }
    if (hasEtag()) {
      hapiValue.setEtagElement(etag.toHapi())
    }
    if (hasLastModified()) {
      hapiValue.setLastModifiedElement(lastModified.toHapi())
    }
    return hapiValue
  }
}
