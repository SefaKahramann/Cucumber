package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver() ,this);
    }

    @FindBy(css ="[formcontrolname='username']")
    public WebElement username;

    @FindBy(css ="[formcontrolname='password']")
    public WebElement password;

    @FindBy(css ="[aria-label='LOGIN']")
    public WebElement loginBtn;

    @FindBy(css = "[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement loginControl;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'.TITLE.ADD')]//button")
    public WebElement addButton;

    @FindBy (xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement inputName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement inputCode;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement inputShortName;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveButton;

    @FindBy(xpath = "//mat-expansion-panel//mat-panel-description/div")
    public WebElement successfullyMsg;
}
