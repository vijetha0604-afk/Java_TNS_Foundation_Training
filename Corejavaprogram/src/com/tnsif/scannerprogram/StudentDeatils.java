package com.tnsif.scannerprogram;

import java.util.Scanner;
//demo for scanner class

public class StudentDeatils{
public static void main(String[]args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter student name");
	String name=sc.nextLine();
	
	System.out.println("Enter the rollnumber");
	int rollno=sc.nextInt();
	
	System.out.println("Enter the student age:");
	int age=sc.nextInt();
	
	System.out.println("Name:"+name);
	System.out.println("Roll Number:"+rollno);
	System.out.println("Age:"+age);
}
	
	

}
