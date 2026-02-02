package com.qaxpert;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CalendarPage {
    AndroidDriver driver;

    public CalendarPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // 1. Botón "Crear evento"
    By createEventBtn = By.id("com.google.android.calendar:id/floating_action_button");
    // Función: Inicia la creación de un nuevo evento

    // 2. Barra de título "Calendar"
    By titleBar = By.id("com.google.android.calendar:id/action_bar");
    // Muestra el título de la vista actual

    // 3. Vista de día / semana / mes
    By viewMode = By.id("com.google.android.calendar:id/calendar_view");
    // Muestra la presentación de fechas

    /*
    // 4. Botón de menú lateral
    By navMenuBtn =
    // Abre el menú lateral de navegación
    */
    // 5. Botón hoy
    By todayBtn = By.id("com.google.android.calendar:id/action_today");
    // Va a la fecha actual

    // Métodos:
    public void clickCreateEvent() {
        driver.findElement(createEventBtn).click();
    }

    public boolean isTitleVisible() {
        return driver.findElement(titleBar).isDisplayed();
    }

}
