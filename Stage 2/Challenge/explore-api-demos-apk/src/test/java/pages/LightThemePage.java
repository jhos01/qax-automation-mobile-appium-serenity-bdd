package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import javax.swing.*;

public class LightThemePage extends BasePage{
    // ==================== LOCATORS ====================

    private final By hintTextOption = By.xpath("//android.widget.EditText[@resource-id='io.appium.android.apis:id/edit']");
    private final By checkBox1Option = By.xpath("//android.widget.CheckBox[@content-desc='Checkbox 1']");
    private final By radioButton1Option = By.xpath("//android.widget.RadioButton[@content-desc='RadioButton 1']");


    public LightThemePage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================
    public LightThemePage goToHintText(){
        driver.findElement(hintTextOption).click();
        return this;
    }
    public void writeTextIntoHintTextField(String text){
        driver.findElement(hintTextOption).sendKeys(text);
    }

    public void selectCheckBox1(){
        driver.findElement(checkBox1Option).click();
    }
    public void selectRadioButton1(){
        driver.findElement(radioButton1Option).click();
    }
    // ==================== ASSERTIONS ====================

    //validar checkbox esta seleccionado
    public boolean isCheckBox1OptionSelected(){
        return driver.findElement(checkBox1Option).isSelected();
    }
    //validar radiobutton esta seleccionado
    public boolean isRadioButton1OptionSelected(){
        return driver.findElement(radioButton1Option).isSelected();
    }
}
