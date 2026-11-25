package com.tnsif.encapuslationdemo;

class Demo{
	private int number;
	private String name;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class encapsulationdemo {
	public static void main(String[]args) {
		Demo d1=new Demo();
		d1.setName("abcde");
		d1.setNumber(20);
		System.out.println(d1.getName());
		System.out.println(d1.getNumber());
		
		
		Demo d2=new Demo();
		d2.setName("Vijetha");
		d2.setNumber(21);
		System.out.println(d2.getName());
		System.out.println(d2.getNumber());
}

}
