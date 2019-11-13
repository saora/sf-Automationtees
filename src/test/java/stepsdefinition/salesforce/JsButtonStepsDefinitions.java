package stepsdefinition.salesforce;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.sfhomepage.JsButtonSteps;
import steps.sfhomepage.LayoutSteps;

public class JsButtonStepsDefinitions {

    private JsButtonSteps jsButtonSteps;
    private LayoutSteps layoutSteps;

    @Given("^I click on new Js Button$")
    public void selectNewJsButton()throws Exception{
        jsButtonSteps.jsButtonActions("Campaigns");
    }
    @When("^I submit Js Button Informtion$")
    public void submitJsButtonInfo()throws Exception{
        jsButtonSteps.newJsButton();
        layoutSteps.addJsButtonToLayout("Page Layouts","lecclayouthomepage020");
    }
    @Then("^I should create a new Js Button$")
    public void newJsButtonVerification(){
        jsButtonSteps.jsButtonverify();
        jsButtonSteps.logoutsf();
    }
}
