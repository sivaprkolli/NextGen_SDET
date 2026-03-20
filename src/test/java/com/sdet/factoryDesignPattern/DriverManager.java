package com.sdet.factoryDesignPattern;

import org.openqa.selenium.WebDriver;

public interface DriverManager {
    
    WebDriver createDriver();
}
