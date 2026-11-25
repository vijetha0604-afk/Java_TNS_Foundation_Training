package com.tnsif.superkeyword;

// Demo for super variable

class Product {
    String name = "Electronic product";
}

class Laptop extends Product {
    String name = "Dell Laptop";

    void display() {
        System.out.println("Child variable: " + name);
        System.out.println("Parent variable: " + super.name);
    }
}

public class Supervariable {
    public static void main(String[] args) {

        Laptop l = new Laptop();
        l.display();
    }
}
