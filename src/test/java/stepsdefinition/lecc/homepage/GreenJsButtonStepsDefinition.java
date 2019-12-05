package stepsdefinition.lecc.homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.lecchomepage.LeccHomePageSteps;

public class GreenJsButtonStepsDefinition {
    @Steps
    private LeccHomePageSteps leccHomePageSteps;

    @Given("^Click on Scan Js Button from Home Page$")
    public void scanJsButtonFromLeccHomePage(){
        leccHomePageSteps.scanJsButtonfromHomePage();

    }
    @When("^Confirm the Js Button Scann$")
    public void confirmScanJsButton(){
        leccHomePageSteps.scanConfirmation();
    }
    @Then("^I should get the results$")
    public void getResultScan(){
        leccHomePageSteps.scanVerificationhp();

    }

}
