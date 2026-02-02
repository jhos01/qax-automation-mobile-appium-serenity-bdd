package com.qaxpert;

import com.qaxpert.YoutubePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.*;

import java.net.URL;

public class YoutubeTest {

    AndroidDriver driver;

    @Before
    public void setUp() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("emulator-5554")
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.google.android.youtube")
                .setAppActivity("com.google.android.youtube.HomeActivity")
                .setNoReset(true);

        driver = new AndroidDriver(new URL("http://localhost:4723"), options);
    }

    @Test
    public void inspectYoutubeHome() {
        YoutubePage page = new YoutubePage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
