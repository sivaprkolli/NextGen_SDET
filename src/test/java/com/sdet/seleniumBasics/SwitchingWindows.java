package com.sdet.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public class SwitchingWindows {
    WebDriver driver;
    @Test
    public void switchToNewWindow() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/windows");

        WebElement clickHereLink = driver.findElement(By.partialLinkText("Click"));
        clickHereLink.click();

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window: " + parentWindow);

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("All Windows: " + allWindows);

        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
            }
        }

        WebElement newWindowText = driver.findElement(By.cssSelector(".example >h3"));
        //System.out.println("New Window Text: " + newWindowText.getText());
        String newWindowsMessage = newWindowText.getText();
        System.out.println("New Window Message: " + newWindowsMessage);
        Assert.assertEquals(newWindowsMessage, "New Window");

        driver.quit();
    }
}
