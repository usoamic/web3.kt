package io.usoamic.web3kt.wallet

import io.usoamic.web3kt.buffer.Buffer

@JsModule("ethereumjs-wallet/hdkey")
external class HDWallet {
    @JsName("publicExtendedKey")
    fun getPublicExtendedKey(): String
    @JsName("privateExtendedKey")
    fun getPrivateExtendedKey(): String
    fun getWallet(): Wallet

    companion object {
        fun fromMasterSeed(seed: Buffer): HDWallet
    }
}