package io.usoamic.web3kt

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
}