package StepDefinitions;

import Pages.DialogContent;

import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class JDBCSteps {
     DialogContent element=new DialogContent();

    @Then("Send the Query the Database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String sorgu) {
        // DB den sonuçları al (Datayı oku)
        List<List<String>> data=DBUtility.getData(sorgu);

        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).get(0));
        }

        // Webden (UI) dan ekrandaki isimleri oku
        for (int i = 0; i < element.countryNameList.size(); i++) {
            System.out.println(element.countryNameList.get(i).getText());
        }

        //bire bir bir for ile Assert yap
        for (int i = 0; i < data.size(); i++) {
            Assert.assertEquals(data.get(i).get(0), element.countryNameList.get(i).getText().trim());
        }
    }
}
