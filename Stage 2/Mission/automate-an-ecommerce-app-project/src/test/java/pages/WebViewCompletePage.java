package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import javax.swing.plaf.PanelUI;
import java.lang.foreign.ValueLayout;
import java.util.Set;

public class WebViewCompletePage extends BasePage {
    // ==================== LOCATORS ====================
    public WebViewCompletePage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================
    //Cambiar de NATIVE_APP a WEBVIEW
    public void switchToWebView() {
        Set<String> contexts = driver.getContextHandles();
        for (String context : contexts) {
            if (context.contains("WEBVIEW")) {
                driver.context(context);
                break;
            }
        }
    }

    //Volver a contexto nativo
    public void switchToNative() {
        driver.context("NATIVE_APP");
    }


    // ==================== ASSERTIONS ====================
    //Validar palabra usando PageSource
    public boolean isTextPresent(String expectedText) {
        return driver.getPageSource().contains(expectedText);
    }

    //Validar palabra usando xpath
    public boolean isTextVisible(String expectedText) {
        By dynamicText = By.xpath("//*[contains(text(),'" + expectedText + "')]");
        return driver.findElement(dynamicText).isDisplayed();


    }
}