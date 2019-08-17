package io.usoamic.web3kt

external class Buffer {
    companion object {
        fun from(arg: String, encoding: String): Buffer
    }
    val length: Int
}