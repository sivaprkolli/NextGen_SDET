package com.sdet.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class NoSuchElementExceptionTest {
    WebDriver driver;
    @Test
    public void noSuchElementExceptionTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/");
        WebElement hoverLink = driver.findElement(By.linkText("Hovers"));
        driver.quit();
    }
}
