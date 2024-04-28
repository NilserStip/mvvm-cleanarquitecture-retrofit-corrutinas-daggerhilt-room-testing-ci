pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name =
    "MVVM - CLEAN ARCHITECTURE - RETROFIT - CORRUTINAS - DAGGER HILT - ROOM - TESTING - CI"
include(":app")
 