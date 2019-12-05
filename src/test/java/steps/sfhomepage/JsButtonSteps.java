package steps.sfhomepage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pages.lecc.LeccHomePage;
import pages.salesforce.BtnLinksActionsPage;
import pages.salesforce.SfHomePage;
import testdata.ActionData;
import testdata.JsButtonData;

public class JsButtonSteps extends PageObject {

    private SfHomePage sfHomePage;
    private JsButtonData jsButtonData;
    private ActionData actionData;
    private BtnLinksActionsPage btnLinksActionsPage;
    private LeccHomePage leccHomePage;

    @Step
    public void jsButtonObject(String obj){
        sfHomePage.buildOption();
        sfHomePage.selSalesforceObject(obj);
    }

    @Step
    public void ObjectAndNewJsButton(){
        sfHomePage.selObjectOption("Buttons, Links, and Actions");
        btnLinksActionsPage.clickOption("New Button or Link");
    }

    @Step
    public void newJsButton() {
        //jsButtonData.getDataJsButton();
        jsButtonData.jsButtonTesData();
    }

    @Step
    public void logoutsf(){
        sfHomePage.selLogOut();
        getDriver().close();
    }


    @Step
    public void newAction()throws Exception{
        actionData.getDataNewAction();
    }

    @Step
    public void jsButtonverify(){
       // btnLinksActionsPage.objBtnLinkVerification();
    }
}
