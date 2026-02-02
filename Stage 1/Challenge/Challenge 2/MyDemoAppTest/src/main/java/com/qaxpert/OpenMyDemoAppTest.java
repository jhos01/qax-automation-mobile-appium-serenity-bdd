package com.qaxpert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.URL;
public class OpenMyDemoAppTest {
    public static void main(String[] args) {
        try {
            URL appiumServer = new URL("http://localhost:4723");

            //Emulador Android
            UiAutomator2Options emulatorOptions = new UiAutomator2Options()
                    .setDeviceName("emulator-5554")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setAppPackage("com.saucelabs.mydemoapp.android")
                    .setAppActivity("com.saucelabs.mydemoapp.android.view.activities.SplashActivity")
                    .setNoReset(true);

            AppiumDriver emulatorDriver = new AndroidDriver(appiumServer,emulatorOptions);
            System.out.println("Emulador: My demo App Success");

            //Real Device Android
            UiAutomator2Options realDeviceOptions = new UiAutomator2Options()
                    .setDeviceName("7HRSIJNJJNAYNR9X")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setAppPackage("com.saucelabs.mydemoapp.android")
                    .setAppActivity("com.saucelabs.mydemoapp.android.view.activities.SplashActivity")
                    .setNoReset(true);

            AppiumDriver realDeviceDriver = new AndroidDriver(appiumServer,realDeviceOptions);
            System.out.println("Real device: My demo App Success");

            //Cerrar sesiones
            emulatorDriver.close();
            realDeviceDriver.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
