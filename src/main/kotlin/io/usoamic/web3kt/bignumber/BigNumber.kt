package io.usoamic.web3kt.bignumber

@JsModule("bignumber.js")
external class BigNumber(value: String) {
    constructor(value: Int)
    constructor(value: Double)
    constructor(value: Long)

    fun isEqualTo(value: BigNumber): Boolean
    fun plus(value: BigNumber)
    fun minus(value: BigNumber)
    fun toFixed(dp: Int): BigNumber
    fun dividedBy(value: BigNumber): BigNumber
    fun times(value: BigNumber): BigNumber
    fun toNumber(): BigNumber
    fun toFormat(dp: Int): BigNumber

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

