package com.sdet.programs;

public class ReverseANumber {

    public static void main(String[] args) {
        int a = 123;
        int reminder,reverse=0;

        System.out.println(a/10);
        System.out.println(9876/10);
        System.out.println(987/10);
        System.out.println(98/10);
        System.out.println(9/10);
        System.out.println("****************");
        System.out.println(a%10); // last number
        System.out.println(50+6);
        System.out.println(5*10 + 6);
        System.out.println(56*10 +7);
        System.out.println(5670+8);
        System.out.println(56780+9);

        while (a!=0){
            reminder=a%10;
            reverse = reverse*10 + reminder;
            a=a/10;
        }

        System.out.println("reverse :: " + reverse);
    }
}
