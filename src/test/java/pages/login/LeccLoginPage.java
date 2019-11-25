package pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

//@DefaultUrl("https://js-mover-dev.herokuapp.com/home.xhtml")
public class LeccLoginPage extends PageObject {

    @FindBy(id = "loginButton")
    private WebElementFacade loginBtn;

    @FindBy(id = "username")
    private WebElementFacade user;

    @FindBy(id = "password")
    private WebElementFacade pass;

    @FindBy(id = "Login")
    private WebElementFacade submitBtn;

    public void openLecc(){
        loginBtn.click();
    }

    public void setLoginData(String user, String pass){
        this.user.sendKeys(user);
        this.pass.sendKeys(pass);
    }

    public void setOrgUser(String orgUser){
        this.user.sendKeys(orgUser);
    }

    public void submitBtn(){
        this.submitBtn.click();
    }

    public void setOrgPass(String orgPass){
        this.pass.sendKeys(orgPass);
    }
}
