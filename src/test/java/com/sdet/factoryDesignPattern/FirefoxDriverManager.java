package com.sdet.factoryDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager implements DriverManager {
    FirefoxDriver firefoxDriver;

    @Override
    public WebDriver createDriver() {
     firefoxDriver = new FirefoxDriver();
     return firefoxDriver;
    }
}
