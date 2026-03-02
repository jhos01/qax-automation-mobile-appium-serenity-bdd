package test;
import org.junit.Assert;
import org.junit.Test;
import pages.ProductViewPage;
import pages.SideMenuComponent;
import pages.WebViewPage;
import pages.WebViewCompletePage;

public class WebViewTest extends BaseTest {
    @Test
    public void shouldLoadWebViewAndValidateText() {

        ProductViewPage productPage = new ProductViewPage(driver);
        productPage.openHamburgerMenu();
        SideMenuComponent menu = new SideMenuComponent(driver);
        menu.selectWebView();
        WebViewPage webViewPage = new WebViewPage(driver);

        webViewPage.insertUrl("www.qaxpert.com/mi2026")
                .clickOnGoToSiteButton();

        WebViewCompletePage completePage = new WebViewCompletePage(driver);

        completePage.switchToWebView();

        Assert.assertTrue(
                completePage.isTextPresent("Workshop")
        );

        completePage.switchToNative();
    }


}
