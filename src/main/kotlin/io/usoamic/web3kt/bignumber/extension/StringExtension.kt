package io.usoamic.web3kt.bignumber.extension

import io.usoamic.web3kt.bignumber.BigNumber

fun String.toBigNumber(): BigNumber {
    return BigNumber(this)
}