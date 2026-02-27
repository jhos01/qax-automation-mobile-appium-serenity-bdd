package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class NfcPage extends BasePage{
    // ==================== LOCATORS ====================
    private final By foregroundDispatchOption = By.xpath("//android.widget.TextView[@content-desc='ForegroundDispatch']");
    private final By foregroundNdefPushOption = By.xpath("//android.widget.TextView[@content-desc='ForegroundNdefPush']");
    private final By techFilterOption = By.xpath("//android.widget.TextView[@content-desc='TechFilter']");


    public NfcPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public NfcPage goToForegroundDispatch (){
        driver.findElement(foregroundDispatchOption).click();
        return this;
    }
    public NfcPage goToForegroundNdefPush (){
        driver.findElement(foregroundNdefPushOption).click();
        return this;
    }
    public NfcPage goToTechFilter (){
        driver.findElement(techFilterOption).click();
        return this;
    }

    // ==================== ASSERTIONS ===================
    public boolean isForegroundDispatchOptionVisible(){
        return driver.findElement(foregroundDispatchOption).isDisplayed();
    }
    public boolean isForegroundNdefPushOptionVisible(){
        return driver.findElement(foregroundNdefPushOption).isDisplayed();
    }
    public boolean isTechFilterOptionVisible(){
        return driver.findElement(techFilterOption).isDisplayed();
    }
}
