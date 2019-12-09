package stepsdefinition.lecc.home;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import pages.lecc.LeccHomePage;

public class ScanHCodedUrlStepsDefinition {
    @Steps
    private LeccHomePage leccHomePage;

    @And("^I scan Hard-Coded URLs green icon$")
    public void scanHardCodedUrlGreen(){
        leccHomePage.scanHardCodedUrls();
    }

    @And ("^I should get green icon in the scanning results for Hard-Coded URLs$")
    public void getScanResultForHardCodedUrlGreen(){
        leccHomePage.scanResultHardCodedUrls("No action required");
    }

    @And("^I scan Hard-Coded URLs Orange icon$")
    public void scanHardCodedUrlsOrange(){
        leccHomePage.scanHardCodedUrls();
    }

    @And ("^I should get Orange icon in the scanning results for Hard-Coded URLs$")
    public void getScanResultForHardCodedUrlOrange(){
        leccHomePage.scanResultHardCodedUrls("URLs require update");
    }

}
