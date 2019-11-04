package io.usoamic.web3kt.tx.gas

import io.usoamic.web3kt.bignumber.BigNumber

class DefaultGasProvider {
    companion object {
        val GAS_LIMIT: BigNumber = BigNumber(4_300_000L).toNumber()
        val GAS_PRICE: BigNumber = BigNumber(22_000_000_000L).toNumber()
    }
}