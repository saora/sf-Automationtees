package pages.salesforce;

import jdk.nashorn.internal.objects.annotations.Function;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jruby.RubyProcess;
import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;

public class MyDomainPage extends PageObject {

    @FindBy(id = "Domains_font")
    private WebElementFacade select_domainManagement;

    @FindBy(id = "OrgDomain_font")
    private WebElementFacade select_myDomainOrg;

    @FindBy(id = "thePage:domainBlock:domainForm:domainIn")
    private WebElementFacade fillDomainName;

    @FindBy(id = "thePage:domainBlock:domainForm:checkAvailability")
    private WebElementFacade click_checkAvailability;

    @FindBy(id = "thePage:domainBlock:domainForm:saveChoice")
    private WebElementFacade click_registerDomain;

    @FindBy(xpath = "//*[@id='thePage:domainBlock:domainForm:saveDomainPanel']/span")
    private WebElementFacade availableCheck;

    @FindBy(id = "thePage:domainBlock:stepTwoActive")
    private WebElementFacade step2_DomainRegistrationPending;

    @FindBy(id = "thePage:domainBlock:stepThreeActive")
    private WebElementFacade step3_DomainReadyForTesting;

    @FindBy(id = "thePage:domainBlock:ssoForm:sso")
    private WebElementFacade click_loginDomain;

    @FindBy(id = "thePage:domainBlock:deployForm:deploy")
    private WebElementFacade click_deployForUsers;

    @FindBy(id = "thePage:domainBlock:stepFourActive")
    private WebElementFacade step4_domainDeplyedForUsers;

    @FindBy(xpath = "//*[@id='thePage:domainBlock']/div[1]/table/tbody/tr/td[1]/h2")
    private WebElementFacade domainStep4Title;

    public void goToMyDomain(){
        select_domainManagement.click();
        select_myDomainOrg.click();
    }

    public void fillDomainName(String domainName){
        fillDomainName.sendKeys(domainName);
        click_checkAvailability.click();
        if(availableCheck.getText().equals("available")){
            click_registerDomain.click();
        }else{
            System.out.println("The domain "+domainName+" cannot be registered");
        }
    }

    public void domainDeployment(){
            click_loginDomain.withTimeoutOf(Duration.ofSeconds(120)).waitUntilVisible().click();
            click_deployForUsers.click();
            getDriver().switchTo().alert().accept();
            Assert.assertEquals("My Domain Step 4",domainStep4Title.getText());
        }









}
