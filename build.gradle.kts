plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.codeborne:selenide:6.19.0")
    implementation("org.seleniumhq.selenium:selenium-java:4.14.1")

}

tasks.test {
    useJUnitPlatform()
}