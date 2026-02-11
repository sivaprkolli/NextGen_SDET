package com.sdet.constructors;

public class ParentConstructor {

    int a = 10;
    String name = "Selenium";

  /*  public ParentConstructor(){
        System.out.println("Parent :: Constructor");
    }
*/
    public ParentConstructor(int a){
        System.out.println("Parent Id :: "  + a);
    }

    public void testConstructor2(){
        System.out.println("ConstructorTypes Method");
        System.out.println("Name : " + name);
    }
}
