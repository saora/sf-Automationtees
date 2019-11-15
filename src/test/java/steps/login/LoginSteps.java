package steps.login;

import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import net.thucydides.core.annotations.Step;
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
    public void openLoginPage() {
        sfLoginPage.getDriver().manage().window().maximize();
        sfLoginPage.open();
    }

    @Step
    public void openLeccLoginPage(){
        leccLoginPage.open();
        leccLoginPage.getDriver().manage().window().maximize();
    }

    @Step
    public void sendLoginData()throws Exception {
        //sfLoginData.loginSalesforce();
        sfLoginData.sfEnterLoginData();

    }

    @Step
    public void sendLeccLoginData()throws Exception{
        //leccLoginData.loginLecc();
          sfLoginData.sfEnterLoginData();

    }

    @Step
    public void loginExpectedResult(){
        sfLoginPage.salesforceLoginVerification();
    }
}
