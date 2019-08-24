package io.usoamic.web3kt.util

import io.usoamic.web3kt.buffer.Buffer

@JsModule("ethereumjs-util")
external class EthereumUtils {
    companion object {
        @JsName("isValidPrivate")
        fun isValidPrivateKey(privateKey: Buffer): Boolean
    }
}