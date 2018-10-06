package com.hdfc.loans.carloan;

public class HDFC implements Rbi 
{

	public static void main(String[] args) {
		
		HDFC h= new HDFC();
		h.deposit();
		h.withdrwal();

	}

	@Override
	public void withdrwal() {
		
		System.out.println("I am overriding withdrwal in HDFC");
		
	}

	@Override
	public void deposit() {
		
		System.out.println("I am overriding deposit in HDFC");
		
	}

}
