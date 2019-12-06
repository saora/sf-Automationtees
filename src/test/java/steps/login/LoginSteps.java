package steps.login;

import cucumber.api.java.Before;
import net.thucydides.core.annotations.Step;
import org.joda.time.Seconds;
import pages.login.LeccLoginPage;
import pages.login.SfLoginPage;
import pages.salesforce.SfHomePage;
import testdata.LeccLoginData;
import testdata.SfLoginData;

public class LoginSteps {
    private SfLoginPage sfLoginPage;
    private SfLoginData sfLoginData;
    private LeccLoginPage leccLoginPage;
    private LeccLoginData leccLoginData;
    private SfHomePage sfHomePage;

    @Step
    public void openLoginPage(String urlapplication) {
        sfLoginPage.getDriver().manage().window().maximize();
        sfLoginData.geturlFroLogin(urlapplication);

        // sfLoginPage.open();
    }

    @Step
    public void sendLoginData(String orgWithIcon) {
        sfLoginData.sfEnterLoginData(orgWithIcon);
    }

    public void openLeccLoginPage(){
        leccLoginPage.openLecc();
    }

    @Step
    public void verificationCodeForLogin(){
        sfLoginData.verificationCodebyEmail();
    }
    public void allowAccessToLeccHomePages(){
        leccLoginPage.allowLeccAccess();
    }

    @Step
    public void switchToClassicMode(){
        sfHomePage.switchToClassic();
    }

    @Step
    public void loginExpectedResult(){
        sfLoginPage.salesforceLoginVerification();
    }
}
