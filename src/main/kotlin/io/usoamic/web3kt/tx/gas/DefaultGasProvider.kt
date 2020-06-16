package io.usoamic.web3kt.tx.gas

import io.usoamic.web3kt.bignumber.BigNumber

class DefaultGasProvider {
    companion object {
        val GAS_LIMIT: BigNumber = BigNumber(4_300_000L).toNumber()
        val GAS_PRICE_20: BigNumber = BigNumber(20_000_000_000L).toNumber()
        val GAS_PRICE_35: BigNumber = BigNumber(35_000_000_000L).toNumber()
        val GAS_PRICE_50: BigNumber = BigNumber(50_000_000_000L).toNumber()
        val GAS_PRICE_75: BigNumber = BigNumber(75_000_000_000L).toNumber()
        val GAS_PRICE_100: BigNumber = BigNumber(100_000_000_000L).toNumber()
        val GAS_PRICE_125: BigNumber = BigNumber(125_000_000_000L).toNumber()
        val DEFAULT_GAS_PRICE: BigNumber  = BigNumber(35_000_000_000L).toNumber()
    }
}