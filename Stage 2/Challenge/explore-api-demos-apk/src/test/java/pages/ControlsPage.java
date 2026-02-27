package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ControlsPage extends BasePage {
    // ==================== LOCATORS ====================
    private final By lightThemeOption = By.xpath("//android.widget.TextView[@content-desc='1. Light Theme']");

    public ControlsPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================
    public ControlsPage goToLightTheme(){
        driver.findElement(lightThemeOption).click();
        return this;
    }


    // ==================== ASSERTIONS ====================
    public boolean lightThemeOptionVisible(){
        return driver.findElement(lightThemeOption).isDisplayed();
    }


}
