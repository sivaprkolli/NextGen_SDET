package com.sdet.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayVsArrayList {

    public static void main(String[] args) {
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.println(a[i]);
        }

        System.out.println(a[4]);

        ArrayList<Double> list = new ArrayList<Double>();
        int n= 10;
        for(int i=0; i< n; i++){
            list.add(Double.valueOf(i));
        }

        System.out.println(list);
        System.out.println(list.get(9));
        list.remove(5);
        System.out.println(list);

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(1.9);
        list2.add(2.8);
        list2.add(3.7);
        list2.addAll(list);

        System.out.println(list2);
        list2.set(2, 7.7);
        System.out.println(list2);


        for (Double d: list2){
            System.out.println(d);
        }

        Iterator iterator = list2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (int i = 0; i < list2.size(); i++){
            System.out.println(list2.get(i));
        }
    }
}
