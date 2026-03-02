package test;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import pages.ProductViewPage;
import pages.SideMenuComponent;
import pages.AboutPage;

public class LoginTest extends BaseTest {
    @Test
    public void shouldLoginWithValidCredentials() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.insertUserName("standard_user")
                .insertPasswordTextField("secret_sauce")
                .selectLoginButton();

        ProductViewPage productPage = new ProductViewPage(driver);

        Assert.assertTrue(productPage.getAllVisibleProductNames().size() > 0);
    }

    @Test
    public void shouldNotLoginWithInvalidCredentials() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.insertUserName("wrong_user")
                .insertPasswordTextField("wrong_pass")
                .selectLoginButton();

        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
    }

    @Test
    public void shouldDisplayAppVersionInAbout() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.insertUserName("standard_user")
                .insertPasswordTextField("secret_sauce")
                .selectLoginButton();

        ProductViewPage productPage = new ProductViewPage(driver);

        productPage.openHamburgerMenu();

        SideMenuComponent menu = new SideMenuComponent(driver);
        menu.selectAbout();

        AboutPage aboutPage = new AboutPage(driver);

        Assert.assertTrue(aboutPage.isAppVersionVisible());
    }

}
