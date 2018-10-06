package com.hdfc.loans.carloan;

public class ChildClass extends FirstAbstract 
{

	public static void main(String[] args)
	{
		
		ChildClass C= new ChildClass();
		
        C.m1();
        C.m2();
        C.m3();
	}

	@Override
	public void m2() {
	
		System.out.println("I am m2 overriden method in Child Class");
		
	}

	@Override
	public void m3() {
		
		System.out.println("I am m3 overriden method in Child Class");	
		
	}
}
	

	

