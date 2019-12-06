package pages.lecc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

import java.time.Duration;

public class LeccHomePage extends PageObject {
    @FindBy(id = "form-j_idt62")
    private WebElementFacade jsButtonScan;

    @FindBy(id = "form-j_idt91")
    private WebElementFacade jsButtonConfirm;

    @FindBy(id = "form-j_idt72")
    private WebElementFacade inProgress;

    @FindBy(id = "form-j_idt81")
    private WebElementFacade scanResultYellowIcon;

    @FindBy(id = "form-j_idt78")
    private WebElementFacade getScanResultGreenIcon;

    @FindBy(xpath = "//*[@id=\"form-j_idt78\"]/div[2]")
    private WebElementFacade textResultIcon;

    @FindBy(css = ".slds-text-align_center:nth-child(2)")
    private WebElementFacade outputPanelScanResult;

    @FindBy(className = "slds-grid slds-grid_align-center")
    private WebElementFacade iconContainer;

    public void jsBtnScan(){
        try {
            System.out.println("BEFORE SCAN: " + outputPanelScanResult.getText());
        } catch (Exception e) {
            System.out.println("First scan ...!");
        }
        jsButtonScan.withTimeoutOf(Duration.ofSeconds(10)).click();
    }
    public void confirmScan(){
        getDriver().switchTo().activeElement();
        jsButtonConfirm.click();
    }

    public void scanVerification(String scanType){
        inProgress.getText();
        System.out.println("STATUS: "+outputPanelScanResult.getText());
        switch (scanType){
            case "Green":
                getScanResultGreenIcon.withTimeoutOf(Duration.ofSeconds(120)).waitUntilVisible();
                break;
            case "Yellow":
                scanResultYellowIcon.withTimeoutOf(Duration.ofSeconds(120)).waitUntilVisible();
                break;
        }

        System.out.println("AFTER SCAN: "+outputPanelScanResult.getText());
    }

    public void scanResult(String textValidation) {
            Assert.assertTrue(outputPanelScanResult.getText(),outputPanelScanResult.containsText(textValidation));
    }
}
