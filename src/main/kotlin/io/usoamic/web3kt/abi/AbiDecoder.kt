package io.usoamic.web3kt.abi

import io.usoamic.web3kt.abi.model.DecoderResult

@JsModule("abi-decoder")
external class AbiDecoder {
    companion object {
        fun addABI(abi: String)
        fun decodeMethod(data: String): JSON
        fun decodeLogs(logs: List<Any>): Array<DecoderResult>
    }
}