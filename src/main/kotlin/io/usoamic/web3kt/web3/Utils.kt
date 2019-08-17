package io.usoamic.web3kt.web3

import io.usoamic.web3kt.BigNumber

external class Utils {
    fun checkAddressChecksum(address: String): Boolean
    fun toChecksumAddress(address: String): String
    fun isAddress(address: String): Boolean
    fun fromWei(value: String, unit: String): BigNumber
    fun toWei(number: String, unit: String): BigNumber
}