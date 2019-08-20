package io.usoamic.web3kt.web3.extension

import io.usoamic.web3kt.web3.contract.Contract
import io.usoamic.web3kt.web3.Web3
import kotlin.js.Json

inline fun Web3.newContract(jsonInterface: Json, address: String): Contract {
    val web3 = this
    return js("new web3.eth.Contract(jsonInterface, address)").unsafeCast<Contract>()
}

inline fun Web3.newContract(jsonInterface: String, address: String): Contract {
    return newContract(JSON.parse<Json>(jsonInterface), address)
}