package pages.lecc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LeccHomePage extends PageObject {

    @FindBy(id = "spinner")
    private WebElementFacade spinner;

    // Javascript Buttons
    @FindBy(id = "form-j_idt67")
    private WebElementFacade outputPannelFirstScan_JSB;

    @FindBy(id = "form-j_idt62")
    private WebElementFacade clickScan_JSB;

    @FindBy(id = "form-j_idt91")
    private WebElementFacade clickLetsDoit_JSB;

    @FindBy(id = "form-j_idt72")
    private WebElementFacade inProgress_JSB;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/form/div[2]/div/div/div/div[2]/div/div[1]/div/article/div[2]/div")
    private WebElementFacade outputPannel_JSB;

    @FindBy(id = "form-j_idt78")
    private WebElementFacade outputPannel_JSB_GREEN;

    @FindBy(id = "form-j_idt81")
    private WebElementFacade getOutputPannel_JSB_YELLOW;

    @FindBy(id = "form-j_idt74")
    private WebElementFacade loadingTextContainer_JSB;

    // Actions & Buttons
    @FindBy(id = "form-j_idt119")
    private WebElementFacade outputPannelFirstScan_AAB;

    @FindBy(id = "form-j_idt98")
    private WebElementFacade clickScan_AAB;

    @FindBy(id = "form-j_idt126")
    private WebElementFacade clickLetsDoit_AAB;

    @FindBy(id = "form-j_idt108")
    private WebElementFacade outputPannel_AAB;

    @FindBy(id = "form-j_idt115")
    private WebElementFacade loadingTextContainer_AAB;

    //form-j_idt113
    @FindBy(id = "form-j_idt111")
    private WebElementFacade inProgress_AAB;

    // Visual force pages
    @FindBy(id = "form-j_idt147")
    private WebElementFacade outputPannelFirstScan_VFP;

    @FindBy(id = "form-j_idt138")
    private WebElementFacade outputPannel_VFP;

    @FindBy(id = "form-j_idt133")
    private WebElementFacade clickScan_VFP;

    @FindBy(id = "form-j_idt162")
    private WebElementFacade clickLetsDoit_VFP;

    @FindBy(id = "form-j_idt152")
    private WebElementFacade inProgress_VFP;

    @FindBy(id = "form-j_idt154")
    private WebElementFacade loadingTextContainer_VFP;

    //Hard-Coded URLs
    @FindBy(id = "form-j_idt185")
    private WebElementFacade outputPannelFirstScan_HCU;

    @FindBy(id = "form-j_idt169")
    private WebElementFacade clickScan_HCU;

    @FindBy(id = "form-j_idt195")
    private WebElementFacade clickLetsDoit_HCU;

    @FindBy(id = "form-j_idt173")
    private WebElementFacade inProgress_HCU;

    @FindBy(id = "form-j_idt182")
    private WebElementFacade outputPannel_HCU;

    @FindBy(id = "form-j_idt175")
    private WebElementFacade loadingTextContainer_HCU;

    //App Exchange Packages
    @FindBy(id = "form-noScanPerformedAppex")
    private WebElementFacade outputPannelFirstScan_AEP;

    @FindBy(id = "form-j_idt202")
    private WebElementFacade clickScan_AEP;

    @FindBy(id = "form-j_idt229")
    private WebElementFacade clickLetsDoit_AEP;

    @FindBy(id = "form-j_idt210")
    private WebElementFacade inProgress_AEP;

    @FindBy(id = "form-j_idt216")
    private WebElementFacade outputPannel_AEP;

    @FindBy(id = "form-j_idt212")
    private WebElementFacade loadingTextContainer_AEP;




    private void clickOnElement(WebElementFacade element){
            element.waitUntilClickable().click();
    }

    private void waitUntilPageIsReady(){
        do{
            System.out.println("Waiting until page is ready for scan... !!!");
        }while(loadingTextContainer_JSB.isCurrentlyVisible()||loadingTextContainer_AAB.isCurrentlyVisible()||loadingTextContainer_VFP.isCurrentlyVisible()||loadingTextContainer_HCU.isCurrentlyVisible()||loadingTextContainer_AEP.isCurrentlyVisible());
    }

    public void javascriptButtonScan(){
        waitUntilPageIsReady();
        if(outputPannelFirstScan_JSB.isCurrentlyVisible()){
            System.out.println("First Js Button scan.. "+outputPannelFirstScan_JSB.getText());
        }else{
            System.out.println("Before scan.. "+outputPannel_JSB.getText());
        }
        clickOnElement(clickScan_JSB);
        clickOnElement(clickLetsDoit_JSB);
        inProgress_JSB.withTimeoutOf(Duration.ofSeconds(5)).waitUntilPresent();
        System.out.println("Status.. "+inProgress_JSB.getText());
        outputPannel_JSB.withTimeoutOf(Duration.ofSeconds(90)).waitUntilVisible();
        System.out.println("After scan.. .. "+outputPannel_JSB.getText());
    }

    public void actionAndButtonScan(){
        waitUntilPageIsReady();
        if(outputPannelFirstScan_AAB.isCurrentlyVisible()){
            System.out.println("First Actions and Buttons Scan.. "+outputPannelFirstScan_AAB.getText());
        }else{
            System.out.println("Before scan.. "+outputPannel_AAB.getText());
        }
        clickOnElement(clickScan_AAB);
        clickOnElement(clickLetsDoit_AAB);
        inProgress_AAB.withTimeoutOf(Duration.ofSeconds(5)).waitUntilPresent();
        System.out.println("Status.. "+inProgress_AAB.getText());
        outputPannel_AAB.withTimeoutOf(Duration.ofSeconds(90)).waitUntilVisible();
        System.out.println("After scan.. .. "+outputPannel_AAB.getText());
    }

    public void scanVisualforcePages(){
        waitUntilPageIsReady();
        if(outputPannelFirstScan_VFP.isCurrentlyVisible()){
            System.out.println("First Visualforce Pages scan.. "+outputPannelFirstScan_VFP.getText());
        }else{
            System.out.println("Before scan.. "+outputPannel_VFP.getText());
        }
        clickOnElement(clickScan_VFP);
        clickOnElement(clickLetsDoit_VFP);
        inProgress_VFP.withTimeoutOf(Duration.ofSeconds(5)).waitUntilPresent();
        System.out.println("Status.. "+inProgress_VFP.getText());
        outputPannel_VFP.withTimeoutOf(Duration.ofSeconds(90)).waitUntilVisible();
        System.out.println("After scan.. .. "+outputPannel_VFP.getText());
    }

    public void scanHardCodedUrls(){
        waitUntilPageIsReady();
        if(outputPannelFirstScan_HCU.isCurrentlyVisible()){
            System.out.println("First Visualforce Pages scan.. "+outputPannelFirstScan_HCU.getText());
        }else{
            System.out.println("Before scan.. "+outputPannel_HCU.getText());
        }
        clickOnElement(clickScan_HCU);
        clickOnElement(clickLetsDoit_HCU);
        inProgress_HCU.withTimeoutOf(Duration.ofSeconds(5)).waitUntilPresent();
        System.out.println("Status.. "+inProgress_HCU.getText());
        outputPannel_HCU.withTimeoutOf(Duration.ofSeconds(90)).waitUntilVisible();
        System.out.println("After scan.. .. "+outputPannel_HCU.getText());
    }

    public void scanAppExchangePackages(){
        waitUntilPageIsReady();
        if(outputPannelFirstScan_AEP.isCurrentlyVisible()){
            System.out.println("First Visualforce Pages scan.. "+outputPannelFirstScan_AEP.getText());
        }else{
            System.out.println("Before scan.. "+outputPannel_AEP.getText());
        }
        clickOnElement(clickScan_AEP);
        clickOnElement(clickLetsDoit_AEP);
        inProgress_AEP.withTimeoutOf(Duration.ofSeconds(5)).waitUntilPresent();
        System.out.println("Status.. "+inProgress_AEP.getText());
        outputPannel_AEP.withTimeoutOf(Duration.ofSeconds(90)).waitUntilVisible();
        System.out.println("After scan.. .. "+outputPannel_AEP.getText());
    }

    public void scanJsButtonResult(String txtScanJSB) {
        Assert.assertTrue(outputPannel_JSB.getText(),outputPannel_JSB.containsText(txtScanJSB));
    }

    public void scanResultActionsAndButtons(String txtScanAAB){
        Assert.assertTrue(outputPannel_AAB.getText(),outputPannel_AAB.containsText(txtScanAAB));
    }

    public void scanResultVisualforcePages(String txtScanVFP){
        Assert.assertTrue(outputPannel_VFP.getText(),outputPannel_VFP.containsText(txtScanVFP));
    }

    public void scanResultHardCodedUrls(String txtScanHCU){
        Assert.assertTrue(outputPannel_HCU.getText(),outputPannel_HCU.containsText(txtScanHCU));
    }

    public void scanResultAppExchangePackages(String txtScanAEP){
        Assert.assertTrue(outputPannel_AEP.getText(),outputPannel_AEP.containsText(txtScanAEP));
    }
}
