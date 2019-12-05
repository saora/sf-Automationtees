package stepsdefinition.salesforce;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.salesforce.BtnLinksActionsPage;
import pages.salesforce.SfHomePage;
import steps.sfhomepage.JsButtonSteps;


public class JsButtonStepsDefinitions {

    private JsButtonSteps jsButtonSteps;
    private SfHomePage sfHomePage;
    private BtnLinksActionsPage btnLinksActionsPage;



    @Given("^I click on new Js Button$")
    public void selectNewJsButton(){
        sfHomePage.selObjectOption("Buttons, Links, and Actions");
        btnLinksActionsPage.clickOption("New Button or Link");
    }
    @When("^I submit Js Button Informtion$")
    public void submitJsButtonInfo(){
        jsButtonSteps.newJsButton();
    }
    @Then("^I should create a new Js Button$")
    public void newJsButtonVerification(){
       // jsButtonSteps.jsButtonverify();
        //jsButtonSteps.logoutsf();
    }
}
