package steps.sfhomepage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.salesforce.SfHomePage;

public class LayoutSteps extends PageObject {
    private SfHomePage sfHomePage;

    @Step
    public void addJsButtonToLayout(String objectOption,String layoutName){
        sfHomePage.selObjectOption(objectOption);
        sfHomePage.addCustomLayout(layoutName);
    }

    @Step
    public void dragAndDrop(String elementName){

    }
}
