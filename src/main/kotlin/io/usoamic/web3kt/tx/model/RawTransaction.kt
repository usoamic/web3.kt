package io.usoamic.web3kt.tx.model

import io.usoamic.web3kt.bignumber.BigNumber
import io.usoamic.web3kt.bignumber.extension.toBuffer
import io.usoamic.web3kt.buffer.Buffer
import io.usoamic.web3kt.tx.gas.DefaultGasProvider.Companion.GAS_PRICE

class RawTransaction private constructor(
    val from: String,
    val nonce: Buffer?,
    val gasPrice: Buffer?,
    val gasLimit: Buffer?,
    val to: String,
    val value: Buffer?,
    val data: String
) {
    companion object {
        fun createEthCallTransaction(from: String, to: String, data: String) =
            createTransaction(from, null, null, null, to, BigNumber(0), data)

        fun createEtherTransaction(from: String, nonce: BigNumber, gasLimit: BigNumber, to: String, value: BigNumber) =
            createTransaction(from, nonce, GAS_PRICE, gasLimit, to, value, "0x")

        fun createContractTransaction(from: String, nonce: BigNumber, gasLimit: BigNumber, to: String, data: String) =
            createTransaction(from, nonce, GAS_PRICE, gasLimit, to, BigNumber(0), data)

        fun createTransaction(from: String, nonce: BigNumber?, gasPrice: BigNumber?, gasLimit: BigNumber?, to: String, value: BigNumber, data: String) =
            RawTransaction(from, nonce?.toBuffer(), gasPrice?.toBuffer(), gasLimit?.toBuffer(), to, value.toBuffer(), data)
    }
}