package pages;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AnimationPage extends BasePage {
    // ==================== LOCATORS ====================
    private final By bouncingBallsOption = By.className("android.widget.TextView");
    private final By cloningOption = By.xpath("//android.widget.TextView[@content-desc='Cloning']");
    private final By customEvaluatorOption = By.xpath("//android.widget.TextView[@content-desc='Custom Evaluator']");
    private final By defaultLayoutAnimationsOption = By.xpath("//android.widget.TextView[@content-desc='Default Layout Animations']");
    private final By eventsOption = By.xpath("//android.widget.TextView[@content-desc='Events']");
    private final By hideShowAnimationsOption = By.xpath("//android.widget.TextView[@content-desc='Hide-Show Animations']");

    public AnimationPage(AndroidDriver driver){
        super(driver);
    }
    // ==================== ACTIONS ====================
    public AnimationPage goToBouncingBalls(){
        driver.findElement(bouncingBallsOption).click();
        return this;
    }
    public AnimationPage goToCloning(){
        driver.findElement(cloningOption).click();
        return this;
    }
    public AnimationPage goToCustomEvaluator(){
        driver.findElement(customEvaluatorOption).click();
        return this;
    }
    public AnimationPage goToDefaultLayoutAnimations(){
        driver.findElement(defaultLayoutAnimationsOption).click();
        return this;
    }
    public AnimationPage goToEvents(){
        driver.findElement(eventsOption).click();
        return this;
    }
    public AnimationPage goToHideShowAnimations(){
        driver.findElement(hideShowAnimationsOption).click();
        return this;
    }
    // ==================== ASSERTIONS ===================
    public boolean isBouncingBallsOptionVisible(){
        return driver.findElement(bouncingBallsOption).isDisplayed();
    }
    public boolean isCloningOptionVisible(){
        return driver.findElement(cloningOption).isDisplayed();
    }
    public boolean isCustomEvaluatorOptionVisible(){
        return driver.findElement(customEvaluatorOption).isDisplayed();
    }
    public boolean isDefaultLayoutAnimationsOptionVisible(){
        return driver.findElement(defaultLayoutAnimationsOption).isDisplayed();
    }
    public boolean isEventsOptionVisible(){
        return driver.findElement(eventsOption).isDisplayed();
    }
    public boolean isHideShowAnimationsOptionVisible(){
        return driver.findElement(hideShowAnimationsOption).isDisplayed();
    }

}
