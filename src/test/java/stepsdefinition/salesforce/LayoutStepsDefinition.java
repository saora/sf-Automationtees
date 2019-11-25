package stepsdefinition.salesforce;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import steps.sfhomepage.LayoutSteps;

public class LayoutStepsDefinition extends PageObject {

    private LayoutSteps layoutSteps;

    @Given("^I select the layout option$")
    public void selectNewJsButton(){
       layoutSteps.addJsButtonToLayout("Page Layouts");
    }
    @When("^I create a Layout$")
    public void submitJsButtonInfo(){
        layoutSteps.getCustomLayoutName();
    }

    @Then("^I should create a new Layout$")
    public void newJsButtonVerification() {
        //layoutSteps.expectedResultLayout();
    }

}
