package com.sdet.CucumberBDD;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class WebHooks {

    @BeforeAll
    public static void initialize(){
        System.out.println("Initialize Report/DB/Drivers");
    }

    @Before
    public static void beforeScenario(){
        System.out.println("Before every scenario");
    }

    @BeforeStep
    public static void beforeStep(){
        System.out.println("Before every step");
    }

}
