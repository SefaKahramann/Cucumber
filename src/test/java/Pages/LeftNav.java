package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver() ,this);
    }
//Citizenships
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setupBtn;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    public WebElement parametersBtn;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countriesBtn;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenshipsBtn;

}
