package com.sdet.oops.abstraction;

public class RemoteWebDriverTest implements WebDriverTest {

    @Override
    public void click() {
        System.out.println("Click");
    }

    @Override
    public String getText() {
        return "Selenium";
    }
}
