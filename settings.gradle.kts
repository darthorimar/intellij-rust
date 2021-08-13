rootProject.name = "intellij-rust"
// Special module with run, build and publish tasks
include("plugin")
include(
    "common",
    "idea",
    "clion",
    "debugger",
    "toml",
    "copyright",
    "coverage",
    "intelliLang",
    "duplicates",
    "grazie",
    "js",
    "ml-completion",
    "intellij-toml",
    "intellij-toml:core"
)

// Configure Gradle Build Cache. It is enabled in `gradle.properties` via `org.gradle.caching`.
buildCache {
    local {
        isEnabled = System.getenv("CI") == null
        directory = File(rootDir, "build/build-cache")
        removeUnusedEntriesAfterDays = 30
    }
}
