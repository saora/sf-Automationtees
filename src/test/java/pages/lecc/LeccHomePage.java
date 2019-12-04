package pages.lecc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jruby.RubyProcess;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
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

    @FindBy(xpath = "//*[@id=\"form-j_idt78\"]/div[2]")
    private WebElementFacade textResultIcon;

    @FindBy(css = ".slds-text-align_center:nth-child(2)")
    private WebElementFacade outputPanelScanResult;

    @FindBy(className = "slds-grid slds-grid_align-center")
    private WebElementFacade iconContainer;

    public void jsBtnScan(){
        jsButtonScan.withTimeoutOf(Duration.ofSeconds(10)).click();
       // jsButtonScan.waitUntilClickable().click();
        System.out.println("BEFORE SCAN: "+outputPanelScanResult.getText());
    }
    public void confirmScan(){
        getDriver().switchTo().activeElement();
        jsButtonConfirm.click();

    }
    public void scanVerification(){
        inProgress.getText();
        System.out.println("STATUS: "+outputPanelScanResult.getText());
        scanResultYellowIcon.withTimeoutOf(Duration.ofSeconds(90)).waitUntilVisible();
        System.out.println("AFTER SCAN: "+outputPanelScanResult.getText());
          //waitOnPage().until(ExpectedConditions.visibilityOfElementLocated(By.id("form-j_idt81")));
    }

    public void scanResult() {
            Assert.assertTrue(outputPanelScanResult.getText(),outputPanelScanResult.containsText("unconverted buttons are assigned but may not be used"));
    }
}
