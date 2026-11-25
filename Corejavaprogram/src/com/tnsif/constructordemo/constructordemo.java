package com.tnsif.constructordemo;
// demo for default constr
class Mobile{
	String brand;
	String model;
	double price;
	
	//default const
	Mobile(){
		brand="samsung";
		model="Galaxy m14";
		price=16990;
	}
	void display() {
		System.out.println("Brand :"+brand);
		System.out.println("Model : "+model);
		System.out.println("price :"+price);
	}
}
public class constructordemo {
public static void main(String[] args) {
	Mobile m=new Mobile();
	m.display();
}
}