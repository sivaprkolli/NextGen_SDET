package com.sdet.oops.abstraction;

import com.sdet.returnTypes.WebDriverTest;

public class SampleTest {

    public static void main(String[] args) {

        AbstractTest abstractTest = new AbstractTest();
        abstractTest.payment();
        abstractTest.login();

        // WebDriver driver = new WebDriver(); -- Not possible

        // not a good practice, your actual hiding logic will not be useful
        AbstractExample abstractExample = new AbstractExample() {

            public void login() {

            }

            public void register() {

            }

            @Override
            public void payment() {

            }
        };


    }
}
