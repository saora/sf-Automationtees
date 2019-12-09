package stepsdefinition.com;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.login.LoginPage;
import pages.salesforce.SfHomePage;

public class LoginStepsDefinition {

    @Steps
    private LoginPage loginPage;
    private SfHomePage sfHomePage;

    @Given("^I navigate to Salesforce Login page$")
    public void getSaleforceLoginPage(){
        loginPage.getUrlLogin("salesforce.login");
    }

    @Given("^I navigate to Lecc Login page$")
    public void getLeccLoginPage(){
        loginPage.getUrlLogin("lecc.login");
    }

    @When("^I log in org with green icon$")
    public void orgWithGreenIcon() {
        loginPage.EnterLoginData("Green");
        //loginPage.verificationCodebyEmail();
        loginPage.allowLeccAccess();
    }

    @When("^I log in org with yellow icon$")
    public void orgWithYellowIcon() {
        loginPage.EnterLoginData("Yellow");
       // loginPage.verificationCodebyEmail();
        loginPage.allowLeccAccess();
    }

    @Then("^I should Logged In the salesforce page$")
    public void sfLoginValidation(){
        sfHomePage.switchToClassic();
        //loginSteps.loginExpectedResult();
    }







}
