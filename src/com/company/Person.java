package com.company;

public class Person {
    Discount discount ;       // make the interface as a instance variable

    public void checkDiscount(String type) {
        if(type.equals("student")) {
            this.discount = new Student();          // don't forget it
            this.discount.showDiscount();           // we have the same method but with different behaviour WITHOUT INHERITANCE
        }else if(type.equals("teacher")){
            this.discount = new Teacher();
            this.discount.showDiscount();           // another behaviour for the same method
            //		discount.showDiscount();                // OK without this
        }
    }

    public  void checkInstance(Discount obj) {
        if( obj instanceof Teacher) {            // check the object from which class he is
            this.discount = new Teacher();
            discount.showDiscount();
        }else if(obj instanceof Student){
            this.discount = new Student();
            discount.showDiscount();
        }
    }
}
