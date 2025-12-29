package com.sdet.workshopOOPS.inheritance;

public class LoginTest extends BaseTest{

    public static void main(String[] args) {
        LoginTest loginTest = new LoginTest();
        loginTest.launchBrowser();
        loginTest.launchApplication();
        System.out.println("Apply for Job");
        loginTest.closeBowser();
    }
}
