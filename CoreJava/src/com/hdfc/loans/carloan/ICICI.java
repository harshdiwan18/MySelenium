package com.hdfc.loans.carloan;

public class ICICI implements Rbi
{

	public static void main(String[] args) {
		
		ICICI i= new ICICI();
		i.deposit();
		i.withdrwal();

	}

	@Override
	public void withdrwal() {
		
		System.out.println("I am overriding withdrwal in ICICI");
		
	}

	@Override
	public void deposit() {
		
		System.out.println("I am overriding withdrwal in ICICI");
		
	}

}
