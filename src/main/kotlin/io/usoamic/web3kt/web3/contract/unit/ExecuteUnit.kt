package io.usoamic.web3kt.web3.contract.unit

import io.usoamic.web3kt.bignumber.BigNumber
import io.usoamic.web3kt.web3.contract.model.EstimateGasOption
import io.usoamic.web3kt.web3.contract.model.ExecuteOption

interface ExecuteUnit {
    @JsName("send")
    fun execute(executeOption: ExecuteOption)
    @JsName("estimateGas")
    fun estimateGas(estimateGasOption: EstimateGasOption, callback: (error: String?, result: BigNumber) -> Unit)
}