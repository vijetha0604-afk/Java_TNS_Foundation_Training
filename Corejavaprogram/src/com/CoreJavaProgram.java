
package com.tnsif.superkeyword;

// Demo for super constructor

class University {
    String Universityname;
    String location;

    public University(String universityname, String location) {
        super();
        Universityname = universityname;
        this.location = location;

        System.out.println("University constructor executed");
    }
}

class Department extends University {
    String department;

    public Department(String universityname, String location, String department) {
        super(universityname, location);

        this.department = department;

        System.out.println("Department constructor executed");
    }

    void display() {
        System.out.println("University: " + Universityname);
        System.out.println("Location: " + location);
        System.out.println("Department: " + department);
    }
}

public class Superconstrutor {
    public static void main(String[] args) {

        Department d = new Department("VTU", "Belagavi", "CS");
        d.display();
    }
}
