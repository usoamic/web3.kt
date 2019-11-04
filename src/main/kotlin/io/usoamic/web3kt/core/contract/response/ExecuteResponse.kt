package io.usoamic.web3kt.core.contract.response

import io.usoamic.web3kt.bignumber.BigNumber
import io.usoamic.web3kt.core.contract.model.EstimateGasOption
import kotlin.js.Promise

interface ExecuteResponse {
    @JsName("estimateGas")
    fun estimateGas(estimateGasOption: EstimateGasOption): Promise<BigNumber>
    @JsName("encodeABI")
    fun encodeABI(): String
}