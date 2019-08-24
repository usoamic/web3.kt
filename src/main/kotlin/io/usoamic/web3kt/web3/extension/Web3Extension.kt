package io.usoamic.web3kt.web3.extension

import io.usoamic.web3kt.web3.contract.Contract
import io.usoamic.web3kt.web3.Web3
import io.usoamic.web3kt.web3.contract.other.ContractWrapper
import kotlin.js.Json

inline fun func1() { }

inline fun <T : ContractWrapper>Web3.newContract(jsonInterface: Json, address: String): Contract<T> {
    val web3 = this
    return js("new web3.eth.Contract(jsonInterface, address)").unsafeCast<Contract<T>>()
}

inline fun <T : ContractWrapper>Web3.newContract(jsonInterface: String, address: String): Contract<T> {
    return newContract(JSON.parse<Json>(jsonInterface), address)
}