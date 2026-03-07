package com.sdet.testNGFeatures;

import org.testng.annotations.*;

public class BaseTest {


    @Parameters({"username", "password"})
    @BeforeSuite
    public void initializeReports(@Optional("MySQLUser") String un, @Optional("TestPassword") String pwd){
        System.out.println("initializeReports");
        System.out.println("username :: " + un + "and Password :: " + pwd);

    }

    @Parameters("url")
    @BeforeTest
    public void launchApp(@Optional("TestURL") String appURL){
        System.out.println("Launch Application :: " + appURL);
    }


    @AfterTest
    public void killSession(){
        System.out.println("Kill Session");
    }
}
