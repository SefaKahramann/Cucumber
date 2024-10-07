package StepDefinitions;

import Utilities.ConfigReader;
import Utilities.GWD;
import io.cucumber.java.en.*; //* hepsi demek

public class _01_LoginSteps {

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        System.out.println("Site açıldı");

        GWD.getDriver().get(ConfigReader.getProperty("URL"));
    }
    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        System.out.println("Username ve şifre gönderildi Login buttonuna tıklandı");


    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {

        System.out.println("Siteye gidildiği doğrulandı");
    }
}
