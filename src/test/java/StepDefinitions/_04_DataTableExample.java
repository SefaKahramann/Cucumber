package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _04_DataTableExample {
    @When("Write username {string}")
    public void writeUsername(String username) {
        System.out.println(username);
    }

    @When("Write username and password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String username, String password) {
        System.out.println(username+" "+password);
    }

    @And("Write usernema as Datatable")
    public void writeUsernemaAsDatatable(DataTable dtUsers) {
        List<String> listUsers=dtUsers.asList(String.class); //Buradaki String.class String tipi demek

        for (String user : listUsers){
            System.out.println(user);
        }
    }

    @And("Write usernema and password as Datatable")
    public void writeUsernemaAndPasswordAsDatatable(DataTable dtUserpassword) {
        List<List<String >> listUserpassword=dtUserpassword.asLists(String.class);
        for (int i = 0; i < listUserpassword.size(); i++) {
            System.out.println(listUserpassword.get(i).get(0)+" "
            +listUserpassword.get(i).get(1));
        }

    }
}
