package com.navdroid.wifiTransfer // ktlint-disable package-name

import android.util.Log

object Logger {

    fun log(any: Any?) {
        Log.e("WifiP2P", any?.toString() ?: "null")
    }
}
