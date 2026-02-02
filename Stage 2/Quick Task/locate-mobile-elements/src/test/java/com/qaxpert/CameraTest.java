package com.qaxpert;

import com.qaxpert.CameraPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.*;

import java.net.URL;

public class CameraTest {

    AndroidDriver driver;

    @Before
    public void setUp() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("emulator-5554")
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.android.camera2")
                .setAppActivity("com.android.camera.CameraActivity")
                .setNoReset(true);

        driver = new AndroidDriver(new URL("http://localhost:4723"), options);
    }

    @Test
    public void inspectCameraHome() {
        CameraPage page = new CameraPage(driver);
        page.takePhoto();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
