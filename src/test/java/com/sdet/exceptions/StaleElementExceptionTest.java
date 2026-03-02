package com.sdet.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class StaleElementExceptionTest {
    WebDriver driver;
    @Test
    public void staleElementExceptionTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=70130000000Enyk");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement firstNameInputBox = driver.findElement(By.name("UserFirstName"));
        firstNameInputBox.sendKeys("Siva");

        driver.navigate().refresh();

        Thread.sleep(10000);
        //wait.until(ExpectedConditions.stalenessOf(firstNameInputBox));
        firstNameInputBox.sendKeys("Selenium");
        System.out.println();
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
