package pages;
import io.appium.java_client.android.AndroidDriver;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;

public class AccessibilityPage extends BasePage{
    // ==================== LOCATORS ====================
    private final By accessibilityNoteProviderOption = By.xpath("//android.widget.TextView[@text='Activity']");
    private final By accessibilityNodeQueryingOption = By.xpath("//android.widget.TextView[@content-desc='Accessibility Node Querying']");
    private final By accessibilityServiceOption = By.xpath("//android.widget.TextView[@content-desc='Accessibility Service']");
    private final By customViewOption = By.xpath("//android.widget.TextView[@content-desc='Custom View']");

    public AccessibilityPage(AndroidDriver driver) {
        super(driver);
    }
    // ==================== ACTIONS ====================
    public AccessibilityPage goToAccessibilityNoteProvider(){
        driver.findElement(accessibilityNoteProviderOption).click();
        return this;
    }
    public AccessibilityPage goToAccessibilityNodeQuery (){
        driver.findElement(accessibilityNodeQueryingOption).click();
        return this;
    }
    public AccessibilityPage goToAccessibilityService(){
        driver.findElement(accessibilityServiceOption).click();
        return this;
    }
    public AccessibilityPage goToCustomView(){
        driver.findElement(customViewOption).click();
        return this;
    }
    // ==================== ASSERTIONS ===================
    public boolean isAccessibilityNoteProviderOptionVisible() {
        return driver.findElement(accessibilityNoteProviderOption).isDisplayed();
    }

    public boolean isAccessibilityNodeQueryOptionVisible(){
        return driver.findElement(accessibilityNodeQueryingOption).isDisplayed();
    }
    public boolean isAccessibilityServiceOptionVisible(){
        return driver.findElement(accessibilityServiceOption).isDisplayed();
    }
    public boolean isCustomViewOptionVisible(){
        return driver.findElement(customViewOption).isDisplayed();
    }
}
