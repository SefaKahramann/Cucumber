package Pages;


import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

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

    @FindBy(tagName = "mat-panel-description")
    public WebElement messageBox;

    public void verifyMessageContainsText(String value){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"),0));
        Assert.assertTrue( this.messageBox.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));
    }
}
