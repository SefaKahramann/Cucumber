package StepDefinitions;

import Pages.DialogContent;
import Utilities.ConfigReader;
import Utilities.GWD;
import Utilities.GWD_New;
import io.cucumber.java.en.*; //* hepsi demek

public class _01_LoginSteps {

    DialogContent dc=new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        GWD_New.getDriver().get(ConfigReader.getProperty("URL"));
    }
    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {

        dc.mySendKeys(dc.username , ConfigReader.getProperty("username"));

        dc.mySendKeys(dc.password , ConfigReader.getProperty("password"));

        dc.myClick(dc.loginBtn);
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        dc.verifyContainsText(dc.loginControl, "Internship");
    }
}
