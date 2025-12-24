package com.sdet.dataTypes;

public class DataTypes {

    // Premitive - Direct Values, Fixed size in memory, no Null values
    int i =5;
    int i1;
    float f = 5.2f;
    double d = 5.1f;
    boolean b = true;
    boolean b1;
    short s = 5;
    byte bb= 5;
    long l = 5;
    char c1 = '1';
    char c2 ;
    char c3 = 'q';

    // Non Premitive - memory address, no fixed size, can be a null
    String s1 = "Java1234";
    String s2 = new String("Selenium");
    String s3;

    static int i2_local=10;
    int i5 = 10;


    public static void main(String[] args) {
        int i2_local=1, i5=10;


        DataTypes dataTypes = new DataTypes();
        System.out.println(dataTypes.i5);
        System.out.println(i2_local);
        System.out.println(dataTypes.i2_local); // not a good practice

        System.out.println(dataTypes.s1);
        System.out.println(dataTypes.s2);

        System.out.println("integer default value :: " + dataTypes.i1); // 0
        System.out.println("boolean default value :: " +dataTypes.b1); // false
        System.out.println("char default value :: " +dataTypes.c2); // space
        System.out.println("string default value :: " +dataTypes.s3); // null

        login();
        dataTypes.register();
    }

    public void register(){
        System.out.println("Registration success");
    }

    public static void login(){
        System.out.println("Login Success");
    }


}
