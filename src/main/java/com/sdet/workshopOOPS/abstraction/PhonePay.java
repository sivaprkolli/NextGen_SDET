package com.sdet.workshopOOPS.abstraction;

public class PhonePay implements Payment{

    @Override
    public void pay() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Payment type is PhonePay");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
}
