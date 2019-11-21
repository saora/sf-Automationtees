package pages.login;

import jdk.jfr.Timespan;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;


//@DefaultUrl("https://login.stmpa.stm.salesforce.com/")
@DefaultUrl("https://login.salesforce.com/?locale=eu")
public class SfLoginPage extends PageObject {
    @FindBy(id = "username")
    private WebElementFacade user;

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


    public void setLoginData(String user, String pass){
        this.user.sendKeys(user);
        this.pass.sendKeys(pass);
    }

    public void setOrgUser(String orgUser){
        this.user.sendKeys(orgUser);
    }

    public void setOrgPass(String orgPass){
        this.pass.sendKeys(orgPass);
    }

    public void submitBtn(){
        this.submiSftBtn.click();
    }

    public void setVerificationCode(String verifyCode){
        fillVerificationCode.sendKeys(verifyCode);
        click_Verify.click();
    }


    public void salesforceLoginVerification(){
        if(salesforceLightningHomeLogo.isCurrentlyVisible()){
            Assert.assertTrue(salesforceLightningHomeLogo.isCurrentlyVisible());
        }else{
            Assert.assertTrue(salesforceClassicHomeLogo.isCurrentlyVisible());
        }

    }


}
