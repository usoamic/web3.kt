package io.usoamic.web3kt.util.extension

fun String.removeHexPrefix(): String {
    return this.substring(2)
}

fun String.addHexPrefix(): String {
    return "0x$this"
}