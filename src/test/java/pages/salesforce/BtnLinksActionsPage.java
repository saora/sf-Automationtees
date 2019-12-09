package pages.salesforce;

import com.FileDataReader;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import com.GetDataFromSpreadSheet;

import java.io.IOException;
import java.util.List;


public class BtnLinksActionsPage extends PageObject {
    //New Actions --------------------------------------
    @FindBy(xpath = "//*[@id=\"ActionButtonLinkList$ActionsList\"]/div[1]/div/div[1]/table/tbody/tr/td[2]/input[1]")
    private WebElementFacade clickNewAction;

    @FindBy(id = "Type")
    private WebElementFacade selActionType;

    @FindBy(id = "TargetSobjectType")
    private WebElementFacade selTargetObject;

    @FindBy(id = "StandardLabel")
    private WebElementFacade selStdLabel;

    @FindBy(id = "DeveloperName")
    private WebElementFacade filldevName;

    @FindBy(id = "CreateFeedItem")
    private WebElementFacade feedItem;

    @FindBy(id = "SuccessMessage")
    private WebElementFacade fillMessage;

    @FindBy(name = "Save")
    private WebElementFacade saveAction;

    @FindBy(name = "Cancel")
    private WebElementFacade clickOnCancel;

    //New Button or Link ------------------------------CampaignLinks_font
    @FindBy(xpath = "//*[@id=\"ActionButtonLinkList$ActionsList\"]/div[1]/div/div[1]/table/tbody/tr/td[2]/input[2]")
    private WebElementFacade clickNewButtonorLink;

    @FindBy(linkText = "Default Custom Links")
    private WebElementFacade clickDefaultCustLinks;

    @FindBy(id = "MasterLabel")
    private  WebElementFacade fillLabel;

    @FindBy(id = "WebLinkFields_Name")
    private WebElementFacade fillName;

    @FindBy(id = "Description")
    private WebElementFacade fillDescription;

    @FindBy(id = "WebLinkFields_DisplayTypeL")
    private WebElementFacade clickPageLink;

    @FindBy(id = "WebLinkFields_DisplayTypeB")
    private WebElementFacade clickPageButton;

    @FindBy(id = "WebLinkFields_DisplayTypeM")
    private WebElementFacade clickListButton;

    @FindBy(id = "OpenType")
    private WebElementFacade behaviorDropdown;

    @FindBy(id = "LinkType")
    private WebElementFacade selContentSource;

    @FindBy(id = "WebLinkFields_ContentEditor")
    private WebElementFacade fillContentEditor;

    @FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
    private WebElementFacade save;

    @FindBy(xpath ="//*[@id=\"bodyCell\"]/div[1]/div[1]/div[1]/h2")
    private WebElementFacade pageDescription;

    private void setFillLabel(String fillLabel){
        this.fillLabel.clear();
        this.fillLabel.sendKeys(fillLabel);
    }

    private void setFillName(String fillName){
        this.fillName.clear();
        this.fillName.sendKeys(fillName);
    }

    private void setFillDescription(String fillDescription){
        this.fillDescription.clear();
        this.fillDescription.sendKeys(fillDescription);
    }

    private void setDetailPageLink(){
        this.clickPageLink.click();
    }

    private void setDetailPageButton(){
        this.clickPageButton.click();
    }

    private void setListButton(){
        this.clickListButton.click();
    }

    private void setSelBehavior(){
       behaviorDropdown.selectByVisibleText("Execute JavaScript");
    }

//    public void setSelContentSource(String selContentSource){
//        this.selContentSource.selectByVisibleText(selContentSource);
//    }

    private void setFillContentEditor(String fillContentEditor){
        this.fillContentEditor.clear();
        this.fillContentEditor.sendKeys(fillContentEditor);
    }

    private void saveJsButton(){
        save.click();
        getDriver().switchTo().alert().accept();
    }
    //---------------------------------------------------------------
    private void setSelActionType(String selActionType){
        this.selActionType.selectByVisibleText(selActionType);
    }
    private void setSelTargetObject(String selTargetObject){
        try {
            this.selTargetObject.selectByVisibleText(selTargetObject);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void setSelStdLabel(String selStdLabel){
        this.selStdLabel.selectByVisibleText(selStdLabel);
    }

    private void setfillDevName(String filldevName){
        this.filldevName.clear();
        this.filldevName.sendKeys(filldevName);
    }

    private void setCreateFeedItem(){
        try {
            feedItem.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void setFillMessage(String fillMessage){
        try {
            this.fillMessage.clear();
            this.fillMessage.sendKeys(fillMessage);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void saveAction(){
        saveAction.click();

    }



    public void newAction(String actionType, String tragetObj, String stdlblType, String label, String name, String description, String message){
        clickNewAction.click();
        selActionType.selectByVisibleText(actionType);
        selTargetObject.selectByVisibleText(tragetObj);
        selStdLabel.selectByVisibleText(stdlblType);
        fillLabel.sendKeys(label);
        filldevName.sendKeys(name);
        fillDescription.sendKeys(description);
        fillMessage.sendKeys(message);
        saveAction.click();
    }

    private void clickOption(String btnOption){
        switch(btnOption){
            case "New Action":
                clickNewAction.click();
                break;
            case "New Button or Link":
                clickNewButtonorLink.click();
                break;
            case "Default Custom Links":
                clickDefaultCustLinks.click();
                break;
            default:
                System.out.println("Not found!!");
        }

    }

    public void newBtnOrLink(String lbl, String name, String description, String displayType, String behavior, String contentSorce, String contentEditor){
        fillLabel.sendKeys(lbl);
        fillName.clear();
        fillName.sendKeys(name);
        fillDescription.sendKeys(description);
        switch (displayType){
            case "Detail Page Link":
                setDetailPageLink();
                break;
            case "Detail Page Button":
                setDetailPageButton();
                break;
            case "List Button":
                setListButton();
                break;
            default:
                System.out.println("no match");
        }
        //selBehavior.selectByVisibleText(behavior);
        selContentSource.selectByVisibleText(contentSorce);
        fillContentEditor.sendKeys(contentEditor);
        saveJsButton();
    }

    public void defaultCustomLinks() {
        clickDefaultCustLinks.click();

    }

    private void objBtnLinkVerification(String jsBtnName){
        //System.out.println("esto es:  ----> "+find(By.className("mainTitle")).getText());
        Assert.assertEquals(pageDescription.getText(), jsBtnName);
         //Assert.assertEquals("Custom Button or Link Detail", find(By.className("mainTitle")).getText());
    }
    private SfHomePage sfHomePage;
    public void newActionWithDataFromSpreadsheet()throws Exception{
        Sheets service = GetDataFromSpreadSheet.getSheetsService();
        String spreadsheetId = "1lCOOmjCjy2IvDf7DhQJvMnTvhlpHPwAx1YmBRraM0PU";
        String range = "Action Test Data!A2:H";
        ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            System.out.println("No data found.");
        } else {
            for (List row : values) {
                sfHomePage.selObjectOption("Buttons, Links, and Actions");
                clickOption("New Action");
                setSelActionType(String.valueOf(row.get(0)));
                setSelTargetObject(String.valueOf(row.get(1)));
                setSelStdLabel(String.valueOf(row.get(2)));
                setFillLabel(String.valueOf(row.get(3)));
                setfillDevName(String.valueOf(row.get(4)));
                setFillDescription(String.valueOf(row.get(5)));
                if (String.valueOf(row.get(6)).equals("Unchecked")){
                    setCreateFeedItem();
                }
                setFillMessage(String.valueOf(row.get(7)));
                saveAction();
            }
        }
    }


    public void newJavaScriptButton(){
        FileDataReader prop = new FileDataReader();

        sfHomePage.selObjectOption("Buttons, Links, and Actions");
        clickOption("New Button or Link");
        setFillLabel(prop.propertiesFile().getProperty("jsbutton.label"));
        setFillName(prop.propertiesFile().getProperty("jsbutton.name"));
        setFillDescription(prop.propertiesFile().getProperty("jsbutton.description"));
        setDetailPageButton();
        setSelBehavior();
        if(fillContentEditor.isEnabled()){
            setFillContentEditor(prop.propertiesFile().getProperty("jsbutton.contenteditor"));
        }else{
            System.out.println("Content Editor is not present");
        }
        saveJsButton();
        //btnLinksActionsPage.setSelContentSource(prop.getProperty("jsbutton.contentsource"));
        objBtnLinkVerification(prop.propertiesFile().getProperty("jsbutton.name"));
    }


    public void newJsButtonWithDataFromSpreadsheet() throws IOException {
        Sheets service = GetDataFromSpreadSheet.getSheetsService();
        String spreadsheetId = "1lCOOmjCjy2IvDf7DhQJvMnTvhlpHPwAx1YmBRraM0PU";
        String range = "Js Button Test Data!A2:H";
        ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            System.out.println("No data found.");
        } else {
            for (List row : values) {
                sfHomePage.selObjectOption("Buttons, Links, and Actions");
                clickOption("New Button or Link");

                setFillLabel(String.valueOf(row.get(0)));
                setFillName(String.valueOf(row.get(1)));
                setFillDescription(String.valueOf(row.get(2)));
                switch (String.valueOf(row.get(3))){
                    case "Detail Page Link":
                        setDetailPageLink();
                        break;
                    case "Detail Page Button":
                        setDetailPageButton();
                        break;
                    case "List Button":
                        setListButton();
                        break;
                    default:
                        System.out.println("no match");
                }
                //btnLinksActionsPage.setSelBehavior(String.valueOf(row.get(4)));
                // btnLinksActionsPage.setSelContentSource(String.valueOf(row.get(5)));
                try {
                    setFillContentEditor(String.valueOf(row.get(6)));
                }catch (Exception e){
                    System.out.println("Content Editor is not present");
                }
                saveJsButton();
            }
        }
    }



}
