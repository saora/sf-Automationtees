package steps.login;

import net.thucydides.core.annotations.Step;
import pages.login.LeccLoginPage;
import pages.login.SfLoginPage;
import testdata.LeccLoginData;
import testdata.SfLoginData;

public class LoginSteps {
    private SfLoginPage sfLoginPage;
    private SfLoginData sfLoginData;
    private LeccLoginPage leccLoginPage;
    private LeccLoginData leccLoginData;


    @Step
    public void openLoginPage() {
        sfLoginPage.open();
        sfLoginPage.getDriver().manage().window().maximize();
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
}
