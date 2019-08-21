package io.usoamic.web3kt.web3.contract.unit

import io.usoamic.web3kt.web3.contract.model.Request

interface ExecuteUnit {
    @JsName("send")
    fun execute(request: Request)
}