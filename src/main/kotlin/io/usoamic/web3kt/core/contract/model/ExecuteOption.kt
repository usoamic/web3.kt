package io.usoamic.web3kt.core.contract.model

import io.usoamic.web3kt.bignumber.BigNumber

data class ExecuteOption (
    val from: String,
    val value: BigNumber
)