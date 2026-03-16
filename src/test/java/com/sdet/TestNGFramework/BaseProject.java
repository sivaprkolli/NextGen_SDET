package com.sdet.TestNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseProject {

    WebDriver driver;

    @Parameters({"username", "password"})
    @BeforeSuite
    public void initializeReports(@Optional("MySQLUser") String un, @Optional("TestPassword") String pwd){
        System.out.println("initializeDrivers");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Parameters("url")
    @BeforeTest
    public void launchApp(@Optional("TestURL") String appURL){
        driver.get("https://www.saucedemo.com/");
    }


    @AfterTest
    public void killSession(){
        System.out.println("Kill Session");
        driver.quit();
    }
}
