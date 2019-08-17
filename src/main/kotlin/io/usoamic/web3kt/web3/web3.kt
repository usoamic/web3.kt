package io.usoamic.web3kt.web3

@JsModule("web3")
external class Web3(provider: String) {
    var utils: Utils = definedExternally
    var eth: Eth = definedExternally

    companion object {
        var utils: Utils = definedExternally
    }
}