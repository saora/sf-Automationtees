package stepsdefinition.salesforce;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.salesforce.SfHomePage;
import steps.sfhomepage.LayoutSteps;

public class LayoutStepsDefinition {

    private LayoutSteps layoutSteps;

    @Given("^I select the layout option$")
    public void selectNewJsButton()throws Exception{
       layoutSteps.addJsButtonToLayout("Page Layouts");
    }
    @When("^I create a Layout$")
    public void submitJsButtonInfo()throws Exception{
        layoutSteps.getCustomLayoutName();
    }

    @Then("^I should create a new Layout$")
    public void newJsButtonVerification(){

    }

}
