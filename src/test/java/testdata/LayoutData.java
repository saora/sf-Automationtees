package testdata;

import com.FileDataReader;
import net.serenitybdd.core.pages.PageObject;
import pages.salesforce.SfHomePage;

import java.io.IOException;

public class LayoutData extends PageObject {
    private SfHomePage sfHomePage;

    public void getLayoutName() throws IOException {
        FileDataReader prop = new FileDataReader();
        sfHomePage.addCustomLayout(prop.propertiesFile().getProperty("layout.name"));
    }

}
