package com.sdet.oops.abstraction;

public abstract class AbstractExample {

    public void login(){
        System.out.println("Login Test");
        System.out.println("Pass");
    }

    public void register(){
        System.out.println("Register Test");
    }

    public abstract void payment();
}
