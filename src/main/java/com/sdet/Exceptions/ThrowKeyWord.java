package com.sdet.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowKeyWord {
    public static void main(String[] args) throws FileNotFoundException {

        int a[] = {1,2,3,4};

        try{
            File file = new File("");
            FileInputStream fis = new FileInputStream(file);
            System.out.println(file.getAbsolutePath());
        }
        catch(FileNotFoundException e){
            System.out.println(e);
            throw new FileNotFoundException("Please enter a file name");
        }

        try{
            int c = 10/a[4];
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }


    }
}
