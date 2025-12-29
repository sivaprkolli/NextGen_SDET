package com.sdet.workshopOOPS.encapsulation;

import com.sdet.workshopOOPS.inheritance.BaseTest;

public class LoginTest extends BaseTest {

    public static void main(String[] args) {
        LoginTest loginTest = new LoginTest();
        LoginPage loginPage = new LoginPage();

        loginTest.launchBrowser();
        loginTest.launchApplication();
        loginPage.login("siva@yopmail.com", "secret");
        System.out.println("Assert");
        loginTest.closeBowser();
    }
}
