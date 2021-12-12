package io.usoamic.web3kt.core

import io.usoamic.web3kt.bignumber.BigNumber
import io.usoamic.web3kt.core.contract.model.EstimateGasOption
import io.usoamic.web3kt.model.Block
import io.usoamic.web3kt.tx.model.Transaction
import io.usoamic.web3kt.tx.model.TransactionReceipt
import kotlin.js.Promise

external interface Eth {
    fun getBalance(address: String, defaultBlock: String): Promise<BigNumber>
    fun getTransactionCount(address: String, defaultBlock: String): Promise<BigNumber>
    fun getBlockNumber(): Promise<BigNumber>
    fun estimateGas(estimateGasOption: EstimateGasOption): Promise<BigNumber>
    fun sendSignedTransaction(signedTransaction: String) : Promise<TransactionReceipt>
    fun getGasPrice(): Promise<BigNumber>
    fun getTransaction(transactionHash: String): Promise<Transaction>
    fun getTransactionReceipt(transactionHash: String): Promise<TransactionReceipt>
    fun getBlock(blockHashOrBlockNumber: String): Promise<Block>
}