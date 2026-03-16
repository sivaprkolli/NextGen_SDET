package com.sdet.TestNGFramework;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseProject{

    private LoginPage loginPage;
    private ProductsPage productsPage;
    private SoftAssert softAssert;

    @BeforeClass
    public void initializePages(){
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        softAssert = new SoftAssert();
    }

    @Test
    public void verifyLoginSuccess(){
        loginPage.login("standard_user","secret_sauce");
        softAssert.assertEquals(productsPage.getHeading(), "Products");
        softAssert.assertTrue(productsPage.getNumberOfProducts() == 6);
        softAssert.assertAll();
    }
}
