package io.usoamic.web3kt.web3.contract

import io.usoamic.web3kt.web3.contract.other.ContractWrapper

external interface Contract<T : ContractWrapper> {
    val options: ContractOptions
    val methods: T
}
