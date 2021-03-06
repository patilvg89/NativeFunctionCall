package com.nativecall;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.nativecall.custom.CustomFunPackage;
import com.nativecall.alert.TestFunPackage;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "nativecall";
    }

    protected List<ReactPackage> getPackages() {
        return Arrays.asList(
                new MainReactPackage(),
                new TestFunPackage(),
                new CustomFunPackage());
    }
}
