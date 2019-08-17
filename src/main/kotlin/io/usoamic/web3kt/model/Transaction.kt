package io.usoamic.web3kt.model

class Transaction private constructor(
    from: String?,
    nonce: Int? /* BigInteger */,
    gasPrice: Int? /* BigInteger */,
    gasLimit: Int? /* BigInteger */,
    to: String?,
    value: Int? /* BigInteger */,
    data: String?
) {
    companion object {
        fun createEthCallTransaction(from: String, to: String, data: String) =
            Transaction(from, null, null, null, to, null, data)

        fun createTransaction(from: String?, nonce: Int?, gasPrice: Int?, gasLimit: Int?, to: String?, value: Int?, data: String?) =
            Transaction(from, nonce, gasPrice, gasLimit, to, value, data)
    }
}