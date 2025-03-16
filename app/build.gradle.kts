plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "adarsh.fruitcrush.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "adarsh.fruitcrush.app"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

//    implementation 'org.jetbrains.kotlin:kotlin-stdlib:1.8.10'
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.10")
    // coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    // viewModelScope
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    // lifecycleScope
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")

    // UI
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.material:material:1.6.0")


    implementation("androidx.core:core-ktx:1.10.0")
    implementation("androidx.appcompat:appcompat:1.6.1")


    /* coroutines support for firebase operations */
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.6.1")


    // Import the BoM for the Firebase platform
    implementation(platform("com.google.firebase:firebase-bom:26.1.0"))
    implementation("com.google.firebase:firebase-firestore:24.5.0")
    implementation("com.google.firebase:firebase-database-ktx:20.2.0")
    implementation("com.google.firebase:firebase-auth-ktx:21.3.0")


    implementation("com.google.android.gms:play-services-auth:20.5.0")

    implementation("com.github.bumptech.glide:glide:4.12.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")

    implementation("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.3")
    // must use
    implementation("androidx.fragment:fragment-ktx:1.5.6")


    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")
    // lottie
    implementation("com.airbnb.android:lottie:3.7.2")
    // Testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation ("androidx.arch.core:core-testing:2.2.0")
//    androidTestImplementation ("androidx.test.espresso:espresso-core:1.0.0", {
//        exclude group: 'com.android.support', module: 'support-annotations'
//    })
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
}