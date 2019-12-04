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
       // waitForCondition().until(ExpectedConditions.elementToBeClickable(jsButtonScan));
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        jsButtonScan.waitUntilClickable().click();
        System.out.println("BEFORE: "+outputPanelScanResult.getText());
    }
    public void confirmScan(){
        getDriver().switchTo().activeElement();
        jsButtonConfirm.click();
       // outputPanelScanResult.waitUntilNotVisible().setImplicitTimeout(Duration.ofSeconds(30));


        //jsButtonConfirm.click();
    }
    public void scanVerification(){
        inProgress.getText();
        System.out.println("Status: "+outputPanelScanResult.getText());
        //getDriver().manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

        scanResultYellowIcon.withTimeoutOf(Duration.ofSeconds(90)).waitUntilVisible();
        //withTimeoutOf(Duration.ofSeconds(60)).getScanResultGreenIcon.waitUntilVisible();
        System.out.println("After: "+outputPanelScanResult.getText());
//        try{
//
//        withTimeoutOf(Duration.ofSeconds(60)).find(By.id("form-j_idt78")).waitUntilVisible();
//            //waitOnPage().until(ExpectedConditions.visibilityOfElementLocated(By.id("form-j_idt81")));
//            System.out.println("Scan for Green :"+scanResultYellowIcon.getText());
//        }catch (Exception e){
//            withTimeoutOf(Duration.ofSeconds(60)).find(By.id("form-j_idt81")).waitUntilVisible();
//            System.out.println("Scan for Yellow :"+scanResultYellowIcon.getText());
//        }
    }

    public void scanResult() {
            Assert.assertTrue(outputPanelScanResult.getText(),outputPanelScanResult.containsText("unconverted buttons are assigned but may not be used"));
    }
}
