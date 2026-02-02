package com.qaxpert;

import com.qaxpert.CalendarPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.*;

import java.net.URL;

public class CalendarTest {

    AndroidDriver driver;

    @Before
    public void setUp() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("emulator-5554")
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.google.android.calendar")
                .setAppActivity("com.google.android.calendar.AllInOneActivity")
                .setNoReset(true);

        driver = new AndroidDriver(new URL("http://localhost:4723"), options);
    }

    @Test
    public void inspectCalendarHome() {
        CalendarPage page = new CalendarPage(driver);
        page.clickCreateEvent();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
