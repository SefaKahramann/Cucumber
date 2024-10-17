package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //Cucumbere ait her seneryodan sonra çalışan annotation
    @After
    public void after(Scenario senaryo){ // cucumberin otomatik senaryo ile ilgili bilgiler değişkeni
        if (senaryo.isFailed()){
            TakesScreenshot ts=((TakesScreenshot) GWD.getDriver());
            byte[] fileInMemory =ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(fileInMemory, "image/png", "screenshot name");
        }

        GWD.quitDriver();
    }
}
