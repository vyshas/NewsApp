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

package commons

import dependencies.AnnotationProcessorsDependencies
import dependencies.Dependencies
import dependencies.TestDependencies
import extensions.implementation
import extensions.kapt

plugins {
    id("kotlin")
    id("kotlin-kapt")
    id("kotlin-allopen")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation(Dependencies.COROUTINES)
    implementation(Dependencies.TIMBER)

    implementation(Dependencies.DAGGER)
    kapt(AnnotationProcessorsDependencies.DAGGER)

    implementation(TestDependencies.ASSERTJ)
    implementation(TestDependencies.RULES)
    implementation(TestDependencies.COROUTINES_TEST)
    implementation(TestDependencies.EXT)
    implementation(TestDependencies.MOCKK)
}
