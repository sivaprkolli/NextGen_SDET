package com.sdet.seleniumBasics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class MyFirstTest {
WebDriver driver;
    @Test
    public void launchBrowser(){
//        WebDriver driver = new ChromeDriver(); //object or instance
//        WebDriver driver1 = new ChromeDriver();

      //  SearchContext searchContext = new ChromeDriver();
      //  RemoteWebDriver remoteWebDriver = new ChromeDriver();
      //  ChromiumDriver chromiumDriver = new ChromeDriver();
        ChromeDriver chromeDriver = new ChromeDriver();
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        EdgeDriver edgeDriver = new EdgeDriver();
    }

    @Test
    public void launchBrowserUsingCommonDriver() throws InterruptedException {

        String browser = "edge";
        switch (browser){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Provide right browserName");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
