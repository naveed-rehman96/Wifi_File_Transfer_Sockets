package com.navdroid.wifiTransfer

import android.app.Activity
import android.app.ProgressDialog
import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * @Author: Naveed Ur Rehman
 * @Designation : Android Developer
 */
open class BaseActivity : AppCompatActivity() {

    private var loadingDialog: ProgressDialog? = null

    protected fun showLoadingDialog(message: String = "", cancelable: Boolean = true) {
        loadingDialog?.dismiss()
        loadingDialog = ProgressDialog(this).apply {
            setMessage(message)
            setCancelable(cancelable)
            setCanceledOnTouchOutside(false)
            show()
        }
    }

    protected fun dismissLoadingDialog() {
        loadingDialog?.dismiss()
    }

    protected fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    protected fun <T : Activity> startActivity(clazz: Class<T>) {
        startActivity(Intent(this, clazz))
    }

}