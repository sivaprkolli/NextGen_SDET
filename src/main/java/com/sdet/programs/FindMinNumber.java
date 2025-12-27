package com.sdet.programs;

public class FindMinNumber {

    public static void main(String[] args) {
        int[] a = {15,12,3,41,57,69,27,48,11};

        int minNumber = a[0];

        for (int i=0; i<a.length; i++){
            if (a[i]<minNumber){
                minNumber = a[i];
            }
        }

        System.out.println(" minNumber :: " + minNumber);


    }
}
