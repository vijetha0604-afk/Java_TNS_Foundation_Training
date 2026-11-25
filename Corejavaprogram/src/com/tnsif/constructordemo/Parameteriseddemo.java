package com.tnsif.constructordemo;

class Laptop{
	String brand;
	int ram;
	int storage;
	
	//parametrised 
	Laptop(String b, int r, int s){
		brand=b;
		ram=r;
		storage=s;
	}
	void display() {
		System.out.println("Brand "+brand);
		System.out.println("Ram :"+ram);
		System.out.println("Storage :"+storage);
	}
}
public class Parameteriseddemo {
public static void main(String[] args) {
	Laptop p1=new Laptop("Dell",8,525);
	Laptop p2=new Laptop("HP",6,1024);
	p1.display();
	p2.display();
	
}
}