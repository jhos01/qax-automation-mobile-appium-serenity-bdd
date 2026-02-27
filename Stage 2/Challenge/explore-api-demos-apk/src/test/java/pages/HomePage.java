package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import javax.swing.plaf.PanelUI;

public class HomePage extends BasePage {


    // ==================== LOCATORS ====================
    private final By accessibilityOption = AppiumBy.accessibilityId("Accessibility");
    private final By animationOption = AppiumBy.accessibilityId("Animation");
    private final By appOption = AppiumBy.xpath("//android.widget.TextView[@text='App']");
    private final By contentOption = AppiumBy.xpath("//android.widget.TextView[@text='Content']");
    private final By graphicsOption = AppiumBy.accessibilityId("Graphics");
    private final By mediaOption = AppiumBy.accessibilityId("Media");
    private final By nfcOption = AppiumBy.accessibilityId("NFC");
    private final By osOption = AppiumBy.accessibilityId("OS");
    private final By preferenceOption = AppiumBy.accessibilityId("Preference");
    private final By textOption = AppiumBy.accessibilityId("Text");
    private final By viewsOption = AppiumBy.accessibilityId("Views");

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public HomePage goToAccessibility() {
        driver.findElement(accessibilityOption).click();
        return this;
    }

    public HomePage goToApp() {
        driver.findElement(appOption).click();
        return this;
    }


    public HomePage goToAnimation() {
        driver.findElement(animationOption).click();
        return this;
    }

    public HomePage goToContent() {
        driver.findElement(contentOption).click();
        return this;
    }
    public HomePage goToGraphics(){
        driver.findElement(graphicsOption).click();
        return this;
    }
    public HomePage goToMedia(){
        driver.findElement(mediaOption).click();
        return this;
    }
    public HomePage goToNfc(){
        driver.findElement(nfcOption).click();
        return this;
    }
    public HomePage goToOs(){
        driver.findElement(osOption).click();
        return this;
    }
    public HomePage goToPreference(){
        driver.findElement(preferenceOption).click();
        return this;
    }
    public HomePage goToText(){
        driver.findElement(textOption).click();
        return this;
    }
    public HomePage goToViews() {
        driver.findElement(viewsOption).click();
        return this;
    }

    public HomePage regresar() {
        goBack();
        return this;
    }


    // ==================== ASSERTIONS ===================

    public boolean isAccessibilityOptionVisible(){
        return driver.findElement(accessibilityOption).isDisplayed();
    }

    public boolean isAnimationOptionVisible(){
        return driver.findElement(animationOption).isDisplayed();
    }
    public boolean isContentOptionVisible(){
        return driver.findElement(contentOption).isDisplayed();
    }
    public boolean isGraphicsOptionVisible(){
        return driver.findElement(graphicsOption).isDisplayed();
    }
    public boolean isMediaOptionVisible(){
        return driver.findElement(mediaOption).isDisplayed();
    }
    public boolean isNfcOptionVisible(){
        return driver.findElement(nfcOption).isDisplayed();
    }
    public boolean isOsOptionVisible(){
        return driver.findElement(osOption).isDisplayed();
    }
    public boolean isPreferenceOptionVisible(){
        return driver.findElement(preferenceOption).isDisplayed();
    }
    public boolean isTextOptionVisible(){
        return driver.findElement(textOption).isDisplayed();
    }
    public boolean isAppOptionVisible() {
        return driver.findElement(appOption).isDisplayed();
    }
    public boolean isViewOptionVisible() {
        return driver.findElement(viewsOption).isDisplayed();
    }
}