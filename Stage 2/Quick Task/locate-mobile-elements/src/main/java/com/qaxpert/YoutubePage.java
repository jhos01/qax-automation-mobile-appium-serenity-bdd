package com.qaxpert;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class YoutubePage {
    AndroidDriver driver;

    public YoutubePage(AndroidDriver driver) {
        this.driver = driver;
    }

    // 1. Botón buscar
    By btnSearch = By.id("com.google.android.youtube:id/search");
    // Abre búsqueda de videos

    // 2. Campo de texto buscar
    By searchText = By.id("com.google.android.youtube:id/search_edit_text");
    // Campo de búsqueda principal

    // 3. Primer video sugerido
    By firstSuggestedVideo = By.xpath("(//android.view.ViewGroup[@content-desc])[1]");
    // Función: abre el primer video

    // 4. Botón "Inicio"
    By btnHome = By.xpath("//android.widget.FrameLayout[@content-desc='Inicio']");
    // Regresa a home de YouTube

    // 5. Perfil
    By btnProfile = By.xpath("//android.widget.FrameLayout[@content-desc='Perfil']");
    // Abre perfil del usuario
}
