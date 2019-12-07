package stepsdefinition.lecc.home;

import net.thucydides.core.annotations.Steps;
import steps.lecchomepage.LeccHomePageSteps;
import steps.login.LoginSteps;
import steps.sfhomepage.JsButtonSteps;
import steps.sfhomepage.LayoutSteps;
import steps.sfhomepage.MyDomainSteps;

public class ScanActionsStepsDefinition {
    @Steps
    private LoginSteps loginSteps;
    private LayoutSteps layoutSteps;
    private JsButtonSteps jsButtonSteps;
    private LeccHomePageSteps leccHomePageSteps;
    private MyDomainSteps myDomainSteps;

//    @Given("^I logs in salesforce page$")
//    public void loginSalesforce(){
//        loginSteps.sendLoginData();
//        loginSteps.verificationCodeForLogin();
//        loginSteps.switchToClassicMode();
//    }

//    @When("^I create a Js Button$")
//    public void createJsButton(){
//        jsButtonSteps.jsButtonObject("Campaigns");
//        jsButtonSteps.ObjectAndNewJsButton();
//        jsButtonSteps.newJsButton();
//    }
//
//    @And("^I create a new custom Layout$")
//    public void createCustomLayout() {
//        layoutSteps.addJsButtonToLayout("Page Layouts");
//        layoutSteps.getCustomLayoutName();
//    }
//    @Then("^I add the Js Button to a custom laytout$")
//    public void addJsButtonToLayout(){
//        layoutSteps.addJsButtonToLayout();
//        layoutSteps.dragAndDropJsButton();
//        layoutSteps.saveLayout();
//    }
//    @Then("^I create MyDomain$")
//    public void createMyDomain(){
//        myDomainSteps.step1_MayDomainConfigPage();
//        myDomainSteps.step2_fillDomainData("testautomationdomain");
//        myDomainSteps.step3_domainDeployment();
//    }
//
//
//    @Given("^I log in Lecc$")
//    public void loginLecc(){
//        loginSteps.sendLoginData();
//        loginSteps.verificationCodeForLogin();
//        loginSteps.allowAccessToLeccHomePages();
//    }
//    @When("^I scan Js Button$")
//    public void scanJsButton(){
//        leccHomePageSteps.scanJsButtonfromHomePage();
//        leccHomePageSteps.scanConfirmation();
//        leccHomePageSteps.scanVerificationhp();
//    }
//
//    @Then("^I should get a green icon in the scanning results$")
//    public void getScanResult(){
//        leccHomePageSteps.leccJsButtonScanResult("No action required");
//    }

}
