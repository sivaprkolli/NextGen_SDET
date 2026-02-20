package com.sdet.collectionFramework;

public class ArraysTest {

    public static void main(String[] args) {
        int[] i = {1,2,3,4,5};
        String[] automationTools = {"Selenium", "Playwright", "Appium", "WebDriverIO", "TOSCA"};
        char[] c = {'j','a','v','a'};
        int[] k = new int[5];

        System.out.println("Automation tools: " + automationTools[0]);
        System.out.println("Version : " + + i[3]);

        System.out.println("length of String :: "  +  automationTools[0].length());
        System.out.println("length of array :: " + automationTools.length);

        for(int j=0; j<c.length; j++){
            System.out.println(c[j]);
        }

        for(String  s:automationTools){
            System.out.println(s);
        }

        int[][] twoD = {{1,2,3,4,5},
                        {6,7,8,9,10}};

        System.out.println("twoD[0][0] :: " + twoD[0][0]);
        System.out.println("twoD[1][4] :: " + twoD[1][4]);

        System.out.println(twoD.length);
    }
}
