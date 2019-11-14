package testdata;

import com.FileDataReader;
import net.serenitybdd.core.pages.PageObject;
import pages.salesforce.SfHomePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LayoutData extends PageObject {

    private FileDataReader fileDataReader;
    private SfHomePage sfHomePage;

    public void getLayoutName() {
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

        sfHomePage.addCustomLayout(prop.getProperty("layout.name"));
    }

    }
