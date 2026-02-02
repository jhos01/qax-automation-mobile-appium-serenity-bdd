package com.qaxpert;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MessagesPage {
    AndroidDriver driver;

    public MessagesPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Elemento 1: Botón de nuevo mensaje
    By newMessageBtn = By.id("com.android.messaging:id/start_new_conversation_button");
    // Función: abre el panel para iniciar una nueva conversación

    // Elemento 2: Barra de búsqueda
    By searchBar = By.id("com.android.messaging:id/search_view_start_search");
    // Función: buscar conversaciones existentes

    // Elemento 3: Título "Mensajes"
    By messagesTitle = By.xpath("//android.widget.TextView[@text='Mensajes']");
    // Función: muestra el título principal de la app

    // Elemento 4: Primer chat en lista
    By firstChat = By.xpath("(//android.support.v7.widget.RecyclerView/*)[1]");
    // Función: acceder a una conversación existente

    // Elemento 5: Icono de perfil
    By profileIcon = By.id("com.android.messaging:id/action_bar_avatar");
    // Función: acceder al perfil o ajustes

    // Métodos de interacción
    public void clickNewMessage() {
        driver.findElement(newMessageBtn).click();
    }

    public void clickFirstChat() {
        driver.findElement(firstChat).click();
    }

    public boolean isSearchBarVisible() {
        return driver.findElement(searchBar).isDisplayed();
    };
};
