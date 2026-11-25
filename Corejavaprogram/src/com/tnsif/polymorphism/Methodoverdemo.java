package com.tnsif.polymorphism;

import java.util.Scanner;

// Demo for Method Overloading

class HotelBooking {

    double calculateBooking(int days) {
        return days * 1500;
    }

    double calculateBooking(int days, String roomType) {

        if (roomType.equalsIgnoreCase("Deluxe")) {
            return days * 2500;
        }
        else if (roomType.equalsIgnoreCase("Suite")) {
            return days * 4000;
        }
        else {
            return days * 1500;
        }
    }

    double calculateBooking(int days, String roomType, int extraguest) {

        double roomCharge = calculateBooking(days, roomType);
        double guestCharge = extraguest * days * 500;

        return roomCharge + guestCharge;
    }
}

public class Methodoverdemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HotelBooking n = new HotelBooking();

        System.out.println("Enter the number of days:");
        int days = sc.nextInt();

        System.out.println("Enter the room type (Deluxe/Suite):");
        String type = sc.next();

        System.out.println("Enter extra guests:");
        int guest = sc.nextInt();

        System.out.println("Basic booking: " + n.calculateBooking(days));

        System.out.println("Room booking: " + n.calculateBooking(days, type));

        System.out.println("Final booking amount: " +
                n.calculateBooking(days, type, guest));

        sc.close();
    }
}
