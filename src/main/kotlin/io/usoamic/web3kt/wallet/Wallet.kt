package io.usoamic.web3kt.wallet

import io.usoamic.web3kt.Buffer

@JsModule("ethereumjs-wallet")
open external class Wallet {
    fun getPublicKey(): Buffer
    fun getPrivateKey(): Buffer
    fun getChecksumAddressString(): String
    fun toV3(password: String): String

    companion object {
        fun fromPrivateKey(privateKey: Buffer): Wallet
        fun fromV3(json: String, password: String): Wallet
    }
}