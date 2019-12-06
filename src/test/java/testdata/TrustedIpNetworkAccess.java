package testdata;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Test;
import pages.salesforce.BtnLinksActionsPage;
import pages.salesforce.SfHomePage;
import steps.login.LoginSteps;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static testdata.GetDataFromSpreadSheet.getSheetsService;

public class TrustedIpNetworkAccess extends PageObject {

    @FindBy(id = "Security_font")
    private WebElementFacade securityControl;

    @FindBy(id = "NetworkAccess_font")
    private WebElementFacade networkAccess;

    @FindBy(name = "new")
    private WebElementFacade clickNew;

    @FindBy(id = "IpStartAddress")
    private WebElementFacade startIP;

    @FindBy(id = "IpEndAddress")
    private WebElementFacade endIP;

    @FindBy(name = "save")
    private WebElementFacade clickSave;


    public void setIPConfiguration() throws IOException {
        Sheets service = getSheetsService();
        String spreadsheetId = "1lCOOmjCjy2IvDf7DhQJvMnTvhlpHPwAx1YmBRraM0PU";
        String range = "Trusted IP!A2:H";
        ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            System.out.println("No data found.");
        } else {

            securityControl.click();
            networkAccess.click();

            for (List row : values) {
                try {
                    clickNew.withTimeoutOf(Duration.ofSeconds(5)).waitUntilClickable().click();
                    startIP.withTimeoutOf(Duration.ofSeconds(5)).waitUntilClickable().sendKeys(String.valueOf(row.get(0)));
                    endIP.withTimeoutOf(Duration.ofSeconds(5)).waitUntilClickable().sendKeys(String.valueOf(row.get(1)));

                    clickSave.click();
                } catch (Exception e) {
                    System.out.println("Ip range already exist!!");
                    networkAccess.click();
                }
            }


        }
    }

}
