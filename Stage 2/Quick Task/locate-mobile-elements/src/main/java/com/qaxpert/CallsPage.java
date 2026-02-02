package com.qaxpert;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CallsPage {
    AndroidDriver driver;

    public CallsPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // 1. Teclado numérico
    By dialPad = By.id("com.android.dialer:id/floating_action_button");
    // Abre marcador

    // 2. Registro de llamadas
    By recentCalls = By.id("com.android.dialer:id/recent_calls_list");
    // Lista de llamadas

    // 3. Nombre/numero principal
    By mainEntry = By.xpath("//android.widget.ListView/android.widget.LinearLayout[1]");
    // Primer contacto en lista

    // 4. Botón llamada
    By callBtn = By.id("com.android.dialer:id/dialtacts_call_button");
    // Inicia llamada

    // 5. Botón contactos
    By contactsBtn = By.id("com.android.dialer:id/dialtacts_contacts_tab_button");
    // Abre contactos
}
