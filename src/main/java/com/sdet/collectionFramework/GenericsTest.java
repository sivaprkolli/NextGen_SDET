package com.sdet.collectionFramework;

public class GenericsTest<T> {
    T t;
    public GenericsTest(T t){
        this.t = t;
    }

    public static void main(String[] args) {
        GenericsTest<Integer> gt = new GenericsTest<Integer>(10);
        GenericsTest<String> gt2 = new GenericsTest<String>("Java");
        GenericsTest<Character> gt3 = new GenericsTest<Character>('H');
    }
}
