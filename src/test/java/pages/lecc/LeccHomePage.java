package pages.lecc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LeccHomePage extends PageObject {
    @FindBy(xpath = "//*[@id=\"form-j_idt64\"]/span")
    private WebElementFacade jsButtonScan;

    @FindBy(id = "form-j_idt88")
    private WebElementFacade jsButtonConfirm;

    @FindBy(id = "form-j_idt72")
    private WebElementFacade inProgress;

    public void jsBtnScan(){
        //waitForCondition().until(ExpectedConditions.elementToBeClickable(jsButtonScan));
        //waitFor("//*[@id=\"form-j_idt64\"]/span");
        //System.out.println();
        jsButtonScan.click(); }
    public void scanInprogress(){
        jsButtonConfirm.click();
    }
    public void scanVerification(){
        waitForCondition().until(ExpectedConditions.textToBePresentInElement(inProgress,"Scan in progress"));
        inProgress.getText();
    }
}
