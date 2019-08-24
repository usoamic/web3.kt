package io.usoamic.web3kt.buffer.extension

import io.usoamic.web3kt.buffer.Buffer

inline fun Buffer.toHex(): String {
    return this.toString("hex")
}

inline fun Buffer.Companion.fromHex(input: String): Buffer {
    return Buffer.from(input, "hex")
}