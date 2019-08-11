package io.usoamic.web3kt

@JsModule("web3")
external class Web3(provider: String) {
    var utils: Utils = definedExternally

    companion object {
        var utils: Utils = definedExternally
    }
}

external class Utils {
    fun fromWei(value: String, unit: String): Double
}