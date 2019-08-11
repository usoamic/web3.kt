package io.usoamic.webwallet

import js.externals.jquery.jQuery

fun setResult(str: String) {
    jQuery("#result").text(str)
}

fun main() {
    setResult("ALFA")
}