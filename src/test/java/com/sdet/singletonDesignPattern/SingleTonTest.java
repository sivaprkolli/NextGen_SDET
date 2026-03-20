package com.sdet.singletonDesignPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingleTonTest {

    public static void main(String[] args) {
        SingletonPattern sp = SingletonPattern.getInstance();
        SingletonPattern sp1 = SingletonPattern.getInstance();
        SingletonPattern sp2 = SingletonPattern.getInstance();
        System.out.println(sp);
        System.out.println(sp1);
        System.out.println(sp2);

        WebDriver driver = UsingSelenium.getDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("")).sendKeys("");

    }
}
