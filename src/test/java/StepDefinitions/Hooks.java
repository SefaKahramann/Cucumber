package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;

public class Hooks {

    //Cucumbere ait her seneryodan sonra çalışan annotation
    @After
    public void after(){
        GWD.quitDriver();
    }
}
