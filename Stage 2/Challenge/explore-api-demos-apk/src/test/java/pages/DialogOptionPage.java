package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class DialogOptionPage extends BasePage {
    // ==================== LOCATORS ====================
    private final By changeTheDateOption = By.xpath("//android.widget.Button[@content-desc='change the date']");
    private final By selectedDateOption = By.xpath("//android.view.View[@content-desc='09 February 2026']");
    private final By okOption = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");
    private final By dateFieldDisplayedOption = By.xpath("//android.widget.TextView[@resource-id='io.appium.android.apis:id/dateDisplay']");

    public DialogOptionPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================
    public DialogOptionPage goToChangeTheDate(){
        driver.findElement(changeTheDateOption).click();
        return this;
    }
    public void modifyDate (){
        clickElement(selectedDateOption);
    }

    public void clickOkOption(){
        clickElement(okOption);
    }

    public String checkDisplayedDate(){
        return driver.findElement(dateFieldDisplayedOption).getText();
    }

    // ==================== ASSERTIONS ====================
    public boolean dateFieldDisplayedOptionEqual(){
        //validate displayed date = selected date
        String selectedDateText = driver.findElement(selectedDateOption).getText();
        String displayedDateText = driver.findElement(dateFieldDisplayedOption).getText();
        return selectedDateText.equals(displayedDateText);
    }


}
