package testdata;

import com.FileDataReader;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import net.serenitybdd.core.pages.PageObject;
import org.jruby.RubyProcess;
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

    public void sfEnterLoginData(String envLoginUrl){
        getDriver().manage().window().maximize();
        try {
            FileDataReader prop = new FileDataReader();
            getDriver().get(prop.propertiesFile().getProperty(envLoginUrl));
         try {
             leccLoginPage.openLecc();
         }catch (Exception e){
             System.out.println("Element for LECC login not found !!");
         }

            sfLoginPage.setOrgUser(prop.propertiesFile().getProperty("salesforce.username"));
            sfLoginPage.setOrgPass(prop.propertiesFile().getProperty("password.salesforce"));
        }catch (IOException e){
            System.out.println("Fail getting org user data!!");
        }
        sfLoginPage.submitBtn();

        try{
            leccLoginPage.allowLeccAccess();
        }catch(Exception e){
            System.out.println("Element for allow acces is not present !!");

        }

    }

    public void verificationCodebyEmail(){
        try {
            String colect = InboxReader.getEmail();
            System.out.println("Codigo email "+colect);
            sfLoginPage.setVerificationCode(colect);
            sfLoginPage.submmitVerificationCode();
        }catch (Exception e){
            System.out.println("Verification not nedded");
        }
    }
}
