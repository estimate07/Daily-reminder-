plugins { id("com.android.application"); id("org.jetbrains.kotlin.android"); id("org.jetbrains.kotlin.plugin.compose"); id("com.google.devtools.ksp") }

android { namespace = "com.rovio.daily3"; compileSdk = 34
    defaultConfig { applicationId = "com.rovio.daily3"; minSdk = 24; targetSdk = 34; versionCode = 1; versionName = "1.0" }
}

dependencies {
    val room = "2.6.1"
    implementation("androidx.core:core-ktx:1.13.1"); implementation("androidx.activity:activity-compose:1.9.3")
    implementation(platform("androidx.compose:compose-bom:2024.10.01")); implementation("androidx.compose.ui:ui"); implementation("androidx.compose.ui:ui-graphics"); implementation("androidx.compose.material3:material3"); implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.6")
    implementation("androidx.room:room-runtime:$room"); implementation("androidx.room:room-ktx:$room"); ksp("androidx.room:room-compiler:$room")
    implementation("androidx.datastore:datastore-preferences:1.1.1"); implementation("androidx.work:work-runtime-ktx:2.9.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")
}
