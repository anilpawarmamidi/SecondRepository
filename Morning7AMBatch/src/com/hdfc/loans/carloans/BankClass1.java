package com.hdfc.loans.carloans;

public class BankClass1 implements RbiInter1{

	public static void main(String[] args) {

		BankClass1 obj=new BankClass1();
		obj.deposit();
		obj.withdrawal();
		
		
	}

	@Override
	public void deposit() {
		
		System.out.println("I am overridden deposit method from BankClass1");
	}

	@Override
	public void withdrawal() {
		 
		System.out.println("I am overridden withdrawal method from BankClass1");
	}

}
