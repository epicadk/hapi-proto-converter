plugins {
    kotlin("jvm")
    java
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.21")
    implementation(Dependencies.FhirProto.fhirProtobufs)
    implementation(Dependencies.HapiFhir.structuresR4)
    implementation(Dependencies.kotlinPoet)
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
