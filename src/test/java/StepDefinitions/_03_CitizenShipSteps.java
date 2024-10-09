package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _03_CitizenShipSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc =new DialogContent();

    @And("Navigate to Citizenships")
    public void navigateToCitizenships() {
        ln.myClick(ln.setupBtn);
        ln.myClick(ln.parametersBtn);
        ln.myClick(ln.citizenshipsBtn);
    }

    @When("Create a Citizenships")
    public void createACitizenships() {
        String randomName= RandomStringUtils.randomAlphanumeric(8);
        String randomShortName= RandomStringUtils.randomAlphabetic(11);
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.inputName,randomName );
        dc.mySendKeys(dc.inputShortName,randomShortName);
        dc.myClick(dc.saveButton);
    }

    @When("Create a Citizenships name as{string} shortname as {string}")
    public void createACitizenshipsNameAsShortnameAs(String arg0, String arg1) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.inputName,arg0 );
        dc.mySendKeys(dc.inputShortName,arg1);
        dc.myClick(dc.saveButton);
    }
}
