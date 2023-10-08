@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.com.android.application)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    id("com.google.devtools.ksp") version libs.versions.ksp
}

android {
    namespace = "by.bsuir.ivanromanovsky.pmislabs"
    compileSdk = 34

    defaultConfig {
        applicationId = "by.bsuir.ivanromanovsky.pmislabs"
        minSdk = 26
        targetSdk = 33
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
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    ksp("androidx.room:room-compiler:2.5.2")
    implementation(libs.core.ktx)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.activity.compose)
    implementation(platform(libs.compose.bom))

//    implementation("android.arch.persistence.room:runtime:1.1.1")
//    annotationProcessor("android.arch.persistence.room:compiler:1.1.1")
    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlin.stdlib.jdk8)

    // implementation(libs.accompanist.appcompat)
    implementation(libs.androidx.collection)

    implementation(libs.coil)
    implementation(libs.coil.compose)

    implementation(libs.compose.activity)
    implementation(libs.compose.animation)
    implementation(libs.compose.constraintlayout)
    implementation(libs.compose.foundation)
    implementation(libs.compose.graphics)
    implementation(libs.compose.material3)

    implementation(libs.compose.paging)
    debugImplementation(libs.compose.preview)

    implementation(libs.compose.runtime)
    debugImplementation(libs.compose.tooling)

    implementation(libs.compose.ui.util)
    implementation(libs.compose.viewmodel)

    implementation(libs.datastore.preferences)
    implementation(libs.datastore.core)

    implementation(libs.serialization.json)

    implementation(libs.koin.core)
    implementation(libs.koin.android)
    implementation(libs.koin.compose)

    implementation(libs.workmanager.runtime)
    implementation(libs.workmanager.runtime.ktx)

    implementation(libs.coroutines.core)
    implementation(libs.coroutines.android)

    implementation(libs.ktor.auth)
    implementation(libs.ktor.content.negotiation)
    implementation(libs.ktor.core)
    implementation(libs.ktor.engine)
    implementation(libs.ktor.logging)
    implementation(libs.ktor.kotlin.serialization)

    implementation(libs.lifecycle.process)
    implementation(libs.lifecycle.service)
    implementation(libs.lifecycle.viewmodel)

    implementation(libs.paging)
    implementation(libs.paging.common)

    implementation(libs.room.runtime)

    implementation(libs.accompanist.ui)

    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)
}