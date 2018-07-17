package com.nativecall.custom;

import android.content.Context;
import android.widget.Toast;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;

public class CustomFunModule extends ReactContextBaseJavaModule {

    Context mContext;

    public CustomFunModule(ReactApplicationContext context) {

        super(context);
        mContext = context;
    }

    @Override
    public String getName() {
        return "CustomModule";
    }

    @ReactMethod
    public void getModuleList(final Callback callback) {
        try {

            WritableArray list = getList();
            callback.invoke(null, list);

        } catch (Exception e) {
            callback.invoke("Error", null);
        }
    }


    private WritableArray getList() {

        WritableArray listArr = Arguments.createArray();
        listArr.pushString("react-native-fbsdk");
        listArr.pushString("react-native-camera");
        listArr.pushString("react-native-map");

        return listArr;
    }


    @ReactMethod
    public void toastMessage(Callback callback) {
        Toast.makeText(mContext, "Testing", Toast.LENGTH_SHORT).show();
        callback.invoke(null, getName());
    }

    @ReactMethod
    public void alert(String message) {
        Toast.makeText(mContext, message, Toast.LENGTH_LONG).show();
    }}
