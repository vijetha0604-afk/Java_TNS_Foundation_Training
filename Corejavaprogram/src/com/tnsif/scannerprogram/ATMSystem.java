package com.tnsif.scannerprogram;

import java.util.Scanner;

public class ATMSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        int choice = 0;

        while (choice != 4) {

            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Avmmailable Balance: " + balance);

            }

            else if (choice == 2) {

                System.out.println("Enter deposit amount:");
                double deposit = sc.nextDouble();

                if (deposit > 0) {

                    balance = balance + deposit;

                    System.out.println("Deposit Successfully!");
                    System.out.println("Updated Balance: " + balance);

                }
                else {

                    System.out.println("Invalid Deposit Amount");

                }

            }

            else if (choice == 3) {

                System.out.println("Enter withdraw amount:");
                double withdraw = sc.nextDouble();

                if (withdraw > 0) {

                    if (withdraw <= balance) {

                        balance = balance - withdraw;

                        System.out.println("Withdraw Successfully!");
                        System.out.println("Remaining Balance: " + balance);

                    }
                    else {

                        System.out.println("Insufficient Balance");

                    }

                }
                else {

                    System.out.println("Invalid Withdraw Amount");

                }

            }

            else if (choice == 4) {

                System.out.println("Thank You! Visit Again.");

            }

            else {

                System.out.println("Invalid Choice! Please Try Again.");

            }

        }

        sc.close();

    }
}