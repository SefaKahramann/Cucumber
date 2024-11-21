package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.Locale;

public class GWD_New {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    // driver: threadDriver.get() ->  bulunduğun thread deki driverı veriyor.
    // driver vermek için : threadDriver.set(driver) -> bulunduğum threade driver ver

    public static WebDriver getDriver() {
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if (threadDriver.get() == null) {// XML den çalışmayan durumlar için
            threadBrowserName.set("chrome"); // default chrome
        }

        if (threadDriver.get() == null) { // bu hattaki driver NULL ise
            switch (threadBrowserName.get()) { // hatta hangi browser var
                case "firefox":
                    FirefoxOptions options = new FirefoxOptions();
                    options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");
                    threadDriver.set(new FirefoxDriver(options));
                    break;

                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;
                case "chrome":

                    if (isRunningOnJenkins()) {
                        ChromeOptions ChromeOptions = new ChromeOptions();
                        ChromeOptions.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");
                        threadDriver.set(new ChromeDriver(ChromeOptions));

                    } else {
                        threadDriver.set(new ChromeDriver());
                    } break;
            }
            //  threadDriver.set(new ChromeDriver()); //oluşturma ve set etme yeri , bu thread e bir tane set et
            threadDriver.get().manage().window().maximize();
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        }
        return threadDriver.get();
    }

    public static boolean isRunningOnJenkins() {
        String jenkinsHome = System.getenv("JENKINS_HOME");
        return jenkinsHome != null && !jenkinsHome.isEmpty();
    }

    public static void quitDriver() {

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            // driver = null; // hattakini al NULL değerini al ve SET et ,Hattakini NULL yap
            WebDriver thread = threadDriver.get();
            thread = null;
            threadDriver.set(thread);
        }
    }
}
