import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins { `kotlin-dsl` }

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:5.12.5")
}