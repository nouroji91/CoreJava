package com;

public class MethodParameter {
 
	
/*	public void add() 
	{
		int i=10;
		int j =20;
		int c=i+j;
		System.out.println(c);
				
	}*/
	
	public void sum(int i, int j)
	{
		int c= i+j;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		MethodParameter obj = new MethodParameter();
		
		obj.sum(30, 60);
		obj.sum(40, 25);
	}
}
