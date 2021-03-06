package io.usoamic.web3kt.util

import io.usoamic.web3kt.buffer.Buffer
import io.usoamic.web3kt.buffer.extension.fromHex
import io.usoamic.web3kt.core.Web3
import io.usoamic.web3kt.util.module.EthUtils

class EthereumUtils {
    companion object {
        fun isValidPrivateKey(privateKey: String): Boolean {
            return EthUtils.isValidPrivateKey(Buffer.fromHex(privateKey))
        }

        fun isValidPrivateKey(privateKey: Buffer): Boolean {
            return EthUtils.isValidPrivateKey(privateKey)
        }

        fun isValidAddress(address: String): Boolean {
            return Web3.utils.isAddress(address)
        }
    }
}