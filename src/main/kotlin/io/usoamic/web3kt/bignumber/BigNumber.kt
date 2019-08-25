package io.usoamic.web3kt.bignumber

import io.usoamic.web3kt.buffer.Buffer

@JsModule("bignumber.js")
external class BigNumber(value: String) {
    constructor(value: Int)
    constructor(value: Double)
    constructor(value: Long)
    constructor(value: BigNumber)

    fun isEqualTo(value: BigNumber): Boolean
    fun isGreaterThan(value: BigNumber): Boolean
    fun isLessThan(value: BigNumber): Boolean
    fun isLessThanOrEqualTo(value: BigNumber): Boolean
    fun isGreaterThanOrEqualTo(value: BigNumber): Boolean
    fun isZero(value: BigNumber): Boolean
    fun plus(value: BigNumber): BigNumber
    fun minus(value: BigNumber): BigNumber
    fun toFixed(dp: Int): BigNumber
    fun dividedBy(value: BigNumber): BigNumber
    @JsName("multipliedBy")
    fun multipliedBy(value: BigNumber): BigNumber
    fun toNumber(): BigNumber
    fun toFormat(dp: Int): BigNumber
    fun pow(n: Int): BigNumber

    companion object {
        val ROUND_UP: Int
        val ROUND_DOWN: Int
        val ROUND_CEIL: Int
        val ROUND_FLOOR: Int
        val ROUND_HALF_UP: Int
        val ROUND_HALF_DOWN: Int
        val ROUND_HALF_EVEN: Int
        val ROUND_HALF_CEIL: Int
        val ROUND_HALF_FLOOR: Int
        val EUCLID: Int

        fun config(arg: BNConfig)
    }
}

