package testdata;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.login.SfLoginPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static testdata.GetDataFromSpreadSheet.getSheetsService;

public class SfLoginData extends PageObject {
    private SfLoginPage sfLoginPage;

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



    public void sfEnterLoginData(){
        File file = new File("src/main/resources/properties/testdata.properties");
        FileInputStream fileInput = null;
        try{
            fileInput = new FileInputStream(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        Properties prop = new Properties();
        try {
            prop.load(fileInput);
        }catch (IOException e){
            e.printStackTrace();
        }
        sfLoginPage.setOrgUser(prop.getProperty("salesforce.username"));
        sfLoginPage.setOrgPass(prop.getProperty("password.salesforce"));
        sfLoginPage.submitBtn();
    }
}
