package com.sdet.serilationAndDeserilization;

import java.io.Serializable;

public class UserDetails implements Serializable {
    String name;
    int id;
    int phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }



}
