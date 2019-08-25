package io.usoamic.web3kt.core.contract.response

import io.usoamic.web3kt.bignumber.BigNumber
import io.usoamic.web3kt.core.contract.model.EstimateGasOption
import io.usoamic.web3kt.core.contract.model.CallOption
import kotlin.js.Promise

interface CallResponse<T> {
    @JsName("call")
    fun call(callOption: CallOption): Promise<T>
    @JsName("estimateGas")
    fun estimateGas(estimateGasOption: EstimateGasOption): Promise<BigNumber>
}