package com.sdet.singletonDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSelenium {

    private static UsingSelenium usingSelenium;
    private static WebDriver driver;

    private UsingSelenium(){
    }

    public static UsingSelenium getInstance(){
        if (usingSelenium == null){
            usingSelenium = new UsingSelenium();
        }
        return usingSelenium;
    }

    public static WebDriver getDriver(){
        if (driver == null){
            driver = new ChromeDriver();
        }
        return driver;
    }
}
