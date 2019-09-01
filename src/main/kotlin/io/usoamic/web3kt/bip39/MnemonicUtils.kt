package io.usoamic.web3kt.bip39

import io.usoamic.web3kt.buffer.Buffer

@JsModule("bip39")
external class MnemonicUtils {
    companion object {
        fun generateMnemonic(): String
        fun isValidMnemonicPhrase(phrase: String): Boolean
        @JsName("mnemonicToSeedSync")
        fun mnemonicToSeed(phrase: String): Buffer
        @JsName("mnemonicToSeedSync")
        fun mnemonicToSeed(phrase: String, password: String): Buffer
    }
}