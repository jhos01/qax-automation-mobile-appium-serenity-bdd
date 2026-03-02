package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SideMenuComponent extends BasePage{

    // ============ LOCATORS ============

    private final By catalogOption = By.xpath("//android.widget.TextView[@text='Catalog']");
    private final By webViewOption = By.xpath("//android.widget.TextView[@text='WebView']");
    private final By aboutOption = By.xpath("//android.widget.TextView[@text='About']");
    private final By loginOption = By.xpath("//android.widget.TextView[@text='Log In']");

    public SideMenuComponent(AndroidDriver driver) {
        super(driver);
    }
    // ============ ACTIONS ============

    public SideMenuComponent selectCatalog() {
        driver.findElement(catalogOption).click();
        return this;
    }

    public SideMenuComponent selectWebView() {
        driver.findElement(webViewOption);
        return this;
    }

    public SideMenuComponent selectAbout() {
        driver.findElement(aboutOption);
        return this;
    }

    public SideMenuComponent selectLogin() {
        driver.findElement(loginOption);
        return this;
    }
    // ============ ASSERTIONS ============
    public boolean isMenuVisible() {
        return isElementDisplayed(catalogOption);
    }
}
