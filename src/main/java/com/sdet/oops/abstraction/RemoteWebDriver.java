package com.sdet.oops.abstraction;

public class RemoteWebDriver implements WebDriver{

    @Override
    public void click() {
        System.out.println("Click");
    }

    @Override
    public String getText() {
        return "Selenium";
    }
}
