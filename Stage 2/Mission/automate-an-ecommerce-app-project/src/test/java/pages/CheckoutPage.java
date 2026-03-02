package pages;

import io.appium.java_client.android.AndroidDriver;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;

public class CheckoutPage extends BasePage {
    // ==================== LOCATORS ====================

    private final By fullNameTextField = By.id("com.saucelabs.mydemoapp.android:id/fullNameET");
    private final By addressLine1TextField = By.id("com.saucelabs.mydemoapp.android:id/address1ET");
    private final By addressLine2TextField = By.id("com.saucelabs.mydemoapp.android:id/address2ET");
    private final By cityTextField = By.id("com.saucelabs.mydemoapp.android:id/cityET");
    private final By stateOrRegionTextField = By.id("com.saucelabs.mydemoapp.android:id/stateET");
    private final By zipCodeTextField = By.id("com.saucelabs.mydemoapp.android:id/zipET");
    private final By countryTextField = By.id("com.saucelabs.mydemoapp.android:id/countryET");
    private final By toPaymentButton = By.id("com.saucelabs.mydemoapp.android:id/paymentBtn");

    public CheckoutPage(AndroidDriver driver) {
        super(driver);
    }
    // ==================== ACTIONS ====================

    public CheckoutPage fillOutFullNameTextField(String fullName){
        driver.findElement(fullNameTextField).sendKeys(fullName);
        return this;
    }
    public CheckoutPage fillOutAddressLine1TextField(String address1){
        driver.findElement(addressLine1TextField).sendKeys(address1);
        return this;
    }
    public CheckoutPage fillOutAddressLine2TextField(String address2){
        driver.findElement(addressLine2TextField).sendKeys(address2);
        return this;
    }
    public CheckoutPage fillOutCityTextField  (String city ){
        driver.findElement(cityTextField).sendKeys(city);
        return this;
    }
    public CheckoutPage fillOutStateOrRegionTextField  (String state){
        driver.findElement(stateOrRegionTextField).sendKeys(state);
        return this;
    }
    public CheckoutPage fillOutZipCodeTextField  (String zipcode){
        driver.findElement(zipCodeTextField).sendKeys(zipcode);
        return this;
    }
    public CheckoutPage fillOutCountryTextField  (String country){
        driver.findElement(countryTextField).sendKeys(country);
        return this;
    }
    public CheckoutPage selectToPaymentButton(){
        driver.findElement(toPaymentButton).click();
        return this;
    }


    // ==================== ASSERTIONS ====================
    public boolean isFullNameTextFieldVisible() {
        return driver.findElement(fullNameTextField).isDisplayed();
    }

    public boolean isAddressLine1TextFieldVisible() {
        return driver.findElement(addressLine1TextField).isDisplayed();
    }

    public boolean isAddressLine2TextFieldVisible() {
        return driver.findElement(addressLine2TextField).isDisplayed();
    }

    public boolean isCityTextFieldVisible() {
        return driver.findElement(cityTextField).isDisplayed();
    }

    public boolean isStateOrRegionTextFieldVisible() {
        return driver.findElement(stateOrRegionTextField).isDisplayed();
    }

    public boolean isZipCodeTextFieldVisible() {
        return driver.findElement(zipCodeTextField).isDisplayed();
    }

    public boolean isCountryTextFieldVisible() {
        return driver.findElement(countryTextField).isDisplayed();
    }

    public boolean isToPaymentButtonVisible() {
        return driver.findElement(toPaymentButton).isDisplayed();
    }

}
