package com.sdet.oops.abstraction2;

public class TestCase {

    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.getNetwork();
        chromeDriver.getAttribute();
        chromeDriver.click();

        RemoteWebDriver remoteWebDriver = new ChromeDriver();
        remoteWebDriver.click();

        WebDriver driver = new ChromeDriver();
        driver.sendKeys("Test");

        WebDriver driver1 = new EdgeDriver();
        driver1.click();

        WebDriver driver2 = new EdgeDriver();
        ((EdgeDriver) driver2).getLatency();
        driver2.click();


    }
}
