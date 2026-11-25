
package com.tnsif.inheritenceprogram;

// Demo for Inheritance

import java.util.Scanner;

// Parent class
class Vehicle {
    String brand;
    double rentperday;

    public Vehicle(String brand, double rentperday) {
        super();
        this.brand = brand;
        this.rentperday = rentperday;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Rent per day: " + rentperday);
    }
}

// Child class
class Car extends Vehicle {
    int seatingCapacity;

    public Car(String brand, double rentperday, int seatingCapacity) {
        super(brand, rentperday);
        this.seatingCapacity = seatingCapacity;
    }

    void calculaterent(int days) {
        double total = rentperday * days;

        System.out.println("\nRental Details:");
        displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Rental Days: " + days);
        System.out.println("Total Rent: " + total);
    }
}

public class Vehicledemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter vehicle brand:");
        String brand = sc.nextLine();

        System.out.println("Enter rent per day:");
        double rent = sc.nextDouble();

        System.out.println("Enter seating capacity:");
        int seats = sc.nextInt();

        System.out.println("Enter the rental days:");
        int days = sc.nextInt();

        Car c = new Car(brand, rent, seats);

        c.calculaterent(days);

        sc.close();
    }
}
