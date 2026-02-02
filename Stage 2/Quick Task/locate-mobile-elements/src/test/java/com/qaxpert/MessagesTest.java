package com.qaxpert;

import com.qaxpert.MessagesPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.*;

import java.net.URL;

public class MessagesTest {

    AndroidDriver driver;

    @Before
    public void setUp() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("emulator-5554")
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.android.messaging")
                .setAppActivity("com.android.messaging.ui.ConversationListActivity")
                .setNoReset(true);

        driver = new AndroidDriver(new URL("http://localhost:4723"), options);
    }

    @Test
    public void inspectMessagesHome() {
        MessagesPage page = new MessagesPage(driver);
        page.clickNewMessage();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
