package io.usoamic.web3kt.wallet

import io.usoamic.web3kt.buffer.Buffer
import kotlin.js.Json

@JsModule("ethereumjs-wallet")
external class Wallet {
    fun getPublicKey(): Buffer
    fun getPrivateKey(): Buffer
    @JsName("getAddressString")
    fun getAddressAsString(): String
    @JsName("getPublicKeyString")
    fun getPublicKeyAsString(): String
    @JsName("getPrivateKeyString")
    fun getPrivateKeyAsString(): String
    @JsName("getChecksumAddressString")
    fun getChecksumAddressAsString(): String
    fun toV3(password: String): Json

    companion object {
        fun generate(): Wallet
        fun fromPrivateKey(privateKey: Buffer): Wallet
        fun fromV3(json: String, password: String): Wallet
    }
}