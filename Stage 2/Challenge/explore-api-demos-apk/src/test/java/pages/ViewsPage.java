package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ViewsPage extends BasePage {

    // ==================== LOCATORS ====================
    private final By textFieldsOption = AppiumBy.xpath("//android.widget.TextView[@text='TextFields']");
    private final By controlsOption = By.xpath("//android.widget.TextView[@content-desc='Controls']");
    private final By dateWidgetsOption = By.xpath("//android.widget.TextView[@content-desc='Date Widgets']");


    public ViewsPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================
    public ViewsPage scrollToTextFields() {
        scrollToText("TextFields");
        return this;
    }

    public ViewsPage goToTextFields() {
        clickElement(textFieldsOption);
        return this;
    }
    public ViewsPage goToControls(){
        clickElement(controlsOption);
        return this;
    }
    public ViewsPage goToDateWidgets(){
        clickElement(dateWidgetsOption);
        return this;
    }



    // ==================== ASSERTIONS ====================
    public boolean isTextFieldsVisible() {
        return isElementDisplayed(textFieldsOption);
    }
    public boolean isControlsOptionVisible(){
        return isElementDisplayed(controlsOption);
    }
    public boolean isDateWidgetsOptionVisible(){
        return isElementDisplayed(dateWidgetsOption);
    }

}
