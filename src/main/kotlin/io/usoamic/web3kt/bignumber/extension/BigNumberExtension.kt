package io.usoamic.web3kt.bignumber.extension

import io.usoamic.web3kt.bignumber.BigNumber
import io.usoamic.web3kt.buffer.Buffer
import io.usoamic.web3kt.core.Web3

fun String.toBigNumber(): BigNumber {
    return BigNumber(this)
}

fun BigNumber.toBuffer(): Buffer {
    return Web3.utils.toHex(this)
}

fun String.toBuffer(): Buffer {
    return Web3.utils.toHex(this)
}

fun Long.toBuffer(): Buffer {
    return Web3.utils.toHex(this.toString())
}
