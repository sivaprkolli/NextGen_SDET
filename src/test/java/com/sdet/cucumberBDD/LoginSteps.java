package com.sdet.cucumberBDD;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;
import java.util.Map;

public class LoginSteps {

    @Given("user on the launch page")
    public void user_on_the_launch_page() {
        System.out.println("user on the launch page");
    }

    @When("user enter login credentials")
    public void user_enter_login_credentials() {
        System.out.println("user enter login credentials");
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        System.out.println("user click on login button");
    }

    @Then("user products screen displayed")
    public void user_products_screen_displayed() {
        System.out.println("user products screen displayed");
    }

    @When("user enter login credentials {string} and {string}")
    public void userEnterLoginCredentialsAnd(String username, String password) {
        System.out.println("username :: "  + username);
        System.out.println("password :: " + password );
    }

    @When("user enter signIn credentials")
    public void userEnterSingCredentials(DataTable dataTable) {
        List<String> loginDetails = dataTable.row(0);
        System.out.println("loginDetails :: " + loginDetails);
        System.out.println("username :: "+ loginDetails.get(0));
        System.out.println("password :: " + loginDetails.get(1));
    }

    @When("user enter valid login credentials")
    public void userEnterValidLoginCredentials(DataTable dataTable) {
        List<Map<String, String>> loginData = dataTable.asMaps(String.class, String.class);

        System.out.println("loginData => " + loginData);

        for (Map<String, String> map: loginData){
            System.out.println(map.get("username"));
            System.out.println(map.get("password"));
        }
    }
}
