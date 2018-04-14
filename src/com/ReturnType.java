package com;

public class ReturnType {
 
	 int i=10;
	int j=50;
	int sum=0;
	
	public void add() 
	{
		sum= i+j;
		System.out.println("values is :: "+sum);
	}
	
	
	public int add1() 
	{
		sum =i+j;
		//System.out.println(sum);
		return sum;
	}
	 
	
	public static void main(String[] args) {
	
		ReturnType obj = new ReturnType();
		int age =obj.add1();
		System.out.println("Age is"+age);
	}
}
