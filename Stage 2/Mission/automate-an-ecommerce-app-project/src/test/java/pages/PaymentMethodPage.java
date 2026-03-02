package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class PaymentMethodPage extends BasePage {
    // ==================== LOCATORS ====================

    private final By fullNameTextField = By.id("com.saucelabs.mydemoapp.android:id/nameET");
    private final By cardNumberTextField = By.id("com.saucelabs.mydemoapp.android:id/cardNumberET");
    private final By expirationDateTextField = By.id("com.saucelabs.mydemoapp.android:id/expirationDateET");
    private final By securityCodeTextField = By.id("com.saucelabs.mydemoapp.android:id/securityCodeET");
    private final By reviewOrderButton = By.id("com.saucelabs.mydemoapp.android:id/paymentBtn");

    public PaymentMethodPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================
    public PaymentMethodPage enterFullName(String name) {
        driver.findElement(fullNameTextField).sendKeys(name);
        return this;
    }

    public PaymentMethodPage enterCardNumber(String cardNumber) {
        driver.findElement(cardNumberTextField).sendKeys(cardNumber);
        return this;
    }

    public PaymentMethodPage enterExpirationDate(String expirationDate) {
        driver.findElement(expirationDateTextField).sendKeys(expirationDate);
        return this;
    }

    public PaymentMethodPage enterSecurityCode(String securityCode) {
        driver.findElement(securityCodeTextField).sendKeys(securityCode);
        return this;
    }

    public PaymentMethodPage tapReviewOrder() {
        driver.findElement(reviewOrderButton).click();
        return this;
    }


    // ==================== ASSERTIONS ====================
    public boolean isFullNameFieldVisible() {
        return isElementDisplayed(fullNameTextField);
    }

    public boolean isCardNumberFieldVisible() {
        return isElementDisplayed(cardNumberTextField);
    }

    public boolean isExpirationDateFieldVisible() {
        return isElementDisplayed(expirationDateTextField);
    }

    public boolean isSecurityCodeFieldVisible() {
        return isElementDisplayed(securityCodeTextField);
    }

    public boolean isReviewOrderButtonVisible() {
        return isElementDisplayed(reviewOrderButton);
    }

    public String getFullNameValue() {
        return getText(fullNameTextField);
    }

    public String getCardNumberValue() {
        return getText(cardNumberTextField);
    }

    public String getExpirationDateValue() {
        return getText(expirationDateTextField);
    }

    public String getSecurityCodeValue() {
        return getText(securityCodeTextField);
    }

    public boolean areAllPaymentFieldsVisible() {
        return isFullNameFieldVisible()
                && isCardNumberFieldVisible()
                && isExpirationDateFieldVisible()
                && isSecurityCodeFieldVisible()
                && isReviewOrderButtonVisible();
    }



}
