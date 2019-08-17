package io.usoamic.web3kt.bignumber.extension

import io.usoamic.web3kt.bignumber.BigNumber

inline fun String.toBigNumber(): BigNumber {
    return BigNumber(this)
}