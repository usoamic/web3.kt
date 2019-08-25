package io.usoamic.web3kt.web3.contract.model

import io.usoamic.web3kt.bignumber.BigNumber
import io.usoamic.web3kt.bignumber.BigNumberValue

data class EstimateGasOption (
    val from: String,
    val to: String,
    val value: BigNumber = BigNumberValue.ZERO,
    val data: String = ""
)