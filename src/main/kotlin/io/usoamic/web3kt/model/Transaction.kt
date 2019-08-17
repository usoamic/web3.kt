package io.usoamic.web3kt.model

class Transaction private constructor(
    val from: String?,
    val nonce: Int? /* BigInteger */,
    val gasPrice: Int? /* BigInteger */,
    val gasLimit: Int? /* BigInteger */,
    val to: String?,
    val value: Int? /* BigInteger */,
    val data: String?
) {
    companion object {
        fun createEthCallTransaction(from: String, to: String, data: String) =
            Transaction(from, null, null, null, to, null, data)

        fun createTransaction(from: String?, nonce: Int?, gasPrice: Int?, gasLimit: Int?, to: String?, value: Int?, data: String?) =
            Transaction(from, nonce, gasPrice, gasLimit, to, value, data)
    }
}