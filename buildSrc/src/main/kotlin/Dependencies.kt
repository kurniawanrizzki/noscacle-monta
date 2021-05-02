import org.gradle.api.JavaVersion

/**
 * TODO: Add class header description
 * Created by kurniawanrizzki on 02/05/21.
 */
object Config {
    const val compileSdkVersion = 30
    const val buildToolsVersion = "30.0.3"
    const val minSdkVersion = 23
    const val targetSdkVersion = 30
    val javaVersion = JavaVersion.VERSION_1_8
}

object Version {
    val kotlinVersion = "1.4.32"
    val gradleBuildToolsVersion = "4.1.3"

    val coreVersion = "1.3.2"
    val appcompatVersion = "1.2.0"
    val materialVersion = "1.3.0"
    val constraintLayoutVersion = "2.0.4"

    val junitVersion = "4.+"
    val junitExtVersion = "1.1.2"
    val espressoVersion = "3.3.0"
}

object Lib {
    val gradleBuildTools = "com.android.tools.build:gradle:${Version.gradleBuildToolsVersion}"
    val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlinVersion}"
    val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlinVersion}"
    val androidxCore = "androidx.core:core-ktx:${Version.coreVersion}"
    val androidxAppcompat = "androidx.appcompat:appcompat:${Version.appcompatVersion}"
    val androidxMaterial = "com.google.android.material:material:${Version.materialVersion}"
    val androidxConstraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayoutVersion}"

    val androidxEspresso = "androidx.test.espresso:espresso-core:${Version.espressoVersion}"
    val androidxJunit = "androidx.test.ext:junit:${Version.junitExtVersion}"
    val junit = "junit:junit:${Version.junitVersion}"
}