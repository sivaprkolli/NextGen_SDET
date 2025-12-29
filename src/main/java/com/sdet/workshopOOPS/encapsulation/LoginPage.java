package com.sdet.workshopOOPS.encapsulation;

public class LoginPage {

    private String userNameInputBox = "username";
    private String passwordInputBox = "password";
    private String signInButton = "signIn";


    public void login(String email, String passcode){
        System.out.println("Type value in " + userNameInputBox + " :: " + email );
        System.out.println("Type value in " + passwordInputBox + " :: " + passcode );
        System.out.println("Click on  :: " + signInButton);
    }
}
