package io.usoamic.web3kt.wallet

import io.usoamic.web3kt.buffer.Buffer

class WalletUtils {
    companion object {
        fun fromPrivateKey(privateKey: String): Wallet = Wallet.fromPrivateKey(Buffer.from(privateKey, "hex"))
    }
}