import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackOutput.Target.COMMONJS

object Version {
    const val web3 = "^1.2.9"
    const val bigNumberJs = "^9.0.0"
    const val ethereumJsTx = "^1.3.7"
    const val ethereumJsWallet = "^0.6.3"
    const val bip39 = "^3.0.2"
    const val abiDecoder = "^2.3.0"
}

buildscript {
    val kotlinVersion = "1.3.72"

    repositories {
        jcenter()
        mavenCentral()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }

    dependencies {
        classpath("org.jetbrains.kotlin", "kotlin-gradle-plugin", kotlinVersion)
    }
}

allprojects {
    group = "io.usoamic"
    version = "1.1.1"
}

plugins {
    val kotlinVersion = "1.3.72"
    id("org.jetbrains.kotlin.js") version kotlinVersion
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-js"))

    implementation(npm("web3", Version.web3))
    implementation(npm("bignumber.js", Version.bigNumberJs))
    implementation(npm("ethereumjs-tx", Version.ethereumJsTx))
    implementation(npm("ethereumjs-wallet", Version.ethereumJsWallet))
    implementation(npm("bip39", Version.bip39))
    implementation(npm("abi-decoder", Version.abiDecoder))
}

kotlin {
    target {
        browser {
            webpackTask {
                output.libraryTarget = COMMONJS
                //output.libraryTarget = "commonjs" // alternative
            }
        }
    }
}