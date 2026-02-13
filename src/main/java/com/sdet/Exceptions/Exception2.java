package com.sdet.Exceptions;

public class Exception2 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4}; // index starts with 0
        String s = null;
        try{
            int c = a[4];
            System.out.println(s);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } finally {
            System.out.println("finally block");
        }
    }
}
