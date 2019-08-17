package io.usoamic.web3kt.bignumber.extensions

import io.usoamic.web3kt.bignumber.BigNumber

inline fun String.toBigNumber(): BigNumber {
    return BigNumber(this)
}