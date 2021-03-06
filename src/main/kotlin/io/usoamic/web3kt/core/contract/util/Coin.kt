package io.usoamic.web3kt.core.contract.util

import io.usoamic.web3kt.bignumber.BNConfig
import io.usoamic.web3kt.bignumber.BigNumber
import io.usoamic.web3kt.bignumber.BigNumberValue

class Coin private constructor(value: BigNumber, decimals: Int = DECIMALS) {
    private val value: BigNumber

    init {
        BigNumber.config(
            BNConfig(
                ROUNDING_MODE = BigNumber.ROUND_DOWN,
                DECIMAL_PLACES = DECIMALS
            )
        )
        this.value = BigNumber(value.toFixed(decimals))
    }

    companion object {
        fun ONE(decimals: Int = DECIMALS): Coin = Coin(BigNumberValue.ONE, decimals)
        fun TEN(decimals: Int = DECIMALS): Coin = Coin(BigNumberValue.TEN, decimals)
        fun ONE_HUNDRED(decimals: Int = DECIMALS): Coin = Coin(BigNumberValue.ONE_HUNDRED, decimals)
        fun fromSat(value: BigNumber, decimals: Int = DECIMALS): Coin = Coin(BigNumber(value).dividedBy(SAT_PER_COIN), decimals)
        fun fromSat(value: String, decimals: Int = DECIMALS): Coin = Coin(BigNumber(value).dividedBy(SAT_PER_COIN), decimals)
        fun fromCoin(value: Long, decimals: Int = DECIMALS): Coin = Coin(BigNumber(value), decimals)
        fun fromCoin(value: BigNumber, decimals: Int = DECIMALS): Coin = Coin(BigNumber(value), decimals)
        fun fromCoin(value: String, decimals: Int = DECIMALS): Coin = Coin(BigNumber(value), decimals)

        const val DECIMALS: Int = 8
        val SAT_PER_COIN: BigNumber = BigNumberValue.TEN.pow(DECIMALS)
    }

    fun toMillion(): String {
        return "${toBigNumber().dividedBy(BigNumber(1000000)).toFixed(2)}M"
    }

    fun toSat(): BigNumber {
        return value.multipliedBy(SAT_PER_COIN)
    }

    fun toStringSat(): String {
        return value.multipliedBy(SAT_PER_COIN).toString()
    }

    fun toPlainString(): String {
        return toBigNumber().toString()
    }

    fun toBigNumber(): BigNumber {
        return BigNumber(value.toPrecision(DECIMALS))
    }
}