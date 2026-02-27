package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

public class ViewsTextFieldTest extends BaseTest {

    @Test
    public void shouldEnterTextInTextFieldFromViewsMenu() {

        HomePage homePage = new HomePage(driver);
        ViewsPage viewsPage = new ViewsPage(driver);
        TextFieldsPage textFieldsPage = new TextFieldsPage(driver);

        // GIVEN
        Assertions.assertTrue(homePage.isViewOptionVisible());
        // WHEN
        homePage.goToViews();
        viewsPage
                .scrollToTextFields()
                .goToTextFields();

        viewsPage.isTextFieldsVisible();
        textFieldsPage.enterTextInField("Hola QAXpert");
        // THEN
        Assertions.assertEquals(
                "Hola QAXpert",
                textFieldsPage.getTextFromField()
        );
    }
    @Test
    public void elementsAreSuccessfullySelected(){
        HomePage homePage = new HomePage(driver);
        ViewsPage viewsPage = new ViewsPage(driver);
        ControlsPage controlsPage = new ControlsPage(driver);
        LightThemePage lightThemePage = new LightThemePage(driver);
        homePage.goToViews();
        viewsPage.goToControls();
        controlsPage.goToLightTheme();
        lightThemePage.goToHintText();
        lightThemePage.writeTextIntoHintTextField("A text message was inserted");
        lightThemePage.selectCheckBox1();
        lightThemePage.selectRadioButton1();

        Assertions.assertAll(
                () -> Assertions.assertTrue(lightThemePage.isCheckBox1OptionSelected(),"checkbox fue seleccionado"),
                () -> Assertions.assertTrue(lightThemePage.isRadioButton1OptionSelected(),"RadioButton fue seleccionado")
        );
    }
    @Test
    public void displayedDateIsTheSelectedDate(){
        HomePage homePage = new HomePage(driver);
        ViewsPage viewsPage = new ViewsPage(driver);
        DateWidgetsPage dateWidgetsPage = new DateWidgetsPage(driver);
        DialogOptionPage dialogOptionPage = new DialogOptionPage(driver);
        homePage.goToViews();
        viewsPage.goToDateWidgets();
        dateWidgetsPage.goToDialog();
        dialogOptionPage.goToChangeTheDate();
        dialogOptionPage.modifyDate();
        dialogOptionPage.clickOkOption();
        dialogOptionPage.checkDisplayedDate();
        Assertions.assertTrue(dialogOptionPage.dateFieldDisplayedOptionEqual(),"Displayed Date corresponds to the selected Date");
    }


}
