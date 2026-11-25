package com.tnsif.encapuslationdemo;
//demo for encapsulation
class Test {
private String name;//data members or variable
private int age;

public void displaydeatils() {//member functions method
	name="Vijetha";
	age=21;
	
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	
}

}

public class student {
	public static void main(String[]args) {
		Test t=new Test();
		t.displaydeatils();
	}
}
