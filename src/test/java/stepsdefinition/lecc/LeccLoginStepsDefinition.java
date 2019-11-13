package stepsdefinition.lecc;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.login.LeccLoginPage;
import steps.lecchomepage.LeccHomePageSteps;
import steps.login.LoginSteps;

public class LeccLoginStepsDefinition {

    @Steps
    private LoginSteps loginSteps;
    private LeccLoginPage leccLoginPage;
    private LeccHomePageSteps leccHomePageSteps;

    @Given("^I navigate to the Login Lecc page$")
    public void openLeccHomePage(){
        loginSteps.openLeccLoginPage();
        leccLoginPage.openLecc();

    }
    @When("^I submit the username and password for lecc$")
    public void fillUserData()throws Exception{
        loginSteps.sendLeccLoginData();
    }
    @Then("^I should Logged In Lecc home page$")
    public void loginVerification(){}
}
