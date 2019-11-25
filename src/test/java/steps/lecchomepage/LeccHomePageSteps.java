package steps.lecchomepage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.lecc.LeccHomePage;

public class LeccHomePageSteps extends PageObject {
    private LeccHomePage leccHomePage;

    @Step
    public void scanJsButtonfromHomePage(){
        leccHomePage.jsBtnScan();
    }

    @Step
    public void scanConfirmation(){
        leccHomePage.confirmScan();
    }

    @Step
    public void scanVerificationhp(){
        leccHomePage.scanVerification();
    }

    @Step
    public void leccJsButtonScanResult(){
        leccHomePage.scanResult();
    }
}
