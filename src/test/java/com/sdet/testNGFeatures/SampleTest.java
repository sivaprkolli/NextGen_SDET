package com.sdet.testNGFeatures;

import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    @Test(priority = 3)
    public void membershipEdit(){
        System.out.println("membershipEdit");
        Assert.assertEquals(1,2);
    }

    @Test(priority = 1)
    public void authenticate(){
        System.out.println("authenticate");
        Assert.assertTrue(true);
    }

    @Test(priority = 2)
    public void login(){
        System.out.println("Login Test");
        Assert.assertEquals("Test","Test");
    }
}
