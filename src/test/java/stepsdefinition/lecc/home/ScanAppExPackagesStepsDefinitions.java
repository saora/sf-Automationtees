package stepsdefinition.lecc.home;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import pages.lecc.LeccHomePage;

public class ScanAppExPackagesStepsDefinitions {
    @Steps
    private LeccHomePage leccHomePage;

    @And("^I scan App Exchange Packages green icon$")
    public void scanAppExchangePackagesGreen(){
        leccHomePage.scanAppExchangePackages();
    }

    @And ("^I should get green icon in the scanning results for App Exchange Packages$")
    public void getScanResultForAppExchangePackagesGreen(){
        leccHomePage.scanResultAppExchangePackages("Packages are ready for Lightning Experience");
    }

    @And("^I scan App Exchange Packages yellow icon$")
    public void scanAppExchangePackagesYelow(){
        leccHomePage.scanAppExchangePackages();
    }

    @And ("^I should get yellow icon in the scanning results for App Exchange Packages$")
    public void getScanResultForAppExchangePackagesYellow(){
        leccHomePage.scanResultAppExchangePackages("text");
    }

}
