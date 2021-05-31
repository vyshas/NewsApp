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
    ":libraries:test_utils"
)
rootProject.name = "NewsApp"
rootProject.buildFileName = "build.gradle.kts"


