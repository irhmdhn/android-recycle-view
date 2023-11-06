package com.example.recycleview;

import java.io.Serializable;

public class ContactModel implements Serializable {
    public String name;
    public String number;
    public String status;
    public String color;

    public ContactModel(String name, String number, String status, String color) {
        this.name = name;
        this.number = number;
        this.status = status;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
