package com.sdet.testNGFeatures;

import org.testng.annotations.Test;

public class DependentTest extends BaseTest{

    @Test(dependsOnMethods = "payment")
    public void getMessage(){
        System.out.println("Verify message");
    }

    @Test
    public void membershipEdit(){
        System.out.println("membershipEdit");
    }

    @Test
    public void authenticate(){
        System.out.println("authenticate");
    }

    @Test
    public void login(){
        System.out.println("Login Test");
    }

    @Test(dependsOnMethods = "login")
    public void selectSeat(){
        System.out.println("Select Seat");
    }

    @Test(dependsOnMethods = "selectSeat")
    public void payment(){
        System.out.println("Payment");
    }


}
