package com.tnsif.constructordemo;

import java.util.Scanner;

class RailwayReservation {
    String trainName;
    String passengername;
    int Availableseats;
    int bookedseats;

    // Default constructor
    RailwayReservation() {
        trainName = "Vande Bharath";
        Availableseats = 10;
        bookedseats = 0;
    }

    void booktickets(String name, int seats) {
        if (seats <= Availableseats && seats > 0) {
            passengername = name;
            bookedseats = seats;
            Availableseats = Availableseats - seats;

            System.out.println("Ticket booked successfully");
            System.out.println("Passenger name: " + passengername);
            System.out.println("Train name: " + trainName);
            System.out.println("Booked seats: " + bookedseats);
            System.out.println("Available seats: " + Availableseats);
        }
        else {
            System.out.println("Booking failed! Seats not available.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RailwayReservation r = new RailwayReservation();

        System.out.println("Enter the passenger name:");
        String name = sc.nextLine();

        System.out.println("Enter the number of seats:");
        int seats = sc.nextInt();

        r.booktickets(name, seats);

        sc.close();
    }
}
