package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class PreferencePage extends BasePage {
    // ==================== LOCATORS ====================
    private final By preferencesFromXMLOption = By.xpath("//android.widget.TextView[@content-desc='1. Preferences from XML']");
    private final By launchingPreferencesOption = By.xpath("//android.widget.TextView[@content-desc='2. Launching preferences']");
    private final By preferenceDependenciesOption = By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']");


    public PreferencePage(AndroidDriver driver) {
        super(driver);
    }
    // ==================== ACTIONS ====================
    public PreferencePage goToPreferencesFromXML(){
        driver.findElement(preferencesFromXMLOption).click();
        return this;
    }
    public PreferencePage goToLaunchingPreferences(){
        driver.findElement(launchingPreferencesOption).click();
        return this;
    }
    public PreferencePage goToPreferenceDependencies(){
        driver.findElement(preferenceDependenciesOption).click();
        return this;
    }
    // ==================== ASSERTIONS ===================
    public boolean preferencesFromXMLOptionVisible(){
        return driver.findElement(preferencesFromXMLOption).isDisplayed();
    }
    public boolean launchingPreferencesOptionVisible(){
        return driver.findElement(launchingPreferencesOption).isDisplayed();
    }
    public boolean preferenceDependenciesOptionVisible(){
        return driver.findElement(preferenceDependenciesOption).isDisplayed();
    }
}
