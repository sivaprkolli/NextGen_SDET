package com.sdet.workshopOOPS.polymorphism;

public class BusinessSubFunctions extends BusinessFunctions{

    @Override
    public void registration(String email, String password, String phone, String address, String pincode){
        System.out.println("enter email :: " + email);
        System.out.println("Wait fo element visible");
        System.out.println("enter password :: " + password);
        System.out.println("Wait fo element visible");
        System.out.println("enter phone :: " + phone);
        System.out.println("Wait fo element visible");
        System.out.println("enter address :: " + address);
        System.out.println("Wait fo element visible");
        System.out.println("enter pincode :: " + pincode);
        System.out.println("Wait fo element visible");
    }
}
