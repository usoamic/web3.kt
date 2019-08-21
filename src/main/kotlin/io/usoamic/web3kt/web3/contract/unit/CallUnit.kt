package io.usoamic.web3kt.web3.contract.unit

import io.usoamic.web3kt.web3.contract.model.Request

interface CallUnit<T> {
    @JsName("call")
    fun call(request: Request, callback: (error: String, result: T) -> Unit)
}