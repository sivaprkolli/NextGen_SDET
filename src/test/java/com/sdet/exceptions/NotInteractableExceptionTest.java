package com.sdet.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=57");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement firstNameInputBox = driver.findElement(By.xpath("(//label[text()='Pre-Order'])[2]/preceding-sibling::input"));
        //firstNameInputBox.click();

        JavascriptExecutor js  = (JavascriptExecutor) driver;
        String argument = "arguments[0].click()";
        String argument2 = "arguments[0].scrollIntoView(true)";
        js.executeScript(argument2, firstNameInputBox);
      //  js.executeScript("window.scrollBy(0,150)", firstNameInputBox);
        js.executeScript(argument,  firstNameInputBox);

        System.out.println();
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
