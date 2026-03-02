package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.bidi.log.Log;

public class LoginPage extends BasePage {

    // ============ LOCATORS ============
    private final By usernameTextField = By.xpath("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/nameET']");
    private final By passwordTextField = By.id("com.saucelabs.mydemoapp.android:id/passwordET");
    private final By loginButton = By.id("com.saucelabs.mydemoapp.android:id/loginBtn");
    public LoginPage(AndroidDriver driver) {
        super(driver);
    }
    // ============ ACTIONS ============
    public LoginPage insertUserName(String username){
        driver.findElement(usernameTextField).sendKeys(username);
        return this;
    }
    public LoginPage insertPasswordTextField(String password){
        driver.findElement(passwordTextField).sendKeys(password);
        return this;
    }
    public LoginPage selectLoginButton(){
        driver.findElement(loginButton).click();
        return this;
    }
}
