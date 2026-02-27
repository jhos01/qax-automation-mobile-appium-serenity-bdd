package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class GraphicsPage extends BasePage {
    // ==================== LOCATORS ====================
    private final By alphaBitMapOption = By.xpath("//android.widget.TextView[@content-desc='AlphaBitmap']");
    private final By animateDrawablesOption = By.xpath("//android.widget.TextView[@content-desc='AnimateDrawables']");
    private final By arcsOption = By.xpath("//android.widget.TextView[@content-desc='Arcs']");
    private final By bitmapDecodeOption = By.xpath("//android.widget.TextView[@content-desc='BitmapDecode']");
    private final By bitmapMeshOption = By.xpath("//android.widget.TextView[@content-desc='BitmapMesh']");
    private final By bitmapPixelsOption = By.xpath("//android.widget.TextView[@content-desc='BitmapPixels']");
    private final By cameraPreviewOption = By.xpath("//android.widget.TextView[@content-desc='CameraPreview']");
    private final By clippingOption  = By.xpath("//android.widget.TextView[@content-desc='Clipping']");
    private final By colorFiltersOption  = By.xpath("//android.widget.TextView[@content-desc='ColorFilters']");
    private final By colorMatrixOption  = By.xpath("//android.widget.TextView[@content-desc='ColorMatrix']");

    public GraphicsPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================
    public GraphicsPage goToAlphaBitMap(){
        driver.findElement(alphaBitMapOption).click();
        return this;
    }
    public GraphicsPage goToAnimateDrawables(){
        driver.findElement(animateDrawablesOption).click();
        return this;
    }
    public GraphicsPage goToArcs(){
        driver.findElement(arcsOption).click();
        return this;
    }
    public GraphicsPage goToBitmapDecode(){
        driver.findElement(bitmapDecodeOption).click();
        return this;
    }
    public GraphicsPage goToBitmapMesh(){
        driver.findElement(bitmapMeshOption).click();
        return this;
    }
    public GraphicsPage goToBitmapPixels(){
        driver.findElement(bitmapPixelsOption).click();
        return this;
    }
    public GraphicsPage goToCameraPreview(){
        driver.findElement(cameraPreviewOption).click();
        return this;
    }
    public GraphicsPage goToClipping(){
        driver.findElement(clippingOption).click();
        return this;
    }
    public GraphicsPage goToColorFilters(){
        driver.findElement(colorFiltersOption).click();
        return this;
    }
    public GraphicsPage goToColorMatrix(){
        driver.findElement(colorMatrixOption).click();
        return this;
    }
    // ==================== ASSERTIONS ===================
    public boolean isAlphaBitMapOptionVisible(){
        return driver.findElement(alphaBitMapOption).isDisplayed();
    }
    public boolean isAnimateDrawablesOptionVisible (){
         return driver.findElement(animateDrawablesOption).isDisplayed();
    }
    public boolean isArcsOptionVisible(){
        return driver.findElement(arcsOption).isDisplayed();
    }
    public boolean isBitmapDecodeOptionVisible (){
        return driver.findElement(bitmapDecodeOption).isDisplayed();
    }
    public boolean isBitmapMeshOptionVisible(){
       return driver.findElement(bitmapMeshOption).isDisplayed();
    }
    public boolean isBitmapPixelsOptionVisible(){
       return driver.findElement(bitmapPixelsOption).isDisplayed();
    }
    public boolean isCameraPreviewOptionVisible(){
       return driver.findElement(cameraPreviewOption).isDisplayed();
    }
    public boolean isClippingOptionVisible(){
       return driver.findElement(clippingOption).isDisplayed();
    }
    public boolean isColorFiltersOptionVisible (){
       return driver.findElement(colorFiltersOption).isDisplayed();
    }
    public boolean isColorMatrixOptionVisible(){
       return driver.findElement(colorMatrixOption).isDisplayed();
    }
}
