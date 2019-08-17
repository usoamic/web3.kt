package io.usoamic.web3kt.web3

import io.usoamic.web3kt.BigNumber

external class Utils {
    fun checkAddressChecksum(address: String): Boolean
    fun toChecksumAddress(address: String): String
    fun isAddress(address: String): Boolean
    fun fromWei(value: String, unit: String): String
    fun fromWei(value: BigNumber, unit: String): String
    fun fromWei(value: Int, unit: String): String
    fun fromWei(value: Long, unit: String): String
    fun toWei(number: String, unit: String): String
    fun toWei(number: BigNumber, unit: String): String
    fun toWei(number: Int, unit: String): String
    fun toWei(number: Long, unit: String): String
}