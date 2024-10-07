package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GWD {// Genel Web Driver
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null) { // eğer driver hiç oluşmamışsa driver oluştur
            driver = new ChromeDriver();
        }
        // eğer zaten oluşmuşsa driver i gönder
        return driver;
    }

}
