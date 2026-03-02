package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AboutPage extends BasePage{
    // ==================== LOCATORS ====================
    private final By appVersionText = By.id("com.saucelabs.mydemoapp.android:id/versionTV");

    public AboutPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================
    //no actions

    // ==================== ASSERTIONS ====================
    public String getAppVersionText() {
        return driver.findElement(appVersionText).getText();
    }

    public boolean isAppVersionVisible() {
        return driver.findElement(appVersionText).isDisplayed();
    }


}
