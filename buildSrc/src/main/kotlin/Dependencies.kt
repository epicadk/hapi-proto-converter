object Dependencies {

    object HapiFhir {
        const val structuresR4 = "ca.uhn.hapi.fhir:hapi-fhir-structures-r4:${Versions.hapiFhir}"
    }

    object FhirProto {
        const val fhirProtobufs = "com.google.fhir:r4:${Versions.FhirProto.fhirProto}"
    }

    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.Kotlin.stdlib}"
    }

    const val kotlinPoet = "com.squareup:kotlinpoet:${Versions.kotlinPoet}"
    const val guava = "com.google.guava:guava:${Versions.guava}"

    // For testing
    const val junit = "junit:junit:${Versions.junit}"
    const val truth = "com.google.truth:truth:${Versions.truth}"

    object Versions {

        object Kotlin {
            const val stdlib = "1.4.31"
        }

        const val hapiFhir = "5.4.0"

        object FhirProto {
            const val fhirProto = "0.6.1"
        }

        const val kotlinPoet = "1.9.0"
        const val guava = "28.2-android"

        const val truth = "1.0.1"
        const val junit = "4.13"
    }
}
