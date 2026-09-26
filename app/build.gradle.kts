plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }

android {
    namespace = "com.griffin.rookinstaller"
    compileSdk = 35
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    defaultConfig { applicationId = "com.griffin.rookinstaller"; minSdk = 26; targetSdk = 35; versionCode = 1; versionName = "1.0" }
}

dependencies { implementation("androidx.documentfile:documentfile:1.0.1") }
