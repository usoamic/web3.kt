package io.usoamic.web3kt.web3.contract.model

import io.usoamic.web3kt.bignumber.BigNumber

data class ExecuteOption (
    val from: String,
    val value: BigNumber
)