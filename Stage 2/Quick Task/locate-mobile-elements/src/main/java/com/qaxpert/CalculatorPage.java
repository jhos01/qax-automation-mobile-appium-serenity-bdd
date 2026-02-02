package com.qaxpert;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


public class CalculatorPage {
    AndroidDriver driver;

    public CalculatorPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // 1. Número 1
    By btnOne = By.id("com.android.calculator:id/digit_1");

    // 2. Número 2
    By btnTwo = By.id("com.android.calculator:id/digit_2");

    // 3. Suma +
    By btnPlus = By.id("com.android.calculator:id/op_add");

    // 4. Igual =
    By btnEqual = By.id("com.android.calculator:id/eq");

    // 5. Resultado
    By resultField = By.id("com.android.calculator:id/result");

    public void pressOne() {
        driver.findElement(btnOne).click();
    }

}
