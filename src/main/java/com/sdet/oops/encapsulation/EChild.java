package com.sdet.oops.encapsulation;

public class EChild extends EParent{

    public static void main(String[] args) {
        EParent eParent = new EParent();
        eParent.setA(20);
        eParent.setB(80);
        System.out.println(eParent.getA());
        System.out.println(eParent.getB());
    }
}
