package stepsdefinition.lecc;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;
import net.thucydides.core.annotations.Steps;
import steps.lecchomepage.LeccHomePageSteps;
import steps.login.LoginSteps;
import steps.sfhomepage.JsButtonSteps;
import steps.sfhomepage.LayoutSteps;

public class OrangeJsButtonStepsDefinition {
    @Steps
    private LoginSteps loginSteps;
    private LayoutSteps layoutSteps;
    private JsButtonSteps jsButtonSteps;
    private LeccHomePageSteps leccHomePageSteps;

    @Given("^I logs in salesforce page$")
    public void loginSalesforce(){
        //loginSteps.openLoginPage("https://login.salesforce.com/?locale=eu");
        loginSteps.sendLoginData("salesforce.login");
        loginSteps.verificationCodeForLogin();
        loginSteps.switchToClassicMode();
    }

    @When("^I create a Js Button$")
    public void createJsButton(){
        jsButtonSteps.jsButtonObject("Campaigns");
        jsButtonSteps.ObjectAndNewJsButton();
        jsButtonSteps.newJsButton();
    }

    @An("^I create a new custom Layout$")
    public void createCustomLayout() {
        layoutSteps.addJsButtonToLayout("Page Layouts");
        layoutSteps.getCustomLayoutName();
    }
    @Then(value = "^I add the Js Button to a custom laytout$")
    public void addJsButtonToLayout(){
        layoutSteps.addJsButtonToLayout();
        layoutSteps.dragAndDropJsButton();
        layoutSteps.saveLayout();
    }

    @Given("^I log in Lecc$")
    public void loginLecc(){
       // loginSteps.openLoginPage("https://js-mover-dev.herokuapp.com/home.xhtml");
        loginSteps.sendLoginData("lecc.login");
        //loginSteps.openLeccLoginPage();
       // loginSteps.openLoginPage("lecc.login");

    }
    @When("^I scan Js Button$")
    public void scanJsButton(){
        leccHomePageSteps.scanJsButtonfromHomePage();
        leccHomePageSteps.scanConfirmation();
    }

    @Then("^I should get the scanning results$")
    public void getScanResult(){
        leccHomePageSteps.leccJsButtonScanResult();
    }
}
