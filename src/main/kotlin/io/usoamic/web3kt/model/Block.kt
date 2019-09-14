package io.usoamic.web3kt.model

import io.usoamic.web3kt.bignumber.BigNumber

@Suppress("ArrayInDataClass")
data class Block (
    val number: BigNumber,
    val hash: String,
    val parentHash: String,
    val nonce: String,
    val sha3Uncles: String,
    val logsBloom: String,
    val transactionsRoot: String,
    val stateRoot: String,
    val miner: String,
    val difficulty: String,
    val totalDifficulty: String,
    val extraData: String,
    val size: BigNumber,
    val gasLimit: BigNumber,
    val gasUsed: BigNumber,
    val timestamp: BigNumber,
    val transactions: Array<String>,
    val uncles: Array<String>
)