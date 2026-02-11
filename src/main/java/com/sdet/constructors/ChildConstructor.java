package com.sdet.constructors;

public class ChildConstructor extends ParentConstructor{

    int a = 20;
    String name = "WebDriverIO";
    /*public ChildConstructor(){
        super(10);
        System.out.println("Child :: Constructor");
    }*/

    public ChildConstructor(int a){
        super(15);
        System.out.println("Child Id :: "  + a);
    }

    public static void main(String[] args) {
        ChildConstructor obj = new ChildConstructor(10);
        obj.testConstructor3();
    }

    public void testCons(){
        System.out.println("Child Method");
    }

    public void testConstructor3(){
        System.out.println("Parent Id :: "  + super.a);
        System.out.println("Parent Name :: "  + super.name);
        super.testConstructor2();

        System.out.println("Child Name :: "  + this.name);
        System.out.println("Child Id :: "  + this.a);
        this.testCons();
    }
}
