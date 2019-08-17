package io.usoamic.web3kt.extensions

import io.usoamic.web3kt.BigNumber

inline fun String.toBigNumber(): BigNumber {
    return BigNumber(this)
}