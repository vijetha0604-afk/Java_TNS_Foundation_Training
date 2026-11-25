
package com.tnsif.inheritenceprogram;

import java.util.Scanner;

class Patient {
    String patientname;
    int age;

    public Patient(String patientname, int age) {
        super();
        this.patientname = patientname;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("Patient Name: " + patientname);
        System.out.println("Age: " + age);
    }
}

class Appointment extends Patient {
    String doctorname;
    String appointmentdate;

    public Appointment(String patientname, int age,
                       String doctorname, String appointmentdate) {
        super(patientname, age);
        this.doctorname = doctorname;
        this.appointmentdate = appointmentdate;
    }

    void displayAppointment() {
        displayPatient();
        System.out.println("Doctor: " + doctorname);
        System.out.println("Appointment Date: " + appointmentdate);
    }
}

class Consultation extends Appointment {
    double consultationfee;
    String diagnosis;

    public Consultation(String patientname, int age,
                        String doctorname, String appointmentdate,
                        double consultationfee, String diagnosis) {
        super(patientname, age, doctorname, appointmentdate);
        this.consultationfee = consultationfee;
        this.diagnosis = diagnosis;
    }

    void displayBill() {
        System.out.println("\n--- HOSPITAL BILL ---");
        displayAppointment();
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Consultation Fee: " + consultationfee);
    }
}

public class Hospitalsystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter patient name:");
        String name = sc.nextLine();

        System.out.println("Enter patient age:");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter doctor name:");
        String Dname = sc.nextLine();

        System.out.println("Enter appointment date:");
        String date = sc.nextLine();

        System.out.println("Enter consultation fee:");
        double fee = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter diagnosis:");
        String diagnosis = sc.nextLine();

        Consultation c = new Consultation(
            name, age, Dname, date, fee, diagnosis
        );

        c.displayBill();

        sc.close();
    }
}
