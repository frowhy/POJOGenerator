dependencies {
    implementation(project(":core", "default"))

    implementation("org.json:json:v202230601-SNAPSHOT")
    implementation("commons-io:commons-io:2.11.0")
    implementation("com.google.guava:guava:23.0")
}

repositories {
    val codingArtifactsRepoUrl: String by project
    val codingArtifactsGradleUsername: String by project
    val codingArtifactsGradlePassword: String by project
    maven {
        url = uri(codingArtifactsRepoUrl)
        credentials {
            username = codingArtifactsGradleUsername
            password = codingArtifactsGradlePassword
        }
    }
}