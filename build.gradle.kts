//plugins {
//    //trick: for the same plugin versions in all sub-modules
//    id("com.android.application").version("7.3.1").apply(false)
//    id("com.android.library").version("7.3.1").apply(false)
//    kotlin("android").version("1.7.10").apply(false)
//    kotlin("multiplatform").version("1.7.10").apply(false)
//}
plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader

    kotlin("jvm") apply false
    id("org.jetbrains.compose").version("1.2.1") apply false
    id("com.android.application").version("7.3.1").apply(false)
    id("com.android.library").version("7.3.1").apply(false)
    kotlin("android").version("1.7.10").apply(false)
    kotlin("multiplatform").version("1.7.10").apply(false)
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
