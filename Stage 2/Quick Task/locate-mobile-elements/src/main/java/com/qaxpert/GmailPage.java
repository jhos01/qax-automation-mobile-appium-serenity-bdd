package com.qaxpert;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class GmailPage {
    AndroidDriver driver;

    public GmailPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // 1. Botón redactar
    By btnCompose = By.id("com.google.android.gm:id/compose_button");
    // Abre redacción de nuevo correo

    // 2. Campo buscador
    By searchField = By.id("com.google.android.gm:id/search");
    // Buscar correos

    // 3. Primer email
    By firstEmail = By.xpath("//android.widget.ListView/android.widget.LinearLayout[1]");
    // Muestra primer correo

    // 4. Botón menú
    By btnMenu = By.xpath("//android.widget.ImageView[@content-desc='Menú']");
    // Abre menú lateral

    // 5. Perfil usuario
    By btnProfile = By.id("com.google.android.gm:id/account_avatar_container");
    // Perfil de cuenta
}

