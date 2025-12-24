package com.sdet.returnTypes;

public class Parametrization {

    public static void main(String[] args) {
       int sum =  sum();
        System.out.println(sum);

        double totalValue = totalCartValue(9.99, 29.9);
        System.out.println("totalValue :: " + totalValue);
    }


    public static int sum(){
        int c, a=10, b=10;
        c = a+b;
        return c;
    }

    public static double totalCartValue(double p1, double p2){
        double p3;
        p3 = p1+p2;
        return p3;
    }

//    public WebDriver getDriver(){
//        driver = new ChromeDriver();
//        return driver;
//    }

}
