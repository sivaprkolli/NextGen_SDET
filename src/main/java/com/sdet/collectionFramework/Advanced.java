package com.sdet.collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Advanced {

    public static void main(String[] args) {

        String[] languages = {"Java", "C#", "Python", "PHP"};

        List<String> languagesList = new ArrayList<>(Arrays.asList(languages));
        List<String> automationTools = Arrays.asList("Selenium", "Playwright", "WebDriverIO", "Appium");

        System.out.println(languagesList);
        Collections.reverse(languagesList);
        System.out.println(languagesList);

        Collections.sort(languagesList);
        System.out.println(languagesList);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(numbers);

        List<List<String>> listOfLists = new ArrayList<>();
        listOfLists.add(languagesList);
        listOfLists.add(automationTools);

        System.out.println(listOfLists);

        System.out.println("*******************************");
        for(List<String> list:listOfLists){
            System.out.println(list);
        }


    }
}
