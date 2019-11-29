package com.hdfc.loans.carloans;

public class BankClass2 implements RbiInter1{
	

	public static void main(String[] args) {
	
		BankClass2 obj=new BankClass2();
		obj.deposit();
		obj.withdrawal();
		
	}

	@Override
	public void deposit() {
		
		System.out.println("I am overridden depsosit method from BankClass2");
	}

	@Override
	public void withdrawal() {
		
		System.out.println("I am overridden withdrawal method from BankClass2");
	}

}
