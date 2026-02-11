package com.sdet.constructors;

public class ConstructorTypes {

    public ConstructorTypes(){
        System.out.println("ConstructorTypes");
    }

    public ConstructorTypes(int a){
        System.out.println("ConstructorTypes with Parameter");
        System.out.println("Id Number : " + a);
    }

    public ConstructorTypes(String a){
        System.out.println("ConstructorTypes with Parameter");
        System.out.println("Name : " + a);
    }

    public void testConstructor(){
        System.out.println("ConstructorTypes Method"); // should not write method with upper case
    }

    public static void main(String[] args) {
        ConstructorTypes defaultConstructor = new ConstructorTypes(10);
        ConstructorTypes defaultConstructor2 = new ConstructorTypes("Java");
        defaultConstructor.testConstructor();
    }
}
