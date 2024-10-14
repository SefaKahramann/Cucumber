package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver() ,this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setupBtn;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    public WebElement parametersBtn;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countriesBtn;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenshipsBtn;

    @FindBy(xpath = "(//span[text()='States'])[1]")
    public WebElement statesBtn;

    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    public WebElement nationalitiesBtn;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    public WebElement FeesBtn;

    public WebElement getWebElement(String strElementName){
      switch (strElementName)
      {
          case "setup" : return this.setupBtn;
          case "parameters" : return this.parametersBtn;
          case "countries" : return this.countriesBtn;
          case "citizenship": return this.citizenshipsBtn;
          case "states" : return this.statesBtn;
          case "nationalities" : return this.nationalitiesBtn;
          case "Fees" : return this.FeesBtn;
      }
      return null;
    }
}
