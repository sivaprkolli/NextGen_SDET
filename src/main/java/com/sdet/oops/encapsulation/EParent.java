package com.sdet.oops.encapsulation;

public class EParent {

    public int a;
    private int b;
    private int c;

    private void login(){
        System.out.println("Login Test");
    }

    public int getValue(){
        login();
        return 10;
    }

    public int getA(){
        return a;
    }

    public void setA(int a){
        this.a = a;
    }


    public void setB(int b){
        this.b = b;
    }


    public int getB(){
        return b;
    }


    public static void main(String[] args) {
        EParent eParent = new EParent();
        eParent.login();
    }

}
