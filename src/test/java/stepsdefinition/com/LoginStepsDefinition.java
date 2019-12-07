package stepsdefinition.com;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.salesforce.SfHomePage;
import steps.login.LoginSteps;

public class LoginStepsDefinition {

    @Steps
    private LoginSteps loginSteps;

    @Given("^I navigate to Salesforce Login page$")
    public void getSaleforceLoginPage(){
        loginSteps.openLoginPage("salesforce.login");
    }

    @Given("^I navigate to Lecc Login page$")
    public void getLeccLoginPage(){
        loginSteps.openLoginPage("lecc.login");
    }

    @When("^I log in org with green icon$")
    public void orgWithGreenIcon() {
        loginSteps.sendLoginData("Green");
        loginSteps.verificationCodeForLogin();
        loginSteps.allowAccessToLeccHomePages();
    }

    @When("^I log in org with yellow icon$")
    public void orgWithYellowIcon() {
        loginSteps.sendLoginData("Yellow");
        loginSteps.verificationCodeForLogin();
        loginSteps.allowAccessToLeccHomePages();
    }

    @Then("^I should Logged In the salesforce page$")
    public void sfLoginValidation(){
        loginSteps.switchToClassicMode();
        //loginSteps.loginExpectedResult();
    }







}
