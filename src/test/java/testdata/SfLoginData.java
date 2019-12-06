package testdata;

import com.FileDataReader;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import net.serenitybdd.core.pages.PageObject;
import org.jruby.RubyProcess;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.login.LeccLoginPage;
import pages.login.SfLoginPage;
import utils.InboxReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import static testdata.GetDataFromSpreadSheet.getSheetsService;

public class SfLoginData extends PageObject {
    private SfLoginPage sfLoginPage;
    private LeccLoginPage leccLoginPage;

    private FileDataReader prop = new FileDataReader();

    public void loginSalesforce() throws IOException {
        Sheets service = getSheetsService();
        String spreadsheetId = "1lCOOmjCjy2IvDf7DhQJvMnTvhlpHPwAx1YmBRraM0PU";
        String range = "Login Test Data!A2:B";
        ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            System.out.println("No data found.");
        } else {
            for (List row : values) {
                sfLoginPage.setOrgUser(String.valueOf(row.get(0)));
                sfLoginPage.setOrgPass(String.valueOf(row.get(1)));

                sfLoginPage.submitBtn();
            }
        }
    }

    public void sfEnterLoginData(String scanIcon) {
        leccLoginPage.openLecc();

        switch (scanIcon){
            case "Green":
                sfLoginPage.setOrgUser(prop.propertiesFile().getProperty("green-org.username"));
                sfLoginPage.setOrgPass(prop.propertiesFile().getProperty("green-org.password"));
                break;
            case "Yellow":
                sfLoginPage.setOrgUser(prop.propertiesFile().getProperty("yellow-org.username"));
                sfLoginPage.setOrgPass(prop.propertiesFile().getProperty("yellow-org.password"));
                break;

        }

        sfLoginPage.submitBtn();
    }

    public void geturlFroLogin(String loginUrl){
        getDriver().get(prop.propertiesFile().getProperty(loginUrl));
    }


    public void verificationCodebyEmail(){
        try {
            String colect = InboxReader.getEmail();
            if(!colect.equals("")){
                System.out.println("Email Verification code: "+colect);
                sfLoginPage.setVerificationCode(colect);
                sfLoginPage.submmitVerificationCode();
            }else{
                System.out.println("Verification not nedded");
            }
        }catch (Exception e){
            System.out.println("Fail while getting the verification code... "+e.getMessage());
        }
    }
}
