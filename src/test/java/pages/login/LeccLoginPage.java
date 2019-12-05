package pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.exceptions.ElementShouldBeEnabledException;

import java.util.concurrent.TimeUnit;

//@DefaultUrl("https://js-mover-dev.herokuapp.com/home.xhtml")
public class LeccLoginPage extends PageObject {

    @FindBy(id = "loginButton")
    private WebElementFacade loginBtn;

    @FindBy(className = "slds-button slds-button_brand")
    private WebElementFacade leccLoginInToSalesforce;

    @FindBy(id = "username")
    private WebElementFacade user;

    @FindBy(id = "password")
    private WebElementFacade pass;

    @FindBy(id = "Login")
    private WebElementFacade submitBtn;

    @FindBy(id = "oaapprove")
    private WebElementFacade btnAllowLeccAccess;

    @FindBy(xpath = "//*[@id='oaapprove']")
    private WebElementFacade allowAccessToLeccHomePage;

    public void openLecc(){
        try{
            loginBtn.click();
        }catch (ElementShouldBeEnabledException e){
            System.out.println("Button before Login page was not found!! "+e);
        }
    }

    public void setLoginData(String user, String pass){
        this.user.sendKeys(user);
        this.pass.sendKeys(pass);
    }

    public void setOrgUser(String orgUser){
        this.user.sendKeys(orgUser);
    }
    public void setOrgPass(String orgPass){
        this.pass.sendKeys(orgPass);
    }

    public void submitBtn(){
        leccLoginInToSalesforce.click();
    }

    public void allowLeccAccess(){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try{
            allowAccessToLeccHomePage.click();
        }catch(Exception e){
            System.out.println("Element for allow acces is not present !!");

        }

    }


}
