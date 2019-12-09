package pages.login;

import com.FileDataReader;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.exceptions.ElementShouldBeEnabledException;
import org.jruby.RubyProcess;
import org.junit.Assert;
import utils.InboxReader;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static com.GetDataFromSpreadSheet.getSheetsService;

public class LoginPage extends PageObject {
    @FindBy(id = "username")
    private static WebElementFacade user;

    @FindBy(id = "password")
    private WebElementFacade pass;

    @FindBy(id = "Login")
    private WebElementFacade submiSftBtn;

    @FindBy(id = "emc")
    private static WebElementFacade fillVerificationCode;

    @FindBy(id = "save")
    private static WebElementFacade click_Verify;

    //LOGIN
    @FindBy(className = "slds-global-header__logo")
    private WebElementFacade salesforceLightningHomeLogo;

    @FindBy(id = "phHeaderLogoImage")
    private WebElementFacade salesforceClassicHomeLogo;


    @FindBy(xpath = "/html/body/div[3]/div/div[4]")
    private WebElementFacade loginRightPanel;

    @FindBy(className = "btn-container ")
    private WebElementFacade btnfreetrial;

    //LECC
    @FindBy(id = "loginButton")
    private WebElementFacade loginBtn;

    @FindBy(xpath = "//*[@id='oaapprove']")
    private WebElementFacade allowAccessToLeccHomePage;

    private FileDataReader prop = new FileDataReader();

    private void setOrgUser(String orgUser){
        user.sendKeys(orgUser);
    }

    private void setOrgPass(String orgPass){
        this.pass.sendKeys(orgPass);
    }

    private void submitBtn(){
            submiSftBtn.click();
    }

    public void emailVerificationCode(String verifyCode){
            fillVerificationCode.withTimeoutOf(Duration.ofSeconds(5)).waitUntilPresent().sendKeys(verifyCode);
            click_Verify.withTimeoutOf(Duration.ofSeconds(5)).waitUntilClickable().click();
    }

    public void salesforceLoginVerification(){
        Assert.assertTrue(salesforceClassicHomeLogo.isDisplayed());
    }



    public void EnterLoginData(String scanIcon) {
        if(loginBtn.isCurrentlyVisible()){
            loginBtn.click();
        }else{
            System.out.println("Button before Login page was not found!! ");
        }

        switch (scanIcon){
            case "Green":
                user.sendKeys(prop.propertiesFile().getProperty("green-org.username"));
                pass.sendKeys(prop.propertiesFile().getProperty("green-org.password"));
                break;
            case "Yellow":
                setOrgUser(prop.propertiesFile().getProperty("yellow-org.username"));
                setOrgPass(prop.propertiesFile().getProperty("yellow-org.password"));
                break;
        }
        submiSftBtn.click();
        if(fillVerificationCode.isCurrentlyVisible()){
            verificationCodebyEmail();
        }else{
            System.out.println("Code verification not needed!! ");
        }
    }

    public void getUrlLogin(String loginUrl){
        getDriver().manage().window().maximize();
        getDriver().get(prop.propertiesFile().getProperty(loginUrl));
    }


    public void verificationCodebyEmail(){
            try {
                String colect = InboxReader.getEmail();
                    System.out.println("Email Verification code: "+colect);
                    fillVerificationCode.sendKeys(colect);
                    click_Verify.waitUntilClickable().click();
                    //emailVerificationCode(colect);
            }catch (Exception e){
                System.out.println("Fail while getting the verification code... "+e.getMessage());
            }

    }


    public void allowLeccAccess(){
        if(allowAccessToLeccHomePage.isCurrentlyVisible()){
            allowAccessToLeccHomePage.withTimeoutOf(Duration.ofSeconds(5)).waitUntilClickable().click();
        }else{
            System.out.println("Button for allow acces is not present !!");
        }
    }


    public void loginWithDataFromSpreadSheet() throws IOException {
        Sheets service = getSheetsService();
        String spreadsheetId = "1lCOOmjCjy2IvDf7DhQJvMnTvhlpHPwAx1YmBRraM0PU";
        String range = "Login Test Data!A2:B";
        ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            System.out.println("No data found.");
        } else {
            for (List row : values) {
                setOrgUser(String.valueOf(row.get(0)));
                setOrgPass(String.valueOf(row.get(1)));
                submitBtn();
            }
        }
    }

}
