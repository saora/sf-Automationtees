package stepsdefinition.lecc.homepage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import steps.lecchomepage.LeccHomePageSteps;
import steps.sfhomepage.JsButtonSteps;
import steps.sfhomepage.LayoutSteps;

public class ScanJsButtonStepsDefinition {
    @Steps
    private LayoutSteps layoutSteps;
    private JsButtonSteps jsButtonSteps;
    private LeccHomePageSteps leccHomePageSteps;

    @When("^I create a Js Button$")
    public void createJsButton(){
        jsButtonSteps.jsButtonObject("Campaigns");
        jsButtonSteps.ObjectAndNewJsButton();
        jsButtonSteps.newJsButton();
    }

    @And("^I create a new custom Layout$")
    public void createCustomLayout() {
        layoutSteps.addJsButtonToLayout("Page Layouts");
        layoutSteps.getCustomLayoutName();
    }
    @Then(value = "^I add the Js Button to a custom laytout$")
    public void addJsButtonToLayout(){
        layoutSteps.addJsButtonToLayout();
        layoutSteps.dragAndDropJsButton();
        layoutSteps.saveLayout();
    }

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


    @Then("^I should get yellow icon in the scanning results$")
    public void getYellowJsButtonScanResult(){
        leccHomePageSteps.leccJsButtonScanResult("unconverted buttons are assigned but may not be used");
    }

    @Then("^I should get green icon in the scanning results$")
    public void getGreenJsButtonScanResult(){
        leccHomePageSteps.leccJsButtonScanResult("All buttons deployed or no impact");
    }
}
