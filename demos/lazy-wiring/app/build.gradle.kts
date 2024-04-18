
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
