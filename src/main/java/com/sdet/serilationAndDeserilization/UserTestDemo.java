package com.sdet.serilationAndDeserilization;

import java.io.*;

public class UserTestDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserDetails userDetails = new UserDetails();
        userDetails.setId(500);
        userDetails.setName("Java");
        userDetails.setPhone(28372346);

        File file = new File(System.getProperty("user.dir")+ "/testData/userDetails.txt");

        //Serialization
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(userDetails);
        objectOutputStream.close();
        fileOutputStream.close();


        UserDetails userDetails1;

        //Deserialization
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        userDetails1 = (UserDetails) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();

        System.out.println(userDetails1.getId());
        System.out.println(userDetails1.getName());
        System.out.println(userDetails1.getPhone());

    }


}
