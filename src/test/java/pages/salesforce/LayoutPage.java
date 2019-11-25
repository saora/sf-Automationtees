package pages.salesforce;

import com.FileDataReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.assertj.core.api.SoftAssertions;
import org.jruby.RubyProcess;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

import static java.time.temporal.ChronoUnit.SECONDS;


public class LayoutPage extends PageObject {
    @FindBy(name = "new")
    private WebElementFacade newLayout;

    @FindBy(id = "p1")
    private WebElementFacade layoutName;

    @FindBy(name = "save")
    private WebElementFacade saveLayout;

    @FindBy(xpath = "//div[@id='fieldTrough']/table/tbody/tr/td/div/div")
    private WebElementFacade customJsButtonName;

    @FindBy(className = "draggables-body draggables-body-noheader")
    private WebElementFacade classItemBtnTable;

    @FindBy(id = "quickfind")
    private WebElementFacade findJsButton;

    @FindBy(id = "troughCategory__Button")
    private WebElementFacade lbuttons;

    @FindBy(id = "ext-gen9")
    private WebElementFacade layoutcreatedName;

    @FindBy(id = "errorDiv_ep")
    private WebElementFacade errorMessageLayout;

    @FindBy(id = "troughCategory__Button")
    private WebElementFacade buttonOptFromDropDown;

    @FindBy(id = "ext-gen127")
    private WebElementFacade toElement;

    @FindBy(id = "ext-gen51")
    private WebElementFacade savebtnLayout;

    public void findJsButtonIntoLayout(String jsbuttonName) {
        buttonOptFromDropDown.click();
        findJsButton.sendKeys(jsbuttonName);
        //getDriver().switchTo().frame(0);
       //dragAndDropCustomJsButtonToCustomLayout();
        //Actions action = new Actions(getDriver());
        //action.clickAndHold(getDriver().findElement(By.xpath("//div[@id='fieldTrough']/table/tbody/tr/td/div/div"))).moveToElement(toElement).release().build().perform();
            System.out.println("Js Button Name: "+customJsButtonName.getText());

    }

    public void dragAndDropCustomJsButtonToCustomLayout(){
        withAction().dragAndDrop(customJsButtonName,toElement).build().perform();
    }

    public void saveLayoutConfiguration(){
        savebtnLayout.click();
    }

    public void addCustomLayout(String lName){
        //newLayout.withTimeoutOf(5,SECONDS).waitUntilClickable().click();
        newLayout.waitUntilEnabled().click();
        layoutName.sendKeys(lName);
        saveLayout.click();
        //saveLayout.withTimeoutOf(5,SECONDS).waitUntilClickable().click();
        //Assert.assertTrue(layoutcreatedName.isCurrentlyVisible());

    }


    public void savedLayoutVerification() {
        FileDataReader prop = new FileDataReader();
        try {
            SoftAssertions softAssertions = new SoftAssertions();
            if(layoutcreatedName.isCurrentlyVisible()) {
                softAssertions.assertThat(layoutcreatedName.getText().equals(prop.propertiesFile().getProperty("layout.name"))).isTrue();
            }else{
                Assert.assertFalse(errorMessageLayout.isCurrentlyVisible());
            }
        }catch (IOException e){
            System.out.println("Saved layout. Verification fail !!");
        }



    }


}
