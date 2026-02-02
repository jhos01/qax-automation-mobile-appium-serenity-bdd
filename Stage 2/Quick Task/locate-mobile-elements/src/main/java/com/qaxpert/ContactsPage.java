package com.qaxpert;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


public class ContactsPage {
    AndroidDriver driver;

    public ContactsPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // 1. Botón añadir contacto
    By addContactBtn = By.id("com.android.contacts:id/floating_action_button");
    // Abre formulario para añadir un contacto

    // 2. Campo búsqueda
    By searchField = By.id("com.android.contacts:id/search_view");
    // Campo para buscar un contacto

    // 3. Primer contacto en lista
    By firstContact = By.xpath("//android.widget.ListView/android.widget.LinearLayout[1]");
    // Primer elemento en la lista

    // 4. Avatar/contact icono
    By contactAvatar = By.id("com.android.contacts:id/photo");
    // Muestra avatar del contacto

    // 5. Barra de título
    By titleBar = By.id("com.android.contacts:id/action_bar");
    // Título de la vista

    public void clickAddContact() {
        driver.findElement(addContactBtn).click();
    }
}
