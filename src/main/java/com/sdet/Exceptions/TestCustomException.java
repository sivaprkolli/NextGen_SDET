package com.sdet.Exceptions;

public class TestCustomException {

    public static void main(String[] args) throws NextGenException {
        String s = null;

        try{
            if(s.length()==0){
                throw new NextGenException("Empty String");
            }
            System.out.println("Enter String");
        }catch (NextGenException e){
            throw new RuntimeException();
        }
    }
}
