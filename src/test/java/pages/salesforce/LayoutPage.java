package pages.salesforce;

import com.FileDataReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

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

    private SfHomePage sfHomePage;
    private FileDataReader prop = new FileDataReader();

    private BtnLinksActionsPage btnLinksActionsPage;
    public void newCustomLayout(){
        sfHomePage.selObjectOption("Page Layouts");
        newLayout.waitUntilEnabled().click();
        layoutName.sendKeys(prop.propertiesFile().getProperty("layout.name"));
        saveLayout.click();

        try {
            if (layoutcreatedName.isCurrentlyVisible()) {
                Assert.assertEquals(layoutcreatedName.getText(), prop.propertiesFile().getProperty("layout.name"));
            } else {
                Assert.assertFalse(errorMessageLayout.isCurrentlyVisible());
            }
        } catch (Exception e) {
            System.out.println("Saved layout. Verification fail !!");
        }

        buttonOptFromDropDown.click();
        findJsButton.sendKeys(prop.propertiesFile().getProperty("layout.name"));
        System.out.println("Js Button Name: "+customJsButtonName.getText());

        withAction().dragAndDrop(customJsButtonName,toElement).build().perform();

        savebtnLayout.click();

    }



}
