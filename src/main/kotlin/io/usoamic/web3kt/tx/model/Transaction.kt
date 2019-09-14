package io.usoamic.web3kt.tx.model

import io.usoamic.web3kt.bignumber.BigNumber

data class TransactionData(
    val hash: String,
    val nonce: BigNumber,
    val blockHash: String,
    val transactionIndex: Long,
    val from: String,
    val to: String,
    val value: String,
    val gasPrice: String,
    val gas: BigNumber,
    val input: String
)