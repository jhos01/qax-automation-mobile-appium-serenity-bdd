package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class OsPage extends BasePage {
    // ==================== LOCATORS ====================
    private final By morseCodeOption  = By.xpath("//android.widget.TextView[@content-desc='Morse Code']");
    private final By rotationVectorOption  = By.xpath("//android.widget.TextView[@content-desc='Rotation Vector']");
    private final By sensorsOption  = By.xpath("//android.widget.TextView[@content-desc='Sensors']");

    public OsPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================
    public OsPage goToMorseCode (){
        driver.findElement(morseCodeOption).click();
        return this;
    }
    public OsPage goToRotationVector (){
        driver.findElement(rotationVectorOption).click();
        return this;
    }
    public OsPage goToSensors(){
        driver.findElement(sensorsOption).click();
        return this;
    }

    // ==================== ASSERTIONS ===================
    public boolean isMorseCodeOptionVisible(){
        return driver.findElement(morseCodeOption).isDisplayed();
    }
    public boolean isRotationVectorOptionVisible(){
        return driver.findElement(rotationVectorOption).isDisplayed();
    }
    public boolean isSensorsOptionVisible(){
        return driver.findElement(sensorsOption).isDisplayed();
    }
}
