package com.sdet.factoryDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AndroidDriverManager implements DriverManager {
    SafariDriver driver;

    @Override
    public WebDriver createDriver() {
        driver = new SafariDriver();
        return driver;
    }
}
