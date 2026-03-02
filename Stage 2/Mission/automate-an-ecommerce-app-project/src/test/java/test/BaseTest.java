package test;

import config.CapabilitiesConfig;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utils.DriverManager;

import javax.swing.*;
import java.sql.CallableStatement;

public class BaseTest {
    protected AndroidDriver driver;
    @Before
    public void setUp(){
        System.out.println("\n========== INICIANDO TEST ==========");
        DriverManager.initializeDriver(CapabilitiesConfig.getAndroidCapabilities());
        driver = DriverManager.getDriver();
    }
    @After
    public void tearDown(){
        System.out.println("\"========== FINALIZANDO TEST ==========\n");
    }
}
