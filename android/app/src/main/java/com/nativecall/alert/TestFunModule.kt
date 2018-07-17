package com.nativecall.alert

import android.widget.Toast
import com.facebook.react.bridge.*

class TestFunModule(val context: ReactApplicationContext) : ReactContextBaseJavaModule(context) {

    override fun getName(): String {
        return "TestFunModule"
    }

    @ReactMethod
    fun alert(message: String) {
        Toast.makeText(context, "$message-TestFunModule", Toast.LENGTH_LONG).show()
    }
}
