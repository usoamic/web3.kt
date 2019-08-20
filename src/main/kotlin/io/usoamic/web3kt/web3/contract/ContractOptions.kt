package io.usoamic.web3kt.web3.contract

external interface ContractOptions {
    val address: String
    val jsonInterface: String
    val data: String
    val from: String
    val gasPrice: String
    val gas: Number
}