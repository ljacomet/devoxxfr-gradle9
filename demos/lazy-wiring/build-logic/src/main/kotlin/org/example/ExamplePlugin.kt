package org.example

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.register

class ExamplePlugin: Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.register<Consumer>("consumer")
        project.tasks.register<Producer>("producer") {
            outputFile.convention(project.layout.buildDirectory.file("output.txt"))
        }
    }
}