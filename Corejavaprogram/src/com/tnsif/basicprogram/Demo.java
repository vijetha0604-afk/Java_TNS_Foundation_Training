package com.tnsif.basicprogram;



//demo for access modifiers
public class Demo {
	
	public int u=90;
	public String d="Vijetha";// we can access anywhere 
	private String s="awser"; //we can access only within a class
	
	public static void main(String[] args) {
		//object creation
		Demo e=new Demo();
		System.out.println(e.u);
		System.out.println(e.d);
	}

}
