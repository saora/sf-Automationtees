package stepsdefinition.lecc.home;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import pages.lecc.LeccHomePage;

public class ScanActionsStepsDefinition {

    @Steps
    private LeccHomePage leccHomePage;

    @And("^I scan Actions and buttons green icon$")
    public void scanJsButtonGreenIcon(){
        leccHomePage.actionAndButtonScan();
    }

    @And("^I scan Actions and buttons yellow icon$")
    public void scanJsButtonYellowIcon(){
        leccHomePage.actionAndButtonScan();
    }

    @And("^I should get yellow icon in the scanning results for Actions and buttons$")
    public void getYellowJsButtonScanResult(){
        leccHomePage.scanResultActionsAndButtons("actions and buttons aren’t yet deployed");
    }

    @And("^I should get green icon in the scanning results for Actions and buttons$")
    public void getGreenJsButtonScanResult(){
        leccHomePage.scanResultActionsAndButtons("green..........");
    }
}
