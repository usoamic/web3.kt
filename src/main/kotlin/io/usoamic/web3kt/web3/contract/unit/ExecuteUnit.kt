package io.usoamic.web3kt.web3.contract.unit

import io.usoamic.web3kt.bignumber.BigNumber
import io.usoamic.web3kt.web3.contract.model.EstimateGasOption
import io.usoamic.web3kt.web3.contract.model.ExecuteOption
import kotlin.js.Promise

interface ExecuteUnit {
    @JsName("send")
    fun execute(executeOption: ExecuteOption, callback: (error: String?, result: BigNumber) -> Unit)
    @JsName("estimateGas")
    fun estimateGas(estimateGasOption: EstimateGasOption): Promise<String>
    @JsName("encodeABI")
    fun encodeABI(): String
}