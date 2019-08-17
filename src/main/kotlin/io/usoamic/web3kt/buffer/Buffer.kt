package io.usoamic.web3kt

external class Buffer() {
    constructor(buffer: Buffer)
    companion object {
        fun from(input: String, encoding: String): Buffer
    }
    fun toString(encoding: String): String
    val length: Int
}