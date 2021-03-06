/*
 * Copyright 2021 vyshas
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import dependencies.AnnotationProcessorsDependencies
import dependencies.Dependencies
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
    api(project(":core-data"))

    implementation(Dependencies.NAVIGATION_FRAGMENT)
    implementation(Dependencies.NAVIGATION_UI)
    implementation(Dependencies.NAVIGATION_DYNAMIC_FEATURE)
    implementation(Dependencies.LIFECYCLE_VIEWMODEL)
    implementation(Dependencies.LIFECYCLE_RUNTIME_KTX)
    implementation(Dependencies.LIFECYCLE_COMMON_JAVA8_KTX)
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
    kapt(AnnotationProcessorsDependencies.LIFECYCLE_COMPILER)
}
