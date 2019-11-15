package steps.sfhomepage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.salesforce.SfHomePage;
import testdata.LayoutData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LayoutSteps extends PageObject {

    private SfHomePage sfHomePage;
    private LayoutData layoutData;

    @Step
    public void addJsButtonToLayout(String objectOption){
        sfHomePage.selObjectOption(objectOption);

    }

    @Step
    public void getCustomLayoutName(){
        layoutData.getLayoutName();
    }

    @Step
    public void expectedResultLayout(){
        sfHomePage.savedLayoutVerification();
    }

    @Step
    public void dragAndDrop(String elementName){

    }

}
