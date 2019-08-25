package io.usoamic.web3kt.web3.contract.response

import io.usoamic.web3kt.bignumber.BigNumber
import io.usoamic.web3kt.web3.contract.model.EstimateGasOption
import io.usoamic.web3kt.web3.contract.model.CallOption

interface CallResponse<T> {
    @JsName("call")
    fun call(callOption: CallOption, callback: (error: String?, result: T) -> Unit)
    @JsName("estimateGas")
    fun estimateGas(estimateGasOption: EstimateGasOption, callback: (error: String?, result: BigNumber) -> Unit)
}