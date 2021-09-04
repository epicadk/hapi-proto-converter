object Plugins {

    object BuildPlugins {
        const val mavenPublish = "maven-publish"
        const val spotless = "com.diffplug.spotless"
        const val kotlin = "kotlin"
    }

    // classpath plugins
    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Dependencies.Versions.Kotlin.stdlib}"
}
