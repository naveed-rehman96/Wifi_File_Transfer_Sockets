package com.navdroid.wifiTransfer.utils

import android.net.wifi.p2p.WifiP2pDevice

/**
 * @Author: Naveed Ur Rehman
 * @Designation : Android Developer
 */
object WifiP2pUtils {

    fun getDeviceStatus(deviceStatus: Int): String {
        return when (deviceStatus) {
            WifiP2pDevice.AVAILABLE -> "AVAILABLE"
            WifiP2pDevice.INVITED -> "INVITED"
            WifiP2pDevice.CONNECTED -> "CONNECTED"
            WifiP2pDevice.FAILED -> "FAILED"
            WifiP2pDevice.UNAVAILABLE -> "UNAVAILABLE"
            else -> "unknown"
        }
    }

}