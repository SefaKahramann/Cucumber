package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import io.cucumber.java.en.*;

import java.util.List;


public class _06_ApachePOISteps {
    DialogContent dc =new DialogContent();
    @When("User Create citizenShip with ApachePOI")
    public void userCreateCitizenShipWithApachePOI() {

        List<List<String>> tablo= ExcelUtility.getData(
                "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx",
                "testCitizen",2);

        for (List<String> row : tablo){
            dc.myClick(dc.addButton);
            dc.mySendKeys(dc.inputName, row.get(0));
            dc.mySendKeys(dc.inputShortName,row.get(1));
            dc.myClick(dc.saveButton);
            dc.verifyMessageContainsText("success");
        }
    }

    @Then("User Delete citizenShip with ApachePOI")
    public void userDeleteCitizenShipWithApachePOI() {

        List<List<String>> tablo= ExcelUtility.getData(
                "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx",
                "testCitizen",1);

        for (List<String> row : tablo){
            dc.deleteItem(row.get(0));
            dc.verifyMessageContainsText("success");
        }
    }
}
