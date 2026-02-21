package com.sdet.collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapsTest {

    public static void main(String[] args) {
        // Map -> Set + List
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Selenium");
        map.put(2, "Java");
        map.put(3, "Python");
        map.put(4, "Ruby");
        map.put(5, "c#");
        map.put(6, "Python");
        map.put(6, "go");
        map.put(null, null);
        map.put(null, "R");
        map.put(7, null);

        System.out.println(map);

        System.out.println(map.get(5));
        System.out.println(map.get(4));

        Map<String, Double> map2 = new HashMap<>();
        map2.put("Selenium", 4.40);
        map2.put("Java", 21.1);
        map2.put("Python", 3.14);
        map2.put("Ruby", 3.3);

        System.out.println(map2.get("Selenium"));

        System.out.println(map2.keySet());
        System.out.println(map2.entrySet());
        System.out.println(map2.values());


        for (Map.Entry<String, Double> entry: map2.entrySet()){
            System.out.println(entry.getKey() + " :: " + entry.getValue());

        }

    }
}
