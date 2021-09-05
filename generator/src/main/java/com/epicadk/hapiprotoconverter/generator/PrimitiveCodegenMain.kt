package com.epicadk.hapiprotoconverter.generator

import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.StructureDefinition
import com.google.fhir.r4.core.StructureDefinitionKindCode
import java.io.File

fun main() {
    for (x in primitiveTypeList) {
        val file = File("converter\\src\\main\\java")
        // This is temp will parse files
        PrimitiveCodegen.generate(
            StructureDefinition.newBuilder()
                .setId(Id.newBuilder().setValue(x))
                .setKind(
                    StructureDefinition.KindCode.newBuilder()
                        .setValue(StructureDefinitionKindCode.Value.PRIMITIVE_TYPE)
                )
                .build(),
            outLocation = file
        )
    }
}
