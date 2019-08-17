package io.usoamic.web3kt

@JsModule("ethereumjs-tx")
external class Tx(tx: Any) {
    fun sign(privateKey: dynamic)
    fun serialize(): String
}