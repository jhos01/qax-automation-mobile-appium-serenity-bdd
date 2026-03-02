package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ReviewYourOrderPage extends BasePage {
    // ==================== LOCATORS ====================
    private final By placeOrderButton = By.id("com.saucelabs.mydemoapp.android:id/paymentBtn");

    public ReviewYourOrderPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================
    public ReviewYourOrderPage clickOnPlaceOrderButton(){
        driver.findElement(placeOrderButton).click();
        return this;
    }


    // ==================== ASSERTIONS ====================

    public boolean isPlaceOrderVisible(){
        return isElementDisplayed(placeOrderButton);
    }
}
