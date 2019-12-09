package stepsdefinition.salesforce;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.login.LoginPage;

import com.TrustedIpNetworkAccess;

import java.io.IOException;

public class NetworkAccessStepsDefinition {
    @Steps
    private LoginPage loginPage;
    private TrustedIpNetworkAccess trustedIpNetworkAccess;

    @Given("I navigate to Saleforce Login page")
    public void openSfLoginPage() {
        loginPage.getUrlLogin("salesforce.login");
        loginPage.EnterLoginData("Green");
        loginPage.verificationCodebyEmail();
    }

    @When("I submit the username and password")
    public void fillDataLogin() throws IOException {
        trustedIpNetworkAccess.setIPConfiguration();
    }


}
