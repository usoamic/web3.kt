package io.usoamic.web3kt.abi.model

@Suppress("ArrayInDataClass")
data class DecoderResult(
    val name: String,
    val address: String,
    val events: Array<Event>
)
