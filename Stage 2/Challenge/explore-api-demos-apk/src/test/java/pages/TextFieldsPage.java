package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class TextFieldsPage extends BasePage {

    // ==================== LOCATORS ====================
    private final By textFieldInput = AppiumBy.className("android.widget.EditText");

    public TextFieldsPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================
    public TextFieldsPage enterTextInField(String text) {
        enterText(textFieldInput, text);
        return this;
    }

    // ==================== ASSERTIONS ====================
    public String getTextFromField() {
        return getText(textFieldInput);
    }

    public boolean isTextFieldVisible() {
        return isElementDisplayed(textFieldInput);
    }
}
