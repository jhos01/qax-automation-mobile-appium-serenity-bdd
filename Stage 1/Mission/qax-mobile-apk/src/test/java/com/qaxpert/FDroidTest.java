package com.qaxpert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Test;
import java.net.URL;

public class FDroidTest {
    @Test
    public void openFDroidApp(){
        try {
            URL appiumServer = new URL("http://localhost:4723");
            UiAutomator2Options nativeOptions = new UiAutomator2Options()
                    .setDeviceName("emulator-5554")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setAppPackage("org.fdroid.fdroid")
                    .setAppActivity("org.fdroid.fdroid.views.main.MainActivity")
                    .setNoReset(true);
            AppiumDriver nativeDriver = new AndroidDriver(appiumServer,nativeOptions);
            System.out.println("Native: FDroid app accessed successfully");
            nativeDriver.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
