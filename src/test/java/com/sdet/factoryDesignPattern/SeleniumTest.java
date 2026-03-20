package com.sdet.factoryDesignPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
    WebDriver driver;
    WebDriver androidDriver;

    @Test
    public void login(){
        driver = DriverFactory.initializeDriver("chrome").createDriver();
        androidDriver = DriverFactory.initializeDriver("android").createDriver();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("")).sendKeys("");
    }
}
