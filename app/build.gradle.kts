plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    kotlin("kapt")
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.tasnimulhasan.diary"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.tasnimulhasan.diary"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.ui.text.google.fonts)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //compose navigation
    implementation(libs.androidx.navigation.compose)

    //firebase
    implementation(libs.firebase.auth.ktx)
    implementation(libs.firebase.storage.ktx)

    //room components
    implementation(libs.androidx.room.runtime)
    kapt(libs.androidx.room.compiler)
    implementation(libs.androidx.room.ktx)

    //runtime compose
    implementation(libs.androidx.lifecycle.runtime.compose)

    //splash api
    implementation(libs.androidx.core.splashscreen)

    //mongodb realm
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0-native-mt") {
        version {
            strictly("1.6.0-native-mt")
        }
    }
    implementation(libs.library.sync)

    //dagger hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    implementation(libs.androidx.hilt.navigation.compose)

    //google auth
    implementation(libs.gms.play.services.auth)

    //coil
    implementation(libs.coil.compose)

    //date time picker
    implementation(libs.datetime)

    //message bar compose
    implementation(libs.messagebarcompose)

    //one-tap compose
    implementation(libs.onetapcompose)

    //desugar jdk
    coreLibraryDesugaring(libs.desugar.jdk.libs)

}