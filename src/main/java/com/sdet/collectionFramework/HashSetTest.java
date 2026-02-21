package com.sdet.collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Selenium");
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Python");
        list.add(null);
        list.add(null);

        System.out.println(list.size());
        System.out.println(list);


        Set<String> set = new HashSet<String>();
        set.add("Selenium");
        set.add("Java");
        set.add("C++");
        set.add("Python");
        set.add("Python");
        set.add(null);
        set.add(null);

        System.out.println(set.size());
        System.out.println(set);



    }
}
