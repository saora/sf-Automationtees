package com;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.locators.WaitForWebElements;

import java.time.Duration;


public class AppTest extends PageObject {

    @FindBy(id = "text")
    private WebElementFacade txt;

    public void isLoaded(){
        txt.withTimeoutOf(Duration.ofSeconds(60)).waitUntilPresent();


    }


}
