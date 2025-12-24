package com.sdet.oops.polymorphism;

public class RegisterTest {

    public static void main(String[] args) {
        PAgent pAgent = new PAgent();
        pAgent.login("Java", 25);
        pAgent.sum(1,2);

        PParent pParent = new PParent();
        pParent.payment();

        PChild pChild = new PChild();
        pChild.payment();

    }
}
