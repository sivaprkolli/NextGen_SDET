package com.sdet.workshopOOPS.polymorphism;

public class LoginPage {

    private String userNameInputBox = "username";
    private String passwordInputBox = "password";
    private String signInButton = "signIn";

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        SeleniumActions seleniumActions = new SeleniumActions();

        seleniumActions.typeValue(loginPage.userNameInputBox, "email");
        seleniumActions.typeValue(loginPage.passwordInputBox, "password");
        seleniumActions.click(loginPage.signInButton);

    }

    public void login(String email, String passcode){
        System.out.println("Type value in " + userNameInputBox + " :: " + email );
        System.out.println("Type value in " + passwordInputBox + " :: " + passcode );
        System.out.println("Click on  :: " + signInButton);
    }
}
