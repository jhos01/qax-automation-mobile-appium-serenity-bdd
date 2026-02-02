package com.qaxpert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Test;
import java.net.URL;

public class CalendarTest {
    @Test
    public void openCalendarApp(){
        try {
            URL appiumServer = new URL("http://localhost:4723");
            UiAutomator2Options nativeOptions = new UiAutomator2Options()
                    .setDeviceName("7HRSIJNJJNAYNR9X")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setAppPackage("com.google.android.calendar")
                    .setAppActivity("com.google.android.calendar.allinone.AllInOneCalendarActivity - Calendar")
                    .setNoReset(true);
            AppiumDriver nativeDriver = new AndroidDriver(appiumServer,nativeOptions);
            System.out.println("Native: Calendar app accessed successfully");
            nativeDriver.quit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
