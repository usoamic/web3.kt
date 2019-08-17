package io.usoamic.web3kt.model

import io.usoamic.web3kt.bignumber.BigNumber

class Transaction private constructor(
    val from: String?,
    val nonce: BigNumber? /* BigInteger */,
    val gasPrice: BigNumber? /* BigInteger */,
    val gasLimit: BigNumber? /* BigInteger */,
    val to: String?,
    val value: BigNumber? /* BigInteger */,
    val data: String?
) {
    companion object {
        fun createEthCallTransaction(from: String, to: String, data: String) =
            Transaction(from, null, null, null, to, null, data)

        fun createTransaction(from: String?, nonce: BigNumber?, gasPrice: BigNumber?, gasLimit: BigNumber?, to: String?, value: BigNumber?, data: String?) =
            Transaction(from, nonce, gasPrice, gasLimit, to, value, data)
    }
}