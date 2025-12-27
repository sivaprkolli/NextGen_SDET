package com.sdet.oops.abstraction2;

import com.sdet.oops.abstraction.AbstractTest;

public class AbsTest {

    public static void main(String[] args) {

        AbsTest absTest = new AbsTest(); //Object creation

        Child child = new Child();
        child.parent();
        child.ancestor();
        child.child();

        Parent parent = new Parent();
        parent.ancestor();
        parent.parent();

        Ancestor ancestor = new Ancestor();
        ancestor.ancestor();

        Parent parent1 = new Child();
        parent1.parent();
        parent1.ancestor();
       // parent1.child(); - casting

        Ancestor ancestor1 = new Parent();

        Ancestor ancestor2 = new Child();
        ancestor2.ancestor();

    }
}
