package io.usoamic.web3kt.web3

external class Utils {
    fun checkAddressChecksum(address: String): Boolean
    fun toChecksumAddress(address: String): String
    fun isAddress(address: String): Boolean
    fun fromWei(value: String, unit: String): Double
    fun toWei(number: String, unit: String): Double
}