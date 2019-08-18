package io.usoamic.web3kt.tx

import io.usoamic.web3kt.buffer.Buffer

@JsModule("ethereumjs-tx")
external class Tx(tx: Any) {
    fun sign(privateKey: Buffer)
    fun serialize(): String
}