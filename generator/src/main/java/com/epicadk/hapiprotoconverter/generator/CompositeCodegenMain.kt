package com.epicadk.hapiprotoconverter.generator

import com.google.fhir.common.JsonFormat
import com.google.fhir.r4.core.StructureDefinition
import com.google.fhir.r4.core.StructureDefinitionKindCode
import com.google.fhir.r4.core.ValueSet
import com.squareup.kotlinpoet.ClassName
import java.io.File

fun main() {
    // TODO change this
    File("hapiprotoconverter\\sampledata\\").listFiles()!!
        .filter {
            it.name.startsWith("valueset-") &&
                    !it.name.startsWith("valueset-extensions-") &&
                    !it.name.equals("valueset-questionnaire.canonical.json") &&
                    !it.name.equals("valueset-questionnaire.json") &&
                    it.name.endsWith(".json")
        }
        .forEach {
            try {
                val def = JsonFormat.getParser().merge(it.inputStream().reader(), ValueSet.newBuilder())
                CompositeCodegen.valueSetUrlMap[def.url.value] = def.build()
            } catch (e: Exception) {
                println(it.name)
            }
        }
    // TODO move this to a different folder?
    File("hapiprotoconverter\\sampledata\\").listFiles()!!
        .filter { it.name.endsWith(".profile.json") }
        .forEach {
            val def =
                JsonFormat.getParser().merge(it.inputStream().reader(), StructureDefinition.newBuilder())
            CompositeCodegen.profileUrlMap[def.url.value] = def.build()
        }
    CompositeCodegen.profileUrlMap.values.forEach { def ->
        if ((def.kind.value == StructureDefinitionKindCode.Value.COMPLEX_TYPE ||
                    def.kind.value == StructureDefinitionKindCode.Value.RESOURCE) && !def.abstract.value
        ) {
            try {
                Class.forName(ClassName(hapiPackage, def.id.value.capitalizeFirst()).reflectionName())

                Class.forName(ClassName(protoPackage, def.id.value.capitalizeFirst()).reflectionName())
                CompositeCodegen.generate(def, File("hapiprotoconverter\\src\\main\\java"))
            } catch (e: Exception) {
                if (e is ClassNotFoundException) {
                    println("${def.id.value} Class not found")
                } else {
                    //          throw e
                    println(def.name.value)
                }
            }
        }
    }
}

// profiles that cannot be generated ( apart from -genetics.json profilesi )
// Profile for Catalog
// CDS Hooks GuidanceResponse
// CDS Hooks Service PlanDefinition
// Clinical Document
// TODO - Composition
// CQF-Questionnaire
// DataElement constraint on ElementDefinition data type
// Family member history for genetics analysis
// Profile for HLA Genotyping Results
// TODO MessageDefinition - Done
