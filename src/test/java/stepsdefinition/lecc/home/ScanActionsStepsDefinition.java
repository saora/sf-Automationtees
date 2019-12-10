package stepsdefinition.lecc.home;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import pages.lecc.LeccHomePage;

public class ScanActionsStepsDefinition {

    @Steps
    private LeccHomePage leccHomePage;

    @And("^I scan Actions and Buttons green icon$")
    public void scanActionsAndButtonsGreenIcon(){
        leccHomePage.actionAndButtonScan();
    }

    @And("^I scan Actions and Buttons yellow icon$")
    public void scanActionsAndButtonsYellowIcon(){
        leccHomePage.actionAndButtonScan();
    }

    @And("^I should get yellow icon in the scanning results for Actions and Buttons$")
    public void getYellowActionsAndButtonScanResult(){
        leccHomePage.scanResultActionsAndButtons("actions and buttons aren’t yet deployed");
    }

    @And("^I should get green icon in the scanning results for Actions and Buttons$")
    public void getGreenActionsAndButtonScanResult(){
        leccHomePage.scanResultActionsAndButtons("green..........");
    }
}
