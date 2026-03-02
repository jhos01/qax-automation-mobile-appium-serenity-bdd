package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebViewPage extends BasePage{
    private final By urlTextField = By.id("com.saucelabs.mydemoapp.android:id/urlET");
    private final By goToSiteButton =   By.id("com.saucelabs.mydemoapp.android:id/goBtn");

    // ==================== LOCATORS ====================
    public WebViewPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================
    public WebViewPage insertUrl(String url){
        driver.findElement(urlTextField).sendKeys(url);
        return this;
    }
    public WebViewPage clickOnGoToSiteButton(){
        driver.findElement(goToSiteButton).click();
        return this;
    }


    // ==================== ASSERTIONS ====================
    public boolean isUrlVisible(){
        return driver.findElement(urlTextField).isDisplayed();
    }
    public boolean isGoToSiteButtonVisible(){
        return driver.findElement(goToSiteButton).isDisplayed();
    }

}
