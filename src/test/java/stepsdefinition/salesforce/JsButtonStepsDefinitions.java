package stepsdefinition.salesforce;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.salesforce.BtnLinksActionsPage;
import pages.salesforce.SfHomePage;

public class JsButtonStepsDefinitions {
    @Steps
    private SfHomePage sfHomePage;
    private BtnLinksActionsPage btnLinksActionsPage;

    @Given("^I click on new Js Button$")
    public void selectNewJsButton(){
        sfHomePage.buildOption();
        sfHomePage.selSalesforceObject("Campaigns");
    }
    @When("^I submit Js Button Informtion$")
    public void submitJsButtonInfo(){
        btnLinksActionsPage.newJavaScriptButton();
        //jsButtonSteps.newJsButton();
    }
    @Then("^I should create a new Js Button$")
    public void newJsButtonVerification(){
       // jsButtonSteps.jsButtonverify();
        //jsButtonSteps.logoutsf();
    }
}
