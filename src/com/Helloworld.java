package com;

public class Helloworld {
 
	String name="Bala";
	static int age =27;
	
	 
	
	public void addtion() 
	{
		int i=10;
		int j=20;
		int c=i+j;
		System.out.println("sum of values is " +c);
		
		// static and non static var
		System.out.println(age);
		System.out.println(name);
	}
	
	public static void display() 
	{
		
		System.out.println("Iam Static method");
		
		// static and non static var
		System.out.println(age);
	//	System.out.println(name); create object and call non static variable

	}
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Feb Batch");
		
		System.out.println(age);
		
		Helloworld obj = new Helloworld();
		
		System.out.println(obj.name); 
		
		display();
		
		obj.addtion();
		
		
	}
	
}
