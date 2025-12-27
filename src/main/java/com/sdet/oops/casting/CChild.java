package com.sdet.oops.casting;

import com.sdet.oops.abstraction2.Child;

public class CChild extends CParent{


    public static void main(String[] args) {
        CChild child = new CChild();

        CParent cParent = new CChild();

        child.childMethod();
        child.parentMethod();

        cParent.parentMethod();

        CParent cParent1;
        cParent1 = (CParent) new CChild();

        CParent cParent2 = (CParent) new CChild();


        CChild child1 =  (CChild) cParent2;
        child1.parentMethod();





    }

    public void childMethod(){
        System.out.println("childMethod");
    }
}


