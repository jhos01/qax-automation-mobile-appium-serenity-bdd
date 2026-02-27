package test;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

public class HomeTests extends BaseTest {

    @Test
    public void shouldNavigateThroughMainMenuOptionsFromHome() {

        // ===== GIVEN =====
        HomePage homePage = new HomePage(driver);
        AppPage appPage = new AppPage(driver);


        Assertions.assertTrue(homePage.isAppOptionVisible(),"La opción App debe estar visible en el Home");

        // ===== WHEN =====
        homePage.goToApp();
        homePage.regresar();

        homePage.goToAccessibility();
        homePage.regresar();

        homePage.goToAnimation();
        homePage.regresar();

        homePage.goToContent();

        // ===== THEN =====
        Assertions.assertTrue(appPage.isActivityVisible(),"La pantalla de Content debe mostrarse correctamente");
    }

    @Test
    public void accessibilityPageShouldHaveAllSubmenuOptions(){
        // ===== GIVEN =====
        HomePage homePage = new HomePage(driver);
        AccessibilityPage accessibilityPage = new AccessibilityPage(driver);
        // ===== WHEN =====
        homePage.goToAccessibility();
        // ===== THEN =====
        Assertions.assertAll(
                () -> Assertions.assertTrue(
                        accessibilityPage.isAccessibilityNoteProviderOptionVisible(), "Accessibility Node Provider debe estar visible"),
                () -> Assertions.assertTrue(
                        accessibilityPage.isAccessibilityNodeQueryOptionVisible(), "Accessibility Node Querying debe estar visible"),
                () -> Assertions.assertTrue(
                        accessibilityPage.isAccessibilityServiceOptionVisible(), "Accessibility Service debe estar visible")
        );
    }
    @Test
    public void animationPageShouldHaveAllSubmenuOptions(){
        // ===== GIVEN =====
        HomePage homePage = new HomePage(driver);
        AnimationPage animationPage = new AnimationPage(driver);
        // ===== WHEN =====
        homePage.goToAnimation();
        // ===== THEN =====
        Assertions.assertAll(
                () -> Assertions.assertTrue(animationPage.isBouncingBallsOptionVisible(), "La opcion es visible"),
                () -> Assertions.assertTrue(animationPage.isCloningOptionVisible(), "La opcion es visible"),
                () -> Assertions.assertTrue(animationPage.isCustomEvaluatorOptionVisible(), "La opcion es visible"),
                () -> Assertions.assertTrue(animationPage.isDefaultLayoutAnimationsOptionVisible(), "La opcion es visible")
        );
    }
    @Test
    public void appPageShouldHaveAllSubmenuOptions() {

        HomePage homePage = new HomePage(driver);
        AppPage appPage = new AppPage(driver);

        homePage.goToApp();

        Assertions.assertAll(
                () -> Assertions.assertTrue(appPage.isActionBarOptionVisible(), "Action Bar debe estar visible"),
                () -> Assertions.assertTrue(appPage.isActivityVisible(), "Activity debe estar visible"),
                () -> Assertions.assertTrue(appPage.isAlarmOptionVisible(), "Alarm debe estar visible"),
                () -> Assertions.assertTrue(appPage.isAlertDialogsOptionVisible(), "Alert Dialogs debe estar visible"),
                () -> Assertions.assertTrue(appPage.isDeviceAdminOption(), "Device Admin debe estar visible"),
                () -> Assertions.assertTrue(appPage.isFragmentOptionVisible(), "Fragment debe estar visible")
        );
    }
    @Test
    public void contentPageShouldHaveAllSubmenuOptions() {

        HomePage homePage = new HomePage(driver);
        ContentPage contentPage = new ContentPage(driver);

        homePage.goToContent();

        Assertions.assertAll(
                () -> Assertions.assertTrue(contentPage.isAssetsOptionVisible(), "Assets debe estar visible"),
                () -> Assertions.assertTrue(contentPage.isClipboardOptionVisible(), "Clipboard debe estar visible"),
                () -> Assertions.assertTrue(contentPage.isPackagesOptionVisible(), "Packages debe estar visible"),
                () -> Assertions.assertTrue(contentPage.isProviderOptionVisible(), "Provider debe estar visible")
        );
    }
    @Test
    public void graphicsPageShouldHaveAllSubmenuOptions() {

        HomePage homePage = new HomePage(driver);
        GraphicsPage graphicsPage = new GraphicsPage(driver);

        homePage.goToGraphics();

        Assertions.assertAll(
                () -> Assertions.assertTrue(graphicsPage.isAlphaBitMapOptionVisible()),
                () -> Assertions.assertTrue(graphicsPage.isAnimateDrawablesOptionVisible()),
                () -> Assertions.assertTrue(graphicsPage.isArcsOptionVisible()),
                () -> Assertions.assertTrue(graphicsPage.isBitmapDecodeOptionVisible()),
                () -> Assertions.assertTrue(graphicsPage.isBitmapMeshOptionVisible()),
                () -> Assertions.assertTrue(graphicsPage.isBitmapPixelsOptionVisible()),
                () -> Assertions.assertTrue(graphicsPage.isCameraPreviewOptionVisible()),
                () -> Assertions.assertTrue(graphicsPage.isClippingOptionVisible()),
                () -> Assertions.assertTrue(graphicsPage.isColorFiltersOptionVisible()),
                () -> Assertions.assertTrue(graphicsPage.isColorMatrixOptionVisible())
        );
    }
    @Test
    public void mediaPageShouldHaveAllSubmenuOptions() {

        HomePage homePage = new HomePage(driver);
        MediaPage mediaPage = new MediaPage(driver);

        homePage.goToMedia();

        Assertions.assertAll(
                () -> Assertions.assertTrue(mediaPage.isAudioFxOptionVisible()),
                () -> Assertions.assertTrue(mediaPage.isMediaPlayerOption()),
                () -> Assertions.assertTrue(mediaPage.isVideoViewOption())
        );
    }
    @Test
    public void nfcPageShouldHaveAllSubmenuOptions() {

        HomePage homePage = new HomePage(driver);
        NfcPage nfcPage = new NfcPage(driver);

        homePage.goToNfc();

        Assertions.assertAll(
                () -> Assertions.assertTrue(nfcPage.isForegroundDispatchOptionVisible()),
                () -> Assertions.assertTrue(nfcPage.isForegroundNdefPushOptionVisible()),
                () -> Assertions.assertTrue(nfcPage.isTechFilterOptionVisible())
        );
    }
    @Test
    public void osPageShouldHaveAllSubmenuOptions() {

        HomePage homePage = new HomePage(driver);
        OsPage osPage = new OsPage(driver);

        homePage.goToOs();

        Assertions.assertAll(
                () -> Assertions.assertTrue(osPage.isMorseCodeOptionVisible()),
                () -> Assertions.assertTrue(osPage.isRotationVectorOptionVisible()),
                () -> Assertions.assertTrue(osPage.isSensorsOptionVisible())
        );
    }
    @Test
    public void preferencePageShouldHaveAllSubmenuOptions() {

        HomePage homePage = new HomePage(driver);
        PreferencePage preferencePage = new PreferencePage(driver);

        homePage.goToPreference();

        Assertions.assertAll(
                () -> Assertions.assertTrue(preferencePage.preferencesFromXMLOptionVisible()),
                () -> Assertions.assertTrue(preferencePage.launchingPreferencesOptionVisible()),
                () -> Assertions.assertTrue(preferencePage.preferenceDependenciesOptionVisible())
        );
    }
    @Test
    public void textFieldsPageShouldHaveAllElementsVisible() {

        HomePage homePage = new HomePage(driver);
        ViewsPage viewsPage = new ViewsPage(driver);
        TextFieldsPage textFieldsPage = new TextFieldsPage(driver);

        homePage.goToViews();
        viewsPage.scrollToTextFields();
        viewsPage.goToTextFields();

        Assertions.assertAll(
                () -> Assertions.assertTrue(textFieldsPage.isTextFieldVisible())
        );
    }
    @Test
    public void viewsPageShouldHaveAllSubmenuOptions() {

        HomePage homePage = new HomePage(driver);
        ViewsPage viewsPage = new ViewsPage(driver);

        homePage.goToViews();

        Assertions.assertAll(
                () -> Assertions.assertTrue(viewsPage.isTextFieldsVisible()),
                () -> Assertions.assertTrue(viewsPage.isControlsOptionVisible()),
                () -> Assertions.assertTrue(viewsPage.isDateWidgetsOptionVisible())
        );
    }

}
