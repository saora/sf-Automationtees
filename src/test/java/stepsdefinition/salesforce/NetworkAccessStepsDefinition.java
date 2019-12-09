package stepsdefinition.salesforce;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.login.LoginSteps;
import testdata.TrustedIpNetworkAccess;

import java.io.IOException;

public class NetworkAccessStepsDefinition {
    @Steps
    private LoginSteps loginSteps;
    private TrustedIpNetworkAccess trustedIpNetworkAccess;

    @Given("I navigate to Saleforce Login page")
    public void openSfLoginPage() {
        loginSteps.openLoginPage("salesforce.login");
        loginSteps.sendLoginData("Green");
        loginSteps.verificationCodeForLogin();
    }

    @When("I submit the username and password")
    public void fillDataLogin() throws IOException {
        trustedIpNetworkAccess.setIPConfiguration();
    }


}
