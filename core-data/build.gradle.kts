import dependencies.Dependencies
import dependencies.AnnotationProcessorsDependencies
import extensions.buildConfigStringField
import extensions.getLocalProperty
import extensions.implementation
import extensions.kapt

plugins {
    id("commons.android-library")
}

android {
    buildTypes.forEach {
        try {
            it.buildConfigStringField("NEWS_API_BASE_URL", "https://newsapi.org/v2/")
            it.buildConfigStringField("NEWS_API_KEY", getLocalProperty("NEWS_API_KEY"))

        } catch (ignored: Exception) {
            throw InvalidUserDataException(
                "You should define 'NEWS_API_KEY' in local.properties. Visit 'https://newsapi.org/' " +
                        "to obtain them."
            )
        }
    }
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
    implementation(Dependencies.MOSHI_CODEGEN)
    implementation(Dependencies.MOSHI_ADAPTER)
    implementation(Dependencies.RETROFI_MOSHI_CONVERTER)

    kapt(AnnotationProcessorsDependencies.DATABINDING)
    kapt(AnnotationProcessorsDependencies.ROOM)
    kapt(AnnotationProcessorsDependencies.LIFECYCLE_COMPILER)
}
