package io.usoamic.web3kt.bip39

import io.usoamic.web3kt.Buffer

@JsModule("bip39")
external class Bip39 {
    companion object {
        fun generateMnemonic(): String
        fun isValidMnemonicPhrase(phrase: String)
        fun mnemonicToSeedSync(phrase: String): Buffer
    }
}