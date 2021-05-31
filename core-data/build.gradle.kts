import dependencies.Dependencies
import dependencies.AnnotationProcessorsDependencies
import extensions.implementation
import extensions.kapt

plugins {
    id("commons.android-library")
}

allOpen {
    // allows mocking for classes w/o directly opening them for release builds
    annotation("com.vyshas.core.data.annotations.OpenClass")
}

dependencies {
    api(project(":core-domain"))

    implementation(Dependencies.ROOM)
    implementation(Dependencies.ROOM_KTX)
    implementation(Dependencies.NAVIGATION_UI)
    implementation(Dependencies.FRAGMENT_KTX)
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.RETROFIT_CONVERTER)
    implementation(Dependencies.LOGGING)
    implementation(Dependencies.MOSHI)
    implementation(Dependencies.MOSHI_KTX)

    kapt(AnnotationProcessorsDependencies.DATABINDING)
    kapt(AnnotationProcessorsDependencies.ROOM)
    kapt(AnnotationProcessorsDependencies.LIFECYCLE_COMPILER)
}
