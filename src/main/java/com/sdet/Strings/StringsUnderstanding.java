package com.sdet.Strings;

public class StringsUnderstanding {

    public static void main(String[] args) {
        String s = "Selenium";
        s.concat(" Automation");
        System.out.println("s value :: " + s);

        String s1 = new String("Selenium"); // heap
        String s2 = new String("Selenium"); // heap
        String s3 = "Selenium"; // pool
        String s4 = "Selenium"; // pool

        System.out.println(s1 == s2); // false - referring to address
        System.out.println(s1.equals(s2)); // true  - referring to values

        System.out.println(s3 == s4); // true
        System.out.println(s3.equals(s4)); // true
        // in pool memory s,s3,s4 will refer to only one value
        // in pool memory duplicates will be avoided

        System.out.println(s1 == s4); // false
        System.out.println(s1.equals(s4)); // true

        StringBuilder sb = new StringBuilder("Selenium");
        sb.append(" Automation");
        System.out.println(sb);
    }
}
