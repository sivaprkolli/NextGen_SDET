package com.sdet.TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumActions {

    private WebDriver driver;

    public SeleniumActions(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnWebElement(WebElement webElement){
        webElement.click();
    }

    public void clickOnWebElement(By by){
        driver.findElement(by).click();
    }

    public void typeValue(WebElement webElement, String data){
        webElement.sendKeys(data);
    }

    public void typeValue(By by, String data){
        driver.findElement(by).sendKeys(data);
    }

    public String getTextMessage(WebElement element){
        return element.getText();
    }

    public int getNumberOfElements(List<WebElement> elementList){
        return elementList.size();
    }
}
