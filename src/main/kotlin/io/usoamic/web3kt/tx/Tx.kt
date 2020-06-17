package io.usoamic.web3kt.tx

import io.usoamic.web3kt.buffer.Buffer
import io.usoamic.web3kt.tx.model.RawTransaction

@JsModule("ethereumjs-tx")
@JsNonModule
external class Tx(tx: RawTransaction) {
    fun sign(privateKey: Buffer)
    fun serialize(): Buffer
}