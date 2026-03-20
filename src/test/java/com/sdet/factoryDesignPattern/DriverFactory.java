package com.sdet.factoryDesignPattern;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static DriverManager initializeDriver(String browser){
        switch (browser){
            case "chrome":
                return new ChromeDriverManager();
            case "firefox":
                return new FirefoxDriverManager();
            case "android":
                return new AndroidDriverManager();
            default:
                System.out.println("Provide right name");
                throw new IllegalArgumentException("Enter right browser name");
        }
    }
}
