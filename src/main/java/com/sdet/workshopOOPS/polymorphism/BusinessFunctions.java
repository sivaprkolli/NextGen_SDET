package com.sdet.workshopOOPS.polymorphism;

public class BusinessFunctions {

    /**
     *
     * @param email
     * @param password
     * @param phone
     * @param address
     * @param pincode
     */
    // not using temp  - use the method in BusinessSubFunctions
    public void registration(String email, String password, String phone, String address, String pincode){
        System.out.println("enter email :: " + email);
        System.out.println("enter password :: " + password);
        System.out.println("enter phone :: " + phone);
        System.out.println("enter address :: " + address);
        System.out.println("enter pincode :: " + pincode);
    }
}
