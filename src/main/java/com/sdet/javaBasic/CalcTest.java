package com.sdet.javaBasic;

public class CalcTest {

    int a = 5;
    String s = "Vibium";
    boolean b = true;
    double d = 4.5;
    float f = 4.5f;
    char c = 'c';
    short s1 = 5;
    long l1 = 10;
    byte b1 = 10;

    public static void main(String[] args) {

        CalcTest calcTest1 = new CalcTest();
        CalcTest calcTest2 = new CalcTest();
        CalcTest calcTest3 = new CalcTest();

        System.out.println(calcTest1);
        System.out.println(calcTest2);
        System.out.println(new CalcTest());

        new CalcTest();
        new CalcTest();
        new CalcTest();

        CalcTest calcTest4 = new CalcTest();

        calcTest1.sum();
    }


    public void sum(){
        int a=5, b=5,c;
        c = a+b;
        System.out.println("C Value :: " + c);
    }
}
