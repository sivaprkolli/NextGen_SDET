package com.sdet.testNGFeatures;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "users")
    public Object[][] getUsersData(){
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
        };
    }

    @DataProvider(name = "sauceUsers")
    public Object[][] getSauceUsersData(){
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},

        };
    }

    @Test(dataProvider = "sauceUsers")
    public void login(String username, String password){
        System.out.println(username + " :: " + password);
    }

}
