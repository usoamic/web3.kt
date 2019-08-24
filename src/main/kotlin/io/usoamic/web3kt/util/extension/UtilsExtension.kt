package io.usoamic.web3kt.util.extension

fun String.removePrefix(): String {
    return this.substring(2)
}