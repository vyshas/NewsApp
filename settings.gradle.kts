/*dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}*/
include(
    ":app",
    ":core",
    ":libraries:test_utils",
    ":core-domain",
    ":core-data"
)
rootProject.name = "NewsApp"
rootProject.buildFileName = "build.gradle.kts"
