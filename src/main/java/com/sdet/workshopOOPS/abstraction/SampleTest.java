package com.sdet.workshopOOPS.abstraction;

public class SampleTest {
    public static void main(String[] args) {
        GooglePay googlePay = new GooglePay();
        PhonePay phonePay = new PhonePay();

        googlePay.pay();
        phonePay.pay();
    }
}
