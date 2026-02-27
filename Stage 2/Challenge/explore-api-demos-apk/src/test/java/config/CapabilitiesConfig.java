package config;

import io.appium.java_client.android.options.UiAutomator2Options;
import java.io.File;
import java.time.Duration;

public class CapabilitiesConfig {

    public static UiAutomator2Options getAndroidCapabilities() {
        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setPlatformVersion("16");
        options.setDeviceName("emulator-5554");

        String appPath = "C:/Users/jhosy/Downloads/ApiDemos-debug.apk";
        options.setApp(appPath);

        options.setAutomationName("UiAutomator2");
        options.setAppPackage("io.appium.android.apis");
        options.setAppActivity("io.appium.android.apis.ApiDemos");
        options.setNoReset(false);
        options.setFullReset(false);
        options.setNewCommandTimeout(Duration.ofSeconds(300));

        return options;
    }
}