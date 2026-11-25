package com.tnsif.packages;
//demo for access modifiers

public class Test {
	
	public int u=90;
	public String d="Vijetha";
	protected float h=90.7f;
	double j=98.7; //default access specifiers no need to mention or type default word
	
	
	public static void main(String[] args) {
		//object creation
		Test t=new Test();
		System.out.println(t.u);
		System.out.println(t.d);
		System.out.println(t.h);
		System.out.println(t.j);
	}

}
