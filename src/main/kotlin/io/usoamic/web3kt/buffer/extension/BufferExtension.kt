package io.usoamic.web3kt.buffer.extension

import io.usoamic.web3kt.Buffer

inline fun Buffer.toHex(): String {
    return this.toString("hex")
}