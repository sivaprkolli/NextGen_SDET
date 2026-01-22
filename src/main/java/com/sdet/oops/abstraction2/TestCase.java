package com.sdet.oops.abstraction2;

public class TestCase {

    public static void main(String[] args) {
        ChromeDriverTest chromeDriver = new ChromeDriverTest();
        chromeDriver.getNetwork();
        chromeDriver.getAttribute();
        chromeDriver.click();

        RemoteWebDriverTest remoteWebDriver = new ChromeDriverTest();
        remoteWebDriver.click();

        WebDriverTest driver = new ChromeDriverTest();
        driver.sendKeys("Test");

        WebDriverTest driver1 = new EdgeDriverTest();
        driver1.click();

        WebDriverTest driver2 = new EdgeDriverTest();
        ((EdgeDriverTest) driver2).getLatency();
        driver2.click();


    }
}
