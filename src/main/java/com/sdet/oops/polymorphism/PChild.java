package com.sdet.oops.polymorphism;

public class PChild extends PParent{

    @Override
    public void payment(){
        System.out.println("Enter Phone number");
        System.out.println("Payment by PhonePay");
        System.out.println("Enter Pin");
    }
}
