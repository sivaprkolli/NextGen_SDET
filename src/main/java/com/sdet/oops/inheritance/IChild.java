package com.sdet.oops.inheritance;

public class IChild extends IParent{

    public static void main(String[] args) {
        IChild iChild = new IChild();
        System.out.println(iChild.i);
        System.out.println(iChild.login());
    }
}
