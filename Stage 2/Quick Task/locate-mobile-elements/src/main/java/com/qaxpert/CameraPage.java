package com.qaxpert;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CameraPage {
    AndroidDriver driver;

    public CameraPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // 1. Botón disparo (foto)
    By shutterBtn = By.id("com.android.camera2:id/shutter_button");
    // Función: toma una foto

    // 2. Botón para cambiar a video
    By videoModeBtn = By.id("com.android.camera2:id/video_mode");
    // Cambia a modo video

    // 3. Miniatura de última foto tomada
    By lastThumb = By.id("com.android.camera2:id/thumbnail");
    // Muestra la última foto capturada

    // 4. Botón de menú/configuración
    By settingsBtn = By.cssSelector("Settings");
    // Abre ajustes de cámara

    // 5. Indicador de modo (foto/video)
    By modeIndicator = By.id("com.android.camera2:id/mode_preset_value");
    // Indica modo actual (Foto, Video)

    public void takePhoto() {
        driver.findElement(shutterBtn).click();
    }
}
