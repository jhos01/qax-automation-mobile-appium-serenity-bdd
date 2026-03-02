package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MyCartPage extends BasePage {

    // ==================== LOCATORS ====================
    private final By checkoutButton = By.id("com.saucelabs.mydemoapp.android:id/cartBt");

    public MyCartPage(AndroidDriver driver) {
        super(driver);
    }

    // ============ ACTIONS ============
    public MyCartPage selectCheckoutButton(){
        driver.findElement(checkoutButton).click();
        return this;
    }
    // ==================== ASSERTIONS ====================
    public boolean isCheckoutButtonVisible(){
        return driver.findElement(checkoutButton).isDisplayed();
    }

}
