package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.BooleanConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CanonicalConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ContactDetailConverter.toProto
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.DateTimeConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.IdConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.IdConverter.toProto
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.MarkdownConverter.toProto
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
import com.epicadk.hapiprotoconverter.converter.UrlConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UrlConverter.toProto
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.UsageContextConverter.toProto
import com.google.fhir.r4.core.FHIRVersionCode
import com.google.fhir.r4.core.GuidePageGenerationCode
import com.google.fhir.r4.core.GuideParameterCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.ImplementationGuide
import com.google.fhir.r4.core.ImplementationGuide.Definition
import com.google.fhir.r4.core.ImplementationGuide.Definition.Page
import com.google.fhir.r4.core.ImplementationGuide.Definition.Parameter
import com.google.fhir.r4.core.ImplementationGuide.Definition.Resource
import com.google.fhir.r4.core.ImplementationGuide.Global
import com.google.fhir.r4.core.ImplementationGuide.Manifest
import com.google.fhir.r4.core.ImplementationGuide.Manifest.ManifestResource
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.ResourceTypeCode
import com.google.fhir.r4.core.SPDXLicenseCode
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.CanonicalType
import org.hl7.fhir.r4.model.Enumerations
import org.hl7.fhir.r4.model.Reference
import org.hl7.fhir.r4.model.Type
import org.hl7.fhir.r4.model.UrlType

public object ImplementationGuideConverter {
  private
      fun ImplementationGuide.Definition.Resource.ExampleX.implementationGuideDefinitionResourceExampleToHapi():
      Type {
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasCanonical()) {
      return (this.getCanonical()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for ImplementationGuide.definition.resource.example[x]")
  }

  private fun Type.implementationGuideDefinitionResourceExampleToProto():
      ImplementationGuide.Definition.Resource.ExampleX {
    val protoValue = ImplementationGuide.Definition.Resource.ExampleX.newBuilder()
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is CanonicalType) {
      protoValue.setCanonical(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun ImplementationGuide.Definition.Page.NameX.implementationGuideDefinitionPageNameToHapi():
      Type {
    if (hasUrl()) {
      return (this.getUrl()).toHapi()
    }
    if (hasReference()) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ImplementationGuide.definition.page.name[x]")
  }

  private fun Type.implementationGuideDefinitionPageNameToProto():
      ImplementationGuide.Definition.Page.NameX {
    val protoValue = ImplementationGuide.Definition.Page.NameX.newBuilder()
    if (this is UrlType) {
      protoValue.setUrl(this.toProto())
    }
    if (this is Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  private
      fun ImplementationGuide.Manifest.ManifestResource.ExampleX.implementationGuideManifestResourceExampleToHapi():
      Type {
    if (hasBoolean()) {
      return (this.getBoolean()).toHapi()
    }
    if (hasCanonical()) {
      return (this.getCanonical()).toHapi()
    }
    throw
        IllegalArgumentException("Invalid Type for ImplementationGuide.manifest.resource.example[x]")
  }

  private fun Type.implementationGuideManifestResourceExampleToProto():
      ImplementationGuide.Manifest.ManifestResource.ExampleX {
    val protoValue = ImplementationGuide.Manifest.ManifestResource.ExampleX.newBuilder()
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is CanonicalType) {
      protoValue.setCanonical(this.toProto())
    }
    return protoValue.build()
  }

  public fun ImplementationGuide.toHapi(): org.hl7.fhir.r4.model.ImplementationGuide {
    val hapiValue = org.hl7.fhir.r4.model.ImplementationGuide()
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
    if (hasVersion()) {
      hapiValue.setVersionElement(version.toHapi())
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasTitle()) {
      hapiValue.setTitleElement(title.toHapi())
    }
    if (hasStatus()) {
      hapiValue.setStatus(Enumerations.PublicationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasExperimental()) {
      hapiValue.setExperimentalElement(experimental.toHapi())
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
    if (hasCopyright()) {
      hapiValue.setCopyrightElement(copyright.toHapi())
    }
    if (hasPackageId()) {
      hapiValue.setPackageIdElement(packageId.toHapi())
    }
    if (hasLicense()) {
      hapiValue.setLicense(org.hl7.fhir.r4.model.ImplementationGuide.SPDXLicense.valueOf(license.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (fhirVersionCount > 0) {
      fhirVersionList.forEach { hapiValue.addFhirVersion(Enumerations.FHIRVersion.valueOf(it.value.name.hapiCodeCheck().replace("_", ""))) }
    }
    if (dependsOnCount > 0) {
      hapiValue.setDependsOn(dependsOnList.map { it.toHapi() })
    }
    if (globalCount > 0) {
      hapiValue.setGlobal(globalList.map { it.toHapi() })
    }
    if (hasDefinition()) {
      hapiValue.setDefinition(definition.toHapi())
    }
    if (hasManifest()) {
      hapiValue.setManifest(manifest.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ImplementationGuide.toProto(): ImplementationGuide {
    val protoValue = ImplementationGuide.newBuilder()
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
    if (hasVersion()) {
      protoValue.setVersion(versionElement.toProto())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasTitle()) {
      protoValue.setTitle(titleElement.toProto())
    }
    if (hasStatus()) {
      protoValue.setStatus(ImplementationGuide.StatusCode.newBuilder().setValue(PublicationStatusCode.Value.valueOf(status.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasExperimental()) {
      protoValue.setExperimental(experimentalElement.toProto())
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
    if (hasCopyright()) {
      protoValue.setCopyright(copyrightElement.toProto())
    }
    if (hasPackageId()) {
      protoValue.setPackageId(packageIdElement.toProto())
    }
    if (hasLicense()) {
      protoValue.setLicense(ImplementationGuide.LicenseCode.newBuilder().setValue(SPDXLicenseCode.Value.valueOf(license.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasFhirVersion()) {
      protoValue.addAllFhirVersion(fhirVersion.map { ImplementationGuide.FhirVersionCode.newBuilder().setValue(FHIRVersionCode.Value.valueOf(it.value.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build() })
    }
    if (hasDependsOn()) {
      protoValue.addAllDependsOn(dependsOn.map { it.toProto() })
    }
    if (hasGlobal()) {
      protoValue.addAllGlobal(global.map { it.toProto() })
    }
    if (hasDefinition()) {
      protoValue.setDefinition(definition.toProto())
    }
    if (hasManifest()) {
      protoValue.setManifest(manifest.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDependsOnComponent.toProto():
      ImplementationGuide.DependsOn {
    val protoValue = ImplementationGuide.DependsOn.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasUri()) {
      protoValue.setUri(uriElement.toProto())
    }
    if (hasPackageId()) {
      protoValue.setPackageId(packageIdElement.toProto())
    }
    if (hasVersion()) {
      protoValue.setVersion(versionElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideGlobalComponent.toProto():
      ImplementationGuide.Global {
    val protoValue = ImplementationGuide.Global.newBuilder()
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
      protoValue.setType(ImplementationGuide.Global.TypeCode.newBuilder().setValue(ResourceTypeCode.Value.valueOf(type)).build())
    }
    if (hasProfile()) {
      protoValue.setProfile(profileElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionComponent.toProto():
      ImplementationGuide.Definition {
    val protoValue = ImplementationGuide.Definition.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasGrouping()) {
      protoValue.addAllGrouping(grouping.map { it.toProto() })
    }
    if (hasResource()) {
      protoValue.addAllResource(resource.map { it.toProto() })
    }
    if (hasPage()) {
      protoValue.setPage(page.toProto())
    }
    if (hasParameter()) {
      protoValue.addAllParameter(parameter.map { it.toProto() })
    }
    if (hasTemplate()) {
      protoValue.addAllTemplate(template.map { it.toProto() })
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionGroupingComponent.toProto():
      ImplementationGuide.Definition.Grouping {
    val protoValue = ImplementationGuide.Definition.Grouping.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionResourceComponent.toProto():
      ImplementationGuide.Definition.Resource {
    val protoValue = ImplementationGuide.Definition.Resource.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasReference()) {
      protoValue.setReference(reference.toProto())
    }
    if (hasFhirVersion()) {
      protoValue.addAllFhirVersion(fhirVersion.map { ImplementationGuide.Definition.Resource.FhirVersionCode.newBuilder().setValue(FHIRVersionCode.Value.valueOf(it.value.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build() })
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasExample()) {
      protoValue.setExample(example.implementationGuideDefinitionResourceExampleToProto())
    }
    if (hasGroupingId()) {
      protoValue.setGroupingId(groupingIdElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionPageComponent.toProto():
      ImplementationGuide.Definition.Page {
    val protoValue = ImplementationGuide.Definition.Page.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.setName(name.implementationGuideDefinitionPageNameToProto())
    }
    if (hasTitle()) {
      protoValue.setTitle(titleElement.toProto())
    }
    if (hasGeneration()) {
      protoValue.setGeneration(ImplementationGuide.Definition.Page.GenerationCode.newBuilder().setValue(GuidePageGenerationCode.Value.valueOf(generation.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionParameterComponent.toProto():
      ImplementationGuide.Definition.Parameter {
    val protoValue = ImplementationGuide.Definition.Parameter.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCode()) {
      protoValue.setCode(ImplementationGuide.Definition.Parameter.CodeType.newBuilder().setValue(GuideParameterCode.Value.valueOf(code)).build())
    }
    if (hasValue()) {
      protoValue.setValue(valueElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionTemplateComponent.toProto():
      ImplementationGuide.Definition.Template {
    val protoValue = ImplementationGuide.Definition.Template.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCode()) {
      protoValue.setCode(codeElement.toProto())
    }
    if (hasSource()) {
      protoValue.setSource(sourceElement.toProto())
    }
    if (hasScope()) {
      protoValue.setScope(scopeElement.toProto())
    }
    return protoValue.build()
  }

  private
      fun org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideManifestComponent.toProto():
      ImplementationGuide.Manifest {
    val protoValue = ImplementationGuide.Manifest.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasRendering()) {
      protoValue.setRendering(renderingElement.toProto())
    }
    if (hasResource()) {
      protoValue.addAllResource(resource.map { it.toProto() })
    }
    if (hasPage()) {
      protoValue.addAllPage(page.map { it.toProto() })
    }
    if (hasImage()) {
      protoValue.addAllImage(image.map { it.toProto() })
    }
    if (hasOther()) {
      protoValue.addAllOther(other.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ImplementationGuide.ManifestResourceComponent.toProto():
      ImplementationGuide.Manifest.ManifestResource {
    val protoValue = ImplementationGuide.Manifest.ManifestResource.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasReference()) {
      protoValue.setReference(reference.toProto())
    }
    if (hasExample()) {
      protoValue.setExample(example.implementationGuideManifestResourceExampleToProto())
    }
    if (hasRelativePath()) {
      protoValue.setRelativePath(relativePathElement.toProto())
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.ImplementationGuide.ManifestPageComponent.toProto():
      ImplementationGuide.Manifest.ManifestPage {
    val protoValue = ImplementationGuide.Manifest.ManifestPage.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasTitle()) {
      protoValue.setTitle(titleElement.toProto())
    }
    if (hasAnchor()) {
      protoValue.addAllAnchor(anchor.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun ImplementationGuide.DependsOn.toHapi():
      org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDependsOnComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDependsOnComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasUri()) {
      hapiValue.setUriElement(uri.toHapi())
    }
    if (hasPackageId()) {
      hapiValue.setPackageIdElement(packageId.toHapi())
    }
    if (hasVersion()) {
      hapiValue.setVersionElement(version.toHapi())
    }
    return hapiValue
  }

  private fun ImplementationGuide.Global.toHapi():
      org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideGlobalComponent {
    val hapiValue = org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideGlobalComponent()
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
      hapiValue.setType(type.value.name)
    }
    if (hasProfile()) {
      hapiValue.setProfileElement(profile.toHapi())
    }
    return hapiValue
  }

  private fun ImplementationGuide.Definition.toHapi():
      org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (groupingCount > 0) {
      hapiValue.setGrouping(groupingList.map { it.toHapi() })
    }
    if (resourceCount > 0) {
      hapiValue.setResource(resourceList.map { it.toHapi() })
    }
    if (hasPage()) {
      hapiValue.setPage(page.toHapi())
    }
    if (parameterCount > 0) {
      hapiValue.setParameter(parameterList.map { it.toHapi() })
    }
    if (templateCount > 0) {
      hapiValue.setTemplate(templateList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ImplementationGuide.Definition.Grouping.toHapi():
      org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionGroupingComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionGroupingComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    return hapiValue
  }

  private fun ImplementationGuide.Definition.Resource.toHapi():
      org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionResourceComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionResourceComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasReference()) {
      hapiValue.setReference(reference.toHapi())
    }
    if (fhirVersionCount > 0) {
      fhirVersionList.forEach { hapiValue.addFhirVersion(Enumerations.FHIRVersion.valueOf(it.value.name.hapiCodeCheck().replace("_", ""))) }
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasExample()) {
      hapiValue.setExample(example.implementationGuideDefinitionResourceExampleToHapi())
    }
    if (hasGroupingId()) {
      hapiValue.setGroupingIdElement(groupingId.toHapi())
    }
    return hapiValue
  }

  private fun ImplementationGuide.Definition.Page.toHapi():
      org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionPageComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionPageComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasName()) {
      hapiValue.setName(name.implementationGuideDefinitionPageNameToHapi())
    }
    if (hasTitle()) {
      hapiValue.setTitleElement(title.toHapi())
    }
    if (hasGeneration()) {
      hapiValue.setGeneration(org.hl7.fhir.r4.model.ImplementationGuide.GuidePageGeneration.valueOf(generation.value.name.hapiCodeCheck().replace("_", "")))
    }
    return hapiValue
  }

  private fun ImplementationGuide.Definition.Parameter.toHapi():
      org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionParameterComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionParameterComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCode()) {
      hapiValue.setCode(code.value.name)
    }
    if (hasValue()) {
      hapiValue.setValueElement(value.toHapi())
    }
    return hapiValue
  }

  private fun ImplementationGuide.Definition.Template.toHapi():
      org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionTemplateComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideDefinitionTemplateComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCode()) {
      hapiValue.setCodeElement(code.toHapi())
    }
    if (hasSource()) {
      hapiValue.setSourceElement(source.toHapi())
    }
    if (hasScope()) {
      hapiValue.setScopeElement(scope.toHapi())
    }
    return hapiValue
  }

  private fun ImplementationGuide.Manifest.toHapi():
      org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideManifestComponent {
    val hapiValue = org.hl7.fhir.r4.model.ImplementationGuide.ImplementationGuideManifestComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasRendering()) {
      hapiValue.setRenderingElement(rendering.toHapi())
    }
    if (resourceCount > 0) {
      hapiValue.setResource(resourceList.map { it.toHapi() })
    }
    if (pageCount > 0) {
      hapiValue.setPage(pageList.map { it.toHapi() })
    }
    if (imageCount > 0) {
      hapiValue.setImage(imageList.map { it.toHapi() })
    }
    if (otherCount > 0) {
      hapiValue.setOther(otherList.map { it.toHapi() })
    }
    return hapiValue
  }

  private fun ImplementationGuide.Manifest.ManifestResource.toHapi():
      org.hl7.fhir.r4.model.ImplementationGuide.ManifestResourceComponent {
    val hapiValue = org.hl7.fhir.r4.model.ImplementationGuide.ManifestResourceComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasReference()) {
      hapiValue.setReference(reference.toHapi())
    }
    if (hasExample()) {
      hapiValue.setExample(example.implementationGuideManifestResourceExampleToHapi())
    }
    if (hasRelativePath()) {
      hapiValue.setRelativePathElement(relativePath.toHapi())
    }
    return hapiValue
  }

  private fun ImplementationGuide.Manifest.ManifestPage.toHapi():
      org.hl7.fhir.r4.model.ImplementationGuide.ManifestPageComponent {
    val hapiValue = org.hl7.fhir.r4.model.ImplementationGuide.ManifestPageComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasTitle()) {
      hapiValue.setTitleElement(title.toHapi())
    }
    if (anchorCount > 0) {
      hapiValue.setAnchor(anchorList.map { it.toHapi() })
    }
    return hapiValue
  }
}
