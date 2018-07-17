package com.nativecall.alert

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.JavaScriptModule
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import java.util.*
import java.util.Collections.emptyList

class TestFunPackage : ReactPackage {

    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
        val modules = ArrayList<NativeModule>()

        modules.add(TestFunModule(reactContext))

        return modules
    }


    fun createJSModules(): List<Class<out JavaScriptModule>> {
        return emptyList<Class<out JavaScriptModule>>()
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
        return emptyList<ViewManager<*, *>>()
    }
}
