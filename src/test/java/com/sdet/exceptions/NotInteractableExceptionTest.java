package com.sdet.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class NotInteractableExceptionTest {
    WebDriver driver;
    @Test
    public void notInteractableExceptionTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=70130000000Enyk");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(10000);
        WebElement firstNameInputBox = driver.findElement(By.xpath("//a[normalize-space()='Terms of Service']"));
        firstNameInputBox.click();
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
