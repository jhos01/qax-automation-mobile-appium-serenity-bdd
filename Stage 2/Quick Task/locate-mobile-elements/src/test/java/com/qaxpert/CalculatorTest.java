package com.qaxpert;

import com.qaxpert.CalculatorPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.*;

import java.net.URL;

public class CalculatorTest {

    AndroidDriver driver;

    @Before
    public void setUp() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("emulator-5554")
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.android.calculator2")
                .setAppActivity("com.android.calculator2.Calculator")
                .setNoReset(true);

        driver = new AndroidDriver(new URL("http://localhost:4723"), options);
    }

    @Test
    public void inspectCalculatorHome() {
        CalculatorPage page = new CalculatorPage(driver);
        page.pressOne();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
