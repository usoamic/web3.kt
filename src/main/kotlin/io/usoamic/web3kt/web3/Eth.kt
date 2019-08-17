package io.usoamic.web3kt.web3

external class Eth {
    fun getBalance(address: String, defaultBlock: String, callback: (error: String?, balance: String?) -> Unit)
    fun getTransactionCount(address: String, defaultBlock: String, callback: (error: String?, balance: String?) -> Unit)
    fun getBlockNumber(callback: (error: String?, number: String?) -> Unit)
    fun estimateGas(`object`: Any, callback: (error: String?, gas: String?) -> Unit): String
    fun sendSignedTransaction(sendSignedTransaction: String)
}