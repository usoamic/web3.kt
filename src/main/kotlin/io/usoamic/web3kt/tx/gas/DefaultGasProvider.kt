package io.usoamic.web3kt.tx.gas

import io.usoamic.web3kt.bignumber.BigNumber

class DefaultGasProvider {
    companion object {
        val GAS_LIMIT = BigNumber(4300000)
        val GAS_PRICE = BigNumber(22_000_000_000L)
    }
}