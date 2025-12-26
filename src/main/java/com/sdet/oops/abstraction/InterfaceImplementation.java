package com.sdet.oops.abstraction;

public class InterfaceImplementation implements InterfaceExample{
    @Override
    public void addToCart() {
        System.out.println("Add To cart Test");
    }

    @Override
    public int sum() {
        System.out.println("Sum Test");
        return 10;
    }
}
