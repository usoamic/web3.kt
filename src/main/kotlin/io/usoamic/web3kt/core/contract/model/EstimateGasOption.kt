package io.usoamic.web3kt.core.contract.model

import io.usoamic.web3kt.bignumber.BigNumber
import io.usoamic.web3kt.bignumber.BigNumberValue

data class EstimateGasOption (
    val from: String,
    val to: String,
    val value: BigNumber = BigNumberValue.ZERO,
    val data: String = ""
)