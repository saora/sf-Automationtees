package stepsdefinition.salesforce;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Step;
import pages.salesforce.MyDomainPage;

public class MyDomainStepsDefinition {
    private MyDomainPage myDomainPage;

    @Then(" I go to MyDomain")
    public void goToMyDomainSection(){
        myDomainPage.goToMyDomain();

    }

    @And("I register a new domain")
    public void registerMyDomain(){
        myDomainPage.fillDomainName("testsfdomain");
    }

    @And ("I deploy MyDomain")
    public void deployMayDomain(){
        myDomainPage.domainDeployment();

    }


}
