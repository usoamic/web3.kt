package io.usoamic.web3kt.tx.model

import io.usoamic.web3kt.bignumber.BigNumber
import io.usoamic.web3kt.bignumber.BigNumberValue
import io.usoamic.web3kt.bignumber.extension.toBuffer
import io.usoamic.web3kt.buffer.extension.toHex
import io.usoamic.web3kt.tx.gas.DefaultGasProvider.Companion.DEFAULT_GAS_PRICE

class RawTransaction private constructor(
    val from: String,
    val nonce: String?,
    val gasPrice: String?,
    val gasLimit: String?,
    val to: String,
    val value: BigNumber?,
    val data: String
) {
    companion object {
        fun createEthCallTransaction(from: String, to: String, data: String) =
            createTransaction(from, null, null, null, to, BigNumberValue.ZERO, data)

        fun createEtherTransaction(from: String, nonce: BigNumber, gasLimit: BigNumber, to: String, value: BigNumber) =
            createTransaction(from, nonce, DEFAULT_GAS_PRICE, gasLimit, to, value, "0x")

        fun createEtherTransaction(from: String, nonce: BigNumber, gasPrice: BigNumber, gasLimit: BigNumber, to: String, value: BigNumber) =
            createTransaction(from, nonce, gasPrice, gasLimit, to, value, "0x")

        fun createContractTransaction(from: String, nonce: BigNumber, gasLimit: BigNumber, to: String, data: String) =
            createTransaction(from, nonce, DEFAULT_GAS_PRICE, gasLimit, to, BigNumberValue.ZERO, data)

        fun createContractTransaction(from: String, nonce: BigNumber, gasPrice: BigNumber, gasLimit: BigNumber, to: String, data: String) =
            createTransaction(from, nonce, gasPrice, gasLimit, to, BigNumberValue.ZERO, data)

        fun createTransaction(from: String, nonce: BigNumber?, gasPrice: BigNumber?, gasLimit: BigNumber?, to: String, value: BigNumber, data: String) =
            RawTransaction(from, nonce?.toBuffer()?.toHex(), gasPrice?.toBuffer()?.toHex(), gasLimit?.toBuffer()?.toHex(), to, value.toNumber(), data)
    }
}