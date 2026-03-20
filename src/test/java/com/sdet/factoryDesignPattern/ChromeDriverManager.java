package com.sdet.factoryDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager implements DriverManager{
    ChromeDriver chromeDriver;

    @Override
    public WebDriver createDriver() {
        chromeDriver = new ChromeDriver();
        return chromeDriver;
    }
}
