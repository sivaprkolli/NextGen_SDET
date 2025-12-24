package com.sdet.returnTypes;

public class ReturnTypes {

    int i= 5;

    public static void main(String[] args) {
        ReturnTypes returnTypes = new ReturnTypes();
        int i1, i2;
        i1 = returnTypes.i+ returnTypes.i;
        System.out.println(i1);

        returnTypes.login();

        i2 = returnTypes.productValue();

        System.out.println(i2);

        String username = returnTypes.getUserName();
        System.out.println(username);

        String password = getPassword();
        System.out.println(password);
    }


    public int productValue(){
       // System.out.println("55"); // printing only
        return 55;
    }

    public String getUserName(){
        return "JavaUser";
    }

    public static String getPassword(){
        return "Password";
    }

    public void login(){
        System.out.println("Login Success");
    }

    public void getUserNameOnWelcomeScreen(){

    }

    public double total(){
        return 9.9;
    }


}
