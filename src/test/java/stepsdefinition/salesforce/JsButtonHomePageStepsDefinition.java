package stepsdefinition.salesforce;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.lecc.LeccHomePage;
import pages.login.LeccLoginPage;
import pages.salesforce.SfHomePage;
import steps.lecchomepage.LeccHomePageSteps;
import steps.login.LoginSteps;
import steps.sfhomepage.JsButtonSteps;
import steps.sfhomepage.LayoutSteps;

public class JsButtonHomePageStepsDefinition {
    @Steps
    private LoginSteps loginSteps;
    private JsButtonSteps jsButtonSteps;
    private LayoutSteps layoutSteps;
    private LeccLoginPage leccLoginPage;
    private LeccHomePage leccHomePage;
    private SfHomePage sfHomePage;
    private LeccHomePageSteps leccHomePageSteps;


//    @Given("^I navigate to the Login page$")
//    public void getLoginPage(){
//        loginSteps.openLoginPage();
//    }
//
//    @When("^I submit the username and password$")
//    public void fillData()throws Exception {
//        loginSteps.sendLoginData();
//    }
//
//    @Then("^I should Logged In$")
//    public void verifyAcct()throws Exception {
//    }
//JS BUTTONS
//    @Given("^I click on new Js Button$")
//    public void selectNewJsButton()throws Exception{
//        jsButtonSteps.jsButtonActions("Campaigns");
//    }
//    @When("^I submit Js Button Informtion$")
//    public void submitJsButtonInfo()throws Exception{
//        jsButtonSteps.newJsButton();
//        layoutSteps.addJsButtonToLayout("Page Layouts","lecclayouthomepage010");
//    }
//    @Then("^I should create a new Js Button$")
//    public void newJsButtonVerification(){
//        jsButtonSteps.jsButtonverify();
//        jsButtonSteps.logoutsf();
//    }

//LECC HOME PAGE
//    @Given("^I Open Lecc Home page$")
//    public void openLeccHomePage() throws Exception{
//        loginSteps.openLeccLoginPage("https://js-mover-dev.herokuapp.com/home.xhtml");
//        leccLoginPage.openLecc();
//        loginSteps.sendLeccLoginData();
//
//
//    }
//    @When("^I Scan Js Buttons$")
//    public void scanJsButton(){
//      leccHomePageSteps.scanJsButtonfromHomePage();
//    }
//    @Then("^I Verify the results$")
//    public void verifyScan(){}

}
