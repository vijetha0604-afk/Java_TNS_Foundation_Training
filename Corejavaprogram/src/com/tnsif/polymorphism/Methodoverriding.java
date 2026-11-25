
package com.tnsif.polymorphism;

// Demo for Method Overriding

class Payment {
    void makepayment() {
        System.out.println("Processing payment");
    }
}

class UPI extends Payment {
    @Override
    void makepayment() {
        System.out.println("Processing through UPI");
    }
}

class Creditcard extends Payment {
    @Override
    void makepayment() {
        System.out.println("Processing through Credit Card");
    }
}

public class Methodoverriding {
    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.makepayment();

        p = new Creditcard();
        p.makepayment();
    }
}

