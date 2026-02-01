package com.qaxpert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Test;

import java.net.URL;

public class CallsTest {
    @Test
    public void openCallsApp(){
        try {
            URL appiumServer = new URL("http://localhost:4723");
            UiAutomator2Options nativeOptions = new UiAutomator2Options()
                    .setDeviceName("7HRSIJNJJNAYNR9X")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setAppPackage("com.coloros.server.telecom")
                    .setAppActivity("com.android.server.flashlight.breathlight.ui.BreathLightContactSettingActivity - Blink for")
                    .setNoReset(true);
            AppiumDriver nativeDriver = new AndroidDriver(appiumServer,nativeOptions);
            System.out.println("Native: Calls app accessed successfully");
            nativeDriver.quit();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
