package io.usoamic.web3kt.buffer.extension

import io.usoamic.web3kt.buffer.Buffer
import io.usoamic.web3kt.core.Web3

inline fun Buffer.toHex(): String {
    return this.toString("hex")
}

inline fun Buffer.Companion.fromHex(input: String): Buffer {
    return Buffer.from(input, "hex")
}

inline fun Buffer.Companion.fromLong(input: Long): Buffer {
    return Web3.utils.toHex(input.toString())
}

inline fun Buffer.Companion.fromString(input: String): Buffer {
    return Web3.utils.toHex(input)
}