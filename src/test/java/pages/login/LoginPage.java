package pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jruby.RubyProcess;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;


//@DefaultUrl("https://login.stmpa.stm.salesforce.com/")
//@DefaultUrl("https://login.salesforce.com/?locale=eu")
public class SfLoginPage extends PageObject {
    @FindBy(id = "username")
    private static WebElementFacade user;

    @FindBy(id = "password")
    private WebElementFacade pass;

    @FindBy(id = "Login")
    private WebElementFacade submiSftBtn;

    @FindBy(id = "emc")
    private static WebElementFacade fillVerificationCode;

    @FindBy(id = "save")
    private static WebElementFacade click_Verify;

    //LOGIN
    @FindBy(className = "slds-global-header__logo")
    private WebElementFacade salesforceLightningHomeLogo;

    @FindBy(id = "phHeaderLogoImage")
    private WebElementFacade salesforceClassicHomeLogo;


    @FindBy(xpath = "/html/body/div[3]/div/div[4]")
    private WebElementFacade loginRightPanel;

    @FindBy(className = "btn-container ")
    private WebElementFacade btnfreetrial;


    public void setOrgUser(String orgUser){
        user.sendKeys(orgUser);
    }

    public void setOrgPass(String orgPass){
        this.pass.sendKeys(orgPass);
    }

    public void submitBtn(){
            submiSftBtn.click();
        //withTimeoutOf(Duration.ofSeconds(30)).find(By.id("Login")).click();
    }

    public void emailVerificationCode(String verifyCode){
            fillVerificationCode.withTimeoutOf(Duration.ofSeconds(5)).waitUntilPresent().sendKeys(verifyCode);
            click_Verify.withTimeoutOf(Duration.ofSeconds(5)).waitUntilClickable().click();
    }



    public void salesforceLoginVerification(){
        Assert.assertTrue(salesforceClassicHomeLogo.isDisplayed());
    }


}
