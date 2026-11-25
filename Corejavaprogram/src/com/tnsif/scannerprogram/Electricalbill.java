
package com.tnsif.scannerprogram;

import java.util.Scanner;

public class Electricalbill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input from user
        System.out.println("Enter the customer name:");
        String name = sc.nextLine();

        System.out.println("Enter units consumed:");
        int units = sc.nextInt();

        double bill;

        if (units < 0) {
            System.out.println("Invalid units consumed!");
            sc.close();
            return;
        }
        else if (units <= 100) {
            bill = units * 2;
        }
        else if (units <= 200) {
            bill = (100 * 2) + (units - 100) * 3;
        }
        else {
            bill = (100 * 2) + (100 * 3) + (units - 200) * 5;
        }

        System.out.println("\n--------- Electricity Bill ---------");
        System.out.println("Customer Name: " + name);
        System.out.println("Units Consumed: " + units);
        System.out.printf("Total Bill: Rs. %.2f%n", bill);

        sc.close();
    }
}
