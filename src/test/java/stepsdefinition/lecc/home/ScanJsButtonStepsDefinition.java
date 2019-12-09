package stepsdefinition.lecc.home;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

import pages.lecc.LeccHomePage;

public class ScanJsButtonStepsDefinition {
    @Steps
    private LeccHomePage leccHomePage;

    @And("^I scan Js Button green icon$")
    public void scanJsButtonGreenIcon(){
        leccHomePage.javascriptButtonScan();
    }

    @And("^I scan Js Button yellow icon$")
    public void scanJsButtonYellowIcon(){
        leccHomePage.javascriptButtonScan();
    }

    @And("^I should get yellow icon in the scanning results$")
    public void getYellowJsButtonScanResult(){
        leccHomePage.scanJsButtonResult("unconverted buttons are assigned but may not be used");
    }

    @And("^I should get green icon in the scanning results$")
    public void getGreenJsButtonScanResult(){
        leccHomePage.scanJsButtonResult("All buttons deployed or no impact");
    }
}
