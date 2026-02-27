package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MediaPage extends BasePage {
    // ==================== LOCATORS ====================
    private final By audioFxOption = By.xpath("");
    private final By mediaPlayerOption = By.xpath("");
    private final By videoViewOption = By.xpath("");

    public MediaPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================
    public MediaPage goToAudioFx(){
        driver.findElement(audioFxOption).click();
        return this;
    }
    public MediaPage goToMediaPlayer(){
        driver.findElement(mediaPlayerOption).click();
        return this;
    }
    public MediaPage goToVideoView(){
        driver.findElement(videoViewOption).click();
        return this;
    }
    // ==================== ASSERTIONS ===================
    public boolean isAudioFxOptionVisible(){
        return driver.findElement(audioFxOption).isDisplayed();
    }
    public boolean isMediaPlayerOption(){
        return driver.findElement(mediaPlayerOption).isDisplayed();
    }
    public boolean isVideoViewOption(){
        return driver.findElement(videoViewOption).isDisplayed();
    }

}
