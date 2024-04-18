
plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

gradlePlugin {
    plugins {
        register("consumer-producer-example") {
            id = "org.example.consumer-producer-example"
            implementationClass = "org.example.ExamplePlugin"
        }
    }
}
