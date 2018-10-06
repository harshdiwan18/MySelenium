package com.hdfc.loans.carloan;

public class FirstClass {

	int a=10, b= 20, c; // 3 Properties
	
	public void  Add() 
	{
	
		c=a+b;
		
		System.out.println("Addition of a and b is :" + c);
		
	}
	
	public void  Sub() 
	{
	    c=a-b;
		
		System.out.println("Subtraction of a and b is :" + c);
		
	}
	public static void main(String[] args) {
		
		System.out.println("Hi");
		
		FirstClass obj= new FirstClass();
		obj.Add();
		obj.Sub();
	}

}
