package stepsdefinition.lecc.home;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import pages.lecc.LeccHomePage;

public class ScanVfPageStepsDefinition {

    @Steps
    private LeccHomePage leccHomePage;

    @And("^I scan Visualforce Pages green icon$")
    public void scanVisualforcePages(){
        leccHomePage.scanVisualforcePages();
    }

    @And ("^I should get green icon in the scanning results for Visualforce Pages$")
    public void getScanResultForVisualforcePages(){
        leccHomePage.scanResultVisualforcePages("No action required");
    }

    @And("^I scan Visualforce Pages yellow icon$")
    public void scanVisualforcePagesYellow(){
        leccHomePage.scanVisualforcePages();
    }

    @And ("^I should get yellow icon in the scanning results for Visualforce Pages$")
    public void getScanResultForVisualforcePagesYellow(){
        leccHomePage.scanResultVisualforcePages("......");
    }

}
