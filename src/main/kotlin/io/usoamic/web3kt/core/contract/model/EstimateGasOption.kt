package io.usoamic.web3kt.core.contract.model

import io.usoamic.web3kt.bignumber.BigNumber

sealed class EstimateGasOption{
    data class Contract (
        val from: String,
        val to: String,
        val data: String
    ) : EstimateGasOption()

    data class Ether (
        val from: String,
        val to: String,
        val value: BigNumber
    ) : EstimateGasOption()
}
