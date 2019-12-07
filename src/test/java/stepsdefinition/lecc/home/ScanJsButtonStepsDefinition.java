package stepsdefinition.lecc.home;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

import steps.lecchomepage.LeccHomePageSteps;

public class ScanJsButtonStepsDefinition {
    @Steps
    private LeccHomePageSteps leccHomePageSteps;

    @And("^I scan Js Button green icon$")
    public void scanJsButtonGreenIcon(){
        leccHomePageSteps.scanJsButtonfromHomePage();
        leccHomePageSteps.scanConfirmation();
        leccHomePageSteps.scanVerificationhp("Green");
    }

    @And("^I scan Js Button yellow icon$")
    public void scanJsButtonYellowIcon(){
        leccHomePageSteps.scanJsButtonfromHomePage();
        leccHomePageSteps.scanConfirmation();
        leccHomePageSteps.scanVerificationhp("Yellow");
    }


    @And("^I should get yellow icon in the scanning results$")
    public void getYellowJsButtonScanResult(){
        leccHomePageSteps.leccJsButtonScanResult("unconverted buttons are assigned but may not be used");
    }

    @And("^I should get green icon in the scanning results$")
    public void getGreenJsButtonScanResult(){
        leccHomePageSteps.leccJsButtonScanResult("All buttons deployed or no impact");
    }
}
