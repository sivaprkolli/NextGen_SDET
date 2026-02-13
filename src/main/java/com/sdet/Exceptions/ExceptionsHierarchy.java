package com.sdet.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsHierarchy {

    public static void main(String[] args) {

        int a = 0;
        File file = new File("");
        int[] b = {1,2,3,4};

        try {
            int c = 10 / a;
            System.out.println(c);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException");
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch (RuntimeException e){
            System.out.println("RuntimeException");
        }
    }
}
