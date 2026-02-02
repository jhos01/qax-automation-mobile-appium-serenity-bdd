package com.qaxpert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Test;
import java.net.URL;

public class MyCurrencyTest {
    @Test
    public void openMyCurrencyApp(){
        try {
            URL appiumServer = new URL("http://localhost:4723");
            UiAutomator2Options nativeOptions = new UiAutomator2Options()
                    .setDeviceName("emulator-5554")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setAppPackage("com.sharmadhiraj.mycurrencyexchange")
                    .setAppActivity("com.sharmadhiraj.mycurrencyexchange.ui.converter.ConverterActivity")
                    .setNoReset(true);
            AppiumDriver nativeDriver = new AndroidDriver(appiumServer,nativeOptions);
            System.out.println("Native: My Currency app accessed successfully");
            nativeDriver.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
