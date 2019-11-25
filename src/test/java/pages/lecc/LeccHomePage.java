package pages.lecc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jruby.RubyProcess;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.util.concurrent.TimeUnit.SECONDS;

public class LeccHomePage extends PageObject {
    @FindBy(id = "form-j_idt62")
    private WebElementFacade jsButtonScan;

    @FindBy(id = "form-j_idt91")
    private WebElementFacade jsButtonConfirm;

    @FindBy(id = "form-j_idt72")
    private WebElementFacade inProgress;

    @FindBy(id = "form-j_idt81")
    private WebElementFacade scanResult;

    public void jsBtnScan(){
        //waitForCondition().until(ExpectedConditions.elementToBeClickable(jsButtonScan));
        //waitFor("//*[@id=\"form-j_idt64\"]/span");
        //System.out.println();

        jsButtonScan.click(); }
    public void confirmScan(){
        jsButtonConfirm.click();
    }
    public void scanVerification(){
        waitForCondition().until(ExpectedConditions.textToBePresentInElement(inProgress,"Scan in progress"));
        inProgress.getText();
    }

    public void scanResult(){
        scanResult.getText();
        System.out.println("RESULT: "+scanResult.getText());
    }
}
