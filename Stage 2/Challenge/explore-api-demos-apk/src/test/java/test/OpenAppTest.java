package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.AppPage;
import pages.HomePage;

public class OpenAppTest extends BaseTest {

    @Test
    public void shouldOpenAppSectionFromMainMenu() {

        // ===== GIVEN =====
        HomePage homePage = new HomePage(driver);
        AppPage appPage = new AppPage(driver);

        Assertions.assertTrue(homePage.isAppOptionVisible(),"La opción App debe estar visible en el Home");

        // ===== WHEN =====
        homePage.goToApp();

        // ===== THEN =====
        Assertions.assertTrue(appPage.isActivityVisible(),"La actividad principal de la App debe mostrarse al navegar");
    }
}
