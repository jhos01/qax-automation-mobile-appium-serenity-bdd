package com.qaxpert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Test;

import java.net.URL;

public class GroceryDemoTest {
    @Test
    public void openGroceryDemoApp(){
        try {
            URL appiumServer = new URL("http://localhost:4723");
            UiAutomator2Options nativeOptions = new UiAutomator2Options()
                    .setDeviceName("emulator-5554")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setAppPackage("com.bwi.store.grocerydemo")
                    .setAppActivity("com.bwi.store.grocerydemo.MainActivity")
                    .setNoReset(true);
            AppiumDriver nativeDriver = new AndroidDriver(appiumServer,nativeOptions);
            System.out.println("Native: Grocery app accessed successfully");
            nativeDriver.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
