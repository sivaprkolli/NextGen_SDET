package com.sdet.programs;

public class FindMaxNumber {


    public static void main(String[] args) {
        int[] a = {15,12,3,41,57,69,27,48,11};

        System.out.println(a.length);
        System.out.println(a[0]);

        System.out.println(a[a.length-1]);
        System.out.println(a[4]);

        int maxNumber = a[0];
        System.out.println("Initial max number :: " + maxNumber);

        for (int i=0; i<a.length; i++){
            if (a[i] > maxNumber){
                maxNumber = a[i];
            }
        }

        System.out.println("maxNumber :: " + maxNumber);


    }
}
