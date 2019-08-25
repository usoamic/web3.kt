package io.usoamic.web3kt.core

@JsModule("web3")
external class Web3(provider: String) {
    val utils: Utils = definedExternally
    val eth: Eth = definedExternally

    companion object {
        var utils: Utils = definedExternally
    }
}