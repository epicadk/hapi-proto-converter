import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure

fun Project.configureSpotless() {
    val ktlintOptions = mapOf("indent_size" to "2", "continuation_indent_size" to "2")
    apply(plugin = Plugins.BuildPlugins.spotless)
    configure<com.diffplug.gradle.spotless.SpotlessExtension> {
        kotlin {
            target("**/*.kt")
            targetExclude("**/build/")
            ktlint().userData(ktlintOptions)
        }
        kotlinGradle {
            target("*.gradle.kts")
            ktlint().userData(ktlintOptions)
        }
    }
}
