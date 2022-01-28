package com.company;

public interface Discount {
    void showDiscount();
    // here interface Discount have 2 behaviour 1- studentDiscount and 2- teacherDiscount
    // the interface Discount and all classes which make implements it called (family of algorithm)
    // and that's called encapsulate
    // if we want to add more behaviour or change the old ones so we need just modify it here
    // not modify the subclasses itself

}
class Student implements Discount{

    @Override
    public void showDiscount() {
        System.out.println("Student's discount is 100");

    }

}

class Teacher implements Discount{

    @Override
    public void showDiscount() {
        System.out.println("Teacher's discount is 200");

    }
}
