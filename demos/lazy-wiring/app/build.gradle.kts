
plugins {
    id("buildlogic.java-application-conventions")
    id("org.example.consumer-producer-example")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    mainClass = "org.example.app.App"
}

tasks.consumer {
    inputFile = tasks.producer.flatMap { it.outputFile }
}

tasks.producer {
    outputFile = layout.buildDirectory.file("devoxx france.txt")
}

layout.buildDirectory = layout.projectDirectory.dir("output")
