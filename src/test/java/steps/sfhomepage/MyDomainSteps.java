package steps.sfhomepage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.salesforce.MyDomainPage;

public class MyDomainSteps extends PageObject {

    private MyDomainPage myDomainPage;

    @Step
    public void step1_MayDomainConfigPage(){
        myDomainPage.goToMyDomain();
    }

    @Step
    public void step2_fillDomainData(String domainName){
        myDomainPage.fillDomainName(domainName);
    }

    @Step
    public void step3_domainDeployment(){
        myDomainPage.domainDeployment();
    }
}
