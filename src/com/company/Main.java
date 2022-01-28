package com.company;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.checkDiscount("teacher");
        p1.checkDiscount("student");

        p1.checkInstance(new Student());   // AWESOME BY ME
        p1.checkInstance(new Teacher());
    }
    }

