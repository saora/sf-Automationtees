package stepsdefinition.salesforce;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.salesforce.SfHomePage;
import steps.login.LoginSteps;

public class SfLoginStepsDefinition {
    @Steps
    private LoginSteps loginSteps;
    private SfHomePage sfHomePage;


    @Given("^I navigate to the Login page$")
    public void getLoginPage(){
        loginSteps.openLoginPage();
    }

    @When("^I submit the username and password$")
    public void fillData()throws Exception {
        loginSteps.sendLoginData();
    }

    @Then("^I should Logged In$")
    public void verifyAcct()throws Exception {
        sfHomePage.switchToClassic();
    }
}
