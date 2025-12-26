package com.sdet.oops.polymorphism;

public class PAgent {

    public void login(String username, String password){

    }

    public void login(String username, int password){

    }

    public void login(String username){

    }

    public void sum(int a, int b){

    }

    public void sum(int a, float b){

    }

    public void sum(int a, float b, int c){

    }

    public void sum(int a, double b){

    }

    public void register(String username, String pwd, String ph, String email){

    }

    public void register(String username, String pwd, int ph){

    }

    public void register(String username, String pwd, String ph, String email, String address, String pincode){

    }

    public void clickOnElement(String a){

    }

    public void clickOnElement(String a, int time){

    }

    public static void main(String[] args) {
        PAgent pAgent = new PAgent();
        pAgent.register("Java", "Selenium", 124);
    }


}
