package pages.lecc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jruby.RubyProcess;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

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

    @FindBy(className = "slds-text-align_center slds-p-around_medium slds-text-heading_small")
    private WebElementFacade textResultIcon;

    @FindBy(className = "ui-outputpanel ui-widget")
    private WebElementFacade outputPanelScanResult;

    public void jsBtnScan(){
       // waitForCondition().until(ExpectedConditions.elementToBeClickable(jsButtonScan));
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        jsButtonScan.waitUntilClickable().click();
    }
    public void confirmScan(){
        getDriver().switchTo().activeElement();
        jsButtonConfirm.click();
        //jsButtonConfirm.click();
    }
    public void scanVerification(){
       // waitForCondition().until(ExpectedConditions.textToBePresentInElement(inProgress,"Scan in progress"));
        inProgress.getText();
    }

    public void scanResult(){
        getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //outputPanelScanResult.getText();
        //System.out.println("RESULT: "+outputPanelScanResult.getText());
        Assert.assertTrue(scanResultYellowIcon.isCurrentlyVisible());
        try {
            System.out.println("SCAN RESULT: "+scanResultYellowIcon.getText());
        }catch (Exception e){
            System.out.println("Fail for yellow icon!!");
        }


        //Assert.assertEquals(outputPanelScanResult.containsText("unconverted buttons are assigned but may not be used"),outputPanelScanResult.getText());
    }
}
