package testdata;

import com.FileDataReader;
import net.serenitybdd.core.pages.PageObject;
import pages.salesforce.LayoutPage;
import pages.salesforce.SfHomePage;

import java.io.IOException;

public class LayoutData extends PageObject {
    private LayoutPage layoutPage;
    private SfHomePage sfHomePage;

   private FileDataReader prop = new FileDataReader();

    public void getLayoutName() {
        try {
            layoutPage.addCustomLayout(prop.propertiesFile().getProperty("layout.name"));
        }catch (IOException e){
            System.out.println("Fail getting layout name!!");
        }
    }

    public void addJsButtonToCustomLayout(){
        try{
            layoutPage.dragAndDropJsButtonToLayout(prop.propertiesFile().getProperty("jsbutton.name"));
        }catch (IOException e){
            System.out.println("Fail getting Js Button name!!");
        }

    }


}
