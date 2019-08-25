package io.usoamic.web3kt.core

import io.usoamic.web3kt.bignumber.BigNumber
import io.usoamic.web3kt.tx.model.TransactionReceipt
import kotlin.js.Promise

external interface Eth {
    fun getBalance(address: String, defaultBlock: String, callback: (error: String?, balance: String?) -> Unit)
    fun getTransactionCount(address: String, defaultBlock: String, callback: (error: String?, balance: String?) -> Unit)
    fun getBlockNumber(callback: (error: String?, number: String?) -> Unit)
    fun estimateGas(`object`: Any, callback: (error: String?, gas: String?) -> Unit): String
    fun sendSignedTransaction(signedTransaction: String) : Promise<TransactionReceipt>
    fun getGasPrice(): Promise<BigNumber>
}