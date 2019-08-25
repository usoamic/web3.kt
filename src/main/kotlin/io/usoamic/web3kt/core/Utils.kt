package io.usoamic.web3kt.core

import io.usoamic.web3kt.bignumber.BigNumber
import io.usoamic.web3kt.buffer.Buffer

external interface Utils {
    fun checkAddressChecksum(address: String): Boolean
    fun toChecksumAddress(address: String): String
    fun isAddress(address: String): Boolean
    fun fromWei(value: String, unit: String): String
    fun fromWei(value: BigNumber, unit: String): String
    fun fromWei(value: Int, unit: String): String
    fun fromWei(value: Long, unit: String): String
    fun toWei(value: String, unit: String): String
    fun toWei(value: BigNumber, unit: String): String
    fun toWei(value: Int, unit: String): String
    fun toWei(value: Long, unit: String): String
    fun toHex(value: BigNumber): Buffer
    fun toHex(value: String): Buffer
}