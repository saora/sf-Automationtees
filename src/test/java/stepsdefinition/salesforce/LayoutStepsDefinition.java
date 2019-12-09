package stepsdefinition.salesforce;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.salesforce.LayoutPage;
import pages.salesforce.SfHomePage;

public class LayoutStepsDefinition {

    private LayoutPage layoutPage;
    private SfHomePage sfHomePage;

    @Given("^I select the layout option$")
    public void selectNewJsButton(){
        sfHomePage.selObjectOption("Page Layouts");
    }
    @When("^I create a Layout$")
    public void newCustomLayOut(){
        layoutPage.newCustomLayout();
    }

    @Then("^I should create a new Layout$")
    public void newJsButtonVerification() {
        //layoutSteps.expectedResultLayout();
    }

}
