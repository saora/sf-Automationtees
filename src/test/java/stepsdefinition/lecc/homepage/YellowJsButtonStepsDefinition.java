package stepsdefinition.lecc.homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;
import net.thucydides.core.annotations.Steps;

import org.junit.Assert;
import pages.lecc.LeccHomePage;
import steps.lecchomepage.LeccHomePageSteps;
import steps.login.LoginSteps;
import steps.sfhomepage.JsButtonSteps;
import steps.sfhomepage.LayoutSteps;

public class YellowJsButtonStepsDefinition {
    @Steps
    private LoginSteps loginSteps;
    private LayoutSteps layoutSteps;
    private JsButtonSteps jsButtonSteps;
    private LeccHomePageSteps leccHomePageSteps;

    @Given("^I logs in salesforce page$")
    public void loginSalesforce(){
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
        loginSteps.sendLoginData("lecc.login");
        loginSteps.verificationCodeForLogin();
        loginSteps.allowAccessToLeccHomePages();
    }
    @When("^I scan Js Button$")
    public void scanJsButton(){
        leccHomePageSteps.scanJsButtonfromHomePage();
        leccHomePageSteps.scanConfirmation();
        leccHomePageSteps.scanVerificationhp();
    }

    @Then("^I should get the scanning results$")
    public void getScanResult(){
        leccHomePageSteps.leccJsButtonScanResult("unconverted buttons are assigned but may not be used");
    }
}
