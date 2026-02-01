package com.qaxpert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Test;

import java.net.URL;

public class YoutubeTest {
    @Test
    public void openYoutubeApp(){
        try {
            URL appiumServer = new URL("http://localhost:4723");
            UiAutomator2Options nativeOptions = new UiAutomator2Options()
                    .setDeviceName("7HRSIJNJJNAYNR9X")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setAppPackage("com.google.android.youtube")
                    .setAppActivity("com.google.android.libraries.youtube.player.features.gl.vr.VrWelcomeActivity - YouTube")
                    .setNoReset(true);
            AppiumDriver nativeDriver = new AndroidDriver(appiumServer,nativeOptions);
            System.out.println("Native: Youtube app accessed successfully");
            nativeDriver.quit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
