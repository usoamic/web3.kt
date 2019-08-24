package io.usoamic.web3kt.wallet.extension

import io.usoamic.web3kt.buffer.Buffer
import io.usoamic.web3kt.wallet.Wallet

inline fun func1() { }

inline fun Wallet.Companion.fromPrivateKey(privateKey: String): Wallet {
    return Wallet.fromPrivateKey(Buffer.from(privateKey, "hex"))
}