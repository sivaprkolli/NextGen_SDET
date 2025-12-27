package com.sdet.programs;

import com.sun.source.tree.IfTree;

public class ConditionsAndLoops {

    public static void main(String[] args) {
        if(1>10){
            System.out.println("Test Pass");
        } else{
            System.out.println("Test Fail");
        }


        int age=18;

        if (age>18){
            System.out.println("Apply for driving licence");
        } else if (age < 18) {
            System.out.println("Not eligible");
        } else {
            System.out.println("Enter proper age value");
        }

        System.out.println("*****************");
        for (int i=0; i<=11; i++){
            System.out.println(i);
        }
        System.out.println("*****************");
        for (int i=11; i>=0; i--){
            System.out.println(i);
        }
    }
}
