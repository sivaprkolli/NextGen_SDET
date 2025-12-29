package com.sdet.workshopOOPS.polymorphism;

public class SeleniumActions {

    public void click(String webElement){
        System.out.println("Click on webElement :: " + webElement);
    }

    public void click(String webElement, int explicitWaitTime){
        System.out.println("Click on webElement :: " + webElement);
    }


    public void typeValue(String webElement, String data){
        System.out.println("Type value " +data + "on webElement :: " + webElement);
    }

    public void typeValue(String webElement, String data, int time){
        System.out.println("Type value " +data + "on webElement :: " + webElement);
    }

}
