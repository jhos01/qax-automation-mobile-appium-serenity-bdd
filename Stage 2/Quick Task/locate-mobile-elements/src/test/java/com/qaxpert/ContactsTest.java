package com.qaxpert;

import com.qaxpert.ContactsPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.*;

import java.net.URL;

public class ContactsTest {

    AndroidDriver driver;

    @Before
    public void setUp() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("emulator-5554")
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.android.contacts")
                .setAppActivity("com.android.contacts.activities.PeopleActivity")
                .setNoReset(true);

        driver = new AndroidDriver(new URL("http://localhost:4723"), options);
    }

    @Test
    public void inspectContactsHome() {
        ContactsPage page = new ContactsPage(driver);
        page.clickAddContact();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
