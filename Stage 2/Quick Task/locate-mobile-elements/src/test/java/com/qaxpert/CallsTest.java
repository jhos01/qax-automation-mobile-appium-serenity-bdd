package com.qaxpert;

import com.qaxpert.CallsPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.*;

import java.net.URL;

public class CallsTest {

    AndroidDriver driver;

    @Before
    public void setUp() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("emulator-5554")
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.android.dialer")
                .setAppActivity("com.android.dialer.main.impl.MainActivity")
                .setNoReset(true);

        driver = new AndroidDriver(new URL("http://localhost:4723"), options);
    }

    @Test
    public void inspectCallsHome() {
        CallsPage page = new CallsPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
