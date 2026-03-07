package com.sdet.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumWaits {
    WebDriver driver;

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void seleniumWaits() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=70130000000Enyk");

        WebElement firstNameInputBox = driver.findElement(By.name("UserFirstName"));
        firstNameInputBox.sendKeys("John");

        WebElement lastNameInputBox = driver.findElement(By.name("UserLastNam"));
        lastNameInputBox.sendKeys("Doe");
    }

    @Test
    public void seleniumWaits2() {

        driver = new ChromeDriver();

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=70130000000Enyk");

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("UserFirstName"))).sendKeys("John");

        webDriverWait
                .until(ExpectedConditions
                        .elementToBeClickable(By.name("UserLastNam")))
                .sendKeys("Doe");

    }

    @Test
    public void seleniumWaits3() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=70130000000Enyk");

        FluentWait<WebDriver> fluentWait = new FluentWait(driver);
        fluentWait.withTimeout(Duration.ofSeconds(10));
        fluentWait.withMessage("Waiting for Element to be loaded");
        fluentWait.pollingEvery(Duration.ofSeconds(2));
        fluentWait.ignoring(ElementClickInterceptedException.class);

        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("UserFirstNam"))).sendKeys("John");
    }
}
