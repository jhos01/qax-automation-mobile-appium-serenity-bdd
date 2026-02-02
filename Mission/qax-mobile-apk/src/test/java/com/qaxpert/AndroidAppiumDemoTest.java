package com.qaxpert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Test;

import java.net.URL;

public class AndroidAppiumDemoTest {
    @Test
    public void openAndroidAppiumDemoApp(){
        try {
            URL appiumServer = new URL("http://localhost:4723");
            UiAutomator2Options nativeOptions = new UiAutomator2Options()
                    .setDeviceName("emulator-5554")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setAppPackage("com.skill2lead.appiumdemo")
                    .setAppActivity("com.skill2lead.appiumdemo.MainActivity")
                    .setNoReset(true);
            AppiumDriver nativeDriver = new AndroidDriver(appiumServer,nativeOptions);
            System.out.println("Native: Android Appium Demo app accessed successfully");
            nativeDriver.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
