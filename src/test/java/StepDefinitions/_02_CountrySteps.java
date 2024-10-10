package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.*;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to Country")
    public void navigateToCountry() {
        ln.myClick(ln.setupBtn);
        ln.myClick(ln.parametersBtn);
        ln.myClick(ln.countriesBtn);
    }

    @When("Create a country")
    public void createACountry() {
        String countryName= RandomStringUtils.randomAlphanumeric(8);
        String countryCode= RandomStringUtils.randomNumeric(4);

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.inputName, countryName);
        dc.mySendKeys(dc.inputCode, countryCode);
        dc.myClick(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyMessageContainsText("success");
    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String arg0, String arg1) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.inputName, arg0);
        dc.mySendKeys(dc.inputCode, arg1);
        dc.myClick(dc.saveButton);
    }
}
