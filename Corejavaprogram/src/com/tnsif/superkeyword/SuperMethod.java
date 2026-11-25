
package com.tnsif.superkeyword;

// Demo for super method

class Order {
    void displayDetails() {
        System.out.println("Order ID : 1");
        System.out.println("Order Status : Confirmed");
    }
}

class Expressorder extends Order {
    @Override
    void displayDetails() {
        super.displayDetails();

        System.out.println("Delivery Type : Express");
        System.out.println("Expected Delivery : 24 hours");
    }
}

public class SuperMethod {
    public static void main(String[] args) {

        Expressorder e = new Expressorder();
        e.displayDetails();
    }
}
