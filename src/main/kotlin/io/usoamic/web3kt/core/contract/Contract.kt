package io.usoamic.web3kt.core.contract

import io.usoamic.web3kt.core.contract.other.ContractWrapper

external interface Contract<T : ContractWrapper> {
    val options: ContractOptions
    val methods: T
}
