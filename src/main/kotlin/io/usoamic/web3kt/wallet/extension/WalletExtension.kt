package io.usoamic.web3kt.wallet.extension

import io.usoamic.web3kt.Buffer
import io.usoamic.web3kt.buffer.extension.toHex
import io.usoamic.web3kt.wallet.Wallet

inline fun Wallet.getPrivateKeyAsString(): String {
    return Buffer(getPrivateKey()).toHex()
}

inline fun Wallet.getPublicKeyAsString(): String {
    return Buffer(getPublicKey()).toHex()
}