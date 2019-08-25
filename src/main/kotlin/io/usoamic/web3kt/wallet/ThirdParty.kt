package io.usoamic.web3kt.wallet

@JsModule("ethereumjs-wallet/thirdparty")
external class ThirdParty {
    companion object {
        fun fromEtherCamp(passphrase: String): Wallet
    }
}
