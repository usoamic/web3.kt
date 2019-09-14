package io.usoamic.web3kt.abi.model

data class Event(
    val name: String,
    val type: String,
    val value: Any
)