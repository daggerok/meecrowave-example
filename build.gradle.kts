plugins {
    idea
    java
    application
    distribution
    id("org.jetbrains.kotlin.jvm").version("1.3.21")
}

configure<JavaPluginExtension> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.meecrowave:meecrowave-core:1.2.7")
    implementation("commons-cli:commons-cli:1.4")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

defaultTasks("installDist", "distZip", "distTar")

val mainAppClass: String by project.extra { "com.github.daggerok.App" }

application {
    mainClassName = mainAppClass
}
