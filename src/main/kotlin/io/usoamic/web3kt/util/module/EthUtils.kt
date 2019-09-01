package io.usoamic.web3kt.util.module

import io.usoamic.web3kt.buffer.Buffer

@JsModule("ethereumjs-util")
internal external class EthUtils {
    companion object {
        @JsName("isValidPrivate")
        fun isValidPrivateKey(privateKey: Buffer): Boolean
    }
}