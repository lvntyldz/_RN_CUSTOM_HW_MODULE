package com.custom;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by leventyildiz on 19/03/2017.
 */
public class CustomModule extends ReactContextBaseJavaModule {


    public CustomModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "CustomModule";
    }



    @ReactMethod
    public void sum(int a, int b, Callback callback){
        callback.invoke("result ("+a+"+"+b+") : "+(a+b));
    }



}
