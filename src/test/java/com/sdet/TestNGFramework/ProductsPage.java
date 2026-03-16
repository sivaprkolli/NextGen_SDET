package com.sdet.TestNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPage {

    private SeleniumActions seleniumActions;

    public ProductsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        seleniumActions = new SeleniumActions(driver);
    }

    @FindBy(css = ".title")
    private WebElement productsHeading;

    @FindBy(css = "[data-test='inventory-item']")
    private List<WebElement> productsList;

    public String getHeading(){
        return seleniumActions.getTextMessage(productsHeading);
    }

    public int getNumberOfProducts(){
        return seleniumActions.getNumberOfElements(productsList);
    }

}
