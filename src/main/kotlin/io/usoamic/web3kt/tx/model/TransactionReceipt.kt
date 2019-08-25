package io.usoamic.web3kt.tx.model

import io.usoamic.web3kt.bignumber.BigNumber

interface TransactionReceipt {
    val status: Boolean
    val transactionHash: String
    val transactionIndex: BigNumber
    val blockHash: String
    val blockNumber: BigNumber
    val contractAddress: String
    val cumulativeGasUsed: BigNumber
    val gasUsed: BigNumber
}