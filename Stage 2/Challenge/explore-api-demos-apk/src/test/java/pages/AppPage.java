package pages;

import io.appium.java_client.android.AndroidDriver;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;

public class AppPage extends BasePage {
    // ==================== LOCATORS ====================
    private final By actionBarOption = By.xpath("//android.widget.TextView[@content-desc='Activity']");
    private final By activityOption = By.xpath("//android.widget.TextView[@text='Activity']");
    private final By alarmOption = By.xpath("//android.widget.TextView[@content-desc='Alarm']");
    private final By alertDialogsOption = By.xpath("//android.widget.TextView[@content-desc='Alert Dialogs']");
    private final By deviceAdminOption = By.xpath("//android.widget.TextView[@content-desc='Device Admin']");
    private final By fragmentOption = By.xpath("//android.widget.TextView[@content-desc='Fragment']");

    public AppPage(AndroidDriver driver) {
        super(driver);
    }
    // ==================== ACTIONS ====================
    public AppPage goToActionBar(){
        driver.findElement(actionBarOption).click();
        return this;
    }
    public AppPage goToActivity(){
        driver.findElement(activityOption).click();
        return this;
    }
    public AppPage goToAlarm(){
        driver.findElement(alarmOption).click();
        return this;
    }
    public AppPage goToAlertDialogs(){
        driver.findElement(alertDialogsOption).click();
        return this;
    }
    public AppPage goToDeviceAdmin(){
        driver.findElement(deviceAdminOption).click();
        return this;
    }
    public AppPage goToFragment(){
        driver.findElement(fragmentOption).click();
        return this;
    }
    // ==================== ASSERTIONS ===================
    public boolean isActivityVisible() {
        return driver.findElement(activityOption).isDisplayed();
    }
    public boolean isActionBarOptionVisible() {
        return driver.findElement(actionBarOption).isDisplayed();
    }
    public boolean isAlarmOptionVisible() {
        return driver.findElement(alarmOption).isDisplayed();
    }
    public boolean isAlertDialogsOptionVisible() {
        return driver.findElement(alertDialogsOption).isDisplayed();
    }
    public boolean isDeviceAdminOption() {
        return driver.findElement(deviceAdminOption).isDisplayed();
    }
    public boolean isFragmentOptionVisible() {
        return driver.findElement(fragmentOption).isDisplayed();
    }
}