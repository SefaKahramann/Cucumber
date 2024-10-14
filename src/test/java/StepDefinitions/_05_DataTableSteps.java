package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _05_DataTableSteps {
    DialogContent dc =new DialogContent();
    LeftNav ln=new LeftNav();

    @And("Click on the Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dtLinks) {
        List<String> links=dtLinks.asList(String.class);

        for (int i = 0; i < links.size(); i++) {
            ln.myClick(ln.getWebElement(links.get(i)));
        }
    }

    @And("Click on the Element in Dialog")
    public void clickOnTheElementInDialog(DataTable dtLinks) {
        List<String> links=dtLinks.asList(String.class);

        for (int i = 0; i < links.size(); i++) {
            ln.myClick(dc.getWebElement(links.get(i)));
        }
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable dtBoxAndWrite) {
        List<List<String>> listTextBox=dtBoxAndWrite.asLists(String.class);

        for (int i = 0; i <listTextBox.size() ; i++) {
            WebElement box= dc.getWebElement(listTextBox.get(i).get(0));
            dc.mySendKeys(box,listTextBox.get(i).get(1));
        }
    }

    @And("User delete the element from dialog")
    public void userDeleteTheElementFromDialog(DataTable dtDeleted) {
        List<String> deleteItems=dtDeleted.asList(String.class);

        for (int i = 0; i < deleteItems.size(); i++) {
            dc.deleteItem(deleteItems.get(i));
        }
    }
}
