package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD {// Genel Web Driver
    private static WebDriver driver;

    public static WebDriver getDriver(){
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");
        if (driver==null) { // eğer driver hiç oluşmamışsa driver oluştur
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        }
        // eğer zaten oluşmuşsa driver i gönder
        return driver;
    }

    public static void quitDriver(){
        //test sonucu ekranı bir miktar beklesin diye
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (driver!=null){
            driver.quit();
            driver = null;
        }
    }
}
