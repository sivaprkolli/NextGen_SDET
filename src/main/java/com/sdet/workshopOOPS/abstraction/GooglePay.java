package com.sdet.workshopOOPS.abstraction;

public class GooglePay implements  Payment{

    @Override
    public void pay() {
        System.out.println("*********************");
        System.out.println("Payment by GooglePay");
        System.out.println("*********************");
    }
}
