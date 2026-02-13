package com.sdet.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyWord {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        int a[] = {1,2,3,4};

        try{
            Thread.sleep(5000);
            File file = new File("");
            FileInputStream fis = new FileInputStream(file);
            System.out.println(file.getAbsolutePath());
        }
        catch(FileNotFoundException e){
            System.out.println(e);
            throw new FileNotFoundException("Please enter a file name");
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
