package com.sdet.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WebElementsTest {
    WebDriver driver;
    @Test
    public void listOfWebElements() {
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.get("https://the-internet.herokuapp.com/");
         WebElement hoverLink = driver.findElement(By.linkText("Hovers"));

        System.out.println(hoverLink);

        List<WebElement> allLinks = driver.findElements(By.tagName("b"));
        System.out.println("number of links :: " + allLinks.size());

        driver.quit();
    }

    @Test
    public void listOfWebElementsByClassName() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select dropdownHeroku = new Select(driver.findElement(By.id("dropdown")));

        List<WebElement> allOptions = dropdownHeroku.getAllSelectedOptions();

        System.out.println("number of options :: " + allOptions.size());

        dropdownHeroku.selectByVisibleText(allOptions.get(0).getText());
        //dropdownHeroku.selectByContainsVisibleText("Option 1");

        //dropdownHeroku.selectByValue("2");
        dropdownHeroku.selectByValue(allOptions.get(0).getAttribute("value"));

        driver.quit();
    }
}
