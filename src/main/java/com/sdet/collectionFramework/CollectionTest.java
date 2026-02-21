package com.sdet.collectionFramework;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
            Collection collection = new ArrayList();
            collection.add(1);
            collection.add("Selenium");
            collection.add(true);
            collection.add(4.40);

        System.out.println(collection);

        List<String> list = new ArrayList<String>();
        list.add("Selenium");
        list.add("Playwright");

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        System.out.println("list1 :: " + list1);

        //List<WebElement> eles = driver.findElements(By.xpath(""));

        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(3);

        System.out.println("set :: " + set);

        //Set<String> windowIds = driver.getWindowHandles();

    }
}
