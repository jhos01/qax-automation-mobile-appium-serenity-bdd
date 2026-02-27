package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class DateWidgetsPage extends BasePage{
    // ==================== LOCATORS ====================
    private final By dialogOption = By.xpath("//android.widget.TextView[@content-desc='1. Dialog']");

    public DateWidgetsPage(AndroidDriver driver) {
        super(driver);
    }


    // ==================== ACTIONS ====================
    public DateWidgetsPage goToDialog(){
        clickElement(dialogOption);
        return this;
    }


    // ==================== ASSERTIONS ====================
    public boolean isDialogOptionVisible(){
        return driver.findElement(dialogOption).isDisplayed();
    }

}
