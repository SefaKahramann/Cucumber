package Pages;


import Utilities.GWD;
import Utilities.GWD_New;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD_New.getDriver() ,this);
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

    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'FIELD.NAME')]/input")
    public WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchBtn;

    @FindBy(xpath = "//ms-delete-button//button")
    public WebElement deleteBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(css = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    public WebElement IntegrationInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    public WebElement priorityInput;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']//button")
    public WebElement toggleBar;

    @FindBy(xpath = "(//ms-save-button[@class='ng-star-inserted']//button)[2]")
    public WebElement saveCloseBtn;

    @FindBy(xpath = "(//ms-add-button[contains(@tooltip,'.TITLE.ADD')]//button)[2]")
    public WebElement citiesAddBtn;

    @FindBy(xpath = "//mat-form-field[@formgroupname='country']/div")
    public WebElement countrySelectBtn;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    public WebElement firstChoice;

    @FindBy(xpath = " //mat-chip-grid[@formcontrolname='roles']")
    public WebElement roleBtn;

    @FindBy(xpath = "//tbody//tr//td[2]")
    public List<WebElement> countryNameList;

    public void verifyMessageContainsText(String value){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"),0));
        Assert.assertTrue( this.messageBox.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));
    }

    public void deleteItem(String name){
        mySendKeys(searchInput,name);
        myClick(searchBtn);
        wait.until(ExpectedConditions.elementToBeClickable(this.searchBtn));
        myClick(deleteBtn);
        myClick(deleteDialogBtn);
    }

    public WebElement getWebElement(String strElementName){
        switch (strElementName.trim())
        {
            case "addButton" : return this.addButton;
            case "nameInput" : return this.inputName;
            case "codeInput" : return this.inputCode;
            case "saveButton" : return this.saveButton;
            case "saveAndCloseButton" : return this.saveCloseBtn;
            case "shortName" : return this.inputShortName;
            case "integration" : return this.IntegrationInput;
            case "priority" : return this.priorityInput;
            case "toggleBar" : return this.toggleBar;
            case "citiesAddBtn":return this.citiesAddBtn;
            case "countrySelectBtn":return this.countrySelectBtn;
            case "firstChoice":return this.firstChoice;
            case "role":return this.roleBtn;

        }
        return null;
    }
}
