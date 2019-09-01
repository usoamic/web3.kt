package io.usoamic.web3kt.util.extension

import kotlin.math.min

fun String.removeHexPrefix(): String {
    return this.substring(2)
}

fun String.addHexPrefix(): String {
    return "0x$this"
}

fun String.hasPrefix(): Boolean {
    return (substring(0, min(this.length, 2)) == "0x")
}

fun String.addPrefixIfNotExist(): String {
    return if(this.hasPrefix()) this else this.addHexPrefix()
}

fun String.removeHexPrefixIfExist(): String {
    return if(this.hasPrefix()) this.removeHexPrefix() else this
}