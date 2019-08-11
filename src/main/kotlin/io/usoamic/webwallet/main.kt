package io.usoamic.webwallet

import js.externals.jquery.jQuery

fun setResult(str: String) {
    require("toastr")
    jQuery("#result").text(str)
}

@JsModule("toastr")
external class toastr {

}

fun main() {
    setResult("ALFA")
}