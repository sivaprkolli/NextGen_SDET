package com.sdet.testNGFeatures;

import org.testng.annotations.Test;

public class GroupsTests {

    @Test(groups = "smoke")
    public void membershipEdit(){
        System.out.println("membershipEdit");
    }

    @Test(groups = {"smoke", "regression"})
    public void authenticate(){
        System.out.println("authenticate");
    }

    @Test(groups = {"membershipFeature", "smoke"})
    public void login(){
        System.out.println("Login Test");
    }

    @Test(groups = {"smoke", "regression"})
    public void payment(){
        System.out.println("payment");
    }

    @Test(groups = "smoke")
    public void register(){
        System.out.println("register");
    }

    @Test(groups = {"smoke", "regression"})
    public void mobileMessage(){
        System.out.println("mobileMessage");
    }
}
