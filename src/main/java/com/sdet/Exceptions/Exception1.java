package com.sdet.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1 {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello Universe");

        try{
            File file = new File("");
            FileInputStream fis = new FileInputStream(file);
            System.out.println(file.getAbsolutePath());
        }
        catch(Exception e){
            System.out.println(e);
        }

        int a=0;
        int b=5;
        try{
            int c = 10/a;
        }catch (ArithmeticException e){
            System.out.println(e);
        }

    }
}
