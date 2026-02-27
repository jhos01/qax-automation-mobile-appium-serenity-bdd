package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ContentPage extends BasePage {
    // ==================== LOCATORS ====================
    private final By assetsOption = By.xpath("//android.widget.TextView[@content-desc='Assets']");
    private final By clipboardOption = By.xpath("//android.widget.TextView[@content-desc='Clipboard']");
    private final By packagesOption = By.xpath("//android.widget.TextView[@content-desc='Packages']");
    private final By providerOption = By.xpath("//android.widget.TextView[@content-desc='Provider']");


    public ContentPage(AndroidDriver driver){
        super(driver);
    }

    // ==================== ACTIONS ====================
    public ContentPage goToAssets (){
        driver.findElement(assetsOption).click();
        return this;
    }
    public ContentPage goToClipboard (){
        driver.findElement(clipboardOption).click();
        return this;
    }
    public ContentPage goToPackages (){
        driver.findElement(packagesOption).click();
        return this;
    }
    public ContentPage goToProvider (){
        driver.findElement(providerOption).click();
        return this;
    }

    // ==================== ASSERTIONS ===================
    public boolean isAssetsOptionVisible(){
        return driver.findElement(assetsOption).isDisplayed();
    }
    public boolean isClipboardOptionVisible(){
        return driver.findElement(clipboardOption).isDisplayed();
    }
    public boolean isPackagesOptionVisible (){
        return driver.findElement(packagesOption).isDisplayed();
    }
    public boolean isProviderOptionVisible (){
        return driver.findElement(providerOption).isDisplayed();
    }


}
